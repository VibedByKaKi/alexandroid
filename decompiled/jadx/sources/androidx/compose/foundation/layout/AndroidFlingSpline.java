package androidx.compose.foundation.layout;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u001b\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/layout/AndroidFlingSpline;", "", "()V", "NbSamples", "", "SplinePositions", "", "SplineTimes", "deceleration", "", "velocity", "", "friction", "flingPosition", "Landroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult;", "time", "flingPosition-LfoxSSI", "(F)J", "FlingResult", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,725:1\n63#2,3:726\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline\n*L\n700#1:726,3\n*E\n"})
/* loaded from: classes.dex */
final class AndroidFlingSpline {
    private static final int NbSamples = 100;

    @NotNull
    public static final AndroidFlingSpline INSTANCE = new AndroidFlingSpline();

    @NotNull
    private static final float[] SplinePositions = new float[101];

    @NotNull
    private static final float[] SplineTimes = new float[101];

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11 = 0.0f;
        int i = 0;
        float f12 = 0.0f;
        while (true) {
            float f13 = 1.0f;
            if (i >= 100) {
                SplineTimes[100] = 1.0f;
                SplinePositions[100] = 1.0f;
                return;
            }
            float f14 = i / 100;
            float f15 = 1.0f;
            while (true) {
                f = ((f15 - f11) / 2.0f) + f11;
                f2 = f13 - f;
                f3 = f * 3.0f * f2;
                f4 = f * f * f;
                float m = DoubleList$$ExternalSyntheticOutline0.m(f, 0.35000002f, f2 * 0.175f, f3) + f4;
                f5 = f13;
                f6 = f14;
                if (Math.abs(m - f14) < 1.0E-5d) {
                    break;
                }
                if (m > f6) {
                    f15 = f;
                } else {
                    f11 = f;
                }
                f13 = f5;
                f14 = f6;
            }
            SplinePositions[i] = (((f2 * 0.5f) + f) * f3) + f4;
            float f16 = f5;
            while (true) {
                f7 = ((f16 - f12) / 2.0f) + f12;
                f8 = f5 - f7;
                f9 = f7 * 3.0f * f8;
                f10 = f7 * f7 * f7;
                float m2 = DoubleList$$ExternalSyntheticOutline0.m(f8, 0.5f, f7, f9) + f10;
                if (Math.abs(m2 - f6) >= 1.0E-5d) {
                    if (m2 > f6) {
                        f16 = f7;
                    } else {
                        f12 = f7;
                    }
                }
            }
            SplineTimes[i] = (((f7 * 0.35000002f) + (f8 * 0.175f)) * f9) + f10;
            i++;
        }
    }

    private AndroidFlingSpline() {
    }

    public final double deceleration(float velocity, float friction) {
        return Math.log((Math.abs(velocity) * 0.35f) / friction);
    }

    /* renamed from: flingPosition-LfoxSSI, reason: not valid java name */
    public final long m735flingPositionLfoxSSI(float time) {
        float f;
        float f2;
        float f3 = 100;
        int i = (int) (f3 * time);
        if (i < 100) {
            float f4 = i / f3;
            int i2 = i + 1;
            float f5 = i2 / f3;
            float[] fArr = SplinePositions;
            float f6 = fArr[i];
            f2 = (fArr[i2] - f6) / (f5 - f4);
            f = ErrorUtils$$ExternalSyntheticOutline0.m(time, f4, f2, f6);
        } else {
            f = 1.0f;
            f2 = 0.0f;
        }
        return FlingResult.m737constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult;", "", "packedValue", "", "constructor-impl", "(J)J", "distanceCoefficient", "", "getDistanceCoefficient-impl", "(J)F", "velocityCoefficient", "getVelocityCoefficient-impl", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @JvmInline
    @SourceDebugExtension({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,725:1\n72#2:726\n86#2:728\n22#3:727\n22#3:729\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult\n*L\n717#1:726\n722#1:728\n717#1:727\n722#1:729\n*E\n"})
    public static final class FlingResult {
        private final long packedValue;

        private /* synthetic */ FlingResult(long j) {
            this.packedValue = j;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ FlingResult m736boximpl(long j) {
            return new FlingResult(j);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m738equalsimpl(long j, Object obj) {
            return (obj instanceof FlingResult) && j == ((FlingResult) obj).getPackedValue();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m739equalsimpl0(long j, long j2) {
            return j == j2;
        }

        /* renamed from: getDistanceCoefficient-impl, reason: not valid java name */
        public static final float m740getDistanceCoefficientimpl(long j) {
            return Float.intBitsToFloat((int) (j >> 32));
        }

        /* renamed from: getVelocityCoefficient-impl, reason: not valid java name */
        public static final float m741getVelocityCoefficientimpl(long j) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m742hashCodeimpl(long j) {
            return Long.hashCode(j);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m743toStringimpl(long j) {
            return "FlingResult(packedValue=" + j + ')';
        }

        public boolean equals(Object obj) {
            return m738equalsimpl(this.packedValue, obj);
        }

        public int hashCode() {
            return m742hashCodeimpl(this.packedValue);
        }

        public String toString() {
            return m743toStringimpl(this.packedValue);
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ long getPackedValue() {
            return this.packedValue;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static long m737constructorimpl(long j) {
            return j;
        }
    }
}
