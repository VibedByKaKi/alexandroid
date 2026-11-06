package com.amazon.rtcsc.interfaces;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum RtcscMediaDirection implements Parcelable {
    RTC_DIRECTION_UNSET,
    RTC_SEND_RECEIVE,
    RTC_RECEIVE_ONLY,
    RTC_SEND_ONLY,
    RTC_INACTIVE,
    RTC_OFF;

    public static final Parcelable.Creator<RtcscMediaDirection> CREATOR = new Parcelable.Creator<RtcscMediaDirection>() { // from class: com.amazon.rtcsc.interfaces.RtcscMediaDirection.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RtcscMediaDirection createFromParcel(Parcel parcel) {
            return RtcscMediaDirection.valueOf(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RtcscMediaDirection[] newArray(int i) {
            return new RtcscMediaDirection[i];
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
