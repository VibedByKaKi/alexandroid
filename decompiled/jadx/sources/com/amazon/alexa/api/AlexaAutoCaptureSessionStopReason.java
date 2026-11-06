package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public enum AlexaAutoCaptureSessionStopReason implements Parcelable {
    UNKNOWN,
    USER_LOCAL_STOP,
    CLOUD_STOP,
    TIMEOUT,
    DEVICE_DISCONNECTED,
    PRIVACY_MODE_ON,
    ASSET_CAPTURE_FAILED,
    LOCAL_INTERRUPTION;

    public static final Parcelable.Creator<AlexaAutoCaptureSessionStopReason> CREATOR = new Parcelable.Creator<AlexaAutoCaptureSessionStopReason>() { // from class: com.amazon.alexa.api.AlexaAutoCaptureSessionStopReason.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaAutoCaptureSessionStopReason createFromParcel(Parcel parcel) {
            return (AlexaAutoCaptureSessionStopReason) parcel.readSerializable();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaAutoCaptureSessionStopReason[] newArray(int i) {
            return new AlexaAutoCaptureSessionStopReason[i];
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
