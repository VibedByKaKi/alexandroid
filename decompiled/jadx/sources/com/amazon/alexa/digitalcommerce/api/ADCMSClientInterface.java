package com.amazon.alexa.digitalcommerce.api;

import com.amazon.alexa.assistant.transport.MissingTokenPull;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H¦@¢\u0006\u0002\u0010\bJ \u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H¦@¢\u0006\u0002\u0010\fJ \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H¦@¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/digitalcommerce/api/ADCMSClientInterface;", "", "getProductDetails", "Lcom/amazon/alexa/digitalcommerce/api/GetProductDetailsResponse;", MissingTokenPull.TRIGGER_REQUEST, "Lcom/amazon/alexa/digitalcommerce/api/GetProductDetailsRequest;", "token", "", "(Lcom/amazon/alexa/digitalcommerce/api/GetProductDetailsRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "evaluateSubscriptionCreation", "Lcom/amazon/alexa/digitalcommerce/api/EvaluateOrderResponse;", "Lcom/amazon/alexa/digitalcommerce/api/EvaluateOrderRequest;", "(Lcom/amazon/alexa/digitalcommerce/api/EvaluateOrderRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitSubscriptionCreation", "Lcom/amazon/alexa/digitalcommerce/api/CreateOrderResponse;", "Lcom/amazon/alexa/digitalcommerce/api/CreateOrderRequest;", "(Lcom/amazon/alexa/digitalcommerce/api/CreateOrderRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AlexaMobileAndroidDigitalCommerce_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface ADCMSClientInterface {
    @Nullable
    Object evaluateSubscriptionCreation(@NotNull EvaluateOrderRequest evaluateOrderRequest, @Nullable String str, @NotNull Continuation<? super EvaluateOrderResponse> continuation);

    @Nullable
    Object getProductDetails(@NotNull GetProductDetailsRequest getProductDetailsRequest, @Nullable String str, @NotNull Continuation<? super GetProductDetailsResponse> continuation);

    @Nullable
    Object submitSubscriptionCreation(@NotNull CreateOrderRequest createOrderRequest, @Nullable String str, @NotNull Continuation<? super CreateOrderResponse> continuation);
}
