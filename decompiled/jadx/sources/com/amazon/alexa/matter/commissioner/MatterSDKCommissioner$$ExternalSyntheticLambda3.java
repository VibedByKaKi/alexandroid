package com.amazon.alexa.matter.commissioner;

import android.bluetooth.BluetoothDevice;
import com.amazon.alexa.matter.eventbus.schema.SetupPayload;
import com.amazon.alexa.matter.eventbus.schema.StartCommissioningSetupPayload;
import io.reactivex.rxjava3.core.CompletableEmitter;
import io.reactivex.rxjava3.core.CompletableOnSubscribe;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class MatterSDKCommissioner$$ExternalSyntheticLambda3 implements SingleOnSubscribe, CompletableOnSubscribe {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ MatterSDKCommissioner$$ExternalSyntheticLambda3(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        switch (this.$r8$classId) {
            case 0:
                ((MatterSDKCommissioner) this.f$0).lambda$getSetupPayload$3((StartCommissioningSetupPayload) this.f$1, singleEmitter);
                break;
            case 1:
                ((MatterSDKBluetoothManager) this.f$0).lambda$discover$1((SetupPayload) this.f$1, singleEmitter);
                break;
            default:
                ((MatterSDKBluetoothManager) this.f$0).lambda$connect$3((BluetoothDevice) this.f$1, singleEmitter);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.core.CompletableOnSubscribe
    public void subscribe(CompletableEmitter completableEmitter) {
        ((RxCommissioningSessionStore) this.f$0).lambda$put$1((CommissioningSession) this.f$1, completableEmitter);
    }
}
