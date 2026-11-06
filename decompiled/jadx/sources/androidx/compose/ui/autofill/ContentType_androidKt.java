package androidx.compose.ui.autofill;

import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\"\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"ContentType", "Landroidx/compose/ui/autofill/ContentType;", "contentHint", "", "contentHints", "", "getContentHints", "(Landroidx/compose/ui/autofill/ContentType;)[Ljava/lang/String;", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nContentType.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentType.android.kt\nandroidx/compose/ui/autofill/ContentType_androidKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,125:1\n37#2,2:126\n*S KotlinDebug\n*F\n+ 1 ContentType.android.kt\nandroidx/compose/ui/autofill/ContentType_androidKt\n*L\n124#1:126,2\n*E\n"})
/* loaded from: classes13.dex */
public final class ContentType_androidKt {
    @NotNull
    public static final ContentType ContentType(@NotNull String str) {
        return new AndroidContentType(SetsKt.setOf(str));
    }

    @NotNull
    public static final String[] getContentHints(@NotNull ContentType contentType) {
        contentType.getClass();
        return (String[]) ((AndroidContentType) contentType).getAndroidAutofillHints().toArray(new String[0]);
    }
}
