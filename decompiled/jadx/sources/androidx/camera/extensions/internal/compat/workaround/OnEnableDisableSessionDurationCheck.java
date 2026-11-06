package androidx.camera.extensions.internal.compat.workaround;

import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.Logger;
import androidx.camera.extensions.internal.compat.quirk.CrashWhenOnDisableTooSoon;
import androidx.camera.extensions.internal.compat.quirk.DeviceQuirks;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class OnEnableDisableSessionDurationCheck {

    @VisibleForTesting
    static final long MIN_DURATION_FOR_ENABLE_DISABLE_SESSION = 100;
    private static final String TAG = "OnEnableDisableSessionDurationCheck";
    private final boolean mEnabledMinimumDuration;
    private long mOnEnableSessionTimeStamp;

    public OnEnableDisableSessionDurationCheck() {
        this(DeviceQuirks.get(CrashWhenOnDisableTooSoon.class) != null);
    }

    private void ensureMinDurationAfterOnEnableSession() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.mOnEnableSessionTimeStamp;
        while (true) {
            long j2 = elapsedRealtime - j;
            if (j2 >= 100) {
                return;
            }
            long j3 = 100 - j2;
            try {
                Logger.d(TAG, "onDisableSession too soon, wait " + j3 + " ms");
                Thread.sleep(j3);
                elapsedRealtime = SystemClock.elapsedRealtime();
                j = this.mOnEnableSessionTimeStamp;
            } catch (InterruptedException unused) {
                Logger.e(TAG, "sleep interrupted");
                return;
            }
        }
    }

    public void onDisableSessionInvoked() {
        if (this.mEnabledMinimumDuration) {
            ensureMinDurationAfterOnEnableSession();
        }
    }

    public void onEnableSessionInvoked() {
        if (this.mEnabledMinimumDuration) {
            this.mOnEnableSessionTimeStamp = SystemClock.elapsedRealtime();
        }
    }

    @VisibleForTesting
    public OnEnableDisableSessionDurationCheck(boolean z) {
        this.mOnEnableSessionTimeStamp = 0L;
        this.mEnabledMinimumDuration = z;
    }
}
