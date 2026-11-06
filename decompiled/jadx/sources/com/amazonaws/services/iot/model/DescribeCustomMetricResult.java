package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeCustomMetricResult implements Serializable {
    private Date creationDate;
    private String displayName;
    private Date lastModifiedDate;
    private String metricArn;
    private String metricName;
    private String metricType;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeCustomMetricResult)) {
            return false;
        }
        DescribeCustomMetricResult describeCustomMetricResult = (DescribeCustomMetricResult) obj;
        if ((describeCustomMetricResult.getMetricName() == null) ^ (getMetricName() == null)) {
            return false;
        }
        if (describeCustomMetricResult.getMetricName() != null && !describeCustomMetricResult.getMetricName().equals(getMetricName())) {
            return false;
        }
        if ((describeCustomMetricResult.getMetricArn() == null) ^ (getMetricArn() == null)) {
            return false;
        }
        if (describeCustomMetricResult.getMetricArn() != null && !describeCustomMetricResult.getMetricArn().equals(getMetricArn())) {
            return false;
        }
        if ((describeCustomMetricResult.getMetricType() == null) ^ (getMetricType() == null)) {
            return false;
        }
        if (describeCustomMetricResult.getMetricType() != null && !describeCustomMetricResult.getMetricType().equals(getMetricType())) {
            return false;
        }
        if ((describeCustomMetricResult.getDisplayName() == null) ^ (getDisplayName() == null)) {
            return false;
        }
        if (describeCustomMetricResult.getDisplayName() != null && !describeCustomMetricResult.getDisplayName().equals(getDisplayName())) {
            return false;
        }
        if ((describeCustomMetricResult.getCreationDate() == null) ^ (getCreationDate() == null)) {
            return false;
        }
        if (describeCustomMetricResult.getCreationDate() != null && !describeCustomMetricResult.getCreationDate().equals(getCreationDate())) {
            return false;
        }
        if ((describeCustomMetricResult.getLastModifiedDate() == null) ^ (getLastModifiedDate() == null)) {
            return false;
        }
        return describeCustomMetricResult.getLastModifiedDate() == null || describeCustomMetricResult.getLastModifiedDate().equals(getLastModifiedDate());
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public String getMetricArn() {
        return this.metricArn;
    }

    public String getMetricName() {
        return this.metricName;
    }

    public String getMetricType() {
        return this.metricType;
    }

    public int hashCode() {
        return (((((((((((getMetricName() == null ? 0 : getMetricName().hashCode()) + 31) * 31) + (getMetricArn() == null ? 0 : getMetricArn().hashCode())) * 31) + (getMetricType() == null ? 0 : getMetricType().hashCode())) * 31) + (getDisplayName() == null ? 0 : getDisplayName().hashCode())) * 31) + (getCreationDate() == null ? 0 : getCreationDate().hashCode())) * 31) + (getLastModifiedDate() != null ? getLastModifiedDate().hashCode() : 0);
    }

    public void setCreationDate(Date date) {
        this.creationDate = date;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setLastModifiedDate(Date date) {
        this.lastModifiedDate = date;
    }

    public void setMetricArn(String str) {
        this.metricArn = str;
    }

    public void setMetricName(String str) {
        this.metricName = str;
    }

    public void setMetricType(CustomMetricType customMetricType) {
        this.metricType = customMetricType.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getMetricName() != null) {
            sb.append("metricName: " + getMetricName() + ",");
        }
        if (getMetricArn() != null) {
            sb.append("metricArn: " + getMetricArn() + ",");
        }
        if (getMetricType() != null) {
            sb.append("metricType: " + getMetricType() + ",");
        }
        if (getDisplayName() != null) {
            sb.append("displayName: " + getDisplayName() + ",");
        }
        if (getCreationDate() != null) {
            sb.append("creationDate: " + getCreationDate() + ",");
        }
        if (getLastModifiedDate() != null) {
            sb.append("lastModifiedDate: " + getLastModifiedDate());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeCustomMetricResult withCreationDate(Date date) {
        this.creationDate = date;
        return this;
    }

    public DescribeCustomMetricResult withDisplayName(String str) {
        this.displayName = str;
        return this;
    }

    public DescribeCustomMetricResult withLastModifiedDate(Date date) {
        this.lastModifiedDate = date;
        return this;
    }

    public DescribeCustomMetricResult withMetricArn(String str) {
        this.metricArn = str;
        return this;
    }

    public DescribeCustomMetricResult withMetricName(String str) {
        this.metricName = str;
        return this;
    }

    public DescribeCustomMetricResult withMetricType(CustomMetricType customMetricType) {
        this.metricType = customMetricType.toString();
        return this;
    }

    public void setMetricType(String str) {
        this.metricType = str;
    }

    public DescribeCustomMetricResult withMetricType(String str) {
        this.metricType = str;
        return this;
    }
}
