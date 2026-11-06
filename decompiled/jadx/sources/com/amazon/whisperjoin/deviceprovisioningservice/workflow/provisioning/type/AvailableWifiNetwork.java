package com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.type;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiConfiguration;
import com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiNetwork;
import com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiScanResult;
import java.util.Locale;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AvailableWifiNetwork extends WifiNetwork {
    public static final Parcelable.Creator<AvailableWifiNetwork> CREATOR = new Parcelable.Creator<AvailableWifiNetwork>() { // from class: com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.type.AvailableWifiNetwork.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AvailableWifiNetwork createFromParcel(Parcel parcel) {
            return AvailableWifiNetwork.fromParcel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AvailableWifiNetwork[] newArray(int i) {
            return new AvailableWifiNetwork[i];
        }
    };
    private boolean mHasConfiguration;
    private WifiScanResult mScanResult;
    private WifiConfiguration mWifiConfiguration;

    public AvailableWifiNetwork(WifiScanResult wifiScanResult, WifiConfiguration wifiConfiguration) {
        super(wifiScanResult.getSsid(), wifiScanResult.getKeyManagement(), wifiScanResult.getWpaPskType());
        this.mScanResult = wifiScanResult;
        this.mWifiConfiguration = wifiConfiguration;
        this.mHasConfiguration = wifiConfiguration != null;
        validateProperties();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AvailableWifiNetwork fromParcel(Parcel parcel) {
        return new AvailableWifiNetwork((WifiScanResult) parcel.readParcelable(WifiScanResult.class.getClassLoader()), parcel.readInt() == 1 ? (WifiConfiguration) parcel.readParcelable(WifiConfiguration.class.getClassLoader()) : null);
    }

    private void validateProperties() {
        WifiScanResult wifiScanResult = this.mScanResult;
        if (wifiScanResult == null) {
            Single$$ExternalSyntheticBUOutline0.m$2("Scan WJResult can't be null");
        } else {
            if (this.mWifiConfiguration == null) {
                return;
            }
            if (wifiScanResult.getSsid().equals(this.mWifiConfiguration.getSsid()) && this.mScanResult.getKeyManagement().equals(this.mWifiConfiguration.getKeyManagement())) {
                return;
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Invalid network configuration");
        }
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiNetwork, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiNetwork
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AvailableWifiNetwork availableWifiNetwork = (AvailableWifiNetwork) obj;
            if (!this.mScanResult.equals(availableWifiNetwork.mScanResult)) {
                return false;
            }
            WifiConfiguration wifiConfiguration = this.mWifiConfiguration;
            WifiConfiguration wifiConfiguration2 = availableWifiNetwork.mWifiConfiguration;
            if (wifiConfiguration != null) {
                return wifiConfiguration.equals(wifiConfiguration2);
            }
            if (wifiConfiguration2 == null) {
                return true;
            }
        }
        return false;
    }

    public WifiScanResult getScanResult() {
        return this.mScanResult;
    }

    public WifiConfiguration getWifiConfiguration() {
        return this.mWifiConfiguration;
    }

    public boolean hasConfiguration() {
        return this.mHasConfiguration;
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiNetwork
    public int hashCode() {
        int hashCode = this.mScanResult.hashCode() * 31;
        WifiConfiguration wifiConfiguration = this.mWifiConfiguration;
        return hashCode + (wifiConfiguration != null ? wifiConfiguration.hashCode() : 0);
    }

    public void setWifiConfiguration(WifiConfiguration wifiConfiguration) {
        this.mWifiConfiguration = wifiConfiguration;
        this.mHasConfiguration = wifiConfiguration != null;
        validateProperties();
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiNetwork
    public String toString() {
        Locale locale = Locale.US;
        String ssid = this.mScanResult.getSsid();
        String name = this.mScanResult.getKeyManagement().name();
        int signalStrength = this.mScanResult.getSignalStrength();
        boolean z = this.mHasConfiguration;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("SSID: ", ssid, ", KeyMgmt: ", name, ", RSSI: ");
        m.append(signalStrength);
        m.append(", HasConfig: ");
        m.append(z);
        return m.toString();
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiNetwork, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mScanResult, i);
        parcel.writeInt(this.mHasConfiguration ? 1 : 0);
        if (this.mHasConfiguration) {
            parcel.writeParcelable(this.mWifiConfiguration, i);
        }
    }

    public AvailableWifiNetwork(WifiScanResult wifiScanResult) {
        this(wifiScanResult, null);
    }
}
