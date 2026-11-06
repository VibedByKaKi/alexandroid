package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public enum AlexaVideoCaptureStopReason implements Parcelable {
    UNKNOWN,
    LOCAL_STOP,
    CLOUD_STOP,
    PRIVACY_MODE_ON,
    OVERHEAT_PROTECTION,
    DEVICE_POWER_LOW,
    CAMERA_FAILURE,
    DEVICE_STORAGE_FULL,
    CAMERA_BLOCKED,
    SHUTTER_CLOSED;

    public static final Parcelable.Creator<AlexaVideoCaptureStopReason> CREATOR = new Parcelable.Creator<AlexaVideoCaptureStopReason>() { // from class: com.amazon.alexa.api.AlexaVideoCaptureStopReason.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaVideoCaptureStopReason createFromParcel(Parcel parcel) {
            return (AlexaVideoCaptureStopReason) parcel.readSerializable();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaVideoCaptureStopReason[] newArray(int i) {
            return new AlexaVideoCaptureStopReason[i];
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
