package com.amazon.alexa.identity;

import com.amazon.alexa.identity.MAPIdentityService;
import rx.functions.Action1;
import rx.functions.Func1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class MAPIdentityService$$ExternalSyntheticLambda5 implements Func1, Action1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ MAPIdentityService$$ExternalSyntheticLambda5(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // rx.functions.Func1
    public Object call(Object obj) {
        MAPIdentityService.DomainCookie lambda$refreshCookies$22;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 1:
                lambda$refreshCookies$22 = MAPIdentityService.lambda$refreshCookies$22((String) obj2, (String[]) obj);
                return lambda$refreshCookies$22;
            default:
                return ((UserIdentityMapper) obj2).map((UserIdentityDTO) obj);
        }
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public void mo8903call(Object obj) {
        MAPIdentityService.lambda$refreshInternal$14((String) this.f$0, (Throwable) obj);
    }
}
