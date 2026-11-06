package com.here.sdk.search;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class POIPaymentDetails {

    @NonNull
    public List<String> acceptedMethods = new ArrayList();

    @NonNull
    public List<String> acceptedCashCurrencies = new ArrayList();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof POIPaymentDetails)) {
            return false;
        }
        POIPaymentDetails pOIPaymentDetails = (POIPaymentDetails) obj;
        return Objects.equals(this.acceptedMethods, pOIPaymentDetails.acceptedMethods) && Objects.equals(this.acceptedCashCurrencies, pOIPaymentDetails.acceptedCashCurrencies);
    }

    public int hashCode() {
        List<String> list = this.acceptedMethods;
        int hashCode = (JfifUtil.MARKER_EOI + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.acceptedCashCurrencies;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }
}
