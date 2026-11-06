package com.amazon.alexa.assistant;

import com.amazon.alexa.assistant.conversation.ConversationEndpointProvider;
import com.amazon.alexa.assistant.foundation.model.Endpoint;
import com.amazon.alexa.assistant.foundation.model.EndpointRegion;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"DEFAULT_CONVERSATION_ENDPOINT_PROVIDER", "com/amazon/alexa/assistant/AssistantBuilderKt$DEFAULT_CONVERSATION_ENDPOINT_PROVIDER$1", "Lcom/amazon/alexa/assistant/AssistantBuilderKt$DEFAULT_CONVERSATION_ENDPOINT_PROVIDER$1;", "voice_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AssistantBuilderKt {

    @NotNull
    private static final AssistantBuilderKt$DEFAULT_CONVERSATION_ENDPOINT_PROVIDER$1 DEFAULT_CONVERSATION_ENDPOINT_PROVIDER = new ConversationEndpointProvider() { // from class: com.amazon.alexa.assistant.AssistantBuilderKt$DEFAULT_CONVERSATION_ENDPOINT_PROVIDER$1
        @Override // com.amazon.alexa.assistant.conversation.ConversationEndpointProvider
        public Endpoint endpoint() {
            return new Endpoint.Prod(EndpointRegion.NA);
        }
    };
}
