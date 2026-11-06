package com.mapbox.bindgen;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class HashMapKeyValueExtractor {

    @NonNull
    private final Object[] keys;

    @NonNull
    private final Object[] values;

    public HashMapKeyValueExtractor(@NonNull HashMap<Object, Object> hashMap) {
        Set<Object> keySet = hashMap.keySet();
        int size = keySet.size();
        this.keys = new Object[size];
        this.values = new Object[size];
        int i = 0;
        for (Object obj : keySet) {
            this.keys[i] = obj;
            this.values[i] = hashMap.get(obj);
            i++;
        }
    }

    @NonNull
    public Object[] getKeys() {
        return this.keys;
    }

    @NonNull
    public Object[] getValues() {
        return this.values;
    }
}
