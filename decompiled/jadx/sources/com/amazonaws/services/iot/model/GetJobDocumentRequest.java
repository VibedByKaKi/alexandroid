package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetJobDocumentRequest extends AmazonWebServiceRequest implements Serializable {
    private String jobId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetJobDocumentRequest)) {
            return false;
        }
        GetJobDocumentRequest getJobDocumentRequest = (GetJobDocumentRequest) obj;
        if ((getJobDocumentRequest.getJobId() == null) ^ (getJobId() == null)) {
            return false;
        }
        return getJobDocumentRequest.getJobId() == null || getJobDocumentRequest.getJobId().equals(getJobId());
    }

    public String getJobId() {
        return this.jobId;
    }

    public int hashCode() {
        return 31 + (getJobId() == null ? 0 : getJobId().hashCode());
    }

    public void setJobId(String str) {
        this.jobId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getJobId() != null) {
            sb.append("jobId: " + getJobId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetJobDocumentRequest withJobId(String str) {
        this.jobId = str;
        return this;
    }
}
