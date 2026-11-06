package com.amazon.alexa.accessory.capabilities.firmware;

import com.amazon.alexa.accessory.capabilities.firmware.FirmwareCapability;
import com.amazon.alexa.accessory.repositories.firmware.FirmwareContract;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class FirmwareCapability$$ExternalSyntheticLambda12 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FirmwareCapability f$0;

    public /* synthetic */ FirmwareCapability$$ExternalSyntheticLambda12(FirmwareCapability firmwareCapability, int i) {
        this.$r8$classId = i;
        this.f$0 = firmwareCapability;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        FirmwareCapability firmwareCapability = this.f$0;
        switch (i) {
            case 0:
                firmwareCapability.lambda$observeDAVSArtifactsAvailability$50((FirmwareCapability.ArtifactUpdateBundle) obj);
                break;
            case 1:
                firmwareCapability.updateFirmware((FirmwareUpdateSet) obj);
                break;
            case 2:
                firmwareCapability.lambda$emitFirmwareZipFilePathForAssetTransfer$59((FirmwareContract.Package) obj);
                break;
            case 3:
                firmwareCapability.lambda$requestAndProvideFirmwareInformation$4((Throwable) obj);
                break;
            case 4:
                firmwareCapability.lambda$initializeFirmwareUpdateFlow$7((Boolean) obj);
                break;
            default:
                firmwareCapability.lambda$initializeFirmwareUpdateFlow$8((Throwable) obj);
                break;
        }
    }
}
