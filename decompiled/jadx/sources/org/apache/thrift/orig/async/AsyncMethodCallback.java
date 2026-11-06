package org.apache.thrift.orig.async;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface AsyncMethodCallback<T> {
    void onComplete(T t);

    void onError(Exception exc);
}
