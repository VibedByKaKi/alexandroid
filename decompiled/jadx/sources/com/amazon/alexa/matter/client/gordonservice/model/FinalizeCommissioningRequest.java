package com.amazon.alexa.matter.client.gordonservice.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class FinalizeCommissioningRequest {
    private final CustomerDevice device;
    private final String sessionId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class FinalizeCommissioningRequestBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private CustomerDevice device;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String sessionId;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public FinalizeCommissioningRequestBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public FinalizeCommissioningRequest build() {
            return new FinalizeCommissioningRequest(this.sessionId, this.device);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public FinalizeCommissioningRequestBuilder device(CustomerDevice customerDevice) {
            this.device = customerDevice;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public FinalizeCommissioningRequestBuilder sessionId(String str) {
            this.sessionId = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            return "FinalizeCommissioningRequest.FinalizeCommissioningRequestBuilder(sessionId=" + this.sessionId + ", device=" + this.device + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private FinalizeCommissioningRequest() {
        this.sessionId = null;
        this.device = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static FinalizeCommissioningRequestBuilder builder() {
        return new FinalizeCommissioningRequestBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FinalizeCommissioningRequest)) {
            return false;
        }
        FinalizeCommissioningRequest finalizeCommissioningRequest = (FinalizeCommissioningRequest) obj;
        String sessionId = getSessionId();
        String sessionId2 = finalizeCommissioningRequest.getSessionId();
        if (sessionId != null ? !sessionId.equals(sessionId2) : sessionId2 != null) {
            return false;
        }
        CustomerDevice device = getDevice();
        CustomerDevice device2 = finalizeCommissioningRequest.getDevice();
        return device != null ? device.equals(device2) : device2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CustomerDevice getDevice() {
        return this.device;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getSessionId() {
        return this.sessionId;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        String sessionId = getSessionId();
        int hashCode = sessionId == null ? 43 : sessionId.hashCode();
        CustomerDevice device = getDevice();
        return ((hashCode + 59) * 59) + (device != null ? device.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "FinalizeCommissioningRequest(sessionId=" + getSessionId() + ", device=" + getDevice() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public FinalizeCommissioningRequest withDevice(CustomerDevice customerDevice) {
        return this.device == customerDevice ? this : new FinalizeCommissioningRequest(this.sessionId, customerDevice);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public FinalizeCommissioningRequest withSessionId(String str) {
        return this.sessionId == str ? this : new FinalizeCommissioningRequest(str, this.device);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public FinalizeCommissioningRequest(String str, CustomerDevice customerDevice) {
        this.sessionId = str;
        this.device = customerDevice;
    }
}
