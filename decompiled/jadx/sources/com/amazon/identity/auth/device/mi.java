package com.amazon.identity.auth.device;

import com.amazon.identity.auth.device.utils.AccountConstants;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class mi {
    public static String a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("public_code", str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code_pair", jSONObject);
        jSONObject2.put(AccountConstants.KEY_ACCESS_TOKEN, str2);
        jSONObject2.put("actor_id", str3);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("auth_data", jSONObject2);
        return jSONObject3.toString();
    }
}
