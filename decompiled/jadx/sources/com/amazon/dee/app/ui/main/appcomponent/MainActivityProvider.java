package com.amazon.dee.app.ui.main.appcomponent;

import android.app.Activity;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class MainActivityProvider {
    private static WeakReference<Activity> activityRef = new WeakReference<>(null);

    private MainActivityProvider() {
    }

    @Nullable
    public static Activity getMainActivity() {
        WeakReference<Activity> weakReference = activityRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void setCurrentActivity(Activity activity) {
        activityRef = new WeakReference<>(activity);
    }
}
