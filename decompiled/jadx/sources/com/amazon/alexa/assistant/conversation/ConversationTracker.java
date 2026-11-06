package com.amazon.alexa.assistant.conversation;

import kotlin.Metadata;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationTracker;", "Lcom/amazon/alexa/assistant/conversation/CurrentConversationProviding;", "Lcom/amazon/alexa/assistant/conversation/ConversationPublishing;", "Lcom/amazon/alexa/assistant/conversation/ConversationCreating;", "Lcom/amazon/alexa/assistant/conversation/ConversationUpdating;", "Lcom/amazon/alexa/assistant/conversation/ConversationHistoryUpdating;", "Lcom/amazon/alexa/assistant/conversation/ConversationDeleting;", "lifecycleFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/amazon/alexa/assistant/conversation/ConversationLifecycleEvent;", "getLifecycleFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ConversationTracker extends CurrentConversationProviding, ConversationPublishing, ConversationCreating, ConversationUpdating, ConversationHistoryUpdating, ConversationDeleting {
    @NotNull
    SharedFlow<ConversationLifecycleEvent> getLifecycleFlow();
}
