package com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class WifiBaseConfiguration extends WifiNetwork {
    public static final Parcelable.ClassLoaderCreator<WifiBaseConfiguration> CREATOR = new Parcelable.ClassLoaderCreator<WifiBaseConfiguration>() { // from class: com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiBaseConfiguration.1
        @Override // android.os.Parcelable.Creator
        public WifiBaseConfiguration createFromParcel(Parcel parcel) {
            if (parcel != null) {
                return new WifiBaseConfiguration(parcel, WifiBaseConfiguration.class.getClassLoader());
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public WifiBaseConfiguration[] newArray(int i) {
            if (i >= 0) {
                return new WifiBaseConfiguration[i];
            }
            Single$$ExternalSyntheticBUOutline0.m$3("size cannot be negative.");
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public WifiBaseConfiguration createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel != null) {
                return new WifiBaseConfiguration(parcel, classLoader);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }
    };
    protected boolean mIsAutoJoin;
    protected boolean mIsHiddenNetwork;
    protected int mNetworkPriority;

    public WifiBaseConfiguration(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.mNetworkPriority = parcel.readInt();
        this.mIsHiddenNetwork = parcel.readByte() == 1;
        this.mIsAutoJoin = parcel.readByte() == 1;
    }

    public static WifiBaseConfiguration convertFromAndroidWifiConfiguration(android.net.wifi.WifiConfiguration wifiConfiguration) {
        if (wifiConfiguration.allowedKeyManagement.get(0)) {
            String[] strArr = wifiConfiguration.wepKeys;
            return (strArr == null || strArr.length <= 0 || strArr[0] == null) ? createOpenWifiConfiguration(wifiConfiguration.SSID, wifiConfiguration.priority, wifiConfiguration.hiddenSSID) : createWepWifiConfiguration(wifiConfiguration.SSID, wifiConfiguration.priority, wifiConfiguration.hiddenSSID);
        }
        if (wifiConfiguration.allowedKeyManagement.get(1)) {
            return createWpaTypedWifiConfiguration(wifiConfiguration.SSID, WpaPskType.getWpaPskType(wifiConfiguration), wifiConfiguration.priority, wifiConfiguration.hiddenSSID);
        }
        return null;
    }

    public static WifiBaseConfiguration createOpenWifiConfiguration(String str) {
        return new WifiBaseConfiguration(str, WifiKeyManagement.NONE, null, 0, false);
    }

    public static WifiBaseConfiguration createWepWifiConfiguration(String str) {
        return new WifiBaseConfiguration(str, WifiKeyManagement.WEP, null, 0, false);
    }

    public static WifiBaseConfiguration createWpaTypedWifiConfiguration(String str, WpaPskType wpaPskType, int i, boolean z) {
        return new WifiBaseConfiguration(str, WifiKeyManagement.WPA_PSK, wpaPskType, i, z);
    }

    public static WifiBaseConfiguration createWpaWifiConfiguration(String str) {
        return new WifiBaseConfiguration(str, WifiKeyManagement.WPA_PSK, null, 0, false);
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiNetwork, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiNetwork
    public boolean equals(Object obj) {
        if (obj instanceof WifiBaseConfiguration) {
            WifiBaseConfiguration wifiBaseConfiguration = (WifiBaseConfiguration) obj;
            if (super.equals(this) && this.mNetworkPriority == wifiBaseConfiguration.mNetworkPriority && this.mIsHiddenNetwork == wifiBaseConfiguration.mIsHiddenNetwork && this.mIsAutoJoin == wifiBaseConfiguration.mIsAutoJoin) {
                return true;
            }
        }
        return false;
    }

    public int getNetworkPriority() {
        return this.mNetworkPriority;
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiNetwork
    public int hashCode() {
        return ((((((super.hashCode() + 41) * 41) + this.mNetworkPriority) * 41) + (this.mIsHiddenNetwork ? 1 : 0)) * 41) + (this.mIsAutoJoin ? 1 : 0);
    }

    public boolean isAutoJoin() {
        return this.mIsAutoJoin;
    }

    public boolean isHiddenNetwork() {
        return this.mIsHiddenNetwork;
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiNetwork
    public String toString() {
        StringBuilder sb = new StringBuilder("WifiBaseConfiguration [ssid=--REDACTED--, key-mgmt=");
        sb.append(this.mWifiKeyManagement);
        sb.append(", priority=");
        sb.append(this.mNetworkPriority);
        sb.append(", hidden=");
        sb.append(this.mIsHiddenNetwork);
        sb.append(", auto-join=");
        return a$$ExternalSyntheticOutline0.m(sb, this.mIsAutoJoin, MarkdownConstants.RIGHT_BRACKET);
    }

    public WifiBaseConfiguration withAutoJoin(boolean z) {
        WifiBaseConfiguration wifiBaseConfiguration = new WifiBaseConfiguration(this);
        wifiBaseConfiguration.mIsAutoJoin = z;
        return wifiBaseConfiguration;
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiNetwork, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("dest cannot be null.");
            return;
        }
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.mNetworkPriority);
        parcel.writeByte(this.mIsHiddenNetwork ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mIsAutoJoin ? (byte) 1 : (byte) 0);
    }

    public static WifiBaseConfiguration createOpenWifiConfiguration(String str, int i, boolean z) {
        return new WifiBaseConfiguration(str, WifiKeyManagement.NONE, null, i, z);
    }

    public static WifiBaseConfiguration createWepWifiConfiguration(String str, int i, boolean z) {
        return new WifiBaseConfiguration(str, WifiKeyManagement.WEP, null, i, z);
    }

    public static WifiBaseConfiguration createWpaWifiConfiguration(String str, int i, boolean z) {
        return new WifiBaseConfiguration(str, WifiKeyManagement.WPA_PSK, null, i, z);
    }

    public WifiBaseConfiguration(String str, WifiKeyManagement wifiKeyManagement, int i, boolean z) {
        super(str, wifiKeyManagement);
        this.mNetworkPriority = i;
        this.mIsHiddenNetwork = z;
        this.mIsAutoJoin = false;
    }

    public WifiBaseConfiguration(String str, WifiKeyManagement wifiKeyManagement, WpaPskType wpaPskType, int i, boolean z) {
        super(str, wifiKeyManagement, wpaPskType);
        this.mNetworkPriority = i;
        this.mIsHiddenNetwork = z;
        this.mIsAutoJoin = false;
    }

    public WifiBaseConfiguration(WifiBaseConfiguration wifiBaseConfiguration) {
        super(wifiBaseConfiguration);
        this.mNetworkPriority = wifiBaseConfiguration.mNetworkPriority;
        this.mIsHiddenNetwork = wifiBaseConfiguration.mIsHiddenNetwork;
        this.mIsAutoJoin = wifiBaseConfiguration.mIsAutoJoin;
    }
}
