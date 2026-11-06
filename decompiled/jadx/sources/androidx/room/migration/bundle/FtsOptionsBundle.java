package androidx.room.migration.bundle;

import androidx.annotation.RestrictTo;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0013¢\u0006\u0002\u0010\u0002BW\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0000H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\r\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0010\u0010\u0003\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u001b"}, d2 = {"Landroidx/room/migration/bundle/FtsOptionsBundle;", "Landroidx/room/migration/bundle/SchemaEquality;", "()V", "tokenizer", "", "tokenizerArgs", "", "contentTable", "languageIdColumnName", "matchInfo", "notIndexedColumns", "prefixSizes", "", "preferredOrder", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getContentTable", "()Ljava/lang/String;", "getLanguageIdColumnName", "getMatchInfo", "getNotIndexedColumns", "()Ljava/util/List;", "getPreferredOrder", "getPrefixSizes", "getTokenizerArgs", "isSchemaEqual", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "room-migration"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes14.dex */
public class FtsOptionsBundle implements SchemaEquality<FtsOptionsBundle> {

    @SerializedName("contentTable")
    @NotNull
    private final String contentTable;

    @SerializedName("languageIdColumnName")
    @NotNull
    private final String languageIdColumnName;

    @SerializedName("matchInfo")
    @NotNull
    private final String matchInfo;

    @SerializedName("notIndexedColumns")
    @NotNull
    private final List<String> notIndexedColumns;

    @SerializedName("preferredOrder")
    @NotNull
    private final String preferredOrder;

    @SerializedName("prefixSizes")
    @NotNull
    private final List<Integer> prefixSizes;

    @SerializedName("tokenizer")
    @NotNull
    private final String tokenizer;

    @SerializedName("tokenizerArgs")
    @NotNull
    private final List<String> tokenizerArgs;

    public FtsOptionsBundle(@NotNull String str, @NotNull List<String> list, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<String> list2, @NotNull List<Integer> list3, @NotNull String str5) {
        str.getClass();
        list.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list2.getClass();
        list3.getClass();
        str5.getClass();
        this.tokenizer = str;
        this.tokenizerArgs = list;
        this.contentTable = str2;
        this.languageIdColumnName = str3;
        this.matchInfo = str4;
        this.notIndexedColumns = list2;
        this.prefixSizes = list3;
        this.preferredOrder = str5;
    }

    @NotNull
    public String getContentTable() {
        return this.contentTable;
    }

    @NotNull
    public String getLanguageIdColumnName() {
        return this.languageIdColumnName;
    }

    @NotNull
    public String getMatchInfo() {
        return this.matchInfo;
    }

    @NotNull
    public List<String> getNotIndexedColumns() {
        return this.notIndexedColumns;
    }

    @NotNull
    public String getPreferredOrder() {
        return this.preferredOrder;
    }

    @NotNull
    public List<Integer> getPrefixSizes() {
        return this.prefixSizes;
    }

    @NotNull
    public List<String> getTokenizerArgs() {
        return this.tokenizerArgs;
    }

    @Override // androidx.room.migration.bundle.SchemaEquality
    public boolean isSchemaEqual(@NotNull FtsOptionsBundle other) {
        other.getClass();
        return Intrinsics.areEqual(this.tokenizer, other.tokenizer) && Intrinsics.areEqual(getTokenizerArgs(), other.getTokenizerArgs()) && Intrinsics.areEqual(getContentTable(), other.getContentTable()) && Intrinsics.areEqual(getLanguageIdColumnName(), other.getLanguageIdColumnName()) && Intrinsics.areEqual(getMatchInfo(), other.getMatchInfo()) && Intrinsics.areEqual(getNotIndexedColumns(), other.getNotIndexedColumns()) && Intrinsics.areEqual(getPrefixSizes(), other.getPrefixSizes()) && Intrinsics.areEqual(getPreferredOrder(), other.getPreferredOrder());
    }

    @Deprecated(message = "Marked deprecated to avoid usage in the codebase")
    private FtsOptionsBundle() {
        this("", CollectionsKt.emptyList(), "", "", "", CollectionsKt.emptyList(), CollectionsKt.emptyList(), "");
    }
}
