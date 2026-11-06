package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AccountTakeoverActionsType implements Serializable {
    private AccountTakeoverActionType highAction;
    private AccountTakeoverActionType lowAction;
    private AccountTakeoverActionType mediumAction;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccountTakeoverActionsType)) {
            return false;
        }
        AccountTakeoverActionsType accountTakeoverActionsType = (AccountTakeoverActionsType) obj;
        if ((accountTakeoverActionsType.getLowAction() == null) ^ (getLowAction() == null)) {
            return false;
        }
        if (accountTakeoverActionsType.getLowAction() != null && !accountTakeoverActionsType.getLowAction().equals(getLowAction())) {
            return false;
        }
        if ((accountTakeoverActionsType.getMediumAction() == null) ^ (getMediumAction() == null)) {
            return false;
        }
        if (accountTakeoverActionsType.getMediumAction() != null && !accountTakeoverActionsType.getMediumAction().equals(getMediumAction())) {
            return false;
        }
        if ((accountTakeoverActionsType.getHighAction() == null) ^ (getHighAction() == null)) {
            return false;
        }
        return accountTakeoverActionsType.getHighAction() == null || accountTakeoverActionsType.getHighAction().equals(getHighAction());
    }

    public AccountTakeoverActionType getHighAction() {
        return this.highAction;
    }

    public AccountTakeoverActionType getLowAction() {
        return this.lowAction;
    }

    public AccountTakeoverActionType getMediumAction() {
        return this.mediumAction;
    }

    public int hashCode() {
        return (((((getLowAction() == null ? 0 : getLowAction().hashCode()) + 31) * 31) + (getMediumAction() == null ? 0 : getMediumAction().hashCode())) * 31) + (getHighAction() != null ? getHighAction().hashCode() : 0);
    }

    public void setHighAction(AccountTakeoverActionType accountTakeoverActionType) {
        this.highAction = accountTakeoverActionType;
    }

    public void setLowAction(AccountTakeoverActionType accountTakeoverActionType) {
        this.lowAction = accountTakeoverActionType;
    }

    public void setMediumAction(AccountTakeoverActionType accountTakeoverActionType) {
        this.mediumAction = accountTakeoverActionType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getLowAction() != null) {
            sb.append("LowAction: " + getLowAction() + ",");
        }
        if (getMediumAction() != null) {
            sb.append("MediumAction: " + getMediumAction() + ",");
        }
        if (getHighAction() != null) {
            sb.append("HighAction: " + getHighAction());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AccountTakeoverActionsType withHighAction(AccountTakeoverActionType accountTakeoverActionType) {
        this.highAction = accountTakeoverActionType;
        return this;
    }

    public AccountTakeoverActionsType withLowAction(AccountTakeoverActionType accountTakeoverActionType) {
        this.lowAction = accountTakeoverActionType;
        return this;
    }

    public AccountTakeoverActionsType withMediumAction(AccountTakeoverActionType accountTakeoverActionType) {
        this.mediumAction = accountTakeoverActionType;
        return this;
    }
}
