package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListTopicRulesResult implements Serializable {
    private String nextToken;
    private List<TopicRuleListItem> rules;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListTopicRulesResult)) {
            return false;
        }
        ListTopicRulesResult listTopicRulesResult = (ListTopicRulesResult) obj;
        if ((listTopicRulesResult.getRules() == null) ^ (getRules() == null)) {
            return false;
        }
        if (listTopicRulesResult.getRules() != null && !listTopicRulesResult.getRules().equals(getRules())) {
            return false;
        }
        if ((listTopicRulesResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listTopicRulesResult.getNextToken() == null || listTopicRulesResult.getNextToken().equals(getNextToken());
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public List<TopicRuleListItem> getRules() {
        return this.rules;
    }

    public int hashCode() {
        return (((getRules() == null ? 0 : getRules().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setRules(Collection<TopicRuleListItem> collection) {
        if (collection == null) {
            this.rules = null;
        } else {
            this.rules = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getRules() != null) {
            sb.append("rules: " + getRules() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListTopicRulesResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListTopicRulesResult withRules(TopicRuleListItem... topicRuleListItemArr) {
        if (getRules() == null) {
            this.rules = new ArrayList(topicRuleListItemArr.length);
        }
        for (TopicRuleListItem topicRuleListItem : topicRuleListItemArr) {
            this.rules.add(topicRuleListItem);
        }
        return this;
    }

    public ListTopicRulesResult withRules(Collection<TopicRuleListItem> collection) {
        setRules(collection);
        return this;
    }
}
