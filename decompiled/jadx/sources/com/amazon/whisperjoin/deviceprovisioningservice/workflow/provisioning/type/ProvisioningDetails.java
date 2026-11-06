package com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.type;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.whisperjoin.common.sharedtypes.provisioning.data.provisioning.DeviceDetails;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ProvisioningDetails implements Parcelable {
    public static final Parcelable.Creator<ProvisioningDetails> CREATOR = new Parcelable.Creator<ProvisioningDetails>() { // from class: com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.type.ProvisioningDetails.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ProvisioningDetails createFromParcel(Parcel parcel) {
            return new ProvisioningDetails(parcel, 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ProvisioningDetails[] newArray(int i) {
            return new ProvisioningDetails[i];
        }
    };
    private AvailableWifiNetworks mAvailableWifiNetworks;
    private DeviceDetails mDeviceDetails;

    private ProvisioningDetails(Parcel parcel) {
        this.mDeviceDetails = (DeviceDetails) parcel.readParcelable(DeviceDetails.class.getClassLoader());
        this.mAvailableWifiNetworks = (AvailableWifiNetworks) parcel.readParcelable(AvailableWifiNetworks.class.getClassLoader());
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
            ProvisioningDetails provisioningDetails = (ProvisioningDetails) obj;
            if (Objects.equal(this.mDeviceDetails, provisioningDetails.mDeviceDetails) && Objects.equal(this.mAvailableWifiNetworks, provisioningDetails.mAvailableWifiNetworks)) {
                return true;
            }
        }
        return false;
    }

    public AvailableWifiNetworks getAvailableWifiNetworks() {
        return this.mAvailableWifiNetworks;
    }

    public DeviceDetails getDeviceDetails() {
        return this.mDeviceDetails;
    }

    public int hashCode() {
        return Objects.hashCode(this.mDeviceDetails, this.mAvailableWifiNetworks);
    }

    public ProvisioningDetails setAvailableWifiNetworks(AvailableWifiNetworks availableWifiNetworks) {
        this.mAvailableWifiNetworks = availableWifiNetworks;
        return this;
    }

    public ProvisioningDetails setDeviceDetails(DeviceDetails deviceDetails) {
        this.mDeviceDetails = deviceDetails;
        return this;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("mDeviceDetails", this.mDeviceDetails).add("mAvailableWifiNetworks", this.mAvailableWifiNetworks).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mDeviceDetails, i);
        parcel.writeParcelable(this.mAvailableWifiNetworks, i);
    }

    public ProvisioningDetails() {
    }

    public /* synthetic */ ProvisioningDetails(Parcel parcel, int i) {
        this(parcel);
    }
}
