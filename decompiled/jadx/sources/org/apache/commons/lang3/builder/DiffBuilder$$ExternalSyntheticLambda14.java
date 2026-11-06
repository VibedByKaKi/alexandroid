package org.apache.commons.lang3.builder;

import java.io.Serializable;
import org.apache.commons.lang3.builder.DiffBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class DiffBuilder$$ExternalSyntheticLambda14 implements DiffBuilder.SerializableSupplier, Serializable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;

    public /* synthetic */ DiffBuilder$$ExternalSyntheticLambda14(boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = z;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        Boolean valueOf;
        Boolean valueOf2;
        int i = this.$r8$classId;
        boolean z = this.f$0;
        switch (i) {
            case 0:
                valueOf = Boolean.valueOf(z);
                return valueOf;
            default:
                valueOf2 = Boolean.valueOf(z);
                return valueOf2;
        }
    }
}
