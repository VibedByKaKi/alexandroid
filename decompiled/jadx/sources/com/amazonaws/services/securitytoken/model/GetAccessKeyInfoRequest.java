package com.amazonaws.services.securitytoken.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetAccessKeyInfoRequest extends AmazonWebServiceRequest implements Serializable {
    private String accessKeyId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetAccessKeyInfoRequest)) {
            return false;
        }
        GetAccessKeyInfoRequest getAccessKeyInfoRequest = (GetAccessKeyInfoRequest) obj;
        if ((getAccessKeyInfoRequest.getAccessKeyId() == null) ^ (getAccessKeyId() == null)) {
            return false;
        }
        return getAccessKeyInfoRequest.getAccessKeyId() == null || getAccessKeyInfoRequest.getAccessKeyId().equals(getAccessKeyId());
    }

    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public int hashCode() {
        return 31 + (getAccessKeyId() == null ? 0 : getAccessKeyId().hashCode());
    }

    public void setAccessKeyId(String str) {
        this.accessKeyId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getAccessKeyId() != null) {
            sb.append("AccessKeyId: " + getAccessKeyId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetAccessKeyInfoRequest withAccessKeyId(String str) {
        this.accessKeyId = str;
        return this;
    }
}
