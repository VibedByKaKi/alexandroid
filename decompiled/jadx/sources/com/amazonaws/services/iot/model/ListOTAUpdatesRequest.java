package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListOTAUpdatesRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer maxResults;
    private String nextToken;
    private String otaUpdateStatus;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListOTAUpdatesRequest)) {
            return false;
        }
        ListOTAUpdatesRequest listOTAUpdatesRequest = (ListOTAUpdatesRequest) obj;
        if ((listOTAUpdatesRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        if (listOTAUpdatesRequest.getMaxResults() != null && !listOTAUpdatesRequest.getMaxResults().equals(getMaxResults())) {
            return false;
        }
        if ((listOTAUpdatesRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (listOTAUpdatesRequest.getNextToken() != null && !listOTAUpdatesRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((listOTAUpdatesRequest.getOtaUpdateStatus() == null) ^ (getOtaUpdateStatus() == null)) {
            return false;
        }
        return listOTAUpdatesRequest.getOtaUpdateStatus() == null || listOTAUpdatesRequest.getOtaUpdateStatus().equals(getOtaUpdateStatus());
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public String getOtaUpdateStatus() {
        return this.otaUpdateStatus;
    }

    public int hashCode() {
        return (((((getMaxResults() == null ? 0 : getMaxResults().hashCode()) + 31) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getOtaUpdateStatus() != null ? getOtaUpdateStatus().hashCode() : 0);
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setOtaUpdateStatus(OTAUpdateStatus oTAUpdateStatus) {
        this.otaUpdateStatus = oTAUpdateStatus.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getMaxResults() != null) {
            sb.append("maxResults: " + getMaxResults() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken() + ",");
        }
        if (getOtaUpdateStatus() != null) {
            sb.append("otaUpdateStatus: " + getOtaUpdateStatus());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListOTAUpdatesRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListOTAUpdatesRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListOTAUpdatesRequest withOtaUpdateStatus(OTAUpdateStatus oTAUpdateStatus) {
        this.otaUpdateStatus = oTAUpdateStatus.toString();
        return this;
    }

    public void setOtaUpdateStatus(String str) {
        this.otaUpdateStatus = str;
    }

    public ListOTAUpdatesRequest withOtaUpdateStatus(String str) {
        this.otaUpdateStatus = str;
        return this;
    }
}
