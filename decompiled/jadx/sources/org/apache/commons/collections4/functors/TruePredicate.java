package org.apache.commons.collections4.functors;

import java.io.Serializable;
import org.apache.commons.collections4.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class TruePredicate<T> implements Predicate<T>, Serializable {
    public static final Predicate INSTANCE = new TruePredicate();
    private static final long serialVersionUID = 3374767158756189740L;

    private TruePredicate() {
    }

    private Object readResolve() {
        return INSTANCE;
    }

    public static <T> Predicate<T> truePredicate() {
        return INSTANCE;
    }

    @Override // org.apache.commons.collections4.Predicate
    public boolean evaluate(T t) {
        return true;
    }
}
