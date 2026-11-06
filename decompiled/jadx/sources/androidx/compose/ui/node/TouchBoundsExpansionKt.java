package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007\u001a5\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0002\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"TouchBoundsExpansion", "Landroidx/compose/ui/node/TouchBoundsExpansion;", "start", "", "top", "end", "bottom", "(IIII)J", "DpTouchBoundsExpansion", "Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "Landroidx/compose/ui/unit/Dp;", "DpTouchBoundsExpansion-a9UjIt4", "(FFFF)Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTouchBoundsExpansion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchBoundsExpansion.kt\nandroidx/compose/ui/node/TouchBoundsExpansionKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,249:1\n103#2,4:250\n103#2,4:254\n103#2,4:258\n103#2,4:262\n113#3:266\n113#3:267\n113#3:268\n113#3:269\n*S KotlinDebug\n*F\n+ 1 TouchBoundsExpansion.kt\nandroidx/compose/ui/node/TouchBoundsExpansionKt\n*L\n216#1:250,4\n219#1:254,4\n222#1:258,4\n225#1:262,4\n242#1:266\n243#1:267\n244#1:268\n245#1:269\n*E\n"})
/* loaded from: classes13.dex */
public final class TouchBoundsExpansionKt {
    @NotNull
    /* renamed from: DpTouchBoundsExpansion-a9UjIt4, reason: not valid java name */
    public static final DpTouchBoundsExpansion m6460DpTouchBoundsExpansiona9UjIt4(float f, float f2, float f3, float f4) {
        return new DpTouchBoundsExpansion(f, f2, f3, f4, true, null);
    }

    /* renamed from: DpTouchBoundsExpansion-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ DpTouchBoundsExpansion m6461DpTouchBoundsExpansiona9UjIt4$default(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m7368constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m7368constructorimpl(0);
        }
        if ((i & 4) != 0) {
            f3 = Dp.m7368constructorimpl(0);
        }
        if ((i & 8) != 0) {
            f4 = Dp.m7368constructorimpl(0);
        }
        return m6460DpTouchBoundsExpansiona9UjIt4(f, f2, f3, f4);
    }

    public static final long TouchBoundsExpansion(int i, int i2, int i3, int i4) {
        if (!(i >= 0 && i < 32768)) {
            InlineClassHelperKt.throwIllegalArgumentException("Start must be in the range of 0 .. 32767");
        }
        if (!(i2 >= 0 && i2 < 32768)) {
            InlineClassHelperKt.throwIllegalArgumentException("Top must be in the range of 0 .. 32767");
        }
        if (!(i3 >= 0 && i3 < 32768)) {
            InlineClassHelperKt.throwIllegalArgumentException("End must be in the range of 0 .. 32767");
        }
        if (!(i4 >= 0 && i4 < 32768)) {
            InlineClassHelperKt.throwIllegalArgumentException("Bottom must be in the range of 0 .. 32767");
        }
        return TouchBoundsExpansion.m6446constructorimpl(TouchBoundsExpansion.INSTANCE.pack$ui_release(i, i2, i3, i4, true));
    }

    public static /* synthetic */ long TouchBoundsExpansion$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        return TouchBoundsExpansion(i, i2, i3, i4);
    }
}
