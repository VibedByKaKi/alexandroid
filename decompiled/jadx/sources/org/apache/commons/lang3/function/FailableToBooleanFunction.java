package org.apache.commons.lang3.function;

import java.lang.Throwable;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
/* loaded from: classes11.dex */
public interface FailableToBooleanFunction<T, E extends Throwable> {
    public static final FailableToBooleanFunction NOP = new Path$$ExternalSyntheticBUOutline0(26);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean lambda$static$0(Object obj) throws Throwable {
        return false;
    }

    static <T, E extends Throwable> FailableToBooleanFunction<T, E> nop() {
        return NOP;
    }

    boolean applyAsBoolean(T t) throws Throwable;
}
