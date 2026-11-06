package androidx.compose.foundation.text.modifiers;

import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"DefaultWidthCharCount", "", "EmptyTextReplacement", "", "TwoLineTextReplacement", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MinLinesConstrainerKt {
    private static final int DefaultWidthCharCount = 10;

    @NotNull
    private static final String EmptyTextReplacement;

    @NotNull
    private static final String TwoLineTextReplacement;

    static {
        String repeat;
        repeat = StringsKt__StringsJVMKt.repeat("H", 10);
        EmptyTextReplacement = repeat;
        TwoLineTextReplacement = a$$ExternalSyntheticOutline0.m('\n', repeat, repeat);
    }
}
