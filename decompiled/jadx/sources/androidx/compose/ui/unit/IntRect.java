package androidx.compose.ui.unit;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u0000 Q2\u00020\u0001:\u0001QB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$H\u0007¢\u0006\u0004\b%\u0010&J\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0003H\u0007J\u0010\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0003H\u0007J\u0010\u0010+\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0003H\u0007J\u0010\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0000H\u0007J\u000e\u0010.\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020\u0000J\u0015\u0010E\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$¢\u0006\u0004\bF\u0010GJ\b\u0010H\u001a\u00020IH\u0016J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J1\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010O\u001a\u00020\u001f2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010P\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\fR\u001a\u0010\u0016\u001a\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u001a\u0010\u0019\u001a\u00020\u001a8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\n\u001a\u0004\b\u001e\u0010!R\u0011\u0010/\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b0\u0010\fR\u0011\u00101\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b2\u0010\fR\u0011\u00103\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b4\u0010\u001dR\u0011\u00105\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b6\u0010\u001dR\u0011\u00107\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b8\u0010\u001dR\u0011\u00109\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b:\u0010\u001dR\u0011\u0010;\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b<\u0010\u001dR\u0011\u0010=\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b>\u0010\u001dR\u0011\u0010?\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b@\u0010\u001dR\u0011\u0010A\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bB\u0010\u001dR\u0011\u0010C\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bD\u0010\u001d¨\u0006R"}, d2 = {"Landroidx/compose/ui/unit/IntRect;", "", "left", "", "top", "right", "bottom", "<init>", "(IIII)V", "getLeft$annotations", "()V", "getLeft", "()I", "getTop$annotations", "getTop", "getRight$annotations", "getRight", "getBottom$annotations", "getBottom", "width", "getWidth$annotations", "getWidth", "height", "getHeight$annotations", "getHeight", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g$annotations", "getSize-YbymL2g", "()J", "isEmpty", "", "isEmpty$annotations", "()Z", "translate", "offset", "Landroidx/compose/ui/unit/IntOffset;", "translate--gyyYBs", "(J)Landroidx/compose/ui/unit/IntRect;", ViewProps.TRANSLATE_X, ViewProps.TRANSLATE_Y, "inflate", "delta", "deflate", "intersect", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "overlaps", "minDimension", "getMinDimension", "maxDimension", "getMaxDimension", "topLeft", "getTopLeft-nOcc-ac", "topCenter", "getTopCenter-nOcc-ac", "topRight", "getTopRight-nOcc-ac", "centerLeft", "getCenterLeft-nOcc-ac", "center", "getCenter-nOcc-ac", "centerRight", "getCenterRight-nOcc-ac", "bottomLeft", "getBottomLeft-nOcc-ac", "bottomCenter", "getBottomCenter-nOcc-ac", "bottomRight", "getBottomRight-nOcc-ac", "contains", "contains--gyyYBs", "(J)Z", "toString", "", "component1", "component2", "component3", "component4", "copy", "equals", "hashCode", "Companion", "ui-unit"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIntRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntRect.kt\nandroidx/compose/ui/unit/IntRect\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,277:1\n30#2:278\n80#3:279\n80#3:281\n80#3:283\n80#3:285\n80#3:287\n80#3:289\n80#3:291\n80#3:293\n80#3:295\n80#3:297\n32#4:280\n32#4:282\n32#4:284\n32#4:286\n32#4:288\n32#4:290\n32#4:292\n32#4:294\n32#4:296\n*S KotlinDebug\n*F\n+ 1 IntRect.kt\nandroidx/compose/ui/unit/IntRect\n*L\n72#1:278\n72#1:279\n140#1:281\n144#1:283\n148#1:285\n152#1:287\n161#1:289\n165#1:291\n169#1:293\n174#1:295\n180#1:297\n140#1:280\n144#1:282\n148#1:284\n152#1:286\n161#1:288\n165#1:290\n169#1:292\n174#1:294\n180#1:296\n*E\n"})
/* loaded from: classes13.dex */
public final /* data */ class IntRect {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final IntRect Zero = new IntRect(0, 0, 0, 0);
    private final int bottom;
    private final int left;
    private final int right;
    private final int top;

    public IntRect(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
    }

    public static /* synthetic */ IntRect copy$default(IntRect intRect, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = intRect.left;
        }
        if ((i5 & 2) != 0) {
            i2 = intRect.top;
        }
        if ((i5 & 4) != 0) {
            i3 = intRect.right;
        }
        if ((i5 & 8) != 0) {
            i4 = intRect.bottom;
        }
        return intRect.copy(i, i2, i3, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getLeft() {
        return this.left;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTop() {
        return this.top;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRight() {
        return this.right;
    }

    /* renamed from: component4, reason: from getter */
    public final int getBottom() {
        return this.bottom;
    }

    /* renamed from: contains--gyyYBs, reason: not valid java name */
    public final boolean m7516containsgyyYBs(long offset) {
        return IntOffset.m7496getXimpl(offset) >= this.left && IntOffset.m7496getXimpl(offset) < this.right && IntOffset.m7497getYimpl(offset) >= this.top && IntOffset.m7497getYimpl(offset) < this.bottom;
    }

    @NotNull
    public final IntRect copy(int left, int top, int right, int bottom) {
        return new IntRect(left, top, right, bottom);
    }

    @Stable
    @NotNull
    public final IntRect deflate(int delta) {
        return inflate(-delta);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntRect)) {
            return false;
        }
        IntRect intRect = (IntRect) other;
        return this.left == intRect.left && this.top == intRect.top && this.right == intRect.right && this.bottom == intRect.bottom;
    }

    public final int getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomCenter-nOcc-ac, reason: not valid java name */
    public final long m7517getBottomCenternOccac() {
        return IntOffset.m7490constructorimpl((((getWidth() / 2) + this.left) << 32) | (this.bottom & 4294967295L));
    }

    /* renamed from: getBottomLeft-nOcc-ac, reason: not valid java name */
    public final long m7518getBottomLeftnOccac() {
        return IntOffset.m7490constructorimpl((this.left << 32) | (this.bottom & 4294967295L));
    }

    /* renamed from: getBottomRight-nOcc-ac, reason: not valid java name */
    public final long m7519getBottomRightnOccac() {
        return IntOffset.m7490constructorimpl((this.right << 32) | (this.bottom & 4294967295L));
    }

    /* renamed from: getCenter-nOcc-ac, reason: not valid java name */
    public final long m7520getCenternOccac() {
        return IntOffset.m7490constructorimpl((((getWidth() / 2) + this.left) << 32) | (((getHeight() / 2) + this.top) & 4294967295L));
    }

    /* renamed from: getCenterLeft-nOcc-ac, reason: not valid java name */
    public final long m7521getCenterLeftnOccac() {
        return IntOffset.m7490constructorimpl((this.left << 32) | (((getHeight() / 2) + this.top) & 4294967295L));
    }

    /* renamed from: getCenterRight-nOcc-ac, reason: not valid java name */
    public final long m7522getCenterRightnOccac() {
        return IntOffset.m7490constructorimpl((this.right << 32) | (((getHeight() / 2) + this.top) & 4294967295L));
    }

    public final int getHeight() {
        return this.bottom - this.top;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getMaxDimension() {
        return Math.max(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final int getMinDimension() {
        return Math.min(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final int getRight() {
        return this.right;
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m7523getSizeYbymL2g() {
        return IntSize.m7534constructorimpl((getWidth() << 32) | (getHeight() & 4294967295L));
    }

    public final int getTop() {
        return this.top;
    }

    /* renamed from: getTopCenter-nOcc-ac, reason: not valid java name */
    public final long m7524getTopCenternOccac() {
        return IntOffset.m7490constructorimpl((((getWidth() / 2) + this.left) << 32) | (this.top & 4294967295L));
    }

    /* renamed from: getTopLeft-nOcc-ac, reason: not valid java name */
    public final long m7525getTopLeftnOccac() {
        return IntOffset.m7490constructorimpl((this.left << 32) | (this.top & 4294967295L));
    }

    /* renamed from: getTopRight-nOcc-ac, reason: not valid java name */
    public final long m7526getTopRightnOccac() {
        return IntOffset.m7490constructorimpl((this.right << 32) | (this.top & 4294967295L));
    }

    public final int getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return Integer.hashCode(this.bottom) + ArcMode$$ExternalSyntheticOutline0.m(this.right, ArcMode$$ExternalSyntheticOutline0.m(this.top, Integer.hashCode(this.left) * 31, 31), 31);
    }

    @Stable
    @NotNull
    public final IntRect inflate(int delta) {
        return new IntRect(this.left - delta, this.top - delta, this.right + delta, this.bottom + delta);
    }

    @Stable
    @NotNull
    public final IntRect intersect(@NotNull IntRect other) {
        return new IntRect(Math.max(this.left, other.left), Math.max(this.top, other.top), Math.min(this.right, other.right), Math.min(this.bottom, other.bottom));
    }

    public final boolean isEmpty() {
        return this.left >= this.right || this.top >= this.bottom;
    }

    public final boolean overlaps(@NotNull IntRect other) {
        return this.right > other.left && other.right > this.left && this.bottom > other.top && other.bottom > this.top;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.left);
        sb.append(", ");
        sb.append(this.top);
        sb.append(", ");
        sb.append(this.right);
        sb.append(", ");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.bottom, ')');
    }

    @Stable
    @NotNull
    public final IntRect translate(int translateX, int translateY) {
        return new IntRect(this.left + translateX, this.top + translateY, this.right + translateX, this.bottom + translateY);
    }

    @Stable
    @NotNull
    /* renamed from: translate--gyyYBs, reason: not valid java name */
    public final IntRect m7527translategyyYBs(long offset) {
        return new IntRect(IntOffset.m7496getXimpl(offset) + this.left, IntOffset.m7497getYimpl(offset) + this.top, IntOffset.m7496getXimpl(offset) + this.right, IntOffset.m7497getYimpl(offset) + this.bottom);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/unit/IntRect$Companion;", "", "<init>", "()V", "Zero", "Landroidx/compose/ui/unit/IntRect;", "getZero$annotations", "getZero", "()Landroidx/compose/ui/unit/IntRect;", "ui-unit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final IntRect getZero() {
            return IntRect.Zero;
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
    /* renamed from: getSize-YbymL2g$annotations, reason: not valid java name */
    public static /* synthetic */ void m7515getSizeYbymL2g$annotations() {
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
}
