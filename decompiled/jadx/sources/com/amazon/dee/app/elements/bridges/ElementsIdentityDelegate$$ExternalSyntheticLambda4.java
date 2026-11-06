package com.amazon.dee.app.elements.bridges;

import com.facebook.react.bridge.Promise;
import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ElementsIdentityDelegate$$ExternalSyntheticLambda4 implements Action1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ElementsIdentityDelegate f$0;
    public final /* synthetic */ Promise f$1;

    public /* synthetic */ ElementsIdentityDelegate$$ExternalSyntheticLambda4(ElementsIdentityDelegate elementsIdentityDelegate, Promise promise, int i) {
        this.$r8$classId = i;
        this.f$0 = elementsIdentityDelegate;
        this.f$1 = promise;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public final void mo8903call(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$getCookies$7(this.f$1, (String[]) obj);
                break;
            default:
                this.f$0.lambda$getActorCookies$9(this.f$1, (String[]) obj);
                break;
        }
    }
}
