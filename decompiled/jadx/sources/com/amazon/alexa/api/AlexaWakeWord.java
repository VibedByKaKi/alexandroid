package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaWakeWord implements Parcelable {
    public static final Parcelable.Creator<AlexaWakeWord> CREATOR = new Parcelable.Creator<AlexaWakeWord>() { // from class: com.amazon.alexa.api.AlexaWakeWord.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaWakeWord createFromParcel(Parcel parcel) {
            return new AlexaWakeWord(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaWakeWord[] newArray(int i) {
            return new AlexaWakeWord[i];
        }
    };
    private final long endIndexInSamples;
    private final String name;
    private final long startIndexInSamples;
    private final long wakeWordDetectedElapsedRealTimeMillis;

    public AlexaWakeWord(Parcel parcel) {
        this(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readLong());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getEndIndexInSamples() {
        return this.endIndexInSamples;
    }

    public long getStartIndexInSamples() {
        return this.startIndexInSamples;
    }

    public long getWakeWordDetectedElapsedRealTimeMillis() {
        return this.wakeWordDetectedElapsedRealTimeMillis;
    }

    public String getWakeWordName() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeLong(this.startIndexInSamples);
        parcel.writeLong(this.endIndexInSamples);
        parcel.writeLong(this.wakeWordDetectedElapsedRealTimeMillis);
    }

    public AlexaWakeWord(String str, long j, long j2, long j3) {
        this.name = str;
        this.startIndexInSamples = j;
        this.endIndexInSamples = j2;
        this.wakeWordDetectedElapsedRealTimeMillis = j3;
    }

    public AlexaWakeWord(String str, long j, long j2) {
        this(str, j, j2, SystemClock.elapsedRealtime());
    }
}
