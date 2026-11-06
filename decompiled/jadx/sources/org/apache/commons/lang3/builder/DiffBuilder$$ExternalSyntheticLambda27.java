package org.apache.commons.lang3.builder;

import java.io.Serializable;
import org.apache.commons.lang3.builder.DiffBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class DiffBuilder$$ExternalSyntheticLambda27 implements DiffBuilder.SerializableSupplier, Serializable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ DiffBuilder$$ExternalSyntheticLambda27(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        Object lambda$append$9e3d8e65$1;
        Object lambda$append$9e40489f$1;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                lambda$append$9e3d8e65$1 = DiffBuilder.lambda$append$9e3d8e65$1(obj);
                return lambda$append$9e3d8e65$1;
            default:
                lambda$append$9e40489f$1 = DiffBuilder.lambda$append$9e40489f$1(obj);
                return lambda$append$9e40489f$1;
        }
    }
}
