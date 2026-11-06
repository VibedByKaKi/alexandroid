package com.amazon.deecomms.nativemodules;

import android.content.Context;
import com.facebook.react.bridge.Promise;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class CommsRoutingBridge$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Context f$0;
    public final /* synthetic */ Promise f$1;

    public /* synthetic */ CommsRoutingBridge$$ExternalSyntheticLambda1(Context context, Promise promise, int i) {
        this.$r8$classId = i;
        this.f$0 = context;
        this.f$1 = promise;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                CommsRoutingBridge.lambda$tryRouteToAppSettings$3(this.f$0, this.f$1);
                break;
            default:
                CommsRoutingDelegate.lambda$tryRouteToAppSettings$3(this.f$0, this.f$1);
                break;
        }
    }
}
