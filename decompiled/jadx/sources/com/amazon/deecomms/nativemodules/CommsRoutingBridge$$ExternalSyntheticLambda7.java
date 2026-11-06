package com.amazon.deecomms.nativemodules;

import com.facebook.react.bridge.Promise;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class CommsRoutingBridge$$ExternalSyntheticLambda7 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Promise f$2;

    public /* synthetic */ CommsRoutingBridge$$ExternalSyntheticLambda7(String str, String str2, Promise promise, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = promise;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                CommsRoutingBridge.lambda$tryRouteToWhitelistContact$1(this.f$0, this.f$1, this.f$2);
                break;
            default:
                CommsRoutingDelegate.lambda$tryRouteToAllowlistContact$1(this.f$0, this.f$1, this.f$2);
                break;
        }
    }
}
