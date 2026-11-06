package com.amazon.deecomms.nativemodules;

import android.app.Activity;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class CommsRoutingBridge$$ExternalSyntheticLambda5 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Promise f$2;

    public /* synthetic */ CommsRoutingBridge$$ExternalSyntheticLambda5(Object obj, Promise promise, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = promise;
        this.f$1 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((CommsRoutingBridge) this.f$0).lambda$tryRouteToOOBE$7((ReadableMap) this.f$1, this.f$2);
                break;
            case 1:
                ((ContactsManagerBridge) this.f$0).lambda$updatePhoneContact$4(this.f$2, (PhoneContactUpdate) this.f$1);
                break;
            case 2:
                CommsRoutingBridge.lambda$tryRouteToConversation$0((Activity) this.f$0, (String) this.f$1, this.f$2);
                break;
            default:
                ((CommsRoutingDelegate) this.f$0).lambda$tryRouteToOOBE$7(this.f$2, (ReadableMap) this.f$1);
                break;
        }
    }

    public /* synthetic */ CommsRoutingBridge$$ExternalSyntheticLambda5(Object obj, Object obj2, Promise promise, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = promise;
    }
}
