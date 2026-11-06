package com.amazon.dee.app.ui.main;

import android.app.Activity;
import com.amazon.alexa.identity.api.UserIdentity;
import rx.AsyncEmitter;
import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class LoginForTestUi$$ExternalSyntheticLambda0 implements Action1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ LoginForTestUi$$ExternalSyntheticLambda0(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public final void mo8903call(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                LoginForTestUi.lambda$loginForTesting$0((String) this.f$0, (Activity) this.f$1, (UserIdentity) obj);
                break;
            default:
                ((AuthenticationExceptionHandler) this.f$0).lambda$handle$2((Throwable) this.f$1, (AsyncEmitter) obj);
                break;
        }
    }
}
