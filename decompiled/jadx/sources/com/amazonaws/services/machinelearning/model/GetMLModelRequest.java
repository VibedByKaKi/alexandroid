package com.amazonaws.services.machinelearning.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetMLModelRequest extends AmazonWebServiceRequest implements Serializable {
    private String mLModelId;
    private Boolean verbose;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetMLModelRequest)) {
            return false;
        }
        GetMLModelRequest getMLModelRequest = (GetMLModelRequest) obj;
        if ((getMLModelRequest.getMLModelId() == null) ^ (getMLModelId() == null)) {
            return false;
        }
        if (getMLModelRequest.getMLModelId() != null && !getMLModelRequest.getMLModelId().equals(getMLModelId())) {
            return false;
        }
        if ((getMLModelRequest.getVerbose() == null) ^ (getVerbose() == null)) {
            return false;
        }
        return getMLModelRequest.getVerbose() == null || getMLModelRequest.getVerbose().equals(getVerbose());
    }

    public String getMLModelId() {
        return this.mLModelId;
    }

    public Boolean getVerbose() {
        return this.verbose;
    }

    public int hashCode() {
        return (((getMLModelId() == null ? 0 : getMLModelId().hashCode()) + 31) * 31) + (getVerbose() != null ? getVerbose().hashCode() : 0);
    }

    public Boolean isVerbose() {
        return this.verbose;
    }

    public void setMLModelId(String str) {
        this.mLModelId = str;
    }

    public void setVerbose(Boolean bool) {
        this.verbose = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getMLModelId() != null) {
            sb.append("MLModelId: " + getMLModelId() + ",");
        }
        if (getVerbose() != null) {
            sb.append("Verbose: " + getVerbose());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetMLModelRequest withMLModelId(String str) {
        this.mLModelId = str;
        return this;
    }

    public GetMLModelRequest withVerbose(Boolean bool) {
        this.verbose = bool;
        return this;
    }
}
