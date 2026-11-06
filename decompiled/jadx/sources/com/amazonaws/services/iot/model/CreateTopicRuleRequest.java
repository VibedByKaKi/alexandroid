package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateTopicRuleRequest extends AmazonWebServiceRequest implements Serializable {
    private String ruleName;
    private String tags;
    private TopicRulePayload topicRulePayload;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateTopicRuleRequest)) {
            return false;
        }
        CreateTopicRuleRequest createTopicRuleRequest = (CreateTopicRuleRequest) obj;
        if ((createTopicRuleRequest.getRuleName() == null) ^ (getRuleName() == null)) {
            return false;
        }
        if (createTopicRuleRequest.getRuleName() != null && !createTopicRuleRequest.getRuleName().equals(getRuleName())) {
            return false;
        }
        if ((createTopicRuleRequest.getTopicRulePayload() == null) ^ (getTopicRulePayload() == null)) {
            return false;
        }
        if (createTopicRuleRequest.getTopicRulePayload() != null && !createTopicRuleRequest.getTopicRulePayload().equals(getTopicRulePayload())) {
            return false;
        }
        if ((createTopicRuleRequest.getTags() == null) ^ (getTags() == null)) {
            return false;
        }
        return createTopicRuleRequest.getTags() == null || createTopicRuleRequest.getTags().equals(getTags());
    }

    public String getRuleName() {
        return this.ruleName;
    }

    public String getTags() {
        return this.tags;
    }

    public TopicRulePayload getTopicRulePayload() {
        return this.topicRulePayload;
    }

    public int hashCode() {
        return (((((getRuleName() == null ? 0 : getRuleName().hashCode()) + 31) * 31) + (getTopicRulePayload() == null ? 0 : getTopicRulePayload().hashCode())) * 31) + (getTags() != null ? getTags().hashCode() : 0);
    }

    public void setRuleName(String str) {
        this.ruleName = str;
    }

    public void setTags(String str) {
        this.tags = str;
    }

    public void setTopicRulePayload(TopicRulePayload topicRulePayload) {
        this.topicRulePayload = topicRulePayload;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getRuleName() != null) {
            sb.append("ruleName: " + getRuleName() + ",");
        }
        if (getTopicRulePayload() != null) {
            sb.append("topicRulePayload: " + getTopicRulePayload() + ",");
        }
        if (getTags() != null) {
            sb.append("tags: " + getTags());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreateTopicRuleRequest withRuleName(String str) {
        this.ruleName = str;
        return this;
    }

    public CreateTopicRuleRequest withTags(String str) {
        this.tags = str;
        return this;
    }

    public CreateTopicRuleRequest withTopicRulePayload(TopicRulePayload topicRulePayload) {
        this.topicRulePayload = topicRulePayload;
        return this;
    }
}
