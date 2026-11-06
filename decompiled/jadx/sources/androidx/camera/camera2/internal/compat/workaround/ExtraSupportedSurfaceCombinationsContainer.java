package androidx.camera.camera2.internal.compat.workaround;

import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.core.impl.SurfaceCombination;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class ExtraSupportedSurfaceCombinationsContainer {
    private final ExtraSupportedSurfaceCombinationsQuirk mQuirk = (ExtraSupportedSurfaceCombinationsQuirk) DeviceQuirks.get(ExtraSupportedSurfaceCombinationsQuirk.class);

    @NonNull
    public List<SurfaceCombination> get(@NonNull String str) {
        ExtraSupportedSurfaceCombinationsQuirk extraSupportedSurfaceCombinationsQuirk = this.mQuirk;
        return extraSupportedSurfaceCombinationsQuirk == null ? new ArrayList() : extraSupportedSurfaceCombinationsQuirk.getExtraSupportedSurfaceCombinations(str);
    }
}
