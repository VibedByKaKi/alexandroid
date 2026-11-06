package com.amazon.alexa.matter.commissioner;

import chip.devicecontroller.AttestationInfo;
import chip.devicecontroller.CSRInfo;
import chip.devicecontroller.ControllerParams;
import com.amazon.alexa.matter.sdk.MatterDeviceController;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class MatterSDKCommissioningSession$$ExternalSyntheticLambda5 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MatterSDKCommissioningSession f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ MatterSDKCommissioningSession$$ExternalSyntheticLambda5(MatterSDKCommissioningSession matterSDKCommissioningSession, Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = matterSDKCommissioningSession;
        this.f$1 = obj;
        this.f$2 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onNOCChainGenerationNeeded$8((CSRInfo) this.f$1, (AttestationInfo) this.f$2);
                break;
            default:
                this.f$0.lambda$bindNOCChain$9((MatterDeviceController) this.f$1, (ControllerParams) this.f$2);
                break;
        }
    }
}
