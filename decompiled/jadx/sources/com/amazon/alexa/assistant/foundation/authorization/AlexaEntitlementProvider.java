package com.amazon.alexa.assistant.foundation.authorization;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/authorization/AlexaEntitlementProvider;", "", "resolveAlexaPlusEntitlement", "Lcom/amazon/alexa/assistant/foundation/authorization/AlexaPlusEntitlement;", "bearerToken", "", "marketplace", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface AlexaEntitlementProvider {
    @Nullable
    Object resolveAlexaPlusEntitlement(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super AlexaPlusEntitlement> continuation);
}
