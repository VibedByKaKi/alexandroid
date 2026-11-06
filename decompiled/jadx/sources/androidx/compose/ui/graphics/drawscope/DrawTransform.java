package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import com.amazon.alexa.accessorykit.ModelTransformer;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DrawScopeMarker
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH&JA\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0011\u001a\u00020\u0012H&¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fH&J!\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\u0007H&¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\u0007H&¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020'H&¢\u0006\u0004\b(\u0010)R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006*À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter-F1C5BW0", "inset", "", "left", "", "top", "right", "bottom", "clipRect", "clipOp", "Landroidx/compose/ui/graphics/ClipOp;", "clipRect-N_I0leg", "(FFFFI)V", "clipPath", "path", "Landroidx/compose/ui/graphics/Path;", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "translate", "rotate", "degrees", "pivot", "rotate-Uv8p0NA", "(FJ)V", ModelTransformer.KEY_BATTERY_SCALE, "scaleX", "scaleY", "scale-0AR0LA0", "(FFJ)V", ViewProps.TRANSFORM, "matrix", "Landroidx/compose/ui/graphics/Matrix;", "transform-58bKbWc", "([F)V", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDrawTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransform\n+ 2 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,164:1\n57#2:165\n61#2:168\n57#2:174\n61#2:177\n60#3:166\n70#3:169\n53#3,3:171\n60#3:175\n70#3:178\n22#4:167\n22#4:176\n22#4:179\n30#5:170\n*S KotlinDebug\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransform\n*L\n80#1:165\n80#1:168\n111#1:174\n112#1:177\n80#1:166\n80#1:169\n80#1:171,3\n111#1:175\n112#1:178\n80#1:167\n111#1:176\n112#1:179\n80#1:170\n*E\n"})
/* loaded from: classes13.dex */
public interface DrawTransform {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m5294getCenterF1C5BW0(@NotNull DrawTransform drawTransform) {
            return DrawTransform.super.mo5157getCenterF1C5BW0();
        }
    }

    /* renamed from: clipPath-mtrdD-E$default, reason: not valid java name */
    static /* synthetic */ void m5288clipPathmtrdDE$default(DrawTransform drawTransform, Path path, int i, int i2, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
            return;
        }
        if ((i2 & 2) != 0) {
            i = ClipOp.INSTANCE.m4633getIntersectrtfAjoo();
        }
        drawTransform.mo5155clipPathmtrdDE(path, i);
    }

    /* renamed from: clipRect-N_I0leg$default, reason: not valid java name */
    static /* synthetic */ void m5289clipRectN_I0leg$default(DrawTransform drawTransform, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
            return;
        }
        if ((i2 & 1) != 0) {
            f = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = Float.intBitsToFloat((int) (drawTransform.mo5158getSizeNHjbRc() >> 32));
        }
        if ((i2 & 8) != 0) {
            f4 = Float.intBitsToFloat((int) (drawTransform.mo5158getSizeNHjbRc() & 4294967295L));
        }
        if ((i2 & 16) != 0) {
            i = ClipOp.INSTANCE.m4633getIntersectrtfAjoo();
        }
        drawTransform.mo5156clipRectN_I0leg(f, f2, f3, f4, i);
    }

    /* renamed from: rotate-Uv8p0NA$default, reason: not valid java name */
    static /* synthetic */ void m5290rotateUv8p0NA$default(DrawTransform drawTransform, float f, long j, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: rotate-Uv8p0NA");
            return;
        }
        if ((i & 2) != 0) {
            j = drawTransform.mo5157getCenterF1C5BW0();
        }
        drawTransform.mo5159rotateUv8p0NA(f, j);
    }

    /* renamed from: scale-0AR0LA0$default, reason: not valid java name */
    static /* synthetic */ void m5291scale0AR0LA0$default(DrawTransform drawTransform, float f, float f2, long j, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: scale-0AR0LA0");
            return;
        }
        if ((i & 4) != 0) {
            j = drawTransform.mo5157getCenterF1C5BW0();
        }
        drawTransform.mo5160scale0AR0LA0(f, f2, j);
    }

    static /* synthetic */ void translate$default(DrawTransform drawTransform, float f, float f2, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: translate");
            return;
        }
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        drawTransform.translate(f, f2);
    }

    /* renamed from: clipPath-mtrdD-E */
    void mo5155clipPathmtrdDE(@NotNull Path path, int clipOp);

    /* renamed from: clipRect-N_I0leg */
    void mo5156clipRectN_I0leg(float left, float top, float right, float bottom, int clipOp);

    /* renamed from: getCenter-F1C5BW0 */
    default long mo5157getCenterF1C5BW0() {
        float f = 2;
        float intBitsToFloat = Float.intBitsToFloat((int) (mo5158getSizeNHjbRc() >> 32)) / f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (mo5158getSizeNHjbRc() & 4294967295L)) / f;
        return Offset.m4392constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: getSize-NH-jbRc */
    long mo5158getSizeNHjbRc();

    void inset(float left, float top, float right, float bottom);

    /* renamed from: rotate-Uv8p0NA */
    void mo5159rotateUv8p0NA(float degrees, long pivot);

    /* renamed from: scale-0AR0LA0 */
    void mo5160scale0AR0LA0(float scaleX, float scaleY, long pivot);

    /* renamed from: transform-58bKbWc */
    void mo5161transform58bKbWc(@NotNull float[] matrix);

    void translate(float left, float top);
}
