package com.amazon.alexa.entertainment.config;

import android.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class AlexaMobilePushCapabilityConfig {
    private static final String TAG = "AlexaMobilePushCapabilityConfig";

    private AlexaMobilePushCapabilityConfig() {
    }

    public static JSONObject get() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("name", "smarthome-events");
            jSONObject2.put("version", "1.0.0");
            jSONArray.put(jSONObject2);
            jSONObject.put("supportedEventFormats", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            Log.e(TAG, "Failed to parse AlexaMobilePushCapabilityConfig: " + e.getMessage());
            return null;
        }
    }
}
