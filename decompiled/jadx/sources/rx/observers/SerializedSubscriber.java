package rx.observers;

import rx.Observer;
import rx.Subscriber;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class SerializedSubscriber<T> extends Subscriber<T> {
    private final Observer<T> s;

    public SerializedSubscriber(Subscriber<? super T> subscriber, boolean z) {
        super(subscriber, z);
        this.s = new SerializedObserver(subscriber);
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.s.onCompleted();
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        this.s.onError(th);
    }

    @Override // rx.Observer
    public void onNext(T t) {
        this.s.onNext(t);
    }

    public SerializedSubscriber(Subscriber<? super T> subscriber) {
        this(subscriber, true);
    }
}
