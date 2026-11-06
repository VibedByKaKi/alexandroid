package com.amazon.rtcsc.interfaces;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum RtcscMediaConnectionState implements Parcelable {
    MEDIA_CONNECTING,
    MEDIA_CONNECTED,
    MEDIA_DISCONNECTED,
    UNKNOWN_MEDIA_CONNECTION_STATE;

    public static final Parcelable.Creator<RtcscMediaConnectionState> CREATOR = new Parcelable.Creator<RtcscMediaConnectionState>() { // from class: com.amazon.rtcsc.interfaces.RtcscMediaConnectionState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RtcscMediaConnectionState createFromParcel(Parcel parcel) {
            try {
                return RtcscMediaConnectionState.valueOf(parcel.readString());
            } catch (IllegalArgumentException unused) {
                return RtcscMediaConnectionState.UNKNOWN_MEDIA_CONNECTION_STATE;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RtcscMediaConnectionState[] newArray(int i) {
            return new RtcscMediaConnectionState[i];
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
