package com.amazon.alexa.sharing.sharingsdk;

import com.amazon.alexa.benefits.api.models.BenefitsObserver;
import com.amazon.alexa.benefits.api.models.GetBenefitsEntitlementResponse;
import com.amazon.alexa.digitalcommerce.subscriptions.SubscriptionsManagerDelegate;
import com.amazon.alexa.mobilytics.integration.ama.MobilyticsEntitlementStatusProviderV2Impl;
import com.facebook.react.bridge.Callback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class BenefitsEntitlementAuthority$$ExternalSyntheticLambda0 implements BenefitsObserver {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ BenefitsEntitlementAuthority$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.amazon.alexa.benefits.api.models.BenefitsObserver
    public final void notifyIfChanged(GetBenefitsEntitlementResponse getBenefitsEntitlementResponse) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((BenefitsEntitlementAuthority) obj).lambda$subscribeStatusUpdate$2(getBenefitsEntitlementResponse);
                break;
            case 1:
                SubscriptionsManagerDelegate.subscribeBenefitsEntitlement$lambda$2((Callback) obj, getBenefitsEntitlementResponse);
                break;
            default:
                ((MobilyticsEntitlementStatusProviderV2Impl) obj).lambda$addAsObserver$1(getBenefitsEntitlementResponse);
                break;
        }
    }
}
