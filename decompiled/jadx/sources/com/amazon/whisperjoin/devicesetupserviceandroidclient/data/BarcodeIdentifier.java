package com.amazon.whisperjoin.devicesetupserviceandroidclient.data;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import javax.annotation.concurrent.Immutable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Immutable
/* loaded from: classes20.dex */
public class BarcodeIdentifier {
    private final String mBarcodeData;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private String mBarcodeData;

        private void validate() {
            RequestInputValidator.validateBarcodeData(this.mBarcodeData);
        }

        public BarcodeIdentifier build() {
            validate();
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
}
