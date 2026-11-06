package com.amazon.whisperjoin.deviceprovisioningservice.workflow.reporting.errorcodes;

import com.amazon.whisperjoin.common.sharedtypes.error.WJError;
import com.amazon.whisperjoin.common.sharedtypes.error.WJErrorFactory;
import com.amazon.whisperjoin.deviceprovisioningservice.error.BluetoothLowEnergyNotSupportedException;
import com.amazon.whisperjoin.deviceprovisioningservice.error.BluetoothNotEnabledException;
import com.amazon.whisperjoin.deviceprovisioningservice.error.NoUserLoggedInException;
import com.amazon.whisperjoin.deviceprovisioningservice.error.PreconditionFailureException;
import com.amazon.whisperjoin.deviceprovisioningservice.error.RequiredLocationPermissionsForScanningNotGrantedException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class PreconditionFailureWJErrorMapper implements WJErrorMapper<PreconditionFailureException> {
    @Override // com.amazon.whisperjoin.deviceprovisioningservice.workflow.reporting.errorcodes.WJErrorMapper
    public WJError map(PreconditionFailureException preconditionFailureException) {
        if (preconditionFailureException instanceof NoUserLoggedInException) {
            return WJErrorFactory.Precondition.noUserLoggedIn();
        }
        if (preconditionFailureException instanceof BluetoothLowEnergyNotSupportedException) {
            return WJErrorFactory.Precondition.bluetoothLowEnergyNotSupported();
        }
        if (preconditionFailureException instanceof BluetoothNotEnabledException) {
            return WJErrorFactory.Precondition.bluetoothNotEnabled();
        }
        if (preconditionFailureException instanceof RequiredLocationPermissionsForScanningNotGrantedException) {
            return WJErrorFactory.Precondition.requiredPermissionsNotGranted();
        }
        Single$$ExternalSyntheticBUOutline0.m$1("Unhandled ProvisioningFailureException", preconditionFailureException);
        return null;
    }
}
