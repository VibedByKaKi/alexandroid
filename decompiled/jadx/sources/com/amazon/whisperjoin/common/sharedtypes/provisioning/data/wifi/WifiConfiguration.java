package com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.whisperjoin.common.sharedtypes.utility.InputValidator;
import java.util.BitSet;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class WifiConfiguration extends WifiBaseConfiguration {
    public static final Parcelable.ClassLoaderCreator<WifiConfiguration> CREATOR = new Parcelable.ClassLoaderCreator<WifiConfiguration>() { // from class: com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiConfiguration.1
        @Override // android.os.Parcelable.Creator
        public WifiConfiguration createFromParcel(Parcel parcel) {
            if (parcel != null) {
                return new WifiConfiguration(parcel, WifiConfiguration.class.getClassLoader());
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public WifiConfiguration[] newArray(int i) {
            if (i >= 0) {
                return new WifiConfiguration[i];
            }
            Single$$ExternalSyntheticBUOutline0.m$3("size cannot be negative.");
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public WifiConfiguration createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel != null) {
                return new WifiConfiguration(parcel, classLoader);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }
    };
    private String mPsk;
    private String mWepKey;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiConfiguration$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$whisperjoin$common$sharedtypes$provisioning$data$wifi$WifiKeyManagement;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$whisperjoin$common$sharedtypes$provisioning$data$wifi$WpaPskType;

        static {
            int[] iArr = new int[WifiKeyManagement.values().length];
            $SwitchMap$com$amazon$whisperjoin$common$sharedtypes$provisioning$data$wifi$WifiKeyManagement = iArr;
            try {
                iArr[WifiKeyManagement.WEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$common$sharedtypes$provisioning$data$wifi$WifiKeyManagement[WifiKeyManagement.WPA_PSK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$common$sharedtypes$provisioning$data$wifi$WifiKeyManagement[WifiKeyManagement.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$common$sharedtypes$provisioning$data$wifi$WifiKeyManagement[WifiKeyManagement.OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[WpaPskType.values().length];
            $SwitchMap$com$amazon$whisperjoin$common$sharedtypes$provisioning$data$wifi$WpaPskType = iArr2;
            try {
                iArr2[WpaPskType.WPA3_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private WifiConfiguration(String str, WifiKeyManagement wifiKeyManagement, WpaPskType wpaPskType, String str2, String str3, int i, boolean z) {
        super(str, wifiKeyManagement, wpaPskType, i, z);
        if (wifiKeyManagement == WifiKeyManagement.WEP) {
            this.mWepKey = str2;
        } else if (wifiKeyManagement == WifiKeyManagement.WPA_PSK) {
            this.mPsk = str3;
        }
        validate();
    }

    public static WifiConfiguration createOpenWifiConfiguration(String str) {
        return new WifiConfiguration(str, WifiKeyManagement.NONE, null, null, 0, false);
    }

    public static WifiConfiguration createWepWifiConfiguration(String str, String str2) {
        return new WifiConfiguration(str, WifiKeyManagement.WEP, str2, null, 0, false);
    }

    public static WifiConfiguration createWpaTypedWifiConfiguration(String str, String str2, WpaPskType wpaPskType) {
        return new WifiConfiguration(str, WifiKeyManagement.WPA_PSK, wpaPskType, null, str2, 0, false);
    }

    public static WifiConfiguration createWpaWifiConfiguration(String str, String str2) {
        return new WifiConfiguration(str, WifiKeyManagement.WPA_PSK, null, str2, 0, false);
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiBaseConfiguration, com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiNetwork, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiBaseConfiguration, com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiNetwork
    public boolean equals(Object obj) {
        if (!(obj instanceof WifiConfiguration)) {
            return false;
        }
        WifiConfiguration wifiConfiguration = (WifiConfiguration) obj;
        return this.mPsk != null ? super.equals(obj) && this.mPsk.equals(wifiConfiguration.mPsk) : this.mWepKey != null ? super.equals(obj) && this.mWepKey.equals(wifiConfiguration.mWepKey) : super.equals(obj);
    }

    public String getPsk() {
        return this.mPsk;
    }

    public String getWepKey() {
        return this.mWepKey;
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiBaseConfiguration, com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiNetwork
    public int hashCode() {
        int hashCode = (super.hashCode() + 41) * 41;
        String str = this.mWepKey;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 41;
        String str2 = this.mPsk;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public android.net.wifi.WifiConfiguration toAndroidConfiguration() throws UnsupportedOperationException {
        android.net.wifi.WifiConfiguration wifiConfiguration = new android.net.wifi.WifiConfiguration();
        wifiConfiguration.SSID = getSsid();
        wifiConfiguration.hiddenSSID = this.mIsHiddenNetwork;
        wifiConfiguration.priority = this.mNetworkPriority;
        wifiConfiguration.allowedKeyManagement = new BitSet();
        wifiConfiguration.allowedAuthAlgorithms = new BitSet();
        wifiConfiguration.allowedGroupCiphers = new BitSet();
        int i = AnonymousClass2.$SwitchMap$com$amazon$whisperjoin$common$sharedtypes$provisioning$data$wifi$WifiKeyManagement[this.mWifiKeyManagement.ordinal()];
        if (i == 1) {
            wifiConfiguration.allowedKeyManagement.set(0);
            wifiConfiguration.allowedAuthAlgorithms.set(0);
            wifiConfiguration.allowedAuthAlgorithms.set(1);
            wifiConfiguration.allowedGroupCiphers.set(0);
            wifiConfiguration.allowedGroupCiphers.set(1);
            String str = this.mWepKey;
            if (str != null) {
                wifiConfiguration.wepTxKeyIndex = 0;
                wifiConfiguration.wepKeys[0] = str;
            }
        } else {
            if (i == 2) {
                wifiConfiguration.preSharedKey = getPsk();
                WpaPskType wpaPskType = this.mWpaPskType;
                if (wpaPskType == null) {
                    wifiConfiguration.allowedKeyManagement.set(1);
                    return wifiConfiguration;
                }
                int i2 = AnonymousClass2.$SwitchMap$com$amazon$whisperjoin$common$sharedtypes$provisioning$data$wifi$WpaPskType[wpaPskType.ordinal()];
                BitSet bitSet = wifiConfiguration.allowedKeyManagement;
                if (i2 != 1) {
                    bitSet.set(1);
                    return wifiConfiguration;
                }
                bitSet.set(8);
                return wifiConfiguration;
            }
            if (i == 3) {
                wifiConfiguration.allowedKeyManagement.set(0);
                return wifiConfiguration;
            }
            if (i == 4) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Network type of OTHER key management not supported");
                return null;
            }
        }
        return wifiConfiguration;
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiBaseConfiguration, com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiNetwork
    public String toString() {
        return "WifiConfiguration [ssid=--REDACTED--, key-mgmt=" + this.mWifiKeyManagement + MarkdownConstants.RIGHT_BRACKET;
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiNetwork
    public void validate() {
        super.validate();
        String str = this.mPsk;
        if (str != null && this.mWepKey != null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Wifi configuration cannot have both WEP-key and PSK. Please use com.amazon.whisperjoin.common.sharedtypes.utility.InputValidator to validate wifi parameters.");
            return;
        }
        if (str != null && !InputValidator.isValidWPAWifiConfiguration(this.mWifiKeyManagement, getPsk())) {
            Single$$ExternalSyntheticBUOutline0.m$3("Invalid PSK in wifi configuration. Please use com.amazon.whisperjoin.common.sharedtypes.utility.InputValidator to validate wifi parameters.");
            return;
        }
        String str2 = this.mWepKey;
        if (str2 != null && !InputValidator.isValidWEPWifiConfiguration(this.mWifiKeyManagement, str2)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Invalid WEP-key in wifi configuration. Please use com.amazon.whisperjoin.common.sharedtypes.utility.InputValidator to validate wifi parameters.");
        } else if (this.mPsk == null && this.mWepKey == null && !InputValidator.isValidOpenWifiConfiguration(this.mWifiKeyManagement)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Invalid open wifi configuration. Please use com.amazon.whisperjoin.common.sharedtypes.utility.InputValidator to validate wifi parameters.");
        }
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiBaseConfiguration
    public WifiConfiguration withAutoJoin(boolean z) {
        return new WifiConfiguration(this, super.withAutoJoin(z));
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiBaseConfiguration, com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiNetwork, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("dest cannot be null.");
            return;
        }
        super.writeToParcel(parcel, i);
        parcel.writeString(this.mWepKey);
        parcel.writeString(this.mPsk);
    }

    public static WifiConfiguration createOpenWifiConfiguration(String str, int i, boolean z) {
        return new WifiConfiguration(str, WifiKeyManagement.NONE, null, null, i, z);
    }

    public static WifiConfiguration createWepWifiConfiguration(String str, String str2, int i, boolean z) {
        return new WifiConfiguration(str, WifiKeyManagement.WEP, str2, null, i, z);
    }

    public static WifiConfiguration createWpaWifiConfiguration(String str, String str2, int i, boolean z) {
        return new WifiConfiguration(str, WifiKeyManagement.WPA_PSK, null, str2, i, z);
    }

    public static WifiConfiguration createWpaTypedWifiConfiguration(String str, String str2, WpaPskType wpaPskType, int i, boolean z) {
        return new WifiConfiguration(str, WifiKeyManagement.WPA_PSK, wpaPskType, null, str2, i, z);
    }

    private WifiConfiguration(String str, WifiKeyManagement wifiKeyManagement, String str2, String str3, int i, boolean z) {
        super(str, wifiKeyManagement, i, z);
        if (wifiKeyManagement == WifiKeyManagement.WEP) {
            this.mWepKey = str2;
        } else if (wifiKeyManagement == WifiKeyManagement.WPA_PSK) {
            this.mPsk = str3;
        }
        validate();
    }

    private WifiConfiguration(WifiConfiguration wifiConfiguration, WifiBaseConfiguration wifiBaseConfiguration) {
        super(wifiBaseConfiguration);
        this.mWepKey = wifiConfiguration.mWepKey;
        this.mPsk = wifiConfiguration.mPsk;
    }

    public WifiConfiguration(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.mWepKey = parcel.readString();
        this.mPsk = parcel.readString();
        validate();
    }
}
