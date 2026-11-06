package com.amazon.alexa.assistant.capability.discovery;

import com.amazon.alexa.assistant.foundation.model.AlexaProduct;
import com.amazon.alexa.assistant.session.directive.CapabilityAgentRegistry;
import com.amazon.alexa.assistant.toolkit.session.model.AuthorizationSessionState;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/assistant/capability/discovery/EndpointInformationProviderBuilder;", "", "alexaProduct", "Lcom/amazon/alexa/assistant/foundation/model/AlexaProduct;", "authorizationSessionStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/amazon/alexa/assistant/toolkit/session/model/AuthorizationSessionState;", "capabilityAgentRegistry", "Lcom/amazon/alexa/assistant/session/directive/CapabilityAgentRegistry;", "<init>", "(Lcom/amazon/alexa/assistant/foundation/model/AlexaProduct;Lkotlinx/coroutines/flow/StateFlow;Lcom/amazon/alexa/assistant/session/directive/CapabilityAgentRegistry;)V", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/assistant/capability/discovery/EndpointInformationProvider;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class EndpointInformationProviderBuilder {

    @NotNull
    private final AlexaProduct alexaProduct;

    @NotNull
    private final StateFlow<AuthorizationSessionState> authorizationSessionStateFlow;

    @NotNull
    private final CapabilityAgentRegistry capabilityAgentRegistry;

    /* JADX WARN: Multi-variable type inference failed */
    public EndpointInformationProviderBuilder(@NotNull AlexaProduct alexaProduct, @NotNull StateFlow<? extends AuthorizationSessionState> stateFlow, @NotNull CapabilityAgentRegistry capabilityAgentRegistry) {
        alexaProduct.getClass();
        stateFlow.getClass();
        capabilityAgentRegistry.getClass();
        this.alexaProduct = alexaProduct;
        this.authorizationSessionStateFlow = stateFlow;
        this.capabilityAgentRegistry = capabilityAgentRegistry;
    }

    @NotNull
    public final EndpointInformationProvider build() {
        return new EndpointInformationProvider(this.alexaProduct, this.authorizationSessionStateFlow, this.capabilityAgentRegistry);
    }
}
