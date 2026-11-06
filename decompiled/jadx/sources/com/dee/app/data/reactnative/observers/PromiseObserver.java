package com.dee.app.data.reactnative.observers;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import rx.Observer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PromiseObserver implements Observer<WritableMap> {

    @NonNull
    private final Promise promise;

    public PromiseObserver(@NonNull Promise promise) {
        this.promise = promise;
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        this.promise.reject(th);
    }

    @Override // rx.Observer
    public void onNext(WritableMap writableMap) {
        this.promise.resolve(writableMap);
    }

    @Override // rx.Observer
    public void onCompleted() {
    }
}
