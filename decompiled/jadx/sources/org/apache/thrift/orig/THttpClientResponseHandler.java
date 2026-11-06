package org.apache.thrift.orig;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.HttpException;
import org.apache.hc.core5.http.io.HttpClientResponseHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class THttpClientResponseHandler implements HttpClientResponseHandler<InputStream> {
    private static void consume(HttpEntity httpEntity) throws IOException {
        InputStream content;
        if (httpEntity == null || !httpEntity.isStreaming() || (content = httpEntity.getContent()) == null) {
            return;
        }
        content.close();
    }

    private static byte[] readIntoByteArray(InputStream inputStream) throws IOException {
        int read;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        do {
            read = inputStream.read(bArr);
            if (read > 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } while (-1 != read);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: handleResponse, reason: merged with bridge method [inline-methods] */
    public InputStream m27341handleResponse(ClassicHttpResponse classicHttpResponse) throws HttpException, IOException {
        InputStream content = classicHttpResponse.getEntity().getContent();
        try {
            int code = classicHttpResponse.getCode();
            if (code != 200) {
                throw new IOException("HTTP Response code: " + code);
            }
            byte[] readIntoByteArray = readIntoByteArray(content);
            try {
                consume(classicHttpResponse.getEntity());
            } catch (IOException unused) {
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(readIntoByteArray);
            if (content != null) {
                content.close();
            }
            return byteArrayInputStream;
        } catch (Throwable th) {
            if (content != null) {
                try {
                    content.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
