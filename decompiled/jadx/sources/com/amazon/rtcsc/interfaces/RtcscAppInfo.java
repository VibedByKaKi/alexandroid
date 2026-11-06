package com.amazon.rtcsc.interfaces;

import android.os.Parcel;
import android.os.Parcelable;
import lombok.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class RtcscAppInfo implements Parcelable {
    public static final Parcelable.Creator<RtcscAppInfo> CREATOR = new Parcelable.Creator<RtcscAppInfo>() { // from class: com.amazon.rtcsc.interfaces.RtcscAppInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RtcscAppInfo createFromParcel(Parcel parcel) {
            return new RtcscAppInfo(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RtcscAppInfo[] newArray(int i) {
            return new RtcscAppInfo[i];
        }
    };
    public String mAppIdentifier;

    public RtcscAppInfo(@NonNull String str) {
        if (str != null) {
            this.mAppIdentifier = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("appIdentifier is marked non-null but is null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAppIdentifier() {
        return this.mAppIdentifier;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mAppIdentifier);
    }
}
