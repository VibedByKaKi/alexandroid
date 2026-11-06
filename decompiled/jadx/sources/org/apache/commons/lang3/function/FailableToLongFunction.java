package org.apache.commons.lang3.function;

import java.lang.Throwable;
import org.bouncycastle.asn1.ocsp.CrlID$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
/* loaded from: classes11.dex */
public interface FailableToLongFunction<T, E extends Throwable> {
    public static final FailableToLongFunction NOP = new CrlID$$ExternalSyntheticBUOutline0(3);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ long lambda$static$0(Object obj) throws Throwable {
        return 0L;
    }

    static <T, E extends Throwable> FailableToLongFunction<T, E> nop() {
        return NOP;
    }

    long applyAsLong(T t) throws Throwable;
}
