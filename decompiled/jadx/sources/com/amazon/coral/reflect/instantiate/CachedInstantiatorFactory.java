package com.amazon.coral.reflect.instantiate;

import com.amazon.coral.reflect.Instantiator;
import com.amazon.coral.reflect.InstantiatorFactory;
import com.amazon.coral.reflect.Signature;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class CachedInstantiatorFactory implements InstantiatorFactory {
    private final ConcurrentMap<Signature<?>, Instantiator<?>> cache = new ConcurrentHashMap();
    private final InstantiatorFactory instantiatorFactory;

    public CachedInstantiatorFactory(InstantiatorFactory instantiatorFactory) {
        if (instantiatorFactory != null) {
            this.instantiatorFactory = instantiatorFactory;
        } else {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
    }

    @Override // com.amazon.coral.reflect.InstantiatorFactory
    public <T> Instantiator<T> newInstantiator(Class<T> cls, Class<?>... clsArr) {
        Signature<?> signature = new Signature<>(cls, clsArr);
        Instantiator<T> instantiator = (Instantiator) this.cache.get(signature);
        if (instantiator != null) {
            return instantiator;
        }
        Instantiator<T> newInstantiator = this.instantiatorFactory.newInstantiator(cls, clsArr);
        this.cache.putIfAbsent(signature, newInstantiator);
        return newInstantiator;
    }
}
