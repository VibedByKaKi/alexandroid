package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UpdateDynamicThingGroupResult implements Serializable {
    private Long version;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateDynamicThingGroupResult)) {
            return false;
        }
        UpdateDynamicThingGroupResult updateDynamicThingGroupResult = (UpdateDynamicThingGroupResult) obj;
        if ((updateDynamicThingGroupResult.getVersion() == null) ^ (getVersion() == null)) {
            return false;
        }
        return updateDynamicThingGroupResult.getVersion() == null || updateDynamicThingGroupResult.getVersion().equals(getVersion());
    }

    public Long getVersion() {
        return this.version;
    }

    public int hashCode() {
        return 31 + (getVersion() == null ? 0 : getVersion().hashCode());
    }

    public void setVersion(Long l) {
        this.version = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getVersion() != null) {
            sb.append("version: " + getVersion());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public UpdateDynamicThingGroupResult withVersion(Long l) {
        this.version = l;
        return this;
    }
}
