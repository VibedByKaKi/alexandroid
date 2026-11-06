package com.amazon.alexa.voice.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class VoxEarconPreferencesReader {
    private static final String TAG = "VoxEarconPreferencesReader";

    @VisibleForTesting
    static final String VOX_KEY_ENDPOINT_SOUND_ENABLED = "endpointSoundEnabled";

    @VisibleForTesting
    static final String VOX_KEY_WAKE_SOUND_ENABLED = "wakeSoundEnabled";

    @VisibleForTesting
    static final String VOX_PREFS_FILE_NAME = "AlexaDevicePreferences";
    private final Context context;

    public VoxEarconPreferencesReader(@NonNull Context context) {
        this.context = context;
    }

    @Nullable
    private Boolean readOptional(String str) {
        try {
            SharedPreferences sharedPreferences = this.context.getSharedPreferences("AlexaDevicePreferences", 0);
            if (sharedPreferences.contains(str)) {
                return Boolean.valueOf(sharedPreferences.getBoolean(str, false));
            }
            return null;
        } catch (ClassCastException e) {
            Log.w(TAG, "Failed to read VOX " + str, e);
            return null;
        }
    }

    @Nullable
    public Boolean readEndpointSoundEnabled() {
        return readOptional(VOX_KEY_ENDPOINT_SOUND_ENABLED);
    }

    @Nullable
    public Boolean readWakeSoundEnabled() {
        return readOptional(VOX_KEY_WAKE_SOUND_ENABLED);
    }
}
