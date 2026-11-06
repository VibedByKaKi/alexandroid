package com.amazon.dcp.sso;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class ReturnValueOrError implements Parcelable {
    public static final Parcelable.Creator<ReturnValueOrError> CREATOR = new b();
    public static final int RESPONSE_CODE_SUCCESS = 1;
    private final Bundle mResponse;
    private final int mResponseCode;
    private final String mResponseMessage;

    private ReturnValueOrError(Parcel parcel) {
        this.mResponse = parcel.readBundle();
        this.mResponseCode = parcel.readInt();
        this.mResponseMessage = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bundle getResponse() {
        return this.mResponse;
    }

    public int getResponseCode() {
        return this.mResponseCode;
    }

    public String getResponseMessage() {
        return this.mResponseMessage;
    }

    public boolean isError() {
        return this.mResponseCode != 1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.mResponse);
        parcel.writeInt(this.mResponseCode);
        parcel.writeString(this.mResponseMessage);
    }

    public ReturnValueOrError(Bundle bundle) {
        this.mResponse = bundle;
        this.mResponseCode = 1;
        this.mResponseMessage = null;
    }

    public ReturnValueOrError(Bundle bundle, int i, String str) {
        this.mResponse = bundle;
        this.mResponseCode = i;
        this.mResponseMessage = str;
    }

    public ReturnValueOrError(int i, String str) {
        this.mResponse = null;
        this.mResponseCode = i;
        this.mResponseMessage = str;
    }

    public /* synthetic */ ReturnValueOrError(Parcel parcel, int i) {
        this(parcel);
    }
}
