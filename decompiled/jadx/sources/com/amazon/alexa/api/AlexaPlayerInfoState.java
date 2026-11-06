package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public enum AlexaPlayerInfoState implements Parcelable {
    PLAYING,
    PAUSED,
    DONE,
    BUFFERING,
    ERROR,
    CANCELLED,
    IDLE;

    public static final Parcelable.Creator<AlexaPlayerInfoState> CREATOR = new Parcelable.Creator<AlexaPlayerInfoState>() { // from class: com.amazon.alexa.api.AlexaPlayerInfoState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaPlayerInfoState createFromParcel(Parcel parcel) {
            return (AlexaPlayerInfoState) parcel.readSerializable();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaPlayerInfoState[] newArray(int i) {
            return new AlexaPlayerInfoState[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this);
    }
}
