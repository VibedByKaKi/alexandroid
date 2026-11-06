package org.apache.commons.lang3.function;

import com.google.common.math.Stats$$ExternalSyntheticLambda0;
import java.util.function.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class Suppliers {
    private static Supplier NUL = new Stats$$ExternalSyntheticLambda0(24);

    @Deprecated
    public Suppliers() {
    }

    public static <T> T get(Supplier<T> supplier) {
        if (supplier == null) {
            return null;
        }
        return supplier.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$static$0() {
        return null;
    }

    public static <T> Supplier<T> nul() {
        return NUL;
    }
}
