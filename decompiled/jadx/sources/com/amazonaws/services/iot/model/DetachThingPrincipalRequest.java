package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DetachThingPrincipalRequest extends AmazonWebServiceRequest implements Serializable {
    private String principal;
    private String thingName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DetachThingPrincipalRequest)) {
            return false;
        }
        DetachThingPrincipalRequest detachThingPrincipalRequest = (DetachThingPrincipalRequest) obj;
        if ((detachThingPrincipalRequest.getThingName() == null) ^ (getThingName() == null)) {
            return false;
        }
        if (detachThingPrincipalRequest.getThingName() != null && !detachThingPrincipalRequest.getThingName().equals(getThingName())) {
            return false;
        }
        if ((detachThingPrincipalRequest.getPrincipal() == null) ^ (getPrincipal() == null)) {
            return false;
        }
        return detachThingPrincipalRequest.getPrincipal() == null || detachThingPrincipalRequest.getPrincipal().equals(getPrincipal());
    }

    public String getPrincipal() {
        return this.principal;
    }

    public String getThingName() {
        return this.thingName;
    }

    public int hashCode() {
        return (((getThingName() == null ? 0 : getThingName().hashCode()) + 31) * 31) + (getPrincipal() != null ? getPrincipal().hashCode() : 0);
    }

    public void setPrincipal(String str) {
        this.principal = str;
    }

    public void setThingName(String str) {
        this.thingName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getThingName() != null) {
            sb.append("thingName: " + getThingName() + ",");
        }
        if (getPrincipal() != null) {
            sb.append("principal: " + getPrincipal());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DetachThingPrincipalRequest withPrincipal(String str) {
        this.principal = str;
        return this;
    }

    public DetachThingPrincipalRequest withThingName(String str) {
        this.thingName = str;
        return this;
    }
}
