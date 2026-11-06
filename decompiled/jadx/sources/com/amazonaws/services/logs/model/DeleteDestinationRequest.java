package com.amazonaws.services.logs.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeleteDestinationRequest extends AmazonWebServiceRequest implements Serializable {
    private String destinationName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteDestinationRequest)) {
            return false;
        }
        DeleteDestinationRequest deleteDestinationRequest = (DeleteDestinationRequest) obj;
        if ((deleteDestinationRequest.getDestinationName() == null) ^ (getDestinationName() == null)) {
            return false;
        }
        return deleteDestinationRequest.getDestinationName() == null || deleteDestinationRequest.getDestinationName().equals(getDestinationName());
    }

    public String getDestinationName() {
        return this.destinationName;
    }

    public int hashCode() {
        return 31 + (getDestinationName() == null ? 0 : getDestinationName().hashCode());
    }

    public void setDestinationName(String str) {
        this.destinationName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getDestinationName() != null) {
            sb.append("destinationName: " + getDestinationName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DeleteDestinationRequest withDestinationName(String str) {
        this.destinationName = str;
        return this;
    }
}
