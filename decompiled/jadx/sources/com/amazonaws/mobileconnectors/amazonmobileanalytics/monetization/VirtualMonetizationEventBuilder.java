package com.amazonaws.mobileconnectors.amazonmobileanalytics.monetization;

import android.util.Log;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.EventClient;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public class VirtualMonetizationEventBuilder extends MonetizationEventBuilder {
    private static final String TAG = "VirtualMonetizationEventBuilder";

    public VirtualMonetizationEventBuilder(EventClient eventClient) {
        super(eventClient);
        setStore("Virtual");
    }

    public static VirtualMonetizationEventBuilder create(EventClient eventClient) {
        return new VirtualMonetizationEventBuilder(eventClient);
    }

    @Override // com.amazonaws.mobileconnectors.amazonmobileanalytics.monetization.MonetizationEventBuilder
    public boolean isValid() {
        if (getProductId() == null) {
            Log.w(TAG, "Virtual Monetization event is not valid: it is missing the product id");
            return false;
        }
        if (getQuantity() == null) {
            Log.w(TAG, "Virtual Monetization event is not valid: it is missing the quantity");
            return false;
        }
        if (getItemPrice() == null) {
            Log.w(TAG, "Virtual Monetization event is not valid: it is missing the numerical price");
            return false;
        }
        if (getCurrency() != null) {
            return true;
        }
        Log.w(TAG, "Virtual Monetization event is not valid: it is missing the currency");
        return false;
    }

    public VirtualMonetizationEventBuilder withCurrency(String str) {
        setCurrency(str);
        return this;
    }

    public VirtualMonetizationEventBuilder withItemPrice(double d) {
        setItemPrice(Double.valueOf(d));
        return this;
    }

    public VirtualMonetizationEventBuilder withProductId(String str) {
        setProductId(str);
        return this;
    }

    public VirtualMonetizationEventBuilder withQuantity(Double d) {
        setQuantity(d);
        return this;
    }
}
