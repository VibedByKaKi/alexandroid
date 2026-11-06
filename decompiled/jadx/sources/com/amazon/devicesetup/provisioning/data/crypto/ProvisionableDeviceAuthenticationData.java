package com.amazon.devicesetup.provisioning.data.crypto;

import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ProvisionableDeviceAuthenticationData {
    private final List<byte[]> certificateChain;
    private final byte[] signature;

    public ProvisionableDeviceAuthenticationData(List<byte[]> list, byte[] bArr) {
        this.certificateChain = list;
        this.signature = (byte[]) bArr.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ProvisionableDeviceAuthenticationData provisionableDeviceAuthenticationData = (ProvisionableDeviceAuthenticationData) obj;
            if (new EqualsBuilder().append(this.signature, provisionableDeviceAuthenticationData.signature).isEquals() && Arrays.deepEquals(this.certificateChain.toArray(), provisionableDeviceAuthenticationData.certificateChain.toArray())) {
                return true;
            }
        }
        return false;
    }

    public List<byte[]> getCertificateChain() {
        return this.certificateChain;
    }

    public byte[] getSignature() {
        return (byte[]) this.signature.clone();
    }

    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(this.certificateChain).append(this.signature).toHashCode();
    }
}
