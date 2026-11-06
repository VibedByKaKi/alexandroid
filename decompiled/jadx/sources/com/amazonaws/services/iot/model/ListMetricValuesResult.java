package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListMetricValuesResult implements Serializable {
    private List<MetricDatum> metricDatumList;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListMetricValuesResult)) {
            return false;
        }
        ListMetricValuesResult listMetricValuesResult = (ListMetricValuesResult) obj;
        if ((listMetricValuesResult.getMetricDatumList() == null) ^ (getMetricDatumList() == null)) {
            return false;
        }
        if (listMetricValuesResult.getMetricDatumList() != null && !listMetricValuesResult.getMetricDatumList().equals(getMetricDatumList())) {
            return false;
        }
        if ((listMetricValuesResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listMetricValuesResult.getNextToken() == null || listMetricValuesResult.getNextToken().equals(getNextToken());
    }

    public List<MetricDatum> getMetricDatumList() {
        return this.metricDatumList;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((getMetricDatumList() == null ? 0 : getMetricDatumList().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setMetricDatumList(Collection<MetricDatum> collection) {
        if (collection == null) {
            this.metricDatumList = null;
        } else {
            this.metricDatumList = new ArrayList(collection);
        }
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getMetricDatumList() != null) {
            sb.append("metricDatumList: " + getMetricDatumList() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListMetricValuesResult withMetricDatumList(MetricDatum... metricDatumArr) {
        if (getMetricDatumList() == null) {
            this.metricDatumList = new ArrayList(metricDatumArr.length);
        }
        for (MetricDatum metricDatum : metricDatumArr) {
            this.metricDatumList.add(metricDatum);
        }
        return this;
    }

    public ListMetricValuesResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListMetricValuesResult withMetricDatumList(Collection<MetricDatum> collection) {
        setMetricDatumList(collection);
        return this;
    }
}
