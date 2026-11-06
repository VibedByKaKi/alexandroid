package com.amazonaws.services.iot.model;

import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UpdateEventConfigurationsRequest extends AmazonWebServiceRequest implements Serializable {
    private Map<String, Configuration> eventConfigurations;

    public UpdateEventConfigurationsRequest addeventConfigurationsEntry(String str, Configuration configuration) {
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

    public UpdateEventConfigurationsRequest cleareventConfigurationsEntries() {
        this.eventConfigurations = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateEventConfigurationsRequest)) {
            return false;
        }
        UpdateEventConfigurationsRequest updateEventConfigurationsRequest = (UpdateEventConfigurationsRequest) obj;
        if ((updateEventConfigurationsRequest.getEventConfigurations() == null) ^ (getEventConfigurations() == null)) {
            return false;
        }
        return updateEventConfigurationsRequest.getEventConfigurations() == null || updateEventConfigurationsRequest.getEventConfigurations().equals(getEventConfigurations());
    }

    public Map<String, Configuration> getEventConfigurations() {
        return this.eventConfigurations;
    }

    public int hashCode() {
        return 31 + (getEventConfigurations() == null ? 0 : getEventConfigurations().hashCode());
    }

    public void setEventConfigurations(Map<String, Configuration> map) {
        this.eventConfigurations = map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getEventConfigurations() != null) {
            sb.append("eventConfigurations: " + getEventConfigurations());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public UpdateEventConfigurationsRequest withEventConfigurations(Map<String, Configuration> map) {
        this.eventConfigurations = map;
        return this;
    }
}
