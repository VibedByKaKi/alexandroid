package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetTopicRuleResult implements Serializable {
    private TopicRule rule;
    private String ruleArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetTopicRuleResult)) {
            return false;
        }
        GetTopicRuleResult getTopicRuleResult = (GetTopicRuleResult) obj;
        if ((getTopicRuleResult.getRuleArn() == null) ^ (getRuleArn() == null)) {
            return false;
        }
        if (getTopicRuleResult.getRuleArn() != null && !getTopicRuleResult.getRuleArn().equals(getRuleArn())) {
            return false;
        }
        if ((getTopicRuleResult.getRule() == null) ^ (getRule() == null)) {
            return false;
        }
        return getTopicRuleResult.getRule() == null || getTopicRuleResult.getRule().equals(getRule());
    }

    public TopicRule getRule() {
        return this.rule;
    }

    public String getRuleArn() {
        return this.ruleArn;
    }

    public int hashCode() {
        return (((getRuleArn() == null ? 0 : getRuleArn().hashCode()) + 31) * 31) + (getRule() != null ? getRule().hashCode() : 0);
    }

    public void setRule(TopicRule topicRule) {
        this.rule = topicRule;
    }

    public void setRuleArn(String str) {
        this.ruleArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getRuleArn() != null) {
            sb.append("ruleArn: " + getRuleArn() + ",");
        }
        if (getRule() != null) {
            sb.append("rule: " + getRule());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetTopicRuleResult withRule(TopicRule topicRule) {
        this.rule = topicRule;
        return this;
    }

    public GetTopicRuleResult withRuleArn(String str) {
        this.ruleArn = str;
        return this;
    }
}
