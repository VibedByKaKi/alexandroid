package com.amazon.coral.google.common.util.concurrent;

import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleUnaryOperator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class AtomicDouble$$ExternalSyntheticLambda0 implements DoubleUnaryOperator {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DoubleBinaryOperator f$0;
    public final /* synthetic */ double f$1;

    public /* synthetic */ AtomicDouble$$ExternalSyntheticLambda0(int i, double d, DoubleBinaryOperator doubleBinaryOperator) {
        this.$r8$classId = i;
        this.f$0 = doubleBinaryOperator;
        this.f$1 = d;
    }

    @Override // java.util.function.DoubleUnaryOperator
    public final double applyAsDouble(double d) {
        double lambda$accumulateAndGet$1;
        double lambda$getAndAccumulate$0;
        double lambda$getAndAccumulate$02;
        double lambda$accumulateAndGet$12;
        switch (this.$r8$classId) {
            case 0:
                lambda$accumulateAndGet$1 = AtomicDouble.lambda$accumulateAndGet$1(this.f$0, this.f$1, d);
                return lambda$accumulateAndGet$1;
            case 1:
                lambda$getAndAccumulate$0 = AtomicDouble.lambda$getAndAccumulate$0(this.f$0, this.f$1, d);
                return lambda$getAndAccumulate$0;
            case 2:
                lambda$getAndAccumulate$02 = AtomicDoubleArray.lambda$getAndAccumulate$0(this.f$0, this.f$1, d);
                return lambda$getAndAccumulate$02;
            default:
                lambda$accumulateAndGet$12 = AtomicDoubleArray.lambda$accumulateAndGet$1(this.f$0, this.f$1, d);
                return lambda$accumulateAndGet$12;
        }
    }
}
