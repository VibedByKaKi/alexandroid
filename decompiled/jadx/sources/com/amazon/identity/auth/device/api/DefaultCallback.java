package com.amazon.identity.auth.device.api;

import android.os.Bundle;
import com.amazon.fireos.sdk.annotations.FireOsSdk;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class DefaultCallback implements Callback {

    /* renamed from: a, reason: collision with root package name */
    private static final DefaultCallback f477a = new DefaultCallback();

    public static Callback nullToDefault(Callback callback) {
        return callback == null ? f477a : callback;
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    @FireOsSdk
    public void onError(Bundle bundle) {
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    @FireOsSdk
    public void onSuccess(Bundle bundle) {
    }
}
