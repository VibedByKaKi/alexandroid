package com.amazon.alexa.digitalcommerce.subscriptions;

import com.amazon.alexa.assistant.transport.MissingTokenPull;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/digitalcommerce/subscriptions/ExtendedSubscriptionManagerAPI;", "", "schedulePurchaseNotification", "", MissingTokenPull.TRIGGER_REQUEST, "Lcom/facebook/react/bridge/ReadableMap;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "cancelPurchaseNotification", "peekBenefitsEntitlement", "Lcom/facebook/react/bridge/WritableMap;", "AlexaMobileAndroidDigitalCommerce_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface ExtendedSubscriptionManagerAPI {
    void cancelPurchaseNotification(@NotNull ReadableMap request, @NotNull Promise promise);

    @NotNull
    WritableMap peekBenefitsEntitlement(@NotNull ReadableMap request);

    void schedulePurchaseNotification(@NotNull ReadableMap request, @NotNull Promise promise);
}
