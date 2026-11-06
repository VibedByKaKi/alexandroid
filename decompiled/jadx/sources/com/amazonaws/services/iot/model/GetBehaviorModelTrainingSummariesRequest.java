package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetBehaviorModelTrainingSummariesRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer maxResults;
    private String nextToken;
    private String securityProfileName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetBehaviorModelTrainingSummariesRequest)) {
            return false;
        }
        GetBehaviorModelTrainingSummariesRequest getBehaviorModelTrainingSummariesRequest = (GetBehaviorModelTrainingSummariesRequest) obj;
        if ((getBehaviorModelTrainingSummariesRequest.getSecurityProfileName() == null) ^ (getSecurityProfileName() == null)) {
            return false;
        }
        if (getBehaviorModelTrainingSummariesRequest.getSecurityProfileName() != null && !getBehaviorModelTrainingSummariesRequest.getSecurityProfileName().equals(getSecurityProfileName())) {
            return false;
        }
        if ((getBehaviorModelTrainingSummariesRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        if (getBehaviorModelTrainingSummariesRequest.getMaxResults() != null && !getBehaviorModelTrainingSummariesRequest.getMaxResults().equals(getMaxResults())) {
            return false;
        }
        if ((getBehaviorModelTrainingSummariesRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return getBehaviorModelTrainingSummariesRequest.getNextToken() == null || getBehaviorModelTrainingSummariesRequest.getNextToken().equals(getNextToken());
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

    public int hashCode() {
        return (((((getSecurityProfileName() == null ? 0 : getSecurityProfileName().hashCode()) + 31) * 31) + (getMaxResults() == null ? 0 : getMaxResults().hashCode())) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
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

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getSecurityProfileName() != null) {
            sb.append("securityProfileName: " + getSecurityProfileName() + ",");
        }
        if (getMaxResults() != null) {
            sb.append("maxResults: " + getMaxResults() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetBehaviorModelTrainingSummariesRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public GetBehaviorModelTrainingSummariesRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public GetBehaviorModelTrainingSummariesRequest withSecurityProfileName(String str) {
        this.securityProfileName = str;
        return this;
    }
}
