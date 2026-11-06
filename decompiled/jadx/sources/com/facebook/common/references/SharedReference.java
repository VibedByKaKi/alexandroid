package com.facebook.common.references;

import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.FalseOnNull;
import com.facebook.infer.annotation.Nullsafe;
import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class SharedReference<T> {

    @GuardedBy("itself")
    private static final Map<Object, Integer> sLiveObjects = new IdentityHashMap();

    @GuardedBy("this")
    private int mRefCount;

    @Nullable
    private final ResourceReleaser<T> mResourceReleaser;

    @GuardedBy("this")
    @Nullable
    private T mValue;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class NullReferenceException extends RuntimeException {
        public NullReferenceException() {
            super("Null shared reference");
        }
    }

    public SharedReference(T t, @Nullable ResourceReleaser<T> resourceReleaser, boolean z) {
        this.mValue = (T) Preconditions.checkNotNull(t);
        this.mResourceReleaser = resourceReleaser;
        this.mRefCount = 1;
        if (z) {
            addLiveReference(t);
        }
    }

    private static void addLiveReference(Object obj) {
        Map<Object, Integer> map = sLiveObjects;
        synchronized (map) {
            try {
                Integer num = map.get(obj);
                if (num == null) {
                    map.put(obj, 1);
                } else {
                    map.put(obj, Integer.valueOf(num.intValue() + 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized int decreaseRefCount() {
        int i;
        ensureValid();
        Preconditions.checkArgument(Boolean.valueOf(this.mRefCount > 0));
        i = this.mRefCount - 1;
        this.mRefCount = i;
        return i;
    }

    private void ensureValid() {
        if (!isValid(this)) {
            throw new NullReferenceException();
        }
    }

    private static void removeLiveReference(Object obj) {
        Map<Object, Integer> map = sLiveObjects;
        synchronized (map) {
            try {
                Integer num = map.get(obj);
                if (num == null) {
                    FLog.wtf("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
                } else if (num.intValue() == 1) {
                    map.remove(obj);
                } else {
                    map.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String reportData() {
        return Objects.toStringHelper("SharedReference").add("live_objects_count", sLiveObjects.size()).toString();
    }

    public synchronized void addReference() {
        ensureValid();
        this.mRefCount++;
    }

    public synchronized boolean addReferenceIfValid() {
        if (!isValid()) {
            return false;
        }
        addReference();
        return true;
    }

    public void deleteReference() {
        T t;
        if (decreaseRefCount() == 0) {
            synchronized (this) {
                t = this.mValue;
                this.mValue = null;
            }
            if (t != null) {
                ResourceReleaser<T> resourceReleaser = this.mResourceReleaser;
                if (resourceReleaser != null) {
                    resourceReleaser.release(t);
                }
                removeLiveReference(t);
            }
        }
    }

    public synchronized boolean deleteReferenceIfValid() {
        if (!isValid()) {
            return false;
        }
        deleteReference();
        return true;
    }

    @Nullable
    public synchronized T get() {
        return this.mValue;
    }

    public synchronized int getRefCountTestOnly() {
        return this.mRefCount;
    }

    public synchronized boolean isValid() {
        return this.mRefCount > 0;
    }

    @FalseOnNull
    public static boolean isValid(@Nullable SharedReference<?> sharedReference) {
        return sharedReference != null && sharedReference.isValid();
    }

    public SharedReference(T t, ResourceReleaser<T> resourceReleaser) {
        this(t, resourceReleaser, false);
    }
}
