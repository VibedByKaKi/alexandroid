package androidx.core.app;

import android.app.ActivityManager;
import androidx.annotation.ReplaceWith;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final class ActivityManagerCompat {
    private ActivityManagerCompat() {
    }

    @ReplaceWith(expression = "activityManager.isLowRamDevice()")
    @Deprecated
    public static boolean isLowRamDevice(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }
}
