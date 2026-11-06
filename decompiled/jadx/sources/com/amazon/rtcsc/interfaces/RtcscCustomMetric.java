package com.amazon.rtcsc.interfaces;

import android.os.Parcel;
import android.os.Parcelable;
import lombok.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class RtcscCustomMetric implements Parcelable {
    public static final Parcelable.Creator<RtcscCustomMetric> CREATOR = new Parcelable.Creator<RtcscCustomMetric>() { // from class: com.amazon.rtcsc.interfaces.RtcscCustomMetric.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RtcscCustomMetric createFromParcel(Parcel parcel) {
            return new RtcscCustomMetric(parcel.readString(), parcel.readString(), (Timer[]) parcel.createTypedArray(Timer.CREATOR), (Counter[]) parcel.createTypedArray(Counter.CREATOR), (Metadata[]) parcel.createTypedArray(Metadata.CREATOR), Priority.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RtcscCustomMetric[] newArray(int i) {
            return new RtcscCustomMetric[i];
        }
    };
    public Counter[] mCounters;
    public Metadata[] mMetadata;
    public Priority mPriority;
    public String mProgramName;
    public String mSourceName;
    public Timer[] mTimers;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Counter implements Parcelable {
        public static final Parcelable.Creator<Counter> CREATOR = new Parcelable.Creator<Counter>() { // from class: com.amazon.rtcsc.interfaces.RtcscCustomMetric.Counter.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Counter createFromParcel(Parcel parcel) {
                return new Counter(parcel.readString(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Counter[] newArray(int i) {
                return new Counter[i];
            }
        };
        public String mName;
        public int mValue;

        public Counter(@NonNull String str, int i) {
            if (str == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("name is marked non-null but is null");
                throw null;
            }
            this.mName = str;
            this.mValue = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mName);
            parcel.writeInt(this.mValue);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Metadata implements Parcelable {
        public static final Parcelable.Creator<Metadata> CREATOR = new Parcelable.Creator<Metadata>() { // from class: com.amazon.rtcsc.interfaces.RtcscCustomMetric.Metadata.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Metadata createFromParcel(Parcel parcel) {
                return new Metadata(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Metadata[] newArray(int i) {
                return new Metadata[i];
            }
        };
        public String mName;
        public String mValue;

        public Metadata(@NonNull String str, @NonNull String str2) {
            if (str == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("name is marked non-null but is null");
                throw null;
            }
            if (str2 == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("value is marked non-null but is null");
                throw null;
            }
            this.mName = str;
            this.mValue = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mName);
            parcel.writeString(this.mValue);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Priority {
        NORMAL,
        HIGH,
        CRITICAL
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Timer implements Parcelable {
        public static final Parcelable.Creator<Timer> CREATOR = new Parcelable.Creator<Timer>() { // from class: com.amazon.rtcsc.interfaces.RtcscCustomMetric.Timer.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Timer createFromParcel(Parcel parcel) {
                return new Timer(parcel.readString(), parcel.readDouble());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Timer[] newArray(int i) {
                return new Timer[i];
            }
        };
        public String mName;
        public double mValue;

        public Timer(@NonNull String str, double d) {
            if (str == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("name is marked non-null but is null");
                throw null;
            }
            this.mName = str;
            this.mValue = d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mName);
            parcel.writeDouble(this.mValue);
        }
    }

    public RtcscCustomMetric(@NonNull String str, @NonNull String str2, Timer[] timerArr, Counter[] counterArr, Metadata[] metadataArr, Priority priority) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("programName is marked non-null but is null");
            throw null;
        }
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sourceName is marked non-null but is null");
            throw null;
        }
        this.mProgramName = str;
        this.mSourceName = str2;
        this.mTimers = timerArr;
        this.mCounters = counterArr;
        this.mMetadata = metadataArr;
        this.mPriority = priority;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Counter[] getCounters() {
        return this.mCounters;
    }

    public Metadata[] getMetadata() {
        return this.mMetadata;
    }

    public Priority getPriority() {
        return this.mPriority;
    }

    public String getProgramName() {
        return this.mProgramName;
    }

    public String getSourceName() {
        return this.mSourceName;
    }

    public Timer[] getTimers() {
        return this.mTimers;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mProgramName);
        parcel.writeString(this.mSourceName);
        parcel.writeTypedArray(this.mTimers, 0);
        parcel.writeTypedArray(this.mCounters, 0);
        parcel.writeTypedArray(this.mMetadata, 0);
        parcel.writeString(this.mPriority.name());
    }
}
