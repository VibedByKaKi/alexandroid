package com.amazon.whisperjoin.deviceprovisioningservice.device;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DiscoveredDevices implements Parcelable {
    public static final Parcelable.Creator<DiscoveredDevice> CREATOR = new Parcelable.Creator<DiscoveredDevice>() { // from class: com.amazon.whisperjoin.deviceprovisioningservice.device.DiscoveredDevices.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DiscoveredDevice createFromParcel(Parcel parcel) {
            return DiscoveredDevice.CREATOR.createFromParcel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DiscoveredDevice[] newArray(int i) {
            return new DiscoveredDevice[i];
        }
    };
    private final ImmutableList<DiscoveredDevice> mDevices;

    public DiscoveredDevices(Parcel parcel) {
        ImmutableList.Builder builder = ImmutableList.builder();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            builder.add((ImmutableList.Builder) parcel.readParcelable(DiscoveredDevice.class.getClassLoader()));
        }
        this.mDevices = builder.build();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<DiscoveredDevice> getDevices() {
        return this.mDevices;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mDevices.size());
        UnmodifiableIterator<DiscoveredDevice> it2 = this.mDevices.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
    }

    public DiscoveredDevices(List<DiscoveredDevice> list) {
        Preconditions.checkNotNull(list);
        this.mDevices = ImmutableList.copyOf((Collection) list);
    }
}
