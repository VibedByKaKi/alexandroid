package com.amazon.alexa.voice.handsfree.features;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
class ComponentStateProvider {
    private static final String ALEXA_HANDS_FREE_DYNAMIC_LANGUAGE_SWITCHING_KEY = "ALEXA_HANDS_FREE_FEATURE_GATING_DYNAMIC_LANGUAGE_SWITCHING";
    private static final String ALEXA_VOX_DLS_KEY = "ALEXA_VOX_ANDROID_DLS";
    private static final String REMOVE_AHF_FOR_ALL_CUSTOMERS = "ALEXA_HANDS_FREE_FEATURE_DISABLE_AHF_FOR_ALL_CUSTOMER";

    @VisibleForTesting
    static final String SHARED_PREFERENCE_FILE = "FEATURE_GATE_COMPONENT_STATE";
    private final Map<String, String> mHandsFreeWeblabToComponentMap = new HashMap();
    private final SharedPreferences mSharedPreferences;

    @VisibleForTesting
    public ComponentStateProvider(@NonNull Context context) {
        this.mSharedPreferences = context.getSharedPreferences(SHARED_PREFERENCE_FILE, 0);
    }

    @VisibleForTesting
    public boolean hasRemainedAvailable(@NonNull String str) {
        return str.equals("ALEXA_HANDS_FREE_FEATURE_DISABLE_AHF_FOR_ALL_CUSTOMER") ? this.mSharedPreferences.getBoolean(str, false) : (!this.mHandsFreeWeblabToComponentMap.containsKey(str) || this.mSharedPreferences.contains(str)) ? this.mSharedPreferences.getBoolean(str, true) : this.mSharedPreferences.getBoolean(this.mHandsFreeWeblabToComponentMap.get(str), true);
    }

    @VisibleForTesting
    public void storeCurrentState(@NonNull String str, boolean z) {
        AppLaunchChecker$$ExternalSyntheticOutline0.m(this.mSharedPreferences, str, z);
    }
}
