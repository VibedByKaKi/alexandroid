package com.amazon.whisperjoin.devicesetupserviceandroidclient.data;

import com.amazon.tarazed.metrics.BizMetricsConstants;
import com.amazon.whisperjoin.deviceprovisioningservice.arcus.data.ArcusConstants;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class FFSAllowListPolicyRequest {
    private String application;
    private String applicationVersion;
    private String customerId;
    private String deviceModel;
    private String firmwareVersion;
    private String manufacturer;
    private String marketplace;
    private String platform;

    public FFSAllowListPolicyRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.deviceModel = str;
        this.manufacturer = str2;
        this.platform = str3;
        this.firmwareVersion = str4;
        this.application = str5;
        this.applicationVersion = str6;
        this.marketplace = str7;
        this.customerId = str8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            FFSAllowListPolicyRequest fFSAllowListPolicyRequest = (FFSAllowListPolicyRequest) obj;
            if (Objects.equal(this.deviceModel, fFSAllowListPolicyRequest.deviceModel) && Objects.equal(this.manufacturer, fFSAllowListPolicyRequest.manufacturer) && Objects.equal(this.firmwareVersion, fFSAllowListPolicyRequest.firmwareVersion) && Objects.equal(this.platform, fFSAllowListPolicyRequest.platform) && Objects.equal(this.application, fFSAllowListPolicyRequest.application) && Objects.equal(this.applicationVersion, fFSAllowListPolicyRequest.applicationVersion) && Objects.equal(this.marketplace, fFSAllowListPolicyRequest.marketplace) && Objects.equal(this.customerId, fFSAllowListPolicyRequest.customerId)) {
                return true;
            }
        }
        return false;
    }

    public String getApplication() {
        return this.application;
    }

    public String getApplicationVersion() {
        return this.applicationVersion;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public String getDeviceModel() {
        return this.deviceModel;
    }

    public String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getMarketplace() {
        return this.marketplace;
    }

    public String getPlatform() {
        return this.platform;
    }

    public int hashCode() {
        return Objects.hashCode(this.deviceModel, this.manufacturer, this.firmwareVersion, this.platform, this.application, this.applicationVersion, this.marketplace, this.customerId);
    }

    public void setApplication(String str) {
        this.application = str;
    }

    public void setApplicationVersion(String str) {
        this.applicationVersion = str;
    }

    public void setCustomerId(String str) {
        this.customerId = str;
    }

    public void setDeviceModel(String str) {
        this.deviceModel = str;
    }

    public void setFirmwareVersion(String str) {
        this.firmwareVersion = str;
    }

    public void setManufacturer(String str) {
        this.manufacturer = str;
    }

    public void setMarketplace(String str) {
        this.marketplace = str;
    }

    public void setPlatform(String str) {
        this.platform = str;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("deviceModel", this.deviceModel).add("manufacturer", this.manufacturer).add("firmwareVersion", this.firmwareVersion).add("platform", this.platform).add("application", this.application).add(ArcusConstants.InputAttribute.APPLICATION_VERSION, this.applicationVersion).add("marketplace", this.marketplace).add(BizMetricsConstants.CUSTOMER_ID, this.customerId).toString();
    }

    public FFSAllowListPolicyRequest() {
    }
}
