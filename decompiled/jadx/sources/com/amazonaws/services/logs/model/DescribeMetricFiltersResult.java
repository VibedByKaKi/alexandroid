package com.amazonaws.services.logs.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeMetricFiltersResult implements Serializable {
    private List<MetricFilter> metricFilters;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeMetricFiltersResult)) {
            return false;
        }
        DescribeMetricFiltersResult describeMetricFiltersResult = (DescribeMetricFiltersResult) obj;
        if ((describeMetricFiltersResult.getMetricFilters() == null) ^ (getMetricFilters() == null)) {
            return false;
        }
        if (describeMetricFiltersResult.getMetricFilters() != null && !describeMetricFiltersResult.getMetricFilters().equals(getMetricFilters())) {
            return false;
        }
        if ((describeMetricFiltersResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return describeMetricFiltersResult.getNextToken() == null || describeMetricFiltersResult.getNextToken().equals(getNextToken());
    }

    public List<MetricFilter> getMetricFilters() {
        return this.metricFilters;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((getMetricFilters() == null ? 0 : getMetricFilters().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setMetricFilters(Collection<MetricFilter> collection) {
        if (collection == null) {
            this.metricFilters = null;
        } else {
            this.metricFilters = new ArrayList(collection);
        }
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getMetricFilters() != null) {
            sb.append("metricFilters: " + getMetricFilters() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeMetricFiltersResult withMetricFilters(MetricFilter... metricFilterArr) {
        if (getMetricFilters() == null) {
            this.metricFilters = new ArrayList(metricFilterArr.length);
        }
        for (MetricFilter metricFilter : metricFilterArr) {
            this.metricFilters.add(metricFilter);
        }
        return this;
    }

    public DescribeMetricFiltersResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public DescribeMetricFiltersResult withMetricFilters(Collection<MetricFilter> collection) {
        setMetricFilters(collection);
        return this;
    }
}
