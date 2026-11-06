package org.objenesis.instantiator.basic;

import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class AccessibleInstantiator<T> extends ConstructorInstantiator<T> {
    public AccessibleInstantiator(Class<T> cls) {
        super(cls);
        Constructor<T> constructor = this.constructor;
        if (constructor != null) {
            constructor.setAccessible(true);
        }
    }
}
