package androidx.camera.core.internal.compat.workaround;

import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import androidx.camera.core.internal.compat.quirk.DeviceQuirks;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class CaptureFailedRetryEnabler {
    private final CaptureFailedRetryQuirk mCaptureFailedRetryQuirk = (CaptureFailedRetryQuirk) DeviceQuirks.get(CaptureFailedRetryQuirk.class);

    public int getRetryCount() {
        CaptureFailedRetryQuirk captureFailedRetryQuirk = this.mCaptureFailedRetryQuirk;
        if (captureFailedRetryQuirk == null) {
            return 0;
        }
        return captureFailedRetryQuirk.getRetryCount();
    }
}
