package com.amazon.alexa.accessory.repositories.state.plugins;

import com.amazon.alexa.accessory.internal.monitor.A2dpPlayingMonitor;
import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.core.SingleEmitter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class A2dpPlayingPlugin$$ExternalSyntheticLambda1 implements A2dpPlayingMonitor.Observer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ A2dpPlayingPlugin$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.amazon.alexa.accessory.internal.monitor.A2dpPlayingMonitor.Observer
    public final void onA2dpPlayingState(boolean z) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                A2dpPlayingPlugin.lambda$getState$3((SingleEmitter) obj, z);
                break;
            default:
                A2dpPlayingPlugin.lambda$queryState$0((FlowableEmitter) obj, z);
                break;
        }
    }
}
