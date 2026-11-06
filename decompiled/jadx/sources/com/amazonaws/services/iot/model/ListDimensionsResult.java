package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListDimensionsResult implements Serializable {
    private List<String> dimensionNames;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListDimensionsResult)) {
            return false;
        }
        ListDimensionsResult listDimensionsResult = (ListDimensionsResult) obj;
        if ((listDimensionsResult.getDimensionNames() == null) ^ (getDimensionNames() == null)) {
            return false;
        }
        if (listDimensionsResult.getDimensionNames() != null && !listDimensionsResult.getDimensionNames().equals(getDimensionNames())) {
            return false;
        }
        if ((listDimensionsResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listDimensionsResult.getNextToken() == null || listDimensionsResult.getNextToken().equals(getNextToken());
    }

    public List<String> getDimensionNames() {
        return this.dimensionNames;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((getDimensionNames() == null ? 0 : getDimensionNames().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setDimensionNames(Collection<String> collection) {
        if (collection == null) {
            this.dimensionNames = null;
        } else {
            this.dimensionNames = new ArrayList(collection);
        }
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getDimensionNames() != null) {
            sb.append("dimensionNames: " + getDimensionNames() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListDimensionsResult withDimensionNames(String... strArr) {
        if (getDimensionNames() == null) {
            this.dimensionNames = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.dimensionNames.add(str);
        }
        return this;
    }

    public ListDimensionsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListDimensionsResult withDimensionNames(Collection<String> collection) {
        setDimensionNames(collection);
        return this;
    }
}
