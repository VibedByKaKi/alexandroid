package com.amazon.identity.auth.device;

import com.amazon.identity.mobi.common.javascript.JavaScriptBridgeCommon;
import com.amazon.identity.mobi.common.javascript.Promise;
import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class l6 implements OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Promise f784a;

    public l6(Promise promise) {
        this.f784a = promise;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f784a.setResultWithError(JavaScriptBridgeCommon.GENERAL_ERROR, "Exception occurred while calling Fido API");
    }
}
