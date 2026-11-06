package androidx.compose.ui.geometry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#¢\u0006\u0004\b$\u0010%J\u0016\u0010 \u001a\u00020!2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003J\u000e\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020\u0003J\u000e\u0010*\u001a\u00020!2\u0006\u0010)\u001a\u00020\u0003J&\u0010+\u001a\u00020!2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003J\u000e\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020.J\u000e\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u0000J\u0018\u0010E\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#H\u0086\u0002¢\u0006\u0004\bF\u0010GJ&\u0010H\u001a\u00020!2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003J\b\u0010I\u001a\u00020JH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u0012\u0010\u0013\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\nR\u0012\u0010\u0015\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0016\u0010\nR\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u001f\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010/\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b0\u0010\nR\u0011\u00101\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b2\u0010\nR\u0011\u00103\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b4\u0010\u001aR\u0011\u00105\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b6\u0010\u001aR\u0011\u00107\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b8\u0010\u001aR\u0011\u00109\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b:\u0010\u001aR\u0011\u0010;\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b<\u0010\u001aR\u0011\u0010=\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b>\u0010\u001aR\u0011\u0010?\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b@\u0010\u001aR\u0011\u0010A\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bB\u0010\u001aR\u0011\u0010C\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bD\u0010\u001a¨\u0006K"}, d2 = {"Landroidx/compose/ui/geometry/MutableRect;", "", "left", "", "top", "right", "bottom", "<init>", "(FFFF)V", "getLeft", "()F", "setLeft", "(F)V", "getTop", "setTop", "getRight", "setRight", "getBottom", "setBottom", "width", "getWidth", "height", "getHeight", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "isInfinite", "", "()Z", "isFinite", "isEmpty", "translate", "", "offset", "Landroidx/compose/ui/geometry/Offset;", "translate-k-4lQ0M", "(J)V", ViewProps.TRANSLATE_X, ViewProps.TRANSLATE_Y, "inflate", "delta", "deflate", "intersect", "overlaps", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "Landroidx/compose/ui/geometry/Rect;", "minDimension", "getMinDimension", "maxDimension", "getMaxDimension", "topLeft", "getTopLeft-F1C5BW0", "topCenter", "getTopCenter-F1C5BW0", "topRight", "getTopRight-F1C5BW0", "centerLeft", "getCenterLeft-F1C5BW0", "center", "getCenter-F1C5BW0", "centerRight", "getCenterRight-F1C5BW0", "bottomLeft", "getBottomLeft-F1C5BW0", "bottomCenter", "getBottomCenter-F1C5BW0", "bottomRight", "getBottomRight-F1C5BW0", "contains", "contains-k-4lQ0M", "(J)Z", "set", "toString", "", "ui-geometry"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMutableRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableRect.kt\nandroidx/compose/ui/geometry/MutableRect\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,232:1\n37#1,5:233\n37#1,5:247\n37#1,5:252\n37#1:261\n41#1:270\n37#1,5:275\n41#1:284\n37#1:293\n33#2:238\n53#3,3:239\n60#3:243\n70#3:246\n53#3,3:258\n53#3,3:263\n53#3,3:267\n53#3,3:272\n53#3,3:281\n53#3,3:286\n53#3,3:290\n53#3,3:295\n53#3,3:299\n60#3:303\n70#3:306\n65#4:242\n69#4:245\n65#4:302\n69#4:305\n22#5:244\n22#5:304\n22#5:307\n30#6:257\n30#6:262\n30#6:266\n30#6:271\n30#6:280\n30#6:285\n30#6:289\n30#6:294\n30#6:298\n*S KotlinDebug\n*F\n+ 1 MutableRect.kt\nandroidx/compose/ui/geometry/MutableRect\n*L\n45#1:233,5\n121#1:247,5\n125#1:252,5\n133#1:261\n141#1:270\n150#1:275,5\n154#1:284\n163#1:293\n45#1:238\n45#1:239,3\n69#1:243\n69#1:246\n129#1:258,3\n133#1:263,3\n137#1:267,3\n141#1:272,3\n150#1:281,3\n154#1:286,3\n158#1:290,3\n163#1:295,3\n169#1:299,3\n179#1:303\n180#1:306\n69#1:242\n69#1:245\n179#1:302\n180#1:305\n69#1:244\n179#1:304\n180#1:307\n129#1:257\n133#1:262\n137#1:266\n141#1:271\n150#1:280\n154#1:285\n158#1:289\n163#1:294\n169#1:298\n*E\n"})
/* loaded from: classes13.dex */
public final class MutableRect {
    public static final int $stable = 8;
    private float bottom;
    private float left;
    private float right;
    private float top;

