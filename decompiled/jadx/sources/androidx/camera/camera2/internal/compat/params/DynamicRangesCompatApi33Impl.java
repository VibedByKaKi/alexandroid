package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.params.DynamicRangesCompat;
import androidx.camera.core.DynamicRange;
import androidx.core.util.Preconditions;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(33)
/* loaded from: classes.dex */
class DynamicRangesCompatApi33Impl implements DynamicRangesCompat.DynamicRangeProfilesCompatImpl {
    private final DynamicRangeProfiles mDynamicRangeProfiles;

    public DynamicRangesCompatApi33Impl(@NonNull Object obj) {
        this.mDynamicRangeProfiles = (DynamicRangeProfiles) obj;
    }

    @Nullable
    private Long dynamicRangeToFirstSupportedProfile(@NonNull DynamicRange dynamicRange) {
        return DynamicRangeConversions.dynamicRangeToFirstSupportedProfile(dynamicRange, this.mDynamicRangeProfiles);
    }

    @NonNull
    private static Set<DynamicRange> profileSetToDynamicRangeSet(@NonNull Set<Long> set) {
        if (set.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator<Long> it2 = set.iterator();
        while (it2.hasNext()) {
            hashSet.add(profileToDynamicRange(it2.next().longValue()));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @NonNull
    private static DynamicRange profileToDynamicRange(long j) {
        return (DynamicRange) Preconditions.checkNotNull(DynamicRangeConversions.profileToDynamicRange(j), "Dynamic range profile cannot be converted to a DynamicRange object: " + j);
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    @NonNull
    public Set<DynamicRange> getDynamicRangeCaptureRequestConstraints(@NonNull DynamicRange dynamicRange) {
        Long dynamicRangeToFirstSupportedProfile = dynamicRangeToFirstSupportedProfile(dynamicRange);
        Preconditions.checkArgument(dynamicRangeToFirstSupportedProfile != null, "DynamicRange is not supported: " + dynamicRange);
        return profileSetToDynamicRangeSet(this.mDynamicRangeProfiles.getProfileCaptureRequestConstraints(dynamicRangeToFirstSupportedProfile.longValue()));
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    @NonNull
    public Set<DynamicRange> getSupportedDynamicRanges() {
        return profileSetToDynamicRangeSet(this.mDynamicRangeProfiles.getSupportedProfiles());
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    public boolean isExtraLatencyPresent(@NonNull DynamicRange dynamicRange) {
        Long dynamicRangeToFirstSupportedProfile = dynamicRangeToFirstSupportedProfile(dynamicRange);
        Preconditions.checkArgument(dynamicRangeToFirstSupportedProfile != null, "DynamicRange is not supported: " + dynamicRange);
        return this.mDynamicRangeProfiles.isExtraLatencyPresent(dynamicRangeToFirstSupportedProfile.longValue());
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    @Nullable
    public DynamicRangeProfiles unwrap() {
        return this.mDynamicRangeProfiles;
    }
}
