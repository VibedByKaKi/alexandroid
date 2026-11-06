package androidx.camera.core.impl;

import androidx.camera.core.CameraFilter;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class CameraFilters {
    public static final CameraFilter ANY;
    public static final CameraFilter NONE;

    static {
        final int i = 0;
        ANY = new CameraFilter() { // from class: androidx.camera.core.impl.CameraFilters$$ExternalSyntheticLambda0
            @Override // androidx.camera.core.CameraFilter
            public final List filter(List list) {
                List lambda$static$0;
                List lambda$static$1;
                switch (i) {
                    case 0:
                        lambda$static$0 = CameraFilters.lambda$static$0(list);
                        return lambda$static$0;
                    default:
                        lambda$static$1 = CameraFilters.lambda$static$1(list);
                        return lambda$static$1;
                }
            }
        };
        final int i2 = 1;
        NONE = new CameraFilter() { // from class: androidx.camera.core.impl.CameraFilters$$ExternalSyntheticLambda0
            @Override // androidx.camera.core.CameraFilter
            public final List filter(List list) {
                List lambda$static$0;
                List lambda$static$1;
                switch (i2) {
                    case 0:
                        lambda$static$0 = CameraFilters.lambda$static$0(list);
                        return lambda$static$0;
                    default:
                        lambda$static$1 = CameraFilters.lambda$static$1(list);
                        return lambda$static$1;
                }
            }
        };
    }

    private CameraFilters() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$static$1(List list) {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$static$0(List list) {
        return list;
    }
}
