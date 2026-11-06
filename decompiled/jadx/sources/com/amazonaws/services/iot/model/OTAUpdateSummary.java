package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class OTAUpdateSummary implements Serializable {
    private Date creationDate;
    private String otaUpdateArn;
    private String otaUpdateId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof OTAUpdateSummary)) {
            return false;
        }
        OTAUpdateSummary oTAUpdateSummary = (OTAUpdateSummary) obj;
        if ((oTAUpdateSummary.getOtaUpdateId() == null) ^ (getOtaUpdateId() == null)) {
            return false;
        }
        if (oTAUpdateSummary.getOtaUpdateId() != null && !oTAUpdateSummary.getOtaUpdateId().equals(getOtaUpdateId())) {
            return false;
        }
        if ((oTAUpdateSummary.getOtaUpdateArn() == null) ^ (getOtaUpdateArn() == null)) {
            return false;
        }
        if (oTAUpdateSummary.getOtaUpdateArn() != null && !oTAUpdateSummary.getOtaUpdateArn().equals(getOtaUpdateArn())) {
            return false;
        }
        if ((oTAUpdateSummary.getCreationDate() == null) ^ (getCreationDate() == null)) {
            return false;
        }
        return oTAUpdateSummary.getCreationDate() == null || oTAUpdateSummary.getCreationDate().equals(getCreationDate());
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public String getOtaUpdateArn() {
        return this.otaUpdateArn;
    }

    public String getOtaUpdateId() {
        return this.otaUpdateId;
    }

    public int hashCode() {
        return (((((getOtaUpdateId() == null ? 0 : getOtaUpdateId().hashCode()) + 31) * 31) + (getOtaUpdateArn() == null ? 0 : getOtaUpdateArn().hashCode())) * 31) + (getCreationDate() != null ? getCreationDate().hashCode() : 0);
    }

    public void setCreationDate(Date date) {
        this.creationDate = date;
    }

    public void setOtaUpdateArn(String str) {
        this.otaUpdateArn = str;
    }

    public void setOtaUpdateId(String str) {
        this.otaUpdateId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getOtaUpdateId() != null) {
            sb.append("otaUpdateId: " + getOtaUpdateId() + ",");
        }
        if (getOtaUpdateArn() != null) {
            sb.append("otaUpdateArn: " + getOtaUpdateArn() + ",");
        }
        if (getCreationDate() != null) {
            sb.append("creationDate: " + getCreationDate());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public OTAUpdateSummary withCreationDate(Date date) {
        this.creationDate = date;
        return this;
    }

    public OTAUpdateSummary withOtaUpdateArn(String str) {
        this.otaUpdateArn = str;
        return this;
    }

    public OTAUpdateSummary withOtaUpdateId(String str) {
        this.otaUpdateId = str;
        return this;
    }
}
