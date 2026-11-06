package androidx.camera.camera2.internal.compat.workaround;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.core.MeteringPoint;
import androidx.camera.core.impl.Quirks;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class MeteringRegionCorrection {
    private final Quirks mCameraQuirks;

    public MeteringRegionCorrection(@NonNull Quirks quirks) {
        this.mCameraQuirks = quirks;
    }

    @NonNull
    public PointF getCorrectedPoint(@NonNull MeteringPoint meteringPoint, int i) {
        return (i == 1 && this.mCameraQuirks.contains(AfRegionFlipHorizontallyQuirk.class)) ? new PointF(1.0f - meteringPoint.getX(), meteringPoint.getY()) : new PointF(meteringPoint.getX(), meteringPoint.getY());
    }
}
