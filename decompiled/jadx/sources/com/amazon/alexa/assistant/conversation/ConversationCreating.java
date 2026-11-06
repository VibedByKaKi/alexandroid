package com.amazon.alexa.assistant.conversation;

import com.amazon.alexa.assistant.conversation.model.Conversation;
import kotlin.Metadata;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationCreating;", "", "createConversation", "", "metadata", "Lcom/amazon/alexa/assistant/conversation/model/Conversation;", "origin", "Lcom/amazon/alexa/assistant/conversation/CurrentConversationOrigin;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ConversationCreating {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void createConversation$default(ConversationCreating conversationCreating, Conversation conversation, CurrentConversationOrigin currentConversationOrigin, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: createConversation");
                return;
            }
            if ((i & 1) != 0) {
                conversation = null;
            }
            if ((i & 2) != 0) {
                currentConversationOrigin = CurrentConversationOrigin.REQUEST;
            }
            conversationCreating.createConversation(conversation, currentConversationOrigin);
        }
    }

    void createConversation(@Nullable Conversation metadata, @NotNull CurrentConversationOrigin origin);
}
