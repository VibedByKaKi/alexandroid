package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeMitigationActionRequest extends AmazonWebServiceRequest implements Serializable {
    private String actionName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeMitigationActionRequest)) {
            return false;
        }
        DescribeMitigationActionRequest describeMitigationActionRequest = (DescribeMitigationActionRequest) obj;
        if ((describeMitigationActionRequest.getActionName() == null) ^ (getActionName() == null)) {
            return false;
        }
        return describeMitigationActionRequest.getActionName() == null || describeMitigationActionRequest.getActionName().equals(getActionName());
    }

    public String getActionName() {
        return this.actionName;
    }

    public int hashCode() {
        return 31 + (getActionName() == null ? 0 : getActionName().hashCode());
    }

    public void setActionName(String str) {
        this.actionName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getActionName() != null) {
            sb.append("actionName: " + getActionName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeMitigationActionRequest withActionName(String str) {
        this.actionName = str;
        return this;
    }
}
