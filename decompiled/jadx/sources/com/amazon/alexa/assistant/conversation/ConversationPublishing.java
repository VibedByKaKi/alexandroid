package com.amazon.alexa.assistant.conversation;

import com.amazon.alexa.assistant.conversation.model.Conversation;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u0011X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationPublishing;", "", "currentConversationFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/amazon/alexa/assistant/conversation/CurrentConversation;", "getCurrentConversationFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "conversationHistoryFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "", "Lcom/amazon/alexa/assistant/conversation/model/Conversation;", "getConversationHistoryFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "cachedConversationHistory", "getCachedConversationHistory", "()Ljava/util/List;", "conversationHistoryToken", "", "getConversationHistoryToken", "()Ljava/lang/String;", "setConversationHistoryToken", "(Ljava/lang/String;)V", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ConversationPublishing {
    @NotNull
    List<Conversation> getCachedConversationHistory();

    @NotNull
    SharedFlow<List<Conversation>> getConversationHistoryFlow();

    @Nullable
    /* renamed from: getConversationHistoryToken */
    String getHistoryToken();

    @NotNull
    StateFlow<CurrentConversation> getCurrentConversationFlow();

    void setConversationHistoryToken(@Nullable String str);
}
