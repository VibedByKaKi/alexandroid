package com.amazon.alexa.voice.handsfree;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class HandsFreePermissionsSettings {

    @VisibleForTesting
    static final String KEY_PERMISSION_GRANTED = "primer";

    @VisibleForTesting
    static final String KEY_PERMISSION_SHOWN = "shown";

    @VisibleForTesting
    static final String SHARED_PREFS_FILE_NAME = "voice";
    private final Context context;
    private SharedPreferences preferences = null;

    public HandsFreePermissionsSettings(@NonNull Context context) {
        this.context = context;
    }

    private SharedPreferences getSharedPreferences() {
        if (this.preferences == null) {
            this.preferences = this.context.getSharedPreferences("voice", 0);
        }
        return this.preferences;
    }

    public void setPermissionGranted() {
        AppLaunchChecker$$ExternalSyntheticOutline0.m(getSharedPreferences(), KEY_PERMISSION_GRANTED, true);
    }

    public void setPermissionShown() {
        AppLaunchChecker$$ExternalSyntheticOutline0.m(getSharedPreferences(), KEY_PERMISSION_SHOWN, true);
    }

    public boolean wasPermissionShown() {
        return getSharedPreferences().getBoolean(KEY_PERMISSION_SHOWN, false) || getSharedPreferences().getBoolean(KEY_PERMISSION_GRANTED, false);
    }
}
