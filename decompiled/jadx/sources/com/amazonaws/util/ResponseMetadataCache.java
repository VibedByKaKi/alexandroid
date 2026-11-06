package com.amazonaws.util;

import com.amazonaws.ResponseMetadata;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ResponseMetadataCache {
    private final InternalCache internalCache;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InternalCache extends LinkedHashMap<Integer, ResponseMetadata> {
        private int maxSize;

        public InternalCache(int i) {
            super(i);
            this.maxSize = i;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<Integer, ResponseMetadata> entry) {
            return size() > this.maxSize;
        }
    }

    public ResponseMetadataCache(int i) {
        this.internalCache = new InternalCache(i);
    }

    public synchronized void add(Object obj, ResponseMetadata responseMetadata) {
        if (obj == null) {
            return;
        }
        this.internalCache.put(Integer.valueOf(System.identityHashCode(obj)), responseMetadata);
    }

    public ResponseMetadata get(Object obj) {
        return this.internalCache.get(Integer.valueOf(System.identityHashCode(obj)));
    }
}
