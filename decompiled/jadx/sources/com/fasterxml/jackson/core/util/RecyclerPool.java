package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.util.RecyclerPool.WithPool;
import java.io.Serializable;
import java.util.Deque;
import java.util.Optional;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public interface RecyclerPool<P extends WithPool<P>> extends Serializable {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class BoundedPoolBase<P extends WithPool<P>> extends StatefulImplBase<P> {
        public static final int DEFAULT_CAPACITY = 100;
        private static final long serialVersionUID = 1;
        private final transient int capacity;
        private final transient ArrayBlockingQueue<P> pool;

        public BoundedPoolBase(int i) {
            super(i);
            i = i <= 0 ? 100 : i;
            this.capacity = i;
            this.pool = new ArrayBlockingQueue<>(i);
        }

        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        public P acquirePooled() {
            P poll = this.pool.poll();
            return poll == null ? createPooled() : poll;
        }

        public int capacity() {
            return this.capacity;
        }

        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        public boolean clear() {
            this.pool.clear();
            return true;
        }

        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        public int pooledCount() {
            return this.pool.size();
        }

        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        public void releasePooled(P p) {
            this.pool.offer(p);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class ConcurrentDequePoolBase<P extends WithPool<P>> extends StatefulImplBase<P> {
        private static final long serialVersionUID = 1;
        protected final transient Deque<P> pool;

        public ConcurrentDequePoolBase(int i) {
            super(i);
            this.pool = new ConcurrentLinkedDeque();
        }

        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        public P acquirePooled() {
            P pollFirst = this.pool.pollFirst();
            return pollFirst == null ? createPooled() : pollFirst;
        }

        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        public boolean clear() {
            this.pool.clear();
            return true;
        }

        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        public int pooledCount() {
            return this.pool.size();
        }

        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        public void releasePooled(P p) {
            this.pool.offerLast(p);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Deprecated
    public static abstract class LockFreePoolBase<P extends WithPool<P>> extends StatefulImplBase<P> {
        private static final long serialVersionUID = 1;
        private final transient AtomicReference<Node<P>> head;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Node<P> {
            Node<P> next;
            final P value;

            public Node(P p) {
                this.value = p;
            }
        }

        public LockFreePoolBase(int i) {
            super(i);
            this.head = new AtomicReference<>();
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
        
            r0 = r0 + 1;
         */
        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public P acquirePooled() {
            /*
                r5 = this;
                r0 = 0
            L1:
                r1 = 3
                if (r0 >= r1) goto L2e
                java.util.concurrent.atomic.AtomicReference<com.fasterxml.jackson.core.util.RecyclerPool$LockFreePoolBase$Node<P extends com.fasterxml.jackson.core.util.RecyclerPool$WithPool<P>>> r1 = r5.head
                java.lang.Object r1 = r1.get()
                com.fasterxml.jackson.core.util.RecyclerPool$LockFreePoolBase$Node r1 = (com.fasterxml.jackson.core.util.RecyclerPool.LockFreePoolBase.Node) r1
                if (r1 != 0) goto L13
                com.fasterxml.jackson.core.util.RecyclerPool$WithPool r5 = r5.createPooled()
                return r5
            L13:
                java.util.concurrent.atomic.AtomicReference<com.fasterxml.jackson.core.util.RecyclerPool$LockFreePoolBase$Node<P extends com.fasterxml.jackson.core.util.RecyclerPool$WithPool<P>>> r2 = r5.head
                com.fasterxml.jackson.core.util.RecyclerPool$LockFreePoolBase$Node<P> r3 = r1.next
            L17:
                boolean r4 = r2.compareAndSet(r1, r3)
                if (r4 == 0) goto L25
                r5 = 0
                r1.next = r5
                P r5 = r1.value
                com.fasterxml.jackson.core.util.RecyclerPool$WithPool r5 = (com.fasterxml.jackson.core.util.RecyclerPool.WithPool) r5
                return r5
            L25:
                java.lang.Object r4 = r2.get()
                if (r4 == r1) goto L17
                int r0 = r0 + 1
                goto L1
            L2e:
                com.fasterxml.jackson.core.util.RecyclerPool$WithPool r5 = r5.createPooled()
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.util.RecyclerPool.LockFreePoolBase.acquirePooled():com.fasterxml.jackson.core.util.RecyclerPool$WithPool");
        }

        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        public boolean clear() {
            this.head.set(null);
            return true;
        }

        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        public int pooledCount() {
            int i = 0;
            for (Node node = this.head.get(); node != null; node = node.next) {
                i++;
            }
            return i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
        
            r5 = r5 + 1;
         */
        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void releasePooled(P r5) {
            /*
                r4 = this;
                com.fasterxml.jackson.core.util.RecyclerPool$LockFreePoolBase$Node r0 = new com.fasterxml.jackson.core.util.RecyclerPool$LockFreePoolBase$Node
                r0.<init>(r5)
                r5 = 0
            L6:
                r1 = 3
                if (r5 >= r1) goto L25
                java.util.concurrent.atomic.AtomicReference<com.fasterxml.jackson.core.util.RecyclerPool$LockFreePoolBase$Node<P extends com.fasterxml.jackson.core.util.RecyclerPool$WithPool<P>>> r1 = r4.head
                java.lang.Object r1 = r1.get()
                com.fasterxml.jackson.core.util.RecyclerPool$LockFreePoolBase$Node r1 = (com.fasterxml.jackson.core.util.RecyclerPool.LockFreePoolBase.Node) r1
                r0.next = r1
                java.util.concurrent.atomic.AtomicReference<com.fasterxml.jackson.core.util.RecyclerPool$LockFreePoolBase$Node<P extends com.fasterxml.jackson.core.util.RecyclerPool$WithPool<P>>> r2 = r4.head
            L15:
                boolean r3 = r2.compareAndSet(r1, r0)
                if (r3 == 0) goto L1c
                return
            L1c:
                java.lang.Object r3 = r2.get()
                if (r3 == r1) goto L15
                int r5 = r5 + 1
                goto L6
            L25:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.util.RecyclerPool.LockFreePoolBase.releasePooled(com.fasterxml.jackson.core.util.RecyclerPool$WithPool):void");
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class StatefulImplBase<P extends WithPool<P>> implements RecyclerPool<P> {
        public static final int SERIALIZATION_NON_SHARED = 1;
        public static final int SERIALIZATION_SHARED = -1;
        private static final long serialVersionUID = 1;
        protected final int _serialization;

        public StatefulImplBase(int i) {
            this._serialization = i;
        }

        public Optional<StatefulImplBase<P>> _resolveToShared(StatefulImplBase<P> statefulImplBase) {
            return this._serialization == -1 ? Optional.of(statefulImplBase) : Optional.empty();
        }

        public abstract P createPooled();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface WithPool<P extends WithPool<P>> {
        void releaseToPool();

        P withPool(RecyclerPool<P> recyclerPool);
    }

    default P acquireAndLinkPooled() {
        return (P) acquirePooled().withPool(this);
    }

    P acquirePooled();

    default boolean clear() {
        return false;
    }

    default int pooledCount() {
        return -1;
    }

    void releasePooled(P p);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class NonRecyclingPoolBase<P extends WithPool<P>> implements RecyclerPool<P> {
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        public P acquireAndLinkPooled() {
            return acquirePooled();
        }

        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        public abstract P acquirePooled();

        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        public boolean clear() {
            return true;
        }

        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        public int pooledCount() {
            return 0;
        }

        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        public void releasePooled(P p) {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class ThreadLocalPoolBase<P extends WithPool<P>> implements RecyclerPool<P> {
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        public P acquireAndLinkPooled() {
            return acquirePooled();
        }

        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        public abstract P acquirePooled();

        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        public boolean clear() {
            return false;
        }

        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        public int pooledCount() {
            return -1;
        }

        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        public void releasePooled(P p) {
        }
    }
}
