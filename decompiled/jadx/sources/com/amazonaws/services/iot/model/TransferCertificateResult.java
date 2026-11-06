package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class TransferCertificateResult implements Serializable {
    private String transferredCertificateArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TransferCertificateResult)) {
            return false;
        }
        TransferCertificateResult transferCertificateResult = (TransferCertificateResult) obj;
        if ((transferCertificateResult.getTransferredCertificateArn() == null) ^ (getTransferredCertificateArn() == null)) {
            return false;
        }
        return transferCertificateResult.getTransferredCertificateArn() == null || transferCertificateResult.getTransferredCertificateArn().equals(getTransferredCertificateArn());
    }

    public String getTransferredCertificateArn() {
        return this.transferredCertificateArn;
    }

    public int hashCode() {
        return 31 + (getTransferredCertificateArn() == null ? 0 : getTransferredCertificateArn().hashCode());
    }

    public void setTransferredCertificateArn(String str) {
        this.transferredCertificateArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTransferredCertificateArn() != null) {
            sb.append("transferredCertificateArn: " + getTransferredCertificateArn());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public TransferCertificateResult withTransferredCertificateArn(String str) {
        this.transferredCertificateArn = str;
        return this;
    }
}
