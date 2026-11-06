package com.amazon.deecomms.nativemodules;

import com.facebook.react.bridge.Promise;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class CommsRoutingDelegate$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CommsRoutingDelegate f$0;
    public final /* synthetic */ Promise f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ CommsRoutingDelegate$$ExternalSyntheticLambda3(CommsRoutingDelegate commsRoutingDelegate, Promise promise, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = commsRoutingDelegate;
        this.f$1 = promise;
        this.f$2 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$tryRouteToParentDashboardContacts$8(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$tryRouteToConversation$0(this.f$1, this.f$2);
                break;
        }
    }
}
