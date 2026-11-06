package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeleteThingTypeRequest extends AmazonWebServiceRequest implements Serializable {
    private String thingTypeName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteThingTypeRequest)) {
            return false;
        }
        DeleteThingTypeRequest deleteThingTypeRequest = (DeleteThingTypeRequest) obj;
        if ((deleteThingTypeRequest.getThingTypeName() == null) ^ (getThingTypeName() == null)) {
            return false;
        }
        return deleteThingTypeRequest.getThingTypeName() == null || deleteThingTypeRequest.getThingTypeName().equals(getThingTypeName());
    }

    public String getThingTypeName() {
        return this.thingTypeName;
    }

    public int hashCode() {
        return 31 + (getThingTypeName() == null ? 0 : getThingTypeName().hashCode());
    }

    public void setThingTypeName(String str) {
        this.thingTypeName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getThingTypeName() != null) {
            sb.append("thingTypeName: " + getThingTypeName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DeleteThingTypeRequest withThingTypeName(String str) {
        this.thingTypeName = str;
        return this;
    }
}
