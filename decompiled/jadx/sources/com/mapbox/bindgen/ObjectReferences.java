package com.mapbox.bindgen;

import androidx.annotation.NonNull;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class ObjectReferences {
    private static final AtomicReferenceFieldUpdater<ObjectReferences, Object> MAIN_REF_UPDATER = AtomicReferenceFieldUpdater.newUpdater(ObjectReferences.class, Object.class, "mainReference");
    private static final AtomicIntegerFieldUpdater<ObjectReferences> REF_COUNT_UPDATER = AtomicIntegerFieldUpdater.newUpdater(ObjectReferences.class, "referenceCount");
    private volatile Object mainReference;
    private volatile int referenceCount = 1;
    private volatile ConcurrentHashMap<Integer, Object> additionalReferences = null;

    public ObjectReferences(@NonNull Object obj) {
        this.mainReference = obj;
    }

    private int deleteAdditionalReference(int i) {
        ConcurrentHashMap<Integer, Object> concurrentHashMap = this.additionalReferences;
        return concurrentHashMap == null ? this.referenceCount : concurrentHashMap.remove(Integer.valueOf(i)) != null ? REF_COUNT_UPDATER.decrementAndGet(this) : this.referenceCount;
    }

    private int deleteMainReference() {
        return MAIN_REF_UPDATER.getAndSet(this, null) != null ? REF_COUNT_UPDATER.decrementAndGet(this) : this.referenceCount;
    }

    public int addAdditional(@NonNull Object obj) {
        REF_COUNT_UPDATER.incrementAndGet(this);
        ConcurrentHashMap<Integer, Object> concurrentHashMap = this.additionalReferences;
        if (concurrentHashMap == null) {
            synchronized (this) {
                try {
                    concurrentHashMap = this.additionalReferences;
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap<>();
                        this.additionalReferences = concurrentHashMap;
                    }
                } finally {
                }
            }
        }
        int size = concurrentHashMap.size();
        do {
            size++;
        } while (concurrentHashMap.putIfAbsent(Integer.valueOf(size), obj) != null);
        return size;
    }

    public int delete(int i) {
        return i == 0 ? deleteMainReference() : deleteAdditionalReference(i);
    }

    public Object get(int i) {
        if (i == 0) {
            return this.mainReference;
        }
        ConcurrentHashMap<Integer, Object> concurrentHashMap = this.additionalReferences;
        if (i < 0 || concurrentHashMap == null) {
            return null;
        }
        return concurrentHashMap.get(Integer.valueOf(i));
    }

    public int getReferenceCount() {
        return this.referenceCount;
    }
}
