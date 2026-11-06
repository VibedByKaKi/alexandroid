package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class TopicRuleListItem implements Serializable {
    private Date createdAt;
    private String ruleArn;
    private Boolean ruleDisabled;
    private String ruleName;
    private String topicPattern;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TopicRuleListItem)) {
            return false;
        }
        TopicRuleListItem topicRuleListItem = (TopicRuleListItem) obj;
        if ((topicRuleListItem.getRuleArn() == null) ^ (getRuleArn() == null)) {
            return false;
        }
        if (topicRuleListItem.getRuleArn() != null && !topicRuleListItem.getRuleArn().equals(getRuleArn())) {
            return false;
        }
        if ((topicRuleListItem.getRuleName() == null) ^ (getRuleName() == null)) {
            return false;
        }
        if (topicRuleListItem.getRuleName() != null && !topicRuleListItem.getRuleName().equals(getRuleName())) {
            return false;
        }
        if ((topicRuleListItem.getTopicPattern() == null) ^ (getTopicPattern() == null)) {
            return false;
        }
        if (topicRuleListItem.getTopicPattern() != null && !topicRuleListItem.getTopicPattern().equals(getTopicPattern())) {
            return false;
        }
        if ((topicRuleListItem.getCreatedAt() == null) ^ (getCreatedAt() == null)) {
            return false;
        }
        if (topicRuleListItem.getCreatedAt() != null && !topicRuleListItem.getCreatedAt().equals(getCreatedAt())) {
            return false;
        }
        if ((topicRuleListItem.getRuleDisabled() == null) ^ (getRuleDisabled() == null)) {
            return false;
        }
        return topicRuleListItem.getRuleDisabled() == null || topicRuleListItem.getRuleDisabled().equals(getRuleDisabled());
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public String getRuleArn() {
        return this.ruleArn;
    }

    public Boolean getRuleDisabled() {
        return this.ruleDisabled;
    }

    public String getRuleName() {
        return this.ruleName;
    }

    public String getTopicPattern() {
        return this.topicPattern;
    }

    public int hashCode() {
        return (((((((((getRuleArn() == null ? 0 : getRuleArn().hashCode()) + 31) * 31) + (getRuleName() == null ? 0 : getRuleName().hashCode())) * 31) + (getTopicPattern() == null ? 0 : getTopicPattern().hashCode())) * 31) + (getCreatedAt() == null ? 0 : getCreatedAt().hashCode())) * 31) + (getRuleDisabled() != null ? getRuleDisabled().hashCode() : 0);
    }

    public Boolean isRuleDisabled() {
        return this.ruleDisabled;
    }

    public void setCreatedAt(Date date) {
        this.createdAt = date;
    }

    public void setRuleArn(String str) {
        this.ruleArn = str;
    }

    public void setRuleDisabled(Boolean bool) {
        this.ruleDisabled = bool;
    }

    public void setRuleName(String str) {
        this.ruleName = str;
    }

    public void setTopicPattern(String str) {
        this.topicPattern = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getRuleArn() != null) {
            sb.append("ruleArn: " + getRuleArn() + ",");
        }
        if (getRuleName() != null) {
            sb.append("ruleName: " + getRuleName() + ",");
        }
        if (getTopicPattern() != null) {
            sb.append("topicPattern: " + getTopicPattern() + ",");
        }
        if (getCreatedAt() != null) {
            sb.append("createdAt: " + getCreatedAt() + ",");
        }
        if (getRuleDisabled() != null) {
            sb.append("ruleDisabled: " + getRuleDisabled());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public TopicRuleListItem withCreatedAt(Date date) {
        this.createdAt = date;
        return this;
    }

    public TopicRuleListItem withRuleArn(String str) {
        this.ruleArn = str;
        return this;
    }

    public TopicRuleListItem withRuleDisabled(Boolean bool) {
        this.ruleDisabled = bool;
        return this;
    }

    public TopicRuleListItem withRuleName(String str) {
        this.ruleName = str;
        return this;
    }

    public TopicRuleListItem withTopicPattern(String str) {
        this.topicPattern = str;
        return this;
    }
}
