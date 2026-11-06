package com.amazon.alexa.assistant.conversation;

import com.amazon.alexa.assistant.conversation.model.Conversation;
import com.amazon.alexa.assistant.conversation.model.ConversationTopicSegment;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/CurrentConversation;", "", "id", "", "metadata", "Lcom/amazon/alexa/assistant/conversation/model/Conversation;", "topicSegment", "Lcom/amazon/alexa/assistant/conversation/model/ConversationTopicSegment;", "origin", "Lcom/amazon/alexa/assistant/conversation/CurrentConversationOrigin;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/assistant/conversation/model/Conversation;Lcom/amazon/alexa/assistant/conversation/model/ConversationTopicSegment;Lcom/amazon/alexa/assistant/conversation/CurrentConversationOrigin;)V", "getId", "()Ljava/lang/String;", "getMetadata", "()Lcom/amazon/alexa/assistant/conversation/model/Conversation;", "getTopicSegment", "()Lcom/amazon/alexa/assistant/conversation/model/ConversationTopicSegment;", "getOrigin", "()Lcom/amazon/alexa/assistant/conversation/CurrentConversationOrigin;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CurrentConversation {

    @NotNull
    private final String id;

    @Nullable
    private final Conversation metadata;

    @NotNull
    private final CurrentConversationOrigin origin;

    @Nullable
    private final ConversationTopicSegment topicSegment;

    public /* synthetic */ CurrentConversation(String str, Conversation conversation, ConversationTopicSegment conversationTopicSegment, CurrentConversationOrigin currentConversationOrigin, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : conversation, (i & 4) != 0 ? null : conversationTopicSegment, (i & 8) != 0 ? CurrentConversationOrigin.REQUEST : currentConversationOrigin);
    }

    public static /* synthetic */ CurrentConversation copy$default(CurrentConversation currentConversation, String str, Conversation conversation, ConversationTopicSegment conversationTopicSegment, CurrentConversationOrigin currentConversationOrigin, int i, Object obj) {
        if ((i & 1) != 0) {
            str = currentConversation.id;
        }
        if ((i & 2) != 0) {
            conversation = currentConversation.metadata;
        }
        if ((i & 4) != 0) {
            conversationTopicSegment = currentConversation.topicSegment;
        }
        if ((i & 8) != 0) {
            currentConversationOrigin = currentConversation.origin;
        }
        return currentConversation.copy(str, conversation, conversationTopicSegment, currentConversationOrigin);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Conversation getMetadata() {
        return this.metadata;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final ConversationTopicSegment getTopicSegment() {
        return this.topicSegment;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final CurrentConversationOrigin getOrigin() {
        return this.origin;
    }

    @NotNull
    public final CurrentConversation copy(@NotNull String id, @Nullable Conversation metadata, @Nullable ConversationTopicSegment topicSegment, @NotNull CurrentConversationOrigin origin) {
        id.getClass();
        origin.getClass();
        return new CurrentConversation(id, metadata, topicSegment, origin);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrentConversation)) {
            return false;
        }
        CurrentConversation currentConversation = (CurrentConversation) other;
        return Intrinsics.areEqual(this.id, currentConversation.id) && Intrinsics.areEqual(this.metadata, currentConversation.metadata) && Intrinsics.areEqual(this.topicSegment, currentConversation.topicSegment) && this.origin == currentConversation.origin;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Conversation getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final CurrentConversationOrigin getOrigin() {
        return this.origin;
    }

    @Nullable
    public final ConversationTopicSegment getTopicSegment() {
        return this.topicSegment;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        Conversation conversation = this.metadata;
        int hashCode2 = (hashCode + (conversation == null ? 0 : conversation.hashCode())) * 31;
        ConversationTopicSegment conversationTopicSegment = this.topicSegment;
        return this.origin.hashCode() + ((hashCode2 + (conversationTopicSegment != null ? conversationTopicSegment.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "CurrentConversation(id=" + this.id + ", metadata=" + this.metadata + ", topicSegment=" + this.topicSegment + ", origin=" + this.origin + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public CurrentConversation(@NotNull String str, @Nullable Conversation conversation, @Nullable ConversationTopicSegment conversationTopicSegment, @NotNull CurrentConversationOrigin currentConversationOrigin) {
        str.getClass();
        currentConversationOrigin.getClass();
        this.id = str;
        this.metadata = conversation;
        this.topicSegment = conversationTopicSegment;
        this.origin = currentConversationOrigin;
    }
}
