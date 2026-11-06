package org.apache.commons.lang3.builder;

import java.io.Serializable;
import org.apache.commons.lang3.builder.DiffBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class DiffBuilder$$ExternalSyntheticLambda8 implements DiffBuilder.SerializableSupplier, Serializable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ short f$0;

    public /* synthetic */ DiffBuilder$$ExternalSyntheticLambda8(short s, int i) {
        this.$r8$classId = i;
        this.f$0 = s;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        Short valueOf;
        Short valueOf2;
        int i = this.$r8$classId;
        short s = this.f$0;
        switch (i) {
            case 0:
                valueOf = Short.valueOf(s);
                return valueOf;
            default:
                valueOf2 = Short.valueOf(s);
                return valueOf2;
        }
    }
}
