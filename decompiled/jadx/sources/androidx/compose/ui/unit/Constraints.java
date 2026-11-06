package androidx.compose.ui.unit;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.facebook.react.uimanager.ViewProps;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087@\u0018\u0000 /2\u00020\u0001:\u0001/B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0000H\u0086\b¢\u0006\u0004\b'\u0010\u0005J\u000f\u0010(\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0013\u0010,\u001a\u00020\u00152\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007R\u0015\u0010\b\u001a\u00020\t8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0012\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000bR\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00158FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0007\u001a\u0004\b\u001c\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00158FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u0007\u001a\u0004\b\u001f\u0010\u0017R\u001a\u0010 \u001a\u00020\u00158FX\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\u0007\u001a\u0004\b\"\u0010\u0017\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u00060"}, d2 = {"Landroidx/compose/ui/unit/Constraints;", "", "value", "", "constructor-impl", "(J)J", "getValue$annotations", "()V", "focusIndex", "", "getFocusIndex-impl", "(J)I", ViewProps.MIN_WIDTH, "getMinWidth-impl", "maxWidth", "getMaxWidth-impl", ViewProps.MIN_HEIGHT, "getMinHeight-impl", "maxHeight", "getMaxHeight-impl", "hasBoundedWidth", "", "getHasBoundedWidth-impl", "(J)Z", "hasBoundedHeight", "getHasBoundedHeight-impl", "hasFixedWidth", "getHasFixedWidth$annotations", "getHasFixedWidth-impl", "hasFixedHeight", "getHasFixedHeight$annotations", "getHasFixedHeight-impl", "isZero", "isZero$annotations", "isZero-impl", "copy", "copy-Zbe2FdA", "(JIIII)J", "copyMaxDimensions", "copyMaxDimensions-msEJaDk", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "Companion", "ui-unit"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints\n+ 2 Constraints.kt\nandroidx/compose/ui/unit/ConstraintsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,634:1\n67#1:635\n67#1:638\n67#1:641\n67#1:645\n67#1:649\n67#1:652\n67#1:656\n67#1:660\n67#1:664\n618#2:636\n630#2:637\n618#2:639\n630#2:640\n618#2:642\n633#2:643\n627#2:644\n618#2:646\n633#2:647\n627#2:648\n618#2:650\n630#2:651\n618#2:653\n633#2:654\n627#2:655\n618#2:657\n630#2:658\n618#2:661\n633#2:662\n627#2:663\n618#2:665\n630#2:666\n627#2:667\n633#2:668\n1#3:659\n38#4,4:669\n*S KotlinDebug\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints\n*L\n72#1:635\n82#1:638\n90#1:641\n102#1:645\n116#1:649\n127#1:652\n137#1:656\n148#1:660\n166#1:664\n72#1:636\n72#1:637\n82#1:639\n82#1:640\n90#1:642\n91#1:643\n92#1:644\n102#1:646\n103#1:647\n104#1:648\n116#1:650\n116#1:651\n127#1:653\n128#1:654\n129#1:655\n137#1:657\n137#1:658\n148#1:661\n149#1:662\n150#1:663\n166#1:665\n167#1:666\n168#1:667\n169#1:668\n185#1:669,4\n*E\n"})
/* loaded from: classes13.dex */
public final class Constraints {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int Infinity = Integer.MAX_VALUE;
    private final long value;

