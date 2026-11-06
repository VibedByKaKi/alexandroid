package com.amazon.alexa.matter.client.credentiallockerservice.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class GetEndpointRequest {
    private final String customerId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class GetEndpointRequestBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String customerId;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public GetEndpointRequestBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public GetEndpointRequest build() {
            return new GetEndpointRequest(this.customerId);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public GetEndpointRequestBuilder customerId(String str) {
            this.customerId = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            return a$$ExternalSyntheticOutline0.m(new StringBuilder("GetEndpointRequest.GetEndpointRequestBuilder(customerId="), this.customerId, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private GetEndpointRequest() {
        this.customerId = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static GetEndpointRequestBuilder builder() {
        return new GetEndpointRequestBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetEndpointRequest)) {
            return false;
        }
        String customerId = getCustomerId();
        String customerId2 = ((GetEndpointRequest) obj).getCustomerId();
        return customerId != null ? customerId.equals(customerId2) : customerId2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getCustomerId() {
        return this.customerId;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        String customerId = getCustomerId();
        return 59 + (customerId == null ? 43 : customerId.hashCode());
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "GetEndpointRequest(customerId=" + getCustomerId() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public GetEndpointRequest withCustomerId(String str) {
        return this.customerId == str ? this : new GetEndpointRequest(str);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public GetEndpointRequest(String str) {
        this.customerId = str;
    }
}
