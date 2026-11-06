package org.apache.commons.lang3.function;

import java.util.function.Predicate;
import org.openjdk.tools.sjavac.Main$$ExternalSyntheticLambda0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class Predicates {
    private static final Predicate<?> TRUE = new Main$$ExternalSyntheticLambda0(3);
    private static final Predicate<?> FALSE = new Main$$ExternalSyntheticLambda0(4);

    private Predicates() {
    }

    public static <T> Predicate<T> falsePredicate() {
        return (Predicate<T>) FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$0(Object obj) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$1(Object obj) {
        return false;
    }

    public static <T> Predicate<T> truePredicate() {
        return (Predicate<T>) TRUE;
    }
}
