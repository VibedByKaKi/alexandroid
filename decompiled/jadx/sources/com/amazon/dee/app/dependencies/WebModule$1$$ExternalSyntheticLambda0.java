package com.amazon.dee.app.dependencies;

import com.amazon.dee.app.dependencies.WebModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final /* synthetic */ class WebModule$1$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ WebModule.AnonymousClass1 f$0;

    public /* synthetic */ WebModule$1$$ExternalSyntheticLambda0(WebModule.AnonymousClass1 anonymousClass1, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        WebModule.AnonymousClass1 anonymousClass1 = this.f$0;
        switch (i) {
            case 0:
                anonymousClass1.lambda$notifyLoadingDialogDismissed$9();
                break;
            default:
                anonymousClass1.lambda$onWebAppReady$8();
                break;
        }
    }
}
