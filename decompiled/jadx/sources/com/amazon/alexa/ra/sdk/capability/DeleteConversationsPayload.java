package com.amazon.alexa.ra.sdk.capability;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.utils.JSONConvertible;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/ra/sdk/capability/DeleteConversationsPayload;", "Lcom/amazon/alexa/ra/core/data/utils/JSONConvertible;", "conversationIds", "", "", "conversations", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getConversationIds", "()Ljava/util/List;", "getConversations", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class DeleteConversationsPayload implements JSONConvertible {
    public static final int $stable = 8;

    @SerializedName("conversationIds")
    @Nullable
    private final List<String> conversationIds;

    @SerializedName("conversations")
    @Nullable
    private final List<String> conversations;

    public /* synthetic */ DeleteConversationsPayload(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeleteConversationsPayload copy$default(DeleteConversationsPayload deleteConversationsPayload, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = deleteConversationsPayload.conversationIds;
        }
        if ((i & 2) != 0) {
            list2 = deleteConversationsPayload.conversations;
        }
        return deleteConversationsPayload.copy(list, list2);
    }

    @Nullable
    public final List<String> component1() {
        return this.conversationIds;
    }

    @Nullable
    public final List<String> component2() {
        return this.conversations;
    }

    @NotNull
    public final DeleteConversationsPayload copy(@Nullable List<String> conversationIds, @Nullable List<String> conversations) {
        return new DeleteConversationsPayload(conversationIds, conversations);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteConversationsPayload)) {
            return false;
        }
        DeleteConversationsPayload deleteConversationsPayload = (DeleteConversationsPayload) other;
        return Intrinsics.areEqual(this.conversationIds, deleteConversationsPayload.conversationIds) && Intrinsics.areEqual(this.conversations, deleteConversationsPayload.conversations);
    }

    @Nullable
    public final List<String> getConversationIds() {
        return this.conversationIds;
    }

    @Nullable
    public final List<String> getConversations() {
        return this.conversations;
    }

    public int hashCode() {
        List<String> list = this.conversationIds;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.conversations;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DeleteConversationsPayload(conversationIds=" + this.conversationIds + ", conversations=" + this.conversations + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public DeleteConversationsPayload(@Nullable List<String> list, @Nullable List<String> list2) {
        this.conversationIds = list;
        this.conversations = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeleteConversationsPayload() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
