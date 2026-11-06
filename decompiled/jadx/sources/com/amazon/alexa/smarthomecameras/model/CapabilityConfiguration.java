package com.amazon.alexa.smarthomecameras.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.VisibleForTesting;
import com.google.gson.annotations.SerializedName;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class CapabilityConfiguration implements Parcelable {
    public static final Parcelable.Creator<CapabilityConfiguration> CREATOR = new Parcelable.Creator<CapabilityConfiguration>() { // from class: com.amazon.alexa.smarthomecameras.model.CapabilityConfiguration.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CapabilityConfiguration createFromParcel(Parcel parcel) {
            return new CapabilityConfiguration(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CapabilityConfiguration[] newArray(int i) {
            return new CapabilityConfiguration[i];
        }
    };

    @SerializedName("isFullDuplexAudioSupported")
    boolean isFullDuplexAudioSupported;

    public CapabilityConfiguration(Parcel parcel) {
        this.isFullDuplexAudioSupported = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.isFullDuplexAudioSupported ? (byte) 1 : (byte) 0);
    }

    @VisibleForTesting
    public CapabilityConfiguration(boolean z) {
        this.isFullDuplexAudioSupported = z;
    }
}
