package com.amazon.alexa.device.setup.echo.softap.thrift;

import com.amazon.alexa.device.setup.echo.softap.workflow.data.WorkflowStateData;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class ThriftClientImpl$$ExternalSyntheticLambda1 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ThriftClientImpl f$0;

    public /* synthetic */ ThriftClientImpl$$ExternalSyntheticLambda1(ThriftClientImpl thriftClientImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = thriftClientImpl;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List lambda$getScanList$26;
        List lambda$getKnownList$27;
        WorkflowStateData lambda$evaluateCaptivePortal$21;
        WorkflowStateData lambda$completeSetup$22;
        WorkflowStateData lambda$getOtaDetails$16;
        WorkflowStateData lambda$getLinkCode$11;
        int i = this.$r8$classId;
        ThriftClientImpl thriftClientImpl = this.f$0;
        switch (i) {
            case 0:
                lambda$getScanList$26 = thriftClientImpl.lambda$getScanList$26();
                return lambda$getScanList$26;
            case 1:
                lambda$getKnownList$27 = thriftClientImpl.lambda$getKnownList$27();
                return lambda$getKnownList$27;
            case 2:
                lambda$evaluateCaptivePortal$21 = thriftClientImpl.lambda$evaluateCaptivePortal$21();
                return lambda$evaluateCaptivePortal$21;
            case 3:
                lambda$completeSetup$22 = thriftClientImpl.lambda$completeSetup$22();
                return lambda$completeSetup$22;
            case 4:
                lambda$getOtaDetails$16 = thriftClientImpl.lambda$getOtaDetails$16();
                return lambda$getOtaDetails$16;
            default:
                lambda$getLinkCode$11 = thriftClientImpl.lambda$getLinkCode$11();
                return lambda$getLinkCode$11;
        }
    }
}
