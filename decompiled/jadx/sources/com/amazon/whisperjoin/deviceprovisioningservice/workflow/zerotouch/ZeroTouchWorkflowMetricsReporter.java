package com.amazon.whisperjoin.deviceprovisioningservice.workflow.zerotouch;

import com.amazon.whisperjoin.deviceprovisioningservice.metrics.FFSProvisioningServiceMetricsRecorder;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.state.ZeroTouchWorkflowUpdate;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ZeroTouchWorkflowMetricsReporter implements Consumer<ZeroTouchWorkflowUpdate> {
    private final FFSProvisioningServiceMetricsRecorder mFFSProvisioningServiceMetricsRecorder;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.whisperjoin.deviceprovisioningservice.workflow.zerotouch.ZeroTouchWorkflowMetricsReporter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$whisperjoin$deviceprovisioningservice$workflow$state$ZeroTouchWorkflowUpdate$State;

        static {
            int[] iArr = new int[ZeroTouchWorkflowUpdate.State.values().length];
            $SwitchMap$com$amazon$whisperjoin$deviceprovisioningservice$workflow$state$ZeroTouchWorkflowUpdate$State = iArr;
            try {
                iArr[ZeroTouchWorkflowUpdate.State.PREPARING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$deviceprovisioningservice$workflow$state$ZeroTouchWorkflowUpdate$State[ZeroTouchWorkflowUpdate.State.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$deviceprovisioningservice$workflow$state$ZeroTouchWorkflowUpdate$State[ZeroTouchWorkflowUpdate.State.FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ZeroTouchWorkflowMetricsReporter(FFSProvisioningServiceMetricsRecorder fFSProvisioningServiceMetricsRecorder) {
        this.mFFSProvisioningServiceMetricsRecorder = fFSProvisioningServiceMetricsRecorder;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public void accept(ZeroTouchWorkflowUpdate zeroTouchWorkflowUpdate) throws Exception {
        int i = AnonymousClass1.$SwitchMap$com$amazon$whisperjoin$deviceprovisioningservice$workflow$state$ZeroTouchWorkflowUpdate$State[zeroTouchWorkflowUpdate.getState().ordinal()];
        if (i == 1) {
            this.mFFSProvisioningServiceMetricsRecorder.onWorkflowSetupAttemptStart();
        } else if (i == 2) {
            this.mFFSProvisioningServiceMetricsRecorder.onWorkflowSetupSuccess();
        } else {
            if (i != 3) {
                return;
            }
            this.mFFSProvisioningServiceMetricsRecorder.onWorkflowSetupFailure();
        }
    }
}
