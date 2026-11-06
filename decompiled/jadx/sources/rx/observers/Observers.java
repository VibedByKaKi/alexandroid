package rx.observers;

import rx.Observer;
import rx.Single$$ExternalSyntheticBUOutline0;
import rx.exceptions.OnErrorNotImplementedException;
import rx.functions.Action0;
import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class Observers {
    private static final Observer<Object> EMPTY = new Observer<Object>() { // from class: rx.observers.Observers.1
        @Override // rx.Observer
        public final void onError(Throwable th) {
            throw new OnErrorNotImplementedException(th);
        }

        @Override // rx.Observer
        public final void onNext(Object obj) {
        }

        @Override // rx.Observer
        public final void onCompleted() {
        }
    };

    private Observers() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Observer<T> create(final Action1<? super T> action1, final Action1<Throwable> action12, final Action0 action0) {
        if (action1 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("onNext can not be null");
            return null;
        }
        if (action12 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("onError can not be null");
            return null;
        }
        if (action0 != null) {
            return new Observer<T>() { // from class: rx.observers.Observers.4
                @Override // rx.Observer
                public final void onCompleted() {
                    Action0.this.call();
                }

                @Override // rx.Observer
                public final void onError(Throwable th) {
                    action12.mo8903call(th);
                }

                @Override // rx.Observer
                public final void onNext(T t) {
                    action1.mo8903call(t);
                }
            };
        }
        Single$$ExternalSyntheticBUOutline0.m$3("onComplete can not be null");
        return null;
    }

    public static <T> Observer<T> empty() {
        return (Observer<T>) EMPTY;
    }

    public static <T> Observer<T> create(final Action1<? super T> action1, final Action1<Throwable> action12) {
        if (action1 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("onNext can not be null");
            return null;
        }
        if (action12 != null) {
            return new Observer<T>() { // from class: rx.observers.Observers.3
                @Override // rx.Observer
                public final void onError(Throwable th) {
                    Action1.this.mo8903call(th);
                }

                @Override // rx.Observer
                public final void onNext(T t) {
                    action1.mo8903call(t);
                }

                @Override // rx.Observer
                public final void onCompleted() {
                }
            };
        }
        Single$$ExternalSyntheticBUOutline0.m$3("onError can not be null");
        return null;
    }

    public static <T> Observer<T> create(final Action1<? super T> action1) {
        if (action1 != null) {
            return new Observer<T>() { // from class: rx.observers.Observers.2
                @Override // rx.Observer
                public final void onError(Throwable th) {
                    throw new OnErrorNotImplementedException(th);
                }

                @Override // rx.Observer
                public final void onNext(T t) {
                    Action1.this.mo8903call(t);
                }

                @Override // rx.Observer
                public final void onCompleted() {
                }
            };
        }
        Single$$ExternalSyntheticBUOutline0.m$3("onNext can not be null");
        return null;
    }
}
