package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class StartOnDemandAuditTaskRequest extends AmazonWebServiceRequest implements Serializable {
    private List<String> targetCheckNames;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StartOnDemandAuditTaskRequest)) {
            return false;
        }
        StartOnDemandAuditTaskRequest startOnDemandAuditTaskRequest = (StartOnDemandAuditTaskRequest) obj;
        if ((startOnDemandAuditTaskRequest.getTargetCheckNames() == null) ^ (getTargetCheckNames() == null)) {
            return false;
        }
        return startOnDemandAuditTaskRequest.getTargetCheckNames() == null || startOnDemandAuditTaskRequest.getTargetCheckNames().equals(getTargetCheckNames());
    }

    public List<String> getTargetCheckNames() {
        return this.targetCheckNames;
    }

    public int hashCode() {
        return 31 + (getTargetCheckNames() == null ? 0 : getTargetCheckNames().hashCode());
    }

    public void setTargetCheckNames(Collection<String> collection) {
        if (collection == null) {
            this.targetCheckNames = null;
        } else {
            this.targetCheckNames = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTargetCheckNames() != null) {
            sb.append("targetCheckNames: " + getTargetCheckNames());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public StartOnDemandAuditTaskRequest withTargetCheckNames(String... strArr) {
        if (getTargetCheckNames() == null) {
            this.targetCheckNames = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.targetCheckNames.add(str);
        }
        return this;
    }

    public StartOnDemandAuditTaskRequest withTargetCheckNames(Collection<String> collection) {
        setTargetCheckNames(collection);
        return this;
    }
}
