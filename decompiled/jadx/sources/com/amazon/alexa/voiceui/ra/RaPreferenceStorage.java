package com.amazon.alexa.voiceui.ra;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RaPreferenceStorage {

    @VisibleForTesting
    static final String ALEXA_RA_PREFS_FILE_NAME = "alexa_ra_prefs";

    @VisibleForTesting
    static final String ALEXA_RA_UPDATE_REQUESTED = "ra_update_requested";
    public static final long DEFAULT_TIME_STAMP = 0;
    private static final String TAG = "RaPreferenceStorage";

    @VisibleForTesting
    static final String TIME_STAMP_KEY = "time_stamp_key";
    private final SharedPreferences sharedPreferences;

    public RaPreferenceStorage(@NonNull Context context) {
        this.sharedPreferences = context.getSharedPreferences(ALEXA_RA_PREFS_FILE_NAME, 0);
    }

    public void clearRaUpdatePromptPreference() {
        this.sharedPreferences.edit().remove(ALEXA_RA_UPDATE_REQUESTED).apply();
    }

    public long getLastRaIngressTimeStamp() {
        return this.sharedPreferences.getLong(TIME_STAMP_KEY, 0L);
    }

    public boolean getRaUpdatePromptPreference() {
        return this.sharedPreferences.getBoolean(ALEXA_RA_UPDATE_REQUESTED, false);
    }

    public void storeIngressTimeStamp(@NonNull long j) {
        this.sharedPreferences.edit().putLong(TIME_STAMP_KEY, j).apply();
    }

    public void storeRaUpdatePromptPreference() {
        AppLaunchChecker$$ExternalSyntheticOutline0.m(this.sharedPreferences, ALEXA_RA_UPDATE_REQUESTED, true);
    }
}
