package androidx.camera.camera2.internal.compat.workaround;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.Quirks;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class ForceCloseDeferrableSurface {
    private final boolean mHasConfigureSurfaceToSecondarySessionFailQuirk;
    private final boolean mHasPreviewOrientationIncorrectQuirk;
    private final boolean mHasTextureViewIsClosedQuirk;

    public ForceCloseDeferrableSurface(@NonNull Quirks quirks, @NonNull Quirks quirks2) {
        this.mHasTextureViewIsClosedQuirk = quirks2.contains(TextureViewIsClosedQuirk.class);
        this.mHasPreviewOrientationIncorrectQuirk = quirks.contains(PreviewOrientationIncorrectQuirk.class);
        this.mHasConfigureSurfaceToSecondarySessionFailQuirk = quirks.contains(ConfigureSurfaceToSecondarySessionFailQuirk.class);
    }

    public void onSessionEnd(@Nullable List<DeferrableSurface> list) {
        if (!shouldForceClose() || list == null) {
            return;
        }
        Iterator<DeferrableSurface> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().close();
        }
        Logger.d("ForceCloseDeferrableSurface", "deferrableSurface closed");
    }

    public boolean shouldForceClose() {
        return this.mHasTextureViewIsClosedQuirk || this.mHasPreviewOrientationIncorrectQuirk || this.mHasConfigureSurfaceToSecondarySessionFailQuirk;
    }
}
