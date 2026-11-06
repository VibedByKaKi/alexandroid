package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\b\u001a\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0010\u001a%\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0001H\u0080\b¨\u0006\u001d"}, d2 = {"saturatingAdd", "", "value", "unit", "Lkotlin/time/DurationUnit;", "duration", "Lkotlin/time/Duration;", "saturatingAdd-NuflL3o", "(JLkotlin/time/DurationUnit;J)J", "checkInfiniteSumDefined", "durationInUnit", "checkInfiniteSumDefined-PjuGub4", "(JJJ)J", "saturatingAddInHalves", "saturatingAddInHalves-NuflL3o", "infinityOfSign", "(J)J", "saturatingDiff", "valueNs", "origin", "(JJLkotlin/time/DurationUnit;)J", "saturatingOriginsDiff", "origin1", "origin2", "saturatingFiniteDiff", "value1", "value2", "isSaturated", "", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nlongSaturatedMath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,81:1\n80#1:82\n80#1:83\n80#1:84\n80#1:85\n80#1:86\n80#1:87\n*S KotlinDebug\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n14#1:82\n17#1:83\n36#1:84\n46#1:85\n53#1:86\n57#1:87\n*E\n"})
/* loaded from: classes10.dex */
public final class LongSaturatedMathKt {
    /* renamed from: checkInfiniteSumDefined-PjuGub4, reason: not valid java name */
    private static final long m26763checkInfiniteSumDefinedPjuGub4(long j, long j2, long j3) {
        if (!Duration.m26686isInfiniteimpl(j2) || (j ^ j3) >= 0) {
            return j;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Summing infinities of different signs");
        return 0L;
    }

    private static final long infinityOfSign(long j) {
        return j < 0 ? Duration.INSTANCE.m26751getNEG_INFINITEUwyO8pc$kotlin_stdlib() : Duration.INSTANCE.m26750getINFINITEUwyO8pc();
    }

    public static final boolean isSaturated(long j) {
        return ((j - 1) | 1) == Long.MAX_VALUE;
    }

    /* renamed from: saturatingAdd-NuflL3o, reason: not valid java name */
    public static final long m26764saturatingAddNuflL3o(long j, @NotNull DurationUnit durationUnit, long j2) {
        durationUnit.getClass();
        long m26700toLongimpl = Duration.m26700toLongimpl(j2, durationUnit);
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            return m26763checkInfiniteSumDefinedPjuGub4(j, j2, m26700toLongimpl);
        }
        if (((m26700toLongimpl - 1) | 1) == Long.MAX_VALUE) {
            return m26765saturatingAddInHalvesNuflL3o(j, durationUnit, j2);
        }
        long j3 = j + m26700toLongimpl;
        return ((j ^ j3) & (m26700toLongimpl ^ j3)) < 0 ? j < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j3;
    }

    /* renamed from: saturatingAddInHalves-NuflL3o, reason: not valid java name */
    private static final long m26765saturatingAddInHalvesNuflL3o(long j, DurationUnit durationUnit, long j2) {
        long m26664divUwyO8pc = Duration.m26664divUwyO8pc(j2, 2);
        long m26700toLongimpl = Duration.m26700toLongimpl(m26664divUwyO8pc, durationUnit);
        return (1 | (m26700toLongimpl - 1)) == Long.MAX_VALUE ? m26700toLongimpl : m26764saturatingAddNuflL3o(m26764saturatingAddNuflL3o(j, durationUnit, m26664divUwyO8pc), durationUnit, Duration.m26689minusLRDsOJo(j2, m26664divUwyO8pc));
    }

    public static final long saturatingDiff(long j, long j2, @NotNull DurationUnit durationUnit) {
        durationUnit.getClass();
        return (1 | (j2 - 1)) == Long.MAX_VALUE ? Duration.m26705unaryMinusUwyO8pc(infinityOfSign(j2)) : saturatingFiniteDiff(j, j2, durationUnit);
    }

    private static final long saturatingFiniteDiff(long j, long j2, DurationUnit durationUnit) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            return DurationKt.toDuration(j3, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return Duration.m26705unaryMinusUwyO8pc(infinityOfSign(j3));
        }
        long convertDurationUnit = DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(1L, durationUnit2, durationUnit);
        long j4 = (j / convertDurationUnit) - (j2 / convertDurationUnit);
        long j5 = (j % convertDurationUnit) - (j2 % convertDurationUnit);
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m26690plusLRDsOJo(DurationKt.toDuration(j4, durationUnit2), DurationKt.toDuration(j5, durationUnit));
    }

    public static final long saturatingOriginsDiff(long j, long j2, @NotNull DurationUnit durationUnit) {
        durationUnit.getClass();
        return ((j2 - 1) | 1) == Long.MAX_VALUE ? j == j2 ? Duration.INSTANCE.m26752getZEROUwyO8pc() : Duration.m26705unaryMinusUwyO8pc(infinityOfSign(j2)) : (1 | (j - 1)) == Long.MAX_VALUE ? infinityOfSign(j) : saturatingFiniteDiff(j, j2, durationUnit);
    }
}
