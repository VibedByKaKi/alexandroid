package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListDomainConfigurationsResult implements Serializable {
    private List<DomainConfigurationSummary> domainConfigurations;
    private String nextMarker;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListDomainConfigurationsResult)) {
            return false;
        }
        ListDomainConfigurationsResult listDomainConfigurationsResult = (ListDomainConfigurationsResult) obj;
        if ((listDomainConfigurationsResult.getDomainConfigurations() == null) ^ (getDomainConfigurations() == null)) {
            return false;
        }
        if (listDomainConfigurationsResult.getDomainConfigurations() != null && !listDomainConfigurationsResult.getDomainConfigurations().equals(getDomainConfigurations())) {
            return false;
        }
        if ((listDomainConfigurationsResult.getNextMarker() == null) ^ (getNextMarker() == null)) {
            return false;
        }
        return listDomainConfigurationsResult.getNextMarker() == null || listDomainConfigurationsResult.getNextMarker().equals(getNextMarker());
    }

    public List<DomainConfigurationSummary> getDomainConfigurations() {
        return this.domainConfigurations;
    }

    public String getNextMarker() {
        return this.nextMarker;
    }

    public int hashCode() {
        return (((getDomainConfigurations() == null ? 0 : getDomainConfigurations().hashCode()) + 31) * 31) + (getNextMarker() != null ? getNextMarker().hashCode() : 0);
    }

    public void setDomainConfigurations(Collection<DomainConfigurationSummary> collection) {
        if (collection == null) {
            this.domainConfigurations = null;
        } else {
            this.domainConfigurations = new ArrayList(collection);
        }
    }

    public void setNextMarker(String str) {
        this.nextMarker = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getDomainConfigurations() != null) {
            sb.append("domainConfigurations: " + getDomainConfigurations() + ",");
        }
        if (getNextMarker() != null) {
            sb.append("nextMarker: " + getNextMarker());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListDomainConfigurationsResult withDomainConfigurations(DomainConfigurationSummary... domainConfigurationSummaryArr) {
        if (getDomainConfigurations() == null) {
            this.domainConfigurations = new ArrayList(domainConfigurationSummaryArr.length);
        }
        for (DomainConfigurationSummary domainConfigurationSummary : domainConfigurationSummaryArr) {
            this.domainConfigurations.add(domainConfigurationSummary);
        }
        return this;
    }

    public ListDomainConfigurationsResult withNextMarker(String str) {
        this.nextMarker = str;
        return this;
    }

    public ListDomainConfigurationsResult withDomainConfigurations(Collection<DomainConfigurationSummary> collection) {
        setDomainConfigurations(collection);
        return this;
    }
}
