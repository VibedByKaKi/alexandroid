package com.amazon.blueshift.bluefront.android.http;

import com.amazon.blueshift.bluefront.android.SpeechClientException;
import com.amazon.blueshift.bluefront.android.http.part.Part;
import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.io.ByteStreams;
import com.google.common.io.Closeables;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketTimeoutException;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class MultipartRequest {
    protected static final String BOUNDARY_PREFIX = "--";
    private static final String CONTENT_TYPE = "Content-Type";
    private static final String MULTIPART_FORMDATA = "multipart/form-data; boundary=";
    protected static final String NEW_LINE = "\r\n";
    private static final String TAG = "com.amazon.blueshift.bluefront.android.http.MultipartRequest";
    private final String mBoundary;
    private final HttpsURLConnection mConnection;
    private final Part[] mParts;

    public MultipartRequest(HttpsURLConnection httpsURLConnection, String str, Part... partArr) {
        Preconditions.checkNotNull(httpsURLConnection, "Connection cannot be null");
        Preconditions.checkNotNull(partArr, "Parts cannot be null.");
        Preconditions.checkArgument(partArr.length > 0, "Parts cannot be empty");
        this.mConnection = httpsURLConnection;
        this.mBoundary = str;
        this.mParts = partArr;
    }

    private byte[] readInputStream(InputStream inputStream) throws IOException {
        try {
            return ByteStreams.toByteArray(inputStream);
        } finally {
            Closeables.close(inputStream, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.OutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] execute() throws com.amazon.blueshift.bluefront.android.SpeechClientException {
        /*
            r7 = this;
            java.lang.String r0 = "Failed to close request stream"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "multipart/form-data; boundary="
            r1.<init>(r2)
            java.lang.String r2 = r7.mBoundary
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "--"
            r2.<init>(r3)
            java.lang.String r3 = r7.mBoundary
            java.lang.String r4 = "\r\n"
            java.lang.String r2 = defpackage.a$$ExternalSyntheticOutline0.m(r2, r3, r4)
            javax.net.ssl.HttpsURLConnection r3 = r7.mConnection
            java.lang.String r4 = "Content-Type"
            r3.setRequestProperty(r4, r1)
            javax.net.ssl.HttpsURLConnection r1 = r7.mConnection
            r3 = 1
            r1.setDoOutput(r3)
            r1 = 0
            javax.net.ssl.HttpsURLConnection r3 = r7.mConnection     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L72 com.amazon.blueshift.bluefront.android.SpeechClientException -> L76
            r3.connect()     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L72 com.amazon.blueshift.bluefront.android.SpeechClientException -> L76
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L72 com.amazon.blueshift.bluefront.android.SpeechClientException -> L76
            javax.net.ssl.HttpsURLConnection r4 = r7.mConnection     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L72 com.amazon.blueshift.bluefront.android.SpeechClientException -> L76
            java.io.OutputStream r4 = r4.getOutputStream()     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L72 com.amazon.blueshift.bluefront.android.SpeechClientException -> L76
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L72 com.amazon.blueshift.bluefront.android.SpeechClientException -> L76
            com.amazon.blueshift.bluefront.android.http.part.Part[] r1 = r7.mParts     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f com.amazon.blueshift.bluefront.android.SpeechClientException -> L51
            int r4 = r1.length     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f com.amazon.blueshift.bluefront.android.SpeechClientException -> L51
            r5 = 0
        L43:
            if (r5 >= r4) goto L53
            r6 = r1[r5]     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f com.amazon.blueshift.bluefront.android.SpeechClientException -> L51
            r6.writePart(r3, r2)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f com.amazon.blueshift.bluefront.android.SpeechClientException -> L51
            int r5 = r5 + 1
            goto L43
        L4d:
            r1 = move-exception
            goto L83
        L4f:
            r1 = move-exception
            goto L7a
        L51:
            r1 = move-exception
            goto L82
        L53:
            r7.sendFooter(r3)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f com.amazon.blueshift.bluefront.android.SpeechClientException -> L51
            r3.close()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f com.amazon.blueshift.bluefront.android.SpeechClientException -> L51
            javax.net.ssl.HttpsURLConnection r1 = r7.mConnection     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f com.amazon.blueshift.bluefront.android.SpeechClientException -> L51
            byte[] r1 = r7.fetchResponse(r1)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f com.amazon.blueshift.bluefront.android.SpeechClientException -> L51
            r3.close()     // Catch: java.io.IOException -> L63
            goto L68
        L63:
            java.lang.String r2 = com.amazon.blueshift.bluefront.android.http.MultipartRequest.TAG
            android.util.Log.w(r2, r0)
        L68:
            javax.net.ssl.HttpsURLConnection r7 = r7.mConnection
            r7.disconnect()
            return r1
        L6e:
            r2 = move-exception
            r3 = r1
            r1 = r2
            goto L83
        L72:
            r2 = move-exception
            r3 = r1
            r1 = r2
            goto L7a
        L76:
            r2 = move-exception
            r3 = r1
            r1 = r2
            goto L82
        L7a:
            com.amazon.blueshift.bluefront.android.SpeechClientConnectionException r2 = new com.amazon.blueshift.bluefront.android.SpeechClientConnectionException     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = "Failed to execute HTTP request"
            r2.<init>(r4, r1)     // Catch: java.lang.Throwable -> L4d
            throw r2     // Catch: java.lang.Throwable -> L4d
        L82:
            throw r1     // Catch: java.lang.Throwable -> L4d
        L83:
            if (r3 == 0) goto L8e
            r3.close()     // Catch: java.io.IOException -> L89
            goto L8e
        L89:
            java.lang.String r2 = com.amazon.blueshift.bluefront.android.http.MultipartRequest.TAG
            android.util.Log.w(r2, r0)
        L8e:
            javax.net.ssl.HttpsURLConnection r7 = r7.mConnection
            r7.disconnect()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.blueshift.bluefront.android.http.MultipartRequest.execute():byte[]");
    }

    public byte[] fetchResponse(HttpsURLConnection httpsURLConnection) throws SpeechClientException {
        Preconditions.checkNotNull(httpsURLConnection, "No connection when fetching response");
        try {
            int responseCode = httpsURLConnection.getResponseCode();
            if (responseCode == 200) {
                return readInputStream(new BufferedInputStream(httpsURLConnection.getInputStream()));
            }
            throw new SpeechClientException(responseCode + ": " + new String(readInputStream(new BufferedInputStream(httpsURLConnection.getErrorStream())), Charsets.UTF_8.displayName()));
        } catch (SocketTimeoutException e) {
            throw new SpeechClientException("Processing Timeout", e);
        } catch (IOException e2) {
            throw new SpeechClientException("Failed to read response", e2);
        }
    }

    public void sendFooter(OutputStream outputStream) throws IOException {
        outputStream.write(a$$ExternalSyntheticOutline0.m(new StringBuilder(BOUNDARY_PREFIX), this.mBoundary, "--\r\n").getBytes(Charsets.UTF_8.displayName()));
    }

    public MultipartRequest(HttpsURLConnection httpsURLConnection, Part... partArr) {
        this(httpsURLConnection, Long.toHexString(System.currentTimeMillis()), partArr);
    }
}
