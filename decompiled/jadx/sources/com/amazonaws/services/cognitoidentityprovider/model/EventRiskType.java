package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class EventRiskType implements Serializable {
    private Boolean compromisedCredentialsDetected;
    private String riskDecision;
    private String riskLevel;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof EventRiskType)) {
            return false;
        }
        EventRiskType eventRiskType = (EventRiskType) obj;
        if ((eventRiskType.getRiskDecision() == null) ^ (getRiskDecision() == null)) {
            return false;
        }
        if (eventRiskType.getRiskDecision() != null && !eventRiskType.getRiskDecision().equals(getRiskDecision())) {
            return false;
        }
        if ((eventRiskType.getRiskLevel() == null) ^ (getRiskLevel() == null)) {
            return false;
        }
        if (eventRiskType.getRiskLevel() != null && !eventRiskType.getRiskLevel().equals(getRiskLevel())) {
            return false;
        }
        if ((eventRiskType.getCompromisedCredentialsDetected() == null) ^ (getCompromisedCredentialsDetected() == null)) {
            return false;
        }
        return eventRiskType.getCompromisedCredentialsDetected() == null || eventRiskType.getCompromisedCredentialsDetected().equals(getCompromisedCredentialsDetected());
    }

    public Boolean getCompromisedCredentialsDetected() {
        return this.compromisedCredentialsDetected;
    }

    public String getRiskDecision() {
        return this.riskDecision;
    }

    public String getRiskLevel() {
        return this.riskLevel;
    }

    public int hashCode() {
        return (((((getRiskDecision() == null ? 0 : getRiskDecision().hashCode()) + 31) * 31) + (getRiskLevel() == null ? 0 : getRiskLevel().hashCode())) * 31) + (getCompromisedCredentialsDetected() != null ? getCompromisedCredentialsDetected().hashCode() : 0);
    }

    public Boolean isCompromisedCredentialsDetected() {
        return this.compromisedCredentialsDetected;
    }

    public void setCompromisedCredentialsDetected(Boolean bool) {
        this.compromisedCredentialsDetected = bool;
    }

    public void setRiskDecision(RiskDecisionType riskDecisionType) {
        this.riskDecision = riskDecisionType.toString();
    }

    public void setRiskLevel(RiskLevelType riskLevelType) {
        this.riskLevel = riskLevelType.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getRiskDecision() != null) {
            sb.append("RiskDecision: " + getRiskDecision() + ",");
        }
        if (getRiskLevel() != null) {
            sb.append("RiskLevel: " + getRiskLevel() + ",");
        }
        if (getCompromisedCredentialsDetected() != null) {
            sb.append("CompromisedCredentialsDetected: " + getCompromisedCredentialsDetected());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public EventRiskType withCompromisedCredentialsDetected(Boolean bool) {
        this.compromisedCredentialsDetected = bool;
        return this;
    }

    public EventRiskType withRiskDecision(RiskDecisionType riskDecisionType) {
        this.riskDecision = riskDecisionType.toString();
        return this;
    }

    public EventRiskType withRiskLevel(RiskLevelType riskLevelType) {
        this.riskLevel = riskLevelType.toString();
        return this;
    }

    public void setRiskDecision(String str) {
        this.riskDecision = str;
    }

    public void setRiskLevel(String str) {
        this.riskLevel = str;
    }

    public EventRiskType withRiskDecision(String str) {
        this.riskDecision = str;
        return this;
    }

    public EventRiskType withRiskLevel(String str) {
        this.riskLevel = str;
        return this;
    }
}
