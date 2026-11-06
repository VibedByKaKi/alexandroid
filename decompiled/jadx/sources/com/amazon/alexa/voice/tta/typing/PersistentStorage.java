package com.amazon.alexa.voice.tta.typing;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class PersistentStorage {
    private static final String IS_FIRST_TIME_USER_KEY = "IS_FIRST_TIME_USER";
    private static final String IS_USER_ON_TTA_SCREEN = "IS_USER_ON_TTA_SCREEN";
    private static final String SHARED_PREFERENCES_KEY = "TWA_SHARED_PREFS";
    private SharedPreferences sharedPreferences;

    public PersistentStorage(Context context) {
        this.sharedPreferences = context.getSharedPreferences("TWA_SHARED_PREFS", 0);
    }

    public boolean getIsFirstTimeUser() {
        return this.sharedPreferences.getBoolean(IS_FIRST_TIME_USER_KEY, true);
    }

    public boolean getIsUserOnTtaScreen() {
        return this.sharedPreferences.getBoolean(IS_USER_ON_TTA_SCREEN, false);
    }

    public boolean isPermissionRequested(String str) {
        return this.sharedPreferences.getBoolean(str, false);
    }

    public void setIsFirstTimeUser(boolean z) {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putBoolean(IS_FIRST_TIME_USER_KEY, z);
        edit.apply();
    }

    public void setIsUserOnTtaScreen(boolean z) {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putBoolean(IS_USER_ON_TTA_SCREEN, z);
        edit.apply();
    }

    public void setPermissionRequested(String str, boolean z) {
        AppLaunchChecker$$ExternalSyntheticOutline0.m(this.sharedPreferences, str, z);
    }
}
