package com.amazonaws.services.iotdata.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetThingShadowRequest extends AmazonWebServiceRequest implements Serializable {
    private String shadowName;
    private String thingName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetThingShadowRequest)) {
            return false;
        }
        GetThingShadowRequest getThingShadowRequest = (GetThingShadowRequest) obj;
        if ((getThingShadowRequest.getThingName() == null) ^ (getThingName() == null)) {
            return false;
        }
        if (getThingShadowRequest.getThingName() != null && !getThingShadowRequest.getThingName().equals(getThingName())) {
            return false;
        }
        if ((getThingShadowRequest.getShadowName() == null) ^ (getShadowName() == null)) {
            return false;
        }
        return getThingShadowRequest.getShadowName() == null || getThingShadowRequest.getShadowName().equals(getShadowName());
    }

    public String getShadowName() {
        return this.shadowName;
    }

    public String getThingName() {
        return this.thingName;
    }

    public int hashCode() {
        return (((getThingName() == null ? 0 : getThingName().hashCode()) + 31) * 31) + (getShadowName() != null ? getShadowName().hashCode() : 0);
    }

    public void setShadowName(String str) {
        this.shadowName = str;
    }

    public void setThingName(String str) {
        this.thingName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getThingName() != null) {
            sb.append("thingName: " + getThingName() + ",");
        }
        if (getShadowName() != null) {
            sb.append("shadowName: " + getShadowName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetThingShadowRequest withShadowName(String str) {
        this.shadowName = str;
        return this;
    }

    public GetThingShadowRequest withThingName(String str) {
        this.thingName = str;
        return this;
    }
}
