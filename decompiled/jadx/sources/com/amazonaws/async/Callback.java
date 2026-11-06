package com.amazonaws.async;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public interface Callback<R> {
    void onError(Exception exc);

    void onResult(R r);
}
