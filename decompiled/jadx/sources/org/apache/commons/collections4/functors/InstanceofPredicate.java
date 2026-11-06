package org.apache.commons.collections4.functors;

import java.io.Serializable;
import org.apache.commons.collections4.Predicate;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class InstanceofPredicate implements Predicate<Object>, Serializable {
    private static final long serialVersionUID = -6682656911025165584L;
    private final Class<?> iType;

    public InstanceofPredicate(Class<?> cls) {
        this.iType = cls;
    }

    public static Predicate<Object> instanceOfPredicate(Class<?> cls) {
        if (cls != null) {
            return new InstanceofPredicate(cls);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("The type to check instanceof must not be null");
        return null;
    }

    @Override // org.apache.commons.collections4.Predicate
    public boolean evaluate(Object obj) {
        return this.iType.isInstance(obj);
    }

    public Class<?> getType() {
        return this.iType;
    }
}
