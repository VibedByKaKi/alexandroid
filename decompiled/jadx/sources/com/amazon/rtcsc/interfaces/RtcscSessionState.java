package com.amazon.rtcsc.interfaces;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum RtcscSessionState implements Parcelable {
    SESSION_STATE_UNKNOWN,
    SESSION_PREPARING,
    SESSION_ACTIVE,
    SESSION_PAUSED,
    SESSION_FINISHING;

    public static final Parcelable.Creator<RtcscSessionState> CREATOR = new Parcelable.Creator<RtcscSessionState>() { // from class: com.amazon.rtcsc.interfaces.RtcscSessionState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RtcscSessionState createFromParcel(Parcel parcel) {
            try {
                return RtcscSessionState.valueOf(parcel.readString());
            } catch (IllegalArgumentException unused) {
                return RtcscSessionState.SESSION_STATE_UNKNOWN;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RtcscSessionState[] newArray(int i) {
            return new RtcscSessionState[i];
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
