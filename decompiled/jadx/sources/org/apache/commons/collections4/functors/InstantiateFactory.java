package org.apache.commons.collections4.functors;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.FunctorException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class InstantiateFactory<T> implements Factory<T> {
    private final Object[] iArgs;
    private final Class<T> iClassToInstantiate;
    private transient Constructor<T> iConstructor;
    private final Class<?>[] iParamTypes;

    public InstantiateFactory(Class<T> cls, Class<?>[] clsArr, Object[] objArr) {
        this.iConstructor = null;
        this.iClassToInstantiate = cls;
        this.iParamTypes = (Class[]) clsArr.clone();
        this.iArgs = (Object[]) objArr.clone();
        findConstructor();
    }

    private void findConstructor() {
        try {
            this.iConstructor = this.iClassToInstantiate.getConstructor(this.iParamTypes);
        } catch (NoSuchMethodException unused) {
            Single$$ExternalSyntheticBUOutline0.m$3("InstantiateFactory: The constructor must exist and be public ");
        }
    }

    public static <T> Factory<T> instantiateFactory(Class<T> cls, Class<?>[] clsArr, Object[] objArr) {
        if (cls == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Class to instantiate must not be null");
            return null;
        }
        if ((clsArr != null || objArr == null) && ((clsArr == null || objArr != null) && (clsArr == null || objArr == null || clsArr.length == objArr.length))) {
            return (clsArr == null || clsArr.length == 0) ? new InstantiateFactory(cls) : new InstantiateFactory(cls, clsArr, objArr);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Parameter types must match the arguments");
        return null;
    }

    @Override // org.apache.commons.collections4.Factory
    public T create() {
        if (this.iConstructor == null) {
            findConstructor();
        }
        try {
            return this.iConstructor.newInstance(this.iArgs);
        } catch (IllegalAccessException e) {
            throw new FunctorException("InstantiateFactory: Constructor must be public", e);
        } catch (InstantiationException e2) {
            throw new FunctorException("InstantiateFactory: InstantiationException", e2);
        } catch (InvocationTargetException e3) {
            throw new FunctorException("InstantiateFactory: Constructor threw an exception", e3);
        }
    }

    public InstantiateFactory(Class<T> cls) {
        this.iConstructor = null;
        this.iClassToInstantiate = cls;
        this.iParamTypes = null;
        this.iArgs = null;
        findConstructor();
    }
}
