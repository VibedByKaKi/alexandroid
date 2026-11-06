package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.HttpHeader;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.devicesetupservice.DiscoveryOutputParameters;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("DiscoveredProvisioneeOutput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class DiscoveredProvisioneeOutput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.DiscoveredProvisioneeOutput");
    private boolean canProceed;
    private DiscoveryOutputParameters discoveryOutputParameters;
    private String endpointToUse;
    private String provisioneeReportUrl;
    private String provisionerReportUrl;
    private String waitTime;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected boolean canProceed;
        protected DiscoveryOutputParameters discoveryOutputParameters;
        protected String endpointToUse;
        protected String provisioneeReportUrl;
        protected String provisionerReportUrl;
        protected String waitTime;

        public DiscoveredProvisioneeOutput build() {
            DiscoveredProvisioneeOutput discoveredProvisioneeOutput = new DiscoveredProvisioneeOutput();
            populate(discoveredProvisioneeOutput);
            return discoveredProvisioneeOutput;
        }

        public void populate(DiscoveredProvisioneeOutput discoveredProvisioneeOutput) {
            discoveredProvisioneeOutput.setCanProceed(this.canProceed);
            discoveredProvisioneeOutput.setWaitTime(this.waitTime);
            discoveredProvisioneeOutput.setDiscoveryOutputParameters(this.discoveryOutputParameters);
            discoveredProvisioneeOutput.setProvisionerReportUrl(this.provisionerReportUrl);
            discoveredProvisioneeOutput.setProvisioneeReportUrl(this.provisioneeReportUrl);
            discoveredProvisioneeOutput.setEndpointToUse(this.endpointToUse);
        }

        public Builder withCanProceed(boolean z) {
            this.canProceed = z;
            return this;
        }

        public Builder withDiscoveryOutputParameters(DiscoveryOutputParameters discoveryOutputParameters) {
            this.discoveryOutputParameters = discoveryOutputParameters;
            return this;
        }

        public Builder withEndpointToUse(String str) {
            this.endpointToUse = str;
            return this;
        }

        public Builder withProvisioneeReportUrl(String str) {
            this.provisioneeReportUrl = str;
            return this;
        }

        public Builder withProvisionerReportUrl(String str) {
            this.provisionerReportUrl = str;
            return this;
        }

        public Builder withWaitTime(String str) {
            this.waitTime = str;
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
        if (!(obj instanceof DiscoveredProvisioneeOutput)) {
            return false;
        }
        DiscoveredProvisioneeOutput discoveredProvisioneeOutput = (DiscoveredProvisioneeOutput) obj;
        return Boolean.valueOf(isCanProceed()).equals(Boolean.valueOf(discoveredProvisioneeOutput.isCanProceed())) && Objects.equals(getWaitTime(), discoveredProvisioneeOutput.getWaitTime()) && Objects.equals(getDiscoveryOutputParameters(), discoveredProvisioneeOutput.getDiscoveryOutputParameters()) && Objects.equals(getProvisionerReportUrl(), discoveredProvisioneeOutput.getProvisionerReportUrl()) && Objects.equals(getProvisioneeReportUrl(), discoveredProvisioneeOutput.getProvisioneeReportUrl()) && Objects.equals(getEndpointToUse(), discoveredProvisioneeOutput.getEndpointToUse());
    }

    @Documentation("This is the base structure for the types of workflows and their output settings that we can have in FFS.")
    public DiscoveryOutputParameters getDiscoveryOutputParameters() {
        return this.discoveryOutputParameters;
    }

    @HttpHeader("x-amzn-endpoint")
    public String getEndpointToUse() {
        return this.endpointToUse;
    }

    @MaxLength(150)
    @MinLength(1)
    public String getProvisioneeReportUrl() {
        return this.provisioneeReportUrl;
    }

    @MaxLength(150)
    @MinLength(1)
    public String getProvisionerReportUrl() {
        return this.provisionerReportUrl;
    }

    @Documentation("Durations define the amount of intervening time in a time interval.\n        refer https://en.wikipedia.org/wiki/ISO_8601#Durations for further details.")
    public String getWaitTime() {
        return this.waitTime;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), Boolean.valueOf(isCanProceed()), getWaitTime(), getDiscoveryOutputParameters(), getProvisionerReportUrl(), getProvisioneeReportUrl(), getEndpointToUse());
    }

    @Required
    public boolean isCanProceed() {
        return this.canProceed;
    }

    public void setCanProceed(boolean z) {
        this.canProceed = z;
    }

    public void setDiscoveryOutputParameters(DiscoveryOutputParameters discoveryOutputParameters) {
        this.discoveryOutputParameters = discoveryOutputParameters;
    }

    public void setEndpointToUse(String str) {
        this.endpointToUse = str;
    }

    public void setProvisioneeReportUrl(String str) {
        this.provisioneeReportUrl = str;
    }

    public void setProvisionerReportUrl(String str) {
        this.provisionerReportUrl = str;
    }

    public void setWaitTime(String str) {
        this.waitTime = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withCanProceed(isCanProceed());
        builder.withWaitTime(getWaitTime());
        builder.withDiscoveryOutputParameters(getDiscoveryOutputParameters());
        builder.withProvisionerReportUrl(getProvisionerReportUrl());
        builder.withProvisioneeReportUrl(getProvisioneeReportUrl());
        builder.withEndpointToUse(getEndpointToUse());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DiscoveredProvisioneeOutput(canProceed=");
        sb.append(String.valueOf(this.canProceed));
        sb.append(", waitTime=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.waitTime, ", discoveryOutputParameters=", sb);
        sb.append(String.valueOf(this.discoveryOutputParameters));
        sb.append(", provisionerReportUrl=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.provisionerReportUrl, ", provisioneeReportUrl=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.provisioneeReportUrl, ", endpointToUse=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.endpointToUse, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
