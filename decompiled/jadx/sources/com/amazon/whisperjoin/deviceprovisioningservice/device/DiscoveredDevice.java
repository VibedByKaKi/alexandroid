package com.amazon.whisperjoin.deviceprovisioningservice.device;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.whisperjoin.common.sharedtypes.devices.WhisperJoinPeripheralDeviceDetailsV2;
import com.amazon.whisperjoin.common.sharedtypes.error.WJError;
import com.google.common.base.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DiscoveredDevice implements Parcelable {
    public static final Parcelable.Creator<DiscoveredDevice> CREATOR = new Parcelable.Creator<DiscoveredDevice>() { // from class: com.amazon.whisperjoin.deviceprovisioningservice.device.DiscoveredDevice.1
        private DiscoveredDevice createObjectFromParcel(Parcel parcel) {
            if (parcel == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null");
                return null;
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            boolean z = parcel.readInt() == 1;
            return new DiscoveredDevice(readString, readString2, readString3, z, z ? new WJError(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DiscoveredDevice createFromParcel(Parcel parcel) {
            return createObjectFromParcel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DiscoveredDevice[] newArray(int i) {
            return new DiscoveredDevice[i];
        }
    };
    private final String mAdvertisedName;
    private final String mDeviceIdentity;
    private final WJError mDistressError;
    private final boolean mDistressed;
    private final String mProductIndex;

    public DiscoveredDevice(WJProvisionee wJProvisionee) {
        this(wJProvisionee.getPeripheralDeviceDetails().getProductIndex(), wJProvisionee.getPeripheralDeviceDetails().getDeviceIdentity(), wJProvisionee.getPeripheralDeviceDetails().getFriendlyName(), wJProvisionee.getPeripheralDeviceDetails().isDistressed(), wJProvisionee.getPeripheralDeviceDetails().isDistressed() ? ((WhisperJoinPeripheralDeviceDetailsV2) wJProvisionee.getPeripheralDeviceDetails()).getDistressErrorObject() : null);
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
            DiscoveredDevice discoveredDevice = (DiscoveredDevice) obj;
            if (Objects.equal(this.mProductIndex, discoveredDevice.mProductIndex) && Objects.equal(this.mDeviceIdentity, discoveredDevice.mDeviceIdentity)) {
                return true;
            }
        }
        return false;
    }

    public String getAdvertisedName() {
        return this.mAdvertisedName;
    }

    public String getDeviceIdentity() {
        return this.mDeviceIdentity;
    }

    public WJError getDistressError() {
        return this.mDistressError;
    }

    public String getProductIndex() {
        return this.mProductIndex;
    }

    public int hashCode() {
        return Objects.hashCode(this.mProductIndex, this.mDeviceIdentity);
    }

    public boolean isDistressed() {
        return this.mDistressed;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mProductIndex);
        parcel.writeString(this.mDeviceIdentity);
        parcel.writeString(this.mAdvertisedName);
        parcel.writeInt(this.mDistressed ? 1 : 0);
        if (this.mDistressed) {
            this.mDistressError.writeToParcel(parcel, i);
        }
    }

    public DiscoveredDevice(String str, String str2) {
        this(str, str2, null, false, null);
    }

    public DiscoveredDevice(String str, String str2, String str3) {
        this(str, str2, str3, false, null);
    }

    public DiscoveredDevice(String str, String str2, String str3, boolean z, WJError wJError) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("productIndex can not be null");
            throw null;
        }
        if (str2 != null) {
            this.mAdvertisedName = str3;
            this.mProductIndex = str;
            this.mDeviceIdentity = str2;
            this.mDistressed = z;
            this.mDistressError = wJError;
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("deviceIdentity can not be null");
        throw null;
    }
}
