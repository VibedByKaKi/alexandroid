package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetIndexingConfigurationResult implements Serializable {
    private ThingGroupIndexingConfiguration thingGroupIndexingConfiguration;
    private ThingIndexingConfiguration thingIndexingConfiguration;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetIndexingConfigurationResult)) {
            return false;
        }
        GetIndexingConfigurationResult getIndexingConfigurationResult = (GetIndexingConfigurationResult) obj;
        if ((getIndexingConfigurationResult.getThingIndexingConfiguration() == null) ^ (getThingIndexingConfiguration() == null)) {
            return false;
        }
        if (getIndexingConfigurationResult.getThingIndexingConfiguration() != null && !getIndexingConfigurationResult.getThingIndexingConfiguration().equals(getThingIndexingConfiguration())) {
            return false;
        }
        if ((getIndexingConfigurationResult.getThingGroupIndexingConfiguration() == null) ^ (getThingGroupIndexingConfiguration() == null)) {
            return false;
        }
        return getIndexingConfigurationResult.getThingGroupIndexingConfiguration() == null || getIndexingConfigurationResult.getThingGroupIndexingConfiguration().equals(getThingGroupIndexingConfiguration());
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

    public GetIndexingConfigurationResult withThingGroupIndexingConfiguration(ThingGroupIndexingConfiguration thingGroupIndexingConfiguration) {
        this.thingGroupIndexingConfiguration = thingGroupIndexingConfiguration;
        return this;
    }

    public GetIndexingConfigurationResult withThingIndexingConfiguration(ThingIndexingConfiguration thingIndexingConfiguration) {
        this.thingIndexingConfiguration = thingIndexingConfiguration;
        return this;
    }
}
