package org.apache.commons.lang3.function;

import java.lang.Throwable;
import org.bouncycastle.asn1.ocsp.CrlID$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
/* loaded from: classes11.dex */
public interface FailableToIntFunction<T, E extends Throwable> {
    public static final FailableToIntFunction NOP = new CrlID$$ExternalSyntheticBUOutline0(1);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ int lambda$static$0(Object obj) throws Throwable {
        return 0;
    }

    static <T, E extends Throwable> FailableToIntFunction<T, E> nop() {
        return NOP;
    }

    int applyAsInt(T t) throws Throwable;
}
