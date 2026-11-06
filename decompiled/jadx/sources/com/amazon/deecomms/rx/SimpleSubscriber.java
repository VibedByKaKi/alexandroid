package com.amazon.deecomms.rx;

import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.common.Constants;
import rx.Subscriber;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class SimpleSubscriber<T> extends Subscriber<T> {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, SimpleSubscriber.class);
    private String errorMsg;

    public SimpleSubscriber(String str) {
        this.errorMsg = str;
    }

    public abstract void onCall(T t);

    @Override // rx.Observer
    public void onError(Throwable th) {
        LOG.e(this.errorMsg, th);
    }

    @Override // rx.Observer
    public void onNext(T t) {
        if (isUnsubscribed()) {
            return;
        }
        onCall(t);
    }

    public SimpleSubscriber() {
        this("");
    }

    @Override // rx.Observer
    public void onCompleted() {
    }
}
