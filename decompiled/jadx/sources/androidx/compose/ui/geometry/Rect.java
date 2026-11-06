package androidx.compose.ui.geometry;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Immutable
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000 Z2\u00020\u0001:\u0001ZB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(H\u0007¢\u0006\u0004\b)\u0010*J\u0018\u0010&\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0003H\u0007J\u0010\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0003H\u0007J\u0010\u0010/\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0003H\u0007J\u0010\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u0000H\u0007J(\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u0003H\u0007J\u000e\u00106\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u0000J\u0018\u0010M\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020(H\u0086\u0002¢\u0006\u0004\bN\u0010OJ\b\u0010P\u001a\u00020QH\u0016J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J1\u0010V\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010W\u001a\u00020\u001f2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010X\u001a\u00020YHÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001b\u0010\u0013\u001a\u00020\u00038Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\fR\u001b\u0010\u0016\u001a\u00020\u00038Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u001a\u0010\u0019\u001a\u00020\u001a8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\n\u001a\u0004\b\u001e\u0010!R\u001a\u0010\"\u001a\u00020\u001f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010\n\u001a\u0004\b\"\u0010!R\u001a\u0010$\u001a\u00020\u001f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\n\u001a\u0004\b$\u0010!R\u0011\u00107\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b8\u0010\fR\u0011\u00109\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b:\u0010\fR\u0011\u0010;\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b<\u0010\u001dR\u0011\u0010=\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b>\u0010\u001dR\u0011\u0010?\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b@\u0010\u001dR\u0011\u0010A\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\bB\u0010\u001dR\u0011\u0010C\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\bD\u0010\u001dR\u0011\u0010E\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\bF\u0010\u001dR\u0011\u0010G\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\bH\u0010\u001dR\u0011\u0010I\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\bJ\u0010\u001dR\u0011\u0010K\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\bL\u0010\u001d¨\u0006["}, d2 = {"Landroidx/compose/ui/geometry/Rect;", "", "left", "", "top", "right", "bottom", "<init>", "(FFFF)V", "getLeft$annotations", "()V", "getLeft", "()F", "getTop$annotations", "getTop", "getRight$annotations", "getRight", "getBottom$annotations", "getBottom", "width", "getWidth$annotations", "getWidth", "height", "getHeight$annotations", "getHeight", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc$annotations", "getSize-NH-jbRc", "()J", "isInfinite", "", "isInfinite$annotations", "()Z", "isFinite", "isFinite$annotations", "isEmpty", "isEmpty$annotations", "translate", "offset", "Landroidx/compose/ui/geometry/Offset;", "translate-k-4lQ0M", "(J)Landroidx/compose/ui/geometry/Rect;", ViewProps.TRANSLATE_X, ViewProps.TRANSLATE_Y, "inflate", "delta", "deflate", "intersect", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "otherLeft", "otherTop", "otherRight", "otherBottom", "overlaps", "minDimension", "getMinDimension", "maxDimension", "getMaxDimension", "topLeft", "getTopLeft-F1C5BW0", "topCenter", "getTopCenter-F1C5BW0", "topRight", "getTopRight-F1C5BW0", "centerLeft", "getCenterLeft-F1C5BW0", "center", "getCenter-F1C5BW0", "centerRight", "getCenterRight-F1C5BW0", "bottomLeft", "getBottomLeft-F1C5BW0", "bottomCenter", "getBottomCenter-F1C5BW0", "bottomRight", "getBottomRight-F1C5BW0", "contains", "contains-k-4lQ0M", "(J)Z", "toString", "", "component1", "component2", "component3", "component4", "copy", "equals", "hashCode", "", "Companion", "ui-geometry"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,288:1\n57#1,6:289\n57#1,6:304\n57#1,6:310\n57#1:320\n62#1:329\n57#1,6:334\n62#1:344\n57#1:353\n33#2:295\n53#3,3:296\n60#3:300\n70#3:303\n53#3,3:317\n53#3,3:322\n53#3,3:326\n53#3,3:331\n53#3,3:341\n53#3,3:346\n53#3,3:350\n53#3,3:355\n53#3,3:359\n60#3:363\n70#3:366\n65#4:299\n69#4:302\n65#4:362\n69#4:365\n22#5:301\n22#5:364\n22#5:367\n30#6:316\n30#6:321\n30#6:325\n30#6:330\n30#6:340\n30#6:345\n30#6:349\n30#6:354\n30#6:358\n*S KotlinDebug\n*F\n+ 1 Rect.kt\nandroidx/compose/ui/geometry/Rect\n*L\n67#1:289,6\n162#1:304,6\n166#1:310,6\n174#1:320\n182#1:329\n191#1:334,6\n195#1:344\n204#1:353\n67#1:295\n67#1:296,3\n101#1:300\n101#1:303\n170#1:317,3\n174#1:322,3\n178#1:326,3\n182#1:331,3\n191#1:341,3\n195#1:346,3\n199#1:350,3\n204#1:355,3\n210#1:359,3\n220#1:363\n221#1:366\n101#1:299\n101#1:302\n220#1:362\n221#1:365\n101#1:301\n220#1:364\n221#1:367\n170#1:316\n174#1:321\n178#1:325\n182#1:330\n191#1:340\n195#1:345\n199#1:349\n204#1:354\n210#1:358\n*E\n"})
/* loaded from: classes13.dex */
public final /* data */ class Rect {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Rect Zero = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    public Rect(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
    }

    public static /* synthetic */ Rect copy$default(Rect rect, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = rect.left;
        }
        if ((i & 2) != 0) {
            f2 = rect.top;
        }
        if ((i & 4) != 0) {
            f3 = rect.right;
        }
        if ((i & 8) != 0) {
            f4 = rect.bottom;
        }
        return rect.copy(f, f2, f3, f4);
    }

    /* renamed from: component1, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    /* renamed from: component2, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* renamed from: component3, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    /* renamed from: component4, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m4426containsk4lQ0M(long offset) {
        float intBitsToFloat = Float.intBitsToFloat((int) (offset >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (offset & 4294967295L));
        return (intBitsToFloat >= this.left) & (intBitsToFloat < this.right) & (intBitsToFloat2 >= this.top) & (intBitsToFloat2 < this.bottom);
    }

    @NotNull
    public final Rect copy(float left, float top, float right, float bottom) {
        return new Rect(left, top, right, bottom);
    }

    @Stable
    @NotNull
    public final Rect deflate(float delta) {
        return inflate(-delta);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Rect)) {
            return false;
        }
        Rect rect = (Rect) other;
        return Float.compare(this.left, rect.left) == 0 && Float.compare(this.top, rect.top) == 0 && Float.compare(this.right, rect.right) == 0 && Float.compare(this.bottom, rect.bottom) == 0;
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomCenter-F1C5BW0, reason: not valid java name */
    public final long m4427getBottomCenterF1C5BW0() {
        float right = ((getRight() - getLeft()) / 2.0f) + this.left;
        float f = this.bottom;
        return Offset.m4392constructorimpl((Float.floatToRawIntBits(right) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
    }

    /* renamed from: getBottomLeft-F1C5BW0, reason: not valid java name */
    public final long m4428getBottomLeftF1C5BW0() {
        float f = this.left;
        float f2 = this.bottom;
        return Offset.m4392constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }

    /* renamed from: getBottomRight-F1C5BW0, reason: not valid java name */
    public final long m4429getBottomRightF1C5BW0() {
        float f = this.right;
        float f2 = this.bottom;
        return Offset.m4392constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }

    /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
    public final long m4430getCenterF1C5BW0() {
        float right = ((getRight() - getLeft()) / 2.0f) + this.left;
        float bottom = ((getBottom() - getTop()) / 2.0f) + this.top;
        return Offset.m4392constructorimpl((Float.floatToRawIntBits(right) << 32) | (Float.floatToRawIntBits(bottom) & 4294967295L));
    }

    /* renamed from: getCenterLeft-F1C5BW0, reason: not valid java name */
    public final long m4431getCenterLeftF1C5BW0() {
        float f = this.left;
        float bottom = ((getBottom() - getTop()) / 2.0f) + this.top;
        return Offset.m4392constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(bottom) & 4294967295L));
    }

    /* renamed from: getCenterRight-F1C5BW0, reason: not valid java name */
    public final long m4432getCenterRightF1C5BW0() {
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
    public final long m4433getSizeNHjbRc() {
        float right = getRight() - getLeft();
        float bottom = getBottom() - getTop();
        return Size.m4460constructorimpl((Float.floatToRawIntBits(bottom) & 4294967295L) | (Float.floatToRawIntBits(right) << 32));
    }

    public final float getTop() {
        return this.top;
    }

    /* renamed from: getTopCenter-F1C5BW0, reason: not valid java name */
    public final long m4434getTopCenterF1C5BW0() {
        float right = ((getRight() - getLeft()) / 2.0f) + this.left;
        float f = this.top;
        return Offset.m4392constructorimpl((Float.floatToRawIntBits(right) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
    }

    /* renamed from: getTopLeft-F1C5BW0, reason: not valid java name */
    public final long m4435getTopLeftF1C5BW0() {
        float f = this.left;
        float f2 = this.top;
        return Offset.m4392constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }

    /* renamed from: getTopRight-F1C5BW0, reason: not valid java name */
    public final long m4436getTopRightF1C5BW0() {
        float f = this.right;
        float f2 = this.top;
        return Offset.m4392constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }

    public final float getWidth() {
        return getRight() - getLeft();
    }

    public int hashCode() {
        return Float.hashCode(this.bottom) + DoubleList$$ExternalSyntheticOutline0.m(this.right, DoubleList$$ExternalSyntheticOutline0.m(this.top, Float.hashCode(this.left) * 31, 31), 31);
    }

    @Stable
    @NotNull
    public final Rect inflate(float delta) {
        return new Rect(this.left - delta, this.top - delta, this.right + delta, this.bottom + delta);
    }

    @Stable
    @NotNull
    public final Rect intersect(@NotNull Rect other) {
        return new Rect(Math.max(this.left, other.left), Math.max(this.top, other.top), Math.min(this.right, other.right), Math.min(this.bottom, other.bottom));
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
        return (this.left < other.right) & (other.left < this.right) & (this.top < other.bottom) & (other.top < this.bottom);
    }

    @NotNull
    public String toString() {
        return "Rect.fromLTRB(" + GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1) + ')';
    }

    @Stable
    @NotNull
    public final Rect translate(float translateX, float translateY) {
        return new Rect(this.left + translateX, this.top + translateY, this.right + translateX, this.bottom + translateY);
    }

    @Stable
    @NotNull
    /* renamed from: translate-k-4lQ0M, reason: not valid java name */
    public final Rect m4437translatek4lQ0M(long offset) {
        int i = (int) (offset >> 32);
        int i2 = (int) (offset & 4294967295L);
        return new Rect(Float.intBitsToFloat(i) + this.left, Float.intBitsToFloat(i2) + this.top, Float.intBitsToFloat(i) + this.right, Float.intBitsToFloat(i2) + this.bottom);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/geometry/Rect$Companion;", "", "<init>", "()V", "Zero", "Landroidx/compose/ui/geometry/Rect;", "getZero$annotations", "getZero", "()Landroidx/compose/ui/geometry/Rect;", "ui-geometry"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Rect getZero() {
            return Rect.Zero;
        }

        private Companion() {
        }

        @Stable
        public static /* synthetic */ void getZero$annotations() {
        }
    }

    @Stable
    public static /* synthetic */ void getBottom$annotations() {
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations() {
    }

    @Stable
    public static /* synthetic */ void getLeft$annotations() {
    }

    @Stable
    public static /* synthetic */ void getRight$annotations() {
    }

    @Stable
    /* renamed from: getSize-NH-jbRc$annotations, reason: not valid java name */
    public static /* synthetic */ void m4425getSizeNHjbRc$annotations() {
    }

    @Stable
    public static /* synthetic */ void getTop$annotations() {
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations() {
    }

    @Stable
    public static /* synthetic */ void isEmpty$annotations() {
    }

    @Stable
    public static /* synthetic */ void isFinite$annotations() {
    }

    @Stable
    public static /* synthetic */ void isInfinite$annotations() {
    }

    @Stable
    @NotNull
    public final Rect intersect(float otherLeft, float otherTop, float otherRight, float otherBottom) {
        return new Rect(Math.max(this.left, otherLeft), Math.max(this.top, otherTop), Math.min(this.right, otherRight), Math.min(this.bottom, otherBottom));
    }
}
