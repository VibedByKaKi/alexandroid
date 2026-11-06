package com.amazonaws.services.iotdata.model;

import java.io.Serializable;
import java.nio.ByteBuffer;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetThingShadowResult implements Serializable {
    private ByteBuffer payload;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetThingShadowResult)) {
            return false;
        }
        GetThingShadowResult getThingShadowResult = (GetThingShadowResult) obj;
        if ((getThingShadowResult.getPayload() == null) ^ (getPayload() == null)) {
            return false;
        }
        return getThingShadowResult.getPayload() == null || getThingShadowResult.getPayload().equals(getPayload());
    }

    public ByteBuffer getPayload() {
        return this.payload;
    }

    public int hashCode() {
        return 31 + (getPayload() == null ? 0 : getPayload().hashCode());
    }

    public void setPayload(ByteBuffer byteBuffer) {
        this.payload = byteBuffer;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getPayload() != null) {
            sb.append("payload: " + getPayload());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetThingShadowResult withPayload(ByteBuffer byteBuffer) {
        this.payload = byteBuffer;
        return this;
    }
}
