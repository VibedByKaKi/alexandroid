package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeleteThingRequest extends AmazonWebServiceRequest implements Serializable {
    private Long expectedVersion;
    private String thingName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteThingRequest)) {
            return false;
        }
        DeleteThingRequest deleteThingRequest = (DeleteThingRequest) obj;
        if ((deleteThingRequest.getThingName() == null) ^ (getThingName() == null)) {
            return false;
        }
        if (deleteThingRequest.getThingName() != null && !deleteThingRequest.getThingName().equals(getThingName())) {
            return false;
        }
        if ((deleteThingRequest.getExpectedVersion() == null) ^ (getExpectedVersion() == null)) {
            return false;
        }
        return deleteThingRequest.getExpectedVersion() == null || deleteThingRequest.getExpectedVersion().equals(getExpectedVersion());
    }

    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    public String getThingName() {
        return this.thingName;
    }

    public int hashCode() {
        return (((getThingName() == null ? 0 : getThingName().hashCode()) + 31) * 31) + (getExpectedVersion() != null ? getExpectedVersion().hashCode() : 0);
    }

    public void setExpectedVersion(Long l) {
        this.expectedVersion = l;
    }

    public void setThingName(String str) {
        this.thingName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getThingName() != null) {
            sb.append("thingName: " + getThingName() + ",");
        }
        if (getExpectedVersion() != null) {
            sb.append("expectedVersion: " + getExpectedVersion());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DeleteThingRequest withExpectedVersion(Long l) {
        this.expectedVersion = l;
        return this;
    }

    public DeleteThingRequest withThingName(String str) {
        this.thingName = str;
        return this;
    }
}
