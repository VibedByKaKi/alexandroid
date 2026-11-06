package com.amazon.coral.google.common.util.concurrent;

import com.amazon.coral.google.common.base.Supplier;
import java.util.concurrent.Semaphore;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class Striped$$ExternalSyntheticLambda0 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;

    public /* synthetic */ Striped$$ExternalSyntheticLambda0(int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
    }

    @Override // com.amazon.coral.google.common.base.Supplier, java.util.function.Supplier
    public final Object get() {
        Semaphore lambda$semaphore$1;
        Semaphore lambda$lazyWeakSemaphore$2;
        int i = this.$r8$classId;
        int i2 = this.f$0;
        switch (i) {
            case 0:
                lambda$semaphore$1 = Striped.lambda$semaphore$1(i2);
                return lambda$semaphore$1;
            default:
                lambda$lazyWeakSemaphore$2 = Striped.lambda$lazyWeakSemaphore$2(i2);
                return lambda$lazyWeakSemaphore$2;
        }
    }
}
