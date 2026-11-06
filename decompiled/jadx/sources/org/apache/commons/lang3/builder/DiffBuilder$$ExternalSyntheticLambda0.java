package org.apache.commons.lang3.builder;

import java.io.Serializable;
import org.apache.commons.lang3.builder.DiffBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class DiffBuilder$$ExternalSyntheticLambda0 implements DiffBuilder.SerializableSupplier, Serializable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object[] f$0;

    public /* synthetic */ DiffBuilder$$ExternalSyntheticLambda0(Object[] objArr, int i) {
        this.$r8$classId = i;
        this.f$0 = objArr;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        Object[] lambda$append$dbd51caa$1;
        Object[] lambda$append$dbd7d6e4$1;
        int i = this.$r8$classId;
        Object[] objArr = this.f$0;
        switch (i) {
            case 0:
                lambda$append$dbd51caa$1 = DiffBuilder.lambda$append$dbd51caa$1(objArr);
                return lambda$append$dbd51caa$1;
            default:
                lambda$append$dbd7d6e4$1 = DiffBuilder.lambda$append$dbd7d6e4$1(objArr);
                return lambda$append$dbd7d6e4$1;
        }
    }
}
