package com.amazon.identity.mobi.common.utils.json;

import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class JSONUtils {
    public static JSONObject getValidJson(String str) throws JSONException {
        return new JSONObject(str);
    }

    private static Object serializeObject(Object obj, Set set) {
        Object obj2;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof String) || (obj instanceof Number)) {
            return obj;
        }
        if (obj instanceof Boolean) {
            return obj;
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).toString();
        }
        if (obj instanceof JSONArray) {
            return ((JSONArray) obj).toString();
        }
        if (!set.add(obj)) {
            Log.w("JSONUtils", "Circular reference detected for object of type: ".concat(obj.getClass().getName()));
            return null;
        }
        try {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                Iterator it2 = ((Collection) obj).iterator();
                while (it2.hasNext()) {
                    jSONArray.put(serializeObject(it2.next(), set));
                }
                return jSONArray;
            }
            int i = 0;
            if (obj.getClass().isArray()) {
                JSONArray jSONArray2 = new JSONArray();
                int length = Array.getLength(obj);
                while (i < length) {
                    jSONArray2.put(serializeObject(Array.get(obj, i), set));
                    i++;
                }
                return jSONArray2;
            }
            if (obj instanceof Map) {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    jSONObject.put(String.valueOf(entry.getKey()), serializeObject(entry.getValue(), set));
                }
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject();
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            int length2 = declaredFields.length;
            while (i < length2) {
                Field field = declaredFields[i];
                field.setAccessible(true);
                String name = field.getName();
                if (!name.equals("$jacocoData")) {
                    try {
                        obj2 = field.get(obj);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                        obj2 = null;
                    }
                    if (name.length() > 1 && name.startsWith("m")) {
                        name = Character.toLowerCase(name.charAt(1)) + name.substring(2);
                    }
                    jSONObject2.put(name, serializeObject(obj2, set));
                }
                i++;
            }
            return jSONObject2;
        } finally {
            set.remove(obj);
        }
    }

    public static String serializeObjectToJson(Object obj) {
        try {
            return serializeObject(obj, Collections.newSetFromMap(new IdentityHashMap())).toString();
        } catch (JSONException e) {
            Log.e("JSONUtils", "Fail to serialize object", e);
            return null;
        }
    }
}
