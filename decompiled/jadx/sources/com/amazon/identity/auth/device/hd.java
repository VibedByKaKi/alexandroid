package com.amazon.identity.auth.device;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class hd {
    /* JADX WARN: Removed duplicated region for block: B:38:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject a(java.net.HttpURLConnection r8) {
        /*
            java.lang.String r0 = "IOException thrown closing input stream"
            java.lang.String r1 = "JSONHelpers"
            r2 = 0
            java.io.InputStream r3 = r8.getInputStream()     // Catch: java.lang.Throwable -> Lb java.io.IOException -> Le
            r4 = 0
            goto L13
        Lb:
            r8 = move-exception
            goto L84
        Le:
            java.io.InputStream r3 = r8.getErrorStream()     // Catch: java.lang.Throwable -> Lb
            r4 = 1
        L13:
            if (r3 != 0) goto L23
            if (r3 == 0) goto L22
            r3.close()     // Catch: java.io.IOException -> L1b
            goto L22
        L1b:
            java.lang.String r8 = com.amazon.identity.auth.device.yf.a(r1)
            android.util.Log.e(r8, r0)
        L22:
            return r2
        L23:
            byte[] r5 = com.amazon.identity.auth.device.mo.a(r3)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
            java.lang.String r5 = "Request to %s received response %s"
            java.net.URL r7 = r8.getURL()     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r6}     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
            com.amazon.identity.auth.device.yf.a(r5, r7)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
            if (r4 == 0) goto L5e
            java.lang.String r4 = "Request to %s received error code %s and response %s"
            java.net.URL r5 = r8.getURL()     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
            int r8 = r8.getResponseCode()     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
            java.lang.String r8 = java.lang.Integer.toString(r8)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
            java.lang.Object[] r8 = new java.lang.Object[]{r5, r8, r6}     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
            com.amazon.identity.auth.device.yf.a(r4, r8)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
            goto L5e
        L59:
            r8 = move-exception
            r2 = r3
            goto L84
        L5c:
            r8 = move-exception
            goto L6f
        L5e:
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
            r3.close()     // Catch: java.io.IOException -> L67
            goto L6e
        L67:
            java.lang.String r1 = com.amazon.identity.auth.device.yf.a(r1)
            android.util.Log.e(r1, r0)
        L6e:
            return r8
        L6f:
            java.lang.String r4 = "Could not parse response because of network issue"
            java.lang.String r5 = com.amazon.identity.auth.device.yf.a(r1)     // Catch: java.lang.Throwable -> L59
            android.util.Log.e(r5, r4, r8)     // Catch: java.lang.Throwable -> L59
            r3.close()     // Catch: java.io.IOException -> L7c
            goto L83
        L7c:
            java.lang.String r8 = com.amazon.identity.auth.device.yf.a(r1)
            android.util.Log.e(r8, r0)
        L83:
            return r2
        L84:
            if (r2 == 0) goto L91
            r2.close()     // Catch: java.io.IOException -> L8a
            goto L91
        L8a:
            java.lang.String r1 = com.amazon.identity.auth.device.yf.a(r1)
            android.util.Log.e(r1, r0)
        L91:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.identity.auth.device.hd.a(java.net.HttpURLConnection):org.json.JSONObject");
    }

    public static JSONObject b(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        try {
            if (!jSONObject.has(str) || jSONObject.isNull(str)) {
                return null;
            }
            return jSONObject.getJSONObject(str);
        } catch (JSONException e) {
            Log.i(yf.a("JSONHelpers"), q1.a("Problem parsing JSON for key ", str, ". Error: ", e.getMessage()));
            return null;
        }
    }

    public static boolean a(JSONObject jSONObject, String str) {
        try {
            if (!jSONObject.has(str) || jSONObject.isNull(str)) {
                return false;
            }
            return jSONObject.getBoolean(str);
        } catch (JSONException e) {
            Log.i(yf.a("JSONHelpers"), q1.a("Problem parsing JSON for key ", str, ". Error: ", e.getMessage()));
            return false;
        }
    }

    public static String a(String str, String str2, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has(str) && !jSONObject.isNull(str)) {
                    return jSONObject.getString(str);
                }
            } catch (JSONException e) {
                Log.i(yf.a("JSONHelpers"), q1.a("Problem parsing JSON for key ", str, ". Error: ", e.getMessage()));
            }
        }
        return str2;
    }
}
