package com.amazon.identity.auth.device;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class wi {
    public static vi a(JSONObject jSONObject) {
        String str;
        String str2;
        String str3 = null;
        try {
            String string = jSONObject.getString("error");
            try {
                str2 = jSONObject.getString("error_description");
                try {
                    str3 = jSONObject.getString("error_index");
                    return new vi(string, str2, str3);
                } catch (JSONException unused) {
                    str = str3;
                    str3 = string;
                    return new vi(str3, str2, str);
                }
            } catch (JSONException unused2) {
                str = null;
                str2 = null;
            }
        } catch (JSONException unused3) {
            str = null;
            str2 = null;
        }
    }
}
