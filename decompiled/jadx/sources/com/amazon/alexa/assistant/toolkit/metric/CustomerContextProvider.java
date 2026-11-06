package com.amazon.alexa.assistant.toolkit.metric;

import com.amazon.alexa.assistant.foundation.authorization.AuthorizationMetadata;
import com.amazon.alexa.assistant.foundation.authorization.AuthorizationResult;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tR\u0016\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/metric/CustomerContextProvider;", "", "authResultFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/amazon/alexa/assistant/foundation/authorization/AuthorizationResult;", "<init>", "(Lkotlinx/coroutines/flow/StateFlow;)V", "provide", "Lcom/amazon/alexa/assistant/toolkit/metric/CustomerContextHolder;", "provide$toolkit_release", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CustomerContextProvider {

    @NotNull
    private final StateFlow<AuthorizationResult> authResultFlow;

    public CustomerContextProvider(@NotNull StateFlow<AuthorizationResult> stateFlow) {
        stateFlow.getClass();
        this.authResultFlow = stateFlow;
    }

    @NotNull
    public final CustomerContextHolder provide$toolkit_release() {
        AuthorizationMetadata metadata;
        AuthorizationResult value = this.authResultFlow.getValue();
        return (value == null || (metadata = value.getMetadata()) == null) ? new CustomerContextHolder(null, null, null, null, 15, null) : new CustomerContextHolder(null, metadata.getDirectedId(), metadata.getMarketplaceId(), metadata.getCountryOfResidence(), 1, null);
    }
}
