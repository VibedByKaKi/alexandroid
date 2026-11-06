package com.amazon.devicesetup.provisioning.data.device;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ProvisioningFailure {
    private final int errorCode;
    private final String message;

    public ProvisioningFailure(int i, String str) {
        this.errorCode = i;
        this.message = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ProvisioningFailure provisioningFailure = (ProvisioningFailure) obj;
            if (this.errorCode == provisioningFailure.errorCode && Objects.equal(this.message, provisioningFailure.message)) {
                return true;
            }
        }
        return false;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.errorCode), this.message);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("errorCode", this.errorCode).add("message", this.message).toString();
    }

    public ProvisioningFailure(int i) {
        this(i, null);
    }
}
