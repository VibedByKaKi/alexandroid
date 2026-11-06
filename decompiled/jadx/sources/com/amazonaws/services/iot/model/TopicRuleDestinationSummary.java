package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class TopicRuleDestinationSummary implements Serializable {
    private String arn;
    private Date createdAt;
    private HttpUrlDestinationSummary httpUrlSummary;
    private Date lastUpdatedAt;
    private String status;
    private String statusReason;
    private VpcDestinationSummary vpcDestinationSummary;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TopicRuleDestinationSummary)) {
            return false;
        }
        TopicRuleDestinationSummary topicRuleDestinationSummary = (TopicRuleDestinationSummary) obj;
        if ((topicRuleDestinationSummary.getArn() == null) ^ (getArn() == null)) {
            return false;
        }
        if (topicRuleDestinationSummary.getArn() != null && !topicRuleDestinationSummary.getArn().equals(getArn())) {
            return false;
        }
        if ((topicRuleDestinationSummary.getStatus() == null) ^ (getStatus() == null)) {
            return false;
        }
        if (topicRuleDestinationSummary.getStatus() != null && !topicRuleDestinationSummary.getStatus().equals(getStatus())) {
            return false;
        }
        if ((topicRuleDestinationSummary.getCreatedAt() == null) ^ (getCreatedAt() == null)) {
            return false;
        }
        if (topicRuleDestinationSummary.getCreatedAt() != null && !topicRuleDestinationSummary.getCreatedAt().equals(getCreatedAt())) {
            return false;
        }
        if ((topicRuleDestinationSummary.getLastUpdatedAt() == null) ^ (getLastUpdatedAt() == null)) {
            return false;
        }
        if (topicRuleDestinationSummary.getLastUpdatedAt() != null && !topicRuleDestinationSummary.getLastUpdatedAt().equals(getLastUpdatedAt())) {
            return false;
        }
        if ((topicRuleDestinationSummary.getStatusReason() == null) ^ (getStatusReason() == null)) {
            return false;
        }
        if (topicRuleDestinationSummary.getStatusReason() != null && !topicRuleDestinationSummary.getStatusReason().equals(getStatusReason())) {
            return false;
        }
        if ((topicRuleDestinationSummary.getHttpUrlSummary() == null) ^ (getHttpUrlSummary() == null)) {
            return false;
        }
        if (topicRuleDestinationSummary.getHttpUrlSummary() != null && !topicRuleDestinationSummary.getHttpUrlSummary().equals(getHttpUrlSummary())) {
            return false;
        }
        if ((topicRuleDestinationSummary.getVpcDestinationSummary() == null) ^ (getVpcDestinationSummary() == null)) {
            return false;
        }
        return topicRuleDestinationSummary.getVpcDestinationSummary() == null || topicRuleDestinationSummary.getVpcDestinationSummary().equals(getVpcDestinationSummary());
    }

    public String getArn() {
        return this.arn;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public HttpUrlDestinationSummary getHttpUrlSummary() {
        return this.httpUrlSummary;
    }

    public Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public String getStatus() {
        return this.status;
    }

    public String getStatusReason() {
        return this.statusReason;
    }

    public VpcDestinationSummary getVpcDestinationSummary() {
        return this.vpcDestinationSummary;
    }

    public int hashCode() {
        return (((((((((((((getArn() == null ? 0 : getArn().hashCode()) + 31) * 31) + (getStatus() == null ? 0 : getStatus().hashCode())) * 31) + (getCreatedAt() == null ? 0 : getCreatedAt().hashCode())) * 31) + (getLastUpdatedAt() == null ? 0 : getLastUpdatedAt().hashCode())) * 31) + (getStatusReason() == null ? 0 : getStatusReason().hashCode())) * 31) + (getHttpUrlSummary() == null ? 0 : getHttpUrlSummary().hashCode())) * 31) + (getVpcDestinationSummary() != null ? getVpcDestinationSummary().hashCode() : 0);
    }

    public void setArn(String str) {
        this.arn = str;
    }

    public void setCreatedAt(Date date) {
        this.createdAt = date;
    }

    public void setHttpUrlSummary(HttpUrlDestinationSummary httpUrlDestinationSummary) {
        this.httpUrlSummary = httpUrlDestinationSummary;
    }

    public void setLastUpdatedAt(Date date) {
        this.lastUpdatedAt = date;
    }

    public void setStatus(TopicRuleDestinationStatus topicRuleDestinationStatus) {
        this.status = topicRuleDestinationStatus.toString();
    }

    public void setStatusReason(String str) {
        this.statusReason = str;
    }

    public void setVpcDestinationSummary(VpcDestinationSummary vpcDestinationSummary) {
        this.vpcDestinationSummary = vpcDestinationSummary;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getArn() != null) {
            sb.append("arn: " + getArn() + ",");
        }
        if (getStatus() != null) {
            sb.append("status: " + getStatus() + ",");
        }
        if (getCreatedAt() != null) {
            sb.append("createdAt: " + getCreatedAt() + ",");
        }
        if (getLastUpdatedAt() != null) {
            sb.append("lastUpdatedAt: " + getLastUpdatedAt() + ",");
        }
        if (getStatusReason() != null) {
            sb.append("statusReason: " + getStatusReason() + ",");
        }
        if (getHttpUrlSummary() != null) {
            sb.append("httpUrlSummary: " + getHttpUrlSummary() + ",");
        }
        if (getVpcDestinationSummary() != null) {
            sb.append("vpcDestinationSummary: " + getVpcDestinationSummary());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public TopicRuleDestinationSummary withArn(String str) {
        this.arn = str;
        return this;
    }

    public TopicRuleDestinationSummary withCreatedAt(Date date) {
        this.createdAt = date;
        return this;
    }

    public TopicRuleDestinationSummary withHttpUrlSummary(HttpUrlDestinationSummary httpUrlDestinationSummary) {
        this.httpUrlSummary = httpUrlDestinationSummary;
        return this;
    }

    public TopicRuleDestinationSummary withLastUpdatedAt(Date date) {
        this.lastUpdatedAt = date;
        return this;
    }

    public TopicRuleDestinationSummary withStatus(TopicRuleDestinationStatus topicRuleDestinationStatus) {
        this.status = topicRuleDestinationStatus.toString();
        return this;
    }

    public TopicRuleDestinationSummary withStatusReason(String str) {
        this.statusReason = str;
        return this;
    }

    public TopicRuleDestinationSummary withVpcDestinationSummary(VpcDestinationSummary vpcDestinationSummary) {
        this.vpcDestinationSummary = vpcDestinationSummary;
        return this;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public TopicRuleDestinationSummary withStatus(String str) {
        this.status = str;
        return this;
    }
}
