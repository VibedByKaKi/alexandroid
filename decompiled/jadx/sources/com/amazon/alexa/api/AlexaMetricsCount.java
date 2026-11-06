package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaMetricsCount implements Parcelable {
    public static final Parcelable.Creator<AlexaMetricsCount> CREATOR = new Parcelable.Creator<AlexaMetricsCount>() { // from class: com.amazon.alexa.api.AlexaMetricsCount.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaMetricsCount createFromParcel(Parcel parcel) {
            return new AlexaMetricsCount(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaMetricsCount[] newArray(int i) {
            return new AlexaMetricsCount[i];
        }
    };
    private final int counterValue;

    public AlexaMetricsCount(Parcel parcel) {
        this.counterValue = parcel.readInt();
    }

    public static AlexaMetricsCount create(int i) {
        return new AlexaMetricsCount(i);
    }

    public static AlexaMetricsCount createOne() {
        return create(1);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public int getCounterValue() {
        return this.counterValue;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.counterValue);
    }

    public AlexaMetricsCount(int i) {
        this.counterValue = i;
    }
}
