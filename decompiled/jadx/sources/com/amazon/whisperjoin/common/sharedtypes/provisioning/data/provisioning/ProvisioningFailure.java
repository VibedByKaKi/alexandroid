package com.amazon.whisperjoin.common.sharedtypes.provisioning.data.provisioning;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ProvisioningFailure implements Parcelable {
    public static final Parcelable.Creator<ProvisioningFailure> CREATOR = new Parcelable.Creator<ProvisioningFailure>() { // from class: com.amazon.whisperjoin.common.sharedtypes.provisioning.data.provisioning.ProvisioningFailure.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ProvisioningFailure createFromParcel(Parcel parcel) {
            if (parcel != null) {
                int readInt = parcel.readInt();
                return parcel.readInt() == 1 ? new ProvisioningFailure(readInt, parcel.readString()) : new ProvisioningFailure(readInt);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ProvisioningFailure[] newArray(int i) {
            if (i >= 0) {
                return new ProvisioningFailure[i];
            }
            Single$$ExternalSyntheticBUOutline0.m$3("size cannot be negative.");
            return null;
        }
    };
    private final int mErrorCode;
    private final String mMessage;

    public ProvisioningFailure(int i, String str) {
        this.mErrorCode = i;
        this.mMessage = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ProvisioningFailure provisioningFailure = (ProvisioningFailure) obj;
            if (this.mErrorCode == provisioningFailure.mErrorCode && Objects.equal(this.mMessage, provisioningFailure.mMessage)) {
                return true;
            }
        }
        return false;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public String getMessage() {
        return this.mMessage;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.mErrorCode), this.mMessage);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("mErrorCode", this.mErrorCode).add("mMessage", this.mMessage).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("parcel cannot be null.");
            return;
        }
        parcel.writeInt(this.mErrorCode);
        if (this.mMessage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(this.mMessage);
        }
    }

    public ProvisioningFailure(int i) {
        this(i, null);
    }
}
