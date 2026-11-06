package com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi;

import android.net.wifi.ScanResult;
import android.os.Parcel;
import android.os.Parcelable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum WpaPskType implements Parcelable {
    WPA3_TRANSITION,
    WPA3_ONLY,
    WPA2;

    public static final Parcelable.ClassLoaderCreator<WpaPskType> CREATOR = new Parcelable.ClassLoaderCreator<WpaPskType>() { // from class: com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WpaPskType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public WpaPskType createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel != null) {
                return WpaPskType.values()[parcel.readInt()];
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public WpaPskType[] newArray(int i) {
            if (i >= 0) {
                return new WpaPskType[i];
            }
            Single$$ExternalSyntheticBUOutline0.m$3("size cannot be negative.");
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public WpaPskType createFromParcel(Parcel parcel) {
            if (parcel != null) {
                return WpaPskType.values()[parcel.readInt()];
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }
    };

    public static WpaPskType getWpaPskType(ScanResult scanResult) {
        if (scanResult.capabilities.contains("SAE") && scanResult.capabilities.contains("PSK")) {
            return WPA3_TRANSITION;
        }
        if (scanResult.capabilities.contains("SAE")) {
            return WPA3_ONLY;
        }
        if (scanResult.capabilities.contains("PSK")) {
            return WPA2;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeInt(ordinal());
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("dest cannot be null.");
        }
    }

    public static WpaPskType getWpaPskType(android.net.wifi.WifiConfiguration wifiConfiguration) {
        if (wifiConfiguration.allowedKeyManagement.get(8) && wifiConfiguration.allowedKeyManagement.get(1)) {
            return WPA3_TRANSITION;
        }
        if (wifiConfiguration.allowedKeyManagement.get(8)) {
            return WPA3_ONLY;
        }
        if (wifiConfiguration.allowedKeyManagement.get(1)) {
            return WPA2;
        }
        return null;
    }
}
