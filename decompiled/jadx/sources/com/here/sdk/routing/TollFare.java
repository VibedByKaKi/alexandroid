package com.here.sdk.routing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.core.TimeRule;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class TollFare {

    @NonNull
    public String currency;

    @NonNull
    public List<PaymentMethod> paymentMethods;
    public double price;

    @Nullable
    public TimeRule timeRule;

    @NonNull
    public List<String> transponders;

    public TollFare(@NonNull String str, double d, @NonNull List<PaymentMethod> list) {
        this.currency = str;
        this.price = d;
        this.paymentMethods = list;
        this.timeRule = null;
        this.transponders = new ArrayList();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TollFare)) {
            return false;
        }
        TollFare tollFare = (TollFare) obj;
        return Objects.equals(this.currency, tollFare.currency) && Double.compare(this.price, tollFare.price) == 0 && Objects.equals(this.paymentMethods, tollFare.paymentMethods) && Objects.equals(this.timeRule, tollFare.timeRule) && Objects.equals(this.transponders, tollFare.transponders);
    }

    public int hashCode() {
        String str = this.currency;
        int hashCode = (((JfifUtil.MARKER_EOI + (str != null ? str.hashCode() : 0)) * 31) + ((int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32)))) * 31;
        List<PaymentMethod> list = this.paymentMethods;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        TimeRule timeRule = this.timeRule;
        int hashCode3 = (hashCode2 + (timeRule != null ? timeRule.hashCode() : 0)) * 31;
        List<String> list2 = this.transponders;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public TollFare(@NonNull String str, double d, @NonNull List<PaymentMethod> list, @Nullable TimeRule timeRule) {
        this.currency = str;
        this.price = d;
        this.paymentMethods = list;
        this.timeRule = timeRule;
        this.transponders = new ArrayList();
    }

    public TollFare(@NonNull String str, double d, @NonNull List<PaymentMethod> list, @Nullable TimeRule timeRule, @NonNull List<String> list2) {
        this.currency = str;
        this.price = d;
        this.paymentMethods = list;
        this.timeRule = timeRule;
        this.transponders = list2;
    }
}
