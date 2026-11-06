package com.amazon.alexa.matter.eventbus.schema;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class RequestHeader {
    private String requestID;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public RequestHeader() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof RequestHeader;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RequestHeader)) {
            return false;
        }
        RequestHeader requestHeader = (RequestHeader) obj;
        if (!requestHeader.canEqual(this)) {
            return false;
        }
        String requestID = getRequestID();
        String requestID2 = requestHeader.getRequestID();
        return requestID != null ? requestID.equals(requestID2) : requestID2 == null;
    }

    @JsonProperty("requestId")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getRequestID() {
        return this.requestID;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        String requestID = getRequestID();
        return 59 + (requestID == null ? 43 : requestID.hashCode());
    }

    @JsonProperty("requestId")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setRequestID(String str) {
        this.requestID = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "RequestHeader(requestID=" + getRequestID() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
