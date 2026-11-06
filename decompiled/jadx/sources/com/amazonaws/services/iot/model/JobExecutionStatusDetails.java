package com.amazonaws.services.iot.model;

import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class JobExecutionStatusDetails implements Serializable {
    private Map<String, String> detailsMap;

    public JobExecutionStatusDetails adddetailsMapEntry(String str, String str2) {
        if (this.detailsMap == null) {
            this.detailsMap = new HashMap();
        }
        if (this.detailsMap.containsKey(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(str, ") are provided.", new StringBuilder("Duplicated keys (")));
            return null;
        }
        this.detailsMap.put(str, str2);
        return this;
    }

    public JobExecutionStatusDetails cleardetailsMapEntries() {
        this.detailsMap = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof JobExecutionStatusDetails)) {
            return false;
        }
        JobExecutionStatusDetails jobExecutionStatusDetails = (JobExecutionStatusDetails) obj;
        if ((jobExecutionStatusDetails.getDetailsMap() == null) ^ (getDetailsMap() == null)) {
            return false;
        }
        return jobExecutionStatusDetails.getDetailsMap() == null || jobExecutionStatusDetails.getDetailsMap().equals(getDetailsMap());
    }

    public Map<String, String> getDetailsMap() {
        return this.detailsMap;
    }

    public int hashCode() {
        return 31 + (getDetailsMap() == null ? 0 : getDetailsMap().hashCode());
    }

    public void setDetailsMap(Map<String, String> map) {
        this.detailsMap = map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getDetailsMap() != null) {
            sb.append("detailsMap: " + getDetailsMap());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public JobExecutionStatusDetails withDetailsMap(Map<String, String> map) {
        this.detailsMap = map;
        return this;
    }
}
