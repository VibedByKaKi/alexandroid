package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CompromisedCredentialsActionsType implements Serializable {
    private String eventAction;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CompromisedCredentialsActionsType)) {
            return false;
        }
        CompromisedCredentialsActionsType compromisedCredentialsActionsType = (CompromisedCredentialsActionsType) obj;
        if ((compromisedCredentialsActionsType.getEventAction() == null) ^ (getEventAction() == null)) {
            return false;
        }
        return compromisedCredentialsActionsType.getEventAction() == null || compromisedCredentialsActionsType.getEventAction().equals(getEventAction());
    }

    public String getEventAction() {
        return this.eventAction;
    }

    public int hashCode() {
        return 31 + (getEventAction() == null ? 0 : getEventAction().hashCode());
    }

    public void setEventAction(CompromisedCredentialsEventActionType compromisedCredentialsEventActionType) {
        this.eventAction = compromisedCredentialsEventActionType.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getEventAction() != null) {
            sb.append("EventAction: " + getEventAction());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CompromisedCredentialsActionsType withEventAction(CompromisedCredentialsEventActionType compromisedCredentialsEventActionType) {
        this.eventAction = compromisedCredentialsEventActionType.toString();
        return this;
    }

    public void setEventAction(String str) {
        this.eventAction = str;
    }

    public CompromisedCredentialsActionsType withEventAction(String str) {
        this.eventAction = str;
        return this;
    }
}
