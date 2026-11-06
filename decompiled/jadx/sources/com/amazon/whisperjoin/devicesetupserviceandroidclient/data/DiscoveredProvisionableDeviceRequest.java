package com.amazon.whisperjoin.devicesetupserviceandroidclient.data;

import com.amazon.devicesetupservice.reporting.Radio;
import com.amazon.devicesetupservice.v1.ProvisionerInfo;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DiscoveredProvisionableDeviceRequest extends AbstractDiscoveredProvisioneeRequest {
    private final int mAdvertisedSdkVersionIndex;
    private final String mAuthMaterialIndex;
    private final String mDeviceName;
    private final String mNonce;
    private final String mProductIndex;
    private final String mProvisionerApplicationName;
    private final String mProvisionerApplicationVersion;
    private final List<String> mProvisioningFlags;
    private final String mProvisioningMethod;
    private final String mRadio;
    private final int mRssi;
    private final String mSoftwareVersionIndex;
    private final String mTrustMethod;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private int mAdvertisedSdkVersionIndex;
        private String mAuthMaterialIndex;
        private String mDeviceName;
        private String mNonce;
        private String mProductIndex;
        private String mProvisionerApplicationName;
        private String mProvisionerApplicationVersion;
        private ProvisionerInfo mProvisionerInfo;
        private List<String> mProvisioningFlags;
        private String mProvisioningMethod;
        private int mRssi;
        private String mSoftwareVersionIndex;
        private String mTrustMethod;

        private void validate() {
            RequestInputValidator.validateProvisionerApplicationName(this.mProvisionerApplicationName);
            RequestInputValidator.validateProvisionerApplicationVersion(this.mProvisionerApplicationVersion);
            RequestInputValidator.validateRSSI(this.mRssi);
            RequestInputValidator.validateProductIndex(this.mProductIndex);
            RequestInputValidator.validateSoftwareVersionIndex(this.mSoftwareVersionIndex);
            RequestInputValidator.validateAuthMaterialIndex(this.mAuthMaterialIndex);
            RequestInputValidator.validateAdvertisementNonce(this.mNonce);
            RequestInputValidator.validateDeviceName(this.mDeviceName);
            RequestInputValidator.validateProvisioningMethod(this.mProvisioningMethod);
            RequestInputValidator.validateTrustMethod(this.mTrustMethod);
            RequestInputValidator.validateProvisionerInfo(this.mProvisionerInfo);
            RequestInputValidator.validateAdvertisedSdkVersionIndex(this.mAdvertisedSdkVersionIndex);
        }

        public DiscoveredProvisionableDeviceRequest createRequest() {
            validate();
            return new DiscoveredProvisionableDeviceRequest(this.mProvisionerApplicationName, this.mProvisionerApplicationVersion, this.mRssi, this.mProductIndex, this.mSoftwareVersionIndex, this.mAuthMaterialIndex, this.mNonce, this.mDeviceName, this.mProvisioningMethod, this.mTrustMethod, this.mProvisionerInfo, this.mAdvertisedSdkVersionIndex, this.mProvisioningFlags);
        }

        public Builder setAdvertisedSdkVersionIndex(int i) {
            this.mAdvertisedSdkVersionIndex = i;
            return this;
        }

        public Builder setAuthMaterialIndex(String str) {
            this.mAuthMaterialIndex = str;
            return this;
        }

        public Builder setDeviceName(String str) {
            this.mDeviceName = str;
            return this;
        }

        public Builder setNonce(String str) {
            this.mNonce = str;
            return this;
        }

        public Builder setProductIndex(String str) {
            this.mProductIndex = str;
            return this;
        }

        public Builder setProvisionerApplicationName(String str) {
            this.mProvisionerApplicationName = str;
            return this;
        }

        public Builder setProvisionerApplicationVersion(String str) {
            this.mProvisionerApplicationVersion = str;
            return this;
        }

        public Builder setProvisionerInfo(ProvisionerInfo provisionerInfo) {
            this.mProvisionerInfo = provisionerInfo;
            return this;
        }

        public Builder setProvisioningFlags(List<String> list) {
            this.mProvisioningFlags = list;
            return this;
        }

        public Builder setProvisioningMethod(String str) {
            this.mProvisioningMethod = str;
            return this;
        }

        public Builder setRssi(int i) {
            this.mRssi = i;
            return this;
        }

        public Builder setSoftwareVersionIndex(String str) {
            this.mSoftwareVersionIndex = str;
            return this;
        }

        public Builder setTrustMethod(String str) {
            this.mTrustMethod = str;
            return this;
        }
    }

    private DiscoveredProvisionableDeviceRequest(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, String str9, ProvisionerInfo provisionerInfo, int i2, List<String> list) {
        this.mRadio = Radio.BLUETOOTH_LOW_ENERGY;
        this.mProvisionerApplicationName = str;
        this.mProvisionerApplicationVersion = str2;
        this.mRssi = i;
        this.mProductIndex = str3;
        this.mSoftwareVersionIndex = str4;
        this.mAuthMaterialIndex = str5;
        this.mNonce = str6;
        this.mDeviceName = str7;
        this.mProvisioningMethod = str8;
        this.mTrustMethod = str9;
        this.mProvisionerInfo = provisionerInfo;
        this.mAdvertisedSdkVersionIndex = i2;
        this.mProvisioningFlags = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DiscoveredProvisionableDeviceRequest discoveredProvisionableDeviceRequest = (DiscoveredProvisionableDeviceRequest) obj;
            if (this.mRssi == discoveredProvisionableDeviceRequest.mRssi && Objects.equal(this.mProvisionerApplicationName, discoveredProvisionableDeviceRequest.mProvisionerApplicationName) && Objects.equal(this.mProvisionerApplicationVersion, discoveredProvisionableDeviceRequest.mProvisionerApplicationVersion) && Objects.equal(Radio.BLUETOOTH_LOW_ENERGY, Radio.BLUETOOTH_LOW_ENERGY) && Objects.equal(this.mProductIndex, discoveredProvisionableDeviceRequest.mProductIndex) && Objects.equal(this.mSoftwareVersionIndex, discoveredProvisionableDeviceRequest.mSoftwareVersionIndex) && Objects.equal(this.mAuthMaterialIndex, discoveredProvisionableDeviceRequest.mAuthMaterialIndex) && Objects.equal(this.mNonce, discoveredProvisionableDeviceRequest.mNonce) && Objects.equal(this.mDeviceName, discoveredProvisionableDeviceRequest.mDeviceName) && Objects.equal(this.mProvisioningMethod, discoveredProvisionableDeviceRequest.mProvisioningMethod) && Objects.equal(this.mTrustMethod, discoveredProvisionableDeviceRequest.mTrustMethod) && Objects.equal(this.mProvisionerInfo, discoveredProvisionableDeviceRequest.mProvisionerInfo) && Objects.equal(Integer.valueOf(this.mAdvertisedSdkVersionIndex), Integer.valueOf(discoveredProvisionableDeviceRequest.mAdvertisedSdkVersionIndex)) && Objects.equal(this.mProvisioningFlags, discoveredProvisionableDeviceRequest.mProvisioningFlags)) {
                return true;
            }
        }
        return false;
    }

    public int getAdvertisedSdkVersionIndex() {
        return this.mAdvertisedSdkVersionIndex;
    }

    public String getAuthMaterialIndex() {
        return this.mAuthMaterialIndex;
    }

    public String getDeviceName() {
        return this.mDeviceName;
    }

    public String getNonce() {
        return this.mNonce;
    }

    public String getProductIndex() {
        return this.mProductIndex;
    }

    public String getProvisionerApplicationName() {
        return this.mProvisionerApplicationName;
    }

    public String getProvisionerApplicationVersion() {
        return this.mProvisionerApplicationVersion;
    }

    public List<String> getProvisioningFlags() {
        return this.mProvisioningFlags;
    }

    public String getProvisioningMethod() {
        return this.mProvisioningMethod;
    }

    public String getRadio() {
        return Radio.BLUETOOTH_LOW_ENERGY;
    }

    public int getRssi() {
        return this.mRssi;
    }

    public String getSoftwareVersionIndex() {
        return this.mSoftwareVersionIndex;
    }

    public String getTrustMethod() {
        return this.mTrustMethod;
    }

    public int hashCode() {
        return Objects.hashCode(this.mProvisionerApplicationName, this.mProvisionerApplicationVersion, Radio.BLUETOOTH_LOW_ENERGY, Integer.valueOf(this.mRssi), this.mProductIndex, this.mSoftwareVersionIndex, this.mAuthMaterialIndex, this.mNonce, this.mDeviceName, this.mProvisioningMethod, this.mTrustMethod, this.mProvisionerInfo, Integer.valueOf(this.mAdvertisedSdkVersionIndex), this.mProvisioningFlags);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("mProvisionerApplicationName", this.mProvisionerApplicationName).add("mProvisionerApplicationVersion", this.mProvisionerApplicationVersion).add("mRadio", Radio.BLUETOOTH_LOW_ENERGY).add("mRssi", this.mRssi).add("mProductIndex", this.mProductIndex).add("mSoftwareVersionIndex", this.mSoftwareVersionIndex).add("mAuthMaterialIndex", this.mAuthMaterialIndex).add("mNonce", this.mNonce).add("mDeviceName", this.mDeviceName).add("mProvisioningMethod", this.mProvisioningMethod).add("mTrustMethod", this.mTrustMethod).add("mProvisionerInfo", this.mProvisionerInfo).add("mAdvertisedSdkVersionIndex", this.mAdvertisedSdkVersionIndex).add("mProvisioningFlags", this.mProvisioningFlags).toString();
    }
}
