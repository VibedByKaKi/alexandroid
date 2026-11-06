package com.amazon.comms.models.sip;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.dee.application.service.common.logging.RedactInLogs;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonDeserialize(builder = RDNEndpointBuilder.class)
@RedactInLogs
/* loaded from: classes20.dex */
public final class RDNEndpoint {
    private final ICEConfiguration calleeEndpoint;
    private final ICEConfiguration callerEndpoint;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @JsonPOJOBuilder(withPrefix = "")
    public static class RDNEndpointBuilder {
        private ICEConfiguration calleeEndpoint;
        private ICEConfiguration callerEndpoint;

        public RDNEndpoint build() {
            return new RDNEndpoint(this.calleeEndpoint, this.callerEndpoint);
        }

        public RDNEndpointBuilder calleeEndpoint(ICEConfiguration iCEConfiguration) {
            this.calleeEndpoint = iCEConfiguration;
            return this;
        }

        public RDNEndpointBuilder callerEndpoint(ICEConfiguration iCEConfiguration) {
            this.callerEndpoint = iCEConfiguration;
            return this;
        }

        public String toString() {
            return a$$ExternalSyntheticOutline0.m("RDNEndpoint.RDNEndpointBuilder(calleeEndpoint=", String.valueOf(this.calleeEndpoint), ", callerEndpoint=", String.valueOf(this.callerEndpoint), MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public RDNEndpoint(ICEConfiguration iCEConfiguration, ICEConfiguration iCEConfiguration2) {
        this.calleeEndpoint = iCEConfiguration;
        this.callerEndpoint = iCEConfiguration2;
    }

    public static RDNEndpointBuilder builder() {
        return new RDNEndpointBuilder();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RDNEndpoint)) {
            return false;
        }
        RDNEndpoint rDNEndpoint = (RDNEndpoint) obj;
        ICEConfiguration calleeEndpoint = getCalleeEndpoint();
        ICEConfiguration calleeEndpoint2 = rDNEndpoint.getCalleeEndpoint();
        if (calleeEndpoint != null ? !calleeEndpoint.equals(calleeEndpoint2) : calleeEndpoint2 != null) {
            return false;
        }
        ICEConfiguration callerEndpoint = getCallerEndpoint();
        ICEConfiguration callerEndpoint2 = rDNEndpoint.getCallerEndpoint();
        return callerEndpoint != null ? callerEndpoint.equals(callerEndpoint2) : callerEndpoint2 == null;
    }

    public ICEConfiguration getCalleeEndpoint() {
        return this.calleeEndpoint;
    }

    public ICEConfiguration getCallerEndpoint() {
        return this.callerEndpoint;
    }

    public int hashCode() {
        ICEConfiguration calleeEndpoint = getCalleeEndpoint();
        int hashCode = calleeEndpoint == null ? 43 : calleeEndpoint.hashCode();
        ICEConfiguration callerEndpoint = getCallerEndpoint();
        return ((hashCode + 59) * 59) + (callerEndpoint != null ? callerEndpoint.hashCode() : 43);
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m("RDNEndpoint(calleeEndpoint=", String.valueOf(getCalleeEndpoint()), ", callerEndpoint=", String.valueOf(getCallerEndpoint()), MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
