package com.amazon.alexa.device.setup.echo.softap.workflow.manager.echo;

import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class EchoSoftAPWorkflowManager$$ExternalSyntheticLambda0 implements ObservableOnSubscribe {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EchoSoftAPWorkflowManager f$0;

    public /* synthetic */ EchoSoftAPWorkflowManager$$ExternalSyntheticLambda0(EchoSoftAPWorkflowManager echoSoftAPWorkflowManager, int i) {
        this.$r8$classId = i;
        this.f$0 = echoSoftAPWorkflowManager;
    }

    @Override // io.reactivex.rxjava3.core.ObservableOnSubscribe
    public final void subscribe(ObservableEmitter observableEmitter) {
        int i = this.$r8$classId;
        EchoSoftAPWorkflowManager echoSoftAPWorkflowManager = this.f$0;
        switch (i) {
            case 0:
                echoSoftAPWorkflowManager.lambda$evaluateHotSpotDeviceNetworkDisconnect$7(observableEmitter);
                break;
            case 1:
                echoSoftAPWorkflowManager.lambda$connectToAP$5(observableEmitter);
                break;
            default:
                echoSoftAPWorkflowManager.lambda$cancelSetup$6(observableEmitter);
                break;
        }
    }
}
