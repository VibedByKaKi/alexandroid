package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public enum AlexaCameraCaptureError implements Parcelable {
    UNKNOWN,
    CAMERA_FAILURE,
    OVERHEAT_PROTECTION,
    PRIVACY_MODE_ON,
    DEVICE_POWER_LOW,
    DEVICE_STORAGE_FULL,
    CAMERA_BLOCKED,
    SHUTTER_CLOSED,
    PERMISSION_ERROR,
    CAMERA_IN_USE,
    CAMERA_UNAVAILABLE,
    SESSION_ALREADY_ACTIVE,
    AUTO_CAPTURE_NOT_ENABLED,
    NO_ACTIVE_SESSION,
    SESSION_ALREADY_STOPPING;

    public static final Parcelable.Creator<AlexaCameraCaptureError> CREATOR = new Parcelable.Creator<AlexaCameraCaptureError>() { // from class: com.amazon.alexa.api.AlexaCameraCaptureError.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaCameraCaptureError createFromParcel(Parcel parcel) {
            return (AlexaCameraCaptureError) parcel.readSerializable();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaCameraCaptureError[] newArray(int i) {
            return new AlexaCameraCaptureError[i];
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
