package com.amazon.alexa.accessory.capabilities.firmware;

import com.amazon.alexa.accessory.capabilities.firmware.FirmwareCapability;
import com.amazon.alexa.accessory.kota.InventoryUpdate;
import com.amazon.alexa.accessory.kota.InventoryUpdateBundle;
import com.amazon.alexa.accessory.kota.UpdateRequest;
import io.reactivex.rxjava3.functions.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class FirmwareCapability$$ExternalSyntheticLambda51 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ UpdateRequest f$0;

    public /* synthetic */ FirmwareCapability$$ExternalSyntheticLambda51(UpdateRequest updateRequest, int i) {
        this.$r8$classId = i;
        this.f$0 = updateRequest;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        InventoryUpdateBundle lambda$provideAvailableUpdates$42;
        InventoryUpdateBundle lambda$handleCheckInventoryUpdate$0;
        int i = this.$r8$classId;
        UpdateRequest updateRequest = this.f$0;
        InventoryUpdate inventoryUpdate = (InventoryUpdate) obj;
        switch (i) {
            case 0:
                lambda$provideAvailableUpdates$42 = FirmwareCapability.lambda$provideAvailableUpdates$42(updateRequest, inventoryUpdate);
                return lambda$provideAvailableUpdates$42;
            default:
                lambda$handleCheckInventoryUpdate$0 = FirmwareCapability.FirmwareActionHandler.lambda$handleCheckInventoryUpdate$0(updateRequest, inventoryUpdate);
                return lambda$handleCheckInventoryUpdate$0;
        }
    }
}
