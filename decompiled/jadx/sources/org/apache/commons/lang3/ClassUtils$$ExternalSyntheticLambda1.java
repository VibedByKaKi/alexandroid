package org.apache.commons.lang3;

import java.util.List;
import java.util.function.BiConsumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class ClassUtils$$ExternalSyntheticLambda1 implements BiConsumer {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ClassUtils$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ClassUtils.lambda$static$1((Class) obj, (Class) obj2);
                break;
            default:
                ((List) obj).add(obj2);
                break;
        }
    }
}
