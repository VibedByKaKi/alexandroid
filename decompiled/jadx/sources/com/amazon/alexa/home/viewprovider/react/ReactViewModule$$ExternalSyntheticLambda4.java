package com.amazon.alexa.home.viewprovider.react;

import android.os.Bundle;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class ReactViewModule$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ReactViewModule f$0;
    public final /* synthetic */ Bundle f$1;
    public final /* synthetic */ boolean f$2;

    public /* synthetic */ ReactViewModule$$ExternalSyntheticLambda4(ReactViewModule reactViewModule, Bundle bundle, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = reactViewModule;
        this.f$1 = bundle;
        this.f$2 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$startReactView$3(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$startReactView$2(this.f$1, this.f$2);
                break;
        }
    }
}
