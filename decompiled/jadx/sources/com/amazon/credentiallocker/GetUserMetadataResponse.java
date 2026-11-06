package com.amazon.credentiallocker;

import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Required;
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
@XmlName("GetUserMetadataResponse")
@Documentation("Structure of GetUserMetadataResponse")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class GetUserMetadataResponse {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.GetUserMetadataResponse");
    private long mostRecentReplacedCredentialUtcMillis;
    private long mostRecentUpdatedCredentialUtcMillis;
    private NetworkMetadata networkMetadata;
    private int wifiCredentialCount;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected long mostRecentReplacedCredentialUtcMillis;
        protected long mostRecentUpdatedCredentialUtcMillis;
        protected NetworkMetadata networkMetadata;
        protected int wifiCredentialCount;

        public GetUserMetadataResponse build() {
            GetUserMetadataResponse getUserMetadataResponse = new GetUserMetadataResponse();
            populate(getUserMetadataResponse);
            return getUserMetadataResponse;
        }

        public void populate(GetUserMetadataResponse getUserMetadataResponse) {
            getUserMetadataResponse.setWifiCredentialCount(this.wifiCredentialCount);
            getUserMetadataResponse.setMostRecentUpdatedCredentialUtcMillis(this.mostRecentUpdatedCredentialUtcMillis);
            getUserMetadataResponse.setMostRecentReplacedCredentialUtcMillis(this.mostRecentReplacedCredentialUtcMillis);
            getUserMetadataResponse.setNetworkMetadata(this.networkMetadata);
        }

        public Builder withMostRecentReplacedCredentialUtcMillis(long j) {
            this.mostRecentReplacedCredentialUtcMillis = j;
            return this;
        }

        public Builder withMostRecentUpdatedCredentialUtcMillis(long j) {
            this.mostRecentUpdatedCredentialUtcMillis = j;
            return this;
        }

        public Builder withNetworkMetadata(NetworkMetadata networkMetadata) {
            this.networkMetadata = networkMetadata;
            return this;
        }

        public Builder withWifiCredentialCount(int i) {
            this.wifiCredentialCount = i;
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
        if (!(obj instanceof GetUserMetadataResponse)) {
            return false;
        }
        GetUserMetadataResponse getUserMetadataResponse = (GetUserMetadataResponse) obj;
        return Integer.valueOf(getWifiCredentialCount()).equals(Integer.valueOf(getUserMetadataResponse.getWifiCredentialCount())) && Long.valueOf(getMostRecentUpdatedCredentialUtcMillis()).equals(Long.valueOf(getUserMetadataResponse.getMostRecentUpdatedCredentialUtcMillis())) && Long.valueOf(getMostRecentReplacedCredentialUtcMillis()).equals(Long.valueOf(getUserMetadataResponse.getMostRecentReplacedCredentialUtcMillis())) && Objects.equals(getNetworkMetadata(), getUserMetadataResponse.getNetworkMetadata());
    }

    public long getMostRecentReplacedCredentialUtcMillis() {
        return this.mostRecentReplacedCredentialUtcMillis;
    }

    public long getMostRecentUpdatedCredentialUtcMillis() {
        return this.mostRecentUpdatedCredentialUtcMillis;
    }

    public NetworkMetadata getNetworkMetadata() {
        return this.networkMetadata;
    }

    @Required
    public int getWifiCredentialCount() {
        return this.wifiCredentialCount;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), Integer.valueOf(getWifiCredentialCount()), Long.valueOf(getMostRecentUpdatedCredentialUtcMillis()), Long.valueOf(getMostRecentReplacedCredentialUtcMillis()), getNetworkMetadata());
    }

    public void setMostRecentReplacedCredentialUtcMillis(long j) {
        this.mostRecentReplacedCredentialUtcMillis = j;
    }

    public void setMostRecentUpdatedCredentialUtcMillis(long j) {
        this.mostRecentUpdatedCredentialUtcMillis = j;
    }

    public void setNetworkMetadata(NetworkMetadata networkMetadata) {
        this.networkMetadata = networkMetadata;
    }

    public void setWifiCredentialCount(int i) {
        this.wifiCredentialCount = i;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withWifiCredentialCount(getWifiCredentialCount());
        builder.withMostRecentUpdatedCredentialUtcMillis(getMostRecentUpdatedCredentialUtcMillis());
        builder.withMostRecentReplacedCredentialUtcMillis(getMostRecentReplacedCredentialUtcMillis());
        builder.withNetworkMetadata(getNetworkMetadata());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GetUserMetadataResponse(wifiCredentialCount=");
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(", mostRecentUpdatedCredentialUtcMillis=", this.wifiCredentialCount, sb);
        sb.append(String.valueOf(this.mostRecentUpdatedCredentialUtcMillis));
        sb.append(", mostRecentReplacedCredentialUtcMillis=");
        sb.append(String.valueOf(this.mostRecentReplacedCredentialUtcMillis));
        sb.append(", networkMetadata=");
        sb.append(String.valueOf(this.networkMetadata));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }
}
