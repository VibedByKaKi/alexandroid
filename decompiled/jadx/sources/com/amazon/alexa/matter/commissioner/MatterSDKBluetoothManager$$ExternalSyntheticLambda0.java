package com.amazon.alexa.matter.commissioner;

import android.bluetooth.BluetoothAdapter;
import com.amazon.alexa.matter.client.apostilleservice.model.AttestationAndSetPeripheralCertificateResponse;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class MatterSDKBluetoothManager$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ MatterSDKBluetoothManager$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        SingleSource lambda$getBluetoothLeScanner$4;
        NOCChain extractNOCChain;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                lambda$getBluetoothLeScanner$4 = ((MatterSDKBluetoothManager) obj2).lambda$getBluetoothLeScanner$4((BluetoothAdapter) obj);
                return lambda$getBluetoothLeScanner$4;
            default:
                extractNOCChain = ((ApostilleServiceNOCChainGenerator) obj2).extractNOCChain((AttestationAndSetPeripheralCertificateResponse) obj);
                return extractNOCChain;
        }
    }
}
