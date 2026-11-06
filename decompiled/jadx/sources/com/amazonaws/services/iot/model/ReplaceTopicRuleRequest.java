package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ReplaceTopicRuleRequest extends AmazonWebServiceRequest implements Serializable {
    private String ruleName;
    private TopicRulePayload topicRulePayload;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ReplaceTopicRuleRequest)) {
            return false;
        }
        ReplaceTopicRuleRequest replaceTopicRuleRequest = (ReplaceTopicRuleRequest) obj;
        if ((replaceTopicRuleRequest.getRuleName() == null) ^ (getRuleName() == null)) {
            return false;
        }
        if (replaceTopicRuleRequest.getRuleName() != null && !replaceTopicRuleRequest.getRuleName().equals(getRuleName())) {
            return false;
        }
        if ((replaceTopicRuleRequest.getTopicRulePayload() == null) ^ (getTopicRulePayload() == null)) {
            return false;
        }
        return replaceTopicRuleRequest.getTopicRulePayload() == null || replaceTopicRuleRequest.getTopicRulePayload().equals(getTopicRulePayload());
    }

    public String getRuleName() {
        return this.ruleName;
    }

    public TopicRulePayload getTopicRulePayload() {
        return this.topicRulePayload;
    }

    public int hashCode() {
        return (((getRuleName() == null ? 0 : getRuleName().hashCode()) + 31) * 31) + (getTopicRulePayload() != null ? getTopicRulePayload().hashCode() : 0);
    }

    public void setRuleName(String str) {
        this.ruleName = str;
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
            sb.append("topicRulePayload: " + getTopicRulePayload());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ReplaceTopicRuleRequest withRuleName(String str) {
        this.ruleName = str;
        return this;
    }

    public ReplaceTopicRuleRequest withTopicRulePayload(TopicRulePayload topicRulePayload) {
        this.topicRulePayload = topicRulePayload;
        return this;
    }
}
