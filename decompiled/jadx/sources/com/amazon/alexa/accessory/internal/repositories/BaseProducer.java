package com.amazon.alexa.accessory.internal.repositories;

import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.repositories.Producer;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public abstract class BaseProducer<E> implements Producer<E> {
    private E handler;

    @Override // com.amazon.alexa.accessory.repositories.Producer
    public final void attachActionHandler(E e) {
        Preconditions.mainThread();
        Preconditions.notNull(e, "handler");
        if (this.handler == null) {
            this.handler = e;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("Action handle is already attached!");
        }
    }

    @Override // com.amazon.alexa.accessory.repositories.Producer
    public final void detachActionHandler(E e) {
        Preconditions.mainThread();
        Preconditions.notNull(e, "handler");
        if (this.handler == e) {
            this.handler = null;
        }
    }

    public final E getHandler() {
        E e = this.handler;
        if (e != null) {
            return e;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Action handler is not attached!");
        return null;
    }
}
