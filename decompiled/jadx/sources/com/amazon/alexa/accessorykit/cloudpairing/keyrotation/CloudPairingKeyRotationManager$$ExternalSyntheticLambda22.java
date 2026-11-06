package com.amazon.alexa.accessorykit.cloudpairing.keyrotation;

import androidx.core.util.Pair;
import com.amazon.alexa.accessorykit.cloudpairing.keyrotation.CloudPairingKeyRotationManager;
import com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.BlePairingDataInfo;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class CloudPairingKeyRotationManager$$ExternalSyntheticLambda22 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CloudPairingKeyRotationManager f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ CloudPairingKeyRotationManager$$ExternalSyntheticLambda22(CloudPairingKeyRotationManager cloudPairingKeyRotationManager, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = cloudPairingKeyRotationManager;
        this.f$1 = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        SingleSource lambda$updateKeysAndAcknowledgeToDps$17;
        CompletableSource lambda$getActiveSessionsAndUpdateKeys$6;
        switch (this.$r8$classId) {
            case 0:
                lambda$updateKeysAndAcknowledgeToDps$17 = this.f$0.lambda$updateKeysAndAcknowledgeToDps$17((CloudPairingKeyRotationManager.DeviceIdentifiers) this.f$1, (BlePairingDataInfo) obj);
                return lambda$updateKeysAndAcknowledgeToDps$17;
            default:
                lambda$getActiveSessionsAndUpdateKeys$6 = this.f$0.lambda$getActiveSessionsAndUpdateKeys$6((Map) this.f$1, (Pair) obj);
                return lambda$getActiveSessionsAndUpdateKeys$6;
        }
    }
}
