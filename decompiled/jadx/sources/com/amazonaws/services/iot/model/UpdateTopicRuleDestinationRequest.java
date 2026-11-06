package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UpdateTopicRuleDestinationRequest extends AmazonWebServiceRequest implements Serializable {
    private String arn;
    private String status;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateTopicRuleDestinationRequest)) {
            return false;
        }
        UpdateTopicRuleDestinationRequest updateTopicRuleDestinationRequest = (UpdateTopicRuleDestinationRequest) obj;
        if ((updateTopicRuleDestinationRequest.getArn() == null) ^ (getArn() == null)) {
            return false;
        }
        if (updateTopicRuleDestinationRequest.getArn() != null && !updateTopicRuleDestinationRequest.getArn().equals(getArn())) {
            return false;
        }
        if ((updateTopicRuleDestinationRequest.getStatus() == null) ^ (getStatus() == null)) {
            return false;
        }
        return updateTopicRuleDestinationRequest.getStatus() == null || updateTopicRuleDestinationRequest.getStatus().equals(getStatus());
    }

    public String getArn() {
        return this.arn;
    }

    public String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((getArn() == null ? 0 : getArn().hashCode()) + 31) * 31) + (getStatus() != null ? getStatus().hashCode() : 0);
    }

    public void setArn(String str) {
        this.arn = str;
    }

    public void setStatus(TopicRuleDestinationStatus topicRuleDestinationStatus) {
        this.status = topicRuleDestinationStatus.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getArn() != null) {
            sb.append("arn: " + getArn() + ",");
        }
        if (getStatus() != null) {
            sb.append("status: " + getStatus());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public UpdateTopicRuleDestinationRequest withArn(String str) {
        this.arn = str;
        return this;
    }

    public UpdateTopicRuleDestinationRequest withStatus(TopicRuleDestinationStatus topicRuleDestinationStatus) {
        this.status = topicRuleDestinationStatus.toString();
        return this;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public UpdateTopicRuleDestinationRequest withStatus(String str) {
        this.status = str;
        return this;
    }
}
