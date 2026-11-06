package com.amazon.whisperjoin.deviceprovisioningservice.workflow.reporting.errorcodes;

import com.amazon.whisperjoin.common.sharedtypes.error.WJError;
import com.amazon.whisperjoin.common.sharedtypes.error.WJErrorFactory;
import com.amazon.whisperjoin.deviceprovisioningservice.error.ProvisioningNotGranted;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ProvisioningNotGrantedWJErrorMapper implements WJErrorMapper<ProvisioningNotGranted> {
    @Override // com.amazon.whisperjoin.deviceprovisioningservice.workflow.reporting.errorcodes.WJErrorMapper
    public WJError map(ProvisioningNotGranted provisioningNotGranted) {
        return WJErrorFactory.Connection.startProvisioningRequestFailed();
    }
}
