package com.amazon.alexa.handsfree.settings.wakewordsettings.wakewordsettingstype;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class WakeWordSettingsThreadHelper {
    private static Handler handler = new Handler(Looper.getMainLooper());

    private WakeWordSettingsThreadHelper() {
        throw new UnsupportedOperationException();
    }

    public static void runOnUiThread(@NonNull Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }
}
