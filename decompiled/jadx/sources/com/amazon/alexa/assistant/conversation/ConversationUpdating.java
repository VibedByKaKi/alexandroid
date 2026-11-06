package com.amazon.alexa.assistant.conversation;

import com.amazon.alexa.assistant.conversation.model.Conversation;
import com.amazon.alexa.assistant.conversation.model.ConversationTopicSegment;
import kotlin.Metadata;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationUpdating;", "", "updateCurrentConversation", "", "conversationId", "", "metadata", "Lcom/amazon/alexa/assistant/conversation/model/Conversation;", "topicSegment", "Lcom/amazon/alexa/assistant/conversation/model/ConversationTopicSegment;", "removeAllFragmentsFromCurrentConversation", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ConversationUpdating {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void updateCurrentConversation$default(ConversationUpdating conversationUpdating, String str, Conversation conversation, ConversationTopicSegment conversationTopicSegment, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: updateCurrentConversation");
                return;
            }
            if ((i & 2) != 0) {
                conversation = null;
            }
            if ((i & 4) != 0) {
                conversationTopicSegment = null;
            }
            conversationUpdating.updateCurrentConversation(str, conversation, conversationTopicSegment);
        }
    }

    void removeAllFragmentsFromCurrentConversation();

    void updateCurrentConversation(@Nullable String conversationId, @Nullable Conversation metadata, @Nullable ConversationTopicSegment topicSegment);
}
