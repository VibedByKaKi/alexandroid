package org.apache.commons.lang3.builder;

import java.io.Serializable;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.builder.DiffBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class DiffBuilder$$ExternalSyntheticLambda31 implements DiffBuilder.SerializableSupplier, Serializable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean[] f$0;

    public /* synthetic */ DiffBuilder$$ExternalSyntheticLambda31(boolean[] zArr, int i) {
        this.$r8$classId = i;
        this.f$0 = zArr;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        Boolean[] object;
        Boolean[] object2;
        int i = this.$r8$classId;
        boolean[] zArr = this.f$0;
        switch (i) {
            case 0:
                object = ArrayUtils.toObject(zArr);
                return object;
            default:
                object2 = ArrayUtils.toObject(zArr);
                return object2;
        }
    }
}
