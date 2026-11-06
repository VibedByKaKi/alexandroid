package com.amazon.alexa.identity;

import com.amazon.alexa.identity.api.UserIdentity;
import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class MAPIdentityService$$ExternalSyntheticLambda2 implements Action1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MAPIdentityService f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ MAPIdentityService$$ExternalSyntheticLambda2(MAPIdentityService mAPIdentityService, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = mAPIdentityService;
        this.f$1 = str;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public final void mo8903call(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$getSessionId$48(this.f$1, (String) obj);
                break;
            case 1:
                this.f$0.lambda$getSessionId$49(this.f$1, (Throwable) obj);
                break;
            case 2:
                this.f$0.lambda$getUser$11(this.f$1, (UserIdentity) obj);
                break;
            default:
                this.f$0.lambda$getUser$12(this.f$1, (Throwable) obj);
                break;
        }
    }
}
