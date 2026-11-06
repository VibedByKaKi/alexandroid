package com.amazon.alexa.accessory.repositories.state.plugins;

import com.amazon.alexa.accessory.internal.monitor.RemoteNotificationMonitor;
import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.core.SingleEmitter;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class RemoteNotificationPlugin$$ExternalSyntheticLambda0 implements RemoteNotificationMonitor.Observer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RemoteNotificationPlugin f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ RemoteNotificationPlugin$$ExternalSyntheticLambda0(RemoteNotificationPlugin remoteNotificationPlugin, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = remoteNotificationPlugin;
        this.f$1 = obj;
    }

    @Override // com.amazon.alexa.accessory.internal.monitor.RemoteNotificationMonitor.Observer
    public final void onRemoteNotification(Set set) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$queryState$0((FlowableEmitter) this.f$1, set);
                break;
            default:
                this.f$0.lambda$getState$3((SingleEmitter) this.f$1, set);
                break;
        }
    }
}
