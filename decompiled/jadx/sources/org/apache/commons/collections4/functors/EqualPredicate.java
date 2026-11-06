package org.apache.commons.collections4.functors;

import java.io.Serializable;
import org.apache.commons.collections4.Equator;
import org.apache.commons.collections4.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class EqualPredicate<T> implements Predicate<T>, Serializable {
    private static final long serialVersionUID = 5633766978029907089L;
    private final Equator<T> equator;
    private final T iValue;

    public EqualPredicate(T t, Equator<T> equator) {
        this.iValue = t;
        this.equator = equator;
    }

    public static <T> Predicate<T> equalPredicate(T t) {
        return t == null ? NullPredicate.nullPredicate() : new EqualPredicate(t);
    }

    @Override // org.apache.commons.collections4.Predicate
    public boolean evaluate(T t) {
        Equator<T> equator = this.equator;
        T t2 = this.iValue;
        return equator != null ? equator.equate(t2, t) : t2.equals(t);
    }

    public Object getValue() {
        return this.iValue;
    }

    public EqualPredicate(T t) {
        this(t, null);
    }

    public static <T> Predicate<T> equalPredicate(T t, Equator<T> equator) {
        if (t == null) {
            return NullPredicate.nullPredicate();
        }
        return new EqualPredicate(t, equator);
    }
}
