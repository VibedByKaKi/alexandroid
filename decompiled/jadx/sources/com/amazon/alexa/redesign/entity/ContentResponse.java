package com.amazon.alexa.redesign.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.client.FeedsSource;
import com.amazon.alexa.redesign.entity.agentforward.domain.AgentForwardContent;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/amazon/alexa/redesign/entity/ContentResponse;", "", "cardModels", "", "Lcom/amazon/alexa/redesign/entity/CardModel;", "status", "Lcom/amazon/alexa/redesign/entity/Status;", "feedsSource", "Lcom/amazon/alexa/redesign/client/FeedsSource;", "agentForwardContent", "Lcom/amazon/alexa/redesign/entity/agentforward/domain/AgentForwardContent;", "<init>", "(Ljava/util/List;Lcom/amazon/alexa/redesign/entity/Status;Lcom/amazon/alexa/redesign/client/FeedsSource;Lcom/amazon/alexa/redesign/entity/agentforward/domain/AgentForwardContent;)V", "getCardModels", "()Ljava/util/List;", "getStatus", "()Lcom/amazon/alexa/redesign/entity/Status;", "getFeedsSource", "()Lcom/amazon/alexa/redesign/client/FeedsSource;", "getAgentForwardContent", "()Lcom/amazon/alexa/redesign/entity/agentforward/domain/AgentForwardContent;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class ContentResponse {
    public static final int $stable = 8;

    @Nullable
    private final AgentForwardContent agentForwardContent;

    @NotNull
    private final List<CardModel> cardModels;

    @NotNull
    private final FeedsSource feedsSource;

    @NotNull
    private final Status status;

    public ContentResponse(@NotNull List<CardModel> list, @NotNull Status status, @NotNull FeedsSource feedsSource, @Nullable AgentForwardContent agentForwardContent) {
        list.getClass();
        status.getClass();
        feedsSource.getClass();
        this.cardModels = list;
        this.status = status;
        this.feedsSource = feedsSource;
        this.agentForwardContent = agentForwardContent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContentResponse copy$default(ContentResponse contentResponse, List list, Status status, FeedsSource feedsSource, AgentForwardContent agentForwardContent, int i, Object obj) {
        if ((i & 1) != 0) {
            list = contentResponse.cardModels;
        }
        if ((i & 2) != 0) {
            status = contentResponse.status;
        }
        if ((i & 4) != 0) {
            feedsSource = contentResponse.feedsSource;
        }
        if ((i & 8) != 0) {
            agentForwardContent = contentResponse.agentForwardContent;
        }
        return contentResponse.copy(list, status, feedsSource, agentForwardContent);
    }

    @NotNull
    public final List<CardModel> component1() {
        return this.cardModels;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final FeedsSource getFeedsSource() {
        return this.feedsSource;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final AgentForwardContent getAgentForwardContent() {
        return this.agentForwardContent;
    }

    @NotNull
    public final ContentResponse copy(@NotNull List<CardModel> cardModels, @NotNull Status status, @NotNull FeedsSource feedsSource, @Nullable AgentForwardContent agentForwardContent) {
        cardModels.getClass();
        status.getClass();
        feedsSource.getClass();
        return new ContentResponse(cardModels, status, feedsSource, agentForwardContent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentResponse)) {
            return false;
        }
        ContentResponse contentResponse = (ContentResponse) other;
        return Intrinsics.areEqual(this.cardModels, contentResponse.cardModels) && this.status == contentResponse.status && this.feedsSource == contentResponse.feedsSource && Intrinsics.areEqual(this.agentForwardContent, contentResponse.agentForwardContent);
    }

    @Nullable
    public final AgentForwardContent getAgentForwardContent() {
        return this.agentForwardContent;
    }

    @NotNull
    public final List<CardModel> getCardModels() {
        return this.cardModels;
    }

    @NotNull
    public final FeedsSource getFeedsSource() {
        return this.feedsSource;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = (this.feedsSource.hashCode() + ((this.status.hashCode() + (this.cardModels.hashCode() * 31)) * 31)) * 31;
        AgentForwardContent agentForwardContent = this.agentForwardContent;
        return hashCode + (agentForwardContent == null ? 0 : agentForwardContent.hashCode());
    }

    @NotNull
    public String toString() {
        return "ContentResponse(cardModels=" + this.cardModels + ", status=" + this.status + ", feedsSource=" + this.feedsSource + ", agentForwardContent=" + this.agentForwardContent + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
