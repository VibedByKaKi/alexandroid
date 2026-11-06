package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.HttpHeader;
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
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@CoralSuppressWarnings
@Generated
@XmlName("SaveWifiNetworkOutput")
@Documentation("Output structure for the \"save Wi-Fi credentials\" API.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class SaveWifiNetworkOutput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.SaveWifiNetworkOutput");
    private String endpointToUse;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String endpointToUse;

        public SaveWifiNetworkOutput build() {
            SaveWifiNetworkOutput saveWifiNetworkOutput = new SaveWifiNetworkOutput();
            populate(saveWifiNetworkOutput);
            return saveWifiNetworkOutput;
        }

        public void populate(SaveWifiNetworkOutput saveWifiNetworkOutput) {
            saveWifiNetworkOutput.setEndpointToUse(this.endpointToUse);
        }

        public Builder withEndpointToUse(String str) {
            this.endpointToUse = str;
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
        if (obj instanceof SaveWifiNetworkOutput) {
            return Objects.equals(getEndpointToUse(), ((SaveWifiNetworkOutput) obj).getEndpointToUse());
        }
        return false;
    }

    @HttpHeader("x-amzn-endpoint")
    public String getEndpointToUse() {
        return this.endpointToUse;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getEndpointToUse());
    }

    public void setEndpointToUse(String str) {
        this.endpointToUse = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withEndpointToUse(getEndpointToUse());
        return builder;
    }

    public String toString() {
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.endpointToUse, MarkdownConstants.RIGHT_PARENTHESIS, new StringBuilder("SaveWifiNetworkOutput(endpointToUse="));
    }
}
