package com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi;

import android.net.wifi.ScanResult;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.BitSet;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum WifiKeyManagement implements Parcelable {
    NONE,
    WPA_PSK,
    WEP,
    OTHER;

    public static final Parcelable.ClassLoaderCreator<WifiKeyManagement> CREATOR = new Parcelable.ClassLoaderCreator<WifiKeyManagement>() { // from class: com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiKeyManagement.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public WifiKeyManagement createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel != null) {
                return WifiKeyManagement.values()[parcel.readInt()];
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public WifiKeyManagement[] newArray(int i) {
            if (i >= 0) {
                return new WifiKeyManagement[i];
            }
            Single$$ExternalSyntheticBUOutline0.m$3("size cannot be negative.");
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public WifiKeyManagement createFromParcel(Parcel parcel) {
            if (parcel != null) {
                return WifiKeyManagement.values()[parcel.readInt()];
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }
    };

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiKeyManagement$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$whisperjoin$common$sharedtypes$provisioning$data$wifi$WifiKeyManagement;

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
        }
    }

    public static WifiKeyManagement getWifiKeyManagement(android.net.wifi.WifiConfiguration wifiConfiguration) {
        if (wifiConfiguration == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Cannot convert a null wifi-configuration's key-management.");
            return null;
        }
        if (wifiConfiguration.allowedKeyManagement.get(1) || wifiConfiguration.allowedKeyManagement.get(8)) {
            return WPA_PSK;
        }
        if (!wifiConfiguration.allowedKeyManagement.get(0)) {
            return OTHER;
        }
        String[] strArr = wifiConfiguration.wepKeys;
        return (strArr == null || strArr.length <= 0 || strArr[0] == null) ? NONE : WEP;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BitSet toAndroidKeyManagement(WpaPskType wpaPskType) {
        BitSet bitSet = new BitSet();
        int i = AnonymousClass2.$SwitchMap$com$amazon$whisperjoin$common$sharedtypes$provisioning$data$wifi$WifiKeyManagement[ordinal()];
        if (i == 1) {
            bitSet.set(0);
            return bitSet;
        }
        if (i == 2) {
            if (wpaPskType == WpaPskType.WPA3_ONLY) {
                bitSet.set(8);
                return bitSet;
            }
            bitSet.set(1);
            return bitSet;
        }
        if (i == 3) {
            bitSet.set(0);
            return bitSet;
        }
        if (i != 4) {
            return bitSet;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Network type of OTHER key management not supported.");
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeInt(ordinal());
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("dest cannot be null.");
        }
    }

    public static WifiKeyManagement getWifiKeyManagement(ScanResult scanResult) {
        if (scanResult.capabilities.contains("WEP")) {
            return WEP;
        }
        if (!scanResult.capabilities.contains("PSK") && !scanResult.capabilities.contains("SAE")) {
            if (scanResult.capabilities.contains("EAP")) {
                return OTHER;
            }
            return NONE;
        }
        return WPA_PSK;
    }
}
