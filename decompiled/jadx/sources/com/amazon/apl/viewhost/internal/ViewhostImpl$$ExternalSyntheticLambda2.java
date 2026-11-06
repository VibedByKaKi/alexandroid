package com.amazon.apl.viewhost.internal;

import com.amazon.apl.viewhost.Viewhost;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class ViewhostImpl$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Viewhost.ExtensionEventHandlerCallback f$0;

    public /* synthetic */ ViewhostImpl$$ExternalSyntheticLambda2(Viewhost.ExtensionEventHandlerCallback extensionEventHandlerCallback, int i) {
        this.$r8$classId = i;
        this.f$0 = extensionEventHandlerCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Viewhost.ExtensionEventHandlerCallback extensionEventHandlerCallback = this.f$0;
        switch (i) {
            case 0:
                extensionEventHandlerCallback.onComplete();
                break;
            case 1:
                extensionEventHandlerCallback.onTerminated();
                break;
            default:
                extensionEventHandlerCallback.onComplete();
                break;
        }
    }
}
