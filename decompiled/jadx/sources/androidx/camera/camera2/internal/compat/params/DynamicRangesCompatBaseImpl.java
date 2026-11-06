package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.compat.params.DynamicRangesCompat;
import androidx.camera.core.DynamicRange;
import androidx.core.util.Preconditions;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
class DynamicRangesCompatBaseImpl implements DynamicRangesCompat.DynamicRangeProfilesCompatImpl {
    static final DynamicRangesCompat COMPAT_INSTANCE = new DynamicRangesCompat(new DynamicRangesCompatBaseImpl());
    private static final Set<DynamicRange> SDR_ONLY = Collections.singleton(DynamicRange.SDR);

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    @NonNull
    public Set<DynamicRange> getDynamicRangeCaptureRequestConstraints(@NonNull DynamicRange dynamicRange) {
        Preconditions.checkArgument(DynamicRange.SDR.equals(dynamicRange), "DynamicRange is not supported: " + dynamicRange);
        return SDR_ONLY;
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    @NonNull
    public Set<DynamicRange> getSupportedDynamicRanges() {
        return SDR_ONLY;
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    public boolean isExtraLatencyPresent(@NonNull DynamicRange dynamicRange) {
        Preconditions.checkArgument(DynamicRange.SDR.equals(dynamicRange), "DynamicRange is not supported: " + dynamicRange);
        return false;
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    @Nullable
    public DynamicRangeProfiles unwrap() {
        return null;
    }
}
