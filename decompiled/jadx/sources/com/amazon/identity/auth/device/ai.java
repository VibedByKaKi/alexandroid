package com.amazon.identity.auth.device;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.amazon.identity.auth.device.storage.PropagationPolicy;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import org.json.JSONArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class ai implements c9 {
    public static ai e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f460a = new Object();
    public final le b;
    public final le c;
    public final Context d;

    public ai(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext;
        Context createDeviceProtectedStorageContext = applicationContext.createDeviceProtectedStorageContext();
        if (!createDeviceProtectedStorageContext.moveSharedPreferencesFrom(applicationContext, "map_p2a_completed_transition")) {
            Log.w(yf.a("P2ATransitionStore"), "Failed to migrate shared preferences for ".concat("map_p2a_completed_transition"));
        }
        this.b = new le(createDeviceProtectedStorageContext, "map_p2a_completed_transition");
        Context createDeviceProtectedStorageContext2 = applicationContext.createDeviceProtectedStorageContext();
        if (!createDeviceProtectedStorageContext2.moveSharedPreferencesFrom(applicationContext, "map_p2a_transition_dirty")) {
            Log.w(yf.a("P2ATransitionStore"), "Failed to migrate shared preferences for ".concat("map_p2a_transition_dirty"));
        }
        this.c = new le(createDeviceProtectedStorageContext2, "map_p2a_transition_dirty");
    }

    public final void a(Uri uri, ContentValues contentValues) {
        ContentValues contentValues2;
        synchronized (this.f460a) {
            oq a2 = oq.a(contentValues);
            oq a3 = a(a2);
            contentValues2 = new ContentValues();
            contentValues2.put("source_account_id", a3.f864a);
            contentValues2.put("target_directed_ids", new JSONArray((Collection<?>) a3.b).toString());
            contentValues2.put("change_timestamp", Long.valueOf(a3.c));
            this.c.a(a2.f864a, "true");
            yf.a("P2ATransitionStore");
            "user".equalsIgnoreCase(Build.TYPE);
        }
        b9 a4 = b9.a(this.d);
        a4.getClass();
        int[] iArr = y8.f1085a;
        PropagationPolicy propagationPolicy = PropagationPolicy.ASYNC_BEST_EFFORT;
        if (iArr[propagationPolicy.ordinal()] == 1) {
            a4.b.submit(new z8(a4, this, contentValues2));
        } else {
            Gson$$ExternalSyntheticBUOutline0.m((Object) propagationPolicy, "Unsupported policy: ");
        }
    }

    public static synchronized ai a(Context context) {
        ai aiVar;
        synchronized (ai.class) {
            try {
                if (e == null) {
                    e = new ai(context);
                }
                aiVar = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aiVar;
    }

    public final oq a(oq oqVar) {
        String str = oqVar.f864a;
        oq a2 = a(str);
        if (a2 == null) {
            this.b.a(str, oqVar.a());
            yf.a("P2ATransitionStore");
            "user".equalsIgnoreCase(Build.TYPE);
            return oqVar;
        }
        long max = Math.max(a2.c, oqVar.c);
        ArrayList arrayList = new ArrayList(Collections.unmodifiableList(a2.b));
        for (String str2 : Collections.unmodifiableList(oqVar.b)) {
            if (!arrayList.contains(str2)) {
                arrayList.add(str2);
            }
        }
        oq oqVar2 = new oq(str, arrayList, max);
        this.b.a(str, oqVar2.a());
        yf.a("P2ATransitionStore");
        "user".equalsIgnoreCase(Build.TYPE);
        return oqVar2;
    }

    public final oq a(String str) {
        synchronized (this.f460a) {
            try {
                String a2 = this.b.a(str);
                if (a2 == null) {
                    return null;
                }
                return oq.a(a2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
