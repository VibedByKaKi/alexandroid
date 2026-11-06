package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.Nullsafe;
import java.util.LinkedList;
import java.util.Queue;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@NotThreadSafe
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
class Bucket<V> {
    private static final String TAG = "BUCKET";
    private final boolean mFixBucketsReinitialization;
    final Queue mFreeList;
    private int mInUseLength;
    public final int mItemSize;
    public final int mMaxLength;

    public Bucket(int i, int i2, int i3, boolean z) {
        Preconditions.checkState(i > 0);
        Preconditions.checkState(i2 >= 0);
        Preconditions.checkState(i3 >= 0);
        this.mItemSize = i;
        this.mMaxLength = i2;
        this.mFreeList = new LinkedList();
        this.mInUseLength = i3;
        this.mFixBucketsReinitialization = z;
    }

    public void addToFreeList(V v) {
        this.mFreeList.add(v);
    }

    public void decrementInUseCount() {
        Preconditions.checkState(this.mInUseLength > 0);
        this.mInUseLength--;
    }

    @Nullable
    @Deprecated
    public V get() {
        V pop = pop();
        if (pop != null) {
            this.mInUseLength++;
        }
        return pop;
    }

    public int getFreeListSize() {
        return this.mFreeList.size();
    }

    public int getInUseCount() {
        return this.mInUseLength;
    }

    public void incrementInUseCount() {
        this.mInUseLength++;
    }

    public boolean isMaxLengthExceeded() {
        return this.mInUseLength + getFreeListSize() > this.mMaxLength;
    }

    @Nullable
    public V pop() {
        return (V) this.mFreeList.poll();
    }

    public void release(V v) {
        Preconditions.checkNotNull(v);
        boolean z = this.mFixBucketsReinitialization;
        int i = this.mInUseLength;
        if (z) {
            Preconditions.checkState(i > 0);
            this.mInUseLength--;
            addToFreeList(v);
        } else if (i <= 0) {
            FLog.e(TAG, "Tried to release value %s from an empty bucket!", v);
        } else {
            this.mInUseLength = i - 1;
            addToFreeList(v);
        }
    }
}
