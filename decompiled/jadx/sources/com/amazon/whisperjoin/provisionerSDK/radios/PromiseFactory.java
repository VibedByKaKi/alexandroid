package com.amazon.whisperjoin.provisionerSDK.radios;

import java.util.concurrent.Future;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public interface PromiseFactory<TResult> {
    Future<TResult> getFuture();
}
