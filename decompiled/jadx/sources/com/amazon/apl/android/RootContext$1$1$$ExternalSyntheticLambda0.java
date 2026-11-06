package com.amazon.apl.android;

import com.amazon.apl.android.RootContext;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class RootContext$1$1$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RootContext.AnonymousClass1.C01481 f$0;

    public /* synthetic */ RootContext$1$1$$ExternalSyntheticLambda0(RootContext.AnonymousClass1.C01481 c01481, int i) {
        this.$r8$classId = i;
        this.f$0 = c01481;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        RootContext.AnonymousClass1.C01481 c01481 = this.f$0;
        switch (i) {
            case 0:
                c01481.lambda$onSuccess$0();
                break;
            default:
                c01481.lambda$onFailure$1();
                break;
        }
    }
}
