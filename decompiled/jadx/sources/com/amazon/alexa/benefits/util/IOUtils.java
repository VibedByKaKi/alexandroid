package com.amazon.alexa.benefits.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class IOUtils {
    private IOUtils() {
    }

    public static String getJsonFromRaw(String str) {
        InputStream resourceAsStream = IOUtils.class.getClassLoader().getResourceAsStream(str);
        if (resourceAsStream == null) {
            return null;
        }
        byte[] bArr = new byte[0];
        try {
            bArr = streamToByteArray(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(bArr);
    }

    public static byte[] sourceToByteArray(Source source) throws IOException {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                int read = source.read(bArr, 0, 1024);
                if (read < 0) {
                    byteArrayOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static byte[] streamToByteArray(InputStream inputStream) throws IOException {
        return sourceToByteArray(new InputStreamSource(inputStream));
    }
}
