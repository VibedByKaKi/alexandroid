package com.amazon.alexa.ra.core.ui.markdown.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.Stable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Stable
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00070\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00070\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00070\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/markdown/model/TableMetadata;", "", "longestWordInTable", "", "totalColumns", "", "tableRows", "", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "getLongestWordInTable", "()Ljava/lang/String;", "getTotalColumns", "()I", "getTableRows", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class TableMetadata {
    public static final int $stable = 0;

    @NotNull
    private final String longestWordInTable;

    @NotNull
    private final List<List<String>> tableRows;
    private final int totalColumns;

    /* JADX WARN: Multi-variable type inference failed */
    public TableMetadata(@NotNull String str, int i, @NotNull List<? extends List<String>> list) {
        str.getClass();
        list.getClass();
        this.longestWordInTable = str;
        this.totalColumns = i;
        this.tableRows = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TableMetadata copy$default(TableMetadata tableMetadata, String str, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tableMetadata.longestWordInTable;
        }
        if ((i2 & 2) != 0) {
            i = tableMetadata.totalColumns;
        }
        if ((i2 & 4) != 0) {
            list = tableMetadata.tableRows;
        }
        return tableMetadata.copy(str, i, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getLongestWordInTable() {
        return this.longestWordInTable;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTotalColumns() {
        return this.totalColumns;
    }

    @NotNull
    public final List<List<String>> component3() {
        return this.tableRows;
    }

    @NotNull
    public final TableMetadata copy(@NotNull String longestWordInTable, int totalColumns, @NotNull List<? extends List<String>> tableRows) {
        longestWordInTable.getClass();
        tableRows.getClass();
        return new TableMetadata(longestWordInTable, totalColumns, tableRows);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TableMetadata)) {
            return false;
        }
        TableMetadata tableMetadata = (TableMetadata) other;
        return Intrinsics.areEqual(this.longestWordInTable, tableMetadata.longestWordInTable) && this.totalColumns == tableMetadata.totalColumns && Intrinsics.areEqual(this.tableRows, tableMetadata.tableRows);
    }

    @NotNull
    public final String getLongestWordInTable() {
        return this.longestWordInTable;
    }

    @NotNull
    public final List<List<String>> getTableRows() {
        return this.tableRows;
    }

    public final int getTotalColumns() {
        return this.totalColumns;
    }

    public int hashCode() {
        return this.tableRows.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(this.totalColumns, this.longestWordInTable.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.longestWordInTable;
        return ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, this.tableRows, DoubleList$$ExternalSyntheticOutline0.m(this.totalColumns, "TableMetadata(longestWordInTable=", str, ", totalColumns=", ", tableRows="));
    }

    public /* synthetic */ TableMetadata(String str, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? CollectionsKt.emptyList() : list);
    }
}
