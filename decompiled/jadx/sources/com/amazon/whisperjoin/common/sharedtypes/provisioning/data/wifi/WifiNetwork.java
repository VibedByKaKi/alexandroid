package com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import com.amazon.whisperjoin.common.sharedtypes.utility.InputValidator;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class WifiNetwork implements Parcelable {
    public static final Parcelable.ClassLoaderCreator<WifiNetwork> CREATOR = new Parcelable.ClassLoaderCreator<WifiNetwork>() { // from class: com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiNetwork.1
        @Override // android.os.Parcelable.Creator
        public WifiNetwork createFromParcel(Parcel parcel) {
            if (parcel != null) {
                return new WifiNetwork(parcel, WifiNetwork.class.getClassLoader());
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public WifiNetwork[] newArray(int i) {
            if (i >= 0) {
                return new WifiNetwork[i];
            }
            Single$$ExternalSyntheticBUOutline0.m$3("size cannot be negative.");
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public WifiNetwork createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel != null) {
                return new WifiNetwork(parcel, classLoader);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }
    };
    protected String mSsid;
    protected WifiKeyManagement mWifiKeyManagement;
    protected WpaPskType mWpaPskType;

    public WifiNetwork(String str, WifiKeyManagement wifiKeyManagement, WpaPskType wpaPskType) throws IllegalArgumentException {
        if (str == null || !str.startsWith(DeviceConfigConstants.DOUBLE_QUOTE) || !str.endsWith(DeviceConfigConstants.DOUBLE_QUOTE)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Invalid wifi network. SSID is not quoted. Please use com.amazon.whisperjoin.common.sharedtypes.utility.InputValidator to validate wifi parameters.");
            throw null;
        }
        this.mSsid = AppLaunchChecker$$ExternalSyntheticOutline0.m(1, 1, str);
        this.mWifiKeyManagement = wifiKeyManagement;
        this.mWpaPskType = wpaPskType;
        validateInternal();
    }

    private void validateInternal() throws IllegalArgumentException {
        if (InputValidator.isValidSsid(getSsid()) && InputValidator.isValidWifiKeyManagement(this.mWifiKeyManagement)) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Invalid wifi network. Please use com.amazon.whisperjoin.common.sharedtypes.utility.InputValidator to validate wifi parameters.");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof WifiNetwork)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        WifiNetwork wifiNetwork = (WifiNetwork) obj;
        return this.mSsid.equals(wifiNetwork.mSsid) && this.mWifiKeyManagement.equals(wifiNetwork.mWifiKeyManagement);
    }

    public WifiKeyManagement getKeyManagement() {
        return this.mWifiKeyManagement;
    }

    public String getSsid() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder(DeviceConfigConstants.DOUBLE_QUOTE), this.mSsid, DeviceConfigConstants.DOUBLE_QUOTE);
    }

    public WpaPskType getWpaPskType() {
        return this.mWpaPskType;
    }

    public int hashCode() {
        return this.mWifiKeyManagement.ordinal() + ArcMode$$ExternalSyntheticOutline0.m(41, 41, this.mSsid);
    }

    public String toString() {
        return "WifiNetwork [ssid=--REDACTED--, key-mgmt=" + this.mWifiKeyManagement + MarkdownConstants.RIGHT_BRACKET;
    }

    public void validate() throws IllegalArgumentException {
        validateInternal();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("dest cannot be null.");
            return;
        }
        parcel.writeString(this.mSsid);
        parcel.writeInt(this.mWifiKeyManagement.ordinal());
        WpaPskType wpaPskType = this.mWpaPskType;
        if (wpaPskType != null) {
            parcel.writeInt(wpaPskType.ordinal());
        } else {
            parcel.writeInt(-1);
        }
    }

    public WifiNetwork(String str, WifiKeyManagement wifiKeyManagement) throws IllegalArgumentException {
        if (str != null && str.startsWith(DeviceConfigConstants.DOUBLE_QUOTE) && str.endsWith(DeviceConfigConstants.DOUBLE_QUOTE)) {
            this.mSsid = AppLaunchChecker$$ExternalSyntheticOutline0.m(1, 1, str);
            this.mWifiKeyManagement = wifiKeyManagement;
            validateInternal();
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Invalid wifi network. SSID is not quoted. Please use com.amazon.whisperjoin.common.sharedtypes.utility.InputValidator to validate wifi parameters.");
        throw null;
    }

    public WifiNetwork(WifiNetwork wifiNetwork) {
        this.mSsid = wifiNetwork.mSsid;
        this.mWifiKeyManagement = wifiNetwork.mWifiKeyManagement;
        this.mWpaPskType = wifiNetwork.mWpaPskType;
    }

    public WifiNetwork(Parcel parcel, ClassLoader classLoader) {
        this.mSsid = parcel.readString();
        this.mWifiKeyManagement = WifiKeyManagement.values()[parcel.readInt()];
        int readInt = parcel.readInt();
        if (readInt > -1) {
            this.mWpaPskType = WpaPskType.values()[readInt];
        }
        validateInternal();
    }
}
