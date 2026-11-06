package com.amazonaws.services.machinelearning.model;

import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PredictRequest extends AmazonWebServiceRequest implements Serializable {
    private String mLModelId;
    private String predictEndpoint;
    private Map<String, String> record = new HashMap();

    public PredictRequest addRecordEntry(String str, String str2) {
        if (this.record == null) {
            this.record = new HashMap();
        }
        if (this.record.containsKey(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(str, ") are provided.", new StringBuilder("Duplicated keys (")));
            return null;
        }
        this.record.put(str, str2);
        return this;
    }

    public PredictRequest clearRecordEntries() {
        this.record = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PredictRequest)) {
            return false;
        }
        PredictRequest predictRequest = (PredictRequest) obj;
        if ((predictRequest.getMLModelId() == null) ^ (getMLModelId() == null)) {
            return false;
        }
        if (predictRequest.getMLModelId() != null && !predictRequest.getMLModelId().equals(getMLModelId())) {
            return false;
        }
        if ((predictRequest.getRecord() == null) ^ (getRecord() == null)) {
            return false;
        }
        if (predictRequest.getRecord() != null && !predictRequest.getRecord().equals(getRecord())) {
            return false;
        }
        if ((predictRequest.getPredictEndpoint() == null) ^ (getPredictEndpoint() == null)) {
            return false;
        }
        return predictRequest.getPredictEndpoint() == null || predictRequest.getPredictEndpoint().equals(getPredictEndpoint());
    }

    public String getMLModelId() {
        return this.mLModelId;
    }

    public String getPredictEndpoint() {
        return this.predictEndpoint;
    }

    public Map<String, String> getRecord() {
        return this.record;
    }

    public int hashCode() {
        return (((((getMLModelId() == null ? 0 : getMLModelId().hashCode()) + 31) * 31) + (getRecord() == null ? 0 : getRecord().hashCode())) * 31) + (getPredictEndpoint() != null ? getPredictEndpoint().hashCode() : 0);
    }

    public void setMLModelId(String str) {
        this.mLModelId = str;
    }

    public void setPredictEndpoint(String str) {
        this.predictEndpoint = str;
    }

    public void setRecord(Map<String, String> map) {
        this.record = map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getMLModelId() != null) {
            sb.append("MLModelId: " + getMLModelId() + ",");
        }
        if (getRecord() != null) {
            sb.append("Record: " + getRecord() + ",");
        }
        if (getPredictEndpoint() != null) {
            sb.append("PredictEndpoint: " + getPredictEndpoint());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public PredictRequest withMLModelId(String str) {
        this.mLModelId = str;
        return this;
    }

    public PredictRequest withPredictEndpoint(String str) {
        this.predictEndpoint = str;
        return this;
    }

    public PredictRequest withRecord(Map<String, String> map) {
        this.record = map;
        return this;
    }
}
