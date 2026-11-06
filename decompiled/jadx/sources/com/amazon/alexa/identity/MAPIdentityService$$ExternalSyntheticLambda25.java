package com.amazon.alexa.identity;

import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class MAPIdentityService$$ExternalSyntheticLambda25 implements Action1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MAPIdentityService f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ MAPIdentityService$$ExternalSyntheticLambda25(MAPIdentityService mAPIdentityService, String str, String str2, int i) {
        this.$r8$classId = i;
        this.f$0 = mAPIdentityService;
        this.f$1 = str;
        this.f$2 = str2;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public final void mo8903call(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$getCookiesFromDirectedId$38(this.f$1, this.f$2, (String[]) obj);
                break;
            case 1:
                this.f$0.lambda$getCookiesFromDirectedId$39(this.f$1, this.f$2, (Throwable) obj);
                break;
            case 2:
                this.f$0.lambda$getActorCookies$43(this.f$1, this.f$2, (String[]) obj);
                break;
            default:
                this.f$0.lambda$getActorCookies$44(this.f$1, this.f$2, (Throwable) obj);
                break;
        }
    }
}
