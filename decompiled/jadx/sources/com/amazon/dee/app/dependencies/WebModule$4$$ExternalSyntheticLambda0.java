package com.amazon.dee.app.dependencies;

import com.amazon.dee.app.dependencies.WebModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final /* synthetic */ class WebModule$4$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ WebModule.AnonymousClass4 f$0;

    public /* synthetic */ WebModule$4$$ExternalSyntheticLambda0(WebModule.AnonymousClass4 anonymousClass4, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        WebModule.AnonymousClass4 anonymousClass4 = this.f$0;
        switch (i) {
            case 0:
                anonymousClass4.lambda$reload$3();
                break;
            case 1:
                anonymousClass4.lambda$clearHistory$2();
                break;
            default:
                anonymousClass4.lambda$clearCache$1();
                break;
        }
    }
}
