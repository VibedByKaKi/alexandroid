package com.amazonaws.services.iotdata.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.nio.ByteBuffer;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UpdateThingShadowRequest extends AmazonWebServiceRequest implements Serializable {
    private ByteBuffer payload;
    private String shadowName;
    private String thingName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateThingShadowRequest)) {
            return false;
        }
        UpdateThingShadowRequest updateThingShadowRequest = (UpdateThingShadowRequest) obj;
        if ((updateThingShadowRequest.getThingName() == null) ^ (getThingName() == null)) {
            return false;
        }
        if (updateThingShadowRequest.getThingName() != null && !updateThingShadowRequest.getThingName().equals(getThingName())) {
            return false;
        }
        if ((updateThingShadowRequest.getShadowName() == null) ^ (getShadowName() == null)) {
            return false;
        }
        if (updateThingShadowRequest.getShadowName() != null && !updateThingShadowRequest.getShadowName().equals(getShadowName())) {
            return false;
        }
        if ((updateThingShadowRequest.getPayload() == null) ^ (getPayload() == null)) {
            return false;
        }
        return updateThingShadowRequest.getPayload() == null || updateThingShadowRequest.getPayload().equals(getPayload());
    }

    public ByteBuffer getPayload() {
        return this.payload;
    }

    public String getShadowName() {
        return this.shadowName;
    }

    public String getThingName() {
        return this.thingName;
    }

    public int hashCode() {
        return (((((getThingName() == null ? 0 : getThingName().hashCode()) + 31) * 31) + (getShadowName() == null ? 0 : getShadowName().hashCode())) * 31) + (getPayload() != null ? getPayload().hashCode() : 0);
    }

    public void setPayload(ByteBuffer byteBuffer) {
        this.payload = byteBuffer;
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
            sb.append("shadowName: " + getShadowName() + ",");
        }
        if (getPayload() != null) {
            sb.append("payload: " + getPayload());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public UpdateThingShadowRequest withPayload(ByteBuffer byteBuffer) {
        this.payload = byteBuffer;
        return this;
    }

    public UpdateThingShadowRequest withShadowName(String str) {
        this.shadowName = str;
        return this;
    }

    public UpdateThingShadowRequest withThingName(String str) {
        this.thingName = str;
        return this;
    }
}
