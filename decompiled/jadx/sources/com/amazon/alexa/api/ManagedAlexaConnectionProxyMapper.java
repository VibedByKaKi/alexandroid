package com.amazon.alexa.api;

import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
abstract class ManagedAlexaConnectionProxyMapper<K, V> extends AlexaConnectionProxyMapper<K, V> {
    @Override // com.amazon.alexa.api.AlexaConnectionProxyMapper
    public void clear() {
        sync(new Runnable() { // from class: com.amazon.alexa.api.ManagedAlexaConnectionProxyMapper.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                for (Map.Entry entry : ManagedAlexaConnectionProxyMapper.this.entrySet()) {
                    ManagedAlexaConnectionProxyMapper.this.clearValue(entry.getKey(), entry.getValue());
                }
                ManagedAlexaConnectionProxyMapper.super.clear();
            }
        });
    }

    public abstract void clearValue(K k, V v);

    public abstract V createValueFor(K k);

    @Override // com.amazon.alexa.api.AlexaConnectionProxyMapper
    public V get(final K k) {
        return (V) sync(new Callable<V>() { // from class: com.amazon.alexa.api.ManagedAlexaConnectionProxyMapper.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public V call() {
                if (!ManagedAlexaConnectionProxyMapper.this.containsKey(k)) {
                    ManagedAlexaConnectionProxyMapper managedAlexaConnectionProxyMapper = ManagedAlexaConnectionProxyMapper.this;
                    Object obj = k;
                    managedAlexaConnectionProxyMapper.put(obj, managedAlexaConnectionProxyMapper.createValueFor(obj));
                }
                return (V) ManagedAlexaConnectionProxyMapper.super.get(k);
            }
        });
    }

    @Override // com.amazon.alexa.api.AlexaConnectionProxyMapper
    public V remove(final K k) {
        return (V) sync(new Callable<V>() { // from class: com.amazon.alexa.api.ManagedAlexaConnectionProxyMapper.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public V call() {
                V v = (V) ManagedAlexaConnectionProxyMapper.super.remove(k);
                ManagedAlexaConnectionProxyMapper.this.clearValue(k, v);
                return v;
            }
        });
    }
}
