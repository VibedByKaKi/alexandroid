package com.amazon.alexa.identity;

import com.amazon.alexa.benefits.storage.BenefitsRepository;
import com.amazon.alexa.eventbus.api.MultiFilterSubscriber;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer;
import com.amazon.dee.app.elements.bridges.ElementsIdentityDelegate;
import com.amazon.dee.app.elements.bridges.IdentityModule;
import com.facebook.react.bridge.Promise;
import java.util.concurrent.atomic.AtomicReference;
import rx.functions.Action0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class MAPAccountService$$ExternalSyntheticLambda1 implements Action0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ MAPAccountService$$ExternalSyntheticLambda1(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // rx.functions.Action0
    public final void call() {
        switch (this.$r8$classId) {
            case 0:
                ((MAPAccountService) this.f$0).lambda$handleBootstrapInvitationSignInChosenUserRefresh$28((MultiFilterSubscriber) this.f$1);
                break;
            case 1:
                ((BenefitsRepository) this.f$0).lambda$processBackgroundBenefitsCallbackQueue$3((Throwable) this.f$1);
                break;
            case 2:
                ((MAPAccountService) this.f$0).lambda$regularSignIn$6((AtomicReference) this.f$1);
                break;
            case 3:
                ((MAPAccountService) this.f$0).lambda$signInWithBootstrap$16((MobilyticsMetricsTimer) this.f$1);
                break;
            case 4:
                ((MAPIdentityService) this.f$0).lambda$submitLinkCode$37((MobilyticsMetricsTimer) this.f$1);
                break;
            case 5:
                ((ElementsIdentityDelegate) this.f$0).lambda$signOut$4((Promise) this.f$1);
                break;
            default:
                ((IdentityModule) this.f$0).lambda$signOut$0((Promise) this.f$1);
                break;
        }
    }
}
