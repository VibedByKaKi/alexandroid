package com.amazon.alexa.elements.turbomodules.subscriptions;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeSubscriptionsManagerSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "SubscriptionsManager")
/* loaded from: classes17.dex */
public class SubscriptionsManagerNativeModule extends NativeSubscriptionsManagerSpec {
    public static final String NAME = "SubscriptionsManager";
    private SubscriptionsManagerAPI subscriptionsManagerAPI;

    public SubscriptionsManagerNativeModule(ReactApplicationContext reactApplicationContext, SubscriptionsManagerAPI subscriptionsManagerAPI) {
        super(reactApplicationContext);
        this.subscriptionsManagerAPI = subscriptionsManagerAPI;
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeSubscriptionsManagerSpec
    @ReactMethod
    public void cancelPurchaseNotification(ReadableMap readableMap, Promise promise) {
        this.subscriptionsManagerAPI.cancelPurchaseNotification(readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeSubscriptionsManagerSpec
    @ReactMethod
    public void getBenefitsEntitlement(ReadableMap readableMap, Promise promise) {
        this.subscriptionsManagerAPI.getBenefitsEntitlement(readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeSubscriptionsManagerSpec
    @ReactMethod
    public void getEmpOffers(String str, Promise promise) {
        this.subscriptionsManagerAPI.getEmpOffers(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeSubscriptionsManagerSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "SubscriptionsManager";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeSubscriptionsManagerSpec
    @ReactMethod
    public void getProductEntitlement(ReadableMap readableMap, Promise promise) {
        this.subscriptionsManagerAPI.getProductEntitlement(readableMap, promise);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.subscriptionsManagerAPI.invalidateSubscriptions();
        super.invalidate();
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeSubscriptionsManagerSpec
    @ReactMethod
    public WritableMap peekBenefitsEntitlement(ReadableMap readableMap) {
        return this.subscriptionsManagerAPI.peekBenefitsEntitlement(readableMap);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeSubscriptionsManagerSpec
    @ReactMethod
    public void purchaseEmpOffer(String str, String str2, Promise promise) {
        this.subscriptionsManagerAPI.purchaseEmpOffer(str, str2, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeSubscriptionsManagerSpec
    @ReactMethod
    public void restoreEmpOffer(String str, String str2, Promise promise) {
        this.subscriptionsManagerAPI.restoreEmpOffer(str, str2, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeSubscriptionsManagerSpec
    @ReactMethod
    public void schedulePurchaseNotification(ReadableMap readableMap, Promise promise) {
        this.subscriptionsManagerAPI.schedulePurchaseNotification(readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeSubscriptionsManagerSpec
    @ReactMethod
    public String subscribeBenefitsEntitlement(ReadableMap readableMap, Callback callback) {
        return this.subscriptionsManagerAPI.subscribeBenefitsEntitlement(readableMap, callback);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeSubscriptionsManagerSpec
    @ReactMethod
    public void unsubscribeBenefitsEntitlement(String str) {
        this.subscriptionsManagerAPI.unsubscribeBenefitsEntitlement(str);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeSubscriptionsManagerSpec
    @ReactMethod
    public void cancelPurchaseReminder(String str, Promise promise) {
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeSubscriptionsManagerSpec
    @ReactMethod
    public void schedulePurchaseReminder(String str, Double d, Promise promise) {
    }
}