    public MutableRect(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
    }

    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m4374containsk4lQ0M(long offset) {
        float intBitsToFloat = Float.intBitsToFloat((int) (offset >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (offset & 4294967295L));
        return (intBitsToFloat >= this.left) & (intBitsToFloat < this.right) & (intBitsToFloat2 >= this.top) & (intBitsToFloat2 < this.bottom);
    }

    public final void deflate(float delta) {
        inflate(-delta);
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomCenter-F1C5BW0, reason: not valid java name */
    public final long m4375getBottomCenterF1C5BW0() {
        float right = ((getRight() - getLeft()) / 2.0f) + this.left;
        float f = this.bottom;
        return Offset.m4392constructorimpl((Float.floatToRawIntBits(right) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
    }

    /* renamed from: getBottomLeft-F1C5BW0, reason: not valid java name */
    public final long m4376getBottomLeftF1C5BW0() {
        float f = this.left;
        float f2 = this.bottom;
        return Offset.m4392constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }

    /* renamed from: getBottomRight-F1C5BW0, reason: not valid java name */
    public final long m4377getBottomRightF1C5BW0() {
        float f = this.right;
        float f2 = this.bottom;
        return Offset.m4392constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }

    /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
    public final long m4378getCenterF1C5BW0() {
        float right = ((getRight() - getLeft()) / 2.0f) + this.left;
        float bottom = ((getBottom() - getTop()) / 2.0f) + this.top;
        return Offset.m4392constructorimpl((Float.floatToRawIntBits(right) << 32) | (Float.floatToRawIntBits(bottom) & 4294967295L));
    }

    /* renamed from: getCenterLeft-F1C5BW0, reason: not valid java name */
    public final long m4379getCenterLeftF1C5BW0() {
        float f = this.left;
        float bottom = ((getBottom() - getTop()) / 2.0f) + this.top;
        return Offset.m4392constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(bottom) & 4294967295L));
    }

    /* renamed from: getCenterRight-F1C5BW0, reason: not valid java name */
    public final long m4380getCenterRightF1C5BW0() {
        float f = this.right;
        float bottom = ((getBottom() - getTop()) / 2.0f) + this.top;
        return Offset.m4392constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(bottom) & 4294967295L));
    }

    public final float getHeight() {
        return getBottom() - getTop();
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getMaxDimension() {
        return Math.max(Math.abs(getRight() - getLeft()), Math.abs(getBottom() - getTop()));
    }

    public final float getMinDimension() {
        return Math.min(Math.abs(getRight() - getLeft()), Math.abs(getBottom() - getTop()));
    }

    public final float getRight() {
        return this.right;
    }

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m4381getSizeNHjbRc() {
        float right = getRight() - getLeft();
        float bottom = getBottom() - getTop();
        return Size.m4460constructorimpl((Float.floatToRawIntBits(bottom) & 4294967295L) | (Float.floatToRawIntBits(right) << 32));
    }

    public final float getTop() {
        return this.top;
    }

    /* renamed from: getTopCenter-F1C5BW0, reason: not valid java name */
    public final long m4382getTopCenterF1C5BW0() {
        float right = ((getRight() - getLeft()) / 2.0f) + this.left;
        float f = this.top;
        return Offset.m4392constructorimpl((Float.floatToRawIntBits(right) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
    }

    /* renamed from: getTopLeft-F1C5BW0, reason: not valid java name */
    public final long m4383getTopLeftF1C5BW0() {
        float f = this.left;
        float f2 = this.top;
        return Offset.m4392constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }

    /* renamed from: getTopRight-F1C5BW0, reason: not valid java name */
    public final long m4384getTopRightF1C5BW0() {
        float f = this.right;
        float f2 = this.top;
        return Offset.m4392constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }

    public final float getWidth() {
        return getRight() - getLeft();
    }

    public final void inflate(float delta) {
        this.left -= delta;
        this.top -= delta;
        this.right += delta;
        this.bottom += delta;
    }

    public final void intersect(float left, float top, float right, float bottom) {
        this.left = Math.max(left, this.left);
        this.top = Math.max(top, this.top);
        this.right = Math.min(right, this.right);
        this.bottom = Math.min(bottom, this.bottom);
    }

    public final boolean isEmpty() {
        return (this.left >= this.right) | (this.top >= this.bottom);
    }

    public final boolean isFinite() {
        return ((Float.floatToRawIntBits(this.left) & Integer.MAX_VALUE) < 2139095040) & ((Float.floatToRawIntBits(this.top) & Integer.MAX_VALUE) < 2139095040) & ((Float.floatToRawIntBits(this.right) & Integer.MAX_VALUE) < 2139095040) & ((Float.floatToRawIntBits(this.bottom) & Integer.MAX_VALUE) < 2139095040);
    }

    public final boolean isInfinite() {
        return (this.left == Float.POSITIVE_INFINITY) | (this.top == Float.POSITIVE_INFINITY) | (this.right == Float.POSITIVE_INFINITY) | (this.bottom == Float.POSITIVE_INFINITY);
    }

    public final boolean overlaps(@NotNull Rect other) {
        return (this.left < other.getRight()) & (other.getLeft() < this.right) & (this.top < other.getBottom()) & (other.getTop() < this.bottom);
    }

    public final void set(float left, float top, float right, float bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }

    public final void setBottom(float f) {
        this.bottom = f;
    }

    public final void setLeft(float f) {
        this.left = f;
    }

    public final void setRight(float f) {
        this.right = f;
    }

    public final void setTop(float f) {
        this.top = f;
    }

    @NotNull
    public String toString() {
        return "MutableRect(" + GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1) + ')';
    }

    public final void translate(float translateX, float translateY) {
        this.left += translateX;
        this.top += translateY;
        this.right += translateX;
        this.bottom += translateY;
    }

    /* renamed from: translate-k-4lQ0M, reason: not valid java name */
    public final void m4385translatek4lQ0M(long offset) {
        translate(Float.intBitsToFloat((int) (offset >> 32)), Float.intBitsToFloat((int) (offset & 4294967295L)));
    }

    public final boolean overlaps(@NotNull MutableRect other) {
        return this.right > other.left && other.right > this.left && this.bottom > other.top && other.bottom > this.top;
    }
}
