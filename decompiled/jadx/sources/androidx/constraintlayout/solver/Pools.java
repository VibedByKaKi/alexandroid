package androidx.constraintlayout.solver;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
final class Pools {
    private static final boolean DEBUG = false;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Pool<T> {
        T acquire();

        boolean release(T t);

        void releaseAll(T[] tArr, int i);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SimplePool<T> implements Pool<T> {
        private final Object[] mPool;
        private int mPoolSize;

        public SimplePool(int i) {
            if (i > 0) {
                this.mPool = new Object[i];
            } else {
                Single$$ExternalSyntheticBUOutline0.m$3("The max pool size must be > 0");
                throw null;
            }
        }

        private boolean isInPool(T t) {
            for (int i = 0; i < this.mPoolSize; i++) {
                if (this.mPool[i] == t) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.constraintlayout.solver.Pools.Pool
        public T acquire() {
            int i = this.mPoolSize;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            Object[] objArr = this.mPool;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.mPoolSize = i - 1;
            return t;
        }

        @Override // androidx.constraintlayout.solver.Pools.Pool
        public boolean release(T t) {
            int i = this.mPoolSize;
            Object[] objArr = this.mPool;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.mPoolSize = i + 1;
            return true;
        }

        @Override // androidx.constraintlayout.solver.Pools.Pool
        public void releaseAll(T[] tArr, int i) {
            if (i > tArr.length) {
                i = tArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                T t = tArr[i2];
                int i3 = this.mPoolSize;
                Object[] objArr = this.mPool;
                if (i3 < objArr.length) {
                    objArr[i3] = t;
                    this.mPoolSize = i3 + 1;
                }
            }
        }
    }

    private Pools() {
    }
}
