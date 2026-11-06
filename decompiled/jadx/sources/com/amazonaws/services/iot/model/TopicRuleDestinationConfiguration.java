package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class TopicRuleDestinationConfiguration implements Serializable {
    private HttpUrlDestinationConfiguration httpUrlConfiguration;
    private VpcDestinationConfiguration vpcConfiguration;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TopicRuleDestinationConfiguration)) {
            return false;
        }
        TopicRuleDestinationConfiguration topicRuleDestinationConfiguration = (TopicRuleDestinationConfiguration) obj;
        if ((topicRuleDestinationConfiguration.getHttpUrlConfiguration() == null) ^ (getHttpUrlConfiguration() == null)) {
            return false;
        }
        if (topicRuleDestinationConfiguration.getHttpUrlConfiguration() != null && !topicRuleDestinationConfiguration.getHttpUrlConfiguration().equals(getHttpUrlConfiguration())) {
            return false;
        }
        if ((topicRuleDestinationConfiguration.getVpcConfiguration() == null) ^ (getVpcConfiguration() == null)) {
            return false;
        }
        return topicRuleDestinationConfiguration.getVpcConfiguration() == null || topicRuleDestinationConfiguration.getVpcConfiguration().equals(getVpcConfiguration());
    }

    public HttpUrlDestinationConfiguration getHttpUrlConfiguration() {
        return this.httpUrlConfiguration;
    }

    public VpcDestinationConfiguration getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    public int hashCode() {
        return (((getHttpUrlConfiguration() == null ? 0 : getHttpUrlConfiguration().hashCode()) + 31) * 31) + (getVpcConfiguration() != null ? getVpcConfiguration().hashCode() : 0);
    }

    public void setHttpUrlConfiguration(HttpUrlDestinationConfiguration httpUrlDestinationConfiguration) {
        this.httpUrlConfiguration = httpUrlDestinationConfiguration;
    }

    public void setVpcConfiguration(VpcDestinationConfiguration vpcDestinationConfiguration) {
        this.vpcConfiguration = vpcDestinationConfiguration;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getHttpUrlConfiguration() != null) {
            sb.append("httpUrlConfiguration: " + getHttpUrlConfiguration() + ",");
        }
        if (getVpcConfiguration() != null) {
            sb.append("vpcConfiguration: " + getVpcConfiguration());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public TopicRuleDestinationConfiguration withHttpUrlConfiguration(HttpUrlDestinationConfiguration httpUrlDestinationConfiguration) {
        this.httpUrlConfiguration = httpUrlDestinationConfiguration;
        return this;
    }

    public TopicRuleDestinationConfiguration withVpcConfiguration(VpcDestinationConfiguration vpcDestinationConfiguration) {
        this.vpcConfiguration = vpcDestinationConfiguration;
        return this;
    }
}
