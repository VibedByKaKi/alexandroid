package com.amazon.alexa.accessory.notificationpublisher.utils;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class LRUHashMap<K, V> extends LinkedHashMap<K, V> {
    private int maxEntries;

    public LRUHashMap() {
        this(50);
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.maxEntries;
    }

    public void setMaxEntries(int i) {
        this.maxEntries = i;
    }

    public LRUHashMap(int i) {
        super(i);
        this.maxEntries = i;
    }
}
