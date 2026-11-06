package com.amazon.alexa.api;

import android.util.Log;
import com.amazon.alexa.utils.validation.Preconditions;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class AlexaConnectionProxyMapper<K, V> {
    private static final String TAG = "AlexaConnectionProxyMapper";
    private final Map<K, V> mapping = new ConcurrentHashMap();

    public void clear() {
        this.mapping.clear();
    }

    public final boolean containsKey(K k) {
        return this.mapping.containsKey(k);
    }

    public final Collection<Map.Entry<K, V>> entrySet() {
        return this.mapping.entrySet();
    }

    public V get(K k) {
        return this.mapping.get(k);
    }

    public final Set<K> keySet() {
        return this.mapping.keySet();
    }

    public final V put(K k, V v) {
        Preconditions.notNull(k, "key is null");
        Preconditions.notNull(v, "value is null");
        return this.mapping.put(k, v);
    }

    public V remove(K k) {
        return this.mapping.remove(k);
    }

    public final <T> T sync(Callable<T> callable) {
        T call;
        synchronized (this.mapping) {
            try {
                try {
                    call = callable.call();
                } catch (Exception unused) {
                    Log.e(TAG, "failed to finish operation");
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return call;
    }

    public final void sync(Runnable runnable) {
        synchronized (this.mapping) {
            runnable.run();
        }
    }
}
