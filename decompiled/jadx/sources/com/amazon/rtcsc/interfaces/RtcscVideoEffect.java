package com.amazon.rtcsc.interfaces;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum RtcscVideoEffect implements Parcelable {
    NO_EFFECT,
    FROST_EFFECT,
    UNKNOWN_EFFECT;

    public static final Parcelable.Creator<RtcscVideoEffect> CREATOR = new Parcelable.Creator<RtcscVideoEffect>() { // from class: com.amazon.rtcsc.interfaces.RtcscVideoEffect.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RtcscVideoEffect createFromParcel(Parcel parcel) {
            try {
                return RtcscVideoEffect.valueOf(parcel.readString());
            } catch (IllegalArgumentException unused) {
                return RtcscVideoEffect.UNKNOWN_EFFECT;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RtcscVideoEffect[] newArray(int i) {
            return new RtcscVideoEffect[i];
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
