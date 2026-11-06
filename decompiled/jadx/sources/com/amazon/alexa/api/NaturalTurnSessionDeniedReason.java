package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public enum NaturalTurnSessionDeniedReason implements Parcelable {
    PROVIDER_NOT_REGISTERED,
    ANOTHER_SESSION_ACTIVE,
    FEATURE_UNAVAILABLE,
    UNKNOWN;

    public static final Parcelable.Creator<NaturalTurnSessionDeniedReason> CREATOR = new Parcelable.Creator<NaturalTurnSessionDeniedReason>() { // from class: com.amazon.alexa.api.NaturalTurnSessionDeniedReason.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NaturalTurnSessionDeniedReason createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            NaturalTurnSessionDeniedReason[] values = NaturalTurnSessionDeniedReason.values();
            return (readInt < 0 || readInt >= values.length) ? NaturalTurnSessionDeniedReason.UNKNOWN : values[readInt];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NaturalTurnSessionDeniedReason[] newArray(int i) {
            return new NaturalTurnSessionDeniedReason[i];
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
