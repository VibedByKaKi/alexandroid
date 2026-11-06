package com.amazon.alexa.identity;

import android.app.Activity;
import rx.functions.Action0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class MAPAccountService$$ExternalSyntheticLambda6 implements Action0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ MAPAccountService$$ExternalSyntheticLambda6(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // rx.functions.Action0
    public final void call() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                MAPAccountService.lambda$scanQRCodeToAcceptInviteObservable$25((Activity) obj);
                break;
            case 1:
                ((MAPIdentityService) obj).lambda$getUser$10();
                break;
            default:
                ((MAPIdentityService) obj).lambda$submitLinkCode$35();
                break;
        }
    }
}
