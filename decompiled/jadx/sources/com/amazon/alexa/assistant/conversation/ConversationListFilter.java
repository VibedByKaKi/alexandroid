package com.amazon.alexa.assistant.conversation;

import com.amazon.alexa.assistant.conversation.model.Conversation;
import java.time.Instant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationListFilter;", "", "includes", "", "conversation", "Lcom/amazon/alexa/assistant/conversation/model/Conversation;", "now", "Ljava/time/Instant;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ConversationListFilter {
    boolean includes(@NotNull Conversation conversation, @NotNull Instant now);
}
