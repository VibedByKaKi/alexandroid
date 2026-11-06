package com.amazon.alexa.ra.core.data.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/TopicSegment;", "", "topics", "", "Lcom/amazon/alexa/ra/core/data/model/Topic;", "topicPaginationContext", "Lcom/amazon/alexa/ra/core/data/model/TopicPaginationContext;", "<init>", "(Ljava/util/List;Lcom/amazon/alexa/ra/core/data/model/TopicPaginationContext;)V", "getTopics", "()Ljava/util/List;", "getTopicPaginationContext", "()Lcom/amazon/alexa/ra/core/data/model/TopicPaginationContext;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class TopicSegment {
    public static final int $stable = 8;

    @SerializedName("paginationContext")
    @Nullable
    private final TopicPaginationContext topicPaginationContext;

    @SerializedName("topics")
    @NotNull
    private final List<Topic> topics;

    public TopicSegment(@NotNull List<Topic> list, @Nullable TopicPaginationContext topicPaginationContext) {
        list.getClass();
        this.topics = list;
        this.topicPaginationContext = topicPaginationContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TopicSegment copy$default(TopicSegment topicSegment, List list, TopicPaginationContext topicPaginationContext, int i, Object obj) {
        if ((i & 1) != 0) {
            list = topicSegment.topics;
        }
        if ((i & 2) != 0) {
            topicPaginationContext = topicSegment.topicPaginationContext;
        }
        return topicSegment.copy(list, topicPaginationContext);
    }

    @NotNull
    public final List<Topic> component1() {
        return this.topics;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final TopicPaginationContext getTopicPaginationContext() {
        return this.topicPaginationContext;
    }

    @NotNull
    public final TopicSegment copy(@NotNull List<Topic> topics, @Nullable TopicPaginationContext topicPaginationContext) {
        topics.getClass();
        return new TopicSegment(topics, topicPaginationContext);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopicSegment)) {
            return false;
        }
        TopicSegment topicSegment = (TopicSegment) other;
        return Intrinsics.areEqual(this.topics, topicSegment.topics) && Intrinsics.areEqual(this.topicPaginationContext, topicSegment.topicPaginationContext);
    }

    @Nullable
    public final TopicPaginationContext getTopicPaginationContext() {
        return this.topicPaginationContext;
    }

    @NotNull
    public final List<Topic> getTopics() {
        return this.topics;
    }

    public int hashCode() {
        int hashCode = this.topics.hashCode() * 31;
        TopicPaginationContext topicPaginationContext = this.topicPaginationContext;
        return hashCode + (topicPaginationContext == null ? 0 : topicPaginationContext.hashCode());
    }

    @NotNull
    public String toString() {
        return "TopicSegment(topics=" + this.topics + ", topicPaginationContext=" + this.topicPaginationContext + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ TopicSegment(List list, TopicPaginationContext topicPaginationContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : topicPaginationContext);
    }
}
