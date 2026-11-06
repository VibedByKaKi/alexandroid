package com.amazon.alexa.matter.client.credentiallockerservice.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class GetMatchingNetworksRequest {
    private final String deviceId;
    private final String deviceType;
    private final List<NetworkScanResult> networkScanList;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class GetMatchingNetworksRequestBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String deviceId;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String deviceType;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private List<NetworkScanResult> networkScanList;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public GetMatchingNetworksRequestBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public GetMatchingNetworksRequest build() {
            return new GetMatchingNetworksRequest(this.networkScanList, this.deviceType, this.deviceId);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public GetMatchingNetworksRequestBuilder deviceId(String str) {
            this.deviceId = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public GetMatchingNetworksRequestBuilder deviceType(String str) {
            this.deviceType = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public GetMatchingNetworksRequestBuilder networkScanList(List<NetworkScanResult> list) {
            this.networkScanList = list;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("GetMatchingNetworksRequest.GetMatchingNetworksRequestBuilder(networkScanList=");
            sb.append(this.networkScanList);
            sb.append(", deviceType=");
            sb.append(this.deviceType);
            sb.append(", deviceId=");
            return a$$ExternalSyntheticOutline0.m(sb, this.deviceId, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private GetMatchingNetworksRequest() {
        this.networkScanList = null;
        this.deviceType = null;
        this.deviceId = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static GetMatchingNetworksRequestBuilder builder() {
        return new GetMatchingNetworksRequestBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetMatchingNetworksRequest)) {
            return false;
        }
        GetMatchingNetworksRequest getMatchingNetworksRequest = (GetMatchingNetworksRequest) obj;
        List<NetworkScanResult> networkScanList = getNetworkScanList();
        List<NetworkScanResult> networkScanList2 = getMatchingNetworksRequest.getNetworkScanList();
        if (networkScanList != null ? !networkScanList.equals(networkScanList2) : networkScanList2 != null) {
            return false;
        }
        String deviceType = getDeviceType();
        String deviceType2 = getMatchingNetworksRequest.getDeviceType();
        if (deviceType != null ? !deviceType.equals(deviceType2) : deviceType2 != null) {
            return false;
        }
        String deviceId = getDeviceId();
        String deviceId2 = getMatchingNetworksRequest.getDeviceId();
        return deviceId != null ? deviceId.equals(deviceId2) : deviceId2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getDeviceId() {
        return this.deviceId;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getDeviceType() {
        return this.deviceType;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public List<NetworkScanResult> getNetworkScanList() {
        return this.networkScanList;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        List<NetworkScanResult> networkScanList = getNetworkScanList();
        int hashCode = networkScanList == null ? 43 : networkScanList.hashCode();
        String deviceType = getDeviceType();
        int i = (hashCode + 59) * 59;
        int hashCode2 = deviceType == null ? 43 : deviceType.hashCode();
        String deviceId = getDeviceId();
        return ((i + hashCode2) * 59) + (deviceId != null ? deviceId.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "GetMatchingNetworksRequest(networkScanList=" + getNetworkScanList() + ", deviceType=" + getDeviceType() + ", deviceId=" + getDeviceId() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public GetMatchingNetworksRequest withDeviceId(String str) {
        return this.deviceId == str ? this : new GetMatchingNetworksRequest(this.networkScanList, this.deviceType, str);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public GetMatchingNetworksRequest withDeviceType(String str) {
        return this.deviceType == str ? this : new GetMatchingNetworksRequest(this.networkScanList, str, this.deviceId);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public GetMatchingNetworksRequest withNetworkScanList(List<NetworkScanResult> list) {
        return this.networkScanList == list ? this : new GetMatchingNetworksRequest(list, this.deviceType, this.deviceId);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public GetMatchingNetworksRequest(List<NetworkScanResult> list, String str, String str2) {
        this.networkScanList = list;
        this.deviceType = str;
        this.deviceId = str2;
    }
}
