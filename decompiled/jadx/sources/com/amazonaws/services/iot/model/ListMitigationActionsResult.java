package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListMitigationActionsResult implements Serializable {
    private List<MitigationActionIdentifier> actionIdentifiers;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListMitigationActionsResult)) {
            return false;
        }
        ListMitigationActionsResult listMitigationActionsResult = (ListMitigationActionsResult) obj;
        if ((listMitigationActionsResult.getActionIdentifiers() == null) ^ (getActionIdentifiers() == null)) {
            return false;
        }
        if (listMitigationActionsResult.getActionIdentifiers() != null && !listMitigationActionsResult.getActionIdentifiers().equals(getActionIdentifiers())) {
            return false;
        }
        if ((listMitigationActionsResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listMitigationActionsResult.getNextToken() == null || listMitigationActionsResult.getNextToken().equals(getNextToken());
    }

    public List<MitigationActionIdentifier> getActionIdentifiers() {
        return this.actionIdentifiers;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((getActionIdentifiers() == null ? 0 : getActionIdentifiers().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setActionIdentifiers(Collection<MitigationActionIdentifier> collection) {
        if (collection == null) {
            this.actionIdentifiers = null;
        } else {
            this.actionIdentifiers = new ArrayList(collection);
        }
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getActionIdentifiers() != null) {
            sb.append("actionIdentifiers: " + getActionIdentifiers() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListMitigationActionsResult withActionIdentifiers(MitigationActionIdentifier... mitigationActionIdentifierArr) {
        if (getActionIdentifiers() == null) {
            this.actionIdentifiers = new ArrayList(mitigationActionIdentifierArr.length);
        }
        for (MitigationActionIdentifier mitigationActionIdentifier : mitigationActionIdentifierArr) {
            this.actionIdentifiers.add(mitigationActionIdentifier);
        }
        return this;
    }

    public ListMitigationActionsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListMitigationActionsResult withActionIdentifiers(Collection<MitigationActionIdentifier> collection) {
        setActionIdentifiers(collection);
        return this;
    }
}
