package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0002\u001a\u000f\u0010\b\u001a\u00020\t*\u00020\u0002¢\u0006\u0002\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\t*\u00020\u0002¢\u0006\u0002\u0010\n\u001a\u001b\u0010\f\u001a\u00020\t*\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u000e\u001a\f\u0010\u000f\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0010\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0002H\u0007\u001a\f\u0010\u0013\u001a\u00020\u0012*\u00020\u0002H\u0007\u001a\f\u0010\u0014\u001a\u00020\u0012*\u00020\u0002H\u0007\u001a\u001b\u0010\u0015\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a!\u0010\u0015\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001d\u001a\r\u0010\u001e\u001a\u00020\u001f*\u00020\u0001H\u0082\b¨\u0006 "}, d2 = {"changedToDown", "", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "changedToDownIgnoreConsumed", "changedToUp", "changedToUpIgnoreConsumed", "positionChanged", "positionChangedIgnoreConsumed", "positionChange", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)J", "positionChangeIgnoreConsumed", "positionChangeInternal", "ignoreConsumed", "(Landroidx/compose/ui/input/pointer/PointerInputChange;Z)J", "positionChangeConsumed", "anyChangeConsumed", "consumeDownChange", "", "consumePositionChange", "consumeAllChanges", "isOutOfBounds", "size", "Landroidx/compose/ui/unit/IntSize;", "isOutOfBounds-O0kMr_c", "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)Z", "extendedTouchPadding", "Landroidx/compose/ui/geometry/Size;", "isOutOfBounds-jwHxaWs", "(Landroidx/compose/ui/input/pointer/PointerInputChange;JJ)Z", "toInt", "", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPointerEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerEvent.kt\nandroidx/compose/ui/input/pointer/PointerEventKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 6 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,1056:1\n1055#1:1067\n65#2:1057\n69#2:1060\n65#2:1068\n69#2:1071\n60#3:1058\n70#3:1061\n85#3:1064\n90#3:1066\n60#3:1069\n70#3:1072\n60#3:1075\n85#3:1078\n70#3:1080\n90#3:1083\n22#4:1059\n22#4:1062\n22#4:1070\n22#4:1073\n22#4:1076\n22#4:1081\n54#5:1063\n59#5:1065\n54#5:1077\n59#5:1082\n57#6:1074\n61#6:1079\n*S KotlinDebug\n*F\n+ 1 PointerEvent.kt\nandroidx/compose/ui/input/pointer/PointerEventKt\n*L\n1037#1:1067\n1019#1:1057\n1020#1:1060\n1040#1:1068\n1041#1:1071\n1019#1:1058\n1020#1:1061\n1021#1:1064\n1022#1:1066\n1040#1:1069\n1041#1:1072\n1044#1:1075\n1045#1:1078\n1048#1:1080\n1049#1:1083\n1019#1:1059\n1020#1:1062\n1040#1:1070\n1041#1:1073\n1044#1:1076\n1048#1:1081\n1021#1:1063\n1022#1:1065\n1045#1:1077\n1049#1:1082\n1044#1:1074\n1048#1:1079\n*E\n"})
/* loaded from: classes13.dex */
public final class PointerEventKt {
    @Deprecated(message = "Partial consumption has been deprecated. Use isConsumed instead", replaceWith = @ReplaceWith(expression = "isConsumed", imports = {}))
    public static final boolean anyChangeConsumed(@NotNull PointerInputChange pointerInputChange) {
        return pointerInputChange.isConsumed();
    }

