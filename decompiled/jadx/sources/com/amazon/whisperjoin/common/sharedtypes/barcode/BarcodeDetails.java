package com.amazon.whisperjoin.common.sharedtypes.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.whisperjoin.common.sharedtypes.exceptions.BarcodeFormatException;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BarcodeDetails implements Parcelable {
    private static final BarcodeParser BARCODE_PARSER = new RegexBarcodeParser();
    public static final Parcelable.ClassLoaderCreator<BarcodeDetails> CREATOR = new Parcelable.ClassLoaderCreator<BarcodeDetails>() { // from class: com.amazon.whisperjoin.common.sharedtypes.barcode.BarcodeDetails.1
        @Override // android.os.Parcelable.Creator
        public BarcodeDetails createFromParcel(Parcel parcel) {
            if (parcel != null) {
                return new BarcodeDetails(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public BarcodeDetails[] newArray(int i) {
            if (i >= 0) {
                return new BarcodeDetails[i];
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Size cannot be negative");
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public BarcodeDetails createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel != null) {
                return new BarcodeDetails(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }
    };
    private final String mAmazonBarcodeVersion;
    private final String mPin;
    private final String mProductId;
    private final String mPublicKey;

    public BarcodeDetails(String str, String str2, String str3, String str4) {
        this.mAmazonBarcodeVersion = str;
        this.mProductId = str2;
        this.mPublicKey = str3;
        this.mPin = str4;
    }

    public static BarcodeDetails createFromContent(String str) throws BarcodeFormatException {
        return BARCODE_PARSER.parse(str);
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
            BarcodeDetails barcodeDetails = (BarcodeDetails) obj;
            if (Objects.equal(this.mAmazonBarcodeVersion, barcodeDetails.mAmazonBarcodeVersion) && Objects.equal(this.mProductId, barcodeDetails.mProductId) && Objects.equal(this.mPublicKey, barcodeDetails.mPublicKey) && Objects.equal(this.mPin, barcodeDetails.mPin)) {
                return true;
            }
        }
        return false;
    }

    public String getAmazonBarcodeVersion() {
        return this.mAmazonBarcodeVersion;
    }

    public String getPin() {
        return this.mPin;
    }

    public String getProductId() {
        return this.mProductId;
    }

    public String getPublicKey() {
        return this.mPublicKey;
    }

    public int hashCode() {
        return Objects.hashCode(this.mAmazonBarcodeVersion, this.mProductId, this.mPublicKey, this.mPin);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("mAmazonBarcodeVersion", this.mAmazonBarcodeVersion).add("mProductId", this.mProductId).add("mPublicKey", this.mPublicKey).add("mPin", this.mPin).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Parcel cannot be null");
            return;
        }
        parcel.writeString(this.mAmazonBarcodeVersion);
        parcel.writeString(this.mProductId);
        parcel.writeString(this.mPublicKey);
        parcel.writeString(this.mPin);
    }
}
