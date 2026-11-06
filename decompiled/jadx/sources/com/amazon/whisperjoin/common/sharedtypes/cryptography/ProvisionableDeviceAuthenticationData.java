package com.amazon.whisperjoin.common.sharedtypes.cryptography;

import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ProvisionableDeviceAuthenticationData {
    private final List<byte[]> mCertificateChain;
    private final byte[] mSignature;

    public ProvisionableDeviceAuthenticationData(List<byte[]> list, byte[] bArr) {
        this.mCertificateChain = list;
        this.mSignature = (byte[]) bArr.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ProvisionableDeviceAuthenticationData provisionableDeviceAuthenticationData = (ProvisionableDeviceAuthenticationData) obj;
            if (new EqualsBuilder().append(this.mSignature, provisionableDeviceAuthenticationData.mSignature).isEquals() && Arrays.deepEquals(this.mCertificateChain.toArray(), provisionableDeviceAuthenticationData.mCertificateChain.toArray())) {
                return true;
            }
        }
        return false;
    }

    public List<byte[]> getCertificateChain() {
        return this.mCertificateChain;
    }

    public byte[] getSignature() {
        return (byte[]) this.mSignature.clone();
    }

    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(this.mCertificateChain).append(this.mSignature).toHashCode();
    }
}
