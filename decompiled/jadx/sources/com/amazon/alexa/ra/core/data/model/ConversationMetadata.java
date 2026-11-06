package com.amazon.alexa.ra.core.data.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/ConversationMetadata;", "", "id", "", "title", "imageURL", "topicSegment", "Lcom/amazon/alexa/ra/core/data/model/TopicSegment;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/ra/core/data/model/TopicSegment;)V", "getId", "()Ljava/lang/String;", "getTitle", "getImageURL", "getTopicSegment", "()Lcom/amazon/alexa/ra/core/data/model/TopicSegment;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class ConversationMetadata {
    public static final int $stable = 8;

    @NotNull
    private final String id;

    @Nullable
    private final String imageURL;

    @Nullable
    private final String title;

    @Nullable
    private final TopicSegment topicSegment;

    public /* synthetic */ ConversationMetadata(String str, String str2, String str3, TopicSegment topicSegment, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : topicSegment);
    }

    public static /* synthetic */ ConversationMetadata copy$default(ConversationMetadata conversationMetadata, String str, String str2, String str3, TopicSegment topicSegment, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conversationMetadata.id;
        }
        if ((i & 2) != 0) {
            str2 = conversationMetadata.title;
        }
        if ((i & 4) != 0) {
            str3 = conversationMetadata.imageURL;
        }
        if ((i & 8) != 0) {
            topicSegment = conversationMetadata.topicSegment;
        }
        return conversationMetadata.copy(str, str2, str3, topicSegment);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getImageURL() {
        return this.imageURL;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final TopicSegment getTopicSegment() {
        return this.topicSegment;
    }

    @NotNull
    public final ConversationMetadata copy(@NotNull String id, @Nullable String title, @Nullable String imageURL, @Nullable TopicSegment topicSegment) {
        id.getClass();
        return new ConversationMetadata(id, title, imageURL, topicSegment);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationMetadata)) {
            return false;
        }
        ConversationMetadata conversationMetadata = (ConversationMetadata) other;
        return Intrinsics.areEqual(this.id, conversationMetadata.id) && Intrinsics.areEqual(this.title, conversationMetadata.title) && Intrinsics.areEqual(this.imageURL, conversationMetadata.imageURL) && Intrinsics.areEqual(this.topicSegment, conversationMetadata.topicSegment);
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
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final TopicSegment getTopicSegment() {
        return this.topicSegment;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageURL;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TopicSegment topicSegment = this.topicSegment;
        return hashCode3 + (topicSegment != null ? topicSegment.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.imageURL;
        TopicSegment topicSegment = this.topicSegment;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("ConversationMetadata(id=", str, ", title=", str2, ", imageURL=");
        m.append(str3);
        m.append(", topicSegment=");
        m.append(topicSegment);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    public ConversationMetadata(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable TopicSegment topicSegment) {
        str.getClass();
        this.id = str;
        this.title = str2;
        this.imageURL = str3;
        this.topicSegment = topicSegment;
    }
}
