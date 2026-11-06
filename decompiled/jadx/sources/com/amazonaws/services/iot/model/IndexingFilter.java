package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class IndexingFilter implements Serializable {
    private List<String> namedShadowNames;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof IndexingFilter)) {
            return false;
        }
        IndexingFilter indexingFilter = (IndexingFilter) obj;
        if ((indexingFilter.getNamedShadowNames() == null) ^ (getNamedShadowNames() == null)) {
            return false;
        }
        return indexingFilter.getNamedShadowNames() == null || indexingFilter.getNamedShadowNames().equals(getNamedShadowNames());
    }

    public List<String> getNamedShadowNames() {
        return this.namedShadowNames;
    }

    public int hashCode() {
        return 31 + (getNamedShadowNames() == null ? 0 : getNamedShadowNames().hashCode());
    }

    public void setNamedShadowNames(Collection<String> collection) {
        if (collection == null) {
            this.namedShadowNames = null;
        } else {
            this.namedShadowNames = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getNamedShadowNames() != null) {
            sb.append("namedShadowNames: " + getNamedShadowNames());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public IndexingFilter withNamedShadowNames(String... strArr) {
        if (getNamedShadowNames() == null) {
            this.namedShadowNames = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.namedShadowNames.add(str);
        }
        return this;
    }

    public IndexingFilter withNamedShadowNames(Collection<String> collection) {
        setNamedShadowNames(collection);
        return this;
    }
}
