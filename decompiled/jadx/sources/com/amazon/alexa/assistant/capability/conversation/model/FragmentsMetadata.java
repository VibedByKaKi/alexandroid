package com.amazon.alexa.assistant.capability.conversation.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fB=\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\rJ@\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003JM\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006$"}, d2 = {"Lcom/amazon/alexa/assistant/capability/conversation/model/FragmentsMetadata;", "", "conversationId", "", "dialogRequestId", "displayHint", "source", "Lcom/amazon/alexa/assistant/capability/conversation/model/Source;", "paginationContext", "Lcom/amazon/alexa/assistant/capability/conversation/model/PaginationContext;", "topicId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/assistant/capability/conversation/model/Source;Lcom/amazon/alexa/assistant/capability/conversation/model/PaginationContext;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/assistant/capability/conversation/model/Source;Lcom/amazon/alexa/assistant/capability/conversation/model/PaginationContext;)V", "getConversationId", "()Ljava/lang/String;", "getDialogRequestId", "getDisplayHint", "getSource", "()Lcom/amazon/alexa/assistant/capability/conversation/model/Source;", "getPaginationContext", "()Lcom/amazon/alexa/assistant/capability/conversation/model/PaginationContext;", "getTopicId", "copy", "component1", "component2", "component3", "component4", "component5", "component6", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class FragmentsMetadata {

    @NotNull
    private final String conversationId;

    @Nullable
    private final String dialogRequestId;

    @Nullable
    private final String displayHint;

    @Nullable
    private final PaginationContext paginationContext;

    @NotNull
    private final Source source;

    @Nullable
    private final String topicId;

    public /* synthetic */ FragmentsMetadata(String str, String str2, String str3, Source source, PaginationContext paginationContext, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, source, (i & 16) != 0 ? null : paginationContext, (i & 32) != 0 ? null : str4);
    }

    public static /* synthetic */ FragmentsMetadata copy$default(FragmentsMetadata fragmentsMetadata, String str, String str2, String str3, Source source, PaginationContext paginationContext, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fragmentsMetadata.conversationId;
        }
        if ((i & 2) != 0) {
            str2 = fragmentsMetadata.dialogRequestId;
        }
        if ((i & 4) != 0) {
            str3 = fragmentsMetadata.displayHint;
        }
        if ((i & 8) != 0) {
            source = fragmentsMetadata.source;
        }
        if ((i & 16) != 0) {
            paginationContext = fragmentsMetadata.paginationContext;
        }
        if ((i & 32) != 0) {
            str4 = fragmentsMetadata.topicId;
        }
        PaginationContext paginationContext2 = paginationContext;
        String str5 = str4;
        return fragmentsMetadata.copy(str, str2, str3, source, paginationContext2, str5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getDisplayHint() {
        return this.displayHint;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Source getSource() {
        return this.source;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final PaginationContext getPaginationContext() {
        return this.paginationContext;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getTopicId() {
        return this.topicId;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility only; use the generated copy.")
    public final /* synthetic */ FragmentsMetadata copy(String conversationId, String dialogRequestId, String displayHint, Source source, PaginationContext paginationContext) {
        conversationId.getClass();
        source.getClass();
        return copy(conversationId, dialogRequestId, displayHint, source, paginationContext, this.topicId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FragmentsMetadata)) {
            return false;
        }
        FragmentsMetadata fragmentsMetadata = (FragmentsMetadata) other;
        return Intrinsics.areEqual(this.conversationId, fragmentsMetadata.conversationId) && Intrinsics.areEqual(this.dialogRequestId, fragmentsMetadata.dialogRequestId) && Intrinsics.areEqual(this.displayHint, fragmentsMetadata.displayHint) && this.source == fragmentsMetadata.source && Intrinsics.areEqual(this.paginationContext, fragmentsMetadata.paginationContext) && Intrinsics.areEqual(this.topicId, fragmentsMetadata.topicId);
    }

    @NotNull
    public final String getConversationId() {
        return this.conversationId;
    }

    @Nullable
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @Nullable
    public final String getDisplayHint() {
        return this.displayHint;
    }

    @Nullable
    public final PaginationContext getPaginationContext() {
        return this.paginationContext;
    }

    @NotNull
    public final Source getSource() {
        return this.source;
    }

    @Nullable
    public final String getTopicId() {
        return this.topicId;
    }

    public int hashCode() {
        int hashCode = this.conversationId.hashCode() * 31;
        String str = this.dialogRequestId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.displayHint;
        int hashCode3 = (this.source.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        PaginationContext paginationContext = this.paginationContext;
        int hashCode4 = (hashCode3 + (paginationContext == null ? 0 : paginationContext.hashCode())) * 31;
        String str3 = this.topicId;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.conversationId;
        String str2 = this.dialogRequestId;
        String str3 = this.displayHint;
        Source source = this.source;
        PaginationContext paginationContext = this.paginationContext;
        String str4 = this.topicId;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("FragmentsMetadata(conversationId=", str, ", dialogRequestId=", str2, ", displayHint=");
        m.append(str3);
        m.append(", source=");
        m.append(source);
        m.append(", paginationContext=");
        m.append(paginationContext);
        m.append(", topicId=");
        m.append(str4);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    @NotNull
    public final FragmentsMetadata copy(@NotNull String conversationId, @Nullable String dialogRequestId, @Nullable String displayHint, @NotNull Source source, @Nullable PaginationContext paginationContext, @Nullable String topicId) {
        conversationId.getClass();
        source.getClass();
        return new FragmentsMetadata(conversationId, dialogRequestId, displayHint, source, paginationContext, topicId);
    }

    public FragmentsMetadata(@NotNull String str, @Nullable String str2, @Nullable String str3, @NotNull Source source, @Nullable PaginationContext paginationContext, @Nullable String str4) {
        str.getClass();
        source.getClass();
        this.conversationId = str;
        this.dialogRequestId = str2;
        this.displayHint = str3;
        this.source = source;
        this.paginationContext = paginationContext;
        this.topicId = str4;
    }

    public /* synthetic */ FragmentsMetadata(String str, String str2, String str3, Source source, PaginationContext paginationContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, source, (i & 16) != 0 ? null : paginationContext);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility only; use the primary constructor.")
    public /* synthetic */ FragmentsMetadata(String str, String str2, String str3, Source source, PaginationContext paginationContext) {
        this(str, str2, str3, source, paginationContext, null);
        str.getClass();
        source.getClass();
    }

    public static /* synthetic */ FragmentsMetadata copy$default(FragmentsMetadata fragmentsMetadata, String str, String str2, String str3, Source source, PaginationContext paginationContext, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fragmentsMetadata.conversationId;
        }
        if ((i & 2) != 0) {
            str2 = fragmentsMetadata.dialogRequestId;
        }
        if ((i & 4) != 0) {
            str3 = fragmentsMetadata.displayHint;
        }
        if ((i & 8) != 0) {
            source = fragmentsMetadata.source;
        }
        if ((i & 16) != 0) {
            paginationContext = fragmentsMetadata.paginationContext;
        }
        PaginationContext paginationContext2 = paginationContext;
        String str4 = str3;
        return fragmentsMetadata.copy(str, str2, str4, source, paginationContext2);
    }
}
