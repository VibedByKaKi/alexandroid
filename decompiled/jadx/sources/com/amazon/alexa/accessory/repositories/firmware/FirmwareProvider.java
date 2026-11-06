package com.amazon.alexa.accessory.repositories.firmware;

import com.amazon.alexa.accessory.kota.InventoryUpdateBundle;
import com.amazon.alexa.accessory.protocol.Firmware;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface FirmwareProvider {
    void informationNotAvailable(Throwable th);

    void provideDownloadProgress(float f);

    void provideFirmwareZipFilePaths(Set<String> set);

    void provideInformation(Set<Firmware.FirmwareInformation> set);

    void provideInventoryUpdate(Set<InventoryUpdateBundle> set);

    void provideInventoryUpdateError(Throwable th);

    void provideOtaGroupName(Set<String> set);

    void provideUpdateStatus(FirmwareUpdateStatus firmwareUpdateStatus);
}
