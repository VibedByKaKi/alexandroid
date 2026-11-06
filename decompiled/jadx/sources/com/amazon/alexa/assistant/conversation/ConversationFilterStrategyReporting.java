package com.amazon.alexa.assistant.conversation;

import com.amazon.alexa.assistant.conversation.ConversationServiceRequest;
import com.amazon.alexa.assistant.foundation.internal.InternalAssistantSdkApi;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@InternalAssistantSdkApi
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationFilterStrategyReporting;", "", "lastAppliedFilterStrategy", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$FilterStrategy;", "getLastAppliedFilterStrategy", "()Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$FilterStrategy;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ConversationFilterStrategyReporting {
    @Nullable
    ConversationServiceRequest.FilterStrategy getLastAppliedFilterStrategy();
}
