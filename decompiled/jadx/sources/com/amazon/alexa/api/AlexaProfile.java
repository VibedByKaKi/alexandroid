package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public enum AlexaProfile implements Parcelable {
    CLOSE_TALK,
    NEAR_FIELD,
    FAR_FIELD;

    public static final Parcelable.Creator<AlexaProfile> CREATOR = new Parcelable.Creator<AlexaProfile>() { // from class: com.amazon.alexa.api.AlexaProfile.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaProfile createFromParcel(Parcel parcel) {
            return (AlexaProfile) parcel.readSerializable();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaProfile[] newArray(int i) {
            return new AlexaProfile[i];
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
