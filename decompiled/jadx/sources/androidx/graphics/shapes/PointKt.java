package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a6\u0010\b\u001a\u00060\u0002j\u0002`\u00032\n\u0010\t\u001a\u00060\u0002j\u0002`\u00032\n\u0010\n\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u000b\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a&\u0010\u000e\u001a\u00020\u000f*\u00060\u0002j\u0002`\u00032\n\u0010\u0010\u001a\u00060\u0002j\u0002`\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a2\u0010\u0013\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0016\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0017\u001a\u00020\u0001H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a&\u0010\u001a\u001a\u00020\u0001*\u00060\u0002j\u0002`\u00032\n\u0010\u0010\u001a\u00060\u0002j\u0002`\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a*\u0010\u001a\u001a\u00020\u0001*\u00060\u0002j\u0002`\u00032\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u001e\u0010!\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001a\u0010$\u001a\u00020\u0001*\u00060\u0002j\u0002`\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b%\u0010\u0005\u001a\u001a\u0010&\u001a\u00020\u0001*\u00060\u0002j\u0002`\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b'\u0010\u0005\u001a+\u0010(\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\n\u0010\u0010\u001a\u00060\u0002j\u0002`\u0003H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a+\u0010+\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\n\u0010\u0010\u001a\u00060\u0002j\u0002`\u0003H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b,\u0010*\u001a'\u0010-\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0017\u001a\u00020\u0001H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010\u0019\u001a'\u0010/\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0017\u001a\u00020\u0001H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0019\u001a&\u00101\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\u0006\u00102\u001a\u000203H\u0000ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a\u001f\u00106\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u0003H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b7\u0010#\"\u001c\u0010\u0000\u001a\u00020\u0001*\u00060\u0002j\u0002`\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u001c\u0010\u0006\u001a\u00020\u0001*\u00060\u0002j\u0002`\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005*\f\b\u0000\u00108\"\u00020\u00022\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"x", "", "Landroidx/collection/FloatFloatPair;", "Landroidx/graphics/shapes/Point;", "getX-DnnuFBc", "(J)F", "y", "getY-DnnuFBc", "interpolate", "start", "stop", "fraction", "interpolate-dLqxh1s", "(JJF)J", "clockwise", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "clockwise-ybeJwSQ", "(JJ)Z", "copy", "copy-5P9i7ZU", "(JFF)J", "div", "operand", "div-so9K2fw", "(JF)J", "dotProduct", "dotProduct-ybeJwSQ", "(JJ)F", "otherX", "otherY", "dotProduct-5P9i7ZU", "(JFF)F", "getDirection", "getDirection-DnnuFBc", "(J)J", "getDistance", "getDistance-DnnuFBc", "getDistanceSquared", "getDistanceSquared-DnnuFBc", "minus", "minus-ybeJwSQ", "(JJ)J", "plus", "plus-ybeJwSQ", "rem", "rem-so9K2fw", "times", "times-so9K2fw", "transformed", "f", "Landroidx/graphics/shapes/PointTransformer;", "transformed-so9K2fw", "(JLandroidx/graphics/shapes/PointTransformer;)J", "unaryMinus", "unaryMinus-DnnuFBc", "Point", "graphics-shapes_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPoint.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Point.kt\nandroidx/graphics/shapes/PointKt\n+ 2 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 3 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n48#2:140\n54#2:142\n48#2:144\n54#2:146\n48#2:148\n54#2:150\n22#3:141\n22#3:143\n22#3:145\n22#3:149\n1#4:147\n*S KotlinDebug\n*F\n+ 1 Point.kt\nandroidx/graphics/shapes/PointKt\n*L\n27#1:140\n30#1:142\n32#1:144\n32#1:146\n137#1:148\n137#1:150\n27#1:141\n30#1:143\n32#1:145\n137#1:149\n*E\n"})
/* loaded from: classes14.dex */
public final class PointKt {
    /* renamed from: clockwise-ybeJwSQ, reason: not valid java name */
    public static final boolean m7737clockwiseybeJwSQ(long j, long j2) {
        return (m7747getYDnnuFBc(j2) * m7746getXDnnuFBc(j)) - (m7746getXDnnuFBc(j2) * m7747getYDnnuFBc(j)) > 0.0f;
    }

    /* renamed from: copy-5P9i7ZU, reason: not valid java name */
    public static final long m7738copy5P9i7ZU(long j, float f, float f2) {
        return FloatFloatPair.m195constructorimpl(f, f2);
    }

    /* renamed from: copy-5P9i7ZU$default, reason: not valid java name */
    public static /* synthetic */ long m7739copy5P9i7ZU$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (4294967295L & j));
        }
        return m7738copy5P9i7ZU(j, f, f2);
    }

    /* renamed from: div-so9K2fw, reason: not valid java name */
    public static final long m7740divso9K2fw(long j, float f) {
        return FloatFloatPair.m195constructorimpl(m7746getXDnnuFBc(j) / f, m7747getYDnnuFBc(j) / f);
    }

    /* renamed from: dotProduct-5P9i7ZU, reason: not valid java name */
    public static final float m7741dotProduct5P9i7ZU(long j, float f, float f2) {
        return (m7747getYDnnuFBc(j) * f2) + (m7746getXDnnuFBc(j) * f);
    }

    /* renamed from: dotProduct-ybeJwSQ, reason: not valid java name */
    public static final float m7742dotProductybeJwSQ(long j, long j2) {
        return (m7747getYDnnuFBc(j2) * m7747getYDnnuFBc(j)) + (m7746getXDnnuFBc(j2) * m7746getXDnnuFBc(j));
    }

    /* renamed from: getDirection-DnnuFBc, reason: not valid java name */
    public static final long m7743getDirectionDnnuFBc(long j) {
        float m7744getDistanceDnnuFBc = m7744getDistanceDnnuFBc(j);
        if (m7744getDistanceDnnuFBc > 0.0f) {
            return m7740divso9K2fw(j, m7744getDistanceDnnuFBc);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Can't get the direction of a 0-length vector");
        return 0L;
    }

    /* renamed from: getDistance-DnnuFBc, reason: not valid java name */
    public static final float m7744getDistanceDnnuFBc(long j) {
        return (float) Math.sqrt((m7747getYDnnuFBc(j) * m7747getYDnnuFBc(j)) + (m7746getXDnnuFBc(j) * m7746getXDnnuFBc(j)));
    }

    /* renamed from: getDistanceSquared-DnnuFBc, reason: not valid java name */
    public static final float m7745getDistanceSquaredDnnuFBc(long j) {
        return (m7747getYDnnuFBc(j) * m7747getYDnnuFBc(j)) + (m7746getXDnnuFBc(j) * m7746getXDnnuFBc(j));
    }

    /* renamed from: getX-DnnuFBc, reason: not valid java name */
    public static final float m7746getXDnnuFBc(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getY-DnnuFBc, reason: not valid java name */
    public static final float m7747getYDnnuFBc(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: interpolate-dLqxh1s, reason: not valid java name */
    public static final long m7748interpolatedLqxh1s(long j, long j2, float f) {
        return FloatFloatPair.m195constructorimpl(Utils.interpolate(m7746getXDnnuFBc(j), m7746getXDnnuFBc(j2), f), Utils.interpolate(m7747getYDnnuFBc(j), m7747getYDnnuFBc(j2), f));
    }

    /* renamed from: minus-ybeJwSQ, reason: not valid java name */
    public static final long m7749minusybeJwSQ(long j, long j2) {
        return FloatFloatPair.m195constructorimpl(m7746getXDnnuFBc(j) - m7746getXDnnuFBc(j2), m7747getYDnnuFBc(j) - m7747getYDnnuFBc(j2));
    }

    /* renamed from: plus-ybeJwSQ, reason: not valid java name */
    public static final long m7750plusybeJwSQ(long j, long j2) {
        return FloatFloatPair.m195constructorimpl(m7746getXDnnuFBc(j2) + m7746getXDnnuFBc(j), m7747getYDnnuFBc(j2) + m7747getYDnnuFBc(j));
    }

    /* renamed from: rem-so9K2fw, reason: not valid java name */
    public static final long m7751remso9K2fw(long j, float f) {
        return FloatFloatPair.m195constructorimpl(m7746getXDnnuFBc(j) % f, m7747getYDnnuFBc(j) % f);
    }

    /* renamed from: times-so9K2fw, reason: not valid java name */
    public static final long m7752timesso9K2fw(long j, float f) {
        return FloatFloatPair.m195constructorimpl(m7746getXDnnuFBc(j) * f, m7747getYDnnuFBc(j) * f);
    }

    /* renamed from: transformed-so9K2fw, reason: not valid java name */
    public static final long m7753transformedso9K2fw(long j, @NotNull PointTransformer pointTransformer) {
        pointTransformer.getClass();
        long mo7755transformXgqJiTY = pointTransformer.mo7755transformXgqJiTY(m7746getXDnnuFBc(j), m7747getYDnnuFBc(j));
        return FloatFloatPair.m195constructorimpl(Float.intBitsToFloat((int) (mo7755transformXgqJiTY >> 32)), Float.intBitsToFloat((int) (mo7755transformXgqJiTY & 4294967295L)));
    }

    /* renamed from: unaryMinus-DnnuFBc, reason: not valid java name */
    public static final long m7754unaryMinusDnnuFBc(long j) {
        return FloatFloatPair.m195constructorimpl(-m7746getXDnnuFBc(j), -m7747getYDnnuFBc(j));
    }
}
