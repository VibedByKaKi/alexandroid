package com.amazon.alexa.app.notification.branch;

import com.amazon.alexa.app.notification.branch.BranchConsentService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class BranchIntegrationService$$ExternalSyntheticLambda1 implements BranchConsentService.ConsentListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ BranchIntegrationService$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.amazon.alexa.app.notification.branch.BranchConsentService.ConsentListener
    public final void onConsentStateChanged(BranchConsentService.ConsentState consentState) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((BranchIntegrationService) obj).onConsentStateChanged(consentState);
                break;
            default:
                ((BranchHighValueActionService) obj).onConsentStateChanged(consentState);
                break;
        }
    }
}
