package com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.operation;

import com.amazon.whisperjoin.common.sharedtypes.devices.WhisperJoinPeripheralDeviceDetails;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.type.ProvisioningMethod;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.functions.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class WJDeviceSetupModeSupportedPredicate implements Predicate<WhisperJoinPeripheralDeviceDetails> {
    private final boolean mHasBarcode;
    private final ProvisioningMethod mProvisioningMethod;

    public WJDeviceSetupModeSupportedPredicate(ProvisioningMethod provisioningMethod, boolean z) {
        this.mProvisioningMethod = provisioningMethod;
        this.mHasBarcode = z;
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(@NonNull WhisperJoinPeripheralDeviceDetails whisperJoinPeripheralDeviceDetails) throws Exception {
        ProvisioningMethod provisioningMethod = this.mProvisioningMethod;
        ProvisioningMethod provisioningMethod2 = ProvisioningMethod.MANUAL;
        return (provisioningMethod == provisioningMethod2 && this.mHasBarcode) ? whisperJoinPeripheralDeviceDetails.getSupportsPin() : provisioningMethod == provisioningMethod2 ? whisperJoinPeripheralDeviceDetails.getSupportsUnauthenticatedEcdhe() : whisperJoinPeripheralDeviceDetails.getSupportsAuthenticatedEcdhe();
    }
}
