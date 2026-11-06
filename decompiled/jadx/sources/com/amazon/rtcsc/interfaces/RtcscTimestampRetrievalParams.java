package com.amazon.rtcsc.interfaces;

import android.os.Parcel;
import android.os.Parcelable;
import lombok.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class RtcscTimestampRetrievalParams implements Parcelable {
    public static final Parcelable.Creator<RtcscTimestampRetrievalParams> CREATOR = new Parcelable.Creator<RtcscTimestampRetrievalParams>() { // from class: com.amazon.rtcsc.interfaces.RtcscTimestampRetrievalParams.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RtcscTimestampRetrievalParams createFromParcel(Parcel parcel) {
            return new RtcscTimestampRetrievalParams(parcel.readInt(), (RtcscSide) parcel.readParcelable(RtcscSide.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RtcscTimestampRetrievalParams[] newArray(int i) {
            return new RtcscTimestampRetrievalParams[i];
        }
    };
    public int mFrequency;
    public RtcscSide mRtcscSide;

    public RtcscTimestampRetrievalParams(@NonNull int i, @NonNull RtcscSide rtcscSide) {
        if (rtcscSide == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("rtcscSide is marked non-null but is null");
            throw null;
        }
        this.mFrequency = i;
        this.mRtcscSide = rtcscSide;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getFrequency() {
        return this.mFrequency;
    }

    public RtcscSide getRtcscSide() {
        return this.mRtcscSide;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mFrequency);
        parcel.writeParcelable(this.mRtcscSide, i);
    }
}
