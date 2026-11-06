package com.amazon.whisperjoin.devicesetupserviceandroidclient.data;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RecordDevicePossessionIntentInnerBarcodeRequest {
    private String mBarcodeData;

    public RecordDevicePossessionIntentInnerBarcodeRequest(String str) {
        this.mBarcodeData = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equal(this.mBarcodeData, ((RecordDevicePossessionIntentInnerBarcodeRequest) obj).mBarcodeData);
    }

    public String getBarcodeData() {
        return this.mBarcodeData;
    }

    public int hashCode() {
        return Objects.hashCode(this.mBarcodeData);
    }

    public void setBarcodeData(String str) {
        this.mBarcodeData = str;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("barcodeData", this.mBarcodeData).toString();
    }
}
