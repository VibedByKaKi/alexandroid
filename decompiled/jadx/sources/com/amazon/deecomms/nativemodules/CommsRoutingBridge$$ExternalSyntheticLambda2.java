package com.amazon.deecomms.nativemodules;

import android.os.Bundle;
import com.facebook.react.bridge.Promise;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class CommsRoutingBridge$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Bundle f$0;
    public final /* synthetic */ Promise f$1;

    public /* synthetic */ CommsRoutingBridge$$ExternalSyntheticLambda2(Bundle bundle, Promise promise, int i) {
        this.$r8$classId = i;
        this.f$0 = bundle;
        this.f$1 = promise;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                CommsRoutingBridge.lambda$tryRouteToNativeCreateNewConveration$6(this.f$0, this.f$1);
                break;
            case 1:
                CommsRoutingBridge.lambda$tryRouteToNativeStartCall$5(this.f$0, this.f$1);
                break;
            case 2:
                CommsRoutingBridge.lambda$tryRouteToNativeContactList$4(this.f$0, this.f$1);
                break;
            case 3:
                CommsRoutingDelegate.lambda$tryRouteToNativeContactList$4(this.f$0, this.f$1);
                break;
            case 4:
                CommsRoutingDelegate.lambda$tryRouteToNativeStartCall$5(this.f$0, this.f$1);
                break;
            default:
                CommsRoutingDelegate.lambda$tryRouteToNativeCreateNewConveration$6(this.f$0, this.f$1);
                break;
        }
    }
}
