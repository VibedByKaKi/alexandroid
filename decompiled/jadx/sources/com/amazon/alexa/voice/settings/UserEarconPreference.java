package com.amazon.alexa.voice.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class UserEarconPreference implements EarconPreference {

    @VisibleForTesting
    static final String KEY_ENDPOINT_SOUND_ENABLED = "endpointSoundEnabled";

    @VisibleForTesting
    static final String KEY_MIGRATED_FROM_VOX = "migrated_from_vox";

    @VisibleForTesting
    static final String KEY_WAKE_SOUND_ENABLED = "wakeSoundEnabled";

    @VisibleForTesting
    static final String PREFS_FILE_NAME = "voice_earcon_prefs";
    private static final String TAG = "UserEarconPreference";
    private final SharedPreferences sharedPreferences;

    public UserEarconPreference(@NonNull Context context) {
        this.sharedPreferences = context.getSharedPreferences(PREFS_FILE_NAME, 0);
    }

    @Nullable
    private Boolean readOptional(String str) {
        Object obj = this.sharedPreferences.getAll().get(str);
        if (obj == null || (obj instanceof Boolean)) {
            return (Boolean) obj;
        }
        Log.w(TAG, "Failed to read " + str + ": not a boolean");
        return null;
    }

    @Override // com.amazon.alexa.voice.settings.EarconPreference
    public void clear() {
        this.sharedPreferences.edit().remove(KEY_WAKE_SOUND_ENABLED).remove(KEY_ENDPOINT_SOUND_ENABLED).putBoolean(KEY_MIGRATED_FROM_VOX, true).apply();
    }

    @Override // com.amazon.alexa.voice.settings.EarconPreference
    @Nullable
    public Boolean getEndpointSoundEnabled() {
        return readOptional(KEY_ENDPOINT_SOUND_ENABLED);
    }

    @Override // com.amazon.alexa.voice.settings.EarconPreference
    @Nullable
    public Boolean getWakeSoundEnabled() {
        return readOptional(KEY_WAKE_SOUND_ENABLED);
    }

    @Override // com.amazon.alexa.voice.settings.EarconPreference
    public boolean isMigratedFromVox() {
        return this.sharedPreferences.getBoolean(KEY_MIGRATED_FROM_VOX, false);
    }

    @Override // com.amazon.alexa.voice.settings.EarconPreference
    public void markMigratedFromVox(@Nullable Boolean bool, @Nullable Boolean bool2) {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        if (bool != null && !this.sharedPreferences.contains(KEY_WAKE_SOUND_ENABLED)) {
            edit.putBoolean(KEY_WAKE_SOUND_ENABLED, bool.booleanValue());
        }
        if (bool2 != null && !this.sharedPreferences.contains(KEY_ENDPOINT_SOUND_ENABLED)) {
            edit.putBoolean(KEY_ENDPOINT_SOUND_ENABLED, bool2.booleanValue());
        }
        edit.putBoolean(KEY_MIGRATED_FROM_VOX, true).apply();
    }

    @Override // com.amazon.alexa.voice.settings.EarconPreference
    public void setEndpointSoundEnabled(boolean z) {
        AppLaunchChecker$$ExternalSyntheticOutline0.m(this.sharedPreferences, KEY_ENDPOINT_SOUND_ENABLED, z);
    }

    @Override // com.amazon.alexa.voice.settings.EarconPreference
    public void setWakeSoundEnabled(boolean z) {
        AppLaunchChecker$$ExternalSyntheticOutline0.m(this.sharedPreferences, KEY_WAKE_SOUND_ENABLED, z);
    }
}
