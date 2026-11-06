package com.amazon.identity.auth.device;

import android.os.Bundle;
import android.util.Log;
import com.amazon.identity.auth.device.api.Callback;
import com.amazon.identity.kcpsdk.auth.RegisterDeviceErrorType;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class r1 implements Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RegisterDeviceErrorType f910a;

    public r1(RegisterDeviceErrorType registerDeviceErrorType) {
        this.f910a = registerDeviceErrorType;
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public final void onError(Bundle bundle) {
        Log.e(yf.a("AccountRegistrar"), "Got error while deregistering device in response to error : " + this.f910a.name());
        int i = bundle.getInt("com.amazon.dcp.sso.ErrorCode", -1);
        String string = bundle.getString("com.amazon.dcp.sso.ErrorMessage");
        Log.e(yf.a("AccountRegistrar"), a$$ExternalSyntheticOutline0.m(i, "Error Code: "));
        Log.e(yf.a("AccountRegistrar"), "Error message: " + string);
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public final void onSuccess(Bundle bundle) {
        if (bundle.containsKey("com.amazon.dcp.sso.ErrorCode")) {
            onError(bundle);
            return;
        }
        Log.e(yf.a("AccountRegistrar"), "Finished deregistering device in response to error : " + this.f910a.name());
    }
}
