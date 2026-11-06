package com.amazon.whisperjoin.common.sharedtypes.provisioning.data.provisioning;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.whisperjoin.common.sharedtypes.provisioning.data.configuration.DataMap;
import com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiConnectionDetails;
import com.google.common.base.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DeviceDetails implements Parcelable {
    public static final Parcelable.ClassLoaderCreator<DeviceDetails> CREATOR = new Parcelable.ClassLoaderCreator<DeviceDetails>() { // from class: com.amazon.whisperjoin.common.sharedtypes.provisioning.data.provisioning.DeviceDetails.1
        private DeviceDetails createObjectFromParcel(Parcel parcel) {
            if (parcel == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
                return null;
            }
            return new DeviceDetails(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), DataMap.CREATOR.createFromParcel(parcel), parcel.readInt() == 1 ? WifiConnectionDetails.CREATOR.createFromParcel(parcel) : null, parcel.readInt() == 1 ? parcel.readString() : null);
        }

        @Override // android.os.Parcelable.Creator
        public DeviceDetails[] newArray(int i) {
            if (i >= 0) {
                return new DeviceDetails[i];
            }
            Single$$ExternalSyntheticBUOutline0.m$3("size cannot be negative.");
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public DeviceDetails createFromParcel(Parcel parcel) {
            return createObjectFromParcel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public DeviceDetails createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return createObjectFromParcel(parcel);
        }
    };
    private final boolean hasLastConnectionWifiDetails;
    private final boolean hasSdkVersion;
    private final DataMap mDeviceCapabilitiesMap;
    private final String mDeviceFirmwareRevision;
    private final String mDeviceHardwareRevision;
    private final String mDeviceModelNumber;
    private final String mDeviceSerialNumber;
    private final WifiConnectionDetails mLastConnectionWifiDetails;
    private final String mManufacturer;
    private final String mSDKVersion;

    public DeviceDetails(String str, String str2, String str3, String str4, String str5, DataMap dataMap, WifiConnectionDetails wifiConnectionDetails, String str6) {
        this.mManufacturer = str;
        this.mDeviceModelNumber = str2;
        this.mDeviceSerialNumber = str3;
        this.mDeviceHardwareRevision = str4;
        this.mDeviceFirmwareRevision = str5;
        this.mDeviceCapabilitiesMap = dataMap;
        this.mLastConnectionWifiDetails = wifiConnectionDetails;
        this.mSDKVersion = str6;
        this.hasSdkVersion = str6 != null;
        this.hasLastConnectionWifiDetails = wifiConnectionDetails != null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DeviceDetails deviceDetails = (DeviceDetails) obj;
            if (Objects.equal(this.mManufacturer, deviceDetails.mManufacturer) && Objects.equal(this.mDeviceModelNumber, deviceDetails.mDeviceModelNumber) && Objects.equal(this.mDeviceSerialNumber, deviceDetails.mDeviceSerialNumber) && Objects.equal(this.mDeviceHardwareRevision, deviceDetails.mDeviceHardwareRevision) && Objects.equal(this.mDeviceFirmwareRevision, deviceDetails.mDeviceFirmwareRevision) && Objects.equal(this.mSDKVersion, deviceDetails.mSDKVersion) && Objects.equal(this.mDeviceCapabilitiesMap, deviceDetails.mDeviceCapabilitiesMap) && Objects.equal(this.mLastConnectionWifiDetails, deviceDetails.mLastConnectionWifiDetails)) {
                return true;
            }
        }
        return false;
    }

    public DataMap getDeviceCapabilitiesMap() {
        return this.mDeviceCapabilitiesMap;
    }

    public String getDeviceFirmwareRevision() {
        return this.mDeviceFirmwareRevision;
    }

    public String getDeviceHardwareRevision() {
        return this.mDeviceHardwareRevision;
    }

    public String getDeviceModelNumber() {
        return this.mDeviceModelNumber;
    }

    public String getDeviceSerialNumber() {
        return this.mDeviceSerialNumber;
    }

    public WifiConnectionDetails getLastConnectionWifiDetails() {
        return this.mLastConnectionWifiDetails;
    }

    public String getManufacturer() {
        return this.mManufacturer;
    }

    public String getSdkVersion() {
        return this.mSDKVersion;
    }

    public boolean hasLastConnectionWifiDetails() {
        return this.hasLastConnectionWifiDetails;
    }

    public int hashCode() {
        return Objects.hashCode(this.mManufacturer, this.mDeviceModelNumber, this.mDeviceSerialNumber, this.mDeviceHardwareRevision, this.mDeviceFirmwareRevision, this.mSDKVersion, this.mDeviceCapabilitiesMap, this.mLastConnectionWifiDetails);
    }

    public String toString() {
        return "DeviceDetails{mManufacturer='" + this.mManufacturer + "', mDeviceModelNumber='" + this.mDeviceModelNumber + "', mDeviceSerialNumber='" + this.mDeviceSerialNumber + "', mDeviceHardwareRevision='" + this.mDeviceHardwareRevision + "', mDeviceFirmwareRevision='" + this.mDeviceFirmwareRevision + "', mDeviceCapabilitiesMap=" + this.mDeviceCapabilitiesMap + ", mSDKVersion='" + this.mSDKVersion + "', mLastConnectionWifiDetails=" + this.mLastConnectionWifiDetails + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("parcel cannot be null.");
            return;
        }
        parcel.writeString(this.mManufacturer);
        parcel.writeString(this.mDeviceModelNumber);
        parcel.writeString(this.mDeviceSerialNumber);
        parcel.writeString(this.mDeviceHardwareRevision);
        parcel.writeString(this.mDeviceFirmwareRevision);
        this.mDeviceCapabilitiesMap.writeToParcel(parcel, i);
        parcel.writeInt(this.hasLastConnectionWifiDetails ? 1 : 0);
        parcel.writeInt(this.hasSdkVersion ? 1 : 0);
        if (hasLastConnectionWifiDetails()) {
            this.mLastConnectionWifiDetails.writeToParcel(parcel, i);
        }
        if (this.hasSdkVersion) {
            parcel.writeString(this.mSDKVersion);
        }
    }

    public DeviceDetails(String str, String str2, String str3, String str4, String str5, DataMap dataMap, String str6) {
        this(str, str2, str3, str4, str5, dataMap, null, str6);
    }

    public DeviceDetails(String str, String str2, String str3, String str4, String str5, DataMap dataMap, WifiConnectionDetails wifiConnectionDetails) {
        this(str, str2, str3, str4, str5, dataMap, wifiConnectionDetails, null);
    }

    public DeviceDetails(String str, String str2, String str3, String str4, String str5, DataMap dataMap) {
        this(str, str2, str3, str4, str5, dataMap, null, null);
    }
}
