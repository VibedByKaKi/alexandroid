package com.amazon.credentiallocker;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaConversationsPaginationContextBundleKeys;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.HttpLabel;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MaxValue;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.MinValue;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Sensitive;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialLockerBaseRequest;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.credentiallocker/")
@CoralSuppressWarnings
@Generated
@XmlName("GetThreadNetworksRequest")
@Documentation("Structure for GetThreadNetworksRequest")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class GetThreadNetworksRequest extends CredentialLockerBaseRequest {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.GetThreadNetworksRequest");
    private String extendedPanId;
    private Integer maxResults;
    private String networkName;
    private String nextToken;

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetThreadNetworksRequest)) {
            return false;
        }
        GetThreadNetworksRequest getThreadNetworksRequest = (GetThreadNetworksRequest) obj;
        return super.equals(obj) && Objects.equals(getNetworkName(), getThreadNetworksRequest.getNetworkName()) && Objects.equals(getExtendedPanId(), getThreadNetworksRequest.getExtendedPanId()) && Objects.equals(getMaxResults(), getThreadNetworksRequest.getMaxResults()) && Objects.equals(getNextToken(), getThreadNetworksRequest.getNextToken());
    }

    @HttpLabel("extendedPanId")
    @MaxLength(16)
    @Required
    @Sensitive
    @MinLength(16)
    public String getExtendedPanId() {
        return this.extendedPanId;
    }

    @HttpLabel("maxResults")
    @MaxValue("1000")
    @MinValue("1")
    public Integer getMaxResults() {
        return this.maxResults;
    }

    @HttpLabel("networkName")
    @Sensitive
    public String getNetworkName() {
        return this.networkName;
    }

    @HttpLabel(AlexaConversationsPaginationContextBundleKeys.NEXT_TOKEN)
    public String getNextToken() {
        return this.nextToken;
    }

    @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getNetworkName(), getExtendedPanId(), getMaxResults(), getNextToken());
    }

    public void setExtendedPanId(String str) {
        this.extendedPanId = str;
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setNetworkName(String str) {
        this.networkName = str;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withClientName(getClientName());
        builder.withClientVersion(getClientVersion());
        builder.withClientProduct(getClientProduct());
        builder.withClientModel(getClientModel());
        builder.withClientManufacturer(getClientManufacturer());
        builder.withClientOs(getClientOs());
        builder.withClientOsVersion(getClientOsVersion());
        builder.withDeviceName(getDeviceName());
        builder.withDeviceVersion(getDeviceVersion());
        builder.withDeviceManufacturer(getDeviceManufacturer());
        builder.withNetworkName(getNetworkName());
        builder.withExtendedPanId(getExtendedPanId());
        builder.withMaxResults(getMaxResults());
        builder.withNextToken(getNextToken());
        return builder;
    }

    @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest
    public String toString() {
        StringBuilder sb = new StringBuilder("GetThreadNetworksRequest(super=");
        sb.append(super.toString());
        sb.append(", , , , networkName=*** REDACTED ***, extendedPanId=*** REDACTED ***, maxResults=");
        sb.append(String.valueOf(this.maxResults));
        sb.append(", nextToken=");
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.nextToken, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends CredentialLockerBaseRequest.Builder {
        protected String extendedPanId;
        protected Integer maxResults;
        protected String networkName;
        protected String nextToken;

        public GetThreadNetworksRequest build() {
            GetThreadNetworksRequest getThreadNetworksRequest = new GetThreadNetworksRequest();
            populate(getThreadNetworksRequest);
            return getThreadNetworksRequest;
        }

        public void populate(GetThreadNetworksRequest getThreadNetworksRequest) {
            super.populate((CredentialLockerBaseRequest) getThreadNetworksRequest);
            getThreadNetworksRequest.setNetworkName(this.networkName);
            getThreadNetworksRequest.setExtendedPanId(this.extendedPanId);
            getThreadNetworksRequest.setMaxResults(this.maxResults);
            getThreadNetworksRequest.setNextToken(this.nextToken);
        }

        public Builder withExtendedPanId(String str) {
            this.extendedPanId = str;
            return this;
        }

        public Builder withMaxResults(Integer num) {
            this.maxResults = num;
            return this;
        }

        public Builder withNetworkName(String str) {
            this.networkName = str;
            return this;
        }

        public Builder withNextToken(String str) {
            this.nextToken = str;
            return this;
        }

        @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest.Builder
        public Builder withClientManufacturer(String str) {
            super.withClientManufacturer(str);
            return this;
        }

        @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest.Builder
        public Builder withClientModel(String str) {
            super.withClientModel(str);
            return this;
        }

        @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest.Builder
        public Builder withClientName(String str) {
            super.withClientName(str);
            return this;
        }

        @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest.Builder
        public Builder withClientOs(String str) {
            super.withClientOs(str);
            return this;
        }

        @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest.Builder
        public Builder withClientOsVersion(String str) {
            super.withClientOsVersion(str);
            return this;
        }

        @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest.Builder
        public Builder withClientProduct(String str) {
            super.withClientProduct(str);
            return this;
        }

        @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest.Builder
        public Builder withClientVersion(String str) {
            super.withClientVersion(str);
            return this;
        }

        @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest.Builder
        public Builder withDeviceManufacturer(String str) {
            super.withDeviceManufacturer(str);
            return this;
        }

        @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest.Builder
        public Builder withDeviceName(String str) {
            super.withDeviceName(str);
            return this;
        }

        @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest.Builder
        public Builder withDeviceVersion(String str) {
            super.withDeviceVersion(str);
            return this;
        }
    }
}
