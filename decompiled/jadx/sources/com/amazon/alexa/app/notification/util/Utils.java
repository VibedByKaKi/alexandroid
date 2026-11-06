package com.amazon.alexa.app.notification.util;

import android.os.Bundle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final class Utils {
    private static final String SHA_256 = "SHA-256";

    private Utils() {
    }

    public static String bundleToString(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            try {
                if (obj instanceof Bundle) {
                    String bundleToString = bundleToString((Bundle) obj);
                    Objects.requireNonNull(bundleToString);
                    jSONObject.put(str, new JSONObject(bundleToString));
                } else if (obj instanceof ArrayList) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it2 = ((ArrayList) obj).iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (next instanceof Bundle) {
                            String bundleToString2 = bundleToString((Bundle) next);
                            Objects.requireNonNull(bundleToString2);
                            jSONArray.put(new JSONObject(bundleToString2));
                        } else {
                            jSONArray.put(next);
                        }
                    }
                    jSONObject.put(str, jSONArray);
                } else {
                    jSONObject.put(str, obj);
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return jSONObject.toString();
    }

    public static String sha256Hex(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", Integer.valueOf(b & 255)));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static Bundle stringToBundle(String str) {
        Bundle bundle = new Bundle();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Integer) {
                    bundle.putInt(next, ((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    bundle.putLong(next, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    bundle.putDouble(next, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    bundle.putString(next, (String) obj);
                } else if (obj instanceof JSONObject) {
                    bundle.putBundle(next, stringToBundle(obj.toString()));
                } else if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    ArrayList<String> arrayList = new ArrayList<>();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(jSONArray.get(i).toString());
                    }
                    bundle.putStringArrayList(next, arrayList);
                } else {
                    bundle.putString(next, obj.toString());
                }
            }
            return bundle;
        } catch (Exception unused) {
            return null;
        }
    }
}
