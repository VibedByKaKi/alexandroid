package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PutAssetPropertyValueEntry implements Serializable {
    private String assetId;
    private String entryId;
    private String propertyAlias;
    private String propertyId;
    private List<AssetPropertyValue> propertyValues;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PutAssetPropertyValueEntry)) {
            return false;
        }
        PutAssetPropertyValueEntry putAssetPropertyValueEntry = (PutAssetPropertyValueEntry) obj;
        if ((putAssetPropertyValueEntry.getEntryId() == null) ^ (getEntryId() == null)) {
            return false;
        }
        if (putAssetPropertyValueEntry.getEntryId() != null && !putAssetPropertyValueEntry.getEntryId().equals(getEntryId())) {
            return false;
        }
        if ((putAssetPropertyValueEntry.getAssetId() == null) ^ (getAssetId() == null)) {
            return false;
        }
        if (putAssetPropertyValueEntry.getAssetId() != null && !putAssetPropertyValueEntry.getAssetId().equals(getAssetId())) {
            return false;
        }
        if ((putAssetPropertyValueEntry.getPropertyId() == null) ^ (getPropertyId() == null)) {
            return false;
        }
        if (putAssetPropertyValueEntry.getPropertyId() != null && !putAssetPropertyValueEntry.getPropertyId().equals(getPropertyId())) {
            return false;
        }
        if ((putAssetPropertyValueEntry.getPropertyAlias() == null) ^ (getPropertyAlias() == null)) {
            return false;
        }
        if (putAssetPropertyValueEntry.getPropertyAlias() != null && !putAssetPropertyValueEntry.getPropertyAlias().equals(getPropertyAlias())) {
            return false;
        }
        if ((putAssetPropertyValueEntry.getPropertyValues() == null) ^ (getPropertyValues() == null)) {
            return false;
        }
        return putAssetPropertyValueEntry.getPropertyValues() == null || putAssetPropertyValueEntry.getPropertyValues().equals(getPropertyValues());
    }

    public String getAssetId() {
        return this.assetId;
    }

    public String getEntryId() {
        return this.entryId;
    }

    public String getPropertyAlias() {
        return this.propertyAlias;
    }

    public String getPropertyId() {
        return this.propertyId;
    }

    public List<AssetPropertyValue> getPropertyValues() {
        return this.propertyValues;
    }

    public int hashCode() {
        return (((((((((getEntryId() == null ? 0 : getEntryId().hashCode()) + 31) * 31) + (getAssetId() == null ? 0 : getAssetId().hashCode())) * 31) + (getPropertyId() == null ? 0 : getPropertyId().hashCode())) * 31) + (getPropertyAlias() == null ? 0 : getPropertyAlias().hashCode())) * 31) + (getPropertyValues() != null ? getPropertyValues().hashCode() : 0);
    }

    public void setAssetId(String str) {
        this.assetId = str;
    }

    public void setEntryId(String str) {
        this.entryId = str;
    }

    public void setPropertyAlias(String str) {
        this.propertyAlias = str;
    }

    public void setPropertyId(String str) {
        this.propertyId = str;
    }

    public void setPropertyValues(Collection<AssetPropertyValue> collection) {
        if (collection == null) {
            this.propertyValues = null;
        } else {
            this.propertyValues = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getEntryId() != null) {
            sb.append("entryId: " + getEntryId() + ",");
        }
        if (getAssetId() != null) {
            sb.append("assetId: " + getAssetId() + ",");
        }
        if (getPropertyId() != null) {
            sb.append("propertyId: " + getPropertyId() + ",");
        }
        if (getPropertyAlias() != null) {
            sb.append("propertyAlias: " + getPropertyAlias() + ",");
        }
        if (getPropertyValues() != null) {
            sb.append("propertyValues: " + getPropertyValues());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public PutAssetPropertyValueEntry withAssetId(String str) {
        this.assetId = str;
        return this;
    }

    public PutAssetPropertyValueEntry withEntryId(String str) {
        this.entryId = str;
        return this;
    }

    public PutAssetPropertyValueEntry withPropertyAlias(String str) {
        this.propertyAlias = str;
        return this;
    }

    public PutAssetPropertyValueEntry withPropertyId(String str) {
        this.propertyId = str;
        return this;
    }

    public PutAssetPropertyValueEntry withPropertyValues(AssetPropertyValue... assetPropertyValueArr) {
        if (getPropertyValues() == null) {
            this.propertyValues = new ArrayList(assetPropertyValueArr.length);
        }
        for (AssetPropertyValue assetPropertyValue : assetPropertyValueArr) {
            this.propertyValues.add(assetPropertyValue);
        }
        return this;
    }

    public PutAssetPropertyValueEntry withPropertyValues(Collection<AssetPropertyValue> collection) {
        setPropertyValues(collection);
        return this;
    }
}
