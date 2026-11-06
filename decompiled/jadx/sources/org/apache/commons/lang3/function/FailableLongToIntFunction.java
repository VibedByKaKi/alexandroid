package org.apache.commons.lang3.function;

import java.lang.Throwable;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
/* loaded from: classes11.dex */
public interface FailableLongToIntFunction<E extends Throwable> {
    public static final FailableLongToIntFunction NOP = new Path$$ExternalSyntheticBUOutline0(22);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ int lambda$static$0(long j) throws Throwable {
        return 0;
    }

    static <E extends Throwable> FailableLongToIntFunction<E> nop() {
        return NOP;
    }

    int applyAsInt(long j) throws Throwable;
}
