package com.amazon.identity.auth.device;

import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class lm {
    public static lm c;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f795a = new HashMap();
    public final le b;

    public lm(Context context) {
        this.b = le.b(context, "regulation_logic_storage");
    }

    public final synchronized void a(JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        this.f795a.put("privacy_regulations_json", jSONObject2);
        this.b.a("privacy_regulations_json", jSONObject2);
        String l = Long.toString(jSONObject.getLong("ttl"));
        this.f795a.put("ttl_in_millisec", l);
        this.b.a("ttl_in_millisec", l);
        String l2 = Long.toString(System.currentTimeMillis());
        this.f795a.put("last_updated_timestamp", l2);
        this.b.a("last_updated_timestamp", l2);
    }

    public final synchronized Long b() {
        Long l;
        String str = (String) this.f795a.get("last_updated_timestamp");
        l = null;
        if (str == null) {
            str = this.b.a("last_updated_timestamp");
            if (str != null) {
                this.f795a.put("last_updated_timestamp", str);
            } else {
                str = null;
            }
        }
        if (str != null) {
            try {
                l = Long.valueOf(str);
            } catch (Exception unused) {
            }
        }
        return l;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e A[Catch: all -> 0x001e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:3:0x0001, B:24:0x0024, B:12:0x002e, B:17:0x0034, B:21:0x0041, B:27:0x0010, B:29:0x0018), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.Long c() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "ttl_in_millisec"
            java.util.HashMap r1 = r4.f795a     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            if (r1 == 0) goto L10
            goto L21
        L10:
            com.amazon.identity.auth.device.le r1 = r4.b     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = r1.a(r0)     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L20
            java.util.HashMap r3 = r4.f795a     // Catch: java.lang.Throwable -> L1e
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L1e
            goto L21
        L1e:
            r0 = move-exception
            goto L4e
        L20:
            r1 = r2
        L21:
            if (r1 != 0) goto L24
            goto L29
        L24:
            java.lang.Long r0 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L29
            goto L2a
        L29:
            r0 = r2
        L2a:
            if (r0 == 0) goto L2e
            monitor-exit(r4)
            return r0
        L2e:
            org.json.JSONObject r0 = r4.a()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L4c
            java.lang.String r1 = "ttl"
            long r0 = r0.getLong(r1)     // Catch: java.lang.Throwable -> L1e org.json.JSONException -> L41
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L1e org.json.JSONException -> L41
            monitor-exit(r4)
            return r0
        L41:
            java.lang.String r0 = "RegulationLogicStorage"
            java.lang.String r1 = "Couldn't get TTL from JSON"
            java.lang.String r0 = com.amazon.identity.auth.device.yf.a(r0)     // Catch: java.lang.Throwable -> L1e
            android.util.Log.w(r0, r1)     // Catch: java.lang.Throwable -> L1e
        L4c:
            monitor-exit(r4)
            return r2
        L4e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.identity.auth.device.lm.c():java.lang.Long");
    }

    public final synchronized Boolean d() {
        try {
            Long c2 = c();
            Long b = b();
            if (c2 != null && b != null && !c2.equals(0L) && !b.equals(0L)) {
                long currentTimeMillis = System.currentTimeMillis();
                return Boolean.valueOf(currentTimeMillis < c2.longValue() + b.longValue() && currentTimeMillis >= b.longValue());
            }
            return Boolean.FALSE;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized JSONObject a() {
        JSONObject jSONObject;
        jSONObject = null;
        try {
            String str = (String) this.f795a.get("privacy_regulations_json");
            if (str == null) {
                str = this.b.a("privacy_regulations_json");
                if (str != null) {
                    this.f795a.put("privacy_regulations_json", str);
                } else {
                    str = null;
                }
            }
            if (str != null) {
                jSONObject = new JSONObject(str);
            }
        } catch (JSONException e) {
            Log.e(yf.a("RegulationLogicStorage"), "JSON parsing error while getting JSON from storage", e);
            return null;
        } finally {
        }
        return jSONObject;
    }

    public final synchronized void a(String str) {
        this.b.a("last_app_version", str);
    }
}
