package com.amazon.deecomms.nativemodules;

import com.amazon.deecomms.nativemodules.CommsMessagingMediaBridge;
import com.amazon.deecomms.nativemodules.CommsMessagingMediaDelegate;
import rx.functions.Action0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class CommsMessagingMediaBridge$1$$ExternalSyntheticLambda0 implements Action0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CommsMessagingMediaBridge$1$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // rx.functions.Action0
    public final void call() {
        switch (this.$r8$classId) {
            case 0:
                CommsMessagingMediaBridge.AnonymousClass1.lambda$onFeatureUpdate$0();
                break;
            default:
                CommsMessagingMediaDelegate.AnonymousClass1.lambda$onFeatureUpdate$0();
                break;
        }
    }
}
