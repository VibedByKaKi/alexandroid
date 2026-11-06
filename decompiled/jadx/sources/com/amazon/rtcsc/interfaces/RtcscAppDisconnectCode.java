package com.amazon.rtcsc.interfaces;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum RtcscAppDisconnectCode implements Parcelable {
    USER_TERMINATED_SESSION,
    USER_DECLINED_SESSION,
    APPCLIENT_NOT_FOUND,
    APPCLIENT_START_FAILED,
    PERMISSION_CHECKS_FAILED,
    DEVICE_UNAVAILABLE,
    CAMERA_UNAVAILABLE,
    HIGHER_PRIORITY_SESSION_ONGOING,
    HIGHER_PRIORITY_SESSION_INTERRUPTED,
    SESSION_DOMAIN_ERROR;

    public static final Parcelable.Creator<RtcscAppDisconnectCode> CREATOR = new Parcelable.Creator<RtcscAppDisconnectCode>() { // from class: com.amazon.rtcsc.interfaces.RtcscAppDisconnectCode.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RtcscAppDisconnectCode createFromParcel(Parcel parcel) {
            try {
                return RtcscAppDisconnectCode.valueOf(parcel.readString());
            } catch (IllegalArgumentException unused) {
                return RtcscAppDisconnectCode.PERMISSION_CHECKS_FAILED;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RtcscAppDisconnectCode[] newArray(int i) {
            return new RtcscAppDisconnectCode[i];
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
