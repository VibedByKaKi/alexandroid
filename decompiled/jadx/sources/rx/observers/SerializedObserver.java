package rx.observers;

import rx.Observer;
import rx.exceptions.Exceptions;
import rx.internal.operators.NotificationLite;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class SerializedObserver<T> implements Observer<T> {
    private final Observer<? super T> actual;
    private boolean emitting;
    private final NotificationLite<T> nl = NotificationLite.instance();
    private FastList queue;
    private volatile boolean terminated;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class FastList {
        Object[] array;
        int size;

        public void add(Object obj) {
            int i = this.size;
            Object[] objArr = this.array;
            if (objArr == null) {
                objArr = new Object[16];
                this.array = objArr;
            } else if (i == objArr.length) {
                Object[] objArr2 = new Object[(i >> 2) + i];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                this.array = objArr2;
                objArr = objArr2;
            }
            objArr[i] = obj;
            this.size = i + 1;
        }
    }

    public SerializedObserver(Observer<? super T> observer) {
        this.actual = observer;
    }

    @Override // rx.Observer
    public void onCompleted() {
        if (this.terminated) {
            return;
        }
        synchronized (this) {
            try {
                if (this.terminated) {
                    return;
                }
                this.terminated = true;
                if (!this.emitting) {
                    this.emitting = true;
                    this.actual.onCompleted();
                    return;
                }
                FastList fastList = this.queue;
                if (fastList == null) {
                    fastList = new FastList();
                    this.queue = fastList;
                }
                fastList.add(this.nl.completed());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        Exceptions.throwIfFatal(th);
        if (this.terminated) {
            return;
        }
        synchronized (this) {
            try {
                if (this.terminated) {
                    return;
                }
                this.terminated = true;
                if (!this.emitting) {
                    this.emitting = true;
                    this.actual.onError(th);
                    return;
                }
                FastList fastList = this.queue;
                if (fastList == null) {
                    fastList = new FastList();
                    this.queue = fastList;
                }
                fastList.add(this.nl.error(th));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0031, code lost:
    
        continue;
     */
    @Override // rx.Observer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onNext(T r8) {
        /*
            r7 = this;
            boolean r0 = r7.terminated
            if (r0 == 0) goto L5
            return
        L5:
            monitor-enter(r7)
            boolean r0 = r7.terminated     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r8 = move-exception
            goto L77
        Le:
            boolean r0 = r7.emitting     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto L28
            rx.observers.SerializedObserver$FastList r0 = r7.queue     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto L1d
            rx.observers.SerializedObserver$FastList r0 = new rx.observers.SerializedObserver$FastList     // Catch: java.lang.Throwable -> Lc
            r0.<init>()     // Catch: java.lang.Throwable -> Lc
            r7.queue = r0     // Catch: java.lang.Throwable -> Lc
        L1d:
            rx.internal.operators.NotificationLite<T> r1 = r7.nl     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r8 = r1.next(r8)     // Catch: java.lang.Throwable -> Lc
            r0.add(r8)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lc
            return
        L28:
            r0 = 1
            r7.emitting = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lc
            rx.Observer<? super T> r1 = r7.actual     // Catch: java.lang.Throwable -> L6e
            r1.onNext(r8)     // Catch: java.lang.Throwable -> L6e
        L31:
            monitor-enter(r7)
            rx.observers.SerializedObserver$FastList r1 = r7.queue     // Catch: java.lang.Throwable -> L3b
            r2 = 0
            if (r1 != 0) goto L3d
            r7.emitting = r2     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L3b
            return
        L3b:
            r8 = move-exception
            goto L6c
        L3d:
            r3 = 0
            r7.queue = r3     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L3b
            java.lang.Object[] r1 = r1.array
            int r3 = r1.length
        L44:
            if (r2 >= r3) goto L31
            r4 = r1[r2]
            if (r4 != 0) goto L4b
            goto L31
        L4b:
            rx.internal.operators.NotificationLite<T> r5 = r7.nl     // Catch: java.lang.Throwable -> L58
            rx.Observer<? super T> r6 = r7.actual     // Catch: java.lang.Throwable -> L58
            boolean r4 = r5.accept(r6, r4)     // Catch: java.lang.Throwable -> L58
            if (r4 == 0) goto L5a
            r7.terminated = r0     // Catch: java.lang.Throwable -> L58
            return
        L58:
            r1 = move-exception
            goto L5d
        L5a:
            int r2 = r2 + 1
            goto L44
        L5d:
            r7.terminated = r0
            rx.exceptions.Exceptions.throwIfFatal(r1)
            rx.Observer<? super T> r7 = r7.actual
            java.lang.Throwable r8 = rx.exceptions.OnErrorThrowable.addValueAsLastCause(r1, r8)
            r7.onError(r8)
            return
        L6c:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L3b
            throw r8
        L6e:
            r1 = move-exception
            r7.terminated = r0
            rx.Observer<? super T> r7 = r7.actual
            rx.exceptions.Exceptions.throwOrReport(r1, r7, r8)
            return
        L77:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lc
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.observers.SerializedObserver.onNext(java.lang.Object):void");
    }
}
