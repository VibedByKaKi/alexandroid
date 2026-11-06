package rx.observers;

import rx.Observer;
import rx.Single$$ExternalSyntheticBUOutline0;
import rx.Subscriber;
import rx.exceptions.OnErrorNotImplementedException;
import rx.functions.Action0;
import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class Subscribers {
    private Subscribers() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Subscriber<T> create(final Action1<? super T> action1, final Action1<Throwable> action12, final Action0 action0) {
        if (action1 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("onNext can not be null");
            return null;
        }
        if (action12 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("onError can not be null");
            return null;
        }
        if (action0 != null) {
            return new Subscriber<T>() { // from class: rx.observers.Subscribers.4
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

    public static <T> Subscriber<T> empty() {
        return from(Observers.empty());
    }

    public static <T> Subscriber<T> from(final Observer<? super T> observer) {
        return new Subscriber<T>() { // from class: rx.observers.Subscribers.1
            @Override // rx.Observer
            public void onCompleted() {
                Observer.this.onCompleted();
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                Observer.this.onError(th);
            }

            @Override // rx.Observer
            public void onNext(T t) {
                Observer.this.onNext(t);
            }
        };
    }

    public static <T> Subscriber<T> wrap(final Subscriber<? super T> subscriber) {
        return new Subscriber<T>(subscriber) { // from class: rx.observers.Subscribers.5
            @Override // rx.Observer
            public void onCompleted() {
                subscriber.onCompleted();
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                subscriber.onError(th);
            }

            @Override // rx.Observer
            public void onNext(T t) {
                subscriber.onNext(t);
            }
        };
    }

    public static <T> Subscriber<T> create(final Action1<? super T> action1, final Action1<Throwable> action12) {
        if (action1 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("onNext can not be null");
            return null;
        }
        if (action12 != null) {
            return new Subscriber<T>() { // from class: rx.observers.Subscribers.3
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

    public static <T> Subscriber<T> create(final Action1<? super T> action1) {
        if (action1 != null) {
            return new Subscriber<T>() { // from class: rx.observers.Subscribers.2
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
