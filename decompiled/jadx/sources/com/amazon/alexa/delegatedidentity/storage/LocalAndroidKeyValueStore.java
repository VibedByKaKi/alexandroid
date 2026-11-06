package com.amazon.alexa.delegatedidentity.storage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class LocalAndroidKeyValueStore {
    public static final String STORAGE_NAMESPACE = "com.amazon.alexa.delegatedidentity.DelegatedTokenStorage.encrypt.namespace";
    private static final String TAG = "com.amazon.alexa.delegatedidentity.storage.LocalAndroidKeyValueStore";
    private final Context context;

    public LocalAndroidKeyValueStore(Context context) {
        this.context = context;
    }

    private SharedPreferences getSharedPreferences() {
        return this.context.getSharedPreferences(STORAGE_NAMESPACE, 0);
    }

    public String getStringValue(String str, String str2) {
        return getSharedPreferences().getString(str, str2);
    }

    public boolean setValue(String str, String str2) {
        boolean commit = getSharedPreferences().edit().putString(str, str2).commit();
        if (!commit) {
            AppLaunchChecker$$ExternalSyntheticOutline0.m("Failed to set key ", str, " in the local key value store com.amazon.alexa.delegatedidentity.DelegatedTokenStorage.encrypt.namespace", TAG);
        }
        return commit;
    }
}
