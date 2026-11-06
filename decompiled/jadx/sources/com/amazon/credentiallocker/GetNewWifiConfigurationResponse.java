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
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.credentiallocker/")
@CoralSuppressWarnings
@Generated
@XmlName("GetNewWifiConfigurationResponse")
@Documentation("Structure of GetNewWifiConfigurationResponse")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class GetNewWifiConfigurationResponse {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.GetNewWifiConfigurationResponse");
    private WifiConfiguration wifiConfiguration;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected WifiConfiguration wifiConfiguration;

        public GetNewWifiConfigurationResponse build() {
            GetNewWifiConfigurationResponse getNewWifiConfigurationResponse = new GetNewWifiConfigurationResponse();
            populate(getNewWifiConfigurationResponse);
            return getNewWifiConfigurationResponse;
        }

        public void populate(GetNewWifiConfigurationResponse getNewWifiConfigurationResponse) {
            getNewWifiConfigurationResponse.setWifiConfiguration(this.wifiConfiguration);
        }

        public Builder withWifiConfiguration(WifiConfiguration wifiConfiguration) {
            this.wifiConfiguration = wifiConfiguration;
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
        if (obj instanceof GetNewWifiConfigurationResponse) {
            return Objects.equals(getWifiConfiguration(), ((GetNewWifiConfigurationResponse) obj).getWifiConfiguration());
        }
        return false;
    }

    @Required
    @Documentation("This represents wifi configuration with all properties including privatesharedkey and wepkeylist\n        and extends from WifiNetworkInfo")
    public WifiConfiguration getWifiConfiguration() {
        return this.wifiConfiguration;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getWifiConfiguration());
    }

    public void setWifiConfiguration(WifiConfiguration wifiConfiguration) {
        this.wifiConfiguration = wifiConfiguration;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withWifiConfiguration(getWifiConfiguration());
        return builder;
    }

    public String toString() {
        return "GetNewWifiConfigurationResponse(wifiConfiguration=" + String.valueOf(this.wifiConfiguration) + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
