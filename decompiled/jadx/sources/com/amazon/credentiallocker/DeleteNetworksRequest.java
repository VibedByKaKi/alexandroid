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
import com.amazon.credentiallocker.CredentialLockerBaseRequest;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.credentiallocker/")
@CoralSuppressWarnings
@Generated
@XmlName("DeleteNetworksRequest")
@Documentation("Structure of DeleteNetworksRequest")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class DeleteNetworksRequest extends CredentialLockerBaseRequest {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.DeleteNetworksRequest");
    private String networkTypeFilter;

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
        if (obj instanceof DeleteNetworksRequest) {
            return super.equals(obj) && Objects.equals(getNetworkTypeFilter(), ((DeleteNetworksRequest) obj).getNetworkTypeFilter());
        }
        return false;
    }

    @EnumValues({"Wifi", "Thread"})
    public String getNetworkTypeFilter() {
        return this.networkTypeFilter;
    }

    @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getNetworkTypeFilter());
    }

    public void setNetworkTypeFilter(String str) {
        this.networkTypeFilter = str;
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
        builder.withNetworkTypeFilter(getNetworkTypeFilter());
        return builder;
    }

    @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest
    public String toString() {
        StringBuilder sb = new StringBuilder("DeleteNetworksRequest(super=");
        sb.append(super.toString());
        sb.append(", networkTypeFilter=");
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.networkTypeFilter, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends CredentialLockerBaseRequest.Builder {
        protected String networkTypeFilter;

        public DeleteNetworksRequest build() {
            DeleteNetworksRequest deleteNetworksRequest = new DeleteNetworksRequest();
            populate(deleteNetworksRequest);
            return deleteNetworksRequest;
        }

        public void populate(DeleteNetworksRequest deleteNetworksRequest) {
            super.populate((CredentialLockerBaseRequest) deleteNetworksRequest);
            deleteNetworksRequest.setNetworkTypeFilter(this.networkTypeFilter);
        }

        public Builder withNetworkTypeFilter(String str) {
            this.networkTypeFilter = str;
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
