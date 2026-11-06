package org.apache.commons.lang3;

import java.util.Comparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class ClassUtils$$ExternalSyntheticLambda0 implements Comparator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ClassUtils$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$static$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$static$0 = ClassUtils.lambda$static$0((Class) obj, (Class) obj2);
                return lambda$static$0;
            case 1:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            default:
                return ((String) obj).compareTo((String) obj2);
        }
    }
}
