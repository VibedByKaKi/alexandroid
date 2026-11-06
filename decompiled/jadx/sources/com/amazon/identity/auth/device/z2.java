package com.amazon.identity.auth.device;

import android.os.Bundle;
import android.util.Log;
import com.amazon.identity.auth.device.api.Callback;
import com.amazon.identity.auth.device.api.MAPError;
import com.amazon.identity.auth.device.api.MAPErrorCallbackHelper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class z2 implements Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q7 f1102a;

    public z2(q7 q7Var) {
        this.f1102a = q7Var;
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public final void onError(Bundle bundle) {
        Log.e(yf.a("ActorUpdatePinHelper"), "Cannot get actor access token before completing update pin flow");
        this.f1102a.onError(MAPErrorCallbackHelper.getErrorBundleForActorAPI(MAPError.ActorError.GET_ACTOR_ACCESS_TOKEN_FAILED, "Cannot get actor access token before completing update pin flow", true));
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public final void onSuccess(Bundle bundle) {
        fp.a(new y2(this, bundle));
    }
}
