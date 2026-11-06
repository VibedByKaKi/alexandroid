package com.google.common.primitives;

import com.amazon.coral.google.common.primitives.ImmutableIntArray;
import com.google.common.primitives.ImmutableIntArray;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class ImmutableIntArray$Builder$$ExternalSyntheticLambda0 implements IntConsumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ImmutableIntArray$Builder$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        int i2 = this.$r8$classId;
        Object obj = this.f$0;
        switch (i2) {
            case 0:
                ((ImmutableIntArray.Builder) obj).add(i);
                break;
            default:
                ((ImmutableIntArray.Builder) obj).add(i);
                break;
        }
    }
}
