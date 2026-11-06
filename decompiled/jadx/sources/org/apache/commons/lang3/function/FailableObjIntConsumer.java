package org.apache.commons.lang3.function;

import java.lang.Throwable;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
/* loaded from: classes11.dex */
public interface FailableObjIntConsumer<T, E extends Throwable> {
    public static final FailableObjIntConsumer NOP = new Path$$ExternalSyntheticBUOutline0(24);

    static <T, E extends Throwable> FailableObjIntConsumer<T, E> nop() {
        return NOP;
    }

    void accept(T t, int i) throws Throwable;

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$static$0(Object obj, int i) throws Throwable {
    }
}
