package com.amazon.coral.google.common.util.concurrent;

import java.util.function.DoubleBinaryOperator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class AtomicDouble$$ExternalSyntheticLambda1 implements DoubleBinaryOperator {
    @Override // java.util.function.DoubleBinaryOperator
    public final double applyAsDouble(double d, double d2) {
        return Double.sum(d, d2);
    }
}
