package com.amazon.credentiallocker;

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
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.credentiallocker/")
@CoralSuppressWarnings
@Generated
@XmlName("GetWifiConfigurationsResponse")
@Documentation("Structure of GetWifiConfigurationsResponse")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class GetWifiConfigurationsResponse {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.GetWifiConfigurationsResponse");
    private List<WifiConfiguration> wifiConfigurations;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected List<WifiConfiguration> wifiConfigurations;

        public GetWifiConfigurationsResponse build() {
            GetWifiConfigurationsResponse getWifiConfigurationsResponse = new GetWifiConfigurationsResponse();
            populate(getWifiConfigurationsResponse);
            return getWifiConfigurationsResponse;
        }

        public void populate(GetWifiConfigurationsResponse getWifiConfigurationsResponse) {
            getWifiConfigurationsResponse.setWifiConfigurations(this.wifiConfigurations);
        }

        public Builder withWifiConfigurations(List<WifiConfiguration> list) {
            this.wifiConfigurations = list;
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
        if (obj instanceof GetWifiConfigurationsResponse) {
            return Objects.equals(getWifiConfigurations(), ((GetWifiConfigurationsResponse) obj).getWifiConfigurations());
        }
        return false;
    }

    @Required
    public List<WifiConfiguration> getWifiConfigurations() {
        return this.wifiConfigurations;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getWifiConfigurations());
    }

    public void setWifiConfigurations(List<WifiConfiguration> list) {
        this.wifiConfigurations = list;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withWifiConfigurations(getWifiConfigurations());
        return builder;
    }

    public String toString() {
        return CredentialConfig$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, (List) this.wifiConfigurations, new StringBuilder("GetWifiConfigurationsResponse(wifiConfigurations="));
    }
}
