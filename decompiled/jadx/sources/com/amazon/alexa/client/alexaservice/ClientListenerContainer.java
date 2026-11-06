package com.amazon.alexa.client.alexaservice;

import com.amazon.alexa.api.ExtendedClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ClientListenerContainer<T> implements Iterable<T> {
    protected final Object lock = new Object();
    private final Map<ExtendedClient, Set<T>> listeners = new HashMap();

    private Set<T> getListenersForClientInternal(ExtendedClient extendedClient) {
        return this.listeners.get(extendedClient) == null ? Collections.EMPTY_SET : this.listeners.get(extendedClient);
    }

    private void removeInternal(ExtendedClient extendedClient, T t) {
        Set<T> listenersForClientInternal = getListenersForClientInternal(extendedClient);
        if (listenersForClientInternal.size() == 1) {
            this.listeners.remove(extendedClient);
        } else {
            listenersForClientInternal.remove(t);
        }
    }

    public void addListenerForClient(ExtendedClient extendedClient, T t) {
        synchronized (this.lock) {
            try {
                if (!this.listeners.containsKey(extendedClient)) {
                    this.listeners.put(extendedClient, new HashSet());
                }
                this.listeners.get(extendedClient).add(t);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void clear() {
        synchronized (this.lock) {
            this.listeners.clear();
        }
    }

    public boolean containsListener(T t) {
        synchronized (this.lock) {
            try {
                Iterator<Set<T>> it2 = this.listeners.values().iterator();
                while (it2.hasNext()) {
                    if (it2.next().contains(t)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Set<T> getAllListeners() {
        HashSet hashSet;
        synchronized (this.lock) {
            try {
                hashSet = new HashSet();
                Iterator<Set<T>> it2 = this.listeners.values().iterator();
                while (it2.hasNext()) {
                    hashSet.addAll(it2.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashSet;
    }

    public ExtendedClient getClientForListener(T t) {
        synchronized (this.lock) {
            try {
                for (Map.Entry<ExtendedClient, Set<T>> entry : this.listeners.entrySet()) {
                    if (entry.getValue().contains(t)) {
                        return entry.getKey();
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Set<T> getListenersForClient(ExtendedClient extendedClient) {
        synchronized (this.lock) {
            try {
                if (this.listeners.get(extendedClient) == null) {
                    return Collections.EMPTY_SET;
                }
                return new HashSet(this.listeners.get(extendedClient));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isEmpty() {
        boolean z;
        synchronized (this.lock) {
            z = size() == 0;
        }
        return z;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        Iterator<T> it2;
        synchronized (this.lock) {
            it2 = getAllListeners().iterator();
        }
        return it2;
    }

    public ExtendedClient remove(T t) {
        ExtendedClient extendedClient;
        synchronized (this.lock) {
            try {
                Iterator<Map.Entry<ExtendedClient, Set<T>>> it2 = this.listeners.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        extendedClient = null;
                        break;
                    }
                    Map.Entry<ExtendedClient, Set<T>> next = it2.next();
                    if (next.getValue().contains(t)) {
                        extendedClient = next.getKey();
                        break;
                    }
                }
                if (extendedClient == null) {
                    return null;
                }
                removeInternal(extendedClient, t);
                return extendedClient;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Set<T> removeAllClientListeners(ExtendedClient extendedClient) {
        synchronized (this.lock) {
            try {
                if (this.listeners.get(extendedClient) == null) {
                    return Collections.EMPTY_SET;
                }
                return this.listeners.remove(extendedClient);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int size() {
        int size;
        synchronized (this.lock) {
            size = getAllListeners().size();
        }
        return size;
    }
}
