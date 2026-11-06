package com.dee.app.data.api;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.dee.app.cachemanager.AppDataCacheEntry;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Observable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public interface ElementLocalStorage {
    Observable<Void> clear(String str) throws IllegalArgumentException;

    Observable<AppDataCacheEntry> get(String str, @Nullable Bundle bundle) throws IllegalArgumentException;

    default Observable<AppDataCacheEntry> get(String str, String str2, @Nullable Bundle bundle) throws IllegalArgumentException {
        if (TextUtils.isEmpty(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Cannot get value with empty namespace argument.");
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Cannot get value with empty key argument.");
            return null;
        }
        return get(str + "." + str2, bundle);
    }

    Observable<AppDataCacheEntry> put(String str, String str2, @Nullable Bundle bundle) throws IllegalArgumentException;

    default Observable<AppDataCacheEntry> put(String str, String str2, String str3, @Nullable Bundle bundle) throws IllegalArgumentException {
        if (TextUtils.isEmpty(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Cannot put value with empty namespace argument.");
            return null;
        }
        if (!TextUtils.isEmpty(str2)) {
            return put(a$$ExternalSyntheticOutline0.m$1(str, ".", str2), str3, bundle);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Cannot put value with empty key argument.");
        return null;
    }

    Observable<Void> remove(String str) throws IllegalArgumentException;

    default Observable<Void> remove(String str, String str2) throws IllegalArgumentException {
        if (TextUtils.isEmpty(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Cannot remove value with empty namespace argument.");
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Cannot removee value with empty key argument.");
            return null;
        }
        return remove(str + "." + str2);
    }

    default Observable<AppDataCacheEntry> get(String str) throws IllegalArgumentException {
        return get(str, (Bundle) null);
    }

    default Observable<AppDataCacheEntry> get(String str, String str2) throws IllegalArgumentException {
        return get(str, str2, null);
    }
}
