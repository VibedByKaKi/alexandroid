package com.amazon.alexa.device.setup.echo.softap.workflow.manager;

import com.amazon.alexa.device.setup.echo.softap.workflow.data.WorkflowStateData;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class WorkflowStateManager$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ WorkflowStateManager f$0;

    public /* synthetic */ WorkflowStateManager$$ExternalSyntheticLambda0(WorkflowStateManager workflowStateManager, int i) {
        this.$r8$classId = i;
        this.f$0 = workflowStateManager;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        WorkflowStateManager workflowStateManager = this.f$0;
        switch (i) {
            case 0:
                workflowStateManager.lambda$evaluateCaptivePortal$9((WorkflowStateData) obj);
                break;
            case 1:
                workflowStateManager.lambda$getWifiNetworks$1((Throwable) obj);
                break;
            case 2:
                workflowStateManager.lambda$autoConnectToEcho$15((Boolean) obj);
                break;
            case 3:
                workflowStateManager.lambda$autoConnectToEcho$16((Throwable) obj);
                break;
            case 4:
                workflowStateManager.lambda$cancelSetup$6((WorkflowStateData) obj);
                break;
            case 5:
                workflowStateManager.lambda$cancelSetup$7((Throwable) obj);
                break;
            case 6:
                workflowStateManager.lambda$evaluateCaptivePortal$10((Throwable) obj);
                break;
            case 7:
                workflowStateManager.lambda$evaluateHotSpotDeviceNetworkDisconnect$12((WorkflowStateData) obj);
                break;
            case 8:
                workflowStateManager.lambda$evaluateHotSpotDeviceNetworkDisconnect$13((Throwable) obj);
                break;
            case 9:
                workflowStateManager.lambda$connectToWifiNetwork$3((WorkflowStateData) obj);
                break;
            case 10:
                workflowStateManager.lambda$connectToWifiNetwork$4((Throwable) obj);
                break;
            default:
                workflowStateManager.lambda$getWifiNetworks$0((WorkflowStateData) obj);
                break;
        }
    }
}
