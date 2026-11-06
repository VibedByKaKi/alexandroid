package com.amazonaws.mobileconnectors.amazonmobileanalytics.monetization;

import android.util.Log;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.AnalyticsEvent;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.EventClient;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.StringUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public abstract class MonetizationEventBuilder {
    static final String AMAZON_STORE = "Amazon";
    static final String GOOGLE_PLAY_STORE = "Google Play";
    static final String PURCHASE_EVENT_CURRENCY_ATTR = "_currency";
    static final String PURCHASE_EVENT_ITEM_PRICE_METRIC = "_item_price";
    static final String PURCHASE_EVENT_LOCALE_ATTR = "_locale";
    static final String PURCHASE_EVENT_NAME = "_monetization.purchase";
    static final String PURCHASE_EVENT_PRICE_FORMATTED_ATTR = "_item_price_formatted";
    static final String PURCHASE_EVENT_PRODUCT_ID_ATTR = "_product_id";
    static final String PURCHASE_EVENT_QUANTITY_METRIC = "_quantity";
    static final String PURCHASE_EVENT_STORE_ATTR = "_store";
    static final String PURCHASE_EVENT_TRANSACTION_ID_ATTR = "_transaction_id";
    private static final String TAG = "MonetizationEventBuilder";
    static final String VIRTUAL_STORE = "Virtual";
    private String currency;
    private final EventClient eventClient;
    private String formattedItemPrice;
    private Double itemPrice;
    private String productId;
    private Double quantity;
    private String store;
    private String transactionId;

    public MonetizationEventBuilder(EventClient eventClient) {
        this.eventClient = eventClient;
    }

    private boolean doBaseValidation() {
        if (this.eventClient == null) {
            Log.w(TAG, "Cannot build Monetization event: the eventClient is null");
            return false;
        }
        if (StringUtil.isNullOrEmpty(this.productId)) {
            Log.w(TAG, "Base Monetization event is not valid: it is missing the product id");
            return false;
        }
        if (this.quantity == null) {
            Log.w(TAG, "Base Monetization event is not valid: it is missing the quantity");
            return false;
        }
        if (StringUtil.isNullOrEmpty(this.store)) {
            Log.w(TAG, "Base Monetization event is not valid: it is missing the store");
            return false;
        }
        if ((!StringUtil.isNullOrEmpty(this.currency) && this.itemPrice != null) || !StringUtil.isNullOrEmpty(this.formattedItemPrice)) {
            return true;
        }
        Log.w(TAG, "Base Monetization event is not valid: it requires the formatted price or the currency and price");
        return false;
    }

    public AnalyticsEvent build() {
        if (!isValid() || !doBaseValidation()) {
            return null;
        }
        AnalyticsEvent createEvent = this.eventClient.createEvent(PURCHASE_EVENT_NAME);
        createEvent.addAttribute(PURCHASE_EVENT_PRODUCT_ID_ATTR, this.productId);
        createEvent.addAttribute(PURCHASE_EVENT_STORE_ATTR, this.store);
        createEvent.addMetric(PURCHASE_EVENT_QUANTITY_METRIC, this.quantity);
        String str = this.formattedItemPrice;
        if (str != null) {
            createEvent.addAttribute(PURCHASE_EVENT_PRICE_FORMATTED_ATTR, str);
        }
        Double d = this.itemPrice;
        if (d != null) {
            createEvent.addMetric(PURCHASE_EVENT_ITEM_PRICE_METRIC, d);
        }
        String str2 = this.transactionId;
        if (str2 != null) {
            createEvent.addAttribute(PURCHASE_EVENT_TRANSACTION_ID_ATTR, str2);
        }
        String str3 = this.currency;
        if (str3 != null) {
            createEvent.addAttribute(PURCHASE_EVENT_CURRENCY_ATTR, str3);
        }
        return createEvent;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getFormattedItemPrice() {
        return this.formattedItemPrice;
    }

    public Double getItemPrice() {
        return this.itemPrice;
    }

    public String getProductId() {
        return this.productId;
    }

    public Double getQuantity() {
        return this.quantity;
    }

    public String getStore() {
        return this.store;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public abstract boolean isValid();

    public void setCurrency(String str) {
        this.currency = str;
    }

    public void setFormattedItemPrice(String str) {
        this.formattedItemPrice = str;
    }

    public void setItemPrice(Double d) {
        this.itemPrice = d;
    }

    public void setProductId(String str) {
        this.productId = str;
    }

    public void setQuantity(Double d) {
        this.quantity = d;
    }

    public void setStore(String str) {
        this.store = str;
    }

    public void setTransactionId(String str) {
        this.transactionId = str;
    }
}
