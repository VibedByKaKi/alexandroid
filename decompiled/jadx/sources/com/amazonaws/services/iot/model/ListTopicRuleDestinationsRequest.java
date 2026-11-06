package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListTopicRuleDestinationsRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer maxResults;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListTopicRuleDestinationsRequest)) {
            return false;
        }
        ListTopicRuleDestinationsRequest listTopicRuleDestinationsRequest = (ListTopicRuleDestinationsRequest) obj;
        if ((listTopicRuleDestinationsRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        if (listTopicRuleDestinationsRequest.getMaxResults() != null && !listTopicRuleDestinationsRequest.getMaxResults().equals(getMaxResults())) {
            return false;
        }
        if ((listTopicRuleDestinationsRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listTopicRuleDestinationsRequest.getNextToken() == null || listTopicRuleDestinationsRequest.getNextToken().equals(getNextToken());
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((getMaxResults() == null ? 0 : getMaxResults().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getMaxResults() != null) {
            sb.append("maxResults: " + getMaxResults() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListTopicRuleDestinationsRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListTopicRuleDestinationsRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }
}
