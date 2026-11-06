package com.amazon.credentiallocker;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.EnumValues;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.credentiallocker/")
@CoralSuppressWarnings
@Generated
@XmlName("GetEndpointResponse")
@Documentation("Response Structure the CredentialLocker endpoint request")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class GetEndpointResponse {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.GetEndpointResponse");
    private String endpoint;
    private long refreshAfterSeconds;
    private String region;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String endpoint;
        protected long refreshAfterSeconds;
        protected String region;

        public GetEndpointResponse build() {
            GetEndpointResponse getEndpointResponse = new GetEndpointResponse();
            populate(getEndpointResponse);
            return getEndpointResponse;
        }

        public void populate(GetEndpointResponse getEndpointResponse) {
            getEndpointResponse.setEndpoint(this.endpoint);
            getEndpointResponse.setRefreshAfterSeconds(this.refreshAfterSeconds);
            getEndpointResponse.setRegion(this.region);
        }

        public Builder withEndpoint(String str) {
            this.endpoint = str;
            return this;
        }

        public Builder withRefreshAfterSeconds(long j) {
            this.refreshAfterSeconds = j;
            return this;
        }

        public Builder withRegion(String str) {
            this.region = str;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetEndpointResponse)) {
            return false;
        }
        GetEndpointResponse getEndpointResponse = (GetEndpointResponse) obj;
        return Objects.equals(getEndpoint(), getEndpointResponse.getEndpoint()) && Long.valueOf(getRefreshAfterSeconds()).equals(Long.valueOf(getEndpointResponse.getRefreshAfterSeconds())) && Objects.equals(getRegion(), getEndpointResponse.getRegion());
    }

    public String getEndpoint() {
        return this.endpoint;
    }

    public long getRefreshAfterSeconds() {
        return this.refreshAfterSeconds;
    }

    @EnumValues({CustomerRegion.NA, CustomerRegion.EU, "JP"})
    public String getRegion() {
        return this.region;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getEndpoint(), Long.valueOf(getRefreshAfterSeconds()), getRegion());
    }

    public void setEndpoint(String str) {
        this.endpoint = str;
    }

    public void setRefreshAfterSeconds(long j) {
        this.refreshAfterSeconds = j;
    }

    public void setRegion(String str) {
        this.region = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withEndpoint(getEndpoint());
        builder.withRefreshAfterSeconds(getRefreshAfterSeconds());
        builder.withRegion(getRegion());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GetEndpointResponse(endpoint=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.endpoint, ", refreshAfterSeconds=", sb);
        sb.append(String.valueOf(this.refreshAfterSeconds));
        sb.append(", region=");
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.region, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
