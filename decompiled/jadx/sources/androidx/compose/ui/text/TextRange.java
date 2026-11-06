package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.mobile.heremapsexplore.Constants.ReactProperties;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 '2\u00020\u0001:\u0001'B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0013\u0010%\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0007HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\t\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006("}, d2 = {"Landroidx/compose/ui/text/TextRange;", "", "packedValue", "", "constructor-impl", "(J)J", "start", "", "getStart-impl", "(J)I", "end", "getEnd-impl", ReactProperties.GEOFENCE_MINIMUM_RANGE, "getMin-impl", ReactProperties.GEOFENCE_MAXIMUM_RANGE, "getMax-impl", "collapsed", "", "getCollapsed-impl", "(J)Z", "reversed", "getReversed-impl", "length", "getLength-impl", "intersects", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "intersects-5zc-tL8", "(JJ)Z", "contains", "contains-5zc-tL8", "offset", "contains-impl", "(JI)Z", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "equals", "hashCode", "Companion", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,123:1\n85#2:124\n90#2:125\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRange\n*L\n53#1:124\n56#1:125\n*E\n"})
/* loaded from: classes13.dex */
public final class TextRange {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = TextRangeKt.TextRange(0);
    private final long packedValue;

    private /* synthetic */ TextRange(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextRange m6818boximpl(long j) {
        return new TextRange(j);
    }

    /* renamed from: contains-5zc-tL8, reason: not valid java name */
    public static final boolean m6820contains5zctL8(long j, long j2) {
        return (m6828getMinimpl(j) <= m6828getMinimpl(j2)) & (m6827getMaximpl(j2) <= m6827getMaximpl(j));
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m6821containsimpl(long j, int i) {
        return i < m6827getMaximpl(j) && m6828getMinimpl(j) <= i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6822equalsimpl(long j, Object obj) {
        return (obj instanceof TextRange) && j == ((TextRange) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6823equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getCollapsed-impl, reason: not valid java name */
    public static final boolean m6824getCollapsedimpl(long j) {
        return m6830getStartimpl(j) == m6825getEndimpl(j);
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m6825getEndimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: getLength-impl, reason: not valid java name */
    public static final int m6826getLengthimpl(long j) {
        return m6827getMaximpl(j) - m6828getMinimpl(j);
    }

    /* renamed from: getMax-impl, reason: not valid java name */
    public static final int m6827getMaximpl(long j) {
        return Math.max(m6830getStartimpl(j), m6825getEndimpl(j));
    }

    /* renamed from: getMin-impl, reason: not valid java name */
    public static final int m6828getMinimpl(long j) {
        return Math.min(m6830getStartimpl(j), m6825getEndimpl(j));
    }

    /* renamed from: getReversed-impl, reason: not valid java name */
    public static final boolean m6829getReversedimpl(long j) {
        return m6830getStartimpl(j) > m6825getEndimpl(j);
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m6830getStartimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6831hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: intersects-5zc-tL8, reason: not valid java name */
    public static final boolean m6832intersects5zctL8(long j, long j2) {
        return (m6828getMinimpl(j) < m6827getMaximpl(j2)) & (m6828getMinimpl(j2) < m6827getMaximpl(j));
    }

    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6833toStringimpl(long j) {
        return "TextRange(" + m6830getStartimpl(j) + ", " + m6825getEndimpl(j) + ')';
    }

    public boolean equals(Object other) {
        return m6822equalsimpl(this.packedValue, other);
    }

    public int hashCode() {
        return m6831hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m6833toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/TextRange$Companion;", "", "<init>", "()V", "Zero", "Landroidx/compose/ui/text/TextRange;", "getZero-d9O1mEE", "()J", "J", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getZero-d9O1mEE, reason: not valid java name */
        public final long m6835getZerod9O1mEE() {
            return TextRange.Zero;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6819constructorimpl(long j) {
        return j;
    }
}
