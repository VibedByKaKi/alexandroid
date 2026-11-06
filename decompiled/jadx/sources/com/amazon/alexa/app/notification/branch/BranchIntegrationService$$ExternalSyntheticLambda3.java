package com.amazon.alexa.app.notification.branch;

import android.content.Context;
import com.amazon.alexa.app.notification.branch.BranchEventRecorder;
import com.amazon.alexa.app.notification.branch.BranchSdkClient;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class BranchIntegrationService$$ExternalSyntheticLambda3 implements InstallTimeProvider, BranchEventRecorder.SessionReadyListener, BranchSdkClient.SessionCallback {
    public final /* synthetic */ Object f$0;

    public /* synthetic */ BranchIntegrationService$$ExternalSyntheticLambda3(Object obj) {
        this.f$0 = obj;
    }

    @Override // com.amazon.alexa.app.notification.branch.InstallTimeProvider
    public long getFirstInstallTimeMillis() {
        long lambda$new$0;
        lambda$new$0 = BranchHighValueActionService.lambda$new$0((Context) this.f$0);
        return lambda$new$0;
    }

    @Override // com.amazon.alexa.app.notification.branch.BranchSdkClient.SessionCallback
    public void onComplete(JSONObject jSONObject, String str) {
        ((BranchIntegrationService) this.f$0).lambda$createSessionCallback$2(jSONObject, str);
    }

    @Override // com.amazon.alexa.app.notification.branch.BranchEventRecorder.SessionReadyListener
    public void onSessionReady() {
        ((BranchHighValueActionService) this.f$0).retryPendingEvents();
    }
}
