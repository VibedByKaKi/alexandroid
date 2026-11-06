package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class TransferCertificateRequest extends AmazonWebServiceRequest implements Serializable {
    private String certificateId;
    private String targetAwsAccount;
    private String transferMessage;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TransferCertificateRequest)) {
            return false;
        }
        TransferCertificateRequest transferCertificateRequest = (TransferCertificateRequest) obj;
        if ((transferCertificateRequest.getCertificateId() == null) ^ (getCertificateId() == null)) {
            return false;
        }
        if (transferCertificateRequest.getCertificateId() != null && !transferCertificateRequest.getCertificateId().equals(getCertificateId())) {
            return false;
        }
        if ((transferCertificateRequest.getTargetAwsAccount() == null) ^ (getTargetAwsAccount() == null)) {
            return false;
        }
        if (transferCertificateRequest.getTargetAwsAccount() != null && !transferCertificateRequest.getTargetAwsAccount().equals(getTargetAwsAccount())) {
            return false;
        }
        if ((transferCertificateRequest.getTransferMessage() == null) ^ (getTransferMessage() == null)) {
            return false;
        }
        return transferCertificateRequest.getTransferMessage() == null || transferCertificateRequest.getTransferMessage().equals(getTransferMessage());
    }

    public String getCertificateId() {
        return this.certificateId;
    }

    public String getTargetAwsAccount() {
        return this.targetAwsAccount;
    }

    public String getTransferMessage() {
        return this.transferMessage;
    }

    public int hashCode() {
        return (((((getCertificateId() == null ? 0 : getCertificateId().hashCode()) + 31) * 31) + (getTargetAwsAccount() == null ? 0 : getTargetAwsAccount().hashCode())) * 31) + (getTransferMessage() != null ? getTransferMessage().hashCode() : 0);
    }

    public void setCertificateId(String str) {
        this.certificateId = str;
    }

    public void setTargetAwsAccount(String str) {
        this.targetAwsAccount = str;
    }

    public void setTransferMessage(String str) {
        this.transferMessage = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getCertificateId() != null) {
            sb.append("certificateId: " + getCertificateId() + ",");
        }
        if (getTargetAwsAccount() != null) {
            sb.append("targetAwsAccount: " + getTargetAwsAccount() + ",");
        }
        if (getTransferMessage() != null) {
            sb.append("transferMessage: " + getTransferMessage());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public TransferCertificateRequest withCertificateId(String str) {
        this.certificateId = str;
        return this;
    }

    public TransferCertificateRequest withTargetAwsAccount(String str) {
        this.targetAwsAccount = str;
        return this;
    }

    public TransferCertificateRequest withTransferMessage(String str) {
        this.transferMessage = str;
        return this;
    }
}
