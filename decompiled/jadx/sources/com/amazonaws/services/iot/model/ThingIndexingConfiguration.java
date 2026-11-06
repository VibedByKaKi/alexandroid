package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ThingIndexingConfiguration implements Serializable {
    private List<Field> customFields;
    private String deviceDefenderIndexingMode;
    private IndexingFilter filter;
    private List<Field> managedFields;
    private String namedShadowIndexingMode;
    private String thingConnectivityIndexingMode;
    private String thingIndexingMode;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ThingIndexingConfiguration)) {
            return false;
        }
        ThingIndexingConfiguration thingIndexingConfiguration = (ThingIndexingConfiguration) obj;
        if ((thingIndexingConfiguration.getThingIndexingMode() == null) ^ (getThingIndexingMode() == null)) {
            return false;
        }
        if (thingIndexingConfiguration.getThingIndexingMode() != null && !thingIndexingConfiguration.getThingIndexingMode().equals(getThingIndexingMode())) {
            return false;
        }
        if ((thingIndexingConfiguration.getThingConnectivityIndexingMode() == null) ^ (getThingConnectivityIndexingMode() == null)) {
            return false;
        }
        if (thingIndexingConfiguration.getThingConnectivityIndexingMode() != null && !thingIndexingConfiguration.getThingConnectivityIndexingMode().equals(getThingConnectivityIndexingMode())) {
            return false;
        }
        if ((thingIndexingConfiguration.getDeviceDefenderIndexingMode() == null) ^ (getDeviceDefenderIndexingMode() == null)) {
            return false;
        }
        if (thingIndexingConfiguration.getDeviceDefenderIndexingMode() != null && !thingIndexingConfiguration.getDeviceDefenderIndexingMode().equals(getDeviceDefenderIndexingMode())) {
            return false;
        }
        if ((thingIndexingConfiguration.getNamedShadowIndexingMode() == null) ^ (getNamedShadowIndexingMode() == null)) {
            return false;
        }
        if (thingIndexingConfiguration.getNamedShadowIndexingMode() != null && !thingIndexingConfiguration.getNamedShadowIndexingMode().equals(getNamedShadowIndexingMode())) {
            return false;
        }
        if ((thingIndexingConfiguration.getManagedFields() == null) ^ (getManagedFields() == null)) {
            return false;
        }
        if (thingIndexingConfiguration.getManagedFields() != null && !thingIndexingConfiguration.getManagedFields().equals(getManagedFields())) {
            return false;
        }
        if ((thingIndexingConfiguration.getCustomFields() == null) ^ (getCustomFields() == null)) {
            return false;
        }
        if (thingIndexingConfiguration.getCustomFields() != null && !thingIndexingConfiguration.getCustomFields().equals(getCustomFields())) {
            return false;
        }
        if ((thingIndexingConfiguration.getFilter() == null) ^ (getFilter() == null)) {
            return false;
        }
        return thingIndexingConfiguration.getFilter() == null || thingIndexingConfiguration.getFilter().equals(getFilter());
    }

    public List<Field> getCustomFields() {
        return this.customFields;
    }

    public String getDeviceDefenderIndexingMode() {
        return this.deviceDefenderIndexingMode;
    }

    public IndexingFilter getFilter() {
        return this.filter;
    }

    public List<Field> getManagedFields() {
        return this.managedFields;
    }

    public String getNamedShadowIndexingMode() {
        return this.namedShadowIndexingMode;
    }

    public String getThingConnectivityIndexingMode() {
        return this.thingConnectivityIndexingMode;
    }

    public String getThingIndexingMode() {
        return this.thingIndexingMode;
    }

    public int hashCode() {
        return (((((((((((((getThingIndexingMode() == null ? 0 : getThingIndexingMode().hashCode()) + 31) * 31) + (getThingConnectivityIndexingMode() == null ? 0 : getThingConnectivityIndexingMode().hashCode())) * 31) + (getDeviceDefenderIndexingMode() == null ? 0 : getDeviceDefenderIndexingMode().hashCode())) * 31) + (getNamedShadowIndexingMode() == null ? 0 : getNamedShadowIndexingMode().hashCode())) * 31) + (getManagedFields() == null ? 0 : getManagedFields().hashCode())) * 31) + (getCustomFields() == null ? 0 : getCustomFields().hashCode())) * 31) + (getFilter() != null ? getFilter().hashCode() : 0);
    }

    public void setCustomFields(Collection<Field> collection) {
        if (collection == null) {
            this.customFields = null;
        } else {
            this.customFields = new ArrayList(collection);
        }
    }

    public void setDeviceDefenderIndexingMode(DeviceDefenderIndexingMode deviceDefenderIndexingMode) {
        this.deviceDefenderIndexingMode = deviceDefenderIndexingMode.toString();
    }

    public void setFilter(IndexingFilter indexingFilter) {
        this.filter = indexingFilter;
    }

    public void setManagedFields(Collection<Field> collection) {
        if (collection == null) {
            this.managedFields = null;
        } else {
            this.managedFields = new ArrayList(collection);
        }
    }

    public void setNamedShadowIndexingMode(NamedShadowIndexingMode namedShadowIndexingMode) {
        this.namedShadowIndexingMode = namedShadowIndexingMode.toString();
    }

    public void setThingConnectivityIndexingMode(ThingConnectivityIndexingMode thingConnectivityIndexingMode) {
        this.thingConnectivityIndexingMode = thingConnectivityIndexingMode.toString();
    }

    public void setThingIndexingMode(ThingIndexingMode thingIndexingMode) {
        this.thingIndexingMode = thingIndexingMode.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getThingIndexingMode() != null) {
            sb.append("thingIndexingMode: " + getThingIndexingMode() + ",");
        }
        if (getThingConnectivityIndexingMode() != null) {
            sb.append("thingConnectivityIndexingMode: " + getThingConnectivityIndexingMode() + ",");
        }
        if (getDeviceDefenderIndexingMode() != null) {
            sb.append("deviceDefenderIndexingMode: " + getDeviceDefenderIndexingMode() + ",");
        }
        if (getNamedShadowIndexingMode() != null) {
            sb.append("namedShadowIndexingMode: " + getNamedShadowIndexingMode() + ",");
        }
        if (getManagedFields() != null) {
            sb.append("managedFields: " + getManagedFields() + ",");
        }
        if (getCustomFields() != null) {
            sb.append("customFields: " + getCustomFields() + ",");
        }
        if (getFilter() != null) {
            sb.append("filter: " + getFilter());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ThingIndexingConfiguration withCustomFields(Field... fieldArr) {
        if (getCustomFields() == null) {
            this.customFields = new ArrayList(fieldArr.length);
        }
        for (Field field : fieldArr) {
            this.customFields.add(field);
        }
        return this;
    }

    public ThingIndexingConfiguration withDeviceDefenderIndexingMode(DeviceDefenderIndexingMode deviceDefenderIndexingMode) {
        this.deviceDefenderIndexingMode = deviceDefenderIndexingMode.toString();
        return this;
    }

    public ThingIndexingConfiguration withFilter(IndexingFilter indexingFilter) {
        this.filter = indexingFilter;
        return this;
    }

    public ThingIndexingConfiguration withManagedFields(Field... fieldArr) {
        if (getManagedFields() == null) {
            this.managedFields = new ArrayList(fieldArr.length);
        }
        for (Field field : fieldArr) {
            this.managedFields.add(field);
        }
        return this;
    }

    public ThingIndexingConfiguration withNamedShadowIndexingMode(NamedShadowIndexingMode namedShadowIndexingMode) {
        this.namedShadowIndexingMode = namedShadowIndexingMode.toString();
        return this;
    }

    public ThingIndexingConfiguration withThingConnectivityIndexingMode(ThingConnectivityIndexingMode thingConnectivityIndexingMode) {
        this.thingConnectivityIndexingMode = thingConnectivityIndexingMode.toString();
        return this;
    }

    public ThingIndexingConfiguration withThingIndexingMode(ThingIndexingMode thingIndexingMode) {
        this.thingIndexingMode = thingIndexingMode.toString();
        return this;
    }

    public void setDeviceDefenderIndexingMode(String str) {
        this.deviceDefenderIndexingMode = str;
    }

    public void setNamedShadowIndexingMode(String str) {
        this.namedShadowIndexingMode = str;
    }

    public void setThingConnectivityIndexingMode(String str) {
        this.thingConnectivityIndexingMode = str;
    }

    public void setThingIndexingMode(String str) {
        this.thingIndexingMode = str;
    }

    public ThingIndexingConfiguration withDeviceDefenderIndexingMode(String str) {
        this.deviceDefenderIndexingMode = str;
        return this;
    }

    public ThingIndexingConfiguration withNamedShadowIndexingMode(String str) {
        this.namedShadowIndexingMode = str;
        return this;
    }

    public ThingIndexingConfiguration withThingConnectivityIndexingMode(String str) {
        this.thingConnectivityIndexingMode = str;
        return this;
    }

    public ThingIndexingConfiguration withThingIndexingMode(String str) {
        this.thingIndexingMode = str;
        return this;
    }

    public ThingIndexingConfiguration withCustomFields(Collection<Field> collection) {
        setCustomFields(collection);
        return this;
    }

    public ThingIndexingConfiguration withManagedFields(Collection<Field> collection) {
        setManagedFields(collection);
        return this;
    }
}
