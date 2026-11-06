package com.amazon.alexa.sharing.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class Utils {
    private Utils() {
    }

    public static boolean getBooleanPreferenceFromSharedPrefs(Context context, @NonNull String str, boolean z) {
        if (context != null) {
            return context.getSharedPreferences("SHARED_PREFS", 0).getBoolean(str, z);
        }
        Log.e(Constants.LOG_TAG, "Context is null. Cannot fetch Boolean preferences");
        return false;
    }

    @SuppressLint({"DefaultLocale"})
    public static String getMediaTypeFromMimeType(@Nullable String str) {
        if (str != null) {
            return str.split("/")[0].toLowerCase();
        }
        Single$$ExternalSyntheticBUOutline0.m$3("mimeType is null");
        return null;
    }

    public static void writeBooleanPreferenceToSharedPrefs(Context context, @NonNull String str, boolean z) {
        if (context == null) {
            return;
        }
        context.getSharedPreferences("SHARED_PREFS", 0).edit().putBoolean(str, z).apply();
    }
}
