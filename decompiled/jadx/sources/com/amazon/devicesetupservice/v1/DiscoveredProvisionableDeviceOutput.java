package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.HttpHeader;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
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
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("DiscoveredProvisionableDeviceOutput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class DiscoveredProvisionableDeviceOutput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.DiscoveredProvisionableDeviceOutput");
    private boolean canProceed;
    private String endpointToUse;
    private String provisionableReportUrl;
    private String provisionerReportUrl;
    private long waitTime;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected boolean canProceed;
        protected String endpointToUse;
        protected String provisionableReportUrl;
        protected String provisionerReportUrl;
        protected long waitTime;

        public DiscoveredProvisionableDeviceOutput build() {
            DiscoveredProvisionableDeviceOutput discoveredProvisionableDeviceOutput = new DiscoveredProvisionableDeviceOutput();
            populate(discoveredProvisionableDeviceOutput);
            return discoveredProvisionableDeviceOutput;
        }

        public void populate(DiscoveredProvisionableDeviceOutput discoveredProvisionableDeviceOutput) {
            discoveredProvisionableDeviceOutput.setCanProceed(this.canProceed);
            discoveredProvisionableDeviceOutput.setWaitTime(this.waitTime);
            discoveredProvisionableDeviceOutput.setProvisionerReportUrl(this.provisionerReportUrl);
            discoveredProvisionableDeviceOutput.setProvisionableReportUrl(this.provisionableReportUrl);
            discoveredProvisionableDeviceOutput.setEndpointToUse(this.endpointToUse);
        }

        public Builder withCanProceed(boolean z) {
            this.canProceed = z;
            return this;
        }

        public Builder withEndpointToUse(String str) {
            this.endpointToUse = str;
            return this;
        }

        public Builder withProvisionableReportUrl(String str) {
            this.provisionableReportUrl = str;
            return this;
        }

        public Builder withProvisionerReportUrl(String str) {
            this.provisionerReportUrl = str;
            return this;
        }

        public Builder withWaitTime(long j) {
            this.waitTime = j;
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
        if (!(obj instanceof DiscoveredProvisionableDeviceOutput)) {
            return false;
        }
        DiscoveredProvisionableDeviceOutput discoveredProvisionableDeviceOutput = (DiscoveredProvisionableDeviceOutput) obj;
        return Boolean.valueOf(isCanProceed()).equals(Boolean.valueOf(discoveredProvisionableDeviceOutput.isCanProceed())) && Long.valueOf(getWaitTime()).equals(Long.valueOf(discoveredProvisionableDeviceOutput.getWaitTime())) && Objects.equals(getProvisionerReportUrl(), discoveredProvisionableDeviceOutput.getProvisionerReportUrl()) && Objects.equals(getProvisionableReportUrl(), discoveredProvisionableDeviceOutput.getProvisionableReportUrl()) && Objects.equals(getEndpointToUse(), discoveredProvisionableDeviceOutput.getEndpointToUse());
    }

    @HttpHeader("x-amzn-endpoint")
    public String getEndpointToUse() {
        return this.endpointToUse;
    }

    @MaxLength(150)
    @MinLength(1)
    public String getProvisionableReportUrl() {
        return this.provisionableReportUrl;
    }

    @MaxLength(150)
    @MinLength(1)
    public String getProvisionerReportUrl() {
        return this.provisionerReportUrl;
    }

    public long getWaitTime() {
        return this.waitTime;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), Boolean.valueOf(isCanProceed()), Long.valueOf(getWaitTime()), getProvisionerReportUrl(), getProvisionableReportUrl(), getEndpointToUse());
    }

    public boolean isCanProceed() {
        return this.canProceed;
    }

    public void setCanProceed(boolean z) {
        this.canProceed = z;
    }

    public void setEndpointToUse(String str) {
        this.endpointToUse = str;
    }

    public void setProvisionableReportUrl(String str) {
        this.provisionableReportUrl = str;
    }

    public void setProvisionerReportUrl(String str) {
        this.provisionerReportUrl = str;
    }

    public void setWaitTime(long j) {
        this.waitTime = j;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withCanProceed(isCanProceed());
        builder.withWaitTime(getWaitTime());
        builder.withProvisionerReportUrl(getProvisionerReportUrl());
        builder.withProvisionableReportUrl(getProvisionableReportUrl());
        builder.withEndpointToUse(getEndpointToUse());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DiscoveredProvisionableDeviceOutput(canProceed=");
        sb.append(String.valueOf(this.canProceed));
        sb.append(", waitTime=");
        sb.append(String.valueOf(this.waitTime));
        sb.append(", provisionerReportUrl=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.provisionerReportUrl, ", provisionableReportUrl=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.provisionableReportUrl, ", endpointToUse=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.endpointToUse, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
