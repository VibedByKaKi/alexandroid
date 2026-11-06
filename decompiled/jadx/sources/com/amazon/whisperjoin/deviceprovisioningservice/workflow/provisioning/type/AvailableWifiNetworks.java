package com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.type;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AvailableWifiNetworks implements Parcelable {
    public static final Parcelable.Creator<AvailableWifiNetworks> CREATOR = new Parcelable.Creator<AvailableWifiNetworks>() { // from class: com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.type.AvailableWifiNetworks.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AvailableWifiNetworks createFromParcel(Parcel parcel) {
            return new AvailableWifiNetworks(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AvailableWifiNetworks[] newArray(int i) {
            return new AvailableWifiNetworks[i];
        }
    };
    private List<AvailableWifiNetwork> mConfiguredNetworks;
    private boolean mHasPreferred;
    private AvailableWifiNetwork mPreferred;
    private List<AvailableWifiNetwork> mUnrecognizedNetworks;

    public AvailableWifiNetworks(Parcel parcel) {
        this.mConfiguredNetworks = parcel.readArrayList(AvailableWifiNetwork.class.getClassLoader());
        this.mUnrecognizedNetworks = parcel.readArrayList(AvailableWifiNetwork.class.getClassLoader());
        boolean z = parcel.readInt() == 1;
        this.mHasPreferred = z;
        if (z) {
            this.mPreferred = (AvailableWifiNetwork) parcel.readParcelable(AvailableWifiNetwork.class.getClassLoader());
        } else {
            this.mPreferred = null;
        }
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
            AvailableWifiNetworks availableWifiNetworks = (AvailableWifiNetworks) obj;
            if (this.mHasPreferred != availableWifiNetworks.mHasPreferred || !this.mConfiguredNetworks.equals(availableWifiNetworks.mConfiguredNetworks) || !this.mUnrecognizedNetworks.equals(availableWifiNetworks.mUnrecognizedNetworks)) {
                return false;
            }
            AvailableWifiNetwork availableWifiNetwork = this.mPreferred;
            AvailableWifiNetwork availableWifiNetwork2 = availableWifiNetworks.mPreferred;
            if (availableWifiNetwork != null) {
                return availableWifiNetwork.equals(availableWifiNetwork2);
            }
            if (availableWifiNetwork2 == null) {
                return true;
            }
        }
        return false;
    }

    public List<AvailableWifiNetwork> getConfiguredNetworks() {
        return Collections.unmodifiableList(this.mConfiguredNetworks);
    }

    public AvailableWifiNetwork getPreferredConfiguredNetwork() {
        return this.mPreferred;
    }

    public List<AvailableWifiNetwork> getUnrecognizedNetworks() {
        return Collections.unmodifiableList(this.mUnrecognizedNetworks);
    }

    public boolean hasPreferred() {
        return this.mHasPreferred;
    }

    public int hashCode() {
        int hashCode = (((this.mUnrecognizedNetworks.hashCode() + (this.mConfiguredNetworks.hashCode() * 31)) * 31) + (this.mHasPreferred ? 1 : 0)) * 31;
        AvailableWifiNetwork availableWifiNetwork = this.mPreferred;
        return hashCode + (availableWifiNetwork != null ? availableWifiNetwork.hashCode() : 0);
    }

    public String toString() {
        Locale locale = Locale.ENGLISH;
        return a$$ExternalSyntheticOutline0.m("AvailableWifiNetworks Configured Count: ", this.mConfiguredNetworks.size(), ", Unrecognized Count: ", this.mUnrecognizedNetworks.size());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.mConfiguredNetworks);
        parcel.writeList(this.mUnrecognizedNetworks);
        parcel.writeInt(this.mHasPreferred ? 1 : 0);
        if (this.mHasPreferred) {
            parcel.writeParcelable(this.mPreferred, i);
        }
    }

    public AvailableWifiNetworks(List<AvailableWifiNetwork> list, List<AvailableWifiNetwork> list2, AvailableWifiNetwork availableWifiNetwork) {
        this.mConfiguredNetworks = list;
        this.mUnrecognizedNetworks = list2;
        this.mPreferred = availableWifiNetwork;
        this.mHasPreferred = availableWifiNetwork != null;
    }
}
