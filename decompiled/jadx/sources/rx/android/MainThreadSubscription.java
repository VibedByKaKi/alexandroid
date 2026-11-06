package rx.android;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.Single$$ExternalSyntheticBUOutline0;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public abstract class MainThreadSubscription implements Subscription {
    private final AtomicBoolean unsubscribed = new AtomicBoolean();

    public static void verifyMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m(Thread.currentThread().getName(), "Expected to be called on the main thread but was ");
    }

    @Override // rx.Subscription
    public final boolean isUnsubscribed() {
        return this.unsubscribed.get();
    }

    public abstract void onUnsubscribe();

    @Override // rx.Subscription
    public final void unsubscribe() {
        if (this.unsubscribed.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                onUnsubscribe();
            } else {
                AndroidSchedulers.mainThread().createWorker().schedule(new Action0() { // from class: rx.android.MainThreadSubscription.1
                    @Override // rx.functions.Action0
                    public void call() {
                        MainThreadSubscription.this.onUnsubscribe();
                    }
                });
            }
        }
    }
}
