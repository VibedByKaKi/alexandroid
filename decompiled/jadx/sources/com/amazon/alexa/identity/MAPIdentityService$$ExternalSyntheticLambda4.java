package com.amazon.alexa.identity;

import com.amazon.alexa.identity.api.UserIdentity;
import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class MAPIdentityService$$ExternalSyntheticLambda4 implements Action1 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ MAPIdentityService f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ UserIdentity f$2;

    public /* synthetic */ MAPIdentityService$$ExternalSyntheticLambda4(MAPIdentityService mAPIdentityService, UserIdentity userIdentity, String str) {
        this.f$0 = mAPIdentityService;
        this.f$2 = userIdentity;
        this.f$1 = str;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public final void mo8903call(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$refreshInternal$13(this.f$1, this.f$2, (UserIdentity) obj);
                break;
            default:
                this.f$0.lambda$refreshActorCookies$41(this.f$2, this.f$1, (Throwable) obj);
                break;
        }
    }

    public /* synthetic */ MAPIdentityService$$ExternalSyntheticLambda4(MAPIdentityService mAPIdentityService, String str, UserIdentity userIdentity) {
        this.f$0 = mAPIdentityService;
        this.f$1 = str;
        this.f$2 = userIdentity;
    }
}
