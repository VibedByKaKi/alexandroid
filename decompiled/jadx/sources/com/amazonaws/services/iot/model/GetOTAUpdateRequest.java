package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetOTAUpdateRequest extends AmazonWebServiceRequest implements Serializable {
    private String otaUpdateId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetOTAUpdateRequest)) {
            return false;
        }
        GetOTAUpdateRequest getOTAUpdateRequest = (GetOTAUpdateRequest) obj;
        if ((getOTAUpdateRequest.getOtaUpdateId() == null) ^ (getOtaUpdateId() == null)) {
            return false;
        }
        return getOTAUpdateRequest.getOtaUpdateId() == null || getOTAUpdateRequest.getOtaUpdateId().equals(getOtaUpdateId());
    }

    public String getOtaUpdateId() {
        return this.otaUpdateId;
    }

    public int hashCode() {
        return 31 + (getOtaUpdateId() == null ? 0 : getOtaUpdateId().hashCode());
    }

    public void setOtaUpdateId(String str) {
        this.otaUpdateId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getOtaUpdateId() != null) {
            sb.append("otaUpdateId: " + getOtaUpdateId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetOTAUpdateRequest withOtaUpdateId(String str) {
        this.otaUpdateId = str;
        return this;
    }
}
