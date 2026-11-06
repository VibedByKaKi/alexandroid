package org.apache.commons.lang3.function;

import java.lang.Throwable;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
/* loaded from: classes11.dex */
public interface FailableLongToDoubleFunction<E extends Throwable> {
    public static final FailableLongToDoubleFunction NOP = new Path$$ExternalSyntheticBUOutline0(21);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ double lambda$static$0(long j) throws Throwable {
        return 0.0d;
    }

    static <E extends Throwable> FailableLongToDoubleFunction<E> nop() {
        return NOP;
    }

    double applyAsDouble(long j) throws Throwable;
}
