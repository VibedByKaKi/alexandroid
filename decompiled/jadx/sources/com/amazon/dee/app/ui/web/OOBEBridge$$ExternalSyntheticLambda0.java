package com.amazon.dee.app.ui.web;

import com.amazon.dee.app.ui.web.AccountManagementBridge;
import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class OOBEBridge$$ExternalSyntheticLambda0 implements Action1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ OOBEBridge$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public final void mo8903call(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                OOBEBridge.lambda$onActivityResult$0((Void) obj);
                break;
            case 1:
                AccountManagementBridge.RefreshCookiesMethod.lambda$execute$2((Void) obj);
                break;
            case 2:
                AccountManagementBridge.RefreshCookiesMethod.lambda$execute$3((Throwable) obj);
                break;
            case 3:
                AccountManagementBridge.SignOutMethod.lambda$execute$1((Void) obj);
                break;
            case 4:
                AccountManagementBridge.SignOutMethod.lambda$execute$2((Throwable) obj);
                break;
            default:
                OOBEBridge.lambda$onActivityResult$1((Throwable) obj);
                break;
        }
    }
}
