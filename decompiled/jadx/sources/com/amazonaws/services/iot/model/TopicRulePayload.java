package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class TopicRulePayload implements Serializable {
    private List<Action> actions;
    private String awsIotSqlVersion;
    private String description;
    private Action errorAction;
    private Boolean ruleDisabled;
    private String sql;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TopicRulePayload)) {
            return false;
        }
        TopicRulePayload topicRulePayload = (TopicRulePayload) obj;
        if ((topicRulePayload.getSql() == null) ^ (getSql() == null)) {
            return false;
        }
        if (topicRulePayload.getSql() != null && !topicRulePayload.getSql().equals(getSql())) {
            return false;
        }
        if ((topicRulePayload.getDescription() == null) ^ (getDescription() == null)) {
            return false;
        }
        if (topicRulePayload.getDescription() != null && !topicRulePayload.getDescription().equals(getDescription())) {
            return false;
        }
        if ((topicRulePayload.getActions() == null) ^ (getActions() == null)) {
            return false;
        }
        if (topicRulePayload.getActions() != null && !topicRulePayload.getActions().equals(getActions())) {
            return false;
        }
        if ((topicRulePayload.getRuleDisabled() == null) ^ (getRuleDisabled() == null)) {
            return false;
        }
        if (topicRulePayload.getRuleDisabled() != null && !topicRulePayload.getRuleDisabled().equals(getRuleDisabled())) {
            return false;
        }
        if ((topicRulePayload.getAwsIotSqlVersion() == null) ^ (getAwsIotSqlVersion() == null)) {
            return false;
        }
        if (topicRulePayload.getAwsIotSqlVersion() != null && !topicRulePayload.getAwsIotSqlVersion().equals(getAwsIotSqlVersion())) {
            return false;
        }
        if ((topicRulePayload.getErrorAction() == null) ^ (getErrorAction() == null)) {
            return false;
        }
        return topicRulePayload.getErrorAction() == null || topicRulePayload.getErrorAction().equals(getErrorAction());
    }

    public List<Action> getActions() {
        return this.actions;
    }

    public String getAwsIotSqlVersion() {
        return this.awsIotSqlVersion;
    }

    public String getDescription() {
        return this.description;
    }

    public Action getErrorAction() {
        return this.errorAction;
    }

    public Boolean getRuleDisabled() {
        return this.ruleDisabled;
    }

    public String getSql() {
        return this.sql;
    }

    public int hashCode() {
        return (((((((((((getSql() == null ? 0 : getSql().hashCode()) + 31) * 31) + (getDescription() == null ? 0 : getDescription().hashCode())) * 31) + (getActions() == null ? 0 : getActions().hashCode())) * 31) + (getRuleDisabled() == null ? 0 : getRuleDisabled().hashCode())) * 31) + (getAwsIotSqlVersion() == null ? 0 : getAwsIotSqlVersion().hashCode())) * 31) + (getErrorAction() != null ? getErrorAction().hashCode() : 0);
    }

    public Boolean isRuleDisabled() {
        return this.ruleDisabled;
    }

    public void setActions(Collection<Action> collection) {
        if (collection == null) {
            this.actions = null;
        } else {
            this.actions = new ArrayList(collection);
        }
    }

    public void setAwsIotSqlVersion(String str) {
        this.awsIotSqlVersion = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setErrorAction(Action action) {
        this.errorAction = action;
    }

    public void setRuleDisabled(Boolean bool) {
        this.ruleDisabled = bool;
    }

    public void setSql(String str) {
        this.sql = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getSql() != null) {
            sb.append("sql: " + getSql() + ",");
        }
        if (getDescription() != null) {
            sb.append("description: " + getDescription() + ",");
        }
        if (getActions() != null) {
            sb.append("actions: " + getActions() + ",");
        }
        if (getRuleDisabled() != null) {
            sb.append("ruleDisabled: " + getRuleDisabled() + ",");
        }
        if (getAwsIotSqlVersion() != null) {
            sb.append("awsIotSqlVersion: " + getAwsIotSqlVersion() + ",");
        }
        if (getErrorAction() != null) {
            sb.append("errorAction: " + getErrorAction());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public TopicRulePayload withActions(Action... actionArr) {
        if (getActions() == null) {
            this.actions = new ArrayList(actionArr.length);
        }
        for (Action action : actionArr) {
            this.actions.add(action);
        }
        return this;
    }

    public TopicRulePayload withAwsIotSqlVersion(String str) {
        this.awsIotSqlVersion = str;
        return this;
    }

    public TopicRulePayload withDescription(String str) {
        this.description = str;
        return this;
    }

    public TopicRulePayload withErrorAction(Action action) {
        this.errorAction = action;
        return this;
    }

    public TopicRulePayload withRuleDisabled(Boolean bool) {
        this.ruleDisabled = bool;
        return this;
    }

    public TopicRulePayload withSql(String str) {
        this.sql = str;
        return this;
    }

    public TopicRulePayload withActions(Collection<Action> collection) {
        setActions(collection);
        return this;
    }
}
