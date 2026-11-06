package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeDomainConfigurationRequest extends AmazonWebServiceRequest implements Serializable {
    private String domainConfigurationName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeDomainConfigurationRequest)) {
            return false;
        }
        DescribeDomainConfigurationRequest describeDomainConfigurationRequest = (DescribeDomainConfigurationRequest) obj;
        if ((describeDomainConfigurationRequest.getDomainConfigurationName() == null) ^ (getDomainConfigurationName() == null)) {
            return false;
        }
        return describeDomainConfigurationRequest.getDomainConfigurationName() == null || describeDomainConfigurationRequest.getDomainConfigurationName().equals(getDomainConfigurationName());
    }

    public String getDomainConfigurationName() {
        return this.domainConfigurationName;
    }

    public int hashCode() {
        return 31 + (getDomainConfigurationName() == null ? 0 : getDomainConfigurationName().hashCode());
    }

    public void setDomainConfigurationName(String str) {
        this.domainConfigurationName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getDomainConfigurationName() != null) {
            sb.append("domainConfigurationName: " + getDomainConfigurationName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeDomainConfigurationRequest withDomainConfigurationName(String str) {
        this.domainConfigurationName = str;
        return this;
    }
}
