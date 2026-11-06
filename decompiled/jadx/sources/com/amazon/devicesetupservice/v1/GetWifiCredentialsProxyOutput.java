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
import com.amazon.devicesetup.common.v1.WifiCredentials;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@CoralSuppressWarnings
@Generated
@XmlName("GetWifiCredentialsProxyOutput")
@Documentation("Output Structure for the getWifiCredentialsProxy api.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class GetWifiCredentialsProxyOutput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.GetWifiCredentialsProxyOutput");
    private String endpointToUse;
    private List<WifiCredentials> wifiCredentialsList;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String endpointToUse;
        protected List<WifiCredentials> wifiCredentialsList;

        public GetWifiCredentialsProxyOutput build() {
            GetWifiCredentialsProxyOutput getWifiCredentialsProxyOutput = new GetWifiCredentialsProxyOutput();
            populate(getWifiCredentialsProxyOutput);
            return getWifiCredentialsProxyOutput;
        }

        public void populate(GetWifiCredentialsProxyOutput getWifiCredentialsProxyOutput) {
            getWifiCredentialsProxyOutput.setWifiCredentialsList(this.wifiCredentialsList);
            getWifiCredentialsProxyOutput.setEndpointToUse(this.endpointToUse);
        }

        public Builder withEndpointToUse(String str) {
            this.endpointToUse = str;
            return this;
        }

        public Builder withWifiCredentialsList(List<WifiCredentials> list) {
            this.wifiCredentialsList = list;
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
        if (!(obj instanceof GetWifiCredentialsProxyOutput)) {
            return false;
        }
        GetWifiCredentialsProxyOutput getWifiCredentialsProxyOutput = (GetWifiCredentialsProxyOutput) obj;
        return Objects.equals(getWifiCredentialsList(), getWifiCredentialsProxyOutput.getWifiCredentialsList()) && Objects.equals(getEndpointToUse(), getWifiCredentialsProxyOutput.getEndpointToUse());
    }

    @HttpHeader("x-amzn-endpoint")
    public String getEndpointToUse() {
        return this.endpointToUse;
    }

    @Documentation("Wi-Fi credentials list for \"get Wi-Fi credentials\" API.")
    public List<WifiCredentials> getWifiCredentialsList() {
        return this.wifiCredentialsList;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getWifiCredentialsList(), getEndpointToUse());
    }

    public void setEndpointToUse(String str) {
        this.endpointToUse = str;
    }

    public void setWifiCredentialsList(List<WifiCredentials> list) {
        this.wifiCredentialsList = list;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withWifiCredentialsList(getWifiCredentialsList());
        builder.withEndpointToUse(getEndpointToUse());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GetWifiCredentialsProxyOutput(wifiCredentialsList=");
        CredentialConfig$$ExternalSyntheticOutline0.m21225m(", endpointToUse=", (List) this.wifiCredentialsList, sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.endpointToUse, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
