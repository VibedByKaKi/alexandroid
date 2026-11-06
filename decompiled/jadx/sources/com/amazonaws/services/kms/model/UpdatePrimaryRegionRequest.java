package com.amazonaws.services.kms.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UpdatePrimaryRegionRequest extends AmazonWebServiceRequest implements Serializable {
    private String keyId;
    private String primaryRegion;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdatePrimaryRegionRequest)) {
            return false;
        }
        UpdatePrimaryRegionRequest updatePrimaryRegionRequest = (UpdatePrimaryRegionRequest) obj;
        if ((updatePrimaryRegionRequest.getKeyId() == null) ^ (getKeyId() == null)) {
            return false;
        }
        if (updatePrimaryRegionRequest.getKeyId() != null && !updatePrimaryRegionRequest.getKeyId().equals(getKeyId())) {
            return false;
        }
        if ((updatePrimaryRegionRequest.getPrimaryRegion() == null) ^ (getPrimaryRegion() == null)) {
            return false;
        }
        return updatePrimaryRegionRequest.getPrimaryRegion() == null || updatePrimaryRegionRequest.getPrimaryRegion().equals(getPrimaryRegion());
    }

    public String getKeyId() {
        return this.keyId;
    }

    public String getPrimaryRegion() {
        return this.primaryRegion;
    }

    public int hashCode() {
        return (((getKeyId() == null ? 0 : getKeyId().hashCode()) + 31) * 31) + (getPrimaryRegion() != null ? getPrimaryRegion().hashCode() : 0);
    }

    public void setKeyId(String str) {
        this.keyId = str;
    }

    public void setPrimaryRegion(String str) {
        this.primaryRegion = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getKeyId() != null) {
            sb.append("KeyId: " + getKeyId() + ",");
        }
        if (getPrimaryRegion() != null) {
            sb.append("PrimaryRegion: " + getPrimaryRegion());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public UpdatePrimaryRegionRequest withKeyId(String str) {
        this.keyId = str;
        return this;
    }

    public UpdatePrimaryRegionRequest withPrimaryRegion(String str) {
        this.primaryRegion = str;
        return this;
    }
}
