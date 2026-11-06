package com.amazon.minerva.transport.direct;

import com.amazon.minerva.transport.direct.UploadResult;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
class HttpTransport {
    private static final String BASE_URL_TEMPLATE = "https://{hashedDeviceType}.us-east-1.prod.service.minerva.devices.a2z.com:443";
    private static final int GZIP_MAGIC_BYTE_0 = 31;
    private static final int GZIP_MAGIC_BYTE_1 = 139;
    private static final int GZIP_MAGIC_BYTE_2 = 8;
    private static final int MAX_DNS_SUBDOMAIN_LENGTH = 63;
    private static final int MAX_RESPONSE_BYTES = 65536;
    private static final String V1_ACCEPT = "application/x-amzn-ion";
    private static final String V1_PATH = "/metric-batch";
    private static final String TAG = "HttpTransport";
    private static final Logger LOG = Logger.getLogger(TAG);

    private HttpTransport() {
    }

    public static UploadResult.Category categorize(int i) {
        return (200 > i || i >= 300) ? (400 > i || i >= 500) ? (500 > i || i >= 600) ? UploadResult.Category.UNEXPECTED : UploadResult.Category.SERVER_ERROR : UploadResult.Category.CLIENT_ERROR : UploadResult.Category.SUCCESS;
    }

    private static UploadResult doExecute(Batch batch, int i) throws IOException {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL("https://{hashedDeviceType}.us-east-1.prod.service.minerva.devices.a2z.com:443/metric-batch".replace("{hashedDeviceType}", hashDeviceType(batch.getDeviceTypeId()))).openConnection();
        try {
            httpsURLConnection.setRequestMethod("POST");
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setConnectTimeout(i);
            httpsURLConnection.setReadTimeout(i);
            httpsURLConnection.setRequestProperty("Content-Type", batch.getContentType().headerValue());
            httpsURLConnection.setRequestProperty("x-amz-device-type", batch.getDeviceTypeId());
            httpsURLConnection.setRequestProperty("Accept", V1_ACCEPT);
            if (batch.getOAuthToken() != null && !batch.getOAuthToken().isEmpty()) {
                httpsURLConnection.setRequestProperty("x-amz-access-token", batch.getOAuthToken());
            }
            byte[] preparePayload = preparePayload(batch.getPayload());
            if (isGzip(preparePayload)) {
                httpsURLConnection.setRequestProperty("Content-Encoding", "gzip");
            }
            httpsURLConnection.setFixedLengthStreamingMode(preparePayload.length);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpsURLConnection.getOutputStream());
            try {
                bufferedOutputStream.write(preparePayload);
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                int responseCode = httpsURLConnection.getResponseCode();
                UploadResult uploadResult = new UploadResult(categorize(responseCode), responseCode, readResponseBody(httpsURLConnection, responseCode));
                httpsURLConnection.disconnect();
                return uploadResult;
            } finally {
            }
        } catch (Throwable th) {
            httpsURLConnection.disconnect();
            throw th;
        }
    }

    public static UploadResult execute(Batch batch, int i) {
        try {
            return doExecute(batch, i);
        } catch (IOException e) {
            return new UploadResult(UploadResult.Category.NETWORK_ERROR, 0, e.getMessage());
        }
    }

    private static byte[] gzipCompress(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.flush();
                gZIPOutputStream.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String hashDeviceType(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
            String bigInteger = new BigInteger(1, messageDigest.digest()).toString(16);
            return bigInteger.length() > 63 ? bigInteger.substring(1) : bigInteger;
        } catch (NoSuchAlgorithmException e) {
            LOG.log(Level.WARNING, "Failed to generate SHA-256 hash of device type", (Throwable) e);
            return "unknown";
        }
    }

    public static boolean isGzip(byte[] bArr) {
        return bArr.length >= 3 && (bArr[0] & 255) == 31 && (bArr[1] & 255) == 139 && (bArr[2] & 255) == 8;
    }

    private static byte[] preparePayload(byte[] bArr) {
        if (isGzip(bArr)) {
            return bArr;
        }
        try {
            return gzipCompress(bArr);
        } catch (IOException e) {
            LOG.log(Level.WARNING, "Gzip compression failed, sending uncompressed", (Throwable) e);
            return bArr;
        }
    }

    private static String readResponseBody(HttpsURLConnection httpsURLConnection, int i) {
        int min;
        try {
            InputStream inputStream = i < 400 ? httpsURLConnection.getInputStream() : httpsURLConnection.getErrorStream();
            if (inputStream == null) {
                return null;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                int i2 = 0;
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1 || (min = Math.min(read, 65536 - i2)) <= 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, min);
                    i2 += min;
                }
                String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
                inputStream.close();
                return byteArrayOutputStream2;
            } finally {
            }
        } catch (IOException e) {
            LOG.log(Level.WARNING, "IOException reading response body", (Throwable) e);
            return null;
        }
    }
}
