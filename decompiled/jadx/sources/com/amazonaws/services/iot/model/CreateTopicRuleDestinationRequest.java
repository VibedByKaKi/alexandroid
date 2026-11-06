package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateTopicRuleDestinationRequest extends AmazonWebServiceRequest implements Serializable {
    private TopicRuleDestinationConfiguration destinationConfiguration;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateTopicRuleDestinationRequest)) {
            return false;
        }
        CreateTopicRuleDestinationRequest createTopicRuleDestinationRequest = (CreateTopicRuleDestinationRequest) obj;
        if ((createTopicRuleDestinationRequest.getDestinationConfiguration() == null) ^ (getDestinationConfiguration() == null)) {
            return false;
        }
        return createTopicRuleDestinationRequest.getDestinationConfiguration() == null || createTopicRuleDestinationRequest.getDestinationConfiguration().equals(getDestinationConfiguration());
    }

    public TopicRuleDestinationConfiguration getDestinationConfiguration() {
        return this.destinationConfiguration;
    }

    public int hashCode() {
        return 31 + (getDestinationConfiguration() == null ? 0 : getDestinationConfiguration().hashCode());
    }

    public void setDestinationConfiguration(TopicRuleDestinationConfiguration topicRuleDestinationConfiguration) {
        this.destinationConfiguration = topicRuleDestinationConfiguration;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getDestinationConfiguration() != null) {
            sb.append("destinationConfiguration: " + getDestinationConfiguration());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreateTopicRuleDestinationRequest withDestinationConfiguration(TopicRuleDestinationConfiguration topicRuleDestinationConfiguration) {
        this.destinationConfiguration = topicRuleDestinationConfiguration;
        return this;
    }
}
