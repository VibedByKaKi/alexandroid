package com.amazon.alexa.handsfree.latencyreporter;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.alexa.client.annotations.NonNull;
import com.amazon.alexa.client.annotations.Nullable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class LatencyTimestamp implements Parcelable {
    public static final Parcelable.Creator<LatencyTimestamp> CREATOR = new Parcelable.Creator<LatencyTimestamp>() { // from class: com.amazon.alexa.handsfree.latencyreporter.LatencyTimestamp.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public LatencyTimestamp createFromParcel(@NonNull Parcel parcel) {
            return new LatencyTimestamp(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public LatencyTimestamp[] newArray(int i) {
            return new LatencyTimestamp[i];
        }
    };
    private final String mIdentifier;
    private final Latency mLatency;
    private final long mTimestamp;
    private final TimestampType mTimestampType;

    public LatencyTimestamp(@NonNull Parcel parcel) {
        this.mTimestamp = parcel.readLong();
        this.mLatency = Latency.valueOf(parcel.readString());
        this.mTimestampType = TimestampType.valueOf(parcel.readString());
        this.mIdentifier = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatencyTimestamp)) {
            return false;
        }
        LatencyTimestamp latencyTimestamp = (LatencyTimestamp) obj;
        String str = this.mIdentifier;
        Latency latency = this.mLatency;
        return str == null ? latency == latencyTimestamp.getLatency() && this.mTimestampType == latencyTimestamp.mTimestampType && latencyTimestamp.getIdentifier() == null : latency == latencyTimestamp.getLatency() && this.mTimestampType == latencyTimestamp.mTimestampType && this.mIdentifier.equals(latencyTimestamp.getIdentifier());
    }

    @Nullable
    public String getIdentifier() {
        return this.mIdentifier;
    }

    @NonNull
    public Latency getLatency() {
        return this.mLatency;
    }

    public long getTimestamp() {
        return this.mTimestamp;
    }

    @NonNull
    public TimestampType getTimestampType() {
        return this.mTimestampType;
    }

    public int hashCode() {
        return Objects.hash(this.mLatency, this.mTimestampType, this.mIdentifier);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeLong(this.mTimestamp);
        parcel.writeString(this.mLatency.name());
        parcel.writeString(this.mTimestampType.name());
        parcel.writeString(this.mIdentifier);
    }

    public LatencyTimestamp(@NonNull Latency latency, @NonNull TimestampType timestampType, @Nullable String str, long j) {
        this.mLatency = latency;
        this.mTimestampType = timestampType;
        this.mIdentifier = str;
        this.mTimestamp = j;
    }
}
