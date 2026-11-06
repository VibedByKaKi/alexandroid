package com.amazon.alexa.voice.wakeword;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class WakeWordExperimentSegmentResolver {

    @VisibleForTesting
    static final String KEY_S1_NEW_USER = "ww_experiment_s1_new_user";

    @VisibleForTesting
    static final String KEY_S2_DISABLE_APPLIED = "ww_experiment_s2_disable_applied";

    @VisibleForTesting
    static final String PREFS_FILE = "user_wakeword_prefs";
    public static final String SUFFIX_INACTIVE = ":INACTIVE";
    public static final String SUFFIX_NEW_USER = ":NEW_USER";
    private final SharedPreferences sharedPreferences;

    public WakeWordExperimentSegmentResolver(Context context) {
        this.sharedPreferences = context.getSharedPreferences(PREFS_FILE, 0);
    }

    public void markAsNewUser() {
        AppLaunchChecker$$ExternalSyntheticOutline0.m(this.sharedPreferences, KEY_S1_NEW_USER, true);
    }

    @Nullable
    public String resolveSegmentSuffix() {
        if (this.sharedPreferences.getBoolean(KEY_S2_DISABLE_APPLIED, false)) {
            return SUFFIX_INACTIVE;
        }
        if (this.sharedPreferences.getBoolean(KEY_S1_NEW_USER, false)) {
            return SUFFIX_NEW_USER;
        }
        return null;
    }
}
