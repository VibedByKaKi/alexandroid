package com.amazon.alexa.accessory.repositories.state.plugins;

import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.core.FlowableOnSubscribe;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class RemoteNotificationPlugin$$ExternalSyntheticLambda2 implements FlowableOnSubscribe, SingleOnSubscribe {
    public final /* synthetic */ RemoteNotificationPlugin f$0;

    public /* synthetic */ RemoteNotificationPlugin$$ExternalSyntheticLambda2(RemoteNotificationPlugin remoteNotificationPlugin) {
        this.f$0 = remoteNotificationPlugin;
    }

    @Override // io.reactivex.rxjava3.core.FlowableOnSubscribe
    public void subscribe(FlowableEmitter flowableEmitter) {
        this.f$0.lambda$queryState$2(flowableEmitter);
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        this.f$0.lambda$getState$5(singleEmitter);
    }
}
