package com.amazon.alexa.assistant.conversation;

import com.amazon.alexa.assistant.capability.conversation.model.FragmentEvent;
import com.amazon.alexa.assistant.foundation.textstate.model.TextRequestEvent;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationSession;", "", "fragmentEventFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/amazon/alexa/assistant/capability/conversation/model/FragmentEvent;", "textRequestEventFlow", "Lcom/amazon/alexa/assistant/foundation/textstate/model/TextRequestEvent;", "conversationService", "Lcom/amazon/alexa/assistant/conversation/ConversationService;", "conversationTracker", "Lcom/amazon/alexa/assistant/conversation/ConversationTracker;", "<init>", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlinx/coroutines/flow/SharedFlow;Lcom/amazon/alexa/assistant/conversation/ConversationService;Lcom/amazon/alexa/assistant/conversation/ConversationTracker;)V", "getFragmentEventFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "getTextRequestEventFlow", "getConversationService", "()Lcom/amazon/alexa/assistant/conversation/ConversationService;", "getConversationTracker", "()Lcom/amazon/alexa/assistant/conversation/ConversationTracker;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ConversationSession {

    @NotNull
    private final ConversationService conversationService;

    @NotNull
    private final ConversationTracker conversationTracker;

    @Nullable
    private final SharedFlow<FragmentEvent> fragmentEventFlow;

    @Nullable
    private final SharedFlow<TextRequestEvent> textRequestEventFlow;

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationSession(@Nullable SharedFlow<FragmentEvent> sharedFlow, @Nullable SharedFlow<? extends TextRequestEvent> sharedFlow2, @NotNull ConversationService conversationService, @NotNull ConversationTracker conversationTracker) {
        conversationService.getClass();
        conversationTracker.getClass();
        this.fragmentEventFlow = sharedFlow;
        this.textRequestEventFlow = sharedFlow2;
        this.conversationService = conversationService;
        this.conversationTracker = conversationTracker;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConversationSession copy$default(ConversationSession conversationSession, SharedFlow sharedFlow, SharedFlow sharedFlow2, ConversationService conversationService, ConversationTracker conversationTracker, int i, Object obj) {
        if ((i & 1) != 0) {
            sharedFlow = conversationSession.fragmentEventFlow;
        }
        if ((i & 2) != 0) {
            sharedFlow2 = conversationSession.textRequestEventFlow;
        }
        if ((i & 4) != 0) {
            conversationService = conversationSession.conversationService;
        }
        if ((i & 8) != 0) {
            conversationTracker = conversationSession.conversationTracker;
        }
        return conversationSession.copy(sharedFlow, sharedFlow2, conversationService, conversationTracker);
    }

    @Nullable
    public final SharedFlow<FragmentEvent> component1() {
        return this.fragmentEventFlow;
    }

    @Nullable
    public final SharedFlow<TextRequestEvent> component2() {
        return this.textRequestEventFlow;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ConversationService getConversationService() {
        return this.conversationService;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ConversationTracker getConversationTracker() {
        return this.conversationTracker;
    }

    @NotNull
    public final ConversationSession copy(@Nullable SharedFlow<FragmentEvent> fragmentEventFlow, @Nullable SharedFlow<? extends TextRequestEvent> textRequestEventFlow, @NotNull ConversationService conversationService, @NotNull ConversationTracker conversationTracker) {
        conversationService.getClass();
        conversationTracker.getClass();
        return new ConversationSession(fragmentEventFlow, textRequestEventFlow, conversationService, conversationTracker);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationSession)) {
            return false;
        }
        ConversationSession conversationSession = (ConversationSession) other;
        return Intrinsics.areEqual(this.fragmentEventFlow, conversationSession.fragmentEventFlow) && Intrinsics.areEqual(this.textRequestEventFlow, conversationSession.textRequestEventFlow) && Intrinsics.areEqual(this.conversationService, conversationSession.conversationService) && Intrinsics.areEqual(this.conversationTracker, conversationSession.conversationTracker);
    }

    @NotNull
    public final ConversationService getConversationService() {
        return this.conversationService;
    }

    @NotNull
    public final ConversationTracker getConversationTracker() {
        return this.conversationTracker;
    }

    @Nullable
    public final SharedFlow<FragmentEvent> getFragmentEventFlow() {
        return this.fragmentEventFlow;
    }

    @Nullable
    public final SharedFlow<TextRequestEvent> getTextRequestEventFlow() {
        return this.textRequestEventFlow;
    }

    public int hashCode() {
        SharedFlow<FragmentEvent> sharedFlow = this.fragmentEventFlow;
        int hashCode = (sharedFlow == null ? 0 : sharedFlow.hashCode()) * 31;
        SharedFlow<TextRequestEvent> sharedFlow2 = this.textRequestEventFlow;
        return this.conversationTracker.hashCode() + ((this.conversationService.hashCode() + ((hashCode + (sharedFlow2 != null ? sharedFlow2.hashCode() : 0)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "ConversationSession(fragmentEventFlow=" + this.fragmentEventFlow + ", textRequestEventFlow=" + this.textRequestEventFlow + ", conversationService=" + this.conversationService + ", conversationTracker=" + this.conversationTracker + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
