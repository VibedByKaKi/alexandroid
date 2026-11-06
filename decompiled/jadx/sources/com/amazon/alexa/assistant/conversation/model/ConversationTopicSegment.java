package com.amazon.alexa.assistant.conversation.model;

import com.amazon.alexa.accessory.frames.contacts.ContactsModuleConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002#$B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\nHÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J%\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0001¢\u0006\u0002\b\"R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006%"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/model/ConversationTopicSegment;", "", "topics", "", "Lcom/amazon/alexa/assistant/conversation/model/ConversationTopic;", "paginationContext", "Lcom/amazon/alexa/assistant/conversation/model/ConversationTopicPaginationContext;", "<init>", "(Ljava/util/List;Lcom/amazon/alexa/assistant/conversation/model/ConversationTopicPaginationContext;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lcom/amazon/alexa/assistant/conversation/model/ConversationTopicPaginationContext;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTopics", "()Ljava/util/List;", "getPaginationContext", "()Lcom/amazon/alexa/assistant/conversation/model/ConversationTopicPaginationContext;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "write$Self", "", "self", ContactsModuleConstants.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$voice_release", "$serializer", "Companion", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes15.dex */
public final /* data */ class ConversationTopicSegment {

    @Nullable
    private final ConversationTopicPaginationContext paginationContext;

    @NotNull
    private final List<ConversationTopic> topics;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(ConversationTopic$$serializer.INSTANCE), null};

    public /* synthetic */ ConversationTopicSegment(int i, List list, ConversationTopicPaginationContext conversationTopicPaginationContext, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, ConversationTopicSegment$$serializer.INSTANCE.getDescriptor());
        }
        this.topics = list;
        if ((i & 2) == 0) {
            this.paginationContext = null;
        } else {
            this.paginationContext = conversationTopicPaginationContext;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConversationTopicSegment copy$default(ConversationTopicSegment conversationTopicSegment, List list, ConversationTopicPaginationContext conversationTopicPaginationContext, int i, Object obj) {
        if ((i & 1) != 0) {
            list = conversationTopicSegment.topics;
        }
        if ((i & 2) != 0) {
            conversationTopicPaginationContext = conversationTopicSegment.paginationContext;
        }
        return conversationTopicSegment.copy(list, conversationTopicPaginationContext);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$voice_release(ConversationTopicSegment self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, $childSerializers[0], self.topics);
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.paginationContext == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, ConversationTopicPaginationContext$$serializer.INSTANCE, self.paginationContext);
    }

    @NotNull
    public final List<ConversationTopic> component1() {
        return this.topics;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final ConversationTopicPaginationContext getPaginationContext() {
        return this.paginationContext;
    }

    @NotNull
    public final ConversationTopicSegment copy(@NotNull List<ConversationTopic> topics, @Nullable ConversationTopicPaginationContext paginationContext) {
        topics.getClass();
        return new ConversationTopicSegment(topics, paginationContext);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationTopicSegment)) {
            return false;
        }
        ConversationTopicSegment conversationTopicSegment = (ConversationTopicSegment) other;
        return Intrinsics.areEqual(this.topics, conversationTopicSegment.topics) && Intrinsics.areEqual(this.paginationContext, conversationTopicSegment.paginationContext);
    }

    @Nullable
    public final ConversationTopicPaginationContext getPaginationContext() {
        return this.paginationContext;
    }

    @NotNull
    public final List<ConversationTopic> getTopics() {
        return this.topics;
    }

    public int hashCode() {
        int hashCode = this.topics.hashCode() * 31;
        ConversationTopicPaginationContext conversationTopicPaginationContext = this.paginationContext;
        return hashCode + (conversationTopicPaginationContext == null ? 0 : conversationTopicPaginationContext.hashCode());
    }

    @NotNull
    public String toString() {
        return "ConversationTopicSegment(topics=" + this.topics + ", paginationContext=" + this.paginationContext + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/model/ConversationTopicSegment$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/amazon/alexa/assistant/conversation/model/ConversationTopicSegment;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<ConversationTopicSegment> serializer() {
            return ConversationTopicSegment$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ConversationTopicSegment(@NotNull List<ConversationTopic> list, @Nullable ConversationTopicPaginationContext conversationTopicPaginationContext) {
        list.getClass();
        this.topics = list;
        this.paginationContext = conversationTopicPaginationContext;
    }

    public /* synthetic */ ConversationTopicSegment(List list, ConversationTopicPaginationContext conversationTopicPaginationContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : conversationTopicPaginationContext);
    }
}
