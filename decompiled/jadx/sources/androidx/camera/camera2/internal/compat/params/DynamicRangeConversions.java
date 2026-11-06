package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.DynamicRange;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(33)
/* loaded from: classes.dex */
public final class DynamicRangeConversions {
    private static final Map<DynamicRange, List<Long>> DR_TO_PROFILE_MAP;
    private static final Map<Long, DynamicRange> PROFILE_TO_DR_MAP;

    static {
        HashMap hashMap = new HashMap();
        PROFILE_TO_DR_MAP = hashMap;
        HashMap hashMap2 = new HashMap();
        DR_TO_PROFILE_MAP = hashMap2;
        DynamicRange dynamicRange = DynamicRange.SDR;
        hashMap.put(1L, dynamicRange);
        hashMap2.put(dynamicRange, Collections.singletonList(1L));
        hashMap.put(2L, DynamicRange.HLG_10_BIT);
        hashMap2.put((DynamicRange) hashMap.get(2L), Collections.singletonList(2L));
        DynamicRange dynamicRange2 = DynamicRange.HDR10_10_BIT;
        hashMap.put(4L, dynamicRange2);
        hashMap2.put(dynamicRange2, Collections.singletonList(4L));
        DynamicRange dynamicRange3 = DynamicRange.HDR10_PLUS_10_BIT;
        hashMap.put(8L, dynamicRange3);
        hashMap2.put(dynamicRange3, Collections.singletonList(8L));
        List<Long> asList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator<Long> it2 = asList.iterator();
        while (it2.hasNext()) {
            PROFILE_TO_DR_MAP.put(it2.next(), DynamicRange.DOLBY_VISION_10_BIT);
        }
        DR_TO_PROFILE_MAP.put(DynamicRange.DOLBY_VISION_10_BIT, asList);
        List<Long> asList2 = Arrays.asList(1024L, 2048L, 256L, 512L);
        Iterator<Long> it3 = asList2.iterator();
        while (it3.hasNext()) {
            PROFILE_TO_DR_MAP.put(it3.next(), DynamicRange.DOLBY_VISION_8_BIT);
        }
        DR_TO_PROFILE_MAP.put(DynamicRange.DOLBY_VISION_8_BIT, asList2);
    }

    private DynamicRangeConversions() {
    }

    @Nullable
    public static Long dynamicRangeToFirstSupportedProfile(@NonNull DynamicRange dynamicRange, @NonNull DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = DR_TO_PROFILE_MAP.get(dynamicRange);
        if (list == null) {
            return null;
        }
        Set<Long> supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l : list) {
            if (supportedProfiles.contains(l)) {
                return l;
            }
        }
        return null;
    }

    @Nullable
    public static DynamicRange profileToDynamicRange(long j) {
        return PROFILE_TO_DR_MAP.get(Long.valueOf(j));
    }
}
