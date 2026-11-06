package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListRoleAliasesResult implements Serializable {
    private String nextMarker;
    private List<String> roleAliases;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListRoleAliasesResult)) {
            return false;
        }
        ListRoleAliasesResult listRoleAliasesResult = (ListRoleAliasesResult) obj;
        if ((listRoleAliasesResult.getRoleAliases() == null) ^ (getRoleAliases() == null)) {
            return false;
        }
        if (listRoleAliasesResult.getRoleAliases() != null && !listRoleAliasesResult.getRoleAliases().equals(getRoleAliases())) {
            return false;
        }
        if ((listRoleAliasesResult.getNextMarker() == null) ^ (getNextMarker() == null)) {
            return false;
        }
        return listRoleAliasesResult.getNextMarker() == null || listRoleAliasesResult.getNextMarker().equals(getNextMarker());
    }

    public String getNextMarker() {
        return this.nextMarker;
    }

    public List<String> getRoleAliases() {
        return this.roleAliases;
    }

    public int hashCode() {
        return (((getRoleAliases() == null ? 0 : getRoleAliases().hashCode()) + 31) * 31) + (getNextMarker() != null ? getNextMarker().hashCode() : 0);
    }

    public void setNextMarker(String str) {
        this.nextMarker = str;
    }

    public void setRoleAliases(Collection<String> collection) {
        if (collection == null) {
            this.roleAliases = null;
        } else {
            this.roleAliases = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getRoleAliases() != null) {
            sb.append("roleAliases: " + getRoleAliases() + ",");
        }
        if (getNextMarker() != null) {
            sb.append("nextMarker: " + getNextMarker());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListRoleAliasesResult withNextMarker(String str) {
        this.nextMarker = str;
        return this;
    }

    public ListRoleAliasesResult withRoleAliases(String... strArr) {
        if (getRoleAliases() == null) {
            this.roleAliases = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.roleAliases.add(str);
        }
        return this;
    }

    public ListRoleAliasesResult withRoleAliases(Collection<String> collection) {
        setRoleAliases(collection);
        return this;
    }
}
