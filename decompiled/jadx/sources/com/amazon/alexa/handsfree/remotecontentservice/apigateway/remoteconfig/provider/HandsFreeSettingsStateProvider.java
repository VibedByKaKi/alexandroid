package com.amazon.alexa.handsfree.remotecontentservice.apigateway.remoteconfig.provider;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.VisibleForTesting;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class HandsFreeSettingsStateProvider {
    private static final HandsFreeSettingsState DEFAULT_SETTINGS_STATE = HandsFreeSettingsState.LOCALLY_DISABLED;

    @VisibleForTesting
    static final String KEY_PREVIOUS_SETTINGS_STATE = "com.amazon.alexa.handsfree.settings.HandsFree.SETTINGS";

    @VisibleForTesting
    static final String SHARED_PREFERENCES_FILE_NAME = "com.amazon.alexa.handsfree.settings.HandsFree";
    private final SharedPreferences mSharedPreferences;

    public HandsFreeSettingsStateProvider(Context context) {
        this.mSharedPreferences = context.getSharedPreferences(SHARED_PREFERENCES_FILE_NAME, 0);
    }

    public HandsFreeSettingsState getPreviousSettingsState() {
        return HandsFreeSettingsState.get(this.mSharedPreferences.getInt(KEY_PREVIOUS_SETTINGS_STATE, DEFAULT_SETTINGS_STATE.getValue()));
    }

    public void setSettingsState(HandsFreeSettingsState handsFreeSettingsState) {
        this.mSharedPreferences.edit().putInt(KEY_PREVIOUS_SETTINGS_STATE, handsFreeSettingsState.getValue()).apply();
    }
}
