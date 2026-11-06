package com.amazon.alexa.elements.turbomodules;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class NativeSubscriptionsManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "SubscriptionsManager";

    public NativeSubscriptionsManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @DoNotStrip
    @ReactMethod
    public abstract void cancelPurchaseNotification(ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void cancelPurchaseReminder(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getBenefitsEntitlement(ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getEmpOffers(String str, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "SubscriptionsManager";
    }

    @DoNotStrip
    @ReactMethod
    public abstract void getProductEntitlement(ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableMap peekBenefitsEntitlement(ReadableMap readableMap);

    @DoNotStrip
    @ReactMethod
    public abstract void purchaseEmpOffer(String str, String str2, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void restoreEmpOffer(String str, String str2, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void schedulePurchaseNotification(ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void schedulePurchaseReminder(String str, @Nullable Double d, Promise promise);

    @DoNotStrip
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String subscribeBenefitsEntitlement(ReadableMap readableMap, Callback callback);

    @DoNotStrip
    @ReactMethod
    public abstract void unsubscribeBenefitsEntitlement(String str);
}
