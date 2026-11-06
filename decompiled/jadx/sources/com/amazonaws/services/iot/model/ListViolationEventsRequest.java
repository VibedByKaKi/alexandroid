package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListViolationEventsRequest extends AmazonWebServiceRequest implements Serializable {
    private String behaviorCriteriaType;
    private Date endTime;
    private Boolean listSuppressedAlerts;
    private Integer maxResults;
    private String nextToken;
    private String securityProfileName;
    private Date startTime;
    private String thingName;
    private String verificationState;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListViolationEventsRequest)) {
            return false;
        }
        ListViolationEventsRequest listViolationEventsRequest = (ListViolationEventsRequest) obj;
        if ((listViolationEventsRequest.getStartTime() == null) ^ (getStartTime() == null)) {
            return false;
        }
        if (listViolationEventsRequest.getStartTime() != null && !listViolationEventsRequest.getStartTime().equals(getStartTime())) {
            return false;
        }
        if ((listViolationEventsRequest.getEndTime() == null) ^ (getEndTime() == null)) {
            return false;
        }
        if (listViolationEventsRequest.getEndTime() != null && !listViolationEventsRequest.getEndTime().equals(getEndTime())) {
            return false;
        }
        if ((listViolationEventsRequest.getThingName() == null) ^ (getThingName() == null)) {
            return false;
        }
        if (listViolationEventsRequest.getThingName() != null && !listViolationEventsRequest.getThingName().equals(getThingName())) {
            return false;
        }
        if ((listViolationEventsRequest.getSecurityProfileName() == null) ^ (getSecurityProfileName() == null)) {
            return false;
        }
        if (listViolationEventsRequest.getSecurityProfileName() != null && !listViolationEventsRequest.getSecurityProfileName().equals(getSecurityProfileName())) {
            return false;
        }
        if ((listViolationEventsRequest.getBehaviorCriteriaType() == null) ^ (getBehaviorCriteriaType() == null)) {
            return false;
        }
        if (listViolationEventsRequest.getBehaviorCriteriaType() != null && !listViolationEventsRequest.getBehaviorCriteriaType().equals(getBehaviorCriteriaType())) {
            return false;
        }
        if ((listViolationEventsRequest.getListSuppressedAlerts() == null) ^ (getListSuppressedAlerts() == null)) {
            return false;
        }
        if (listViolationEventsRequest.getListSuppressedAlerts() != null && !listViolationEventsRequest.getListSuppressedAlerts().equals(getListSuppressedAlerts())) {
            return false;
        }
        if ((listViolationEventsRequest.getVerificationState() == null) ^ (getVerificationState() == null)) {
            return false;
        }
        if (listViolationEventsRequest.getVerificationState() != null && !listViolationEventsRequest.getVerificationState().equals(getVerificationState())) {
            return false;
        }
        if ((listViolationEventsRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (listViolationEventsRequest.getNextToken() != null && !listViolationEventsRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((listViolationEventsRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        return listViolationEventsRequest.getMaxResults() == null || listViolationEventsRequest.getMaxResults().equals(getMaxResults());
    }

    public String getBehaviorCriteriaType() {
        return this.behaviorCriteriaType;
    }

    public Date getEndTime() {
        return this.endTime;
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

    public Date getStartTime() {
        return this.startTime;
    }

    public String getThingName() {
        return this.thingName;
    }

    public String getVerificationState() {
        return this.verificationState;
    }

    public int hashCode() {
        return (((((((((((((((((getStartTime() == null ? 0 : getStartTime().hashCode()) + 31) * 31) + (getEndTime() == null ? 0 : getEndTime().hashCode())) * 31) + (getThingName() == null ? 0 : getThingName().hashCode())) * 31) + (getSecurityProfileName() == null ? 0 : getSecurityProfileName().hashCode())) * 31) + (getBehaviorCriteriaType() == null ? 0 : getBehaviorCriteriaType().hashCode())) * 31) + (getListSuppressedAlerts() == null ? 0 : getListSuppressedAlerts().hashCode())) * 31) + (getVerificationState() == null ? 0 : getVerificationState().hashCode())) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getMaxResults() != null ? getMaxResults().hashCode() : 0);
    }

    public Boolean isListSuppressedAlerts() {
        return this.listSuppressedAlerts;
    }

    public void setBehaviorCriteriaType(BehaviorCriteriaType behaviorCriteriaType) {
        this.behaviorCriteriaType = behaviorCriteriaType.toString();
    }

    public void setEndTime(Date date) {
        this.endTime = date;
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

    public void setStartTime(Date date) {
        this.startTime = date;
    }

    public void setThingName(String str) {
        this.thingName = str;
    }

    public void setVerificationState(VerificationState verificationState) {
        this.verificationState = verificationState.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getStartTime() != null) {
            sb.append("startTime: " + getStartTime() + ",");
        }
        if (getEndTime() != null) {
            sb.append("endTime: " + getEndTime() + ",");
        }
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

    public ListViolationEventsRequest withBehaviorCriteriaType(BehaviorCriteriaType behaviorCriteriaType) {
        this.behaviorCriteriaType = behaviorCriteriaType.toString();
        return this;
    }

    public ListViolationEventsRequest withEndTime(Date date) {
        this.endTime = date;
        return this;
    }

    public ListViolationEventsRequest withListSuppressedAlerts(Boolean bool) {
        this.listSuppressedAlerts = bool;
        return this;
    }

    public ListViolationEventsRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListViolationEventsRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListViolationEventsRequest withSecurityProfileName(String str) {
        this.securityProfileName = str;
        return this;
    }

    public ListViolationEventsRequest withStartTime(Date date) {
        this.startTime = date;
        return this;
    }

    public ListViolationEventsRequest withThingName(String str) {
        this.thingName = str;
        return this;
    }

    public ListViolationEventsRequest withVerificationState(VerificationState verificationState) {
        this.verificationState = verificationState.toString();
        return this;
    }

    public void setBehaviorCriteriaType(String str) {
        this.behaviorCriteriaType = str;
    }

    public void setVerificationState(String str) {
        this.verificationState = str;
    }

    public ListViolationEventsRequest withBehaviorCriteriaType(String str) {
        this.behaviorCriteriaType = str;
        return this;
    }

    public ListViolationEventsRequest withVerificationState(String str) {
        this.verificationState = str;
        return this;
    }
}
