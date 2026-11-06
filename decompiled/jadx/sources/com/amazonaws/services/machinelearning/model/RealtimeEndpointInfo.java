package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class RealtimeEndpointInfo implements Serializable {
    private Date createdAt;
    private String endpointStatus;
    private String endpointUrl;
    private Integer peakRequestsPerSecond;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RealtimeEndpointInfo)) {
            return false;
        }
        RealtimeEndpointInfo realtimeEndpointInfo = (RealtimeEndpointInfo) obj;
        if ((realtimeEndpointInfo.getPeakRequestsPerSecond() == null) ^ (getPeakRequestsPerSecond() == null)) {
            return false;
        }
        if (realtimeEndpointInfo.getPeakRequestsPerSecond() != null && !realtimeEndpointInfo.getPeakRequestsPerSecond().equals(getPeakRequestsPerSecond())) {
            return false;
        }
        if ((realtimeEndpointInfo.getCreatedAt() == null) ^ (getCreatedAt() == null)) {
            return false;
        }
        if (realtimeEndpointInfo.getCreatedAt() != null && !realtimeEndpointInfo.getCreatedAt().equals(getCreatedAt())) {
            return false;
        }
        if ((realtimeEndpointInfo.getEndpointUrl() == null) ^ (getEndpointUrl() == null)) {
            return false;
        }
        if (realtimeEndpointInfo.getEndpointUrl() != null && !realtimeEndpointInfo.getEndpointUrl().equals(getEndpointUrl())) {
            return false;
        }
        if ((realtimeEndpointInfo.getEndpointStatus() == null) ^ (getEndpointStatus() == null)) {
            return false;
        }
        return realtimeEndpointInfo.getEndpointStatus() == null || realtimeEndpointInfo.getEndpointStatus().equals(getEndpointStatus());
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public String getEndpointStatus() {
        return this.endpointStatus;
    }

    public String getEndpointUrl() {
        return this.endpointUrl;
    }

    public Integer getPeakRequestsPerSecond() {
        return this.peakRequestsPerSecond;
    }

    public int hashCode() {
        return (((((((getPeakRequestsPerSecond() == null ? 0 : getPeakRequestsPerSecond().hashCode()) + 31) * 31) + (getCreatedAt() == null ? 0 : getCreatedAt().hashCode())) * 31) + (getEndpointUrl() == null ? 0 : getEndpointUrl().hashCode())) * 31) + (getEndpointStatus() != null ? getEndpointStatus().hashCode() : 0);
    }

    public void setCreatedAt(Date date) {
        this.createdAt = date;
    }

    public void setEndpointStatus(RealtimeEndpointStatus realtimeEndpointStatus) {
        this.endpointStatus = realtimeEndpointStatus.toString();
    }

    public void setEndpointUrl(String str) {
        this.endpointUrl = str;
    }

    public void setPeakRequestsPerSecond(Integer num) {
        this.peakRequestsPerSecond = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getPeakRequestsPerSecond() != null) {
            sb.append("PeakRequestsPerSecond: " + getPeakRequestsPerSecond() + ",");
        }
        if (getCreatedAt() != null) {
            sb.append("CreatedAt: " + getCreatedAt() + ",");
        }
        if (getEndpointUrl() != null) {
            sb.append("EndpointUrl: " + getEndpointUrl() + ",");
        }
        if (getEndpointStatus() != null) {
            sb.append("EndpointStatus: " + getEndpointStatus());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public RealtimeEndpointInfo withCreatedAt(Date date) {
        this.createdAt = date;
        return this;
    }

    public RealtimeEndpointInfo withEndpointStatus(RealtimeEndpointStatus realtimeEndpointStatus) {
        this.endpointStatus = realtimeEndpointStatus.toString();
        return this;
    }

    public RealtimeEndpointInfo withEndpointUrl(String str) {
        this.endpointUrl = str;
        return this;
    }

    public RealtimeEndpointInfo withPeakRequestsPerSecond(Integer num) {
        this.peakRequestsPerSecond = num;
        return this;
    }

    public void setEndpointStatus(String str) {
        this.endpointStatus = str;
    }

    public RealtimeEndpointInfo withEndpointStatus(String str) {
        this.endpointStatus = str;
        return this;
    }
}
