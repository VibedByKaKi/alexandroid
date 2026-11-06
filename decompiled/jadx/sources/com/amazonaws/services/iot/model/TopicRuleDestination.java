package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class TopicRuleDestination implements Serializable {
    private String arn;
    private Date createdAt;
    private HttpUrlDestinationProperties httpUrlProperties;
    private Date lastUpdatedAt;
    private String status;
    private String statusReason;
    private VpcDestinationProperties vpcProperties;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TopicRuleDestination)) {
            return false;
        }
        TopicRuleDestination topicRuleDestination = (TopicRuleDestination) obj;
        if ((topicRuleDestination.getArn() == null) ^ (getArn() == null)) {
            return false;
        }
        if (topicRuleDestination.getArn() != null && !topicRuleDestination.getArn().equals(getArn())) {
            return false;
        }
        if ((topicRuleDestination.getStatus() == null) ^ (getStatus() == null)) {
            return false;
        }
        if (topicRuleDestination.getStatus() != null && !topicRuleDestination.getStatus().equals(getStatus())) {
            return false;
        }
        if ((topicRuleDestination.getCreatedAt() == null) ^ (getCreatedAt() == null)) {
            return false;
        }
        if (topicRuleDestination.getCreatedAt() != null && !topicRuleDestination.getCreatedAt().equals(getCreatedAt())) {
            return false;
        }
        if ((topicRuleDestination.getLastUpdatedAt() == null) ^ (getLastUpdatedAt() == null)) {
            return false;
        }
        if (topicRuleDestination.getLastUpdatedAt() != null && !topicRuleDestination.getLastUpdatedAt().equals(getLastUpdatedAt())) {
            return false;
        }
        if ((topicRuleDestination.getStatusReason() == null) ^ (getStatusReason() == null)) {
            return false;
        }
        if (topicRuleDestination.getStatusReason() != null && !topicRuleDestination.getStatusReason().equals(getStatusReason())) {
            return false;
        }
        if ((topicRuleDestination.getHttpUrlProperties() == null) ^ (getHttpUrlProperties() == null)) {
            return false;
        }
        if (topicRuleDestination.getHttpUrlProperties() != null && !topicRuleDestination.getHttpUrlProperties().equals(getHttpUrlProperties())) {
            return false;
        }
        if ((topicRuleDestination.getVpcProperties() == null) ^ (getVpcProperties() == null)) {
            return false;
        }
        return topicRuleDestination.getVpcProperties() == null || topicRuleDestination.getVpcProperties().equals(getVpcProperties());
    }

    public String getArn() {
        return this.arn;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public HttpUrlDestinationProperties getHttpUrlProperties() {
        return this.httpUrlProperties;
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

    public VpcDestinationProperties getVpcProperties() {
        return this.vpcProperties;
    }

    public int hashCode() {
        return (((((((((((((getArn() == null ? 0 : getArn().hashCode()) + 31) * 31) + (getStatus() == null ? 0 : getStatus().hashCode())) * 31) + (getCreatedAt() == null ? 0 : getCreatedAt().hashCode())) * 31) + (getLastUpdatedAt() == null ? 0 : getLastUpdatedAt().hashCode())) * 31) + (getStatusReason() == null ? 0 : getStatusReason().hashCode())) * 31) + (getHttpUrlProperties() == null ? 0 : getHttpUrlProperties().hashCode())) * 31) + (getVpcProperties() != null ? getVpcProperties().hashCode() : 0);
    }

    public void setArn(String str) {
        this.arn = str;
    }

    public void setCreatedAt(Date date) {
        this.createdAt = date;
    }

    public void setHttpUrlProperties(HttpUrlDestinationProperties httpUrlDestinationProperties) {
        this.httpUrlProperties = httpUrlDestinationProperties;
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

    public void setVpcProperties(VpcDestinationProperties vpcDestinationProperties) {
        this.vpcProperties = vpcDestinationProperties;
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
        if (getHttpUrlProperties() != null) {
            sb.append("httpUrlProperties: " + getHttpUrlProperties() + ",");
        }
        if (getVpcProperties() != null) {
            sb.append("vpcProperties: " + getVpcProperties());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public TopicRuleDestination withArn(String str) {
        this.arn = str;
        return this;
    }

    public TopicRuleDestination withCreatedAt(Date date) {
        this.createdAt = date;
        return this;
    }

    public TopicRuleDestination withHttpUrlProperties(HttpUrlDestinationProperties httpUrlDestinationProperties) {
        this.httpUrlProperties = httpUrlDestinationProperties;
        return this;
    }

    public TopicRuleDestination withLastUpdatedAt(Date date) {
        this.lastUpdatedAt = date;
        return this;
    }

    public TopicRuleDestination withStatus(TopicRuleDestinationStatus topicRuleDestinationStatus) {
        this.status = topicRuleDestinationStatus.toString();
        return this;
    }

    public TopicRuleDestination withStatusReason(String str) {
        this.statusReason = str;
        return this;
    }

    public TopicRuleDestination withVpcProperties(VpcDestinationProperties vpcDestinationProperties) {
        this.vpcProperties = vpcDestinationProperties;
        return this;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public TopicRuleDestination withStatus(String str) {
        this.status = str;
        return this;
    }
}
