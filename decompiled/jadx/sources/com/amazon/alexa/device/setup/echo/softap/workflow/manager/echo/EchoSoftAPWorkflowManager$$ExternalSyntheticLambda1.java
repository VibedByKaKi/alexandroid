package com.amazon.alexa.device.setup.echo.softap.workflow.manager.echo;

import com.amazon.alexa.device.setup.echo.softap.workflow.data.WorkflowStateData;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class EchoSoftAPWorkflowManager$$ExternalSyntheticLambda1 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EchoSoftAPWorkflowManager f$0;

    public /* synthetic */ EchoSoftAPWorkflowManager$$ExternalSyntheticLambda1(EchoSoftAPWorkflowManager echoSoftAPWorkflowManager, int i) {
        this.$r8$classId = i;
        this.f$0 = echoSoftAPWorkflowManager;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        ObservableSource lambda$connectAndSetLocaleEndpoints$0;
        ObservableSource lambda$connectToAP$3;
        ObservableSource lambda$connectToAP$4;
        int i = this.$r8$classId;
        EchoSoftAPWorkflowManager echoSoftAPWorkflowManager = this.f$0;
        WorkflowStateData workflowStateData = (WorkflowStateData) obj;
        switch (i) {
            case 0:
                lambda$connectAndSetLocaleEndpoints$0 = echoSoftAPWorkflowManager.lambda$connectAndSetLocaleEndpoints$0(workflowStateData);
                return lambda$connectAndSetLocaleEndpoints$0;
            case 1:
                lambda$connectToAP$3 = echoSoftAPWorkflowManager.lambda$connectToAP$3(workflowStateData);
                return lambda$connectToAP$3;
            default:
                lambda$connectToAP$4 = echoSoftAPWorkflowManager.lambda$connectToAP$4(workflowStateData);
                return lambda$connectToAP$4;
        }
    }
}
