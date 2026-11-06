package org.apache.commons.lang3.reflect;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import org.apache.commons.lang3.function.FailableBiConsumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class TypeUtils$$ExternalSyntheticLambda0 implements FailableBiConsumer {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ TypeUtils$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // org.apache.commons.lang3.function.FailableBiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                TypeUtils.lambda$static$0((Appendable) obj, (Type) obj2);
                break;
            case 1:
                FailableBiConsumer.lambda$static$0(obj, obj2);
                break;
            case 2:
                TypeUtils.lambda$static$1((Appendable) obj, (TypeVariable) obj2);
                break;
            default:
                TypeUtils.lambda$static$2((Appendable) obj, obj2);
                break;
        }
    }
}
