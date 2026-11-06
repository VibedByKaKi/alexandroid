package com.amazon.dee.app.ui.main;

import com.amazon.alexa.identity.MAPAccountService;
import com.amazon.alexa.identity.api.UserIdentity;
import java.util.concurrent.atomic.AtomicReference;
import rx.functions.Action0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class MainViewModel$$ExternalSyntheticLambda16 implements Action0 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ MainViewModel$$ExternalSyntheticLambda16(MAPAccountService mAPAccountService, AtomicReference atomicReference, AtomicReference atomicReference2) {
        this.f$0 = mAPAccountService;
        this.f$2 = atomicReference;
        this.f$1 = atomicReference2;
    }

    @Override // rx.functions.Action0
    public final void call() {
        switch (this.$r8$classId) {
            case 0:
                ((MainViewModel) this.f$0).lambda$scheduleInAppReviewCheckOnHome$8((UserIdentity) this.f$1, (MainViewModel) this.f$2);
                break;
            default:
                ((MAPAccountService) this.f$0).lambda$regularSignIn$7((AtomicReference) this.f$2, (AtomicReference) this.f$1);
                break;
        }
    }

    public /* synthetic */ MainViewModel$$ExternalSyntheticLambda16(MainViewModel mainViewModel, UserIdentity userIdentity, MainViewModel mainViewModel2) {
        this.f$0 = mainViewModel;
        this.f$1 = userIdentity;
        this.f$2 = mainViewModel2;
    }
}
