package com.google.firebase.components;

import com.amazon.alexa.metis.api.ChatData$$ExternalSyntheticOutline0;
import com.google.firebase.inject.Provider;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class LazySet<T> implements Provider<Set<T>> {
    private volatile Set<T> actualSet = null;
    private volatile Set<Provider<T>> providers = ChatData$$ExternalSyntheticOutline0.m();

    public LazySet(Collection<Provider<T>> collection) {
        this.providers.addAll(collection);
    }

    public static LazySet<?> fromCollection(Collection<Provider<?>> collection) {
        return new LazySet<>((Set) collection);
    }

    private synchronized void updateSet() {
        try {
            Iterator<Provider<T>> it2 = this.providers.iterator();
            while (it2.hasNext()) {
                this.actualSet.add(it2.next().get());
            }
            this.providers = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void add(Provider<T> provider) {
        try {
            if (this.actualSet == null) {
                this.providers.add(provider);
            } else {
                this.actualSet.add(provider.get());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.firebase.inject.Provider
    public Set<T> get() {
        if (this.actualSet == null) {
            synchronized (this) {
                try {
                    if (this.actualSet == null) {
                        this.actualSet = Collections.newSetFromMap(new ConcurrentHashMap());
                        updateSet();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.actualSet);
    }
}
