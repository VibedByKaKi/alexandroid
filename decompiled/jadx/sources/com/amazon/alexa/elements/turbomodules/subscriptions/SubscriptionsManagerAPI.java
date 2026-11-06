package com.amazon.alexa.elements.turbomodules.subscriptions;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface SubscriptionsManagerAPI {
    void cancelPurchaseNotification(ReadableMap readableMap, Promise promise);

    void cancelPurchaseReminder(String str, Promise promise);

    void getBenefitsEntitlement(ReadableMap readableMap, Promise promise);

    void getEmpOffers(String str, Promise promise);

    void getProductEntitlement(ReadableMap readableMap, Promise promise);

    default WritableMap peekBenefitsEntitlement(ReadableMap readableMap) {
        return null;
    }

    void purchaseEmpOffer(String str, String str2, Promise promise);

    void restoreEmpOffer(String str, String str2, Promise promise);

    void schedulePurchaseNotification(ReadableMap readableMap, Promise promise);

    void schedulePurchaseReminder(String str, Double d, Promise promise);

    String subscribeBenefitsEntitlement(ReadableMap readableMap, Callback callback);

    void unsubscribeBenefitsEntitlement(String str);

    default void invalidateSubscriptions() {
    }
}
