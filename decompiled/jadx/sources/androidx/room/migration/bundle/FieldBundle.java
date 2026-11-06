package androidx.room.migration.bundle;

import androidx.annotation.RestrictTo;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u0007\b\u0013¢\u0006\u0002\u0010\tB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0000H\u0016R\u0016\u0010\u0005\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\n\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/room/migration/bundle/FieldBundle;", "Landroidx/room/migration/bundle/SchemaEquality;", "fieldPath", "", "columnName", "affinity", "nonNull", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "()V", "isNonNull", "defaultValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getAffinity", "()Ljava/lang/String;", "getColumnName", "getDefaultValue", "getFieldPath", "()Z", "isSchemaEqual", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "room-migration"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@SourceDebugExtension({"SMAP\nFieldBundle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FieldBundle.kt\nandroidx/room/migration/bundle/FieldBundle\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"})
/* loaded from: classes14.dex */
public class FieldBundle implements SchemaEquality<FieldBundle> {

    @SerializedName("affinity")
    @NotNull
    private final String affinity;

    @SerializedName("columnName")
    @NotNull
    private final String columnName;

    @SerializedName("defaultValue")
    @Nullable
    private final String defaultValue;

    @SerializedName("fieldPath")
    @NotNull
    private final String fieldPath;

    @SerializedName("notNull")
    private final boolean isNonNull;

    public FieldBundle(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @Nullable String str4) {
        ParcelCompat$$ExternalSyntheticOutline0.m(str, str2, str3);
        this.fieldPath = str;
        this.columnName = str2;
        this.affinity = str3;
        this.isNonNull = z;
        this.defaultValue = str4;
    }

    @NotNull
    public String getAffinity() {
        return this.affinity;
    }

    @NotNull
    public String getColumnName() {
        return this.columnName;
    }

    @Nullable
    public String getDefaultValue() {
        return this.defaultValue;
    }

    @NotNull
    public String getFieldPath() {
        return this.fieldPath;
    }

    /* renamed from: isNonNull, reason: from getter */
    public boolean getIsNonNull() {
        return this.isNonNull;
    }

    @Override // androidx.room.migration.bundle.SchemaEquality
    public boolean isSchemaEqual(@NotNull FieldBundle other) {
        other.getClass();
        if (getIsNonNull() != other.getIsNonNull() || !Intrinsics.areEqual(getColumnName(), other.getColumnName())) {
            return false;
        }
        String defaultValue = getDefaultValue();
        boolean z = true;
        if (defaultValue != null) {
            z = true ^ Intrinsics.areEqual(defaultValue, other.getDefaultValue());
        } else if (other.getDefaultValue() == null) {
            z = false;
        }
        if (z) {
            return false;
        }
        return Intrinsics.areEqual(getAffinity(), other.getAffinity());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "Use [FieldBundle(String, String, String, boolean, String)")
    public FieldBundle(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        this(str, str2, str3, z, null);
        ParcelCompat$$ExternalSyntheticOutline0.m(str, str2, str3);
    }

    @Deprecated(message = "Marked deprecated to avoid usage in the codebase")
    private FieldBundle() {
        this("", "", "", false, null);
    }
}
