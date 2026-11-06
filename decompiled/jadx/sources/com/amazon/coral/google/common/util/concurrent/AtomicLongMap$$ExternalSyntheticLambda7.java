package com.amazon.coral.google.common.util.concurrent;

import java.util.function.LongBinaryOperator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class AtomicLongMap$$ExternalSyntheticLambda7 implements LongBinaryOperator {
    @Override // java.util.function.LongBinaryOperator
    public final long applyAsLong(long j, long j2) {
        return Long.sum(j, j2);
    }
}
