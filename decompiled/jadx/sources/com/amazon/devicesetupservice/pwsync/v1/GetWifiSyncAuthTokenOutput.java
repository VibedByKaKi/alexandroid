package com.amazon.devicesetupservice.pwsync.v1;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.HttpHeader;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.Sensitive;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.pwsync.v1/")
@Generated
@XmlName("GetWifiSyncAuthTokenOutput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class GetWifiSyncAuthTokenOutput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.pwsync.v1.GetWifiSyncAuthTokenOutput");
    private String endpointToUse;
    private String wifiSyncAuthToken;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String endpointToUse;
        protected String wifiSyncAuthToken;

        public GetWifiSyncAuthTokenOutput build() {
            GetWifiSyncAuthTokenOutput getWifiSyncAuthTokenOutput = new GetWifiSyncAuthTokenOutput();
            populate(getWifiSyncAuthTokenOutput);
            return getWifiSyncAuthTokenOutput;
        }

        public void populate(GetWifiSyncAuthTokenOutput getWifiSyncAuthTokenOutput) {
            getWifiSyncAuthTokenOutput.setEndpointToUse(this.endpointToUse);
            getWifiSyncAuthTokenOutput.setWifiSyncAuthToken(this.wifiSyncAuthToken);
        }

        public Builder withEndpointToUse(String str) {
            this.endpointToUse = str;
            return this;
        }

        public Builder withWifiSyncAuthToken(String str) {
            this.wifiSyncAuthToken = str;
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
        if (!(obj instanceof GetWifiSyncAuthTokenOutput)) {
            return false;
        }
        GetWifiSyncAuthTokenOutput getWifiSyncAuthTokenOutput = (GetWifiSyncAuthTokenOutput) obj;
        return Objects.equals(getEndpointToUse(), getWifiSyncAuthTokenOutput.getEndpointToUse()) && Objects.equals(getWifiSyncAuthToken(), getWifiSyncAuthTokenOutput.getWifiSyncAuthToken());
    }

    @HttpHeader("x-amzn-endpoint")
    public String getEndpointToUse() {
        return this.endpointToUse;
    }

    @MaxLength(255)
    @Sensitive
    @MinLength(1)
    @Documentation("Unique token that will serve as a secret to be stored on a provisionee device and in WNKS.\n        It will be in the form of an amazon common identifier.\n        e.g: amzn1.ffs.wifi-sync-auth-token.some-uuid")
    public String getWifiSyncAuthToken() {
        return this.wifiSyncAuthToken;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getEndpointToUse(), getWifiSyncAuthToken());
    }

    public void setEndpointToUse(String str) {
        this.endpointToUse = str;
    }

    public void setWifiSyncAuthToken(String str) {
        this.wifiSyncAuthToken = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withEndpointToUse(getEndpointToUse());
        builder.withWifiSyncAuthToken(getWifiSyncAuthToken());
        return builder;
    }

    public String toString() {
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.endpointToUse, ", wifiSyncAuthToken=*** REDACTED ***)", new StringBuilder("GetWifiSyncAuthTokenOutput(endpointToUse="));
    }
}
