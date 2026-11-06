package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeJobResult implements Serializable {
    private String documentSource;
    private Job job;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeJobResult)) {
            return false;
        }
        DescribeJobResult describeJobResult = (DescribeJobResult) obj;
        if ((describeJobResult.getDocumentSource() == null) ^ (getDocumentSource() == null)) {
            return false;
        }
        if (describeJobResult.getDocumentSource() != null && !describeJobResult.getDocumentSource().equals(getDocumentSource())) {
            return false;
        }
        if ((describeJobResult.getJob() == null) ^ (getJob() == null)) {
            return false;
        }
        return describeJobResult.getJob() == null || describeJobResult.getJob().equals(getJob());
    }

    public String getDocumentSource() {
        return this.documentSource;
    }

    public Job getJob() {
        return this.job;
    }

    public int hashCode() {
        return (((getDocumentSource() == null ? 0 : getDocumentSource().hashCode()) + 31) * 31) + (getJob() != null ? getJob().hashCode() : 0);
    }

    public void setDocumentSource(String str) {
        this.documentSource = str;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getDocumentSource() != null) {
            sb.append("documentSource: " + getDocumentSource() + ",");
        }
        if (getJob() != null) {
            sb.append("job: " + getJob());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeJobResult withDocumentSource(String str) {
        this.documentSource = str;
        return this;
    }

    public DescribeJobResult withJob(Job job) {
        this.job = job;
        return this;
    }
}
