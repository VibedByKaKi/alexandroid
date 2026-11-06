package com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.type;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import javax.annotation.concurrent.Immutable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Immutable
/* loaded from: classes20.dex */
public class BarcodeIdentifier implements Parcelable {
    public static final Parcelable.Creator<BarcodeIdentifier> CREATOR = new Parcelable.Creator<BarcodeIdentifier>() { // from class: com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.type.BarcodeIdentifier.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BarcodeIdentifier createFromParcel(Parcel parcel) {
            return new BarcodeIdentifier(parcel, 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BarcodeIdentifier[] newArray(int i) {
            return new BarcodeIdentifier[i];
        }
    };
    private final String mBarcodeData;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private String mBarcodeData;

        public BarcodeIdentifier build() {
            Preconditions.checkArgument(this.mBarcodeData != null);
            return new BarcodeIdentifier(this);
        }

        public Builder setBarcodeData(String str) {
            this.mBarcodeData = str;
            return this;
        }
    }

    public BarcodeIdentifier(Builder builder) {
        this.mBarcodeData = builder.mBarcodeData;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equal(this.mBarcodeData, ((BarcodeIdentifier) obj).mBarcodeData);
    }

    public String getBarcodeData() {
        return this.mBarcodeData;
    }

    public int hashCode() {
        return Objects.hashCode(this.mBarcodeData);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("mBarcodeDatra", this.mBarcodeData).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mBarcodeData);
    }

    public /* synthetic */ BarcodeIdentifier(Parcel parcel, int i) {
        this(parcel);
    }

    private BarcodeIdentifier(Parcel parcel) {
        this.mBarcodeData = parcel.readString();
    }
}
