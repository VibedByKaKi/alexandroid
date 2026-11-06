package com.amazon.whisperjoin.deviceprovisioningservice.error;

import com.google.common.base.Objects;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DeviceError extends Exception implements Serializable {
    private final String mOperation;

    public DeviceError(Throwable th, String str) {
        super(a$$ExternalSyntheticOutline0.m("ProvisionableDevice Error: ", str), th);
        this.mOperation = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equal(this.mOperation, ((DeviceError) obj).mOperation);
    }

    public String getOperation() {
        return this.mOperation;
    }

    public int hashCode() {
        return Objects.hashCode(this.mOperation);
    }

    public DeviceError(String str) {
        super(a$$ExternalSyntheticOutline0.m("ProvisionableDevice Error: ", str));
        this.mOperation = str;
    }
}
