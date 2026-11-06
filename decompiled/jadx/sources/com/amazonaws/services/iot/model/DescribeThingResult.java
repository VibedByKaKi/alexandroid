package com.amazonaws.services.iot.model;

import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeThingResult implements Serializable {
    private Map<String, String> attributes;
    private String billingGroupName;
    private String defaultClientId;
    private String thingArn;
    private String thingId;
    private String thingName;
    private String thingTypeName;
    private Long version;

    public DescribeThingResult addattributesEntry(String str, String str2) {
        if (this.attributes == null) {
            this.attributes = new HashMap();
        }
        if (this.attributes.containsKey(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(str, ") are provided.", new StringBuilder("Duplicated keys (")));
            return null;
        }
        this.attributes.put(str, str2);
        return this;
    }

    public DescribeThingResult clearattributesEntries() {
        this.attributes = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeThingResult)) {
            return false;
        }
        DescribeThingResult describeThingResult = (DescribeThingResult) obj;
        if ((describeThingResult.getDefaultClientId() == null) ^ (getDefaultClientId() == null)) {
            return false;
        }
        if (describeThingResult.getDefaultClientId() != null && !describeThingResult.getDefaultClientId().equals(getDefaultClientId())) {
            return false;
        }
        if ((describeThingResult.getThingName() == null) ^ (getThingName() == null)) {
            return false;
        }
        if (describeThingResult.getThingName() != null && !describeThingResult.getThingName().equals(getThingName())) {
            return false;
        }
        if ((describeThingResult.getThingId() == null) ^ (getThingId() == null)) {
            return false;
        }
        if (describeThingResult.getThingId() != null && !describeThingResult.getThingId().equals(getThingId())) {
            return false;
        }
        if ((describeThingResult.getThingArn() == null) ^ (getThingArn() == null)) {
            return false;
        }
        if (describeThingResult.getThingArn() != null && !describeThingResult.getThingArn().equals(getThingArn())) {
            return false;
        }
        if ((describeThingResult.getThingTypeName() == null) ^ (getThingTypeName() == null)) {
            return false;
        }
        if (describeThingResult.getThingTypeName() != null && !describeThingResult.getThingTypeName().equals(getThingTypeName())) {
            return false;
        }
        if ((describeThingResult.getAttributes() == null) ^ (getAttributes() == null)) {
            return false;
        }
        if (describeThingResult.getAttributes() != null && !describeThingResult.getAttributes().equals(getAttributes())) {
            return false;
        }
        if ((describeThingResult.getVersion() == null) ^ (getVersion() == null)) {
            return false;
        }
        if (describeThingResult.getVersion() != null && !describeThingResult.getVersion().equals(getVersion())) {
            return false;
        }
        if ((describeThingResult.getBillingGroupName() == null) ^ (getBillingGroupName() == null)) {
            return false;
        }
        return describeThingResult.getBillingGroupName() == null || describeThingResult.getBillingGroupName().equals(getBillingGroupName());
    }

    public Map<String, String> getAttributes() {
        return this.attributes;
    }

    public String getBillingGroupName() {
        return this.billingGroupName;
    }

    public String getDefaultClientId() {
        return this.defaultClientId;
    }

    public String getThingArn() {
        return this.thingArn;
    }

    public String getThingId() {
        return this.thingId;
    }

    public String getThingName() {
        return this.thingName;
    }

    public String getThingTypeName() {
        return this.thingTypeName;
    }

    public Long getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((((((((((getDefaultClientId() == null ? 0 : getDefaultClientId().hashCode()) + 31) * 31) + (getThingName() == null ? 0 : getThingName().hashCode())) * 31) + (getThingId() == null ? 0 : getThingId().hashCode())) * 31) + (getThingArn() == null ? 0 : getThingArn().hashCode())) * 31) + (getThingTypeName() == null ? 0 : getThingTypeName().hashCode())) * 31) + (getAttributes() == null ? 0 : getAttributes().hashCode())) * 31) + (getVersion() == null ? 0 : getVersion().hashCode())) * 31) + (getBillingGroupName() != null ? getBillingGroupName().hashCode() : 0);
    }

    public void setAttributes(Map<String, String> map) {
        this.attributes = map;
    }

    public void setBillingGroupName(String str) {
        this.billingGroupName = str;
    }

    public void setDefaultClientId(String str) {
        this.defaultClientId = str;
    }

    public void setThingArn(String str) {
        this.thingArn = str;
    }

    public void setThingId(String str) {
        this.thingId = str;
    }

    public void setThingName(String str) {
        this.thingName = str;
    }

    public void setThingTypeName(String str) {
        this.thingTypeName = str;
    }

    public void setVersion(Long l) {
        this.version = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getDefaultClientId() != null) {
            sb.append("defaultClientId: " + getDefaultClientId() + ",");
        }
        if (getThingName() != null) {
            sb.append("thingName: " + getThingName() + ",");
        }
        if (getThingId() != null) {
            sb.append("thingId: " + getThingId() + ",");
        }
        if (getThingArn() != null) {
            sb.append("thingArn: " + getThingArn() + ",");
        }
        if (getThingTypeName() != null) {
            sb.append("thingTypeName: " + getThingTypeName() + ",");
        }
        if (getAttributes() != null) {
            sb.append("attributes: " + getAttributes() + ",");
        }
        if (getVersion() != null) {
            sb.append("version: " + getVersion() + ",");
        }
        if (getBillingGroupName() != null) {
            sb.append("billingGroupName: " + getBillingGroupName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeThingResult withAttributes(Map<String, String> map) {
        this.attributes = map;
        return this;
    }

    public DescribeThingResult withBillingGroupName(String str) {
        this.billingGroupName = str;
        return this;
    }

    public DescribeThingResult withDefaultClientId(String str) {
        this.defaultClientId = str;
        return this;
    }

    public DescribeThingResult withThingArn(String str) {
        this.thingArn = str;
        return this;
    }

    public DescribeThingResult withThingId(String str) {
        this.thingId = str;
        return this;
    }

    public DescribeThingResult withThingName(String str) {
        this.thingName = str;
        return this;
    }

    public DescribeThingResult withThingTypeName(String str) {
        this.thingTypeName = str;
        return this;
    }

    public DescribeThingResult withVersion(Long l) {
        this.version = l;
        return this;
    }
}
