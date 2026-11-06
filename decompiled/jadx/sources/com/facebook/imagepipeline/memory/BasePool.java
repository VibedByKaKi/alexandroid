package com.facebook.imagepipeline.memory;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.VisibleForTesting;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Sets;
import com.facebook.common.internal.Throwables;
import com.facebook.common.logging.FLog;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.common.memory.Pool;
import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.NotThreadSafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public abstract class BasePool<V> implements Pool<V> {
    private final Class<?> TAG;
    private boolean mAllowNewBuckets;

    @VisibleForTesting
    final SparseArray<Bucket<V>> mBuckets;

    @GuardedBy("this")
    @VisibleForTesting
    final Counter mFree;
    private boolean mIgnoreHardCap;

    @VisibleForTesting
    final Set<V> mInUseValues;
    final MemoryTrimmableRegistry mMemoryTrimmableRegistry;
    final PoolParams mPoolParams;
    private final PoolStatsTracker mPoolStatsTracker;

    @GuardedBy("this")
    @VisibleForTesting
    final Counter mUsed;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @NotThreadSafe
    @VisibleForTesting
    public static class Counter {
        private static final String TAG = "com.facebook.imagepipeline.memory.BasePool.Counter";
        int mCount;
        int mNumBytes;

        public void decrement(int i) {
            int i2;
            int i3 = this.mNumBytes;
            if (i3 < i || (i2 = this.mCount) <= 0) {
                FLog.wtf(TAG, "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i), Integer.valueOf(this.mNumBytes), Integer.valueOf(this.mCount));
            } else {
                this.mCount = i2 - 1;
                this.mNumBytes = i3 - i;
            }
        }

        public void increment(int i) {
            this.mCount++;
            this.mNumBytes += i;
        }

        public void reset() {
            this.mCount = 0;
            this.mNumBytes = 0;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class InvalidSizeException extends RuntimeException {
        public InvalidSizeException(Object obj) {
            super("Invalid size: " + obj.toString());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class InvalidValueException extends RuntimeException {
        public InvalidValueException(Object obj) {
            super("Invalid value: " + obj.toString());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PoolSizeViolationException extends RuntimeException {
        public PoolSizeViolationException(int i, int i2, int i3, int i4) {
            super(ParcelCompat$$ExternalSyntheticOutline0.m(" Request size = ", i3, i4, ErrorUtils$$ExternalSyntheticOutline0.m29m(i, i2, "Pool hard cap violation? Hard cap = ", " Used size = ", " Free size = ")));
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SizeTooLargeException extends InvalidSizeException {
        public SizeTooLargeException(Object obj) {
            super(obj);
        }
    }

    public BasePool(MemoryTrimmableRegistry memoryTrimmableRegistry, PoolParams poolParams, PoolStatsTracker poolStatsTracker) {
        this.TAG = getClass();
        this.mMemoryTrimmableRegistry = (MemoryTrimmableRegistry) Preconditions.checkNotNull(memoryTrimmableRegistry);
        PoolParams poolParams2 = (PoolParams) Preconditions.checkNotNull(poolParams);
        this.mPoolParams = poolParams2;
        this.mPoolStatsTracker = (PoolStatsTracker) Preconditions.checkNotNull(poolStatsTracker);
        this.mBuckets = new SparseArray<>();
        if (poolParams2.fixBucketsReinitialization) {
            initBuckets();
        } else {
            legacyInitBuckets(new SparseIntArray(0));
        }
        this.mInUseValues = Sets.newIdentityHashSet();
        this.mFree = new Counter();
        this.mUsed = new Counter();
    }

    private synchronized void ensurePoolSizeInvariant() {
        boolean z;
        try {
            if (isMaxSizeSoftCapExceeded() && this.mFree.mNumBytes != 0) {
                z = false;
                Preconditions.checkState(z);
            }
            z = true;
            Preconditions.checkState(z);
        } catch (Throwable th) {
            throw th;
        }
    }

    private void fillBuckets(SparseIntArray sparseIntArray) {
        this.mBuckets.clear();
        for (int i = 0; i < sparseIntArray.size(); i++) {
            int keyAt = sparseIntArray.keyAt(i);
            this.mBuckets.put(keyAt, new Bucket<>(getSizeInBytes(keyAt), sparseIntArray.valueAt(i), 0, this.mPoolParams.fixBucketsReinitialization));
        }
    }

    @Nullable
    private synchronized Bucket<V> getBucketIfPresent(int i) {
        return this.mBuckets.get(i);
    }

    private synchronized void initBuckets() {
        try {
            SparseIntArray sparseIntArray = this.mPoolParams.bucketSizes;
            if (sparseIntArray != null) {
                fillBuckets(sparseIntArray);
                this.mAllowNewBuckets = false;
            } else {
                this.mAllowNewBuckets = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void legacyInitBuckets(SparseIntArray sparseIntArray) {
        try {
            Preconditions.checkNotNull(sparseIntArray);
            this.mBuckets.clear();
            SparseIntArray sparseIntArray2 = this.mPoolParams.bucketSizes;
            if (sparseIntArray2 != null) {
                for (int i = 0; i < sparseIntArray2.size(); i++) {
                    int keyAt = sparseIntArray2.keyAt(i);
                    this.mBuckets.put(keyAt, new Bucket<>(getSizeInBytes(keyAt), sparseIntArray2.valueAt(i), sparseIntArray.get(keyAt, 0), this.mPoolParams.fixBucketsReinitialization));
                }
                this.mAllowNewBuckets = false;
            } else {
                this.mAllowNewBuckets = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @SuppressLint({"InvalidAccessToGuardedField"})
    private void logStats() {
        if (FLog.isLoggable(2)) {
            FLog.v(this.TAG, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.mUsed.mCount), Integer.valueOf(this.mUsed.mNumBytes), Integer.valueOf(this.mFree.mCount), Integer.valueOf(this.mFree.mNumBytes));
        }
    }

    private List<Bucket<V>> refillBuckets() {
        ArrayList arrayList = new ArrayList(this.mBuckets.size());
        int size = this.mBuckets.size();
        for (int i = 0; i < size; i++) {
            Bucket bucket = (Bucket) Preconditions.checkNotNull(this.mBuckets.valueAt(i));
            int i2 = bucket.mItemSize;
            int i3 = bucket.mMaxLength;
            int inUseCount = bucket.getInUseCount();
            if (bucket.getFreeListSize() > 0) {
                arrayList.add(bucket);
            }
            this.mBuckets.setValueAt(i, new Bucket<>(getSizeInBytes(i2), i3, inUseCount, this.mPoolParams.fixBucketsReinitialization));
        }
        return arrayList;
    }

    public abstract V alloc(int i);

    @VisibleForTesting
    public synchronized boolean canAllocate(int i) {
        if (this.mIgnoreHardCap) {
            return true;
        }
        PoolParams poolParams = this.mPoolParams;
        int i2 = poolParams.maxSizeHardCap;
        int i3 = this.mUsed.mNumBytes;
        if (i > i2 - i3) {
            this.mPoolStatsTracker.onHardCapReached();
            return false;
        }
        int i4 = poolParams.maxSizeSoftCap;
        if (i > i4 - (i3 + this.mFree.mNumBytes)) {
            trimToSize(i4 - i);
        }
        if (i <= i2 - (this.mUsed.mNumBytes + this.mFree.mNumBytes)) {
            return true;
        }
        this.mPoolStatsTracker.onHardCapReached();
        return false;
    }

    @VisibleForTesting
    public abstract void free(V v);

    @Override // com.facebook.common.memory.Pool
    public V get(int i) {
        V v;
        V value;
        ensurePoolSizeInvariant();
        int bucketedSize = getBucketedSize(i);
        synchronized (this) {
            try {
                Bucket<V> bucket = getBucket(bucketedSize);
                if (bucket != null && (value = getValue(bucket)) != null) {
                    Preconditions.checkState(this.mInUseValues.add(value));
                    int bucketedSizeForValue = getBucketedSizeForValue(value);
                    int sizeInBytes = getSizeInBytes(bucketedSizeForValue);
                    this.mUsed.increment(sizeInBytes);
                    this.mFree.decrement(sizeInBytes);
                    this.mPoolStatsTracker.onValueReuse(sizeInBytes);
                    logStats();
                    if (FLog.isLoggable(2)) {
                        FLog.v(this.TAG, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(value)), Integer.valueOf(bucketedSizeForValue));
                    }
                    return value;
                }
                int sizeInBytes2 = getSizeInBytes(bucketedSize);
                if (!canAllocate(sizeInBytes2)) {
                    throw new PoolSizeViolationException(this.mPoolParams.maxSizeHardCap, this.mUsed.mNumBytes, this.mFree.mNumBytes, sizeInBytes2);
                }
                this.mUsed.increment(sizeInBytes2);
                if (bucket != null) {
                    bucket.incrementInUseCount();
                }
                try {
                    v = alloc(bucketedSize);
                } catch (Throwable th) {
                    synchronized (this) {
                        try {
                            this.mUsed.decrement(sizeInBytes2);
                            Bucket<V> bucket2 = getBucket(bucketedSize);
                            if (bucket2 != null) {
                                bucket2.decrementInUseCount();
                            }
                            Throwables.propagateIfPossible(th);
                            v = null;
                        } finally {
                        }
                    }
                }
                synchronized (this) {
                    try {
                        Preconditions.checkState(this.mInUseValues.add(v));
                        trimToSoftCap();
                        this.mPoolStatsTracker.onAlloc(sizeInBytes2);
                        logStats();
                        if (FLog.isLoggable(2)) {
                            FLog.v(this.TAG, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(bucketedSize));
                        }
                    } finally {
                    }
                }
                return v;
            } finally {
            }
        }
    }

    @Nullable
    @VisibleForTesting
    public synchronized Bucket<V> getBucket(int i) {
        try {
            Bucket<V> bucket = this.mBuckets.get(i);
            if (bucket == null && this.mAllowNewBuckets) {
                if (FLog.isLoggable(2)) {
                    FLog.v(this.TAG, "creating new bucket %s", Integer.valueOf(i));
                }
                Bucket<V> newBucket = newBucket(i);
                this.mBuckets.put(i, newBucket);
                return newBucket;
            }
            return bucket;
        } finally {
        }
    }

    public abstract int getBucketedSize(int i);

    public abstract int getBucketedSizeForValue(V v);

    public abstract int getSizeInBytes(int i);

    public synchronized Map<String, Integer> getStats() {
        HashMap hashMap;
        try {
            hashMap = new HashMap();
            for (int i = 0; i < this.mBuckets.size(); i++) {
                hashMap.put("buckets_used_" + getSizeInBytes(this.mBuckets.keyAt(i)), Integer.valueOf(((Bucket) Preconditions.checkNotNull(this.mBuckets.valueAt(i))).getInUseCount()));
            }
            hashMap.put("soft_cap", Integer.valueOf(this.mPoolParams.maxSizeSoftCap));
            hashMap.put("hard_cap", Integer.valueOf(this.mPoolParams.maxSizeHardCap));
            hashMap.put("used_count", Integer.valueOf(this.mUsed.mCount));
            hashMap.put("used_bytes", Integer.valueOf(this.mUsed.mNumBytes));
            hashMap.put("free_count", Integer.valueOf(this.mFree.mCount));
            hashMap.put("free_bytes", Integer.valueOf(this.mFree.mNumBytes));
        } catch (Throwable th) {
            throw th;
        }
        return hashMap;
    }

    @Nullable
    public synchronized V getValue(Bucket<V> bucket) {
        return bucket.get();
    }

    public void initialize() {
        this.mMemoryTrimmableRegistry.registerMemoryTrimmable(this);
        this.mPoolStatsTracker.setBasePool(this);
    }

    @VisibleForTesting
    public synchronized boolean isMaxSizeSoftCapExceeded() {
        boolean z;
        z = this.mUsed.mNumBytes + this.mFree.mNumBytes > this.mPoolParams.maxSizeSoftCap;
        if (z) {
            this.mPoolStatsTracker.onSoftCapReached();
        }
        return z;
    }

    public boolean isReusable(V v) {
        Preconditions.checkNotNull(v);
        return true;
    }

    public Bucket<V> newBucket(int i) {
        return new Bucket<>(getSizeInBytes(i), Integer.MAX_VALUE, 0, this.mPoolParams.fixBucketsReinitialization);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        r2.decrementInUseCount();
     */
    @Override // com.facebook.common.memory.Pool, com.facebook.common.references.ResourceReleaser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void release(V r6) {
        /*
            r5 = this;
            com.facebook.common.internal.Preconditions.checkNotNull(r6)
            int r0 = r5.getBucketedSizeForValue(r6)
            int r1 = r5.getSizeInBytes(r0)
            monitor-enter(r5)
            com.facebook.imagepipeline.memory.Bucket r2 = r5.getBucketIfPresent(r0)     // Catch: java.lang.Throwable -> L38
            java.util.Set<V> r3 = r5.mInUseValues     // Catch: java.lang.Throwable -> L38
            boolean r3 = r3.remove(r6)     // Catch: java.lang.Throwable -> L38
            if (r3 != 0) goto L3b
            java.lang.Class<?> r2 = r5.TAG     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "release (free, value unrecognized) (object, size) = (%x, %s)"
            int r4 = java.lang.System.identityHashCode(r6)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r0}     // Catch: java.lang.Throwable -> L38
            com.facebook.common.logging.FLog.e(r2, r3, r0)     // Catch: java.lang.Throwable -> L38
            r5.free(r6)     // Catch: java.lang.Throwable -> L38
            com.facebook.imagepipeline.memory.PoolStatsTracker r6 = r5.mPoolStatsTracker     // Catch: java.lang.Throwable -> L38
            r6.onFree(r1)     // Catch: java.lang.Throwable -> L38
            goto La8
        L38:
            r6 = move-exception
            goto Lad
        L3b:
            r3 = 2
            if (r2 == 0) goto L7d
            boolean r4 = r2.isMaxLengthExceeded()     // Catch: java.lang.Throwable -> L38
            if (r4 != 0) goto L7d
            boolean r4 = r5.isMaxSizeSoftCapExceeded()     // Catch: java.lang.Throwable -> L38
            if (r4 != 0) goto L7d
            boolean r4 = r5.isReusable(r6)     // Catch: java.lang.Throwable -> L38
            if (r4 != 0) goto L51
            goto L7d
        L51:
            r2.release(r6)     // Catch: java.lang.Throwable -> L38
            com.facebook.imagepipeline.memory.BasePool$Counter r2 = r5.mFree     // Catch: java.lang.Throwable -> L38
            r2.increment(r1)     // Catch: java.lang.Throwable -> L38
            com.facebook.imagepipeline.memory.BasePool$Counter r2 = r5.mUsed     // Catch: java.lang.Throwable -> L38
            r2.decrement(r1)     // Catch: java.lang.Throwable -> L38
            com.facebook.imagepipeline.memory.PoolStatsTracker r2 = r5.mPoolStatsTracker     // Catch: java.lang.Throwable -> L38
            r2.onValueRelease(r1)     // Catch: java.lang.Throwable -> L38
            boolean r1 = com.facebook.common.logging.FLog.isLoggable(r3)     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto La8
            java.lang.Class<?> r1 = r5.TAG     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = "release (reuse) (object, size) = (%x, %s)"
            int r6 = java.lang.System.identityHashCode(r6)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L38
            com.facebook.common.logging.FLog.v(r1, r2, r6, r0)     // Catch: java.lang.Throwable -> L38
            goto La8
        L7d:
            if (r2 == 0) goto L82
            r2.decrementInUseCount()     // Catch: java.lang.Throwable -> L38
        L82:
            boolean r2 = com.facebook.common.logging.FLog.isLoggable(r3)     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L9b
            java.lang.Class<?> r2 = r5.TAG     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "release (free) (object, size) = (%x, %s)"
            int r4 = java.lang.System.identityHashCode(r6)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L38
            com.facebook.common.logging.FLog.v(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> L38
        L9b:
            r5.free(r6)     // Catch: java.lang.Throwable -> L38
            com.facebook.imagepipeline.memory.BasePool$Counter r6 = r5.mUsed     // Catch: java.lang.Throwable -> L38
            r6.decrement(r1)     // Catch: java.lang.Throwable -> L38
            com.facebook.imagepipeline.memory.PoolStatsTracker r6 = r5.mPoolStatsTracker     // Catch: java.lang.Throwable -> L38
            r6.onFree(r1)     // Catch: java.lang.Throwable -> L38
        La8:
            r5.logStats()     // Catch: java.lang.Throwable -> L38
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L38
            return
        Lad:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L38
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.BasePool.release(java.lang.Object):void");
    }

    @Override // com.facebook.common.memory.MemoryTrimmable
    public void trim(MemoryTrimType memoryTrimType) {
        trimToNothing();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.facebook.imagepipeline.memory.BasePool, com.facebook.imagepipeline.memory.BasePool<V>] */
    @VisibleForTesting
    public void trimToNothing() {
        int i;
        ArrayList arrayList;
        synchronized (this) {
            try {
                if (this.mPoolParams.fixBucketsReinitialization) {
                    arrayList = refillBuckets();
                } else {
                    ArrayList arrayList2 = new ArrayList(this.mBuckets.size());
                    SparseIntArray sparseIntArray = new SparseIntArray();
                    for (int i2 = 0; i2 < this.mBuckets.size(); i2++) {
                        Bucket bucket = (Bucket) Preconditions.checkNotNull(this.mBuckets.valueAt(i2));
                        if (bucket.getFreeListSize() > 0) {
                            arrayList2.add(bucket);
                        }
                        sparseIntArray.put(this.mBuckets.keyAt(i2), bucket.getInUseCount());
                    }
                    legacyInitBuckets(sparseIntArray);
                    arrayList = arrayList2;
                }
                this.mFree.reset();
                logStats();
            } catch (Throwable th) {
                throw th;
            }
        }
        onParamsChanged();
        for (i = 0; i < arrayList.size(); i++) {
            Bucket bucket2 = (Bucket) arrayList.get(i);
            while (true) {
                Object pop = bucket2.pop();
                if (pop == null) {
                    break;
                } else {
                    free(pop);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @VisibleForTesting
    public synchronized void trimToSize(int i) {
        try {
            int i2 = this.mUsed.mNumBytes;
            int i3 = this.mFree.mNumBytes;
            int min = Math.min((i2 + i3) - i, i3);
            if (min <= 0) {
                return;
            }
            if (FLog.isLoggable(2)) {
                FLog.v(this.TAG, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i), Integer.valueOf(this.mUsed.mNumBytes + this.mFree.mNumBytes), Integer.valueOf(min));
            }
            logStats();
            for (int i4 = 0; i4 < this.mBuckets.size() && min > 0; i4++) {
                Bucket bucket = (Bucket) Preconditions.checkNotNull(this.mBuckets.valueAt(i4));
                while (min > 0) {
                    Object pop = bucket.pop();
                    if (pop == null) {
                        break;
                    }
                    free(pop);
                    int i5 = bucket.mItemSize;
                    min -= i5;
                    this.mFree.decrement(i5);
                }
            }
            logStats();
            if (FLog.isLoggable(2)) {
                FLog.v(this.TAG, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i), Integer.valueOf(this.mUsed.mNumBytes + this.mFree.mNumBytes));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @VisibleForTesting
    public synchronized void trimToSoftCap() {
        if (isMaxSizeSoftCapExceeded()) {
            trimToSize(this.mPoolParams.maxSizeSoftCap);
        }
    }

    public void onParamsChanged() {
    }

    public BasePool(MemoryTrimmableRegistry memoryTrimmableRegistry, PoolParams poolParams, PoolStatsTracker poolStatsTracker, boolean z) {
        this(memoryTrimmableRegistry, poolParams, poolStatsTracker);
        this.mIgnoreHardCap = z;
    }
}
