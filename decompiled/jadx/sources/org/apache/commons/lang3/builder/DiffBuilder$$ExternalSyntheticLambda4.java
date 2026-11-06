package org.apache.commons.lang3.builder;

import java.io.Serializable;
import org.apache.commons.lang3.builder.DiffBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class DiffBuilder$$ExternalSyntheticLambda4 implements DiffBuilder.SerializableSupplier, Serializable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ double f$0;

    public /* synthetic */ DiffBuilder$$ExternalSyntheticLambda4(double d, int i) {
        this.$r8$classId = i;
        this.f$0 = d;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        Double valueOf;
        Double valueOf2;
        switch (this.$r8$classId) {
            case 0:
                valueOf = Double.valueOf(this.f$0);
                return valueOf;
            default:
                valueOf2 = Double.valueOf(this.f$0);
                return valueOf2;
        }
    }
}
