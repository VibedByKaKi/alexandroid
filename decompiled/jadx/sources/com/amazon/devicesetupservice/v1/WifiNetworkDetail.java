package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.devicesetup.common.v1.WifiCredentials;
import com.amazon.devicesetup.common.v1.WifiScanData;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@CoralSuppressWarnings
@Generated
@XmlName("WifiNetworkDetail")
@Documentation("A structure to hold both wifi scan data and wifi credential.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class WifiNetworkDetail {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.WifiNetworkDetail");
    private WifiCredentials credential;
    private Boolean preferredNetwork;
    private WifiScanData scanData;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected WifiCredentials credential;
        protected Boolean preferredNetwork;
        protected WifiScanData scanData;

        public WifiNetworkDetail build() {
            WifiNetworkDetail wifiNetworkDetail = new WifiNetworkDetail();
            populate(wifiNetworkDetail);
            return wifiNetworkDetail;
        }

        public void populate(WifiNetworkDetail wifiNetworkDetail) {
            wifiNetworkDetail.setCredential(this.credential);
            wifiNetworkDetail.setScanData(this.scanData);
            wifiNetworkDetail.setPreferredNetwork(this.preferredNetwork);
        }

        public Builder withCredential(WifiCredentials wifiCredentials) {
            this.credential = wifiCredentials;
            return this;
        }

        public Builder withPreferredNetwork(Boolean bool) {
            this.preferredNetwork = bool;
            return this;
        }

        public Builder withScanData(WifiScanData wifiScanData) {
            this.scanData = wifiScanData;
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
        if (!(obj instanceof WifiNetworkDetail)) {
            return false;
        }
        WifiNetworkDetail wifiNetworkDetail = (WifiNetworkDetail) obj;
        return Objects.equals(getCredential(), wifiNetworkDetail.getCredential()) && Objects.equals(getScanData(), wifiNetworkDetail.getScanData()) && Objects.equals(isPreferredNetwork(), wifiNetworkDetail.isPreferredNetwork());
    }

    @Documentation("Wi-Fi credentials data structure for \"get Wi-Fi credentials\" API.")
    public WifiCredentials getCredential() {
        return this.credential;
    }

    @Documentation("Wi-Fi scan data structure for \"get Wi-Fi credentials\" API.")
    public WifiScanData getScanData() {
        return this.scanData;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getCredential(), getScanData(), isPreferredNetwork());
    }

    public Boolean isPreferredNetwork() {
        return this.preferredNetwork;
    }

    public void setCredential(WifiCredentials wifiCredentials) {
        this.credential = wifiCredentials;
    }

    public void setPreferredNetwork(Boolean bool) {
        this.preferredNetwork = bool;
    }

    public void setScanData(WifiScanData wifiScanData) {
        this.scanData = wifiScanData;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withCredential(getCredential());
        builder.withScanData(getScanData());
        builder.withPreferredNetwork(isPreferredNetwork());
        return builder;
    }

    public String toString() {
        return "WifiNetworkDetail(credential=" + String.valueOf(this.credential) + ", scanData=" + String.valueOf(this.scanData) + ", preferredNetwork=" + String.valueOf(this.preferredNetwork) + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
