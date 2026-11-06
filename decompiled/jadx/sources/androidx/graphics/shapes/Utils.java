package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0000\u001a\"\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018H\u0080\bø\u0001\u0000\u001a\u0019\u0010\u0019\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u001a\u001a\u00020\u0001H\u0000¢\u0006\u0002\u0010\u001b\u001a!\u0010\u0019\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0000¢\u0006\u0002\u0010\u001c\u001a\u0018\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0000\u001a*\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\b\b\u0002\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020$H\u0000\u001a \u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\u0001H\u0000\u001a\u0018\u0010)\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u0001H\u0000\u001a4\u0010,\u001a\u00060\u000bj\u0002`\f2\u0006\u0010-\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\f\b\u0002\u0010.\u001a\u00060\u000bj\u0002`\fH\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100\u001a\u0010\u00101\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0000\u001a\u001e\u00102\u001a\u00060\u000bj\u0002`\f*\u00060\u000bj\u0002`\fH\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\u00020\u0001X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0014\u0010\b\u001a\u00020\u0001X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007\"\u001a\u0010\n\u001a\u00060\u000bj\u0002`\fX\u0080\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000e\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"AngleEpsilon", "", "DEBUG", "", "DistanceEpsilon", "FloatPi", "getFloatPi", "()F", "TwoPi", "getTwoPi", "Zero", "Landroidx/collection/FloatFloatPair;", "Landroidx/graphics/shapes/Point;", "getZero", "()J", "J", "angle", "x", "y", "debugLog", "", "tag", "", "messageFactory", "Lkotlin/Function0;", "directionVector", "angleRadians", "(F)J", "(FF)J", "distance", "distanceSquared", "findMinimum", "v0", "v1", "tolerance", "f", "Landroidx/graphics/shapes/FindMinimumFunction;", "interpolate", "start", "stop", "fraction", "positiveModulo", "num", "mod", "radialToCartesian", "radius", "center", "radialToCartesian-L6JJ3z0", "(FFJ)J", "square", "rotate90", "rotate90-DnnuFBc", "(J)J", "graphics-shapes_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName(name = "Utils")
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\nandroidx/graphics/shapes/Utils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
/* loaded from: classes14.dex */
public final class Utils {
    public static final float AngleEpsilon = 1.0E-6f;
    public static final boolean DEBUG = false;
    public static final float DistanceEpsilon = 1.0E-4f;
    private static final long Zero = FloatFloatPair.m195constructorimpl(0.0f, 0.0f);
    private static final float FloatPi = 3.1415927f;
    private static final float TwoPi = 6.2831855f;

    public static final float angle(float f, float f2) {
        float atan2 = (float) Math.atan2(f2, f);
        float f3 = TwoPi;
        return (atan2 + f3) % f3;
    }

    public static final void debugLog(@NotNull String str, @NotNull Function0<String> function0) {
        str.getClass();
        function0.getClass();
    }

    public static final long directionVector(float f, float f2) {
        float distance = distance(f, f2);
        if (distance > 0.0f) {
            return FloatFloatPair.m195constructorimpl(f / distance, f2 / distance);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Required distance greater than zero");
        return 0L;
    }

    public static final float distance(float f, float f2) {
        return (float) Math.sqrt((f2 * f2) + (f * f));
    }

    public static final float distanceSquared(float f, float f2) {
        return (f2 * f2) + (f * f);
    }

    public static final float findMinimum(float f, float f2, float f3, @NotNull FindMinimumFunction findMinimumFunction) {
        findMinimumFunction.getClass();
        while (f2 - f > f3) {
            float f4 = 2;
            float f5 = 3;
            float f6 = ((f4 * f) + f2) / f5;
            float f7 = ((f4 * f2) + f) / f5;
            if (findMinimumFunction.invoke(f6) < findMinimumFunction.invoke(f7)) {
                f2 = f7;
            } else {
                f = f6;
            }
        }
        return (f + f2) / 2;
    }

    public static /* synthetic */ float findMinimum$default(float f, float f2, float f3, FindMinimumFunction findMinimumFunction, int i, Object obj) {
        if ((i & 4) != 0) {
            f3 = 0.001f;
        }
        return findMinimum(f, f2, f3, findMinimumFunction);
    }

    public static final float getFloatPi() {
        return FloatPi;
    }

    public static final float getTwoPi() {
        return TwoPi;
    }

    public static final long getZero() {
        return Zero;
    }

    public static final float interpolate(float f, float f2, float f3) {
        return (f3 * f2) + ((1 - f3) * f);
    }

    public static final float positiveModulo(float f, float f2) {
        return ((f % f2) + f2) % f2;
    }

    /* renamed from: radialToCartesian-L6JJ3z0, reason: not valid java name */
    public static final long m7765radialToCartesianL6JJ3z0(float f, float f2, long j) {
        return PointKt.m7750plusybeJwSQ(PointKt.m7752timesso9K2fw(directionVector(f2), f), j);
    }

    /* renamed from: radialToCartesian-L6JJ3z0$default, reason: not valid java name */
    public static /* synthetic */ long m7766radialToCartesianL6JJ3z0$default(float f, float f2, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = Zero;
        }
        return m7765radialToCartesianL6JJ3z0(f, f2, j);
    }

    /* renamed from: rotate90-DnnuFBc, reason: not valid java name */
    public static final long m7767rotate90DnnuFBc(long j) {
        return FloatFloatPair.m195constructorimpl(-PointKt.m7747getYDnnuFBc(j), PointKt.m7746getXDnnuFBc(j));
    }

    public static final float square(float f) {
        return f * f;
    }

    public static final long directionVector(float f) {
        double d = f;
        return FloatFloatPair.m195constructorimpl((float) Math.cos(d), (float) Math.sin(d));
    }
}
