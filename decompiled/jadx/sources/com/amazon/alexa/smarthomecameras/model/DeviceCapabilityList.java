package com.amazon.alexa.smarthomecameras.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class DeviceCapabilityList implements Parcelable {
    public static final Parcelable.Creator<DeviceCapabilityList> CREATOR = new Parcelable.Creator<DeviceCapabilityList>() { // from class: com.amazon.alexa.smarthomecameras.model.DeviceCapabilityList.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceCapabilityList createFromParcel(Parcel parcel) {
            return new DeviceCapabilityList(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceCapabilityList[] newArray(int i) {
            return new DeviceCapabilityList[i];
        }
    };

    @SerializedName("capabilities")
    List<Capability> capabilities;

    public DeviceCapabilityList(Parcel parcel) {
        if (parcel.readByte() != 1) {
            this.capabilities = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.capabilities = arrayList;
        parcel.readList(arrayList, Capability.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<Capability> getCapabilities() {
        return this.capabilities;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (this.capabilities == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeList(this.capabilities);
        }
    }

    public DeviceCapabilityList(List<Capability> list) {
        this.capabilities = list;
    }
}
