package com.facebook.common.references;

import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.Closeables;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.FalseOnNull;
import com.facebook.infer.annotation.Nullsafe;
import com.facebook.infer.annotation.PropagatesNullable;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public abstract class CloseableReference<T> implements Cloneable, Closeable {
    public static final int REF_TYPE_DEFAULT = 0;
    public static final int REF_TYPE_FINALIZER = 1;
    public static final int REF_TYPE_NOOP = 3;
    public static final int REF_TYPE_REF_COUNT = 2;

    @CloseableRefType
    private static int sBitmapCloseableRefType;

    @GuardedBy("this")
    protected boolean mIsClosed = false;

    @Nullable
    protected final LeakHandler mLeakHandler;
    protected final SharedReference<T> mSharedReference;

    @Nullable
    protected final Throwable mStacktrace;
    private static Class<CloseableReference> TAG = CloseableReference.class;
    private static final ResourceReleaser<Closeable> DEFAULT_CLOSEABLE_RELEASER = new ResourceReleaser<Closeable>() { // from class: com.facebook.common.references.CloseableReference.1
        @Override // com.facebook.common.references.ResourceReleaser
        public void release(Closeable closeable) {
            try {
                Closeables.close(closeable, true);
            } catch (IOException unused) {
            }
        }
    };
    private static final LeakHandler DEFAULT_LEAK_HANDLER = new LeakHandler() { // from class: com.facebook.common.references.CloseableReference.2
        @Override // com.facebook.common.references.CloseableReference.LeakHandler
        public void reportLeak(SharedReference<Object> sharedReference, @Nullable Throwable th) {
            Object obj = sharedReference.get();
            FLog.w((Class<?>) CloseableReference.TAG, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(sharedReference)), obj == null ? null : obj.getClass().getName());
        }

        @Override // com.facebook.common.references.CloseableReference.LeakHandler
        public boolean requiresStacktrace() {
            return false;
        }
    };

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public @interface CloseableRefType {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface LeakHandler {
        void reportLeak(SharedReference<Object> sharedReference, @Nullable Throwable th);

        boolean requiresStacktrace();
    }

    public CloseableReference(SharedReference<T> sharedReference, @Nullable LeakHandler leakHandler, @Nullable Throwable th) {
        this.mSharedReference = (SharedReference) Preconditions.checkNotNull(sharedReference);
        sharedReference.addReference();
        this.mLeakHandler = leakHandler;
        this.mStacktrace = th;
    }

    public static <T> List<CloseableReference<T>> cloneOrNull(@PropagatesNullable Collection<CloseableReference<T>> collection) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<CloseableReference<T>> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(cloneOrNull(it2.next()));
        }
        return arrayList;
    }

    public static void closeSafely(@Nullable Iterable<? extends CloseableReference<?>> iterable) {
        if (iterable != null) {
            Iterator<? extends CloseableReference<?>> it2 = iterable.iterator();
            while (it2.hasNext()) {
                closeSafely(it2.next());
            }
        }
    }

    @FalseOnNull
    public static boolean isValid(@Nullable CloseableReference<?> closeableReference) {
        return closeableReference != null && closeableReference.isValid();
    }

    public static <T> CloseableReference<T> of(@PropagatesNullable T t, ResourceReleaser<T> resourceReleaser, LeakHandler leakHandler, @Nullable Throwable th) {
        if (t == null) {
            return null;
        }
        if ((t instanceof Bitmap) || (t instanceof HasBitmap)) {
            int i = sBitmapCloseableRefType;
            if (i == 1) {
                return new FinalizerCloseableReference(t, resourceReleaser, leakHandler, th);
            }
            if (i == 2) {
                return new RefCountCloseableReference(t, resourceReleaser, leakHandler, th);
            }
            if (i == 3) {
                return new NoOpCloseableReference(t);
            }
        }
        return new DefaultCloseableReference(t, resourceReleaser, leakHandler, th);
    }

    public static void setDisableCloseableReferencesForBitmaps(@CloseableRefType int i) {
        sBitmapCloseableRefType = i;
    }

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public abstract CloseableReference<T> mo23973clone();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (this.mIsClosed) {
                    return;
                }
                this.mIsClosed = true;
                this.mSharedReference.deleteReference();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized T get() {
        Preconditions.checkState(!this.mIsClosed);
        return (T) Preconditions.checkNotNull(this.mSharedReference.get());
    }

    @VisibleForTesting
    public synchronized SharedReference<T> getUnderlyingReferenceTestOnly() {
        return this.mSharedReference;
    }

    public int getValueHash() {
        if (isValid()) {
            return System.identityHashCode(this.mSharedReference.get());
        }
        return 0;
    }

    public synchronized boolean isValid() {
        return !this.mIsClosed;
    }

    public CloseableReference(T t, @Nullable ResourceReleaser<T> resourceReleaser, @Nullable LeakHandler leakHandler, @Nullable Throwable th, boolean z) {
        this.mSharedReference = new SharedReference<>(t, resourceReleaser, z);
        this.mLeakHandler = leakHandler;
        this.mStacktrace = th;
    }

    public static void closeSafely(@Nullable CloseableReference<?> closeableReference) {
        if (closeableReference != null) {
            closeableReference.close();
        }
    }

    @Nullable
    public static <T> CloseableReference<T> cloneOrNull(@Nullable CloseableReference<T> closeableReference) {
        if (closeableReference != null) {
            return closeableReference.cloneOrNull();
        }
        return null;
    }

    @Nullable
    public synchronized CloseableReference<T> cloneOrNull() {
        if (!isValid()) {
            return null;
        }
        return mo23973clone();
    }

    public static <T> CloseableReference<T> of(@PropagatesNullable T t, ResourceReleaser<T> resourceReleaser) {
        return of(t, resourceReleaser, DEFAULT_LEAK_HANDLER);
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/io/Closeable;>(TT;Lcom/facebook/common/references/CloseableReference$LeakHandler;)Lcom/facebook/common/references/CloseableReference<TT;>; */
    public static CloseableReference of(@PropagatesNullable @Nullable Closeable closeable, LeakHandler leakHandler) {
        if (closeable == null) {
            return null;
        }
        return of(closeable, DEFAULT_CLOSEABLE_RELEASER, leakHandler, leakHandler.requiresStacktrace() ? new Throwable() : null);
    }

    public static <T> CloseableReference<T> of(@PropagatesNullable T t, ResourceReleaser<T> resourceReleaser, LeakHandler leakHandler) {
        if (t == null) {
            return null;
        }
        return of(t, resourceReleaser, leakHandler, leakHandler.requiresStacktrace() ? new Throwable() : null);
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/io/Closeable;>(TT;)Lcom/facebook/common/references/CloseableReference<TT;>; */
    public static CloseableReference of(@PropagatesNullable Closeable closeable) {
        return of(closeable, DEFAULT_CLOSEABLE_RELEASER);
    }
}
