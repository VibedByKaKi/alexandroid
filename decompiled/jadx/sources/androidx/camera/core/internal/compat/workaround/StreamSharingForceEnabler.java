package androidx.camera.core.internal.compat.workaround;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.UseCase;
import androidx.camera.core.internal.compat.quirk.DeviceQuirks;
import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import java.util.Collection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class StreamSharingForceEnabler {

    @Nullable
    private final ImageCaptureFailedForSpecificCombinationQuirk mSpecificCombinationQuirk = (ImageCaptureFailedForSpecificCombinationQuirk) DeviceQuirks.get(ImageCaptureFailedForSpecificCombinationQuirk.class);

    @Nullable
    private final PreviewGreenTintQuirk mPreviewGreenTintQuirk = (PreviewGreenTintQuirk) DeviceQuirks.get(PreviewGreenTintQuirk.class);

    public boolean shouldForceEnableStreamSharing(@NonNull String str, @NonNull Collection<UseCase> collection) {
        ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk = this.mSpecificCombinationQuirk;
        if (imageCaptureFailedForSpecificCombinationQuirk != null) {
            return imageCaptureFailedForSpecificCombinationQuirk.shouldForceEnableStreamSharing(str, collection);
        }
        if (this.mPreviewGreenTintQuirk != null) {
            return PreviewGreenTintQuirk.shouldForceEnableStreamSharing(str, collection);
        }
        return false;
    }
}
