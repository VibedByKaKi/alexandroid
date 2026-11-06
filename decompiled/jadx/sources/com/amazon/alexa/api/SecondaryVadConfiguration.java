package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class SecondaryVadConfiguration implements Parcelable {
    public static final Parcelable.Creator<SecondaryVadConfiguration> CREATOR = new Parcelable.Creator<SecondaryVadConfiguration>() { // from class: com.amazon.alexa.api.SecondaryVadConfiguration.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SecondaryVadConfiguration createFromParcel(Parcel parcel) {
            return new SecondaryVadConfiguration(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SecondaryVadConfiguration[] newArray(int i) {
            return new SecondaryVadConfiguration[i];
        }
    };
    private static final float DEFAULT_SPEECH_THRESHOLD = 0.0f;
    private static final long DEFAULT_VERIFICATION_TIMEOUT_MS = 0;
    private final float speechThreshold;
    private final long verificationTimeoutMs;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private float speechThreshold;
        private long verificationTimeoutMs;

        private Builder() {
            this.speechThreshold = 0.0f;
            this.verificationTimeoutMs = 0L;
        }

        public SecondaryVadConfiguration build() {
            return new SecondaryVadConfiguration(this);
        }

        public Builder setSpeechThreshold(float f) {
            this.speechThreshold = f;
            return this;
        }

        public Builder setVerificationTimeoutMs(long j) {
            this.verificationTimeoutMs = j;
            return this;
        }
    }

    private SecondaryVadConfiguration(Builder builder) {
        this.speechThreshold = builder.speechThreshold;
        this.verificationTimeoutMs = builder.verificationTimeoutMs;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getSpeechThreshold() {
        return this.speechThreshold;
    }

    public long getVerificationTimeoutMs() {
        return this.verificationTimeoutMs;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.speechThreshold);
        parcel.writeLong(this.verificationTimeoutMs);
    }

    private SecondaryVadConfiguration(Parcel parcel) {
        this.speechThreshold = parcel.readFloat();
        this.verificationTimeoutMs = parcel.readLong();
    }
}
