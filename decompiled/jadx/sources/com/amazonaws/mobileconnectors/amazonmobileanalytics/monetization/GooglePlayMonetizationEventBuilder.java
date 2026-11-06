package com.amazonaws.mobileconnectors.amazonmobileanalytics.monetization;

import android.util.Log;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.EventClient;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public class GooglePlayMonetizationEventBuilder extends MonetizationEventBuilder {
    private static final String TAG = "GooglePlayMonetizationEventBuilder";

    public GooglePlayMonetizationEventBuilder(EventClient eventClient) {
        super(eventClient);
        setStore("Google Play");
    }

    public static GooglePlayMonetizationEventBuilder create(EventClient eventClient) {
        return new GooglePlayMonetizationEventBuilder(eventClient);
    }

    @Override // com.amazonaws.mobileconnectors.amazonmobileanalytics.monetization.MonetizationEventBuilder
    public boolean isValid() {
        if (getProductId() == null) {
            Log.w(TAG, "Cannot build Google Monetization event: it is missing the product id");
            return false;
        }
        if (getQuantity() == null) {
            Log.w(TAG, "Google Monetization event is not valid: it is missing the quantity");
            return false;
        }
        if (getFormattedItemPrice() == null) {
            Log.w(TAG, "Google Monetization event is not valid: it is missing the formatted localized price");
            return false;
        }
        if (getTransactionId() != null) {
            return true;
        }
        Log.w(TAG, "Google Monetization event is not valid: it is missing the transaction id");
        return false;
    }

    public GooglePlayMonetizationEventBuilder withFormattedItemPrice(String str) {
        setFormattedItemPrice(str);
        return this;
    }

    public GooglePlayMonetizationEventBuilder withProductId(String str) {
        setProductId(str);
        return this;
    }

    public GooglePlayMonetizationEventBuilder withQuantity(Double d) {
        setQuantity(d);
        return this;
    }

    public GooglePlayMonetizationEventBuilder withTransactionId(String str) {
        setTransactionId(str);
        return this;
    }
}
