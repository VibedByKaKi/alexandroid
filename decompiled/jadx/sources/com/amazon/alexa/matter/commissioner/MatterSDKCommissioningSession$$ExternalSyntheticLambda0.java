package com.amazon.alexa.matter.commissioner;

import android.bluetooth.BluetoothDevice;
import com.amazon.alexa.matter.client.gordonservice.model.FinalizeCommissioningResponse;
import com.amazon.alexa.matter.commissioner.BluetoothManager;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class MatterSDKCommissioningSession$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MatterSDKCommissioningSession f$0;

    public /* synthetic */ MatterSDKCommissioningSession$$ExternalSyntheticLambda0(MatterSDKCommissioningSession matterSDKCommissioningSession, int i) {
        this.$r8$classId = i;
        this.f$0 = matterSDKCommissioningSession;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        MatterSDKCommissioningSession matterSDKCommissioningSession = this.f$0;
        switch (i) {
            case 0:
                matterSDKCommissioningSession.onNOCChainGenerated((NOCChain) obj);
                break;
            case 1:
                matterSDKCommissioningSession.onNOCChainGenerationFailure((Throwable) obj);
                break;
            case 2:
                matterSDKCommissioningSession.onDeviceDiscovered((BluetoothDevice) obj);
                break;
            case 3:
                matterSDKCommissioningSession.onDeviceDiscoveryFailed((Throwable) obj);
                break;
            case 4:
                matterSDKCommissioningSession.onFinalizeCommissioningInProgress((FinalizeCommissioningResponse) obj);
                break;
            case 5:
                matterSDKCommissioningSession.onFinalizeCommissioningError((Throwable) obj);
                break;
            case 6:
                matterSDKCommissioningSession.onConnectionSuccess((BluetoothManager.BluetoothConnection) obj);
                break;
            default:
                matterSDKCommissioningSession.onConnectionFailed((Throwable) obj);
                break;
        }
    }
}
