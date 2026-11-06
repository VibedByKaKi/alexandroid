package com.amazon.alexa.ra.core.ui.markdown.model;

import androidx.compose.runtime.Stable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.commonmark.node.Node;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Stable
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/markdown/model/ParsedContentSection;", "", "contentType", "Lcom/amazon/alexa/ra/core/ui/markdown/model/MarkdownContentType;", "content", "", "astNode", "Lorg/commonmark/node/Node;", "tableMetadata", "Lcom/amazon/alexa/ra/core/ui/markdown/model/TableMetadata;", "<init>", "(Lcom/amazon/alexa/ra/core/ui/markdown/model/MarkdownContentType;Ljava/lang/String;Lorg/commonmark/node/Node;Lcom/amazon/alexa/ra/core/ui/markdown/model/TableMetadata;)V", "getContentType", "()Lcom/amazon/alexa/ra/core/ui/markdown/model/MarkdownContentType;", "getContent", "()Ljava/lang/String;", "getAstNode", "()Lorg/commonmark/node/Node;", "getTableMetadata", "()Lcom/amazon/alexa/ra/core/ui/markdown/model/TableMetadata;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class ParsedContentSection {
    public static final int $stable = 0;

    @Nullable
    private final Node astNode;

    @Nullable
    private final String content;

    @Nullable
    private final MarkdownContentType contentType;

    @Nullable
    private final TableMetadata tableMetadata;

    public /* synthetic */ ParsedContentSection(MarkdownContentType markdownContentType, String str, Node node, TableMetadata tableMetadata, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : markdownContentType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : node, (i & 8) != 0 ? null : tableMetadata);
    }

    public static /* synthetic */ ParsedContentSection copy$default(ParsedContentSection parsedContentSection, MarkdownContentType markdownContentType, String str, Node node, TableMetadata tableMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            markdownContentType = parsedContentSection.contentType;
        }
        if ((i & 2) != 0) {
            str = parsedContentSection.content;
        }
        if ((i & 4) != 0) {
            node = parsedContentSection.astNode;
        }
        if ((i & 8) != 0) {
            tableMetadata = parsedContentSection.tableMetadata;
        }
        return parsedContentSection.copy(markdownContentType, str, node, tableMetadata);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final MarkdownContentType getContentType() {
        return this.contentType;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Node getAstNode() {
        return this.astNode;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final TableMetadata getTableMetadata() {
        return this.tableMetadata;
    }

    @NotNull
    public final ParsedContentSection copy(@Nullable MarkdownContentType contentType, @Nullable String content, @Nullable Node astNode, @Nullable TableMetadata tableMetadata) {
        return new ParsedContentSection(contentType, content, astNode, tableMetadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParsedContentSection)) {
            return false;
        }
        ParsedContentSection parsedContentSection = (ParsedContentSection) other;
        return this.contentType == parsedContentSection.contentType && Intrinsics.areEqual(this.content, parsedContentSection.content) && Intrinsics.areEqual(this.astNode, parsedContentSection.astNode) && Intrinsics.areEqual(this.tableMetadata, parsedContentSection.tableMetadata);
    }

    @Nullable
    public final Node getAstNode() {
        return this.astNode;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final MarkdownContentType getContentType() {
        return this.contentType;
    }

    @Nullable
    public final TableMetadata getTableMetadata() {
        return this.tableMetadata;
    }

    public int hashCode() {
        MarkdownContentType markdownContentType = this.contentType;
        int hashCode = (markdownContentType == null ? 0 : markdownContentType.hashCode()) * 31;
        String str = this.content;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Node node = this.astNode;
        int hashCode3 = (hashCode2 + (node == null ? 0 : node.hashCode())) * 31;
        TableMetadata tableMetadata = this.tableMetadata;
        return hashCode3 + (tableMetadata != null ? tableMetadata.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ParsedContentSection(contentType=" + this.contentType + ", content=" + this.content + ", astNode=" + this.astNode + ", tableMetadata=" + this.tableMetadata + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public ParsedContentSection(@Nullable MarkdownContentType markdownContentType, @Nullable String str, @Nullable Node node, @Nullable TableMetadata tableMetadata) {
        this.contentType = markdownContentType;
        this.content = str;
        this.astNode = node;
        this.tableMetadata = tableMetadata;
    }

    public ParsedContentSection() {
        this(null, null, null, null, 15, null);
    }
}
