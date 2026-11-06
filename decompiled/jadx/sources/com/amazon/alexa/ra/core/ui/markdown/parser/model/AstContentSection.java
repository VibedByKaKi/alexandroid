package com.amazon.alexa.ra.core.ui.markdown.parser.model;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.Stable;
import com.amazon.alexa.ra.core.data.fragments.FragmentMetaData;
import com.amazon.alexa.ra.core.ui.markdown.model.MarkdownContentType;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.commonmark.node.Node;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Stable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003JT\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\nHÖ\u0001J\t\u0010'\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019¨\u0006("}, d2 = {"Lcom/amazon/alexa/ra/core/ui/markdown/parser/model/AstContentSection;", "", "contentType", "Lcom/amazon/alexa/ra/core/ui/markdown/model/MarkdownContentType;", "astNode", "Lorg/commonmark/node/Node;", "citationRefIds", "", "", FragmentMetaData.GROUP_ID, "", "accessibilityText", "contentKey", "<init>", "(Lcom/amazon/alexa/ra/core/ui/markdown/model/MarkdownContentType;Lorg/commonmark/node/Node;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getContentType", "()Lcom/amazon/alexa/ra/core/ui/markdown/model/MarkdownContentType;", "getAstNode", "()Lorg/commonmark/node/Node;", "getCitationRefIds", "()Ljava/util/List;", "getGroupId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAccessibilityText", "()Ljava/lang/String;", "getContentKey", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/amazon/alexa/ra/core/ui/markdown/model/MarkdownContentType;Lorg/commonmark/node/Node;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/amazon/alexa/ra/core/ui/markdown/parser/model/AstContentSection;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class AstContentSection {
    public static final int $stable = 0;

    @NotNull
    private final String accessibilityText;

    @NotNull
    private final Node astNode;

    @NotNull
    private final List<String> citationRefIds;

    @NotNull
    private final String contentKey;

    @Nullable
    private final MarkdownContentType contentType;

    @Nullable
    private final Integer groupId;

    public /* synthetic */ AstContentSection(MarkdownContentType markdownContentType, Node node, List list, Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(markdownContentType, node, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : num, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? "" : str2);
    }

    public static /* synthetic */ AstContentSection copy$default(AstContentSection astContentSection, MarkdownContentType markdownContentType, Node node, List list, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            markdownContentType = astContentSection.contentType;
        }
        if ((i & 2) != 0) {
            node = astContentSection.astNode;
        }
        if ((i & 4) != 0) {
            list = astContentSection.citationRefIds;
        }
        if ((i & 8) != 0) {
            num = astContentSection.groupId;
        }
        if ((i & 16) != 0) {
            str = astContentSection.accessibilityText;
        }
        if ((i & 32) != 0) {
            str2 = astContentSection.contentKey;
        }
        String str3 = str;
        String str4 = str2;
        return astContentSection.copy(markdownContentType, node, list, num, str3, str4);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final MarkdownContentType getContentType() {
        return this.contentType;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Node getAstNode() {
        return this.astNode;
    }

    @NotNull
    public final List<String> component3() {
        return this.citationRefIds;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getGroupId() {
        return this.groupId;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getAccessibilityText() {
        return this.accessibilityText;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getContentKey() {
        return this.contentKey;
    }

    @NotNull
    public final AstContentSection copy(@Nullable MarkdownContentType contentType, @NotNull Node astNode, @NotNull List<String> citationRefIds, @Nullable Integer groupId, @NotNull String accessibilityText, @NotNull String contentKey) {
        astNode.getClass();
        citationRefIds.getClass();
        accessibilityText.getClass();
        contentKey.getClass();
        return new AstContentSection(contentType, astNode, citationRefIds, groupId, accessibilityText, contentKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AstContentSection)) {
            return false;
        }
        AstContentSection astContentSection = (AstContentSection) other;
        return this.contentType == astContentSection.contentType && Intrinsics.areEqual(this.astNode, astContentSection.astNode) && Intrinsics.areEqual(this.citationRefIds, astContentSection.citationRefIds) && Intrinsics.areEqual(this.groupId, astContentSection.groupId) && Intrinsics.areEqual(this.accessibilityText, astContentSection.accessibilityText) && Intrinsics.areEqual(this.contentKey, astContentSection.contentKey);
    }

    @NotNull
    public final String getAccessibilityText() {
        return this.accessibilityText;
    }

    @NotNull
    public final Node getAstNode() {
        return this.astNode;
    }

    @NotNull
    public final List<String> getCitationRefIds() {
        return this.citationRefIds;
    }

    @NotNull
    public final String getContentKey() {
        return this.contentKey;
    }

    @Nullable
    public final MarkdownContentType getContentType() {
        return this.contentType;
    }

    @Nullable
    public final Integer getGroupId() {
        return this.groupId;
    }

    public int hashCode() {
        MarkdownContentType markdownContentType = this.contentType;
        int m = ArcMode$$ExternalSyntheticOutline0.m(this.citationRefIds, (this.astNode.hashCode() + ((markdownContentType == null ? 0 : markdownContentType.hashCode()) * 31)) * 31, 31);
        Integer num = this.groupId;
        return this.contentKey.hashCode() + ArcMode$$ExternalSyntheticOutline0.m((m + (num != null ? num.hashCode() : 0)) * 31, 31, this.accessibilityText);
    }

    @NotNull
    public String toString() {
        MarkdownContentType markdownContentType = this.contentType;
        Node node = this.astNode;
        List<String> list = this.citationRefIds;
        Integer num = this.groupId;
        String str = this.accessibilityText;
        String str2 = this.contentKey;
        StringBuilder sb = new StringBuilder("AstContentSection(contentType=");
        sb.append(markdownContentType);
        sb.append(", astNode=");
        sb.append(node);
        sb.append(", citationRefIds=");
        sb.append(list);
        sb.append(", groupId=");
        sb.append(num);
        sb.append(", accessibilityText=");
        return DoubleList$$ExternalSyntheticOutline0.m(sb, str, ", contentKey=", str2, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public AstContentSection(@Nullable MarkdownContentType markdownContentType, @NotNull Node node, @NotNull List<String> list, @Nullable Integer num, @NotNull String str, @NotNull String str2) {
        node.getClass();
        list.getClass();
        str.getClass();
        str2.getClass();
        this.contentType = markdownContentType;
        this.astNode = node;
        this.citationRefIds = list;
        this.groupId = num;
        this.accessibilityText = str;
        this.contentKey = str2;
    }
}
