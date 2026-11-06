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
@XmlName("WifiNetworkResource")
@Documentation("Wifi configs for a specific resource key")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class WifiNetworkResource {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.WifiNetworkResource");
    private UserResourceKey userResourceKey;
    private List<WifiConfiguration> wifiConfigurations;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected UserResourceKey userResourceKey;
        protected List<WifiConfiguration> wifiConfigurations;

        public WifiNetworkResource build() {
            WifiNetworkResource wifiNetworkResource = new WifiNetworkResource();
            populate(wifiNetworkResource);
            return wifiNetworkResource;
        }

        public void populate(WifiNetworkResource wifiNetworkResource) {
            wifiNetworkResource.setUserResourceKey(this.userResourceKey);
            wifiNetworkResource.setWifiConfigurations(this.wifiConfigurations);
        }

        public Builder withUserResourceKey(UserResourceKey userResourceKey) {
            this.userResourceKey = userResourceKey;
            return this;
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
        if (!(obj instanceof WifiNetworkResource)) {
            return false;
        }
        WifiNetworkResource wifiNetworkResource = (WifiNetworkResource) obj;
        return Objects.equals(getUserResourceKey(), wifiNetworkResource.getUserResourceKey()) && Objects.equals(getWifiConfigurations(), wifiNetworkResource.getWifiConfigurations());
    }

    @Required
    @Documentation("This structure represents a user identity and additional attributes that defines ownership\n        and scope of a resource")
    public UserResourceKey getUserResourceKey() {
        return this.userResourceKey;
    }

    @Required
    public List<WifiConfiguration> getWifiConfigurations() {
        return this.wifiConfigurations;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getUserResourceKey(), getWifiConfigurations());
    }

    public void setUserResourceKey(UserResourceKey userResourceKey) {
        this.userResourceKey = userResourceKey;
    }

    public void setWifiConfigurations(List<WifiConfiguration> list) {
        this.wifiConfigurations = list;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withUserResourceKey(getUserResourceKey());
        builder.withWifiConfigurations(getWifiConfigurations());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WifiNetworkResource(userResourceKey=");
        sb.append(String.valueOf(this.userResourceKey));
        sb.append(", wifiConfigurations=");
        return CredentialConfig$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, (List) this.wifiConfigurations, sb);
    }
}
