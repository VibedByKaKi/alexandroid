package org.junit.runners.model;

import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;
import org.junit.runners.model.FrameworkMember;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class FrameworkMember<T extends FrameworkMember<T>> implements Annotatable {
    public abstract Class<?> getDeclaringClass();

    public abstract int getModifiers();

    public abstract String getName();

    public abstract Class<?> getType();

    public boolean isPublic() {
        return Modifier.isPublic(getModifiers());
    }

    public boolean isShadowedBy(List<T> list) {
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            if (isShadowedBy((FrameworkMember<T>) it2.next())) {
                return true;
            }
        }
        return false;
    }

    public abstract boolean isShadowedBy(T t);

    public boolean isStatic() {
        return Modifier.isStatic(getModifiers());
    }
}
