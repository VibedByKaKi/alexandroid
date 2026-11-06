package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListPolicyPrincipalsResult implements Serializable {
    private String nextMarker;
    private List<String> principals;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListPolicyPrincipalsResult)) {
            return false;
        }
        ListPolicyPrincipalsResult listPolicyPrincipalsResult = (ListPolicyPrincipalsResult) obj;
        if ((listPolicyPrincipalsResult.getPrincipals() == null) ^ (getPrincipals() == null)) {
            return false;
        }
        if (listPolicyPrincipalsResult.getPrincipals() != null && !listPolicyPrincipalsResult.getPrincipals().equals(getPrincipals())) {
            return false;
        }
        if ((listPolicyPrincipalsResult.getNextMarker() == null) ^ (getNextMarker() == null)) {
            return false;
        }
        return listPolicyPrincipalsResult.getNextMarker() == null || listPolicyPrincipalsResult.getNextMarker().equals(getNextMarker());
    }

    public String getNextMarker() {
        return this.nextMarker;
    }

    public List<String> getPrincipals() {
        return this.principals;
    }

    public int hashCode() {
        return (((getPrincipals() == null ? 0 : getPrincipals().hashCode()) + 31) * 31) + (getNextMarker() != null ? getNextMarker().hashCode() : 0);
    }

    public void setNextMarker(String str) {
        this.nextMarker = str;
    }

    public void setPrincipals(Collection<String> collection) {
        if (collection == null) {
            this.principals = null;
        } else {
            this.principals = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getPrincipals() != null) {
            sb.append("principals: " + getPrincipals() + ",");
        }
        if (getNextMarker() != null) {
            sb.append("nextMarker: " + getNextMarker());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListPolicyPrincipalsResult withNextMarker(String str) {
        this.nextMarker = str;
        return this;
    }

    public ListPolicyPrincipalsResult withPrincipals(String... strArr) {
        if (getPrincipals() == null) {
            this.principals = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.principals.add(str);
        }
        return this;
    }

    public ListPolicyPrincipalsResult withPrincipals(Collection<String> collection) {
        setPrincipals(collection);
        return this;
    }
}
