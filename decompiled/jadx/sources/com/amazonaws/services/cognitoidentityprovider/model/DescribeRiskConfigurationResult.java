package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeRiskConfigurationResult implements Serializable {
    private RiskConfigurationType riskConfiguration;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeRiskConfigurationResult)) {
            return false;
        }
        DescribeRiskConfigurationResult describeRiskConfigurationResult = (DescribeRiskConfigurationResult) obj;
        if ((describeRiskConfigurationResult.getRiskConfiguration() == null) ^ (getRiskConfiguration() == null)) {
            return false;
        }
        return describeRiskConfigurationResult.getRiskConfiguration() == null || describeRiskConfigurationResult.getRiskConfiguration().equals(getRiskConfiguration());
    }

    public RiskConfigurationType getRiskConfiguration() {
        return this.riskConfiguration;
    }

    public int hashCode() {
        return 31 + (getRiskConfiguration() == null ? 0 : getRiskConfiguration().hashCode());
    }

    public void setRiskConfiguration(RiskConfigurationType riskConfigurationType) {
        this.riskConfiguration = riskConfigurationType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getRiskConfiguration() != null) {
            sb.append("RiskConfiguration: " + getRiskConfiguration());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeRiskConfigurationResult withRiskConfiguration(RiskConfigurationType riskConfigurationType) {
        this.riskConfiguration = riskConfigurationType;
        return this;
    }
}
