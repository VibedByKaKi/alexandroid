package com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi;

import android.net.wifi.ScanResult;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import com.amazon.whisperjoin.common.sharedtypes.utility.InputValidator;
import defpackage.a$$ExternalSyntheticOutline0;
import javax.annotation.Nonnull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class WifiScanResult extends WifiNetwork implements Comparable<WifiScanResult> {
    public static final Parcelable.ClassLoaderCreator<WifiScanResult> CREATOR = new Parcelable.ClassLoaderCreator<WifiScanResult>() { // from class: com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiScanResult.1
        @Override // android.os.Parcelable.Creator
        public WifiScanResult createFromParcel(Parcel parcel) {
            if (parcel != null) {
                return new WifiScanResult(parcel, WifiScanResult.class.getClassLoader());
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public WifiScanResult[] newArray(int i) {
            if (i >= 0) {
                return new WifiScanResult[i];
            }
            Single$$ExternalSyntheticBUOutline0.m$3("size cannot be negative.");
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public WifiScanResult createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel != null) {
                return new WifiScanResult(parcel, classLoader);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }
    };
    protected int mFrequencyBand;
    protected int mSignalStrength;

    public WifiScanResult(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.mFrequencyBand = parcel.readInt();
        this.mSignalStrength = parcel.readInt();
        validate();
    }

    public static WifiScanResult convertFromAndroidScanResult(ScanResult scanResult) {
        return new WifiScanResult(a$$ExternalSyntheticOutline0.m(new StringBuilder(DeviceConfigConstants.DOUBLE_QUOTE), scanResult.SSID, DeviceConfigConstants.DOUBLE_QUOTE), WifiKeyManagement.getWifiKeyManagement(scanResult), WpaPskType.getWpaPskType(scanResult), scanResult.frequency, scanResult.level);
    }

    @Override // java.lang.Comparable
    public int compareTo(@Nonnull WifiScanResult wifiScanResult) {
        int i = this.mSignalStrength;
        int i2 = wifiScanResult.mSignalStrength;
        int i3 = i < i2 ? 1 : i > i2 ? -1 : 0;
        if (i3 == 0) {
            i3 = this.mSsid.compareTo(wifiScanResult.mSsid);
        }
        return i3 == 0 ? this.mWifiKeyManagement.compareTo(wifiScanResult.mWifiKeyManagement) : i3;
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiNetwork, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiNetwork
    public boolean equals(Object obj) {
        if (obj instanceof WifiScanResult) {
            WifiScanResult wifiScanResult = (WifiScanResult) obj;
            if (super.equals(obj) && this.mFrequencyBand == wifiScanResult.mFrequencyBand) {
                return true;
            }
        }
        return false;
    }

    public int getFrequencyBand() {
        return this.mFrequencyBand;
    }

    public int getSignalStrength() {
        return this.mSignalStrength;
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiNetwork
    public int hashCode() {
        return ((super.hashCode() + 41) * 41) + this.mFrequencyBand;
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiNetwork
    public String toString() {
        StringBuilder sb = new StringBuilder("WifiScanResult [ssid=--REDACTED--, key-mgmt=");
        sb.append(this.mWifiKeyManagement);
        sb.append(", freq=");
        sb.append(this.mFrequencyBand);
        sb.append(", rssi=");
        return a$$ExternalSyntheticOutline0.m(sb, this.mSignalStrength, MarkdownConstants.RIGHT_BRACKET);
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiNetwork
    public void validate() {
        super.validate();
        if (InputValidator.isValidFrequency(this.mFrequencyBand)) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Frequency of Wifi network cannot be negative. Please use com.amazon.whisperjoin.common.sharedtypes.utility.InputValidator methods to validate parameters.");
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiNetwork, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("dest cannot be null.");
            return;
        }
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.mFrequencyBand);
        parcel.writeInt(this.mSignalStrength);
    }

    public WifiScanResult(String str, WifiKeyManagement wifiKeyManagement, int i, int i2) throws IllegalArgumentException {
        super(str, wifiKeyManagement);
        this.mFrequencyBand = i;
        this.mSignalStrength = InputValidator.getValidRssi(i2);
        validate();
    }

    public WifiScanResult(String str, WifiKeyManagement wifiKeyManagement, WpaPskType wpaPskType, int i, int i2) throws IllegalArgumentException {
        super(str, wifiKeyManagement, wpaPskType);
        this.mFrequencyBand = i;
        this.mSignalStrength = InputValidator.getValidRssi(i2);
        validate();
    }

    public WifiScanResult(String str, WifiKeyManagement wifiKeyManagement) throws IllegalArgumentException {
        this(str, wifiKeyManagement, 0, -100);
    }
}
