package com.amazon.clouddrive.cdasdk.cdus;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ServiceRequest {

    @SerializedName("clientName")
    @Expose
    private String clientName;

    @Generated
    public ServiceRequest() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ServiceRequest;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ServiceRequest)) {
            return false;
        }
        ServiceRequest serviceRequest = (ServiceRequest) obj;
        if (!serviceRequest.canEqual(this)) {
            return false;
        }
        String clientName = getClientName();
        String clientName2 = serviceRequest.getClientName();
        return clientName != null ? clientName.equals(clientName2) : clientName2 == null;
    }

    @Generated
    public String getClientName() {
        return this.clientName;
    }

    @Generated
    public int hashCode() {
        String clientName = getClientName();
        return 59 + (clientName == null ? 43 : clientName.hashCode());
    }

    @Generated
    public void setClientName(String str) {
        this.clientName = str;
    }

    @Generated
    public String toString() {
        return "ServiceRequest(clientName=" + getClientName() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
