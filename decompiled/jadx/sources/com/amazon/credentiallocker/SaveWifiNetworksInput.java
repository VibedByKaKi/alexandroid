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
@XmlName("SaveWifiNetworksInput")
@Documentation("Input for SaveWifiNetworks operation")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class SaveWifiNetworksInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.SaveWifiNetworksInput");
    private WifiNetworkResource wifiNetworkResource;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected WifiNetworkResource wifiNetworkResource;

        public SaveWifiNetworksInput build() {
            SaveWifiNetworksInput saveWifiNetworksInput = new SaveWifiNetworksInput();
            populate(saveWifiNetworksInput);
            return saveWifiNetworksInput;
        }

        public void populate(SaveWifiNetworksInput saveWifiNetworksInput) {
            saveWifiNetworksInput.setWifiNetworkResource(this.wifiNetworkResource);
        }

        public Builder withWifiNetworkResource(WifiNetworkResource wifiNetworkResource) {
            this.wifiNetworkResource = wifiNetworkResource;
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
        if (obj instanceof SaveWifiNetworksInput) {
            return Objects.equals(getWifiNetworkResource(), ((SaveWifiNetworksInput) obj).getWifiNetworkResource());
        }
        return false;
    }

    @Required
    @Documentation("Wifi configs for a specific resource key")
    public WifiNetworkResource getWifiNetworkResource() {
        return this.wifiNetworkResource;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getWifiNetworkResource());
    }

    public void setWifiNetworkResource(WifiNetworkResource wifiNetworkResource) {
        this.wifiNetworkResource = wifiNetworkResource;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withWifiNetworkResource(getWifiNetworkResource());
        return builder;
    }

    public String toString() {
        return "SaveWifiNetworksInput(wifiNetworkResource=" + String.valueOf(this.wifiNetworkResource) + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
