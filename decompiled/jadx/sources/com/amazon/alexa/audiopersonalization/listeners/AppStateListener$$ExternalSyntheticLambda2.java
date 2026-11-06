package com.amazon.alexa.audiopersonalization.listeners;

import com.amazon.alexa.audiopersonalization.api.ErrorMessageDelegate;
import com.amazon.alexa.audiopersonalization.api.SuccessDelegate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class AppStateListener$$ExternalSyntheticLambda2 implements SuccessDelegate, ErrorMessageDelegate {
    public final /* synthetic */ AppStateListener f$0;

    public /* synthetic */ AppStateListener$$ExternalSyntheticLambda2(AppStateListener appStateListener) {
        this.f$0 = appStateListener;
    }

    @Override // com.amazon.alexa.audiopersonalization.api.ErrorMessageDelegate
    public void onError(Throwable th) {
        this.f$0.lambda$sendMpeSupport$2(th);
    }

    @Override // com.amazon.alexa.audiopersonalization.api.SuccessDelegate
    public void onSuccess(Object obj) {
        this.f$0.lambda$sendMpeSupport$1((Boolean) obj);
    }
}
