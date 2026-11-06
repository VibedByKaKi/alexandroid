package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\rB\u0011\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000fJ;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0011J\u0015\u0010 \u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b$\u0010\"J\u0013\u0010%\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010\u000fJ\u001b\u0010'\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010\rJ\u0010\u0010)\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,R\u0012\u0010\u0006\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0005\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0012\u0010\u0004\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0012\u0010\u0002\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u000e\u001a\u00020\nX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0015\u0088\u0001\u000e\u0092\u0001\u00020\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, d2 = {"Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "", "mainAxisMin", "", "mainAxisMax", "crossAxisMin", "crossAxisMax", "constructor-impl", "(IIII)J", "c", "Landroidx/compose/ui/unit/Constraints;", ModelSourceWrapper.ORIENTATION, "Landroidx/compose/foundation/layout/LayoutOrientation;", "(JLandroidx/compose/foundation/layout/LayoutOrientation;)J", "value", "(J)J", "getCrossAxisMax-impl", "(J)I", "getCrossAxisMin-impl", "getMainAxisMax-impl", "getMainAxisMin-impl", "J", "copy", "copy-yUG9Ft0", "(JIIII)J", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "maxHeight", "maxHeight-impl", "(JLandroidx/compose/foundation/layout/LayoutOrientation;)I", "maxWidth", "maxWidth-impl", "stretchCrossAxis", "stretchCrossAxis-q4ezo7Y", "toBoxConstraints", "toBoxConstraints-OenEA2s", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n1#1,723:1\n229#1:724\n230#1:725\n232#1:726\n231#1:727\n232#1:728\n229#1,4:729\n231#1,2:733\n229#1,2:735\n230#1:737\n232#1:738\n232#1:739\n230#1:740\n229#1:741\n230#1:742\n231#1:743\n232#1:744\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n257#1:724\n258#1:725\n259#1:726\n259#1:727\n260#1:728\n266#1:729,4\n268#1:733,2\n268#1:735,2\n274#1:737\n276#1:738\n282#1:739\n284#1:740\n288#1:741\n289#1:742\n290#1:743\n291#1:744\n*E\n"})
/* loaded from: classes.dex */
public final class OrientationIndependentConstraints {
    private final long value;

    private /* synthetic */ OrientationIndependentConstraints(long j) {
        this.value = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OrientationIndependentConstraints m831boximpl(long j) {
        return new OrientationIndependentConstraints(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m834constructorimpl(long j, @NotNull LayoutOrientation layoutOrientation) {
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        return m832constructorimpl(layoutOrientation == layoutOrientation2 ? Constraints.m7323getMinWidthimpl(j) : Constraints.m7322getMinHeightimpl(j), layoutOrientation == layoutOrientation2 ? Constraints.m7321getMaxWidthimpl(j) : Constraints.m7320getMaxHeightimpl(j), layoutOrientation == layoutOrientation2 ? Constraints.m7322getMinHeightimpl(j) : Constraints.m7323getMinWidthimpl(j), layoutOrientation == layoutOrientation2 ? Constraints.m7320getMaxHeightimpl(j) : Constraints.m7321getMaxWidthimpl(j));
    }

    /* renamed from: copy-yUG9Ft0, reason: not valid java name */
    public static final long m835copyyUG9Ft0(long j, int i, int i2, int i3, int i4) {
        return m832constructorimpl(i, i2, i3, i4);
    }

    /* renamed from: copy-yUG9Ft0$default, reason: not valid java name */
    public static /* synthetic */ long m836copyyUG9Ft0$default(long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = Constraints.m7323getMinWidthimpl(j);
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = Constraints.m7321getMaxWidthimpl(j);
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = Constraints.m7322getMinHeightimpl(j);
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = Constraints.m7320getMaxHeightimpl(j);
        }
        return m835copyyUG9Ft0(j, i6, i7, i8, i4);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m837equalsimpl(long j, Object obj) {
        return (obj instanceof OrientationIndependentConstraints) && Constraints.m7314equalsimpl0(j, ((OrientationIndependentConstraints) obj).getValue());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m838equalsimpl0(long j, long j2) {
        return Constraints.m7314equalsimpl0(j, j2);
    }

    /* renamed from: getCrossAxisMax-impl, reason: not valid java name */
    public static final int m839getCrossAxisMaximpl(long j) {
        return Constraints.m7320getMaxHeightimpl(j);
    }

    /* renamed from: getCrossAxisMin-impl, reason: not valid java name */
    public static final int m840getCrossAxisMinimpl(long j) {
        return Constraints.m7322getMinHeightimpl(j);
    }

    /* renamed from: getMainAxisMax-impl, reason: not valid java name */
    public static final int m841getMainAxisMaximpl(long j) {
        return Constraints.m7321getMaxWidthimpl(j);
    }

    /* renamed from: getMainAxisMin-impl, reason: not valid java name */
    public static final int m842getMainAxisMinimpl(long j) {
        return Constraints.m7323getMinWidthimpl(j);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m843hashCodeimpl(long j) {
        return Constraints.m7324hashCodeimpl(j);
    }

    /* renamed from: maxHeight-impl, reason: not valid java name */
    public static final int m844maxHeightimpl(long j, @NotNull LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? Constraints.m7320getMaxHeightimpl(j) : Constraints.m7321getMaxWidthimpl(j);
    }

    /* renamed from: maxWidth-impl, reason: not valid java name */
    public static final int m845maxWidthimpl(long j, @NotNull LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? Constraints.m7321getMaxWidthimpl(j) : Constraints.m7320getMaxHeightimpl(j);
    }

    /* renamed from: stretchCrossAxis-q4ezo7Y, reason: not valid java name */
    public static final long m846stretchCrossAxisq4ezo7Y(long j) {
        return m832constructorimpl(Constraints.m7323getMinWidthimpl(j), Constraints.m7321getMaxWidthimpl(j), Constraints.m7320getMaxHeightimpl(j) != Integer.MAX_VALUE ? Constraints.m7320getMaxHeightimpl(j) : Constraints.m7322getMinHeightimpl(j), Constraints.m7320getMaxHeightimpl(j));
    }

    /* renamed from: toBoxConstraints-OenEA2s, reason: not valid java name */
    public static final long m847toBoxConstraintsOenEA2s(long j, @NotNull LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? ConstraintsKt.Constraints(Constraints.m7323getMinWidthimpl(j), Constraints.m7321getMaxWidthimpl(j), Constraints.m7322getMinHeightimpl(j), Constraints.m7320getMaxHeightimpl(j)) : ConstraintsKt.Constraints(Constraints.m7322getMinHeightimpl(j), Constraints.m7320getMaxHeightimpl(j), Constraints.m7323getMinWidthimpl(j), Constraints.m7321getMaxWidthimpl(j));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m848toStringimpl(long j) {
        return "OrientationIndependentConstraints(value=" + ((Object) Constraints.m7326toStringimpl(j)) + ')';
    }

    public boolean equals(Object obj) {
        return m837equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m843hashCodeimpl(this.value);
    }

    public String toString() {
        return m848toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m832constructorimpl(int i, int i2, int i3, int i4) {
        return m833constructorimpl(ConstraintsKt.Constraints(i, i2, i3, i4));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m833constructorimpl(long j) {
        return j;
    }
}
