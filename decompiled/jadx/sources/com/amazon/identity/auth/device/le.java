package com.amazon.identity.auth.device;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class le {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f789a;
    public final String b;

    public le(Context context, String str) {
        this.f789a = context.getSharedPreferences(str, 0);
        this.b = str;
    }

    public static le a(Context context, String str) {
        int i = Build.VERSION.SDK_INT;
        if (!gl.i(context)) {
            return new le(context, str, 0);
        }
        Log.i(yf.a("LocalKeyValueStore"), "Create DE shared preference, OS supports direct boot.");
        Context createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        if (i >= 30 && gl.i(context)) {
            if (!createDeviceProtectedStorageContext.moveDatabaseFrom(context, "map_data_storage_v2")) {
                Log.w(yf.a("LocalKeyValueStore"), "Failed to migrate shared DataBase File");
            }
            if (!createDeviceProtectedStorageContext.moveSharedPreferencesFrom(context, "com.amazon.identity.auth.device.storage.LocalOnlySQLDB.encryption.namespace") || !createDeviceProtectedStorageContext.moveSharedPreferencesFrom(context, "account_change_observer") || !createDeviceProtectedStorageContext.moveSharedPreferencesFrom(context, "map_version_cache") || !createDeviceProtectedStorageContext.moveSharedPreferencesFrom(context, "token_storage") || !createDeviceProtectedStorageContext.moveSharedPreferencesFrom(context, "default_cor_pfm_store")) {
                Log.w(yf.a("LocalKeyValueStore"), "Failed to migrate shared preferences");
            }
        }
        return new le(createDeviceProtectedStorageContext, str, 0);
    }

    public final void b(String str) {
        if (this.f789a.edit().remove(str).commit()) {
            return;
        }
        Log.e(yf.a("LocalKeyValueStore"), q1.a("Failed to remove key: ", str, " from value store ", this.b));
    }

    public le(Context context, String str, int i) {
        this.f789a = context.getSharedPreferences(str, 0);
        this.b = str;
    }

    public static le b(Context context, String str) {
        return new le(context, str, 0);
    }

    public final String a(String str) {
        return this.f789a.getString(str, null);
    }

    public final boolean a(String str, String str2) {
        boolean commit = this.f789a.edit().putString(str, str2).commit();
        if (!commit) {
            Log.e(yf.a("LocalKeyValueStore"), q1.a("Failed to set key ", str, " in the local key value store ", this.b));
        }
        return commit;
    }

    public final boolean a(String str, long j) {
        boolean commit = this.f789a.edit().putLong(str, j).commit();
        if (!commit) {
            Log.e(yf.a("LocalKeyValueStore"), q1.a("Failed to set key ", str, " in the local key value store ", this.b));
        }
        return commit;
    }

    public final boolean a(String str, Boolean bool) {
        boolean commit = this.f789a.edit().putBoolean(str, bool.booleanValue()).commit();
        if (!commit) {
            Log.e(yf.a("LocalKeyValueStore"), q1.a("Failed to set key ", str, " in the local key value store ", this.b));
        }
        return commit;
    }

    public final void a(LinkedHashMap linkedHashMap) {
        SharedPreferences.Editor edit = this.f789a.edit();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            edit.putString((String) entry.getKey(), (String) entry.getValue());
        }
        if (edit.commit()) {
            return;
        }
        Log.e(yf.a("LocalKeyValueStore"), "Failed to set keys in the local key value store " + this.b);
    }

    public final boolean a() {
        boolean commit = this.f789a.edit().clear().commit();
        if (!commit) {
            Log.e(yf.a("LocalKeyValueStore"), b0.a("Failed to clear the local key value store ", this.b));
        }
        return commit;
    }
}
