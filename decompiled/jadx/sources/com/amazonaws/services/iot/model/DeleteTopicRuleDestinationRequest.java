package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeleteTopicRuleDestinationRequest extends AmazonWebServiceRequest implements Serializable {
    private String arn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteTopicRuleDestinationRequest)) {
            return false;
        }
        DeleteTopicRuleDestinationRequest deleteTopicRuleDestinationRequest = (DeleteTopicRuleDestinationRequest) obj;
        if ((deleteTopicRuleDestinationRequest.getArn() == null) ^ (getArn() == null)) {
            return false;
        }
        return deleteTopicRuleDestinationRequest.getArn() == null || deleteTopicRuleDestinationRequest.getArn().equals(getArn());
    }

    public String getArn() {
        return this.arn;
    }

    public int hashCode() {
        return 31 + (getArn() == null ? 0 : getArn().hashCode());
    }

    public void setArn(String str) {
        this.arn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getArn() != null) {
            sb.append("arn: " + getArn());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DeleteTopicRuleDestinationRequest withArn(String str) {
        this.arn = str;
        return this;
    }
}
