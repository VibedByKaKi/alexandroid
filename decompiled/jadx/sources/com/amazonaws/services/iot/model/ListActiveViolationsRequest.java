package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListActiveViolationsRequest extends AmazonWebServiceRequest implements Serializable {
    private String behaviorCriteriaType;
    private Boolean listSuppressedAlerts;
    private Integer maxResults;
    private String nextToken;
    private String securityProfileName;
    private String thingName;
    private String verificationState;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListActiveViolationsRequest)) {
            return false;
        }
        ListActiveViolationsRequest listActiveViolationsRequest = (ListActiveViolationsRequest) obj;
        if ((listActiveViolationsRequest.getThingName() == null) ^ (getThingName() == null)) {
            return false;
        }
        if (listActiveViolationsRequest.getThingName() != null && !listActiveViolationsRequest.getThingName().equals(getThingName())) {
            return false;
        }
        if ((listActiveViolationsRequest.getSecurityProfileName() == null) ^ (getSecurityProfileName() == null)) {
            return false;
        }
        if (listActiveViolationsRequest.getSecurityProfileName() != null && !listActiveViolationsRequest.getSecurityProfileName().equals(getSecurityProfileName())) {
            return false;
        }
        if ((listActiveViolationsRequest.getBehaviorCriteriaType() == null) ^ (getBehaviorCriteriaType() == null)) {
            return false;
        }
        if (listActiveViolationsRequest.getBehaviorCriteriaType() != null && !listActiveViolationsRequest.getBehaviorCriteriaType().equals(getBehaviorCriteriaType())) {
            return false;
        }
        if ((listActiveViolationsRequest.getListSuppressedAlerts() == null) ^ (getListSuppressedAlerts() == null)) {
            return false;
        }
        if (listActiveViolationsRequest.getListSuppressedAlerts() != null && !listActiveViolationsRequest.getListSuppressedAlerts().equals(getListSuppressedAlerts())) {
            return false;
        }
        if ((listActiveViolationsRequest.getVerificationState() == null) ^ (getVerificationState() == null)) {
            return false;
        }
        if (listActiveViolationsRequest.getVerificationState() != null && !listActiveViolationsRequest.getVerificationState().equals(getVerificationState())) {
            return false;
        }
        if ((listActiveViolationsRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (listActiveViolationsRequest.getNextToken() != null && !listActiveViolationsRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((listActiveViolationsRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        return listActiveViolationsRequest.getMaxResults() == null || listActiveViolationsRequest.getMaxResults().equals(getMaxResults());
    }

    public String getBehaviorCriteriaType() {
        return this.behaviorCriteriaType;
    }

    public Boolean getListSuppressedAlerts() {
        return this.listSuppressedAlerts;
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public String getSecurityProfileName() {
        return this.securityProfileName;
    }

    public String getThingName() {
        return this.thingName;
    }

    public String getVerificationState() {
        return this.verificationState;
    }

    public int hashCode() {
        return (((((((((((((getThingName() == null ? 0 : getThingName().hashCode()) + 31) * 31) + (getSecurityProfileName() == null ? 0 : getSecurityProfileName().hashCode())) * 31) + (getBehaviorCriteriaType() == null ? 0 : getBehaviorCriteriaType().hashCode())) * 31) + (getListSuppressedAlerts() == null ? 0 : getListSuppressedAlerts().hashCode())) * 31) + (getVerificationState() == null ? 0 : getVerificationState().hashCode())) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getMaxResults() != null ? getMaxResults().hashCode() : 0);
    }

    public Boolean isListSuppressedAlerts() {
        return this.listSuppressedAlerts;
    }

    public void setBehaviorCriteriaType(BehaviorCriteriaType behaviorCriteriaType) {
        this.behaviorCriteriaType = behaviorCriteriaType.toString();
    }

    public void setListSuppressedAlerts(Boolean bool) {
        this.listSuppressedAlerts = bool;
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setSecurityProfileName(String str) {
        this.securityProfileName = str;
    }

    public void setThingName(String str) {
        this.thingName = str;
    }

    public void setVerificationState(VerificationState verificationState) {
        this.verificationState = verificationState.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getThingName() != null) {
            sb.append("thingName: " + getThingName() + ",");
        }
        if (getSecurityProfileName() != null) {
            sb.append("securityProfileName: " + getSecurityProfileName() + ",");
        }
        if (getBehaviorCriteriaType() != null) {
            sb.append("behaviorCriteriaType: " + getBehaviorCriteriaType() + ",");
        }
        if (getListSuppressedAlerts() != null) {
            sb.append("listSuppressedAlerts: " + getListSuppressedAlerts() + ",");
        }
        if (getVerificationState() != null) {
            sb.append("verificationState: " + getVerificationState() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken() + ",");
        }
        if (getMaxResults() != null) {
            sb.append("maxResults: " + getMaxResults());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListActiveViolationsRequest withBehaviorCriteriaType(BehaviorCriteriaType behaviorCriteriaType) {
        this.behaviorCriteriaType = behaviorCriteriaType.toString();
        return this;
    }

    public ListActiveViolationsRequest withListSuppressedAlerts(Boolean bool) {
        this.listSuppressedAlerts = bool;
        return this;
    }

    public ListActiveViolationsRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListActiveViolationsRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListActiveViolationsRequest withSecurityProfileName(String str) {
        this.securityProfileName = str;
        return this;
    }

    public ListActiveViolationsRequest withThingName(String str) {
        this.thingName = str;
        return this;
    }

    public ListActiveViolationsRequest withVerificationState(VerificationState verificationState) {
        this.verificationState = verificationState.toString();
        return this;
    }

    public void setBehaviorCriteriaType(String str) {
        this.behaviorCriteriaType = str;
    }

    public void setVerificationState(String str) {
        this.verificationState = str;
    }

    public ListActiveViolationsRequest withBehaviorCriteriaType(String str) {
        this.behaviorCriteriaType = str;
        return this;
    }

    public ListActiveViolationsRequest withVerificationState(String str) {
        this.verificationState = str;
        return this;
    }
}
