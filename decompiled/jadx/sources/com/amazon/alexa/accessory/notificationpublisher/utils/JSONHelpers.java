package com.amazon.alexa.accessory.notificationpublisher.utils;

import androidx.annotation.NonNull;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class JSONHelpers {
    private static final String TAG = "JSONHelpers";

    private JSONHelpers() {
    }

    public static boolean isArrayContains(@NonNull JSONArray jSONArray, @NonNull Object obj) {
        for (int i = 0; i < jSONArray.length(); i++) {
            if (jSONArray.opt(i).equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public static void mergeJSONObjects(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject2.put(next, jSONObject.optString(next));
        }
    }

    public static void mergeJSONObjects(JSONObject jSONObject, JSONObject jSONObject2, String[] strArr) throws JSONException {
        mergeJSONObjects(new JSONObject(jSONObject, strArr), jSONObject2);
    }
}
