package com.amazon.alexa.seamlessswitching.capability.bluetooth;

import com.amazon.alexa.accessory.protocol.Common;
import com.amazon.alexa.seamlessswitching.capability.model.AlexaDevice;
import com.amazon.alexa.seamlessswitching.capability.model.PairedDevice;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class DefaultIOComponentsBluetoothManager$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DefaultIOComponentsBluetoothManager f$0;
    public final /* synthetic */ AlexaDevice f$1;
    public final /* synthetic */ PairedDevice f$2;

    public /* synthetic */ DefaultIOComponentsBluetoothManager$$ExternalSyntheticLambda0(DefaultIOComponentsBluetoothManager defaultIOComponentsBluetoothManager, AlexaDevice alexaDevice, PairedDevice pairedDevice, int i) {
        this.$r8$classId = i;
        this.f$0 = defaultIOComponentsBluetoothManager;
        this.f$1 = alexaDevice;
        this.f$2 = pairedDevice;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$connectDevice$4(this.f$1, this.f$2, (Common.ErrorCode) obj);
                break;
            case 1:
                this.f$0.lambda$connectDevice$5(this.f$1, this.f$2, (Throwable) obj);
                break;
            case 2:
                this.f$0.lambda$disconnectDevice$6(this.f$1, this.f$2, (Common.ErrorCode) obj);
                break;
            default:
                this.f$0.lambda$disconnectDevice$7(this.f$1, this.f$2, (Throwable) obj);
                break;
        }
    }
}
