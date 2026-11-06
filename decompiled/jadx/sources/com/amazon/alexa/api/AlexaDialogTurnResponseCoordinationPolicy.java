package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public enum AlexaDialogTurnResponseCoordinationPolicy implements Parcelable {
    SHALLOW,
    DEEP;

    public static final Parcelable.Creator<AlexaDialogTurnResponseCoordinationPolicy> CREATOR = new Parcelable.Creator<AlexaDialogTurnResponseCoordinationPolicy>() { // from class: com.amazon.alexa.api.AlexaDialogTurnResponseCoordinationPolicy.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaDialogTurnResponseCoordinationPolicy createFromParcel(Parcel parcel) {
            return AlexaDialogTurnResponseCoordinationPolicy.values()[parcel.readInt()];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaDialogTurnResponseCoordinationPolicy[] newArray(int i) {
            return new AlexaDialogTurnResponseCoordinationPolicy[i];
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
