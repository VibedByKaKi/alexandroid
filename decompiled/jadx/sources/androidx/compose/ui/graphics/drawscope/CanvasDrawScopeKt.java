package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.InlineClassHelperKt;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"asDrawTransform", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "ui-graphics_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CanvasDrawScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawTransform asDrawTransform(final DrawContext drawContext) {
        return new DrawTransform() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt$asDrawTransform$1
            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: clipPath-mtrdD-E, reason: not valid java name */
            public void mo5155clipPathmtrdDE(Path path, int clipOp) {
                DrawContext.this.getCanvas().mo4494clipPathmtrdDE(path, clipOp);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: clipRect-N_I0leg, reason: not valid java name */
            public void mo5156clipRectN_I0leg(float left, float top, float right, float bottom, int clipOp) {
                DrawContext.this.getCanvas().mo4495clipRectN_I0leg(left, top, right, bottom, clipOp);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
            public long mo5157getCenterF1C5BW0() {
                return SizeKt.m4479getCenteruvyYCjk(mo5158getSizeNHjbRc());
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: getSize-NH-jbRc, reason: not valid java name */
            public long mo5158getSizeNHjbRc() {
                return DrawContext.this.mo5153getSizeNHjbRc();
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void inset(float left, float top, float right, float bottom) {
                Canvas canvas = DrawContext.this.getCanvas();
                DrawContext drawContext2 = DrawContext.this;
                long m4460constructorimpl = Size.m4460constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (mo5158getSizeNHjbRc() >> 32)) - (right + left)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (mo5158getSizeNHjbRc() & 4294967295L)) - (bottom + top)) & 4294967295L));
                if (!(Float.intBitsToFloat((int) (m4460constructorimpl >> 32)) >= 0.0f && Float.intBitsToFloat((int) (m4460constructorimpl & 4294967295L)) >= 0.0f)) {
                    InlineClassHelperKt.throwIllegalArgumentException("Width and height must be greater than or equal to zero");
                }
                drawContext2.mo5154setSizeuvyYCjk(m4460constructorimpl);
                canvas.translate(left, top);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: rotate-Uv8p0NA, reason: not valid java name */
            public void mo5159rotateUv8p0NA(float degrees, long pivot) {
                Canvas canvas = DrawContext.this.getCanvas();
                int i = (int) (pivot >> 32);
                int i2 = (int) (pivot & 4294967295L);
                canvas.translate(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                canvas.rotate(degrees);
                canvas.translate(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: scale-0AR0LA0, reason: not valid java name */
            public void mo5160scale0AR0LA0(float scaleX, float scaleY, long pivot) {
                Canvas canvas = DrawContext.this.getCanvas();
                int i = (int) (pivot >> 32);
                int i2 = (int) (pivot & 4294967295L);
                canvas.translate(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                canvas.scale(scaleX, scaleY);
                canvas.translate(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: transform-58bKbWc, reason: not valid java name */
            public void mo5161transform58bKbWc(float[] matrix) {
                DrawContext.this.getCanvas().mo4496concat58bKbWc(matrix);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void translate(float left, float top) {
                DrawContext.this.getCanvas().translate(left, top);
            }
        };
    }
}
