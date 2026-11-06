package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.ULong;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"toColorLong", "", "Landroidx/compose/ui/graphics/Color;", "toColorLong-8_81llA", "(J)J", "fromColorLong", "Landroidx/compose/ui/graphics/Color$Companion;", "colorLong", "(Landroidx/compose/ui/graphics/Color$Companion;J)J", "ui-graphics_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AndroidColor_androidKt {
    public static final long fromColorLong(@NotNull Color.Companion companion, long j) {
        long j2 = 63 & j;
        if (j2 >= 16) {
            j = (j & (-64)) | (j2 + 1);
        }
        return Color.m4640constructorimpl(ULong.m25468constructorimpl(j));
    }

    /* renamed from: toColorLong-8_81llA, reason: not valid java name */
    public static final long m4508toColorLong8_81llA(long j) {
        long j2 = 63 & j;
        return Long.compareUnsigned(ULong.m25468constructorimpl(j2), 16L) < 0 ? j : ULong.m25468constructorimpl(ULong.m25468constructorimpl(j & ULong.m25468constructorimpl(-64L)) | ULong.m25468constructorimpl(ULong.m25468constructorimpl(j2) - 1));
    }
}
