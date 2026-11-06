package com.amazon.alexa.voice.ui.onedesign.util;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class JSONUtils {
    private JSONUtils() {
        throw new IllegalStateException("No instances!");
    }

    public static String optionalString(JSONObject jSONObject, String str, String str2) {
        if (jSONObject != null && !jSONObject.isNull(str)) {
            try {
                return jSONObject.getString(str);
            } catch (JSONException unused) {
            }
        }
        return str2;
    }

    public static String optionalString(JSONObject jSONObject, String str) {
        return optionalString(jSONObject, str, (String) null);
    }

    public static String optionalString(JSONArray jSONArray, int i) throws JSONException {
        return optionalString(jSONArray, i, (String) null);
    }

    public static String optionalString(JSONArray jSONArray, int i, String str) throws JSONException {
        return jSONArray.isNull(i) ? str : jSONArray.getString(i);
    }
}
