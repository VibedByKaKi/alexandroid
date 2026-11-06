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
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.devicesetup.common.v1.WifiScanData;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@CoralSuppressWarnings
@Generated
@XmlName("GetWifiCredentialsProxyInput")
@Documentation("Input structure for the getWifiCredentialsProxy API")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class GetWifiCredentialsProxyInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.GetWifiCredentialsProxyInput");
    private List<WifiScanData> wifiScanDataList;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected List<WifiScanData> wifiScanDataList;

        public GetWifiCredentialsProxyInput build() {
            GetWifiCredentialsProxyInput getWifiCredentialsProxyInput = new GetWifiCredentialsProxyInput();
            populate(getWifiCredentialsProxyInput);
            return getWifiCredentialsProxyInput;
        }

        public void populate(GetWifiCredentialsProxyInput getWifiCredentialsProxyInput) {
            getWifiCredentialsProxyInput.setWifiScanDataList(this.wifiScanDataList);
        }

        public Builder withWifiScanDataList(List<WifiScanData> list) {
            this.wifiScanDataList = list;
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
        if (obj instanceof GetWifiCredentialsProxyInput) {
            return Objects.equals(getWifiScanDataList(), ((GetWifiCredentialsProxyInput) obj).getWifiScanDataList());
        }
        return false;
    }

    @Documentation("Wi-Fi scan data list for \"get Wi-Fi credentials\" API.")
    public List<WifiScanData> getWifiScanDataList() {
        return this.wifiScanDataList;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getWifiScanDataList());
    }

    public void setWifiScanDataList(List<WifiScanData> list) {
        this.wifiScanDataList = list;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withWifiScanDataList(getWifiScanDataList());
        return builder;
    }

    public String toString() {
        return CredentialConfig$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, (List) this.wifiScanDataList, new StringBuilder("GetWifiCredentialsProxyInput(wifiScanDataList="));
    }
}
