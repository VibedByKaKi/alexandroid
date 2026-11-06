package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListThingPrincipalsResult implements Serializable {
    private String nextToken;
    private List<String> principals;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListThingPrincipalsResult)) {
            return false;
        }
        ListThingPrincipalsResult listThingPrincipalsResult = (ListThingPrincipalsResult) obj;
        if ((listThingPrincipalsResult.getPrincipals() == null) ^ (getPrincipals() == null)) {
            return false;
        }
        if (listThingPrincipalsResult.getPrincipals() != null && !listThingPrincipalsResult.getPrincipals().equals(getPrincipals())) {
            return false;
        }
        if ((listThingPrincipalsResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listThingPrincipalsResult.getNextToken() == null || listThingPrincipalsResult.getNextToken().equals(getNextToken());
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public List<String> getPrincipals() {
        return this.principals;
    }

    public int hashCode() {
        return (((getPrincipals() == null ? 0 : getPrincipals().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setNextToken(String str) {
        this.nextToken = str;
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
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListThingPrincipalsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListThingPrincipalsResult withPrincipals(String... strArr) {
        if (getPrincipals() == null) {
            this.principals = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.principals.add(str);
        }
        return this;
    }

    public ListThingPrincipalsResult withPrincipals(Collection<String> collection) {
        setPrincipals(collection);
        return this;
    }
}
