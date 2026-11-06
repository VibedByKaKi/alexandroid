package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class RiskExceptionConfigurationType implements Serializable {
    private List<String> blockedIPRangeList;
    private List<String> skippedIPRangeList;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RiskExceptionConfigurationType)) {
            return false;
        }
        RiskExceptionConfigurationType riskExceptionConfigurationType = (RiskExceptionConfigurationType) obj;
        if ((riskExceptionConfigurationType.getBlockedIPRangeList() == null) ^ (getBlockedIPRangeList() == null)) {
            return false;
        }
        if (riskExceptionConfigurationType.getBlockedIPRangeList() != null && !riskExceptionConfigurationType.getBlockedIPRangeList().equals(getBlockedIPRangeList())) {
            return false;
        }
        if ((riskExceptionConfigurationType.getSkippedIPRangeList() == null) ^ (getSkippedIPRangeList() == null)) {
            return false;
        }
        return riskExceptionConfigurationType.getSkippedIPRangeList() == null || riskExceptionConfigurationType.getSkippedIPRangeList().equals(getSkippedIPRangeList());
    }

    public List<String> getBlockedIPRangeList() {
        return this.blockedIPRangeList;
    }

    public List<String> getSkippedIPRangeList() {
        return this.skippedIPRangeList;
    }

    public int hashCode() {
        return (((getBlockedIPRangeList() == null ? 0 : getBlockedIPRangeList().hashCode()) + 31) * 31) + (getSkippedIPRangeList() != null ? getSkippedIPRangeList().hashCode() : 0);
    }

    public void setBlockedIPRangeList(Collection<String> collection) {
        if (collection == null) {
            this.blockedIPRangeList = null;
        } else {
            this.blockedIPRangeList = new ArrayList(collection);
        }
    }

    public void setSkippedIPRangeList(Collection<String> collection) {
        if (collection == null) {
            this.skippedIPRangeList = null;
        } else {
            this.skippedIPRangeList = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getBlockedIPRangeList() != null) {
            sb.append("BlockedIPRangeList: " + getBlockedIPRangeList() + ",");
        }
        if (getSkippedIPRangeList() != null) {
            sb.append("SkippedIPRangeList: " + getSkippedIPRangeList());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public RiskExceptionConfigurationType withBlockedIPRangeList(String... strArr) {
        if (getBlockedIPRangeList() == null) {
            this.blockedIPRangeList = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.blockedIPRangeList.add(str);
        }
        return this;
    }

    public RiskExceptionConfigurationType withSkippedIPRangeList(String... strArr) {
        if (getSkippedIPRangeList() == null) {
            this.skippedIPRangeList = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.skippedIPRangeList.add(str);
        }
        return this;
    }

    public RiskExceptionConfigurationType withBlockedIPRangeList(Collection<String> collection) {
        setBlockedIPRangeList(collection);
        return this;
    }

    public RiskExceptionConfigurationType withSkippedIPRangeList(Collection<String> collection) {
        setSkippedIPRangeList(collection);
        return this;
    }
}
