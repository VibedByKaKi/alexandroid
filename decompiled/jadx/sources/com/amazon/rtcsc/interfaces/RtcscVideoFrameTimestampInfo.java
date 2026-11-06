package com.amazon.rtcsc.interfaces;

import android.os.Parcel;
import android.os.Parcelable;
import lombok.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class RtcscVideoFrameTimestampInfo implements Parcelable {
    public static final Parcelable.Creator<RtcscVideoFrameTimestampInfo> CREATOR = new Parcelable.Creator<RtcscVideoFrameTimestampInfo>() { // from class: com.amazon.rtcsc.interfaces.RtcscVideoFrameTimestampInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RtcscVideoFrameTimestampInfo createFromParcel(Parcel parcel) {
            return new RtcscVideoFrameTimestampInfo(parcel.readLong(), (RtcscSide) parcel.readParcelable(RtcscSide.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RtcscVideoFrameTimestampInfo[] newArray(int i) {
            return new RtcscVideoFrameTimestampInfo[i];
        }
    };
    public RtcscSide mRtcscSide;
    public long mTimestamp;

    public RtcscVideoFrameTimestampInfo(@NonNull long j, @NonNull RtcscSide rtcscSide) {
        if (rtcscSide == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("rtcscSide is marked non-null but is null");
            throw null;
        }
        this.mTimestamp = j;
        this.mRtcscSide = rtcscSide;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RtcscSide getRtcscSide() {
        return this.mRtcscSide;
    }

    public long getTimestamp() {
        return this.mTimestamp;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mTimestamp);
        parcel.writeParcelable(this.mRtcscSide, i);
    }
}
