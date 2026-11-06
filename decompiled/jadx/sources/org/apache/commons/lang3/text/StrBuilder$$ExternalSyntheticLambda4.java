package org.apache.commons.lang3.text;

import java.util.function.Supplier;
import org.apache.commons.lang3.reflect.MethodUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class StrBuilder$$ExternalSyntheticLambda4 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;

    public /* synthetic */ StrBuilder$$ExternalSyntheticLambda4(int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        Object[] lambda$toVarArgs$0;
        int i = this.$r8$classId;
        int i2 = this.f$0;
        switch (i) {
            case 0:
                return StrBuilder.lambda$ensureCapacity$0(i2);
            default:
                lambda$toVarArgs$0 = MethodUtils.lambda$toVarArgs$0(i2);
                return lambda$toVarArgs$0;
        }
    }
}
