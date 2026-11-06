package com.amazon.alexa.matter.client.credentiallockerservice.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class GetEndpointResponse {
    private final String endpoint;
    private final long refreshAfterSeconds;
    private final String region;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class GetEndpointResponseBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String endpoint;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private long refreshAfterSeconds;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String region;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public GetEndpointResponseBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public GetEndpointResponse build() {
            return new GetEndpointResponse(this.region, this.endpoint, this.refreshAfterSeconds);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public GetEndpointResponseBuilder endpoint(String str) {
            this.endpoint = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public GetEndpointResponseBuilder refreshAfterSeconds(long j) {
            this.refreshAfterSeconds = j;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public GetEndpointResponseBuilder region(String str) {
            this.region = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("GetEndpointResponse.GetEndpointResponseBuilder(region=");
            sb.append(this.region);
            sb.append(", endpoint=");
            sb.append(this.endpoint);
            sb.append(", refreshAfterSeconds=");
            return a$$ExternalSyntheticOutline0.m(this.refreshAfterSeconds, MarkdownConstants.RIGHT_PARENTHESIS, sb);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private GetEndpointResponse() {
        this.region = null;
        this.endpoint = null;
        this.refreshAfterSeconds = 0L;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static GetEndpointResponseBuilder builder() {
        return new GetEndpointResponseBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetEndpointResponse)) {
            return false;
        }
        GetEndpointResponse getEndpointResponse = (GetEndpointResponse) obj;
        if (getRefreshAfterSeconds() != getEndpointResponse.getRefreshAfterSeconds()) {
            return false;
        }
        String region = getRegion();
        String region2 = getEndpointResponse.getRegion();
        if (region != null ? !region.equals(region2) : region2 != null) {
            return false;
        }
        String endpoint = getEndpoint();
        String endpoint2 = getEndpointResponse.getEndpoint();
        return endpoint != null ? endpoint.equals(endpoint2) : endpoint2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getEndpoint() {
        return this.endpoint;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public long getRefreshAfterSeconds() {
        return this.refreshAfterSeconds;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getRegion() {
        return this.region;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        long refreshAfterSeconds = getRefreshAfterSeconds();
        String region = getRegion();
        int i = (((int) (refreshAfterSeconds ^ (refreshAfterSeconds >>> 32))) + 59) * 59;
        int hashCode = region == null ? 43 : region.hashCode();
        String endpoint = getEndpoint();
        return ((i + hashCode) * 59) + (endpoint != null ? endpoint.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "GetEndpointResponse(region=" + getRegion() + ", endpoint=" + getEndpoint() + ", refreshAfterSeconds=" + getRefreshAfterSeconds() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public GetEndpointResponse withEndpoint(String str) {
        return this.endpoint == str ? this : new GetEndpointResponse(this.region, str, this.refreshAfterSeconds);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public GetEndpointResponse withRefreshAfterSeconds(long j) {
        return this.refreshAfterSeconds == j ? this : new GetEndpointResponse(this.region, this.endpoint, j);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public GetEndpointResponse withRegion(String str) {
        return this.region == str ? this : new GetEndpointResponse(str, this.endpoint, this.refreshAfterSeconds);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public GetEndpointResponse(String str, String str2, long j) {
        this.region = str;
        this.endpoint = str2;
        this.refreshAfterSeconds = j;
    }
}
