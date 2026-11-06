package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public enum NaturalTurnSessionState implements Parcelable {
    INACTIVE,
    ACTIVE,
    MUTED;

    public static final Parcelable.Creator<NaturalTurnSessionState> CREATOR = new Parcelable.Creator<NaturalTurnSessionState>() { // from class: com.amazon.alexa.api.NaturalTurnSessionState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NaturalTurnSessionState createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            NaturalTurnSessionState[] values = NaturalTurnSessionState.values();
            return (readInt < 0 || readInt >= values.length) ? NaturalTurnSessionState.INACTIVE : values[readInt];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NaturalTurnSessionState[] newArray(int i) {
            return new NaturalTurnSessionState[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
