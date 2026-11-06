package ai.onnxruntime.telemetry;

import ai.onnxruntime.telemetry.HttpClientRequest;
import androidx.annotation.NonNull;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
class Request implements HttpClientRequest {
    private byte[] m_body;
    private HttpURLConnection m_connection;
    private final HttpClient m_parent;
    private String m_request_id;

    public Request(@NonNull HttpClient httpClient, String str, String str2, byte[] bArr, String str3, @NonNull HttpClientRequest.Headers headers) throws IOException {
        this.m_parent = httpClient;
        HttpURLConnection httpURLConnection = (HttpURLConnection) httpClient.newUrl(str).openConnection();
        this.m_connection = httpURLConnection;
        httpURLConnection.setRequestMethod(str2);
        this.m_body = bArr;
        if (bArr.length > 0) {
            this.m_connection.setFixedLengthStreamingMode(bArr.length);
            this.m_connection.setDoOutput(true);
        }
        this.m_request_id = str3;
        while (headers.hasNext()) {
            HttpClientRequest.HeaderEntry next = headers.next();
            this.m_connection.setRequestProperty(next.key, next.value);
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public void run() {
        int i;
        String[] strArr;
        int i2 = 0;
        String[] strArr2 = new String[0];
        byte[] bArr = new byte[0];
        try {
            try {
                if (this.m_body.length > 0) {
                    this.m_connection.getOutputStream().write(this.m_body);
                }
                i = this.m_connection.getResponseCode();
                try {
                    Map<String, List<String>> headerFields = this.m_connection.getHeaderFields();
                    Vector vector = new Vector();
                    for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
                        if (entry.getKey() != null) {
                            for (String str : entry.getValue()) {
                                vector.add(entry.getKey());
                                vector.add(str);
                            }
                        }
                    }
                    strArr = (String[]) vector.toArray(strArr2);
                    try {
                        BufferedInputStream bufferedInputStream = i >= 300 ? new BufferedInputStream(this.m_connection.getErrorStream()) : new BufferedInputStream(this.m_connection.getInputStream());
                        byte[] bArr2 = new byte[1024];
                        Vector vector2 = new Vector();
                        int i3 = 0;
                        while (true) {
                            int read = bufferedInputStream.read(bArr2, 0, 1024);
                            if (read < 0) {
                                break;
                            } else if (read > 0) {
                                vector2.add(Arrays.copyOfRange(bArr2, 0, read));
                                i3 += read;
                            }
                        }
                        bArr = new byte[i3];
                        Iterator it2 = vector2.iterator();
                        int i4 = 0;
                        while (it2.hasNext()) {
                            for (byte b : (byte[]) it2.next()) {
                                bArr[i4] = b;
                                i4++;
                            }
                        }
                        this.m_connection.disconnect();
                    } catch (Exception unused) {
                        i2 = i;
                        strArr2 = strArr;
                        this.m_connection.disconnect();
                        i = i2;
                        strArr = strArr2;
                        this.m_parent.dispatchCallback(this.m_request_id, i, strArr, bArr);
                    }
                } catch (Exception unused2) {
                    i2 = i;
                }
            } catch (Throwable th) {
                this.m_connection.disconnect();
                throw th;
            }
        } catch (Exception unused3) {
        }
        this.m_parent.dispatchCallback(this.m_request_id, i, strArr, bArr);
    }
}
