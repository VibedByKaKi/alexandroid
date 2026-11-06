package androidx.compose.ui.node;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f\u0088\u0001\u0002¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/node/DistanceAndFlags;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue", "()J", "distance", "", "getDistance-impl", "(J)F", "isInLayer", "", "isInLayer-impl", "(J)Z", "isInExpandedBounds", "isInExpandedBounds-impl", "compareTo", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "compareTo-9YPOF3E", "(JJ)I", "equals", "hashCode", "toString", "", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/DistanceAndFlags\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,407:1\n60#2:408\n22#3:409\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/DistanceAndFlags\n*L\n370#1:408\n370#1:409\n*E\n"})
/* loaded from: classes13.dex */
public final class DistanceAndFlags {
    private final long packedValue;

    private /* synthetic */ DistanceAndFlags(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DistanceAndFlags m6231boximpl(long j) {
        return new DistanceAndFlags(j);
    }

    /* renamed from: compareTo-9YPOF3E, reason: not valid java name */
    public static final int m6232compareTo9YPOF3E(long j, long j2) {
        boolean m6239isInLayerimpl = m6239isInLayerimpl(j);
        if (m6239isInLayerimpl != m6239isInLayerimpl(j2)) {
            return m6239isInLayerimpl ? -1 : 1;
        }
        return (Math.min(m6236getDistanceimpl(j), m6236getDistanceimpl(j2)) >= 0.0f && m6238isInExpandedBoundsimpl(j) != m6238isInExpandedBoundsimpl(j2)) ? m6238isInExpandedBoundsimpl(j) ? -1 : 1 : (int) Math.signum(m6236getDistanceimpl(j) - m6236getDistanceimpl(j2));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6234equalsimpl(long j, Object obj) {
        return (obj instanceof DistanceAndFlags) && j == ((DistanceAndFlags) obj).m6241unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6235equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getDistance-impl, reason: not valid java name */
    public static final float m6236getDistanceimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6237hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: isInExpandedBounds-impl, reason: not valid java name */
    public static final boolean m6238isInExpandedBoundsimpl(long j) {
        return (j & 2) != 0;
    }

    /* renamed from: isInLayer-impl, reason: not valid java name */
    public static final boolean m6239isInLayerimpl(long j) {
        return (j & 1) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6240toStringimpl(long j) {
        return "DistanceAndFlags(packedValue=" + j + ')';
    }

    public boolean equals(Object other) {
        return m6234equalsimpl(this.packedValue, other);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m6237hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m6240toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m6241unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6233constructorimpl(long j) {
        return j;
    }
}
