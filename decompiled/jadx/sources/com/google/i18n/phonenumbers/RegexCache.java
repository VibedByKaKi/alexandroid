package com.google.i18n.phonenumbers;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class RegexCache {
    private LRUCache<String, Pattern> cache;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class LRUCache<K, V> {
        private LinkedHashMap<K, V> map;
        private int size;

        public LRUCache(int i) {
            this.size = i;
            this.map = new LinkedHashMap<K, V>(ParcelCompat$$ExternalSyntheticOutline0.m(i, 4, 3, 1), 0.75f, true) { // from class: com.google.i18n.phonenumbers.RegexCache.LRUCache.1
                @Override // java.util.LinkedHashMap
                public boolean removeEldestEntry(Map.Entry<K, V> entry) {
                    return size() > LRUCache.this.size;
                }
            };
        }

        public synchronized boolean containsKey(K k) {
            return this.map.containsKey(k);
        }

        public synchronized V get(K k) {
            return this.map.get(k);
        }

        public synchronized void put(K k, V v) {
            this.map.put(k, v);
        }
    }

    public RegexCache(int i) {
        this.cache = new LRUCache<>(i);
    }

    public boolean containsRegex(String str) {
        return this.cache.containsKey(str);
    }

    public Pattern getPatternForRegex(String str) {
        Pattern pattern = this.cache.get(str);
        if (pattern != null) {
            return pattern;
        }
        Pattern compile = Pattern.compile(str);
        this.cache.put(str, compile);
        return compile;
    }
}
