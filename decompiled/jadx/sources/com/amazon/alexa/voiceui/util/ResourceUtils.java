package com.amazon.alexa.voiceui.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ResourceUtils {
    private static final int bufferSize = 1024;

    private ResourceUtils() {
        throw new IllegalStateException("No instances!");
    }

    public static JSONObject getCardPayload(String str) throws IOException, JSONException {
        return getJsonObject(str).getJSONObject("directive").getJSONObject("payload");
    }

    public static JSONObject getJsonObject(String str) throws IOException, JSONException {
        return new JSONObject(getString(str));
    }

    public static String getString(String str) throws IOException {
        InputStream resourceAsStream = ResourceUtils.class.getClassLoader().getResourceAsStream(str);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = resourceAsStream.read(bArr);
                if (read == -1) {
                    String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
                    resourceAsStream.close();
                    return byteArrayOutputStream2;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th) {
            resourceAsStream.close();
            throw th;
        }
    }
}
