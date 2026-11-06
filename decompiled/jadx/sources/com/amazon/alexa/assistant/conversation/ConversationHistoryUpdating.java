package com.amazon.alexa.assistant.conversation;

import com.amazon.alexa.assistant.conversation.model.Conversation;
import com.amazon.alexa.assistant.conversation.model.ConversationTopicSegment;
import java.util.List;
import kotlin.Metadata;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\"\u0010\t\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationHistoryUpdating;", "", "updateConversationHistory", "", "conversations", "", "Lcom/amazon/alexa/assistant/conversation/model/Conversation;", "historyToken", "", "replaceConversationHistory", "updateConversationTopicSegment", "conversationId", "topicSegment", "Lcom/amazon/alexa/assistant/conversation/model/ConversationTopicSegment;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ConversationHistoryUpdating {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void replaceConversationHistory$default(ConversationHistoryUpdating conversationHistoryUpdating, List list, String str, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: replaceConversationHistory");
                return;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            conversationHistoryUpdating.replaceConversationHistory(list, str);
        }

        public static /* synthetic */ void updateConversationHistory$default(ConversationHistoryUpdating conversationHistoryUpdating, List list, String str, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: updateConversationHistory");
                return;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            conversationHistoryUpdating.updateConversationHistory(list, str);
        }
    }

    void replaceConversationHistory(@NotNull List<Conversation> conversations, @Nullable String historyToken);

    void updateConversationHistory(@NotNull List<Conversation> conversations, @Nullable String historyToken);

    void updateConversationTopicSegment(@NotNull String conversationId, @NotNull ConversationTopicSegment topicSegment);
}
