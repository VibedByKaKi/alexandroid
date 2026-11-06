package org.apache.commons.lang3;

import java.util.function.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class ArrayUtils$$ExternalSyntheticLambda4 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Class f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ ArrayUtils$$ExternalSyntheticLambda4(Class cls, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = cls;
        this.f$1 = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.$r8$classId) {
            case 0:
                return ArrayUtils.lambda$add$0(this.f$0, this.f$1);
            default:
                return ArrayUtils.lambda$subarray$8(this.f$0, this.f$1);
        }
    }
}
