package com.amazon.rtcsc.interfaces;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum RtcscAudioFocusConfig implements Parcelable {
    NONE,
    GAIN_TRANSIENT;

    public static final Parcelable.Creator<RtcscAudioFocusConfig> CREATOR = new Parcelable.Creator<RtcscAudioFocusConfig>() { // from class: com.amazon.rtcsc.interfaces.RtcscAudioFocusConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RtcscAudioFocusConfig createFromParcel(Parcel parcel) {
            return RtcscAudioFocusConfig.valueOf(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RtcscAudioFocusConfig[] newArray(int i) {
            return new RtcscAudioFocusConfig[i];
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
