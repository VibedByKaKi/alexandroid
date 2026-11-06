package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetOTAUpdateResult implements Serializable {
    private OTAUpdateInfo otaUpdateInfo;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetOTAUpdateResult)) {
            return false;
        }
        GetOTAUpdateResult getOTAUpdateResult = (GetOTAUpdateResult) obj;
        if ((getOTAUpdateResult.getOtaUpdateInfo() == null) ^ (getOtaUpdateInfo() == null)) {
            return false;
        }
        return getOTAUpdateResult.getOtaUpdateInfo() == null || getOTAUpdateResult.getOtaUpdateInfo().equals(getOtaUpdateInfo());
    }

    public OTAUpdateInfo getOtaUpdateInfo() {
        return this.otaUpdateInfo;
    }

    public int hashCode() {
        return 31 + (getOtaUpdateInfo() == null ? 0 : getOtaUpdateInfo().hashCode());
    }

    public void setOtaUpdateInfo(OTAUpdateInfo oTAUpdateInfo) {
        this.otaUpdateInfo = oTAUpdateInfo;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getOtaUpdateInfo() != null) {
            sb.append("otaUpdateInfo: " + getOtaUpdateInfo());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetOTAUpdateResult withOtaUpdateInfo(OTAUpdateInfo oTAUpdateInfo) {
        this.otaUpdateInfo = oTAUpdateInfo;
        return this;
    }
}
