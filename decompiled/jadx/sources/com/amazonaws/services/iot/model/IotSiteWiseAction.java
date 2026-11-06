package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class IotSiteWiseAction implements Serializable {
    private List<PutAssetPropertyValueEntry> putAssetPropertyValueEntries;
    private String roleArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof IotSiteWiseAction)) {
            return false;
        }
        IotSiteWiseAction iotSiteWiseAction = (IotSiteWiseAction) obj;
        if ((iotSiteWiseAction.getPutAssetPropertyValueEntries() == null) ^ (getPutAssetPropertyValueEntries() == null)) {
            return false;
        }
        if (iotSiteWiseAction.getPutAssetPropertyValueEntries() != null && !iotSiteWiseAction.getPutAssetPropertyValueEntries().equals(getPutAssetPropertyValueEntries())) {
            return false;
        }
        if ((iotSiteWiseAction.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        return iotSiteWiseAction.getRoleArn() == null || iotSiteWiseAction.getRoleArn().equals(getRoleArn());
    }

    public List<PutAssetPropertyValueEntry> getPutAssetPropertyValueEntries() {
        return this.putAssetPropertyValueEntries;
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public int hashCode() {
        return (((getPutAssetPropertyValueEntries() == null ? 0 : getPutAssetPropertyValueEntries().hashCode()) + 31) * 31) + (getRoleArn() != null ? getRoleArn().hashCode() : 0);
    }

    public void setPutAssetPropertyValueEntries(Collection<PutAssetPropertyValueEntry> collection) {
        if (collection == null) {
            this.putAssetPropertyValueEntries = null;
        } else {
            this.putAssetPropertyValueEntries = new ArrayList(collection);
        }
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getPutAssetPropertyValueEntries() != null) {
            sb.append("putAssetPropertyValueEntries: " + getPutAssetPropertyValueEntries() + ",");
        }
        if (getRoleArn() != null) {
            sb.append("roleArn: " + getRoleArn());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public IotSiteWiseAction withPutAssetPropertyValueEntries(PutAssetPropertyValueEntry... putAssetPropertyValueEntryArr) {
        if (getPutAssetPropertyValueEntries() == null) {
            this.putAssetPropertyValueEntries = new ArrayList(putAssetPropertyValueEntryArr.length);
        }
        for (PutAssetPropertyValueEntry putAssetPropertyValueEntry : putAssetPropertyValueEntryArr) {
            this.putAssetPropertyValueEntries.add(putAssetPropertyValueEntry);
        }
        return this;
    }

    public IotSiteWiseAction withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }

    public IotSiteWiseAction withPutAssetPropertyValueEntries(Collection<PutAssetPropertyValueEntry> collection) {
        setPutAssetPropertyValueEntries(collection);
        return this;
    }
}
