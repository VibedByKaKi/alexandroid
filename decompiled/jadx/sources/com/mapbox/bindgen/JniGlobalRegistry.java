package com.mapbox.bindgen;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class JniGlobalRegistry {
    private static final ConcurrentHashMap<Long, ObjectReferences> registry = new ConcurrentHashMap<>();

    @VisibleForTesting
    public static native void activate();

    @VisibleForTesting
    public static native void deactivate();

    public static void delete(long j, int i) {
        ConcurrentHashMap<Long, ObjectReferences> concurrentHashMap = registry;
        ObjectReferences objectReferences = concurrentHashMap.get(Long.valueOf(j));
        if (objectReferences != null && objectReferences.delete(i) <= 0) {
            synchronized (objectReferences) {
                try {
                    if (objectReferences.getReferenceCount() == 0) {
                        concurrentHashMap.remove(Long.valueOf(j), objectReferences);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Nullable
    public static Object get(long j, int i) {
        ObjectReferences objectReferences = registry.get(Long.valueOf(j));
        if (objectReferences == null) {
            return null;
        }
        Object obj = objectReferences.get(i);
        return obj instanceof WeakReference ? ((WeakReference) obj).get() : obj;
    }

    private static int newReference(long j, @NonNull Object obj) {
        ObjectReferences objectReferences = new ObjectReferences(obj);
        while (true) {
            ConcurrentHashMap<Long, ObjectReferences> concurrentHashMap = registry;
            ObjectReferences putIfAbsent = concurrentHashMap.putIfAbsent(Long.valueOf(j), objectReferences);
            if (putIfAbsent == null) {
                return 0;
            }
            synchronized (putIfAbsent) {
                try {
                    if (concurrentHashMap.get(Long.valueOf(j)) == putIfAbsent) {
                        return putIfAbsent.addAdditional(obj);
                    }
                } finally {
                }
            }
        }
    }

    public static int newStrongReference(long j, Object obj) {
        if (obj != null) {
            return newReference(j, obj);
        }
        return -1;
    }

    public static int newWeakReference(long j, Object obj) {
        if (obj != null) {
            return newReference(j, new WeakReference(obj));
        }
        return -1;
    }

    @VisibleForTesting
    public static int size() {
        return registry.size();
    }
}
