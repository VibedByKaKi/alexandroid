package rx.internal.util;

import rx.Notification;
import rx.Observer;
import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class ActionNotificationObserver<T> implements Observer<T> {
    final Action1<Notification<? super T>> onNotification;

    public ActionNotificationObserver(Action1<Notification<? super T>> action1) {
        this.onNotification = action1;
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.onNotification.mo8903call(Notification.createOnCompleted());
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        this.onNotification.mo8903call(Notification.createOnError(th));
    }

    @Override // rx.Observer
    public void onNext(T t) {
        this.onNotification.mo8903call(Notification.createOnNext(t));
    }
}
