package com.amazon.alexa.assistant.capability.conversation.model;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.frames.contacts.ContactsModuleConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.EncodeDefault;
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
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002>?B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0004\b\u0010\u0010\u0011BO\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0012Bw\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0010\u0010\u0017JV\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0007J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\t\u0010-\u001a\u00020\fHÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003Ji\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u0014HÖ\u0001J\t\u00105\u001a\u00020\nHÖ\u0001J%\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0001¢\u0006\u0002\b=R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001fR$\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010$\u001a\u0004\b'\u0010\u001d¨\u0006@"}, d2 = {"Lcom/amazon/alexa/assistant/capability/conversation/model/ConversationStatePayload;", "", "size", "Lcom/amazon/alexa/assistant/capability/conversation/model/Size;", "scrollable", "Lcom/amazon/alexa/assistant/capability/conversation/model/Scrollable;", AlexaMetricsConstants.MetricsComponents.ELEMENTS, "", "Lcom/amazon/alexa/assistant/capability/conversation/model/VCF2Element;", "type", "", "windowState", "Lcom/amazon/alexa/assistant/capability/conversation/model/WindowState;", "version", "conversationId", "topicIds", "<init>", "(Lcom/amazon/alexa/assistant/capability/conversation/model/Size;Lcom/amazon/alexa/assistant/capability/conversation/model/Scrollable;Ljava/util/List;Ljava/lang/String;Lcom/amazon/alexa/assistant/capability/conversation/model/WindowState;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "(Lcom/amazon/alexa/assistant/capability/conversation/model/Size;Lcom/amazon/alexa/assistant/capability/conversation/model/Scrollable;Ljava/util/List;Ljava/lang/String;Lcom/amazon/alexa/assistant/capability/conversation/model/WindowState;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/amazon/alexa/assistant/capability/conversation/model/Size;Lcom/amazon/alexa/assistant/capability/conversation/model/Scrollable;Ljava/util/List;Ljava/lang/String;Lcom/amazon/alexa/assistant/capability/conversation/model/WindowState;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSize", "()Lcom/amazon/alexa/assistant/capability/conversation/model/Size;", "getScrollable", "()Lcom/amazon/alexa/assistant/capability/conversation/model/Scrollable;", "getElements", "()Ljava/util/List;", "getType", "()Ljava/lang/String;", "getWindowState", "()Lcom/amazon/alexa/assistant/capability/conversation/model/WindowState;", "getVersion", "getConversationId$annotations", "()V", "getConversationId", "getTopicIds$annotations", "getTopicIds", "copy", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "write$Self", "", "self", ContactsModuleConstants.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$voice_release", "$serializer", "Companion", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes15.dex */
public final /* data */ class ConversationStatePayload {

    @Nullable
    private final String conversationId;

    @NotNull
    private final List<VCF2Element> elements;

    @NotNull
    private final Scrollable scrollable;

    @NotNull
    private final Size size;

    @Nullable
    private final List<String> topicIds;

    @NotNull
    private final String type;

    @NotNull
    private final String version;

    @NotNull
    private final WindowState windowState;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(VCF2Element$$serializer.INSTANCE), null, WindowState.INSTANCE.serializer(), null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    public /* synthetic */ ConversationStatePayload(int i, Size size, Scrollable scrollable, List list, String str, WindowState windowState, String str2, String str3, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (23 != (i & 23)) {
            PluginExceptionsKt.throwMissingFieldException(i, 23, ConversationStatePayload$$serializer.INSTANCE.getDescriptor());
        }
        this.size = size;
        this.scrollable = scrollable;
        this.elements = list;
        if ((i & 8) == 0) {
            this.type = "VCF2";
        } else {
            this.type = str;
        }
        this.windowState = windowState;
        if ((i & 32) == 0) {
            this.version = "2025.1";
        } else {
            this.version = str2;
        }
        if ((i & 64) == 0) {
            this.conversationId = null;
        } else {
            this.conversationId = str3;
        }
        if ((i & 128) == 0) {
            this.topicIds = null;
        } else {
            this.topicIds = list2;
        }
    }

    public static /* synthetic */ ConversationStatePayload copy$default(ConversationStatePayload conversationStatePayload, Size size, Scrollable scrollable, List list, String str, WindowState windowState, String str2, String str3, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            size = conversationStatePayload.size;
        }
        if ((i & 2) != 0) {
            scrollable = conversationStatePayload.scrollable;
        }
        if ((i & 4) != 0) {
            list = conversationStatePayload.elements;
        }
        if ((i & 8) != 0) {
            str = conversationStatePayload.type;
        }
        if ((i & 16) != 0) {
            windowState = conversationStatePayload.windowState;
        }
        if ((i & 32) != 0) {
            str2 = conversationStatePayload.version;
        }
        if ((i & 64) != 0) {
            str3 = conversationStatePayload.conversationId;
        }
        if ((i & 128) != 0) {
            list2 = conversationStatePayload.topicIds;
        }
        String str4 = str3;
        List list3 = list2;
        WindowState windowState2 = windowState;
        String str5 = str2;
        return conversationStatePayload.copy(size, scrollable, list, str, windowState2, str5, str4, list3);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$voice_release(ConversationStatePayload self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, Size$$serializer.INSTANCE, self.size);
        output.encodeSerializableElement(serialDesc, 1, Scrollable$$serializer.INSTANCE, self.scrollable);
        output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.elements);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.areEqual(self.type, "VCF2")) {
            output.encodeStringElement(serialDesc, 3, self.type);
        }
        output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.windowState);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !Intrinsics.areEqual(self.version, "2025.1")) {
            output.encodeStringElement(serialDesc, 5, self.version);
        }
        String str = self.conversationId;
        if (str != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, str);
        }
        List<String> list = self.topicIds;
        if (list != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, kSerializerArr[7], list);
        }
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Scrollable getScrollable() {
        return this.scrollable;
    }

    @NotNull
    public final List<VCF2Element> component3() {
        return this.elements;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final WindowState getWindowState() {
        return this.windowState;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    @Nullable
    public final List<String> component8() {
        return this.topicIds;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility only; use the generated copy.")
    public final /* synthetic */ ConversationStatePayload copy(Size size, Scrollable scrollable, List elements, String type, WindowState windowState, String version, String conversationId) {
        size.getClass();
        scrollable.getClass();
        elements.getClass();
        type.getClass();
        windowState.getClass();
        version.getClass();
        return copy(size, scrollable, elements, type, windowState, version, conversationId, this.topicIds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationStatePayload)) {
            return false;
        }
        ConversationStatePayload conversationStatePayload = (ConversationStatePayload) other;
        return Intrinsics.areEqual(this.size, conversationStatePayload.size) && Intrinsics.areEqual(this.scrollable, conversationStatePayload.scrollable) && Intrinsics.areEqual(this.elements, conversationStatePayload.elements) && Intrinsics.areEqual(this.type, conversationStatePayload.type) && this.windowState == conversationStatePayload.windowState && Intrinsics.areEqual(this.version, conversationStatePayload.version) && Intrinsics.areEqual(this.conversationId, conversationStatePayload.conversationId) && Intrinsics.areEqual(this.topicIds, conversationStatePayload.topicIds);
    }

    @Nullable
    public final String getConversationId() {
        return this.conversationId;
    }

    @NotNull
    public final List<VCF2Element> getElements() {
        return this.elements;
    }

    @NotNull
    public final Scrollable getScrollable() {
        return this.scrollable;
    }

    @NotNull
    public final Size getSize() {
        return this.size;
    }

    @Nullable
    public final List<String> getTopicIds() {
        return this.topicIds;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    public final WindowState getWindowState() {
        return this.windowState;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m((this.windowState.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(this.elements, (this.scrollable.hashCode() + (this.size.hashCode() * 31)) * 31, 31), 31, this.type)) * 31, 31, this.version);
        String str = this.conversationId;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.topicIds;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ConversationStatePayload(size=" + this.size + ", scrollable=" + this.scrollable + ", elements=" + this.elements + ", type=" + this.type + ", windowState=" + this.windowState + ", version=" + this.version + ", conversationId=" + this.conversationId + ", topicIds=" + this.topicIds + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/assistant/capability/conversation/model/ConversationStatePayload$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/amazon/alexa/assistant/capability/conversation/model/ConversationStatePayload;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<ConversationStatePayload> serializer() {
            return ConversationStatePayload$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getConversationId$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getTopicIds$annotations() {
    }

    @NotNull
    public final ConversationStatePayload copy(@NotNull Size size, @NotNull Scrollable scrollable, @NotNull List<VCF2Element> elements, @NotNull String type, @NotNull WindowState windowState, @NotNull String version, @Nullable String conversationId, @Nullable List<String> topicIds) {
        size.getClass();
        scrollable.getClass();
        elements.getClass();
        type.getClass();
        windowState.getClass();
        version.getClass();
        return new ConversationStatePayload(size, scrollable, elements, type, windowState, version, conversationId, topicIds);
    }

    public static /* synthetic */ ConversationStatePayload copy$default(ConversationStatePayload conversationStatePayload, Size size, Scrollable scrollable, List list, String str, WindowState windowState, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            size = conversationStatePayload.size;
        }
        if ((i & 2) != 0) {
            scrollable = conversationStatePayload.scrollable;
        }
        if ((i & 4) != 0) {
            list = conversationStatePayload.elements;
        }
        if ((i & 8) != 0) {
            str = conversationStatePayload.type;
        }
        if ((i & 16) != 0) {
            windowState = conversationStatePayload.windowState;
        }
        if ((i & 32) != 0) {
            str2 = conversationStatePayload.version;
        }
        if ((i & 64) != 0) {
            str3 = conversationStatePayload.conversationId;
        }
        String str4 = str2;
        String str5 = str3;
        WindowState windowState2 = windowState;
        List list2 = list;
        return conversationStatePayload.copy(size, scrollable, list2, str, windowState2, str4, str5);
    }

    public ConversationStatePayload(@NotNull Size size, @NotNull Scrollable scrollable, @NotNull List<VCF2Element> list, @NotNull String str, @NotNull WindowState windowState, @NotNull String str2, @Nullable String str3, @Nullable List<String> list2) {
        size.getClass();
        scrollable.getClass();
        list.getClass();
        str.getClass();
        windowState.getClass();
        str2.getClass();
        this.size = size;
        this.scrollable = scrollable;
        this.elements = list;
        this.type = str;
        this.windowState = windowState;
        this.version = str2;
        this.conversationId = str3;
        this.topicIds = list2;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ ConversationStatePayload(com.amazon.alexa.assistant.capability.conversation.model.Size r10, com.amazon.alexa.assistant.capability.conversation.model.Scrollable r11, java.util.List r12, java.lang.String r13, com.amazon.alexa.assistant.capability.conversation.model.WindowState r14, java.lang.String r15, java.lang.String r16, java.util.List r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 8
            if (r1 == 0) goto L8
            java.lang.String r13 = "VCF2"
        L8:
            r4 = r13
            r13 = r0 & 32
            if (r13 == 0) goto L11
            java.lang.String r13 = "2025.1"
            r6 = r13
            goto L12
        L11:
            r6 = r15
        L12:
            r13 = r0 & 64
            r1 = 0
            if (r13 == 0) goto L19
            r7 = r1
            goto L1b
        L19:
            r7 = r16
        L1b:
            r13 = r0 & 128(0x80, float:1.8E-43)
            if (r13 == 0) goto L26
            r8 = r1
            r0 = r9
            r2 = r11
            r3 = r12
            r5 = r14
            r1 = r10
            goto L2d
        L26:
            r8 = r17
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r5 = r14
        L2d:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.assistant.capability.conversation.model.ConversationStatePayload.<init>(com.amazon.alexa.assistant.capability.conversation.model.Size, com.amazon.alexa.assistant.capability.conversation.model.Scrollable, java.util.List, java.lang.String, com.amazon.alexa.assistant.capability.conversation.model.WindowState, java.lang.String, java.lang.String, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public /* synthetic */ ConversationStatePayload(Size size, Scrollable scrollable, List list, String str, WindowState windowState, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(size, scrollable, list, (i & 8) != 0 ? "VCF2" : str, windowState, (i & 32) != 0 ? "2025.1" : str2, (i & 64) != 0 ? null : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility only; use the primary constructor.")
    public /* synthetic */ ConversationStatePayload(Size size, Scrollable scrollable, List list, String str, WindowState windowState, String str2, String str3) {
        this(size, scrollable, list, str, windowState, str2, str3, null);
        size.getClass();
        scrollable.getClass();
        list.getClass();
        str.getClass();
        windowState.getClass();
        str2.getClass();
    }
}
