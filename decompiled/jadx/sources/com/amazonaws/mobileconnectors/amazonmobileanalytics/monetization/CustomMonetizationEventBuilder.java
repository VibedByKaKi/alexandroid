package com.amazonaws.mobileconnectors.amazonmobileanalytics.monetization;

import android.util.Log;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.EventClient;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public class CustomMonetizationEventBuilder extends MonetizationEventBuilder {
    private static final String TAG = "CustomMonetizationEventBuilder";

    public CustomMonetizationEventBuilder(EventClient eventClient) {
        super(eventClient);
    }

    public static CustomMonetizationEventBuilder create(EventClient eventClient) {
        return new CustomMonetizationEventBuilder(eventClient);
    }

    @Override // com.amazonaws.mobileconnectors.amazonmobileanalytics.monetization.MonetizationEventBuilder
    public boolean isValid() {
        if (getStore() == null) {
            Log.w(TAG, "Custom Monetization event is not valid: it is missing the store");
            return false;
        }
        if (getProductId() == null) {
            Log.w(TAG, "Custom Monetization event is not valid: it is missing the product id");
            return false;
        }
        if (getQuantity() == null) {
            Log.w(TAG, "Custom Monetization event is not valid: it is missing the quantity");
            return false;
        }
        if ((getCurrency() != null && getItemPrice() != null) || getFormattedItemPrice() != null) {
            return true;
        }
        Log.w(TAG, "Custom Monetization event is not valid: it requires the formatted localized price or the currency and price");
        return false;
    }

    public CustomMonetizationEventBuilder withCurrency(String str) {
        setCurrency(str);
        return this;
    }

    public CustomMonetizationEventBuilder withFormattedItemPrice(String str) {
        setFormattedItemPrice(str);
        return this;
    }

    public CustomMonetizationEventBuilder withItemPrice(double d) {
        setItemPrice(Double.valueOf(d));
        return this;
    }

    public CustomMonetizationEventBuilder withProductId(String str) {
        setProductId(str);
        return this;
    }

    public CustomMonetizationEventBuilder withQuantity(Double d) {
        setQuantity(d);
        return this;
    }

    public CustomMonetizationEventBuilder withStore(String str) {
        setStore(str);
        return this;
    }

    public CustomMonetizationEventBuilder withTransactionId(String str) {
        setTransactionId(str);
        return this;
    }
}
