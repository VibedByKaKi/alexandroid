package com.amazon.alexa.accessory.capabilities.firmware;

import com.amazon.alexa.accessory.capabilities.firmware.FirmwareCapability;
import com.amazon.alexa.accessory.kota.UpdateRequest;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class FirmwareCapability$FirmwareActionHandler$$ExternalSyntheticLambda2 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FirmwareCapability.FirmwareActionHandler f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ FirmwareCapability$FirmwareActionHandler$$ExternalSyntheticLambda2(FirmwareCapability.FirmwareActionHandler firmwareActionHandler, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = firmwareActionHandler;
        this.f$1 = z;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        SingleSource lambda$handleCheckInventoryUpdate$2;
        ObservableSource lambda$handleCheckInventoryUpdate$1;
        switch (this.$r8$classId) {
            case 0:
                lambda$handleCheckInventoryUpdate$2 = this.f$0.lambda$handleCheckInventoryUpdate$2(this.f$1, (Set) obj);
                return lambda$handleCheckInventoryUpdate$2;
            default:
                lambda$handleCheckInventoryUpdate$1 = this.f$0.lambda$handleCheckInventoryUpdate$1(this.f$1, (UpdateRequest) obj);
                return lambda$handleCheckInventoryUpdate$1;
        }
    }
}
