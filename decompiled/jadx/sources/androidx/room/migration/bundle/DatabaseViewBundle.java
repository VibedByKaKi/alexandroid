package androidx.room.migration.bundle;

import androidx.annotation.RestrictTo;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0013¢\u0006\u0002\u0010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0000H\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u000e"}, d2 = {"Landroidx/room/migration/bundle/DatabaseViewBundle;", "Landroidx/room/migration/bundle/SchemaEquality;", "()V", "viewName", "", "createSql", "(Ljava/lang/String;Ljava/lang/String;)V", "getCreateSql", "()Ljava/lang/String;", "getViewName", "createView", "isSchemaEqual", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "room-migration"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes14.dex */
public class DatabaseViewBundle implements SchemaEquality<DatabaseViewBundle> {

    @SerializedName("createSql")
    @NotNull
    private final String createSql;

    @SerializedName("viewName")
    @NotNull
    private final String viewName;

    public DatabaseViewBundle(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.viewName = str;
        this.createSql = str2;
    }

    @NotNull
    public String createView() {
        return BundleUtil.replaceViewName(getCreateSql(), getViewName());
    }

    @NotNull
    public String getCreateSql() {
        return this.createSql;
    }

    @NotNull
    public String getViewName() {
        return this.viewName;
    }

    @Override // androidx.room.migration.bundle.SchemaEquality
    public boolean isSchemaEqual(@NotNull DatabaseViewBundle other) {
        other.getClass();
        return Intrinsics.areEqual(getViewName(), other.getViewName()) && Intrinsics.areEqual(getCreateSql(), other.getCreateSql());
    }

    @Deprecated(message = "Marked deprecated to avoid usage in the codebase")
    private DatabaseViewBundle() {
        this("", "");
    }
}
