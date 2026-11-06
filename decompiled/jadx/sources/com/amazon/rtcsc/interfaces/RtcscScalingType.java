package com.amazon.rtcsc.interfaces;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum RtcscScalingType implements Parcelable {
    SCALE_ASPECT_FIT,
    SCALE_ASPECT_FILL,
    SCALE_ASPECT_BALANCED;

    public static final Parcelable.Creator<RtcscScalingType> CREATOR = new Parcelable.Creator<RtcscScalingType>() { // from class: com.amazon.rtcsc.interfaces.RtcscScalingType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RtcscScalingType createFromParcel(Parcel parcel) {
            return RtcscScalingType.valueOf(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RtcscScalingType[] newArray(int i) {
            return new RtcscScalingType[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
