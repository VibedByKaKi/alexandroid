package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public enum AlexaCameraCaptureInitiator implements Parcelable {
    GESTURE,
    VOICE,
    AUTO_CAPTURE;

    public static final Parcelable.Creator<AlexaCameraCaptureInitiator> CREATOR = new Parcelable.Creator<AlexaCameraCaptureInitiator>() { // from class: com.amazon.alexa.api.AlexaCameraCaptureInitiator.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaCameraCaptureInitiator createFromParcel(Parcel parcel) {
            return (AlexaCameraCaptureInitiator) parcel.readSerializable();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaCameraCaptureInitiator[] newArray(int i) {
            return new AlexaCameraCaptureInitiator[i];
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
