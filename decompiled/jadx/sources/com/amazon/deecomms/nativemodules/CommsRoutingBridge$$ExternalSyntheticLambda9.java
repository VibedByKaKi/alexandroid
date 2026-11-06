package com.amazon.deecomms.nativemodules;

import com.facebook.react.bridge.Promise;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class CommsRoutingBridge$$ExternalSyntheticLambda9 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Promise f$0;

    public /* synthetic */ CommsRoutingBridge$$ExternalSyntheticLambda9(int i, Promise promise) {
        this.$r8$classId = i;
        this.f$0 = promise;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Promise promise = this.f$0;
        switch (i) {
            case 0:
                CommsRoutingBridge.lambda$tryRouteToDiagnostics$2(promise);
                break;
            default:
                CommsRoutingDelegate.lambda$tryRouteToDiagnostics$2(promise);
                break;
        }
    }
}
