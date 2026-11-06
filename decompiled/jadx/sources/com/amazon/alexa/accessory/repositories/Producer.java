package com.amazon.alexa.accessory.repositories;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface Producer<E> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Result<T> {
        void complete(T t);

        void completeWithError(Throwable th);
    }

    void attachActionHandler(E e);

    void detachActionHandler(E e);
}
