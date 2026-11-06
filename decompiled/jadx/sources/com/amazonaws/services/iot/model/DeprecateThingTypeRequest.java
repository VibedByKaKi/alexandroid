package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeprecateThingTypeRequest extends AmazonWebServiceRequest implements Serializable {
    private String thingTypeName;
    private Boolean undoDeprecate;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeprecateThingTypeRequest)) {
            return false;
        }
        DeprecateThingTypeRequest deprecateThingTypeRequest = (DeprecateThingTypeRequest) obj;
        if ((deprecateThingTypeRequest.getThingTypeName() == null) ^ (getThingTypeName() == null)) {
            return false;
        }
        if (deprecateThingTypeRequest.getThingTypeName() != null && !deprecateThingTypeRequest.getThingTypeName().equals(getThingTypeName())) {
            return false;
        }
        if ((deprecateThingTypeRequest.getUndoDeprecate() == null) ^ (getUndoDeprecate() == null)) {
            return false;
        }
        return deprecateThingTypeRequest.getUndoDeprecate() == null || deprecateThingTypeRequest.getUndoDeprecate().equals(getUndoDeprecate());
    }

    public String getThingTypeName() {
        return this.thingTypeName;
    }

    public Boolean getUndoDeprecate() {
        return this.undoDeprecate;
    }

    public int hashCode() {
        return (((getThingTypeName() == null ? 0 : getThingTypeName().hashCode()) + 31) * 31) + (getUndoDeprecate() != null ? getUndoDeprecate().hashCode() : 0);
    }

    public Boolean isUndoDeprecate() {
        return this.undoDeprecate;
    }

    public void setThingTypeName(String str) {
        this.thingTypeName = str;
    }

    public void setUndoDeprecate(Boolean bool) {
        this.undoDeprecate = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getThingTypeName() != null) {
            sb.append("thingTypeName: " + getThingTypeName() + ",");
        }
        if (getUndoDeprecate() != null) {
            sb.append("undoDeprecate: " + getUndoDeprecate());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DeprecateThingTypeRequest withThingTypeName(String str) {
        this.thingTypeName = str;
        return this;
    }

    public DeprecateThingTypeRequest withUndoDeprecate(Boolean bool) {
        this.undoDeprecate = bool;
        return this;
    }
}
