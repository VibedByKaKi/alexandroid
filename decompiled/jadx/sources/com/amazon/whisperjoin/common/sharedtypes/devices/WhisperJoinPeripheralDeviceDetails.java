package com.amazon.whisperjoin.common.sharedtypes.devices;

import com.amazon.whisperbridge.ble.AdvertisementData;
import com.amazon.whisperjoin.common.sharedtypes.ble.BleScanData;
import java.util.LinkedHashSet;
import java.util.Set;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class WhisperJoinPeripheralDeviceDetails extends AbstractPeripheralDeviceDetails {
    private static final String TAG = "com.amazon.whisperjoin.common.sharedtypes.devices.WhisperJoinPeripheralDeviceDetails";
    private final int mAdvertisedSdkVersionIndex;
    private final AdvertisementData mAdvertisementData;
    private final BleScanData mBleScanData;
    private final String mClientNonce;
    private final String mDeviceIdentity;
    private final Set<DiscoveredRadio> mDiscoveredRadios;
    private final String mFriendlyName;
    private final DeviceNameType mNameType;
    private final String mProductIndex;
    private final String mSoftwareVersion;
    private final boolean mSupportedAuthenciatedEcdhe;
    private final boolean mSupportsPin;
    private final boolean mSupportsUnauthenciatedEcdhe;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        public static final int FULL_NAME = 9;
        public static final int NO_NAME = -1;
        public static final int SHORT_NAME = 8;
        private String mClientNonce;
        private boolean mSupportedAuthenciatedEcdhe;
        private boolean mSupportsPin;
        private boolean mSupportsUnauthenciatedEcdhe;
        private Set<DiscoveredRadio> mDiscoveredRadios = new LinkedHashSet();
        private String mProductIndex = "";
        private String mDeviceIdentity = "";
        private String mFriendlyName = "";
        private DeviceNameType mNameType = DeviceNameType.NONE;
        private String mSoftwareVersion = "";
        private int mAdvertisedSdkVersionIndex = 0;
        private BleScanData mBleScanData = null;
        private AdvertisementData mAdvertisementData = null;

        public WhisperJoinPeripheralDeviceDetails build() {
            return new WhisperJoinPeripheralDeviceDetails(this);
        }

        public Builder withAdvertisedSdkVersionIndex(int i) {
            this.mAdvertisedSdkVersionIndex = i;
            return this;
        }

        public Builder withAdvertisementData(AdvertisementData advertisementData) {
            this.mAdvertisementData = advertisementData;
            return this;
        }

        public Builder withBleScanData(BleScanData bleScanData) {
            this.mBleScanData = bleScanData;
            return this;
        }

        public Builder withClientNonce(String str) {
            if (str != null) {
                this.mClientNonce = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("clientNonce can not be empty or null");
            return null;
        }

        public Builder withDeviceIdentity(String str) {
            if (str == null || str.isEmpty()) {
                Single$$ExternalSyntheticBUOutline0.m$3("deviceIdentity can not be empty or null");
                return null;
            }
            this.mDeviceIdentity = str;
            return this;
        }

        public Builder withFriendlyName(String str, int i) {
            if (str == null || str.isEmpty()) {
                this.mFriendlyName = "";
                this.mNameType = DeviceNameType.NONE;
                return this;
            }
            this.mFriendlyName = str;
            if (i == 8) {
                this.mNameType = DeviceNameType.SHORT;
                return this;
            }
            if (i != 9) {
                this.mNameType = DeviceNameType.NONE;
                return this;
            }
            this.mNameType = DeviceNameType.FULL;
            return this;
        }

        public Builder withProductIndex(String str) {
            if (str != null) {
                this.mProductIndex = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("ProductIndex can not be empty or null");
            return null;
        }

        public Builder withRadio(DiscoveredRadio discoveredRadio) {
            if (discoveredRadio != null) {
                this.mDiscoveredRadios.add(discoveredRadio);
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("radio can not be null");
            return null;
        }

        public Builder withSoftwareVersion(String str) {
            if (str == null || str.isEmpty()) {
                Single$$ExternalSyntheticBUOutline0.m$3("softwareVersion can not be empty or null");
                return null;
            }
            this.mSoftwareVersion = str;
            return this;
        }

        public Builder withSupportsAuthenticatedEcdhe(boolean z) {
            this.mSupportedAuthenciatedEcdhe = z;
            return this;
        }

        public Builder withSupportsPin(boolean z) {
            this.mSupportsPin = z;
            return this;
        }

        public Builder withSupportsUnauthenticatedEcdhe(boolean z) {
            this.mSupportsUnauthenciatedEcdhe = z;
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum DeviceNameType {
        FULL,
        SHORT,
        NONE
    }

    public WhisperJoinPeripheralDeviceDetails(Builder builder) {
        this.mDiscoveredRadios = builder.mDiscoveredRadios;
        this.mProductIndex = builder.mProductIndex;
        this.mDeviceIdentity = builder.mDeviceIdentity;
        this.mFriendlyName = builder.mFriendlyName;
        this.mNameType = builder.mNameType;
        this.mClientNonce = builder.mClientNonce;
        this.mSoftwareVersion = builder.mSoftwareVersion;
        this.mSupportsUnauthenciatedEcdhe = builder.mSupportsUnauthenciatedEcdhe;
        this.mSupportedAuthenciatedEcdhe = builder.mSupportedAuthenciatedEcdhe;
        this.mSupportsPin = builder.mSupportsPin;
        this.mAdvertisedSdkVersionIndex = builder.mAdvertisedSdkVersionIndex;
        this.mBleScanData = builder.mBleScanData;
        this.mAdvertisementData = builder.mAdvertisementData;
    }

    public boolean addRadio(DiscoveredRadio discoveredRadio) {
        if (this.mDiscoveredRadios.add(discoveredRadio)) {
            return true;
        }
        for (DiscoveredRadio discoveredRadio2 : this.mDiscoveredRadios) {
            if (discoveredRadio2.equals(discoveredRadio)) {
                discoveredRadio2.updateFreshness(discoveredRadio.getFreshness());
                discoveredRadio2.updateSignalStrength(discoveredRadio.getSignalStrength());
                return false;
            }
        }
        Single$$ExternalSyntheticBUOutline0.m("Radio was in set, but not found when trying to update");
        return false;
    }

    public int getAdvertisedSdkVersionIndex() {
        return this.mAdvertisedSdkVersionIndex;
    }

    public AdvertisementData getAdvertisementData() {
        return this.mAdvertisementData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int getAuthenticationMode() {
        boolean supportsUnauthenticatedEcdhe = getSupportsUnauthenticatedEcdhe();
        ?? r0 = supportsUnauthenticatedEcdhe;
        if (getSupportsAuthenticatedEcdhe()) {
            r0 = (supportsUnauthenticatedEcdhe ? 1 : 0) | 2;
        }
        return getSupportsPin() ? r0 | 4 : r0;
    }

    public BleScanData getBleScanData() {
        return this.mBleScanData;
    }

    public String getClientNonce() {
        return this.mClientNonce;
    }

    public String getDeviceIdentity() {
        return this.mDeviceIdentity;
    }

    public String getFriendlyName() {
        return this.mFriendlyName;
    }

    public DeviceNameType getNameType() {
        return this.mNameType;
    }

    public String getProductIndex() {
        return this.mProductIndex;
    }

    public Set<DiscoveredRadio> getRadios() {
        return this.mDiscoveredRadios;
    }

    public String getSoftwareVersion() {
        return this.mSoftwareVersion;
    }

    public boolean getSupportsAuthenticatedEcdhe() {
        return this.mSupportedAuthenciatedEcdhe;
    }

    public boolean getSupportsPin() {
        return this.mSupportsPin;
    }

    public boolean getSupportsUnauthenticatedEcdhe() {
        return this.mSupportsUnauthenciatedEcdhe;
    }

    public boolean isDistressed() {
        return false;
    }

    public boolean isEsimSession() {
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (DiscoveredRadio discoveredRadio : this.mDiscoveredRadios) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(sb.length() == 0 ? "" : "\n");
            sb2.append("mRadio : ");
            sb2.append(discoveredRadio.getRadio());
            sb.append(sb2.toString());
            sb.append("\n mFreshness : " + discoveredRadio.getFreshness());
            sb.append("\n mSignalStrength : " + discoveredRadio.getSignalStrength());
            sb.append("\n mHandleType : ".concat(discoveredRadio.getRadioHandle().getClass().getName()));
        }
        sb.append("\n mRadio : " + this.mDiscoveredRadios.toString());
        sb.append("\n mProductIndex : " + this.mProductIndex);
        sb.append("\n mDeviceIdentity : " + this.mDeviceIdentity);
        sb.append("\n mFriendlyName : " + this.mFriendlyName);
        sb.append("\n mNameType : " + this.mNameType.toString());
        sb.append("\n mClientNonce : " + this.mClientNonce);
        sb.append("\n mSupportsUnauthenciatedEcdhe: " + this.mSupportsUnauthenciatedEcdhe);
        sb.append("\n mSupportedAuthenciatedEcdhe: " + this.mSupportedAuthenciatedEcdhe);
        sb.append("\n mSupportsPin: " + this.mSupportsPin);
        sb.append("\n mAdvertisedSdkVersionIndex: " + this.mAdvertisedSdkVersionIndex);
        sb.append("\n mBleScanData: " + this.mBleScanData);
        sb.append("\n mAdvertisementData: " + this.mAdvertisementData);
        return sb.toString();
    }
}
