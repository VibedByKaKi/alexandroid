package com.amazon.dee.sdk.iotsoftap;

import io.reactivex.rxjava3.core.Single;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
/* loaded from: classes5.dex */
public interface RegistrationTokenProvider {
    Single<String> get();
}
