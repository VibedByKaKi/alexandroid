package org.apache.commons.lang3.function;

import java.lang.Throwable;
import org.bouncycastle.asn1.ocsp.CrlID$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
/* loaded from: classes11.dex */
public interface FailableToLongBiFunction<T, U, E extends Throwable> {
    public static final FailableToLongBiFunction NOP = new CrlID$$ExternalSyntheticBUOutline0(2);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ long lambda$static$0(Object obj, Object obj2) throws Throwable {
        return 0L;
    }

    static <T, U, E extends Throwable> FailableToLongBiFunction<T, U, E> nop() {
        return NOP;
    }

    long applyAsLong(T t, U u) throws Throwable;
}
