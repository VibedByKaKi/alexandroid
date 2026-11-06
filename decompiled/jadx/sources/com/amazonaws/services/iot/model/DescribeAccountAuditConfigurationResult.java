package com.amazonaws.services.iot.model;

import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeAccountAuditConfigurationResult implements Serializable {
    private Map<String, AuditCheckConfiguration> auditCheckConfigurations;
    private Map<String, AuditNotificationTarget> auditNotificationTargetConfigurations;
    private String roleArn;

    public DescribeAccountAuditConfigurationResult addauditCheckConfigurationsEntry(String str, AuditCheckConfiguration auditCheckConfiguration) {
        if (this.auditCheckConfigurations == null) {
            this.auditCheckConfigurations = new HashMap();
        }
        if (this.auditCheckConfigurations.containsKey(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(str, ") are provided.", new StringBuilder("Duplicated keys (")));
            return null;
        }
        this.auditCheckConfigurations.put(str, auditCheckConfiguration);
        return this;
    }

    public DescribeAccountAuditConfigurationResult addauditNotificationTargetConfigurationsEntry(String str, AuditNotificationTarget auditNotificationTarget) {
        if (this.auditNotificationTargetConfigurations == null) {
            this.auditNotificationTargetConfigurations = new HashMap();
        }
        if (this.auditNotificationTargetConfigurations.containsKey(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(str, ") are provided.", new StringBuilder("Duplicated keys (")));
            return null;
        }
        this.auditNotificationTargetConfigurations.put(str, auditNotificationTarget);
        return this;
    }

    public DescribeAccountAuditConfigurationResult clearauditCheckConfigurationsEntries() {
        this.auditCheckConfigurations = null;
        return this;
    }

    public DescribeAccountAuditConfigurationResult clearauditNotificationTargetConfigurationsEntries() {
        this.auditNotificationTargetConfigurations = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeAccountAuditConfigurationResult)) {
            return false;
        }
        DescribeAccountAuditConfigurationResult describeAccountAuditConfigurationResult = (DescribeAccountAuditConfigurationResult) obj;
        if ((describeAccountAuditConfigurationResult.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        if (describeAccountAuditConfigurationResult.getRoleArn() != null && !describeAccountAuditConfigurationResult.getRoleArn().equals(getRoleArn())) {
            return false;
        }
        if ((describeAccountAuditConfigurationResult.getAuditNotificationTargetConfigurations() == null) ^ (getAuditNotificationTargetConfigurations() == null)) {
            return false;
        }
        if (describeAccountAuditConfigurationResult.getAuditNotificationTargetConfigurations() != null && !describeAccountAuditConfigurationResult.getAuditNotificationTargetConfigurations().equals(getAuditNotificationTargetConfigurations())) {
            return false;
        }
        if ((describeAccountAuditConfigurationResult.getAuditCheckConfigurations() == null) ^ (getAuditCheckConfigurations() == null)) {
            return false;
        }
        return describeAccountAuditConfigurationResult.getAuditCheckConfigurations() == null || describeAccountAuditConfigurationResult.getAuditCheckConfigurations().equals(getAuditCheckConfigurations());
    }

    public Map<String, AuditCheckConfiguration> getAuditCheckConfigurations() {
        return this.auditCheckConfigurations;
    }

    public Map<String, AuditNotificationTarget> getAuditNotificationTargetConfigurations() {
        return this.auditNotificationTargetConfigurations;
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public int hashCode() {
        return (((((getRoleArn() == null ? 0 : getRoleArn().hashCode()) + 31) * 31) + (getAuditNotificationTargetConfigurations() == null ? 0 : getAuditNotificationTargetConfigurations().hashCode())) * 31) + (getAuditCheckConfigurations() != null ? getAuditCheckConfigurations().hashCode() : 0);
    }

    public void setAuditCheckConfigurations(Map<String, AuditCheckConfiguration> map) {
        this.auditCheckConfigurations = map;
    }

    public void setAuditNotificationTargetConfigurations(Map<String, AuditNotificationTarget> map) {
        this.auditNotificationTargetConfigurations = map;
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getRoleArn() != null) {
            sb.append("roleArn: " + getRoleArn() + ",");
        }
        if (getAuditNotificationTargetConfigurations() != null) {
            sb.append("auditNotificationTargetConfigurations: " + getAuditNotificationTargetConfigurations() + ",");
        }
        if (getAuditCheckConfigurations() != null) {
            sb.append("auditCheckConfigurations: " + getAuditCheckConfigurations());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeAccountAuditConfigurationResult withAuditCheckConfigurations(Map<String, AuditCheckConfiguration> map) {
        this.auditCheckConfigurations = map;
        return this;
    }

    public DescribeAccountAuditConfigurationResult withAuditNotificationTargetConfigurations(Map<String, AuditNotificationTarget> map) {
        this.auditNotificationTargetConfigurations = map;
        return this;
    }

    public DescribeAccountAuditConfigurationResult withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }
}
