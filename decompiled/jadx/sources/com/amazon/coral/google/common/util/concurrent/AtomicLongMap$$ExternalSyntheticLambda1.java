package com.amazon.coral.google.common.util.concurrent;

import java.util.function.LongBinaryOperator;
import java.util.function.LongUnaryOperator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class AtomicLongMap$$ExternalSyntheticLambda1 implements LongUnaryOperator {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LongBinaryOperator f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ AtomicLongMap$$ExternalSyntheticLambda1(LongBinaryOperator longBinaryOperator, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = longBinaryOperator;
        this.f$1 = j;
    }

    @Override // java.util.function.LongUnaryOperator
    public final long applyAsLong(long j) {
        long lambda$getAndAccumulate$3;
        long lambda$accumulateAndGet$2;
        switch (this.$r8$classId) {
            case 0:
                lambda$getAndAccumulate$3 = AtomicLongMap.lambda$getAndAccumulate$3(this.f$0, this.f$1, j);
                return lambda$getAndAccumulate$3;
            default:
                lambda$accumulateAndGet$2 = AtomicLongMap.lambda$accumulateAndGet$2(this.f$0, this.f$1, j);
                return lambda$accumulateAndGet$2;
        }
    }
}
