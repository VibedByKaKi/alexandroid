package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087@\u0018\u0000 32\u00020\u0001:\u00013B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\tH\u0087\n¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\tH\u0087\n¢\u0006\u0004\b\u0014\u0010\rJ!\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0019H\u0087\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0019H\u0087\b¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u001f\u0010\u0005J\u0018\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b%\u0010#J\u0018\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\tH\u0087\u0002¢\u0006\u0004\b(\u0010)J\u0018\u0010*\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\tH\u0087\u0002¢\u0006\u0004\b+\u0010)J\u000f\u0010,\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u0013\u00100\u001a\u00020\u00192\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\t8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r\u0088\u0001\u0002¨\u00064"}, d2 = {"Landroidx/compose/ui/geometry/CornerRadius;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue", "()J", "x", "", "getX$annotations", "()V", "getX-impl", "(J)F", "y", "getY$annotations", "getY-impl", "component1", "component1-impl", "component2", "component2-impl", "copy", "copy-OHQCggk", "(JFF)J", "isZero", "", "isZero-impl", "(J)Z", "isCircular", "isCircular-impl", "unaryMinus", "unaryMinus-kKHJgLs", "minus", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "minus-vF7b-mM", "(JJ)J", "plus", "plus-vF7b-mM", "times", "operand", "times-Bz7bX_o", "(JF)J", "div", "div-Bz7bX_o", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "equals", "hashCode", "", "Companion", "ui-geometry"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nCornerRadius.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,188:1\n48#1:193\n53#1:196\n48#1:231\n53#1:234\n48#1:236\n48#1:239\n53#1:242\n60#2:189\n70#2:191\n60#2:194\n70#2:197\n53#2,3:199\n60#2:202\n70#2:204\n60#2:205\n70#2:207\n53#2,3:209\n60#2:212\n70#2:214\n53#2,3:216\n60#2:219\n70#2:221\n53#2,3:222\n60#2:225\n70#2:227\n53#2,3:228\n60#2:232\n70#2:235\n60#2:237\n60#2:240\n70#2:243\n22#3:190\n22#3:192\n22#3:195\n22#3:198\n22#3:203\n22#3:206\n22#3:208\n22#3:213\n22#3:215\n22#3:220\n22#3:226\n22#3:233\n22#3:238\n22#3:241\n*S KotlinDebug\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n*L\n55#1:193\n57#1:196\n158#1:231\n158#1:234\n159#1:236\n161#1:239\n161#1:242\n48#1:189\n53#1:191\n55#1:194\n57#1:197\n64#1:199,3\n63#1:202\n63#1:204\n111#1:205\n112#1:207\n110#1:209,3\n127#1:212\n128#1:214\n126#1:216,3\n142#1:219\n142#1:221\n142#1:222,3\n154#1:225\n154#1:227\n154#1:228,3\n158#1:232\n158#1:235\n159#1:237\n161#1:240\n161#1:243\n48#1:190\n53#1:192\n55#1:195\n57#1:198\n63#1:203\n111#1:206\n112#1:208\n127#1:213\n128#1:215\n142#1:220\n154#1:226\n158#1:233\n159#1:238\n161#1:241\n*E\n"})
/* loaded from: classes13.dex */
public final class CornerRadius {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = m4354constructorimpl(0);
    private final long packedValue;

    private /* synthetic */ CornerRadius(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CornerRadius m4351boximpl(long j) {
        return new CornerRadius(j);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m4352component1impl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m4353component2impl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: copy-OHQCggk, reason: not valid java name */
    public static final long m4355copyOHQCggk(long j, float f, float f2) {
        return m4354constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }

    /* renamed from: copy-OHQCggk$default, reason: not valid java name */
    public static /* synthetic */ long m4356copyOHQCggk$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (4294967295L & j));
        }
        return m4355copyOHQCggk(j, f, f2);
    }

    @Stable
    /* renamed from: div-Bz7bX_o, reason: not valid java name */
    public static final long m4357divBz7bX_o(long j, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / f;
        return m4354constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4358equalsimpl(long j, Object obj) {
        return (obj instanceof CornerRadius) && j == ((CornerRadius) obj).m4370unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4359equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final float m4360getXimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final float m4361getYimpl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4362hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @Stable
    /* renamed from: isCircular-impl, reason: not valid java name */
    public static final boolean m4363isCircularimpl(long j) {
        return (j >>> 32) == (j & 4294967295L);
    }

    @Stable
    /* renamed from: isZero-impl, reason: not valid java name */
    public static final boolean m4364isZeroimpl(long j) {
        long j2 = j & 9223372034707292159L;
        return (((~j2) & (j2 - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) != 0;
    }

    @Stable
    /* renamed from: minus-vF7b-mM, reason: not valid java name */
    public static final long m4365minusvF7bmM(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return m4354constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    @Stable
    /* renamed from: plus-vF7b-mM, reason: not valid java name */
    public static final long m4366plusvF7bmM(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat((int) (j & 4294967295L));
        return m4354constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    @Stable
    /* renamed from: times-Bz7bX_o, reason: not valid java name */
    public static final long m4367timesBz7bX_o(long j, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
        return m4354constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4368toStringimpl(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "CornerRadius.circular(" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i), 1) + ')';
        }
        return "CornerRadius.elliptical(" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i), 1) + ", " + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i2), 1) + ')';
    }

    @Stable
    /* renamed from: unaryMinus-kKHJgLs, reason: not valid java name */
    public static final long m4369unaryMinuskKHJgLs(long j) {
        return m4354constructorimpl(j ^ (-9223372034707292160L));
    }

    public boolean equals(Object other) {
        return m4358equalsimpl(this.packedValue, other);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m4362hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m4368toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m4370unboximpl() {
        return this.packedValue;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\t\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/geometry/CornerRadius$Companion;", "", "<init>", "()V", "Zero", "Landroidx/compose/ui/geometry/CornerRadius;", "getZero-kKHJgLs$annotations", "getZero-kKHJgLs", "()J", "J", "ui-geometry"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getZero-kKHJgLs, reason: not valid java name */
        public final long m4372getZerokKHJgLs() {
            return CornerRadius.Zero;
        }

        private Companion() {
        }

        @Stable
        /* renamed from: getZero-kKHJgLs$annotations, reason: not valid java name */
        public static /* synthetic */ void m4371getZerokKHJgLs$annotations() {
        }
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m4354constructorimpl(long j) {
        return j;
    }
}
