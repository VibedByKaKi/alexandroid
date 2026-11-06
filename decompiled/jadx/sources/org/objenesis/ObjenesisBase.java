package org.objenesis;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.concurrent.ConcurrentHashMap;
import org.objenesis.instantiator.ObjectInstantiator;
import org.objenesis.strategy.InstantiatorStrategy;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ObjenesisBase implements Objenesis {
    protected ConcurrentHashMap<String, ObjectInstantiator<?>> cache;
    protected final InstantiatorStrategy strategy;

    public ObjenesisBase(InstantiatorStrategy instantiatorStrategy, boolean z) {
        if (instantiatorStrategy == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("A strategy can't be null");
            throw null;
        }
        this.strategy = instantiatorStrategy;
        this.cache = z ? new ConcurrentHashMap<>() : null;
    }

    @Override // org.objenesis.Objenesis
    public <T> ObjectInstantiator<T> getInstantiatorOf(Class<T> cls) {
        ConcurrentHashMap<String, ObjectInstantiator<?>> concurrentHashMap = this.cache;
        if (concurrentHashMap == null) {
            return this.strategy.newInstantiatorOf(cls);
        }
        ObjectInstantiator<T> objectInstantiator = (ObjectInstantiator) concurrentHashMap.get(cls.getName());
        if (objectInstantiator != null) {
            return objectInstantiator;
        }
        ObjectInstantiator<T> newInstantiatorOf = this.strategy.newInstantiatorOf(cls);
        ObjectInstantiator<T> objectInstantiator2 = (ObjectInstantiator) this.cache.putIfAbsent(cls.getName(), newInstantiatorOf);
        return objectInstantiator2 == null ? newInstantiatorOf : objectInstantiator2;
    }

    @Override // org.objenesis.Objenesis
    public <T> T newInstance(Class<T> cls) {
        return getInstantiatorOf(cls).newInstance();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(" using ");
        sb.append(this.strategy.getClass().getName());
        return a$$ExternalSyntheticOutline0.m(sb, this.cache == null ? " without" : " with", " caching");
    }

    public ObjenesisBase(InstantiatorStrategy instantiatorStrategy) {
        this(instantiatorStrategy, true);
    }
}
