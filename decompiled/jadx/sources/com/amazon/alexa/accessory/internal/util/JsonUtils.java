package com.amazon.alexa.accessory.internal.util;

import com.amazon.alexa.accessory.internal.util.JsonArraySerializable;
import com.amazon.alexa.accessory.internal.util.JsonObjectSerializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class JsonUtils {
    private JsonUtils() {
        throw new IllegalStateException("No instances!");
    }

    public static List<List<String>> convertJsonArrayToListOfStringList(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(convertJsonArrayToStringList(jSONArray.getJSONArray(i)));
        }
        return arrayList;
    }

    public static List<String> convertJsonArrayToStringList(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    public static <T> List<T> fromJsonArray(JSONArray jSONArray, JsonObjectSerializable.Factory<T> factory) throws JSONException {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(factory.create(jSONArray.getJSONObject(i)));
        }
        return arrayList;
    }

    public static JSONObject getJsonObjectOrNull(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static String getStringOrNull(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static <T extends JsonObjectSerializable> JSONArray toJsonArray(List<T> list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            jSONArray.put(it2.next().toJsonObject());
        }
        return jSONArray;
    }

    public static <T extends JsonObjectSerializable> JSONArray toNestedJsonArray(List<List<T>> list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<List<T>> it2 = list.iterator();
        while (it2.hasNext()) {
            jSONArray.put(toJsonArray(it2.next()));
        }
        return jSONArray;
    }

    public static <T> List<T> fromJsonArray(JSONArray jSONArray, JsonArraySerializable.Factory<T> factory) throws JSONException {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(factory.create(jSONArray.getJSONArray(i)));
        }
        return arrayList;
    }
}
