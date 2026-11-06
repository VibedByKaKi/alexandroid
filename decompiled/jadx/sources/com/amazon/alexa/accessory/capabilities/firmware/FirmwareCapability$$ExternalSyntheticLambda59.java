package com.amazon.alexa.accessory.capabilities.firmware;

import com.amazon.alexa.accessory.capabilities.firmware.FirmwareCapability;
import com.amazon.alexa.accessory.repositories.Producer;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.HashSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class FirmwareCapability$$ExternalSyntheticLambda59 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ FirmwareCapability$$ExternalSyntheticLambda59(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((FirmwareCapability) this.f$0).lambda$prepareFirmwareComponentsWithDAVS$20((DevicePackage) this.f$1, (Throwable) obj);
                break;
            case 1:
                ((FirmwareCapability.FirmwareActionHandler) this.f$0).lambda$handleCheckInventoryUpdate$3((Producer.Result) this.f$1, (HashSet) obj);
                break;
            default:
                ((FirmwareCapability.FirmwareActionHandler) this.f$0).lambda$handleArtifactTransfer$14((Producer.Result) this.f$1, (FirmwareCapability.ArtifactUpdateBundle) obj);
                break;
        }
    }
}
