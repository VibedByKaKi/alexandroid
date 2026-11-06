package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeleteThingGroupRequest extends AmazonWebServiceRequest implements Serializable {
    private Long expectedVersion;
    private String thingGroupName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteThingGroupRequest)) {
            return false;
        }
        DeleteThingGroupRequest deleteThingGroupRequest = (DeleteThingGroupRequest) obj;
        if ((deleteThingGroupRequest.getThingGroupName() == null) ^ (getThingGroupName() == null)) {
            return false;
        }
        if (deleteThingGroupRequest.getThingGroupName() != null && !deleteThingGroupRequest.getThingGroupName().equals(getThingGroupName())) {
            return false;
        }
        if ((deleteThingGroupRequest.getExpectedVersion() == null) ^ (getExpectedVersion() == null)) {
            return false;
        }
        return deleteThingGroupRequest.getExpectedVersion() == null || deleteThingGroupRequest.getExpectedVersion().equals(getExpectedVersion());
    }

    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    public String getThingGroupName() {
        return this.thingGroupName;
    }

    public int hashCode() {
        return (((getThingGroupName() == null ? 0 : getThingGroupName().hashCode()) + 31) * 31) + (getExpectedVersion() != null ? getExpectedVersion().hashCode() : 0);
    }

    public void setExpectedVersion(Long l) {
        this.expectedVersion = l;
    }

    public void setThingGroupName(String str) {
        this.thingGroupName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getThingGroupName() != null) {
            sb.append("thingGroupName: " + getThingGroupName() + ",");
        }
        if (getExpectedVersion() != null) {
            sb.append("expectedVersion: " + getExpectedVersion());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DeleteThingGroupRequest withExpectedVersion(Long l) {
        this.expectedVersion = l;
        return this;
    }

    public DeleteThingGroupRequest withThingGroupName(String str) {
        this.thingGroupName = str;
        return this;
    }
}
