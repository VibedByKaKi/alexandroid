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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0013¢\u0006\u0002\u0010\u0002B9\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0000H\u0016R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0015"}, d2 = {"Landroidx/room/migration/bundle/ForeignKeyBundle;", "Landroidx/room/migration/bundle/SchemaEquality;", "()V", "table", "", "onDelete", "onUpdate", "columns", "", "referencedColumns", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getColumns", "()Ljava/util/List;", "getOnDelete", "()Ljava/lang/String;", "getOnUpdate", "getReferencedColumns", "getTable", "isSchemaEqual", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "room-migration"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes14.dex */
public class ForeignKeyBundle implements SchemaEquality<ForeignKeyBundle> {

    @SerializedName("columns")
    @NotNull
    private final List<String> columns;

    @SerializedName("onDelete")
    @NotNull
    private final String onDelete;

    @SerializedName("onUpdate")
    @NotNull
    private final String onUpdate;

    @SerializedName("referencedColumns")
    @NotNull
    private final List<String> referencedColumns;

    @SerializedName("table")
    @NotNull
    private final String table;

    public ForeignKeyBundle(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<String> list, @NotNull List<String> list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        this.table = str;
        this.onDelete = str2;
        this.onUpdate = str3;
        this.columns = list;
        this.referencedColumns = list2;
    }

    @NotNull
    public List<String> getColumns() {
        return this.columns;
    }

    @NotNull
    public String getOnDelete() {
        return this.onDelete;
    }

    @NotNull
    public String getOnUpdate() {
        return this.onUpdate;
    }

    @NotNull
    public List<String> getReferencedColumns() {
        return this.referencedColumns;
    }

    @NotNull
    public String getTable() {
        return this.table;
    }

    @Override // androidx.room.migration.bundle.SchemaEquality
    public boolean isSchemaEqual(@NotNull ForeignKeyBundle other) {
        other.getClass();
        return Intrinsics.areEqual(getTable(), other.getTable()) && Intrinsics.areEqual(getOnDelete(), other.getOnDelete()) && Intrinsics.areEqual(getOnUpdate(), other.getOnUpdate()) && Intrinsics.areEqual(getColumns(), other.getColumns()) && Intrinsics.areEqual(getReferencedColumns(), other.getReferencedColumns());
    }

    @Deprecated(message = "Marked deprecated to avoid usage in the codebase")
    private ForeignKeyBundle() {
        this("", "", "", CollectionsKt.emptyList(), CollectionsKt.emptyList());
    }
}
