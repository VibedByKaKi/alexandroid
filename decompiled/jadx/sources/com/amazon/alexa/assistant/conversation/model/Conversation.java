package com.amazon.alexa.assistant.conversation.model;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.frames.contacts.ContactsModuleConstants;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaConversationExtrasBundleKeys;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002>?Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012B{\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0011\u0010\u0017J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jw\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u0014HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001J%\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0001¢\u0006\u0002\b=R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006@"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/model/Conversation;", "", "id", "", AlexaConversationExtrasBundleKeys.PERSON_IDS, "", "assistantId", "title", "imageURL", "creation", "Lcom/amazon/alexa/assistant/conversation/model/ConversationCreation;", "lastTurn", "Lcom/amazon/alexa/assistant/conversation/model/ConversationLastTurn;", "topicSegment", "Lcom/amazon/alexa/assistant/conversation/model/ConversationTopicSegment;", "artifactsSummary", "Lcom/amazon/alexa/assistant/conversation/model/ConversationArtifactsSummary;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/assistant/conversation/model/ConversationCreation;Lcom/amazon/alexa/assistant/conversation/model/ConversationLastTurn;Lcom/amazon/alexa/assistant/conversation/model/ConversationTopicSegment;Lcom/amazon/alexa/assistant/conversation/model/ConversationArtifactsSummary;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/assistant/conversation/model/ConversationCreation;Lcom/amazon/alexa/assistant/conversation/model/ConversationLastTurn;Lcom/amazon/alexa/assistant/conversation/model/ConversationTopicSegment;Lcom/amazon/alexa/assistant/conversation/model/ConversationArtifactsSummary;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getPersonIds", "()Ljava/util/List;", "getAssistantId", "getTitle", "getImageURL", "getCreation", "()Lcom/amazon/alexa/assistant/conversation/model/ConversationCreation;", "getLastTurn", "()Lcom/amazon/alexa/assistant/conversation/model/ConversationLastTurn;", "getTopicSegment", "()Lcom/amazon/alexa/assistant/conversation/model/ConversationTopicSegment;", "getArtifactsSummary", "()Lcom/amazon/alexa/assistant/conversation/model/ConversationArtifactsSummary;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "write$Self", "", "self", ContactsModuleConstants.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$voice_release", "$serializer", "Companion", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes15.dex */
public final /* data */ class Conversation {

    @Nullable
    private final ConversationArtifactsSummary artifactsSummary;

    @NotNull
    private final String assistantId;

    @Nullable
    private final ConversationCreation creation;

    @NotNull
    private final String id;

    @Nullable
    private final String imageURL;

    @Nullable
    private final ConversationLastTurn lastTurn;

    @Nullable
    private final List<String> personIds;

    @Nullable
    private final String title;

    @Nullable
    private final ConversationTopicSegment topicSegment;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null, null, null};

    public /* synthetic */ Conversation(int i, String str, List list, String str2, String str3, String str4, ConversationCreation conversationCreation, ConversationLastTurn conversationLastTurn, ConversationTopicSegment conversationTopicSegment, ConversationArtifactsSummary conversationArtifactsSummary, SerializationConstructorMarker serializationConstructorMarker) {
        if (5 != (i & 5)) {
            PluginExceptionsKt.throwMissingFieldException(i, 5, Conversation$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        if ((i & 2) == 0) {
            this.personIds = null;
        } else {
            this.personIds = list;
        }
        this.assistantId = str2;
        if ((i & 8) == 0) {
            this.title = null;
        } else {
            this.title = str3;
        }
        if ((i & 16) == 0) {
            this.imageURL = null;
        } else {
            this.imageURL = str4;
        }
        if ((i & 32) == 0) {
            this.creation = null;
        } else {
            this.creation = conversationCreation;
        }
        if ((i & 64) == 0) {
            this.lastTurn = null;
        } else {
            this.lastTurn = conversationLastTurn;
        }
        if ((i & 128) == 0) {
            this.topicSegment = null;
        } else {
            this.topicSegment = conversationTopicSegment;
        }
        if ((i & 256) == 0) {
            this.artifactsSummary = null;
        } else {
            this.artifactsSummary = conversationArtifactsSummary;
        }
    }

    public static /* synthetic */ Conversation copy$default(Conversation conversation, String str, List list, String str2, String str3, String str4, ConversationCreation conversationCreation, ConversationLastTurn conversationLastTurn, ConversationTopicSegment conversationTopicSegment, ConversationArtifactsSummary conversationArtifactsSummary, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conversation.id;
        }
        if ((i & 2) != 0) {
            list = conversation.personIds;
        }
        if ((i & 4) != 0) {
            str2 = conversation.assistantId;
        }
        if ((i & 8) != 0) {
            str3 = conversation.title;
        }
        if ((i & 16) != 0) {
            str4 = conversation.imageURL;
        }
        if ((i & 32) != 0) {
            conversationCreation = conversation.creation;
        }
        if ((i & 64) != 0) {
            conversationLastTurn = conversation.lastTurn;
        }
        if ((i & 128) != 0) {
            conversationTopicSegment = conversation.topicSegment;
        }
        if ((i & 256) != 0) {
            conversationArtifactsSummary = conversation.artifactsSummary;
        }
        ConversationTopicSegment conversationTopicSegment2 = conversationTopicSegment;
        ConversationArtifactsSummary conversationArtifactsSummary2 = conversationArtifactsSummary;
        ConversationCreation conversationCreation2 = conversationCreation;
        ConversationLastTurn conversationLastTurn2 = conversationLastTurn;
        String str5 = str4;
        String str6 = str2;
        return conversation.copy(str, list, str6, str3, str5, conversationCreation2, conversationLastTurn2, conversationTopicSegment2, conversationArtifactsSummary2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$voice_release(Conversation self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.personIds != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, kSerializerArr[1], self.personIds);
        }
        output.encodeStringElement(serialDesc, 2, self.assistantId);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.imageURL != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.imageURL);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.creation != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, ConversationCreation$$serializer.INSTANCE, self.creation);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.lastTurn != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, ConversationLastTurn$$serializer.INSTANCE, self.lastTurn);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.topicSegment != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, ConversationTopicSegment$$serializer.INSTANCE, self.topicSegment);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.artifactsSummary == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 8, ConversationArtifactsSummary$$serializer.INSTANCE, self.artifactsSummary);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final List<String> component2() {
        return this.personIds;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getAssistantId() {
        return this.assistantId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getImageURL() {
        return this.imageURL;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final ConversationCreation getCreation() {
        return this.creation;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final ConversationLastTurn getLastTurn() {
        return this.lastTurn;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final ConversationTopicSegment getTopicSegment() {
        return this.topicSegment;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final ConversationArtifactsSummary getArtifactsSummary() {
        return this.artifactsSummary;
    }

    @NotNull
    public final Conversation copy(@NotNull String id, @Nullable List<String> personIds, @NotNull String assistantId, @Nullable String title, @Nullable String imageURL, @Nullable ConversationCreation creation, @Nullable ConversationLastTurn lastTurn, @Nullable ConversationTopicSegment topicSegment, @Nullable ConversationArtifactsSummary artifactsSummary) {
        id.getClass();
        assistantId.getClass();
        return new Conversation(id, personIds, assistantId, title, imageURL, creation, lastTurn, topicSegment, artifactsSummary);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Conversation)) {
            return false;
        }
        Conversation conversation = (Conversation) other;
        return Intrinsics.areEqual(this.id, conversation.id) && Intrinsics.areEqual(this.personIds, conversation.personIds) && Intrinsics.areEqual(this.assistantId, conversation.assistantId) && Intrinsics.areEqual(this.title, conversation.title) && Intrinsics.areEqual(this.imageURL, conversation.imageURL) && Intrinsics.areEqual(this.creation, conversation.creation) && Intrinsics.areEqual(this.lastTurn, conversation.lastTurn) && Intrinsics.areEqual(this.topicSegment, conversation.topicSegment) && Intrinsics.areEqual(this.artifactsSummary, conversation.artifactsSummary);
    }

    @Nullable
    public final ConversationArtifactsSummary getArtifactsSummary() {
        return this.artifactsSummary;
    }

    @NotNull
    public final String getAssistantId() {
        return this.assistantId;
    }

    @Nullable
    public final ConversationCreation getCreation() {
        return this.creation;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getImageURL() {
        return this.imageURL;
    }

    @Nullable
    public final ConversationLastTurn getLastTurn() {
        return this.lastTurn;
    }

    @Nullable
    public final List<String> getPersonIds() {
        return this.personIds;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final ConversationTopicSegment getTopicSegment() {
        return this.topicSegment;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        List<String> list = this.personIds;
        int m = ArcMode$$ExternalSyntheticOutline0.m((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.assistantId);
        String str = this.title;
        int hashCode2 = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageURL;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ConversationCreation conversationCreation = this.creation;
        int hashCode4 = (hashCode3 + (conversationCreation == null ? 0 : conversationCreation.hashCode())) * 31;
        ConversationLastTurn conversationLastTurn = this.lastTurn;
        int hashCode5 = (hashCode4 + (conversationLastTurn == null ? 0 : conversationLastTurn.hashCode())) * 31;
        ConversationTopicSegment conversationTopicSegment = this.topicSegment;
        int hashCode6 = (hashCode5 + (conversationTopicSegment == null ? 0 : conversationTopicSegment.hashCode())) * 31;
        ConversationArtifactsSummary conversationArtifactsSummary = this.artifactsSummary;
        return hashCode6 + (conversationArtifactsSummary != null ? conversationArtifactsSummary.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        List<String> list = this.personIds;
        String str2 = this.assistantId;
        String str3 = this.title;
        String str4 = this.imageURL;
        ConversationCreation conversationCreation = this.creation;
        ConversationLastTurn conversationLastTurn = this.lastTurn;
        ConversationTopicSegment conversationTopicSegment = this.topicSegment;
        ConversationArtifactsSummary conversationArtifactsSummary = this.artifactsSummary;
        StringBuilder m14724m = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m14724m("Conversation(id=", str, ", personIds=", (List) list, ", assistantId=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m14724m, str2, ", title=", str3, ", imageURL=");
        m14724m.append(str4);
        m14724m.append(", creation=");
        m14724m.append(conversationCreation);
        m14724m.append(", lastTurn=");
        m14724m.append(conversationLastTurn);
        m14724m.append(", topicSegment=");
        m14724m.append(conversationTopicSegment);
        m14724m.append(", artifactsSummary=");
        m14724m.append(conversationArtifactsSummary);
        m14724m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m14724m.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/model/Conversation$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/amazon/alexa/assistant/conversation/model/Conversation;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<Conversation> serializer() {
            return Conversation$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Conversation(@NotNull String str, @Nullable List<String> list, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable ConversationCreation conversationCreation, @Nullable ConversationLastTurn conversationLastTurn, @Nullable ConversationTopicSegment conversationTopicSegment, @Nullable ConversationArtifactsSummary conversationArtifactsSummary) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.personIds = list;
        this.assistantId = str2;
        this.title = str3;
        this.imageURL = str4;
        this.creation = conversationCreation;
        this.lastTurn = conversationLastTurn;
        this.topicSegment = conversationTopicSegment;
        this.artifactsSummary = conversationArtifactsSummary;
    }

    public /* synthetic */ Conversation(String str, List list, String str2, String str3, String str4, ConversationCreation conversationCreation, ConversationLastTurn conversationLastTurn, ConversationTopicSegment conversationTopicSegment, ConversationArtifactsSummary conversationArtifactsSummary, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : list, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : conversationCreation, (i & 64) != 0 ? null : conversationLastTurn, (i & 128) != 0 ? null : conversationTopicSegment, (i & 256) != 0 ? null : conversationArtifactsSummary);
    }
}
