package com.amazon.whisperjoin.deviceprovisioningservice.error;

import com.amazon.whisperjoin.common.sharedtypes.provisioning.data.provisioning.ProvisioningFailure;
import com.google.common.base.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ProvisionableProvisioningDoneFailureException extends ProvisioningFailureException {
    private final ProvisioningFailure mProvisioningFailure;

    public ProvisionableProvisioningDoneFailureException(ProvisioningFailure provisioningFailure) {
        this.mProvisioningFailure = provisioningFailure;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equal(this.mProvisioningFailure, ((ProvisionableProvisioningDoneFailureException) obj).mProvisioningFailure);
    }

    public ProvisioningFailure getProvisioningFailure() {
        return this.mProvisioningFailure;
    }

    public int hashCode() {
        return Objects.hashCode(this.mProvisioningFailure);
    }
}
