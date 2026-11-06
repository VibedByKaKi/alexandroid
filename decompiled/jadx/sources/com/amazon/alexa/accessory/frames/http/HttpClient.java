package com.amazon.alexa.accessory.frames.http;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import android.net.TrafficStats;
import androidx.annotation.NonNull;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.frames.media.exceptions.MediaDownloaderException;
import com.amazon.alexa.accessory.frames.metrics.media.MediaImportError;
import com.amazon.alexa.accessory.frames.utils.Log;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Base64;
import java.util.Collections;
import java.util.Locale;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.CertificatePinner;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import okio.BufferedSink;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class HttpClient {
    private static final String HASH_FORMAT = "sha256=:%s:";
    private static final String TAG = "HttpClient";
    private static final int TRAFFIC_STATS_TAG = 41242;
    private static final TrustManager[] trustAllCerts = {new X509TrustManager() { // from class: com.amazon.alexa.accessory.frames.http.HttpClient.1
        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }
    }};
    private final OkHttpClient client;
    private final HttpClientConfig clientConfig;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.frames.http.HttpClient$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$frames$http$HttpClient$AssetType;

        static {
            int[] iArr = new int[AssetType.values().length];
            $SwitchMap$com$amazon$alexa$accessory$frames$http$HttpClient$AssetType = iArr;
            try {
                iArr[AssetType.MEDIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum AssetType {
        MEDIA,
        FIRMWARE;

        @Override // java.lang.Enum
        @NonNull
        public String toString() {
            return name().toLowerCase(Locale.ENGLISH);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class HttpClientConfig {
        private static final String SERVER_URL_FORMAT = "https://%s:%s/%s/%s";
        private static final String SIMPLE_SERVER_URL_FORMAT = "https://%s:%s/%s";
        private final String ipAddress;
        private final String port;
        private final String sessionToken;

        public HttpClientConfig(String str, String str2, String str3) {
            this.ipAddress = str;
            this.port = str2;
            this.sessionToken = str3;
        }

        public String buildServerUrl(String str, String str2) {
            Locale locale = Locale.ENGLISH;
            return ErrorUtils$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("https://", this.ipAddress, ":", this.port, "/"), str, "/", str2);
        }

        public String buildSimpleServerUrl(String str) {
            Locale locale = Locale.ENGLISH;
            StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("https://", this.ipAddress, ":", this.port, "/");
            m.append(str);
            return m.toString();
        }

        public String getSessionToken() {
            return this.sessionToken;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class HttpClientResponse {
        private final byte[] content;
        private final String contentType;
        private final long size;

        public HttpClientResponse(byte[] bArr, String str, long j) {
            this.content = bArr;
            this.contentType = str;
            this.size = j;
        }

        public byte[] getContent() {
            return this.content;
        }

        public String getContentType() {
            return this.contentType;
        }

        public long getSize() {
            return this.size;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class HttpClientStreamResult {
        private final long bytesWritten;
        private final String contentType;

        public HttpClientStreamResult(long j, String str) {
            this.bytesWritten = j;
            this.contentType = str;
        }

        public long getBytesWritten() {
            return this.bytesWritten;
        }

        public String getContentType() {
            return this.contentType;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class HttpClientUploadResult {
        private final long bytesUploaded;
        private final int httpCode;

        public HttpClientUploadResult(int i, long j) {
            this.httpCode = i;
            this.bytesUploaded = j;
        }

        public long getBytesUploaded() {
            return this.bytesUploaded;
        }

        public int getHttpCode() {
            return this.httpCode;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface UploadProgressListener {
        void onProgress(long j, long j2);
    }

    public HttpClient(OkHttpClient okHttpClient, String str, String str2, String str3) {
        this.client = okHttpClient;
        this.clientConfig = new HttpClientConfig(str, str2, str3);
    }

    public static OkHttpClient buildOkHttpClient(String str, String str2) {
        try {
            return new OkHttpClient.Builder().sslSocketFactory(getTrustAllCerts(), (X509TrustManager) trustAllCerts[0]).certificatePinner(new CertificatePinner.Builder().add(str, str2).build()).hostnameVerifier(new HttpClient$$ExternalSyntheticLambda0(str, 1)).protocols(Collections.singletonList(Protocol.HTTP_1_1)).build();
        } catch (Exception e) {
            Log.e(TAG, "Error building OkHttpClient", e);
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    public static OkHttpClient buildPinnedOkHttpClient(String str, String str2) {
        X509TrustManager buildPinnedTrustManager = buildPinnedTrustManager(str2);
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{buildPinnedTrustManager}, new SecureRandom());
            return new OkHttpClient.Builder().sslSocketFactory(sSLContext.getSocketFactory(), buildPinnedTrustManager).hostnameVerifier(new HttpClient$$ExternalSyntheticLambda0(str, 0)).protocols(Collections.singletonList(Protocol.HTTP_1_1)).build();
        } catch (Exception e) {
            Log.e(TAG, "[buildPinnedOkHttpClient] Failed to build OkHttpClient", e);
            OnnxMap$$ExternalSyntheticBUOutline0.m("Failed to build pinned OkHttpClient", e);
            return null;
        }
    }

    public static X509TrustManager buildPinnedTrustManager(final String str) {
        final X509TrustManager systemTrustManager = getSystemTrustManager();
        return new X509TrustManager() { // from class: com.amazon.alexa.accessory.frames.http.HttpClient.3
            @Override // javax.net.ssl.X509TrustManager
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str2) throws CertificateException {
                systemTrustManager.checkClientTrusted(x509CertificateArr, str2);
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str2) throws CertificateException {
                byte[] certDerBytes = HttpClient.getCertDerBytes(x509CertificateArr);
                try {
                    String encodeToString = Base64.getEncoder().encodeToString(MessageDigest.getInstance("SHA-256").digest(certDerBytes));
                    try {
                        systemTrustManager.checkServerTrusted(x509CertificateArr, str2);
                        if (!encodeToString.equals(str)) {
                            throw new CertificateException(ErrorUtils$$ExternalSyntheticOutline0.m(new StringBuilder("TLS fingerprint mismatch. Expected: "), str, " Received: ", encodeToString));
                        }
                        Log.i(HttpClient.TAG, "TLS pinning OK (CA-signed): fingerprint matches");
                    } catch (CertificateException e) {
                        if (!encodeToString.equals(str)) {
                            throw new CertificateException(ErrorUtils$$ExternalSyntheticOutline0.m(new StringBuilder("TLS fingerprint mismatch. Expected: "), str, " Received: ", encodeToString), e);
                        }
                        Log.i(HttpClient.TAG, "TLS pinning OK (self-signed): fingerprint matches");
                    }
                } catch (Exception e2) {
                    throw new CertificateException("Failed to compute certificate fingerprint", e2);
                }
            }

            @Override // javax.net.ssl.X509TrustManager
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        };
    }

    private Request buildRequestWithHeaders(String str) {
        return new Request.Builder().url(str).header("Authorization", "Basic " + this.clientConfig.getSessionToken()).header("Connection", "keep-alive").build();
    }

    public static OkHttpClient buildSimpleOkHttpClient() {
        try {
            return new OkHttpClient.Builder().sslSocketFactory(getTrustAllCerts(), (X509TrustManager) trustAllCerts[0]).hostnameVerifier(new HttpClient$$ExternalSyntheticLambda2(0)).protocols(Collections.singletonList(Protocol.HTTP_1_1)).build();
        } catch (Exception e) {
            Log.e(TAG, "Error building OkHttpClient", e);
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    private static String calculateSHA256Base64ForFirmwareZipHash(@NonNull File file) throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[1048576];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    fileInputStream.close();
                    return Base64.getEncoder().encodeToString(messageDigest.digest());
                }
                messageDigest.update(bArr, 0, read);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private boolean checkContentType(String str, AssetType assetType) {
        if (AnonymousClass4.$SwitchMap$com$amazon$alexa$accessory$frames$http$HttpClient$AssetType[assetType.ordinal()] == 1) {
            return HttpClientConstants.MEDIA_SET.contains(str);
        }
        Log.d(TAG, "Asset Type not supported: %s", assetType.toString());
        return false;
    }

    private Response executeTagged(Request request) throws IOException {
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        TrafficStats.setThreadStatsTag(TRAFFIC_STATS_TAG);
        try {
            Response execute = this.client.newCall(request).execute();
            if (threadStatsTag == -1) {
                TrafficStats.clearThreadStatsTag();
                return execute;
            }
            TrafficStats.setThreadStatsTag(threadStatsTag);
            return execute;
        } catch (Throwable th) {
            if (threadStatsTag == -1) {
                TrafficStats.clearThreadStatsTag();
            } else {
                TrafficStats.setThreadStatsTag(threadStatsTag);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] getCertDerBytes(X509Certificate[] x509CertificateArr) throws CertificateException {
        if (x509CertificateArr == null || x509CertificateArr.length == 0) {
            throw new CertificateException("Server certificate chain is empty");
        }
        try {
            return x509CertificateArr[0].getEncoded();
        } catch (CertificateException e) {
            throw new CertificateException("Failed to encode server certificate", e);
        }
    }

    private static X509TrustManager getSystemTrustManager() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            throw new RuntimeException("No X509TrustManager found in system TrustManagerFactory");
        } catch (Exception e) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("Failed to obtain system X509TrustManager", e);
            return null;
        }
    }

    private static SSLSocketFactory getTrustAllCerts() {
        try {
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, trustAllCerts, new SecureRandom());
            return sSLContext.getSocketFactory();
        } catch (Exception e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$buildOkHttpClient$0(String str, String str2, SSLSession sSLSession) {
        return str2.equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$buildPinnedOkHttpClient$1(String str, String str2, SSLSession sSLSession) {
        return str2.equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$buildSimpleOkHttpClient$2(String str, SSLSession sSLSession) {
        return true;
    }

    private HttpClientResponse sendAssetRequest(Request request, AssetType assetType) throws IOException {
        String str = TAG;
        Log.d(str, "Sending request to URL: " + request.url());
        Response executeTagged = executeTagged(request);
        try {
            ResponseBody body = executeTagged.body();
            if (body == null) {
                throw new IOException("Empty response body - response discarded");
            }
            if (!executeTagged.isSuccessful()) {
                Locale locale = Locale.ENGLISH;
                String str2 = "Response failed with HTTP error code: " + executeTagged.code() + ", message: " + body.string();
                Log.d(str, str2);
                throw new MediaDownloaderException(str2, MediaImportError.MEDIA_DOWNLOAD_SERVER_ISSUE);
            }
            Log.d(str, "Response is successful");
            MediaType contentType = body.contentType();
            if (contentType == null) {
                throw new MediaDownloaderException("Content Type is null", MediaImportError.MEDIA_DOWNLOAD_INVALID_DATA);
            }
            String str3 = contentType.type() + "/" + contentType.subtype();
            if (checkContentType(str3, assetType)) {
                HttpClientResponse httpClientResponse = new HttpClientResponse(body.bytes(), str3, body.contentLength());
                executeTagged.close();
                return httpClientResponse;
            }
            Locale locale2 = Locale.ENGLISH;
            throw new MediaDownloaderException("Unsupported asset or content type: " + assetType + ", " + str3, MediaImportError.MEDIA_DOWNLOAD_INVALID_DATA);
        } catch (Throwable th) {
            if (executeTagged != null) {
                try {
                    executeTagged.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private HttpClientStreamResult streamAssetRequest(Request request, AssetType assetType, OutputStream outputStream) throws IOException {
        Response executeTagged = executeTagged(request);
        try {
            ResponseBody body = executeTagged.body();
            if (body == null) {
                throw new IOException("Empty response body - response discarded");
            }
            if (!executeTagged.isSuccessful()) {
                Locale locale = Locale.ENGLISH;
                String str = "Response failed with HTTP error code: " + executeTagged.code() + ", message: " + body.string();
                Log.d(TAG, str);
                throw new MediaDownloaderException(str, MediaImportError.MEDIA_DOWNLOAD_SERVER_ISSUE);
            }
            String str2 = TAG;
            Log.d(str2, "Response is successful - streaming to output");
            MediaType contentType = body.contentType();
            if (contentType == null) {
                throw new MediaDownloaderException("Content Type is null", MediaImportError.MEDIA_DOWNLOAD_INVALID_DATA);
            }
            String str3 = contentType.type() + "/" + contentType.subtype();
            if (!checkContentType(str3, assetType)) {
                Locale locale2 = Locale.ENGLISH;
                throw new MediaDownloaderException("Unsupported asset or content type: " + assetType + ", " + str3, MediaImportError.MEDIA_DOWNLOAD_INVALID_DATA);
            }
            long contentLength = body.contentLength();
            Log.d(str2, "total expected response size: " + contentLength + " bytes - streaming to output");
            InputStream byteStream = body.byteStream();
            try {
                byte[] bArr = new byte[65536];
                long j = 0;
                while (true) {
                    int read = byteStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    j += read;
                }
                outputStream.flush();
                byteStream.close();
                if (contentLength != -1 && j != contentLength) {
                    throw new IOException("Incomplete download: " + j + "/" + contentLength + " bytes");
                }
                Log.d(TAG, "Streaming completed: bytes written: " + j + " bytes");
                HttpClientStreamResult httpClientStreamResult = new HttpClientStreamResult(j, str3);
                executeTagged.close();
                return httpClientStreamResult;
            } finally {
            }
        } catch (Throwable th) {
            executeTagged.close();
            throw th;
        }
    }

    public void cancelAllRequests() {
        this.client.dispatcher().cancelAll();
    }

    public HttpClientResponse fetchAsset(AssetType assetType, String str) throws IOException {
        String assetType2 = assetType.toString();
        if (assetType == AssetType.MEDIA) {
            assetType2 = str.endsWith(HttpClientConstants.VIDEO_EXTENSION) ? "videos" : HttpClientConstants.IMAGES_URI_STRING;
        }
        return sendAssetRequest(buildRequestWithHeaders(this.clientConfig.buildServerUrl(assetType2, str)), assetType);
    }

    public HttpClientStreamResult streamAsset(@NonNull AssetType assetType, @NonNull String str, @NonNull OutputStream outputStream) throws IOException {
        String assetType2 = assetType.toString();
        if (assetType == AssetType.MEDIA) {
            assetType2 = str.endsWith(HttpClientConstants.VIDEO_EXTENSION) ? "videos" : HttpClientConstants.IMAGES_URI_STRING;
        }
        return streamAssetRequest(buildRequestWithHeaders(this.clientConfig.buildServerUrl(assetType2, str)), assetType, outputStream);
    }

    public HttpClientUploadResult transferFirmwareUpdateFile(@NonNull final File file, @NonNull String str, final long j, final UploadProgressListener uploadProgressListener) throws IOException {
        String buildSimpleServerUrl = this.clientConfig.buildSimpleServerUrl("ota");
        try {
            String calculateSHA256Base64ForFirmwareZipHash = calculateSHA256Base64ForFirmwareZipHash(file);
            String str2 = TAG;
            Log.i(str2, "Calculated SHA-256 hash for firmware file");
            RequestBody requestBody = new RequestBody() { // from class: com.amazon.alexa.accessory.frames.http.HttpClient.2
                @Override // okhttp3.RequestBody
                /* renamed from: contentLength */
                public long getContentLength() {
                    return j;
                }

                @Override // okhttp3.RequestBody
                /* renamed from: contentType */
                public MediaType get$contentType() {
                    return MediaType.parse("application/octet-stream");
                }

                @Override // okhttp3.RequestBody
                public void writeTo(@NonNull BufferedSink bufferedSink) throws IOException {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[8192];
                        long j2 = 0;
                        long j3 = 0;
                        long j4 = 0;
                        while (true) {
                            int read = fileInputStream.read(bArr);
                            if (read == -1) {
                                bufferedSink.flush();
                                Log.i(HttpClient.TAG, "Finished writing %d bytes to upload request", Long.valueOf(j3));
                                fileInputStream.close();
                                return;
                            }
                            bufferedSink.write(bArr, 0, read);
                            j3 += read;
                            UploadProgressListener uploadProgressListener2 = uploadProgressListener;
                            if (uploadProgressListener2 != null) {
                                if (j3 - j4 < 10485760) {
                                    if (j3 == j) {
                                    }
                                }
                                uploadProgressListener2.onProgress(j3, j);
                                j4 = j3;
                            }
                            if (j3 % 1048576 == j2 || j3 == j) {
                                Log.d(HttpClient.TAG, "Upload progress: %d/%d bytes (%.1f%%)", Long.valueOf(j3), Long.valueOf(j), Double.valueOf((j3 * 100.0d) / j));
                            }
                            j2 = 0;
                        }
                    } finally {
                    }
                }
            };
            Locale locale = Locale.US;
            Request.Builder header = new Request.Builder().url(buildSimpleServerUrl).post(requestBody).header("Content-Type", "application/octet-stream").header("Content-Length", String.valueOf(j)).header("Content-Digest", a$$ExternalSyntheticOutline0.m("sha256=:", calculateSHA256Base64ForFirmwareZipHash, ":")).header("X-Amzn-Filename", str).header("X-Amzn-Filesize", String.valueOf(j));
            if (this.clientConfig.getSessionToken() != null && !this.clientConfig.getSessionToken().isEmpty()) {
                header.header("Authorization", "Basic " + this.clientConfig.getSessionToken());
            }
            Request build = header.build();
            Log.i(str2, "Executing POST upload to %s", buildSimpleServerUrl);
            Response executeTagged = executeTagged(build);
            try {
                if (executeTagged.isSuccessful()) {
                    Log.i(str2, "File upload successful - HTTP %d", Integer.valueOf(executeTagged.code()));
                    HttpClientUploadResult httpClientUploadResult = new HttpClientUploadResult(executeTagged.code(), j);
                    executeTagged.close();
                    return httpClientUploadResult;
                }
                String string = executeTagged.body() != null ? executeTagged.body().string() : "No response body";
                Locale locale2 = Locale.ENGLISH;
                String str3 = "Upload failed with HTTP error code: " + executeTagged.code() + ", message: " + string;
                Log.e(str2, str3);
                throw new IOException(str3);
            } finally {
            }
        } catch (Exception e) {
            Log.e(TAG, "Failed to calculate SHA-256 hash", e);
            Buffer$$ExternalSyntheticBUOutline0.m("Failed to calculate file hash", e);
            return null;
        }
    }
}
