package com.google.common.primitives;

import com.amazon.coral.google.common.primitives.ImmutableDoubleArray;
import com.google.common.primitives.ImmutableDoubleArray;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class ImmutableDoubleArray$Builder$$ExternalSyntheticLambda0 implements DoubleConsumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ImmutableDoubleArray$Builder$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((ImmutableDoubleArray.Builder) obj).add(d);
                break;
            default:
                ((ImmutableDoubleArray.Builder) obj).add(d);
                break;
        }
    }
}
