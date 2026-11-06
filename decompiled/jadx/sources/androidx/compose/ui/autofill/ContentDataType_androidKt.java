package androidx.compose.ui.autofill;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\"\u0015\u0010\u0002\u001a\u00020\u0003*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"ContentDataType", "Landroidx/compose/ui/autofill/ContentDataType;", "dataType", "", "getDataType", "(Landroidx/compose/ui/autofill/ContentDataType;)I", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ContentDataType_androidKt {
    @NotNull
    public static final ContentDataType ContentDataType(int i) {
        return AndroidContentDataType.m4146boximpl(AndroidContentDataType.m4147constructorimpl(i));
    }

    public static final int getDataType(@NotNull ContentDataType contentDataType) {
        contentDataType.getClass();
        return ((AndroidContentDataType) contentDataType).m4152unboximpl();
    }
}
