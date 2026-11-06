package com.amazon.alexa.matter.commissioner;

import com.amazon.alexa.matter.service.request.RequestHandlingException;
import java.util.function.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class MatterSDKCommissioningSession$$ExternalSyntheticLambda4 implements Supplier {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ MatterSDKCommissioningSession$$ExternalSyntheticLambda4(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        RequestHandlingException lambda$workerBypassSoftAttestationFailure$2;
        RequestHandlingException lambda$workerFinalizeCommissioning$5;
        switch (this.$r8$classId) {
            case 0:
                lambda$workerBypassSoftAttestationFailure$2 = MatterSDKCommissioningSession.lambda$workerBypassSoftAttestationFailure$2();
                return lambda$workerBypassSoftAttestationFailure$2;
            default:
                lambda$workerFinalizeCommissioning$5 = MatterSDKCommissioningSession.lambda$workerFinalizeCommissioning$5();
                return lambda$workerFinalizeCommissioning$5;
        }
    }
}
