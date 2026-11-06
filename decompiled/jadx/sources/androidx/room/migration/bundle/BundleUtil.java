package androidx.room.migration.bundle;

import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a\u0016\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001\u001a\u0016\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"TABLE_NAME_PLACEHOLDER", "", "VIEW_NAME_PLACEHOLDER", "replaceTableName", "contents", "tableName", "replaceViewName", "viewName", "room-migration"}, k = 2, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@JvmName(name = "BundleUtil")
/* loaded from: classes14.dex */
public final class BundleUtil {

    @NotNull
    public static final String TABLE_NAME_PLACEHOLDER = "${TABLE_NAME}";

    @NotNull
    public static final String VIEW_NAME_PLACEHOLDER = "${VIEW_NAME}";

    @NotNull
    public static final String replaceTableName(@NotNull String str, @NotNull String str2) {
        String replace$default;
        str.getClass();
        str2.getClass();
        replace$default = StringsKt__StringsJVMKt.replace$default(str, TABLE_NAME_PLACEHOLDER, str2, false, 4, (Object) null);
        return replace$default;
    }

    @NotNull
    public static final String replaceViewName(@NotNull String str, @NotNull String str2) {
        String replace$default;
        str.getClass();
        str2.getClass();
        replace$default = StringsKt__StringsJVMKt.replace$default(str, VIEW_NAME_PLACEHOLDER, str2, false, 4, (Object) null);
        return replace$default;
    }
}
