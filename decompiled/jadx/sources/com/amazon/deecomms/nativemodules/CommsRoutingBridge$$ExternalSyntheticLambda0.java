package com.amazon.deecomms.nativemodules;

import com.facebook.react.bridge.Promise;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class CommsRoutingBridge$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CommsRoutingBridge f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Promise f$2;

    public /* synthetic */ CommsRoutingBridge$$ExternalSyntheticLambda0(CommsRoutingBridge commsRoutingBridge, String str, Promise promise, int i) {
        this.$r8$classId = i;
        this.f$0 = commsRoutingBridge;
        this.f$1 = str;
        this.f$2 = promise;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$tryRouteToKidsTabletAddContacts$8(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$tryRouteToKidsTabletCommsSettings$9(this.f$1, this.f$2);
                break;
        }
    }
}
