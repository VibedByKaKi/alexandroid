package com.amazonaws.services.logs.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PutMetricFilterRequest extends AmazonWebServiceRequest implements Serializable {
    private String filterName;
    private String filterPattern;
    private String logGroupName;
    private List<MetricTransformation> metricTransformations;

    public PutMetricFilterRequest(String str, String str2, String str3, List<MetricTransformation> list) {
        setLogGroupName(str);
        setFilterName(str2);
        setFilterPattern(str3);
        setMetricTransformations(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PutMetricFilterRequest)) {
            return false;
        }
        PutMetricFilterRequest putMetricFilterRequest = (PutMetricFilterRequest) obj;
        if ((putMetricFilterRequest.getLogGroupName() == null) ^ (getLogGroupName() == null)) {
            return false;
        }
        if (putMetricFilterRequest.getLogGroupName() != null && !putMetricFilterRequest.getLogGroupName().equals(getLogGroupName())) {
            return false;
        }
        if ((putMetricFilterRequest.getFilterName() == null) ^ (getFilterName() == null)) {
            return false;
        }
        if (putMetricFilterRequest.getFilterName() != null && !putMetricFilterRequest.getFilterName().equals(getFilterName())) {
            return false;
        }
        if ((putMetricFilterRequest.getFilterPattern() == null) ^ (getFilterPattern() == null)) {
            return false;
        }
        if (putMetricFilterRequest.getFilterPattern() != null && !putMetricFilterRequest.getFilterPattern().equals(getFilterPattern())) {
            return false;
        }
        if ((putMetricFilterRequest.getMetricTransformations() == null) ^ (getMetricTransformations() == null)) {
            return false;
        }
        return putMetricFilterRequest.getMetricTransformations() == null || putMetricFilterRequest.getMetricTransformations().equals(getMetricTransformations());
    }

    public String getFilterName() {
        return this.filterName;
    }

    public String getFilterPattern() {
        return this.filterPattern;
    }

    public String getLogGroupName() {
        return this.logGroupName;
    }

    public List<MetricTransformation> getMetricTransformations() {
        return this.metricTransformations;
    }

    public int hashCode() {
        return (((((((getLogGroupName() == null ? 0 : getLogGroupName().hashCode()) + 31) * 31) + (getFilterName() == null ? 0 : getFilterName().hashCode())) * 31) + (getFilterPattern() == null ? 0 : getFilterPattern().hashCode())) * 31) + (getMetricTransformations() != null ? getMetricTransformations().hashCode() : 0);
    }

    public void setFilterName(String str) {
        this.filterName = str;
    }

    public void setFilterPattern(String str) {
        this.filterPattern = str;
    }

    public void setLogGroupName(String str) {
        this.logGroupName = str;
    }

    public void setMetricTransformations(Collection<MetricTransformation> collection) {
        if (collection == null) {
            this.metricTransformations = null;
        } else {
            this.metricTransformations = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getLogGroupName() != null) {
            sb.append("logGroupName: " + getLogGroupName() + ",");
        }
        if (getFilterName() != null) {
            sb.append("filterName: " + getFilterName() + ",");
        }
        if (getFilterPattern() != null) {
            sb.append("filterPattern: " + getFilterPattern() + ",");
        }
        if (getMetricTransformations() != null) {
            sb.append("metricTransformations: " + getMetricTransformations());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public PutMetricFilterRequest withFilterName(String str) {
        this.filterName = str;
        return this;
    }

    public PutMetricFilterRequest withFilterPattern(String str) {
        this.filterPattern = str;
        return this;
    }

    public PutMetricFilterRequest withLogGroupName(String str) {
        this.logGroupName = str;
        return this;
    }

    public PutMetricFilterRequest withMetricTransformations(MetricTransformation... metricTransformationArr) {
        if (getMetricTransformations() == null) {
            this.metricTransformations = new ArrayList(metricTransformationArr.length);
        }
        for (MetricTransformation metricTransformation : metricTransformationArr) {
            this.metricTransformations.add(metricTransformation);
        }
        return this;
    }

    public PutMetricFilterRequest() {
    }

    public PutMetricFilterRequest withMetricTransformations(Collection<MetricTransformation> collection) {
        setMetricTransformations(collection);
        return this;
    }
}
