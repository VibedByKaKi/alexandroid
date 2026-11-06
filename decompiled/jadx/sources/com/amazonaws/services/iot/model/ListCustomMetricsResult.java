package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListCustomMetricsResult implements Serializable {
    private List<String> metricNames;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListCustomMetricsResult)) {
            return false;
        }
        ListCustomMetricsResult listCustomMetricsResult = (ListCustomMetricsResult) obj;
        if ((listCustomMetricsResult.getMetricNames() == null) ^ (getMetricNames() == null)) {
            return false;
        }
        if (listCustomMetricsResult.getMetricNames() != null && !listCustomMetricsResult.getMetricNames().equals(getMetricNames())) {
            return false;
        }
        if ((listCustomMetricsResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listCustomMetricsResult.getNextToken() == null || listCustomMetricsResult.getNextToken().equals(getNextToken());
    }

    public List<String> getMetricNames() {
        return this.metricNames;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((getMetricNames() == null ? 0 : getMetricNames().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setMetricNames(Collection<String> collection) {
        if (collection == null) {
            this.metricNames = null;
        } else {
            this.metricNames = new ArrayList(collection);
        }
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getMetricNames() != null) {
            sb.append("metricNames: " + getMetricNames() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListCustomMetricsResult withMetricNames(String... strArr) {
        if (getMetricNames() == null) {
            this.metricNames = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.metricNames.add(str);
        }
        return this;
    }

    public ListCustomMetricsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListCustomMetricsResult withMetricNames(Collection<String> collection) {
        setMetricNames(collection);
        return this;
    }
}
