package org.apache.commons.lang3.function;

import java.lang.Throwable;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
/* loaded from: classes11.dex */
public interface FailableDoubleFunction<R, E extends Throwable> {
    public static final FailableDoubleFunction NOP = new Path$$ExternalSyntheticBUOutline0(13);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ Object lambda$static$0(double d) throws Throwable {
        return null;
    }

    static <R, E extends Throwable> FailableDoubleFunction<R, E> nop() {
        return NOP;
    }

    R apply(double d) throws Throwable;
}
