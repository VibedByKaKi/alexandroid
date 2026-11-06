package kotlin.random;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.LongRange;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u001a\u0014\u0010\b\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\tH\u0007\u001a\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\f\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u001a\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0015H\u0000¨\u0006\u0016"}, d2 = {"Random", "Lkotlin/random/Random;", "seed", "", "", "nextInt", "range", "Lkotlin/ranges/IntRange;", "nextLong", "Lkotlin/ranges/LongRange;", "fastLog2", "value", "takeUpperBits", "bitCount", "checkRangeBounds", "", "from", "until", "", "boundsErrorMessage", "", "", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/RandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,387:1\n1#2:388\n*E\n"})
/* loaded from: classes10.dex */
public final class RandomKt {
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final Random Random(long j) {
        return new XorWowRandom((int) j, (int) (j >> 32));
    }

    @NotNull
    public static final String boundsErrorMessage(@NotNull Object obj, @NotNull Object obj2) {
        obj.getClass();
        obj2.getClass();
        StringBuilder sb = new StringBuilder("Random range is empty: [");
        sb.append(obj);
        sb.append(", ");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, ").", obj2);
    }

    public static final void checkRangeBounds(long j, long j2) {
        if (j2 > j) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m((Object) boundsErrorMessage(Long.valueOf(j), Long.valueOf(j2)));
    }

    public static final int fastLog2(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    @SinceKotlin(version = "1.3")
    public static final int nextInt(@NotNull Random random, @NotNull IntRange intRange) {
        random.getClass();
        intRange.getClass();
        if (!intRange.isEmpty()) {
            return intRange.getLast() < Integer.MAX_VALUE ? random.nextInt(intRange.getFirst(), intRange.getLast() + 1) : intRange.getFirst() > Integer.MIN_VALUE ? random.nextInt(intRange.getFirst() - 1, intRange.getLast()) + 1 : random.nextInt();
        }
        Gson$$ExternalSyntheticBUOutline0.m((Object) intRange, "Cannot get random in empty range: ");
        return 0;
    }

    @SinceKotlin(version = "1.3")
    public static final long nextLong(@NotNull Random random, @NotNull LongRange longRange) {
        random.getClass();
        longRange.getClass();
        if (!longRange.isEmpty()) {
            return longRange.getLast() < Long.MAX_VALUE ? random.nextLong(longRange.getFirst(), longRange.getLast() + 1) : longRange.getFirst() > Long.MIN_VALUE ? random.nextLong(longRange.getFirst() - 1, longRange.getLast()) + 1 : random.nextLong();
        }
        Gson$$ExternalSyntheticBUOutline0.m((Object) longRange, "Cannot get random in empty range: ");
        return 0L;
    }

    public static final int takeUpperBits(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final Random Random(int i) {
        return new XorWowRandom(i, i >> 31);
    }

    public static final void checkRangeBounds(int i, int i2) {
        if (i2 > i) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m((Object) boundsErrorMessage(Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static final void checkRangeBounds(double d, double d2) {
        if (d2 > d) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m((Object) boundsErrorMessage(Double.valueOf(d), Double.valueOf(d2)));
    }
}
