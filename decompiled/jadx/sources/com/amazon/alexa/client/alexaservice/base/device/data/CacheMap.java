package com.amazon.alexa.client.alexaservice.base.device.data;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class CacheMap<K, V> {
    private static final int DEFAULT_CACHE_SIZE = 3;
    private final int cacheSize;
    private final Map<K, V> internalMap;
    private final Deque<K> keys;

    public CacheMap(int i) {
        this.cacheSize = i;
        this.internalMap = new HashMap();
        this.keys = new LinkedList();
    }

    public synchronized void clear() {
        this.internalMap.clear();
        this.keys.clear();
    }

    public synchronized boolean contains(K k) {
        return this.internalMap.containsKey(k);
    }

    public synchronized V get(K k) {
        return this.internalMap.get(k);
    }

    public synchronized Map.Entry<K, V> getLastEntry() {
        K peekLast = this.keys.peekLast();
        for (Map.Entry<K, V> entry : this.internalMap.entrySet()) {
            if (entry.getKey().equals(peekLast)) {
                return entry;
            }
        }
        return null;
    }

    public synchronized void put(K k, V v) {
        try {
            if (this.keys.contains(k)) {
                this.keys.remove(k);
            }
            this.keys.add(k);
            this.internalMap.put(k, v);
            if (this.internalMap.size() > this.cacheSize) {
                this.internalMap.remove(this.keys.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public CacheMap() {
        this(3);
    }
}
