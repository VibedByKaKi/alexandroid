package androidx.camera.core.streamsharing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.UseCaseConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class DynamicRangeUtils {
    private DynamicRangeUtils() {
    }

    @Nullable
    private static DynamicRange intersectDynamicRange(@NonNull List<DynamicRange> list) {
        if (list.isEmpty()) {
            return null;
        }
        DynamicRange dynamicRange = list.get(0);
        Integer valueOf = Integer.valueOf(dynamicRange.getEncoding());
        Integer valueOf2 = Integer.valueOf(dynamicRange.getBitDepth());
        for (int i = 1; i < list.size(); i++) {
            DynamicRange dynamicRange2 = list.get(i);
            valueOf = intersectDynamicRangeEncoding(valueOf, Integer.valueOf(dynamicRange2.getEncoding()));
            valueOf2 = intersectDynamicRangeBitDepth(valueOf2, Integer.valueOf(dynamicRange2.getBitDepth()));
            if (valueOf == null || valueOf2 == null) {
                return null;
            }
        }
        return new DynamicRange(valueOf.intValue(), valueOf2.intValue());
    }

    @Nullable
    private static Integer intersectDynamicRangeBitDepth(@NonNull Integer num, @NonNull Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (num2.equals(0) || num.equals(num2)) {
            return num;
        }
        return null;
    }

    @Nullable
    private static Integer intersectDynamicRangeEncoding(@NonNull Integer num, @NonNull Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (!num2.equals(0)) {
            if (num.equals(2) && !num2.equals(1)) {
                return num2;
            }
            if ((!num2.equals(2) || num.equals(1)) && !num.equals(num2)) {
                return null;
            }
        }
        return num;
    }

    @Nullable
    public static DynamicRange resolveDynamicRange(@NonNull Set<UseCaseConfig<?>> set) {
        ArrayList arrayList = new ArrayList();
        Iterator<UseCaseConfig<?>> it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getDynamicRange());
        }
        return intersectDynamicRange(arrayList);
    }
}
