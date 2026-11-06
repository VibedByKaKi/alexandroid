package com.amazon.whisperjoin.devicesetupserviceandroidclient.util;

import android.content.Context;
import android.content.SharedPreferences;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SharedPreferencesProvider {
    private static final String PREF_PREFIX = "com.amazon.whisperjoin.devicesetupserviceandroidclient.";
    private static final String TAG = "SharedPreferencesProvider";
    private final Context mContext;

    public SharedPreferencesProvider(Context context) {
        if (context != null) {
            this.mContext = context;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("context can not be null");
            throw null;
        }
    }

    public SharedPreferences get(String str) {
        if (str != null) {
            return this.mContext.getSharedPreferences(PREF_PREFIX.concat(str), 0);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("preferenceName can not be null");
        return null;
    }
}
