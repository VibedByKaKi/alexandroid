package io.reactivex.rxjava3.subjects;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final class ReplaySubject<T> extends Subject<T> {
    final ReplayBuffer<T> buffer;
    boolean done;
    final AtomicReference<ReplayDisposable<T>[]> observers = new AtomicReference<>(EMPTY);
    static final ReplayDisposable[] EMPTY = new ReplayDisposable[0];
    static final ReplayDisposable[] TERMINATED = new ReplayDisposable[0];
    private static final Object[] EMPTY_ARRAY = new Object[0];

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Node<T> extends AtomicReference<Node<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final T value;

        public Node(T t) {
            this.value = t;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ReplayBuffer<T> {
        void add(T t);

        void addFinal(Object obj);

        boolean compareAndSet(Object obj, Object obj2);

        Object get();

        @Nullable
        T getValue();

        T[] getValues(T[] tArr);

        void replay(ReplayDisposable<T> replayDisposable);

        int size();

        void trimHead();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ReplayDisposable<T> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 466549804534799122L;
        volatile boolean cancelled;
        final Observer<? super T> downstream;
        Object index;
        final ReplaySubject<T> state;

        public ReplayDisposable(Observer<? super T> observer, ReplaySubject<T> replaySubject) {
            this.downstream = observer;
            this.state = replaySubject;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.state.remove(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SizeBoundReplayBuffer<T> extends AtomicReference<Object> implements ReplayBuffer<T> {
        private static final long serialVersionUID = 1107649250281456395L;
        volatile Node<Object> head;
        final int maxSize;
        int size;
        Node<Object> tail;

        public SizeBoundReplayBuffer(int i) {
            this.maxSize = i;
            Node<Object> node = new Node<>(null);
            this.tail = node;
            this.head = node;
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.ReplayBuffer
        public void add(T t) {
            Node<Object> node = new Node<>(t);
            Node<Object> node2 = this.tail;
            this.tail = node;
            this.size++;
            node2.set(node);
            trim();
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.ReplayBuffer
        public void addFinal(Object obj) {
            Node<Object> node = new Node<>(obj);
            Node<Object> node2 = this.tail;
            this.tail = node;
            this.size++;
            node2.lazySet(node);
            trimHead();
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.ReplayBuffer
        @Nullable
        public T getValue() {
            Node<Object> node = this.head;
            Node<Object> node2 = null;
            while (true) {
                Node<T> node3 = node.get();
                if (node3 == null) {
                    break;
                }
                node2 = node;
                node = node3;
            }
            T t = (T) node.value;
            if (t == null) {
                return null;
            }
            return (NotificationLite.isComplete(t) || NotificationLite.isError(t)) ? (T) node2.value : t;
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.ReplayBuffer
        public T[] getValues(T[] tArr) {
            Node<T> node = this.head;
            int size = size();
            if (size == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) DoubleList$$ExternalSyntheticOutline0.m(tArr, size));
            }
            for (int i = 0; i != size; i++) {
                node = node.get();
                tArr[i] = node.value;
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.ReplayBuffer
        public void replay(ReplayDisposable<T> replayDisposable) {
            if (replayDisposable.getAndIncrement() != 0) {
                return;
            }
            Observer<? super T> observer = replayDisposable.downstream;
            Node<Object> node = (Node) replayDisposable.index;
            if (node == null) {
                node = this.head;
            }
            int i = 1;
            while (!replayDisposable.cancelled) {
                Node<T> node2 = node.get();
                if (node2 != null) {
                    T t = node2.value;
                    if (NotificationLite.isComplete(t)) {
                        observer.onComplete();
                        replayDisposable.index = null;
                        replayDisposable.cancelled = true;
                        return;
                    } else {
                        if (NotificationLite.isError(t)) {
                            observer.onError(NotificationLite.getError(t));
                            replayDisposable.index = null;
                            replayDisposable.cancelled = true;
                            return;
                        }
                        observer.onNext(t);
                        node = node2;
                    }
                } else if (node.get() != null) {
                    continue;
                } else {
                    replayDisposable.index = node;
                    i = replayDisposable.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
            replayDisposable.index = null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
        
            return r0;
         */
        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.ReplayBuffer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int size() {
            /*
                r2 = this;
                io.reactivex.rxjava3.subjects.ReplaySubject$Node<java.lang.Object> r2 = r2.head
                r0 = 0
            L3:
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 == r1) goto L25
                java.lang.Object r1 = r2.get()
                io.reactivex.rxjava3.subjects.ReplaySubject$Node r1 = (io.reactivex.rxjava3.subjects.ReplaySubject.Node) r1
                if (r1 != 0) goto L21
                T r2 = r2.value
                boolean r1 = io.reactivex.rxjava3.internal.util.NotificationLite.isComplete(r2)
                if (r1 != 0) goto L1e
                boolean r2 = io.reactivex.rxjava3.internal.util.NotificationLite.isError(r2)
                if (r2 == 0) goto L25
            L1e:
                int r0 = r0 + (-1)
                return r0
            L21:
                int r0 = r0 + 1
                r2 = r1
                goto L3
            L25:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.subjects.ReplaySubject.SizeBoundReplayBuffer.size():int");
        }

        public void trim() {
            int i = this.size;
            if (i > this.maxSize) {
                this.size = i - 1;
                this.head = this.head.get();
            }
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.ReplayBuffer
        public void trimHead() {
            Node<Object> node = this.head;
            if (node.value != null) {
                Node<Object> node2 = new Node<>(null);
                node2.lazySet(node.get());
                this.head = node2;
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class TimedNode<T> extends AtomicReference<TimedNode<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final long time;
        final T value;

        public TimedNode(T t, long j) {
            this.value = t;
            this.time = j;
        }
    }

    public ReplaySubject(ReplayBuffer<T> replayBuffer) {
        this.buffer = replayBuffer;
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplaySubject<T> create(int i) {
        ObjectHelper.verifyPositive(i, "capacityHint");
        return new ReplaySubject<>(new UnboundedReplayBuffer(i));
    }

    public static <T> ReplaySubject<T> createUnbounded() {
        return new ReplaySubject<>(new SizeBoundReplayBuffer(Integer.MAX_VALUE));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplaySubject<T> createWithSize(int i) {
        ObjectHelper.verifyPositive(i, "maxSize");
        return new ReplaySubject<>(new SizeBoundReplayBuffer(i));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplaySubject<T> createWithTime(long j, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        ObjectHelper.verifyPositive(j, "maxAge");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new ReplaySubject<>(new SizeAndTimeBoundReplayBuffer(Integer.MAX_VALUE, j, timeUnit, scheduler));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplaySubject<T> createWithTimeAndSize(long j, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, int i) {
        ObjectHelper.verifyPositive(i, "maxSize");
        ObjectHelper.verifyPositive(j, "maxAge");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new ReplaySubject<>(new SizeAndTimeBoundReplayBuffer(i, j, timeUnit, scheduler));
    }

    public boolean add(ReplayDisposable<T> replayDisposable) {
        while (true) {
            ReplayDisposable<T>[] replayDisposableArr = this.observers.get();
            if (replayDisposableArr == TERMINATED) {
                return false;
            }
            int length = replayDisposableArr.length;
            ReplayDisposable<T>[] replayDisposableArr2 = new ReplayDisposable[length + 1];
            System.arraycopy(replayDisposableArr, 0, replayDisposableArr2, 0, length);
            replayDisposableArr2[length] = replayDisposable;
            AtomicReference<ReplayDisposable<T>[]> atomicReference = this.observers;
            while (!atomicReference.compareAndSet(replayDisposableArr, replayDisposableArr2)) {
                if (atomicReference.get() != replayDisposableArr) {
                    break;
                }
            }
            return true;
        }
    }

    public void cleanupBuffer() {
        this.buffer.trimHead();
    }

    @Override // io.reactivex.rxjava3.subjects.Subject
    @CheckReturnValue
    @Nullable
    public Throwable getThrowable() {
        Object obj = this.buffer.get();
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    @CheckReturnValue
    @Nullable
    public T getValue() {
        return this.buffer.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    public Object[] getValues() {
        Object[] objArr = EMPTY_ARRAY;
        Object[] values = getValues(objArr);
        return values == objArr ? new Object[0] : values;
    }

    @Override // io.reactivex.rxjava3.subjects.Subject
    @CheckReturnValue
    public boolean hasComplete() {
        return NotificationLite.isComplete(this.buffer.get());
    }

    @Override // io.reactivex.rxjava3.subjects.Subject
    @CheckReturnValue
    public boolean hasObservers() {
        return this.observers.get().length != 0;
    }

    @Override // io.reactivex.rxjava3.subjects.Subject
    @CheckReturnValue
    public boolean hasThrowable() {
        return NotificationLite.isError(this.buffer.get());
    }

    @CheckReturnValue
    public boolean hasValue() {
        return this.buffer.size() != 0;
    }

    @CheckReturnValue
    public int observerCount() {
        return this.observers.get().length;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        Object complete = NotificationLite.complete();
        ReplayBuffer<T> replayBuffer = this.buffer;
        replayBuffer.addFinal(complete);
        for (ReplayDisposable<T> replayDisposable : terminate(complete)) {
            replayBuffer.replay(replayDisposable);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onError(Throwable th) {
        ExceptionHelper.nullCheck(th, "onError called with a null Throwable.");
        if (this.done) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.done = true;
        Object error = NotificationLite.error(th);
        ReplayBuffer<T> replayBuffer = this.buffer;
        replayBuffer.addFinal(error);
        for (ReplayDisposable<T> replayDisposable : terminate(error)) {
            replayBuffer.replay(replayDisposable);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onNext(T t) {
        ExceptionHelper.nullCheck(t, "onNext called with a null value.");
        if (this.done) {
            return;
        }
        ReplayBuffer<T> replayBuffer = this.buffer;
        replayBuffer.add(t);
        for (ReplayDisposable<T> replayDisposable : this.observers.get()) {
            replayBuffer.replay(replayDisposable);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onSubscribe(Disposable disposable) {
        if (this.done) {
            disposable.dispose();
        }
    }

    public void remove(ReplayDisposable<T> replayDisposable) {
        ReplayDisposable<T>[] replayDisposableArr;
        while (true) {
            ReplayDisposable<T>[] replayDisposableArr2 = this.observers.get();
            if (replayDisposableArr2 == TERMINATED || replayDisposableArr2 == EMPTY) {
                return;
            }
            int length = replayDisposableArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (replayDisposableArr2[i] == replayDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                replayDisposableArr = EMPTY;
            } else {
                ReplayDisposable<T>[] replayDisposableArr3 = new ReplayDisposable[length - 1];
                System.arraycopy(replayDisposableArr2, 0, replayDisposableArr3, 0, i);
                System.arraycopy(replayDisposableArr2, i + 1, replayDisposableArr3, i, (length - i) - 1);
                replayDisposableArr = replayDisposableArr3;
            }
            AtomicReference<ReplayDisposable<T>[]> atomicReference = this.observers;
            while (!atomicReference.compareAndSet(replayDisposableArr2, replayDisposableArr)) {
                if (atomicReference.get() != replayDisposableArr2) {
                    break;
                }
            }
            return;
        }
    }

    @CheckReturnValue
    public int size() {
        return this.buffer.size();
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        ReplayDisposable<T> replayDisposable = new ReplayDisposable<>(observer, this);
        observer.onSubscribe(replayDisposable);
        if (add(replayDisposable) && replayDisposable.cancelled) {
            remove(replayDisposable);
        } else {
            this.buffer.replay(replayDisposable);
        }
    }

    public ReplayDisposable<T>[] terminate(Object obj) {
        this.buffer.compareAndSet(null, obj);
        return this.observers.getAndSet(TERMINATED);
    }

    @CheckReturnValue
    public T[] getValues(T[] tArr) {
        return this.buffer.getValues(tArr);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class UnboundedReplayBuffer<T> extends AtomicReference<Object> implements ReplayBuffer<T> {
        private static final long serialVersionUID = -733876083048047795L;
        final List<Object> buffer;
        volatile int size;

        public UnboundedReplayBuffer(int i) {
            this.buffer = new ArrayList(i);
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.ReplayBuffer
        public void add(T t) {
            this.buffer.add(t);
            this.size++;
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.ReplayBuffer
        public void addFinal(Object obj) {
            this.buffer.add(obj);
            trimHead();
            this.size++;
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.ReplayBuffer
        @Nullable
        public T getValue() {
            int i = this.size;
            if (i == 0) {
                return null;
            }
            List<Object> list = this.buffer;
            T t = (T) list.get(i - 1);
            if (!NotificationLite.isComplete(t) && !NotificationLite.isError(t)) {
                return t;
            }
            if (i == 1) {
                return null;
            }
            return (T) list.get(i - 2);
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.ReplayBuffer
        public T[] getValues(T[] tArr) {
            int i = this.size;
            if (i == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            List<Object> list = this.buffer;
            Object obj = list.get(i - 1);
            if ((NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) && i - 1 == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            if (tArr.length < i) {
                tArr = (T[]) ((Object[]) DoubleList$$ExternalSyntheticOutline0.m(tArr, i));
            }
            for (int i2 = 0; i2 < i; i2++) {
                tArr[i2] = list.get(i2);
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.ReplayBuffer
        public void replay(ReplayDisposable<T> replayDisposable) {
            int i;
            if (replayDisposable.getAndIncrement() != 0) {
                return;
            }
            List<Object> list = this.buffer;
            Observer<? super T> observer = replayDisposable.downstream;
            Integer num = (Integer) replayDisposable.index;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
                replayDisposable.index = 0;
            }
            int i2 = 1;
            while (!replayDisposable.cancelled) {
                int i3 = this.size;
                while (i3 != i) {
                    if (replayDisposable.cancelled) {
                        replayDisposable.index = null;
                        return;
                    }
                    Object obj = list.get(i);
                    if (NotificationLite.isComplete(obj)) {
                        observer.onComplete();
                        replayDisposable.index = null;
                        replayDisposable.cancelled = true;
                        return;
                    } else {
                        if (NotificationLite.isError(obj)) {
                            observer.onError(NotificationLite.getError(obj));
                            replayDisposable.index = null;
                            replayDisposable.cancelled = true;
                            return;
                        }
                        observer.onNext(obj);
                        i++;
                    }
                }
                if (i == this.size) {
                    replayDisposable.index = Integer.valueOf(i);
                    i2 = replayDisposable.addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                }
            }
            replayDisposable.index = null;
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.ReplayBuffer
        public int size() {
            int i = this.size;
            if (i == 0) {
                return 0;
            }
            int i2 = i - 1;
            Object obj = this.buffer.get(i2);
            return (NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) ? i2 : i;
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.ReplayBuffer
        public void trimHead() {
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplaySubject<T> create() {
        return new ReplaySubject<>(new UnboundedReplayBuffer(16));
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SizeAndTimeBoundReplayBuffer<T> extends AtomicReference<Object> implements ReplayBuffer<T> {
        private static final long serialVersionUID = -8056260896137901749L;
        volatile TimedNode<Object> head;
        final long maxAge;
        final int maxSize;
        final Scheduler scheduler;
        int size;
        TimedNode<Object> tail;
        final TimeUnit unit;

        public SizeAndTimeBoundReplayBuffer(int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
            this.maxSize = i;
            this.maxAge = j;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            TimedNode<Object> timedNode = new TimedNode<>(null, 0L);
            this.tail = timedNode;
            this.head = timedNode;
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.ReplayBuffer
        public void add(T t) {
            TimedNode<Object> timedNode = new TimedNode<>(t, this.scheduler.now(this.unit));
            TimedNode<Object> timedNode2 = this.tail;
            this.tail = timedNode;
            this.size++;
            timedNode2.set(timedNode);
            trim();
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.ReplayBuffer
        public void addFinal(Object obj) {
            TimedNode<Object> timedNode = new TimedNode<>(obj, Long.MAX_VALUE);
            TimedNode<Object> timedNode2 = this.tail;
            this.tail = timedNode;
            this.size++;
            timedNode2.lazySet(timedNode);
            trimFinal();
        }

        public TimedNode<Object> getHead() {
            TimedNode<Object> timedNode;
            TimedNode<Object> timedNode2 = this.head;
            long now = this.scheduler.now(this.unit) - this.maxAge;
            TimedNode<T> timedNode3 = timedNode2.get();
            while (true) {
                timedNode = timedNode2;
                timedNode2 = timedNode3;
                if (timedNode2 == null || timedNode2.time > now) {
                    break;
                }
                timedNode3 = timedNode2.get();
            }
            return timedNode;
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.ReplayBuffer
        @Nullable
        public T getValue() {
            T t;
            TimedNode<Object> timedNode = this.head;
            TimedNode<Object> timedNode2 = null;
            while (true) {
                TimedNode<T> timedNode3 = timedNode.get();
                if (timedNode3 == null) {
                    break;
                }
                timedNode2 = timedNode;
                timedNode = timedNode3;
            }
            if (timedNode.time >= this.scheduler.now(this.unit) - this.maxAge && (t = (T) timedNode.value) != null) {
                return (NotificationLite.isComplete(t) || NotificationLite.isError(t)) ? (T) timedNode2.value : t;
            }
            return null;
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.ReplayBuffer
        public T[] getValues(T[] tArr) {
            TimedNode<T> head = getHead();
            int size = size(head);
            if (size == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) DoubleList$$ExternalSyntheticOutline0.m(tArr, size));
            }
            for (int i = 0; i != size; i++) {
                head = head.get();
                tArr[i] = head.value;
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.ReplayBuffer
        public void replay(ReplayDisposable<T> replayDisposable) {
            if (replayDisposable.getAndIncrement() != 0) {
                return;
            }
            Observer<? super T> observer = replayDisposable.downstream;
            TimedNode<Object> timedNode = (TimedNode) replayDisposable.index;
            if (timedNode == null) {
                timedNode = getHead();
            }
            int i = 1;
            while (!replayDisposable.cancelled) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    replayDisposable.index = timedNode;
                    i = replayDisposable.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    T t = timedNode2.value;
                    if (NotificationLite.isComplete(t)) {
                        observer.onComplete();
                        replayDisposable.index = null;
                        replayDisposable.cancelled = true;
                        return;
                    } else {
                        if (NotificationLite.isError(t)) {
                            observer.onError(NotificationLite.getError(t));
                            replayDisposable.index = null;
                            replayDisposable.cancelled = true;
                            return;
                        }
                        observer.onNext(t);
                        timedNode = timedNode2;
                    }
                }
            }
            replayDisposable.index = null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
        
            return r1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int size(io.reactivex.rxjava3.subjects.ReplaySubject.TimedNode<java.lang.Object> r2) {
            /*
                r1 = this;
                r1 = 0
            L1:
                r0 = 2147483647(0x7fffffff, float:NaN)
                if (r1 == r0) goto L23
                java.lang.Object r0 = r2.get()
                io.reactivex.rxjava3.subjects.ReplaySubject$TimedNode r0 = (io.reactivex.rxjava3.subjects.ReplaySubject.TimedNode) r0
                if (r0 != 0) goto L1f
                T r2 = r2.value
                boolean r0 = io.reactivex.rxjava3.internal.util.NotificationLite.isComplete(r2)
                if (r0 != 0) goto L1c
                boolean r2 = io.reactivex.rxjava3.internal.util.NotificationLite.isError(r2)
                if (r2 == 0) goto L23
            L1c:
                int r1 = r1 + (-1)
                return r1
            L1f:
                int r1 = r1 + 1
                r2 = r0
                goto L1
            L23:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.subjects.ReplaySubject.SizeAndTimeBoundReplayBuffer.size(io.reactivex.rxjava3.subjects.ReplaySubject$TimedNode):int");
        }

        public void trim() {
            int i = this.size;
            if (i > this.maxSize) {
                this.size = i - 1;
                this.head = this.head.get();
            }
            long now = this.scheduler.now(this.unit) - this.maxAge;
            TimedNode<Object> timedNode = this.head;
            while (this.size > 1) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2.time > now) {
                    this.head = timedNode;
                    return;
                } else {
                    this.size--;
                    timedNode = timedNode2;
                }
            }
            this.head = timedNode;
        }

        public void trimFinal() {
            long now = this.scheduler.now(this.unit) - this.maxAge;
            TimedNode<Object> timedNode = this.head;
            while (true) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2.get() == null) {
                    if (timedNode.value == null) {
                        this.head = timedNode;
                        return;
                    }
                    TimedNode<Object> timedNode3 = new TimedNode<>(null, 0L);
                    timedNode3.lazySet(timedNode.get());
                    this.head = timedNode3;
                    return;
                }
                if (timedNode2.time > now) {
                    if (timedNode.value == null) {
                        this.head = timedNode;
                        return;
                    }
                    TimedNode<Object> timedNode4 = new TimedNode<>(null, 0L);
                    timedNode4.lazySet(timedNode.get());
                    this.head = timedNode4;
                    return;
                }
                timedNode = timedNode2;
            }
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.ReplayBuffer
        public void trimHead() {
            TimedNode<Object> timedNode = this.head;
            if (timedNode.value != null) {
                TimedNode<Object> timedNode2 = new TimedNode<>(null, 0L);
                timedNode2.lazySet(timedNode.get());
                this.head = timedNode2;
            }
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.ReplayBuffer
        public int size() {
            return size(getHead());
        }
    }
}
