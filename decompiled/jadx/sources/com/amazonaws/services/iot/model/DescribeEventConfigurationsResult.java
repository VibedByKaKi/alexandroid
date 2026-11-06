package com.amazonaws.services.iot.model;

import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeEventConfigurationsResult implements Serializable {
    private Date creationDate;
    private Map<String, Configuration> eventConfigurations;
    private Date lastModifiedDate;

    public DescribeEventConfigurationsResult addeventConfigurationsEntry(String str, Configuration configuration) {
        if (this.eventConfigurations == null) {
            this.eventConfigurations = new HashMap();
        }
        if (this.eventConfigurations.containsKey(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(str, ") are provided.", new StringBuilder("Duplicated keys (")));
            return null;
        }
        this.eventConfigurations.put(str, configuration);
        return this;
    }

    public DescribeEventConfigurationsResult cleareventConfigurationsEntries() {
        this.eventConfigurations = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeEventConfigurationsResult)) {
            return false;
        }
        DescribeEventConfigurationsResult describeEventConfigurationsResult = (DescribeEventConfigurationsResult) obj;
        if ((describeEventConfigurationsResult.getEventConfigurations() == null) ^ (getEventConfigurations() == null)) {
            return false;
        }
        if (describeEventConfigurationsResult.getEventConfigurations() != null && !describeEventConfigurationsResult.getEventConfigurations().equals(getEventConfigurations())) {
            return false;
        }
        if ((describeEventConfigurationsResult.getCreationDate() == null) ^ (getCreationDate() == null)) {
            return false;
        }
        if (describeEventConfigurationsResult.getCreationDate() != null && !describeEventConfigurationsResult.getCreationDate().equals(getCreationDate())) {
            return false;
        }
        if ((describeEventConfigurationsResult.getLastModifiedDate() == null) ^ (getLastModifiedDate() == null)) {
            return false;
        }
        return describeEventConfigurationsResult.getLastModifiedDate() == null || describeEventConfigurationsResult.getLastModifiedDate().equals(getLastModifiedDate());
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public Map<String, Configuration> getEventConfigurations() {
        return this.eventConfigurations;
    }

    public Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public int hashCode() {
        return (((((getEventConfigurations() == null ? 0 : getEventConfigurations().hashCode()) + 31) * 31) + (getCreationDate() == null ? 0 : getCreationDate().hashCode())) * 31) + (getLastModifiedDate() != null ? getLastModifiedDate().hashCode() : 0);
    }

    public void setCreationDate(Date date) {
        this.creationDate = date;
    }

    public void setEventConfigurations(Map<String, Configuration> map) {
        this.eventConfigurations = map;
    }

    public void setLastModifiedDate(Date date) {
        this.lastModifiedDate = date;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getEventConfigurations() != null) {
            sb.append("eventConfigurations: " + getEventConfigurations() + ",");
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

    public DescribeEventConfigurationsResult withCreationDate(Date date) {
        this.creationDate = date;
        return this;
    }

    public DescribeEventConfigurationsResult withEventConfigurations(Map<String, Configuration> map) {
        this.eventConfigurations = map;
        return this;
    }

    public DescribeEventConfigurationsResult withLastModifiedDate(Date date) {
        this.lastModifiedDate = date;
        return this;
    }
}
