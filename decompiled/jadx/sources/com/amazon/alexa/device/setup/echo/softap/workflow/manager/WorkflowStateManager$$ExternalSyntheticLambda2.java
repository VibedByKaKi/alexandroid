package com.amazon.alexa.device.setup.echo.softap.workflow.manager;

import io.reactivex.rxjava3.functions.Action;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class WorkflowStateManager$$ExternalSyntheticLambda2 implements Action {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ WorkflowStateManager f$0;

    public /* synthetic */ WorkflowStateManager$$ExternalSyntheticLambda2(WorkflowStateManager workflowStateManager, int i) {
        this.$r8$classId = i;
        this.f$0 = workflowStateManager;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        int i = this.$r8$classId;
        WorkflowStateManager workflowStateManager = this.f$0;
        switch (i) {
            case 0:
                workflowStateManager.lambda$evaluateCaptivePortal$11();
                break;
            case 1:
                workflowStateManager.lambda$getWifiNetworks$2();
                break;
            case 2:
                workflowStateManager.lambda$cancelSetup$8();
                break;
            case 3:
                workflowStateManager.lambda$evaluateHotSpotDeviceNetworkDisconnect$14();
                break;
            default:
                workflowStateManager.lambda$connectToWifiNetwork$5();
                break;
        }
    }
}
