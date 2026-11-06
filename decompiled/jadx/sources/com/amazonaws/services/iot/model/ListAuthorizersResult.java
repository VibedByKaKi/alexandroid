package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListAuthorizersResult implements Serializable {
    private List<AuthorizerSummary> authorizers;
    private String nextMarker;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListAuthorizersResult)) {
            return false;
        }
        ListAuthorizersResult listAuthorizersResult = (ListAuthorizersResult) obj;
        if ((listAuthorizersResult.getAuthorizers() == null) ^ (getAuthorizers() == null)) {
            return false;
        }
        if (listAuthorizersResult.getAuthorizers() != null && !listAuthorizersResult.getAuthorizers().equals(getAuthorizers())) {
            return false;
        }
        if ((listAuthorizersResult.getNextMarker() == null) ^ (getNextMarker() == null)) {
            return false;
        }
        return listAuthorizersResult.getNextMarker() == null || listAuthorizersResult.getNextMarker().equals(getNextMarker());
    }

    public List<AuthorizerSummary> getAuthorizers() {
        return this.authorizers;
    }

    public String getNextMarker() {
        return this.nextMarker;
    }

    public int hashCode() {
        return (((getAuthorizers() == null ? 0 : getAuthorizers().hashCode()) + 31) * 31) + (getNextMarker() != null ? getNextMarker().hashCode() : 0);
    }

    public void setAuthorizers(Collection<AuthorizerSummary> collection) {
        if (collection == null) {
            this.authorizers = null;
        } else {
            this.authorizers = new ArrayList(collection);
        }
    }

    public void setNextMarker(String str) {
        this.nextMarker = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getAuthorizers() != null) {
            sb.append("authorizers: " + getAuthorizers() + ",");
        }
        if (getNextMarker() != null) {
            sb.append("nextMarker: " + getNextMarker());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListAuthorizersResult withAuthorizers(AuthorizerSummary... authorizerSummaryArr) {
        if (getAuthorizers() == null) {
            this.authorizers = new ArrayList(authorizerSummaryArr.length);
        }
        for (AuthorizerSummary authorizerSummary : authorizerSummaryArr) {
            this.authorizers.add(authorizerSummary);
        }
        return this;
    }

    public ListAuthorizersResult withNextMarker(String str) {
        this.nextMarker = str;
        return this;
    }

    public ListAuthorizersResult withAuthorizers(Collection<AuthorizerSummary> collection) {
        setAuthorizers(collection);
        return this;
    }
}
