package org.apache.commons.collections4.functors;

import java.io.Serializable;
import org.apache.commons.collections4.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class IdentityPredicate<T> implements Predicate<T>, Serializable {
    private static final long serialVersionUID = -89901658494523293L;
    private final T iValue;

    public IdentityPredicate(T t) {
        this.iValue = t;
    }

    public static <T> Predicate<T> identityPredicate(T t) {
        return t == null ? NullPredicate.nullPredicate() : new IdentityPredicate(t);
    }

    @Override // org.apache.commons.collections4.Predicate
    public boolean evaluate(T t) {
        return this.iValue == t;
    }

    public T getValue() {
        return this.iValue;
    }
}