    private /* synthetic */ Constraints(long j) {
        this.value = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Constraints m7308boximpl(long j) {
        return new Constraints(j);
    }

    /* renamed from: copy-Zbe2FdA, reason: not valid java name */
    public static final long m7310copyZbe2FdA(long j, int i, int i2, int i3, int i4) {
        if (!(i2 >= i && i4 >= i3 && i >= 0 && i3 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return ConstraintsKt.createConstraints(i, i2, i3, i4);
    }

    /* renamed from: copy-Zbe2FdA$default, reason: not valid java name */
    public static /* synthetic */ long m7311copyZbe2FdA$default(long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = m7323getMinWidthimpl(j);
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = m7321getMaxWidthimpl(j);
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = m7322getMinHeightimpl(j);
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = m7320getMaxHeightimpl(j);
        }
        return m7310copyZbe2FdA(j, i6, i7, i8, i4);
    }

    /* renamed from: copyMaxDimensions-msEJaDk, reason: not valid java name */
    public static final long m7312copyMaxDimensionsmsEJaDk(long j) {
        return m7309constructorimpl(j & ConstraintsKt.MaxDimensionsAndFocusMask);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7313equalsimpl(long j, Object obj) {
        return (obj instanceof Constraints) && j == ((Constraints) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7314equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getFocusIndex-impl, reason: not valid java name */
    private static final int m7315getFocusIndeximpl(long j) {
        return (int) (j & 3);
    }

    /* renamed from: getHasBoundedHeight-impl, reason: not valid java name */
    public static final boolean m7316getHasBoundedHeightimpl(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    /* renamed from: getHasBoundedWidth-impl, reason: not valid java name */
    public static final boolean m7317getHasBoundedWidthimpl(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << BitVector$$ExternalSyntheticOutline0.m((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1)) != 0;
    }

    /* renamed from: getHasFixedHeight-impl, reason: not valid java name */
    public static final boolean m7318getHasFixedHeightimpl(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = ((int) (j >> (i2 + 15))) & i3;
        int i5 = ((int) (j >> (i2 + 46))) & i3;
        return i4 == (i5 == 0 ? Integer.MAX_VALUE : i5 - 1);
    }

    /* renamed from: getHasFixedWidth-impl, reason: not valid java name */
    public static final boolean m7319getHasFixedWidthimpl(long j) {
        int i = (int) (3 & j);
        int m = (1 << BitVector$$ExternalSyntheticOutline0.m((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1;
        int i2 = ((int) (j >> 2)) & m;
        int i3 = ((int) (j >> 33)) & m;
        return i2 == (i3 == 0 ? Integer.MAX_VALUE : i3 - 1);
    }

    /* renamed from: getMaxHeight-impl, reason: not valid java name */
    public static final int m7320getMaxHeightimpl(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    /* renamed from: getMaxWidth-impl, reason: not valid java name */
    public static final int m7321getMaxWidthimpl(long j) {
        int i = (int) (3 & j);
        int i2 = (int) (j >> 33);
        int m = i2 & ((1 << BitVector$$ExternalSyntheticOutline0.m((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1);
        if (m == 0) {
            return Integer.MAX_VALUE;
        }
        return m - 1;
    }

    /* renamed from: getMinHeight-impl, reason: not valid java name */
    public static final int m7322getMinHeightimpl(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    /* renamed from: getMinWidth-impl, reason: not valid java name */
    public static final int m7323getMinWidthimpl(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << BitVector$$ExternalSyntheticOutline0.m((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7324hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: isZero-impl, reason: not valid java name */
    public static final boolean m7325isZeroimpl(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((((int) (j >> 33)) & ((1 << (i2 + 13)) - 1)) - 1 == 0) | ((((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) - 1 == 0);
    }

    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7326toStringimpl(long j) {
        int m7321getMaxWidthimpl = m7321getMaxWidthimpl(j);
        String valueOf = m7321getMaxWidthimpl == Integer.MAX_VALUE ? "Infinity" : String.valueOf(m7321getMaxWidthimpl);
        int m7320getMaxHeightimpl = m7320getMaxHeightimpl(j);
        String valueOf2 = m7320getMaxHeightimpl != Integer.MAX_VALUE ? String.valueOf(m7320getMaxHeightimpl) : "Infinity";
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(m7323getMinWidthimpl(j));
        sb.append(", maxWidth = ");
        sb.append(valueOf);
        sb.append(", minHeight = ");
        sb.append(m7322getMinHeightimpl(j));
        sb.append(", maxHeight = ");
        return ArcMode$$ExternalSyntheticOutline0.m(')', valueOf2, sb);
    }

    public boolean equals(Object other) {
        return m7313equalsimpl(this.value, other);
    }

    public int hashCode() {
        return m7324hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m7326toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ9\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001e\u0010\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/unit/Constraints$Companion;", "", "<init>", "()V", "Infinity", "", "fixed", "Landroidx/compose/ui/unit/Constraints;", "width", "height", "fixed-JhjzzOo", "(II)J", "fixedWidth", "fixedWidth-OenEA2s", "(I)J", "fixedHeight", "fixedHeight-OenEA2s", "restrictConstraints", ViewProps.MIN_WIDTH, "maxWidth", ViewProps.MIN_HEIGHT, "maxHeight", "prioritizeWidth", "", "restrictConstraints-xF2OJ5Q", "(IIIIZ)J", "fitPrioritizingWidth", "fitPrioritizingWidth-Zbe2FdA", "(IIII)J", "fitPrioritizingHeight", "fitPrioritizingHeight-Zbe2FdA", "ui-unit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints$Companion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n+ 3 Constraints.kt\nandroidx/compose/ui/unit/ConstraintsKt\n*L\n1#1,634:1\n38#2,4:635\n38#2,4:639\n38#2,4:643\n465#3,6:647\n465#3,6:653\n*S KotlinDebug\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints$Companion\n*L\n224#1:635,4\n231#1:639,4\n243#1:643,4\n305#1:647,6\n341#1:653,6\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: restrictConstraints-xF2OJ5Q$default, reason: not valid java name */
        public static /* synthetic */ long m7328restrictConstraintsxF2OJ5Q$default(Companion companion, int i, int i2, int i3, int i4, boolean z, int i5, Object obj) {
            if ((i5 & 16) != 0) {
                z = true;
            }
            return companion.m7334restrictConstraintsxF2OJ5Q(i, i2, i3, i4, z);
        }

        @Stable
        /* renamed from: fitPrioritizingHeight-Zbe2FdA, reason: not valid java name */
        public final long m7329fitPrioritizingHeightZbe2FdA(int minWidth, int maxWidth, int minHeight, int maxHeight) {
            int i = 262142;
            int min = Math.min(minHeight, 262142);
            int min2 = maxHeight == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(maxHeight, 262142);
            int i2 = min2 == Integer.MAX_VALUE ? min : min2;
            if (i2 >= 8191) {
                if (i2 < 32767) {
                    i = 65534;
                } else if (i2 < 65535) {
                    i = 32766;
                } else {
                    if (i2 >= 262143) {
                        ConstraintsKt.throwInvalidConstraintsSizeException(i2);
                        PathKt$$ExternalSyntheticBUOutline0.m$1();
                        return 0L;
                    }
                    i = 8190;
                }
            }
            return ConstraintsKt.Constraints(Math.min(i, minWidth), maxWidth != Integer.MAX_VALUE ? Math.min(i, maxWidth) : Integer.MAX_VALUE, min, min2);
        }

        @Stable
        /* renamed from: fitPrioritizingWidth-Zbe2FdA, reason: not valid java name */
        public final long m7330fitPrioritizingWidthZbe2FdA(int minWidth, int maxWidth, int minHeight, int maxHeight) {
            int i = 262142;
            int min = Math.min(minWidth, 262142);
            int min2 = maxWidth == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(maxWidth, 262142);
            int i2 = min2 == Integer.MAX_VALUE ? min : min2;
            if (i2 >= 8191) {
                if (i2 < 32767) {
                    i = 65534;
                } else if (i2 < 65535) {
                    i = 32766;
                } else {
                    if (i2 >= 262143) {
                        ConstraintsKt.throwInvalidConstraintsSizeException(i2);
                        PathKt$$ExternalSyntheticBUOutline0.m$1();
                        return 0L;
                    }
                    i = 8190;
                }
            }
            return ConstraintsKt.Constraints(min, min2, Math.min(i, minHeight), maxHeight != Integer.MAX_VALUE ? Math.min(i, maxHeight) : Integer.MAX_VALUE);
        }

        @Stable
        /* renamed from: fixed-JhjzzOo, reason: not valid java name */
        public final long m7331fixedJhjzzOo(int width, int height) {
            if (!((height >= 0) & (width >= 0))) {
                InlineClassHelperKt.throwIllegalArgumentException("width and height must be >= 0");
            }
            return ConstraintsKt.createConstraints(width, width, height, height);
        }

        @Stable
        /* renamed from: fixedHeight-OenEA2s, reason: not valid java name */
        public final long m7332fixedHeightOenEA2s(int height) {
            if (!(height >= 0)) {
                InlineClassHelperKt.throwIllegalArgumentException("height must be >= 0");
            }
            return ConstraintsKt.createConstraints(0, Integer.MAX_VALUE, height, height);
        }

        @Stable
        /* renamed from: fixedWidth-OenEA2s, reason: not valid java name */
        public final long m7333fixedWidthOenEA2s(int width) {
            if (!(width >= 0)) {
                InlineClassHelperKt.throwIllegalArgumentException("width must be >= 0");
            }
            return ConstraintsKt.createConstraints(width, width, 0, Integer.MAX_VALUE);
        }

        @Stable
        @Deprecated(message = "Replace with fitPrioritizingWidth", replaceWith = @ReplaceWith(expression = "Constraints.fitPrioritizingWidth(minWidth, maxWidth, minHeight, maxHeight)", imports = {}))
        /* renamed from: restrictConstraints-xF2OJ5Q, reason: not valid java name */
        public final long m7334restrictConstraintsxF2OJ5Q(int minWidth, int maxWidth, int minHeight, int maxHeight, boolean prioritizeWidth) {
            return prioritizeWidth ? m7330fitPrioritizingWidthZbe2FdA(minWidth, maxWidth, minHeight, maxHeight) : m7329fitPrioritizingHeightZbe2FdA(minWidth, maxWidth, minHeight, maxHeight);
        }

        private Companion() {
        }
    }

    @Stable
    public static /* synthetic */ void getHasFixedHeight$annotations() {
    }

    @Stable
    public static /* synthetic */ void getHasFixedWidth$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void isZero$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7309constructorimpl(long j) {
        return j;
    }
}
