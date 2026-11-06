package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaPayload implements Parcelable {
    public static final Parcelable.Creator<AlexaPayload> CREATOR = new Parcelable.Creator<AlexaPayload>() { // from class: com.amazon.alexa.api.AlexaPayload.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaPayload createFromParcel(Parcel parcel) {
            return new AlexaPayload(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaPayload[] newArray(int i) {
            return new AlexaPayload[i];
        }
    };
    private final String payload;

    public AlexaPayload(Parcel parcel) {
        this.payload = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getPayload() {
        return this.payload;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.payload);
    }

    public AlexaPayload(String str) {
        this.payload = str;
    }
}
