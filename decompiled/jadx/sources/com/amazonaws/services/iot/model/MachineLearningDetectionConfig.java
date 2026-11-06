package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class MachineLearningDetectionConfig implements Serializable {
    private String confidenceLevel;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MachineLearningDetectionConfig)) {
            return false;
        }
        MachineLearningDetectionConfig machineLearningDetectionConfig = (MachineLearningDetectionConfig) obj;
        if ((machineLearningDetectionConfig.getConfidenceLevel() == null) ^ (getConfidenceLevel() == null)) {
            return false;
        }
        return machineLearningDetectionConfig.getConfidenceLevel() == null || machineLearningDetectionConfig.getConfidenceLevel().equals(getConfidenceLevel());
    }

    public String getConfidenceLevel() {
        return this.confidenceLevel;
    }

    public int hashCode() {
        return 31 + (getConfidenceLevel() == null ? 0 : getConfidenceLevel().hashCode());
    }

    public void setConfidenceLevel(ConfidenceLevel confidenceLevel) {
        this.confidenceLevel = confidenceLevel.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getConfidenceLevel() != null) {
            sb.append("confidenceLevel: " + getConfidenceLevel());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public MachineLearningDetectionConfig withConfidenceLevel(ConfidenceLevel confidenceLevel) {
        this.confidenceLevel = confidenceLevel.toString();
        return this;
    }

    public void setConfidenceLevel(String str) {
        this.confidenceLevel = str;
    }

    public MachineLearningDetectionConfig withConfidenceLevel(String str) {
        this.confidenceLevel = str;
        return this;
    }
}
