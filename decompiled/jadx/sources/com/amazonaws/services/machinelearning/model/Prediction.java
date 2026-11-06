package com.amazonaws.services.machinelearning.model;

import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class Prediction implements Serializable {
    private String predictedLabel;
    private Float predictedValue;
    private Map<String, Float> predictedScores = new HashMap();
    private Map<String, String> details = new HashMap();

    public Prediction adddetailsEntry(String str, String str2) {
        if (this.details == null) {
            this.details = new HashMap();
        }
        if (this.details.containsKey(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(str, ") are provided.", new StringBuilder("Duplicated keys (")));
            return null;
        }
        this.details.put(str, str2);
        return this;
    }

    public Prediction addpredictedScoresEntry(String str, Float f) {
        if (this.predictedScores == null) {
            this.predictedScores = new HashMap();
        }
        if (this.predictedScores.containsKey(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(str, ") are provided.", new StringBuilder("Duplicated keys (")));
            return null;
        }
        this.predictedScores.put(str, f);
        return this;
    }

    public Prediction cleardetailsEntries() {
        this.details = null;
        return this;
    }

    public Prediction clearpredictedScoresEntries() {
        this.predictedScores = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Prediction)) {
            return false;
        }
        Prediction prediction = (Prediction) obj;
        if ((prediction.getPredictedLabel() == null) ^ (getPredictedLabel() == null)) {
            return false;
        }
        if (prediction.getPredictedLabel() != null && !prediction.getPredictedLabel().equals(getPredictedLabel())) {
            return false;
        }
        if ((prediction.getPredictedValue() == null) ^ (getPredictedValue() == null)) {
            return false;
        }
        if (prediction.getPredictedValue() != null && !prediction.getPredictedValue().equals(getPredictedValue())) {
            return false;
        }
        if ((prediction.getPredictedScores() == null) ^ (getPredictedScores() == null)) {
            return false;
        }
        if (prediction.getPredictedScores() != null && !prediction.getPredictedScores().equals(getPredictedScores())) {
            return false;
        }
        if ((prediction.getDetails() == null) ^ (getDetails() == null)) {
            return false;
        }
        return prediction.getDetails() == null || prediction.getDetails().equals(getDetails());
    }

    public Map<String, String> getDetails() {
        return this.details;
    }

    public String getPredictedLabel() {
        return this.predictedLabel;
    }

    public Map<String, Float> getPredictedScores() {
        return this.predictedScores;
    }

    public Float getPredictedValue() {
        return this.predictedValue;
    }

    public int hashCode() {
        return (((((((getPredictedLabel() == null ? 0 : getPredictedLabel().hashCode()) + 31) * 31) + (getPredictedValue() == null ? 0 : getPredictedValue().hashCode())) * 31) + (getPredictedScores() == null ? 0 : getPredictedScores().hashCode())) * 31) + (getDetails() != null ? getDetails().hashCode() : 0);
    }

    public void setDetails(Map<String, String> map) {
        this.details = map;
    }

    public void setPredictedLabel(String str) {
        this.predictedLabel = str;
    }

    public void setPredictedScores(Map<String, Float> map) {
        this.predictedScores = map;
    }

    public void setPredictedValue(Float f) {
        this.predictedValue = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getPredictedLabel() != null) {
            sb.append("predictedLabel: " + getPredictedLabel() + ",");
        }
        if (getPredictedValue() != null) {
            sb.append("predictedValue: " + getPredictedValue() + ",");
        }
        if (getPredictedScores() != null) {
            sb.append("predictedScores: " + getPredictedScores() + ",");
        }
        if (getDetails() != null) {
            sb.append("details: " + getDetails());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public Prediction withDetails(Map<String, String> map) {
        this.details = map;
        return this;
    }

    public Prediction withPredictedLabel(String str) {
        this.predictedLabel = str;
        return this;
    }

    public Prediction withPredictedScores(Map<String, Float> map) {
        this.predictedScores = map;
        return this;
    }

    public Prediction withPredictedValue(Float f) {
        this.predictedValue = f;
        return this;
    }
}
