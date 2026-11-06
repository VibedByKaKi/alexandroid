package androidx.camera.camera2.internal.compat.workaround;

import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.core.impl.Quirks;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class AutoFlashAEModeDisabler {
    private final boolean mIsCrashWhenTakingPhotoWithAutoFlashAEModeQuirkEnabled;
    private final boolean mIsImageCaptureFailWithAutoFlashQuirkEnabled;

    public AutoFlashAEModeDisabler(@NonNull Quirks quirks) {
        this.mIsImageCaptureFailWithAutoFlashQuirkEnabled = quirks.contains(ImageCaptureFailWithAutoFlashQuirk.class);
        this.mIsCrashWhenTakingPhotoWithAutoFlashAEModeQuirkEnabled = DeviceQuirks.get(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
    }

    public int getCorrectedAeMode(int i) {
        if ((this.mIsImageCaptureFailWithAutoFlashQuirkEnabled || this.mIsCrashWhenTakingPhotoWithAutoFlashAEModeQuirkEnabled) && i == 2) {
            return 1;
        }
        return i;
    }
}
