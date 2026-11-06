package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AccountTakeoverRiskConfigurationType implements Serializable {
    private AccountTakeoverActionsType actions;
    private NotifyConfigurationType notifyConfiguration;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccountTakeoverRiskConfigurationType)) {
            return false;
        }
        AccountTakeoverRiskConfigurationType accountTakeoverRiskConfigurationType = (AccountTakeoverRiskConfigurationType) obj;
        if ((accountTakeoverRiskConfigurationType.getNotifyConfiguration() == null) ^ (getNotifyConfiguration() == null)) {
            return false;
        }
        if (accountTakeoverRiskConfigurationType.getNotifyConfiguration() != null && !accountTakeoverRiskConfigurationType.getNotifyConfiguration().equals(getNotifyConfiguration())) {
            return false;
        }
        if ((accountTakeoverRiskConfigurationType.getActions() == null) ^ (getActions() == null)) {
            return false;
        }
        return accountTakeoverRiskConfigurationType.getActions() == null || accountTakeoverRiskConfigurationType.getActions().equals(getActions());
    }

    public AccountTakeoverActionsType getActions() {
        return this.actions;
    }

    public NotifyConfigurationType getNotifyConfiguration() {
        return this.notifyConfiguration;
    }

    public int hashCode() {
        return (((getNotifyConfiguration() == null ? 0 : getNotifyConfiguration().hashCode()) + 31) * 31) + (getActions() != null ? getActions().hashCode() : 0);
    }

    public void setActions(AccountTakeoverActionsType accountTakeoverActionsType) {
        this.actions = accountTakeoverActionsType;
    }

    public void setNotifyConfiguration(NotifyConfigurationType notifyConfigurationType) {
        this.notifyConfiguration = notifyConfigurationType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getNotifyConfiguration() != null) {
            sb.append("NotifyConfiguration: " + getNotifyConfiguration() + ",");
        }
        if (getActions() != null) {
            sb.append("Actions: " + getActions());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AccountTakeoverRiskConfigurationType withActions(AccountTakeoverActionsType accountTakeoverActionsType) {
        this.actions = accountTakeoverActionsType;
        return this;
    }

    public AccountTakeoverRiskConfigurationType withNotifyConfiguration(NotifyConfigurationType notifyConfigurationType) {
        this.notifyConfiguration = notifyConfigurationType;
        return this;
    }
}
