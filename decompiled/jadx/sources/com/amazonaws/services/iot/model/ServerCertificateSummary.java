package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ServerCertificateSummary implements Serializable {
    private String serverCertificateArn;
    private String serverCertificateStatus;
    private String serverCertificateStatusDetail;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ServerCertificateSummary)) {
            return false;
        }
        ServerCertificateSummary serverCertificateSummary = (ServerCertificateSummary) obj;
        if ((serverCertificateSummary.getServerCertificateArn() == null) ^ (getServerCertificateArn() == null)) {
            return false;
        }
        if (serverCertificateSummary.getServerCertificateArn() != null && !serverCertificateSummary.getServerCertificateArn().equals(getServerCertificateArn())) {
            return false;
        }
        if ((serverCertificateSummary.getServerCertificateStatus() == null) ^ (getServerCertificateStatus() == null)) {
            return false;
        }
        if (serverCertificateSummary.getServerCertificateStatus() != null && !serverCertificateSummary.getServerCertificateStatus().equals(getServerCertificateStatus())) {
            return false;
        }
        if ((serverCertificateSummary.getServerCertificateStatusDetail() == null) ^ (getServerCertificateStatusDetail() == null)) {
            return false;
        }
        return serverCertificateSummary.getServerCertificateStatusDetail() == null || serverCertificateSummary.getServerCertificateStatusDetail().equals(getServerCertificateStatusDetail());
    }

    public String getServerCertificateArn() {
        return this.serverCertificateArn;
    }

    public String getServerCertificateStatus() {
        return this.serverCertificateStatus;
    }

    public String getServerCertificateStatusDetail() {
        return this.serverCertificateStatusDetail;
    }

    public int hashCode() {
        return (((((getServerCertificateArn() == null ? 0 : getServerCertificateArn().hashCode()) + 31) * 31) + (getServerCertificateStatus() == null ? 0 : getServerCertificateStatus().hashCode())) * 31) + (getServerCertificateStatusDetail() != null ? getServerCertificateStatusDetail().hashCode() : 0);
    }

    public void setServerCertificateArn(String str) {
        this.serverCertificateArn = str;
    }

    public void setServerCertificateStatus(ServerCertificateStatus serverCertificateStatus) {
        this.serverCertificateStatus = serverCertificateStatus.toString();
    }

    public void setServerCertificateStatusDetail(String str) {
        this.serverCertificateStatusDetail = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getServerCertificateArn() != null) {
            sb.append("serverCertificateArn: " + getServerCertificateArn() + ",");
        }
        if (getServerCertificateStatus() != null) {
            sb.append("serverCertificateStatus: " + getServerCertificateStatus() + ",");
        }
        if (getServerCertificateStatusDetail() != null) {
            sb.append("serverCertificateStatusDetail: " + getServerCertificateStatusDetail());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ServerCertificateSummary withServerCertificateArn(String str) {
        this.serverCertificateArn = str;
        return this;
    }

    public ServerCertificateSummary withServerCertificateStatus(ServerCertificateStatus serverCertificateStatus) {
        this.serverCertificateStatus = serverCertificateStatus.toString();
        return this;
    }

    public ServerCertificateSummary withServerCertificateStatusDetail(String str) {
        this.serverCertificateStatusDetail = str;
        return this;
    }

    public void setServerCertificateStatus(String str) {
        this.serverCertificateStatus = str;
    }

    public ServerCertificateSummary withServerCertificateStatus(String str) {
        this.serverCertificateStatus = str;
        return this;
    }
}