    public static final boolean changedToDown(@NotNull PointerInputChange pointerInputChange) {
        return (pointerInputChange.isConsumed() || pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToDownIgnoreConsumed(@NotNull PointerInputChange pointerInputChange) {
        return !pointerInputChange.getPreviousPressed() && pointerInputChange.getPressed();
    }

    public static final boolean changedToUp(@NotNull PointerInputChange pointerInputChange) {
        return (pointerInputChange.isConsumed() || !pointerInputChange.getPreviousPressed() || pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToUpIgnoreConsumed(@NotNull PointerInputChange pointerInputChange) {
        return pointerInputChange.getPreviousPressed() && !pointerInputChange.getPressed();
    }

    @Deprecated(message = "Use consume() instead", replaceWith = @ReplaceWith(expression = "consume()", imports = {}))
    public static final void consumeAllChanges(@NotNull PointerInputChange pointerInputChange) {
        pointerInputChange.consume();
    }

    @Deprecated(message = "Partial consumption has been deprecated. Use consume() instead.", replaceWith = @ReplaceWith(expression = "if (pressed != previousPressed) consume()", imports = {}))
    public static final void consumeDownChange(@NotNull PointerInputChange pointerInputChange) {
        if (pointerInputChange.getPressed() != pointerInputChange.getPreviousPressed()) {
            pointerInputChange.consume();
        }
    }

    @Deprecated(message = "Partial consumption has been deprecated. Use consume() instead.", replaceWith = @ReplaceWith(expression = "if (positionChange() != Offset.Zero) consume()", imports = {}))
    public static final void consumePositionChange(@NotNull PointerInputChange pointerInputChange) {
        if (Offset.m4397equalsimpl0(positionChange(pointerInputChange), Offset.INSTANCE.m4416getZeroF1C5BW0())) {
            return;
        }
        pointerInputChange.consume();
    }

    @Deprecated(message = "Use isOutOfBounds() that supports minimum touch target", replaceWith = @ReplaceWith(expression = "this.isOutOfBounds(size, extendedTouchPadding)", imports = {}))
    /* renamed from: isOutOfBounds-O0kMr_c, reason: not valid java name */
    public static final boolean m5887isOutOfBoundsO0kMr_c(@NotNull PointerInputChange pointerInputChange, long j) {
        long position = pointerInputChange.getPosition();
        float intBitsToFloat = Float.intBitsToFloat((int) (position >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (position & 4294967295L));
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return (intBitsToFloat > ((float) i)) | (intBitsToFloat < 0.0f) | (intBitsToFloat2 < 0.0f) | (intBitsToFloat2 > ((float) i2));
    }

    /* renamed from: isOutOfBounds-jwHxaWs, reason: not valid java name */
    public static final boolean m5888isOutOfBoundsjwHxaWs(@NotNull PointerInputChange pointerInputChange, long j, long j2) {
        boolean m6014equalsimpl0 = PointerType.m6014equalsimpl0(pointerInputChange.getType(), PointerType.INSTANCE.m6021getTouchT8wyACA());
        long position = pointerInputChange.getPosition();
        float intBitsToFloat = Float.intBitsToFloat((int) (position >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (position & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        float f = m6014equalsimpl0 ? 1.0f : 0.0f;
        float f2 = intBitsToFloat3 * f;
        float f3 = ((int) (j >> 32)) + f2;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (intBitsToFloat > f3) | (intBitsToFloat < (-f2)) | (intBitsToFloat2 < (-intBitsToFloat4)) | (intBitsToFloat2 > ((int) (j & 4294967295L)) + intBitsToFloat4);
    }

    public static final long positionChange(@NotNull PointerInputChange pointerInputChange) {
        return positionChangeInternal(pointerInputChange, false);
    }

    @Deprecated(message = "Partial consumption has been deprecated. Use isConsumed instead", replaceWith = @ReplaceWith(expression = "isConsumed", imports = {}))
    public static final boolean positionChangeConsumed(@NotNull PointerInputChange pointerInputChange) {
        return pointerInputChange.isConsumed();
    }

    public static final long positionChangeIgnoreConsumed(@NotNull PointerInputChange pointerInputChange) {
        return positionChangeInternal(pointerInputChange, true);
    }

    private static final long positionChangeInternal(PointerInputChange pointerInputChange, boolean z) {
        return (z || !pointerInputChange.isConsumed()) ? Offset.m4404minusMKHz9U(pointerInputChange.getPosition(), pointerInputChange.getPreviousPosition()) : Offset.INSTANCE.m4416getZeroF1C5BW0();
    }

    public static /* synthetic */ long positionChangeInternal$default(PointerInputChange pointerInputChange, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return positionChangeInternal(pointerInputChange, z);
    }

    public static final boolean positionChanged(@NotNull PointerInputChange pointerInputChange) {
        return !Offset.m4397equalsimpl0(positionChangeInternal(pointerInputChange, false), Offset.INSTANCE.m4416getZeroF1C5BW0());
    }

    public static final boolean positionChangedIgnoreConsumed(@NotNull PointerInputChange pointerInputChange) {
        return !Offset.m4397equalsimpl0(positionChangeInternal(pointerInputChange, true), Offset.INSTANCE.m4416getZeroF1C5BW0());
    }

    private static final int toInt(boolean z) {
        return z ? 1 : 0;
    }
}
