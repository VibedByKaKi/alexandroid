package com.amazon.whisperjoin.softap.json;

import java.io.IOException;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public class SendPublicKeyRequestBuilder {
    private static final String KEY_PUB_KEY = "publicKey";
    private static final String KEY_SCHEME_KEY = "scheme";

    public byte[] build(String str, int i) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(KEY_PUB_KEY, str);
        jSONObject.put(KEY_SCHEME_KEY, i);
        return jSONObject.toString().getBytes(Charset.forName("UTF-8"));
    }
}
