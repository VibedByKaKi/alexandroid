package com.amazon.identity.auth.device;

import com.amazon.identity.mobi.common.javascript.Promise;
import com.google.android.gms.tasks.OnSuccessListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class o6 implements OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Promise f850a;

    public o6(Promise promise) {
        this.f850a = promise;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            yf.b("AuthenticatorJavaScriptBridge", "Call to isUserVerifyingPlatformAuthenticatorAvailable failed because the Fido method result was null", "isUserVerifyingPlatformAuthenticatorAvailable:NullResult");
            this.f850a.setResult(String.valueOf(false));
        } else {
            yf.b("AuthenticatorJavaScriptBridge", "Call to isUserVerifyingPlatformAuthenticatorAvailable succeeded with result = " + bool, "isUserVerifyingPlatformAuthenticatorAvailable:Success");
            this.f850a.setResult(bool.toString());
        }
    }
}
