package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaMetricsTime implements Parcelable {
    public static final Parcelable.Creator<AlexaMetricsTime> CREATOR = new Parcelable.Creator<AlexaMetricsTime>() { // from class: com.amazon.alexa.api.AlexaMetricsTime.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaMetricsTime createFromParcel(Parcel parcel) {
            return new AlexaMetricsTime(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaMetricsTime[] newArray(int i) {
            return new AlexaMetricsTime[i];
        }
    };
    private static final String MILLISECOND = "ms";
    private final String timeUnit;
    private final long timerValue;

    public AlexaMetricsTime(Parcel parcel) {
        this.timerValue = parcel.readLong();
        this.timeUnit = parcel.readString();
    }

    public static AlexaMetricsTime create(long j) {
        return new AlexaMetricsTime(j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public String getTimeUnit() {
        return this.timeUnit;
    }

    public long getTimerValue() {
        return this.timerValue;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.timerValue);
        parcel.writeString(this.timeUnit);
    }

    public AlexaMetricsTime(long j, String str) {
        this.timerValue = j;
        this.timeUnit = str;
    }

    public AlexaMetricsTime(long j) {
        this(j, MILLISECOND);
    }
}
