package com.facebook.imagepipeline.memory;

import androidx.annotation.VisibleForTesting;
import com.facebook.infer.annotation.Nullsafe;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public abstract class LruBucketsPoolBackend<T> implements PoolBackend<T> {
    private final Set<T> mCurrentItems = new HashSet();
    private final BucketMap<T> mMap = new BucketMap<>();

    @Nullable
    private T maybeRemoveFromCurrentItems(@Nullable T t) {
        if (t == null) {
            return t;
        }
        synchronized (this) {
            this.mCurrentItems.remove(t);
        }
        return t;
    }

    @Override // com.facebook.imagepipeline.memory.PoolBackend
    @Nullable
    public T get(int i) {
        return maybeRemoveFromCurrentItems(this.mMap.acquire(i));
    }

    @Override // com.facebook.imagepipeline.memory.PoolBackend
    @Nullable
    public T pop() {
        return maybeRemoveFromCurrentItems(this.mMap.removeFromEnd());
    }

    @Override // com.facebook.imagepipeline.memory.PoolBackend
    public void put(T t) {
        boolean add;
        synchronized (this) {
            add = this.mCurrentItems.add(t);
        }
        if (add) {
            this.mMap.release(getSize(t), t);
        }
    }

    @VisibleForTesting
    public int valueCount() {
        return this.mMap.valueCount();
    }
}
