package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
/* loaded from: classes11.dex */
public interface FailableDoubleBinaryOperator<E extends Throwable> {
    double applyAsDouble(double d, double d2) throws Throwable;
}
