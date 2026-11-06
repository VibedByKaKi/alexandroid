package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UpdateIndexingConfigurationRequest extends AmazonWebServiceRequest implements Serializable {
    private ThingGroupIndexingConfiguration thingGroupIndexingConfiguration;
    private ThingIndexingConfiguration thingIndexingConfiguration;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateIndexingConfigurationRequest)) {
            return false;
        }
        UpdateIndexingConfigurationRequest updateIndexingConfigurationRequest = (UpdateIndexingConfigurationRequest) obj;
        if ((updateIndexingConfigurationRequest.getThingIndexingConfiguration() == null) ^ (getThingIndexingConfiguration() == null)) {
            return false;
        }
        if (updateIndexingConfigurationRequest.getThingIndexingConfiguration() != null && !updateIndexingConfigurationRequest.getThingIndexingConfiguration().equals(getThingIndexingConfiguration())) {
            return false;
        }
        if ((updateIndexingConfigurationRequest.getThingGroupIndexingConfiguration() == null) ^ (getThingGroupIndexingConfiguration() == null)) {
            return false;
        }
        return updateIndexingConfigurationRequest.getThingGroupIndexingConfiguration() == null || updateIndexingConfigurationRequest.getThingGroupIndexingConfiguration().equals(getThingGroupIndexingConfiguration());
    }

    public ThingGroupIndexingConfiguration getThingGroupIndexingConfiguration() {
        return this.thingGroupIndexingConfiguration;
    }

    public ThingIndexingConfiguration getThingIndexingConfiguration() {
        return this.thingIndexingConfiguration;
    }

    public int hashCode() {
        return (((getThingIndexingConfiguration() == null ? 0 : getThingIndexingConfiguration().hashCode()) + 31) * 31) + (getThingGroupIndexingConfiguration() != null ? getThingGroupIndexingConfiguration().hashCode() : 0);
    }

    public void setThingGroupIndexingConfiguration(ThingGroupIndexingConfiguration thingGroupIndexingConfiguration) {
        this.thingGroupIndexingConfiguration = thingGroupIndexingConfiguration;
    }

    public void setThingIndexingConfiguration(ThingIndexingConfiguration thingIndexingConfiguration) {
        this.thingIndexingConfiguration = thingIndexingConfiguration;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getThingIndexingConfiguration() != null) {
            sb.append("thingIndexingConfiguration: " + getThingIndexingConfiguration() + ",");
        }
        if (getThingGroupIndexingConfiguration() != null) {
            sb.append("thingGroupIndexingConfiguration: " + getThingGroupIndexingConfiguration());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public UpdateIndexingConfigurationRequest withThingGroupIndexingConfiguration(ThingGroupIndexingConfiguration thingGroupIndexingConfiguration) {
        this.thingGroupIndexingConfiguration = thingGroupIndexingConfiguration;
        return this;
    }

    public UpdateIndexingConfigurationRequest withThingIndexingConfiguration(ThingIndexingConfiguration thingIndexingConfiguration) {
        this.thingIndexingConfiguration = thingIndexingConfiguration;
        return this;
    }
}
