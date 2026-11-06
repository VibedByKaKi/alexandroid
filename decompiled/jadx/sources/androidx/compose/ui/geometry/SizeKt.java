package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0087\b¢\u0006\u0002\u0010\u0005\u001a\"\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001c\u0010\u001a\u001a\u00020\u0001*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0001H\u0087\n¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001c\u0010\u001a\u001a\u00020\u0001*\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u0001H\u0087\n¢\u0006\u0004\b\u001d\u0010 \u001a\u001c\u0010\u001a\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0001H\u0087\n¢\u0006\u0004\b\u001d\u0010!\u001a\u0013\u0010\"\u001a\u00020#*\u00020\u0001H\u0007¢\u0006\u0004\b$\u0010%\"\u001f\u0010\u0006\u001a\u00020\u0007*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u001f\u0010\f\u001a\u00020\u0007*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b\"\u001e\u0010&\u001a\u00020'*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\t\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Size", "Landroidx/compose/ui/geometry/Size;", "width", "", "height", "(FF)J", "isSpecified", "", "isSpecified-uvyYCjk$annotations", "(J)V", "isSpecified-uvyYCjk", "(J)Z", "isUnspecified", "isUnspecified-uvyYCjk$annotations", "isUnspecified-uvyYCjk", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-TmRCtEA", "(JLkotlin/jvm/functions/Function0;)J", "lerp", "start", "stop", "fraction", "lerp-VgWVRYQ", "(JJF)J", "times", "", "size", "times-d16Qtg0", "(IJ)J", "", "(DJ)J", "(FJ)J", "toRect", "Landroidx/compose/ui/geometry/Rect;", "toRect-uvyYCjk", "(J)Landroidx/compose/ui/geometry/Rect;", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter-uvyYCjk$annotations", "getCenter-uvyYCjk", "(J)J", "ui-geometry"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,187:1\n136#1:191\n53#2,3:188\n60#2:192\n70#2:194\n53#2,3:196\n60#2:199\n70#2:201\n53#2,3:203\n22#3:193\n22#3:195\n22#3:200\n30#4:202\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n147#1:191\n33#1:188,3\n166#1:192\n167#1:194\n165#1:196,3\n186#1:199\n186#1:201\n186#1:203,3\n166#1:193\n167#1:195\n186#1:200\n186#1:202\n*E\n"})
/* loaded from: classes13.dex */
public final class SizeKt {
    @Stable
    public static final long Size(float f, float f2) {
        return Size.m4460constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: getCenter-uvyYCjk, reason: not valid java name */
    public static final long m4479getCenteruvyYCjk(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
        return Offset.m4392constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    /* renamed from: isSpecified-uvyYCjk, reason: not valid java name */
    public static final boolean m4481isSpecifieduvyYCjk(long j) {
        return j != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: isUnspecified-uvyYCjk, reason: not valid java name */
    public static final boolean m4483isUnspecifieduvyYCjk(long j) {
        return j == InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    @Stable
    /* renamed from: lerp-VgWVRYQ, reason: not valid java name */
    public static final long m4485lerpVgWVRYQ(long j, long j2, float f) {
        float lerp = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f);
        float lerp2 = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f);
        return Size.m4460constructorimpl((Float.floatToRawIntBits(lerp) << 32) | (Float.floatToRawIntBits(lerp2) & 4294967295L));
    }

    /* renamed from: takeOrElse-TmRCtEA, reason: not valid java name */
    public static final long m4486takeOrElseTmRCtEA(long j, @NotNull Function0<Size> function0) {
        return j != InlineClassHelperKt.UnspecifiedPackedFloats ? j : function0.invoke().m4474unboximpl();
    }

    @Stable
    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m4489timesd16Qtg0(int i, long j) {
        return Size.m4472times7Ah8Wj8(j, i);
    }

    @Stable
    @NotNull
    /* renamed from: toRect-uvyYCjk, reason: not valid java name */
    public static final Rect m4490toRectuvyYCjk(long j) {
        return RectKt.m4440Recttz77jQw(Offset.INSTANCE.m4416getZeroF1C5BW0(), j);
    }

    @Stable
    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m4487timesd16Qtg0(double d, long j) {
        return Size.m4472times7Ah8Wj8(j, (float) d);
    }

    @Stable
    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m4488timesd16Qtg0(float f, long j) {
        return Size.m4472times7Ah8Wj8(j, f);
    }

    @Stable
    /* renamed from: getCenter-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m4480getCenteruvyYCjk$annotations(long j) {
    }

    @Stable
    /* renamed from: isSpecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m4482isSpecifieduvyYCjk$annotations(long j) {
    }

    @Stable
    /* renamed from: isUnspecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m4484isUnspecifieduvyYCjk$annotations(long j) {
    }
}
