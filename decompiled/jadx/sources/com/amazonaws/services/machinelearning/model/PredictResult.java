package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PredictResult implements Serializable {
    private Prediction prediction;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PredictResult)) {
            return false;
        }
        PredictResult predictResult = (PredictResult) obj;
        if ((predictResult.getPrediction() == null) ^ (getPrediction() == null)) {
            return false;
        }
        return predictResult.getPrediction() == null || predictResult.getPrediction().equals(getPrediction());
    }

    public Prediction getPrediction() {
        return this.prediction;
    }

    public int hashCode() {
        return 31 + (getPrediction() == null ? 0 : getPrediction().hashCode());
    }

    public void setPrediction(Prediction prediction) {
        this.prediction = prediction;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getPrediction() != null) {
            sb.append("Prediction: " + getPrediction());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public PredictResult withPrediction(Prediction prediction) {
        this.prediction = prediction;
        return this;
    }
}
