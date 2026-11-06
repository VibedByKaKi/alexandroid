package kotlin.ranges;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amazon.appmanager.lib.DefaultPreloadManager;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.URandomKt;
import kotlin.ranges.UIntProgression;
import kotlin.ranges.ULongProgression;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\u0000\u001a\u00020\u0004*\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007\u001a\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u0004*\u00020\u0005H\u0007\u001a\u0011\u0010\b\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\b\u001a\u00020\u0004*\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u000e\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007\u001a\u000e\u0010\t\u001a\u0004\u0018\u00010\u0004*\u00020\u0005H\u0007\u001a\u0012\u0010\n\u001a\u00020\u0001*\u00020\u000bH\u0087\b¢\u0006\u0002\u0010\f\u001a\u0012\u0010\n\u001a\u00020\u0004*\u00020\rH\u0087\b¢\u0006\u0002\u0010\u000e\u001a\u0019\u0010\n\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a\u0019\u0010\n\u001a\u00020\u0004*\u00020\r2\u0006\u0010\n\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u000bH\u0087\b\u001a\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0004*\u00020\rH\u0087\b\u001a\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000fH\u0007\u001a\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0004*\u00020\r2\u0006\u0010\n\u001a\u00020\u000fH\u0007\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0087\n¢\u0006\u0002\b\u0016\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0087\n¢\u0006\u0002\b\u0017\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0004\b \u0010!\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\"H\u0087\u0002¢\u0006\u0004\b#\u0010$\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\r2\u0006\u0010\u0018\u001a\u00020\"H\u0087\u0002¢\u0006\u0004\b%\u0010&\u001a\u001c\u0010'\u001a\u00020\u0002*\u00020\u00192\u0006\u0010(\u001a\u00020\u0019H\u0087\u0004¢\u0006\u0004\b)\u0010*\u001a\u001c\u0010'\u001a\u00020\u0002*\u00020\u00012\u0006\u0010(\u001a\u00020\u0001H\u0087\u0004¢\u0006\u0004\b+\u0010,\u001a\u001c\u0010'\u001a\u00020\u0005*\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H\u0087\u0004¢\u0006\u0004\b-\u0010.\u001a\u001c\u0010'\u001a\u00020\u0002*\u00020\"2\u0006\u0010(\u001a\u00020\"H\u0087\u0004¢\u0006\u0004\b/\u00100\u001a\f\u00101\u001a\u00020\u0002*\u00020\u0002H\u0007\u001a\f\u00101\u001a\u00020\u0005*\u00020\u0005H\u0007\u001a\u0015\u00102\u001a\u00020\u0002*\u00020\u00022\u0006\u00102\u001a\u000203H\u0087\u0004\u001a\u0015\u00102\u001a\u00020\u0005*\u00020\u00052\u0006\u00102\u001a\u000204H\u0087\u0004\u001a\u001c\u00105\u001a\u00020\u000b*\u00020\u00192\u0006\u0010(\u001a\u00020\u0019H\u0087\u0004¢\u0006\u0004\b6\u00107\u001a\u001c\u00105\u001a\u00020\u000b*\u00020\u00012\u0006\u0010(\u001a\u00020\u0001H\u0087\u0004¢\u0006\u0004\b8\u00109\u001a\u001c\u00105\u001a\u00020\r*\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H\u0087\u0004¢\u0006\u0004\b:\u0010;\u001a\u001c\u00105\u001a\u00020\u000b*\u00020\"2\u0006\u0010(\u001a\u00020\"H\u0087\u0004¢\u0006\u0004\b<\u0010=\u001a\u001b\u0010>\u001a\u00020\u0001*\u00020\u00012\u0006\u0010?\u001a\u00020\u0001H\u0007¢\u0006\u0004\b@\u0010A\u001a\u001b\u0010>\u001a\u00020\u0004*\u00020\u00042\u0006\u0010?\u001a\u00020\u0004H\u0007¢\u0006\u0004\bB\u0010C\u001a\u001b\u0010>\u001a\u00020\u0019*\u00020\u00192\u0006\u0010?\u001a\u00020\u0019H\u0007¢\u0006\u0004\bD\u0010E\u001a\u001b\u0010>\u001a\u00020\"*\u00020\"2\u0006\u0010?\u001a\u00020\"H\u0007¢\u0006\u0004\bF\u0010G\u001a\u001b\u0010H\u001a\u00020\u0001*\u00020\u00012\u0006\u0010I\u001a\u00020\u0001H\u0007¢\u0006\u0004\bJ\u0010A\u001a\u001b\u0010H\u001a\u00020\u0004*\u00020\u00042\u0006\u0010I\u001a\u00020\u0004H\u0007¢\u0006\u0004\bK\u0010C\u001a\u001b\u0010H\u001a\u00020\u0019*\u00020\u00192\u0006\u0010I\u001a\u00020\u0019H\u0007¢\u0006\u0004\bL\u0010E\u001a\u001b\u0010H\u001a\u00020\"*\u00020\"2\u0006\u0010I\u001a\u00020\"H\u0007¢\u0006\u0004\bM\u0010G\u001a#\u0010N\u001a\u00020\u0001*\u00020\u00012\u0006\u0010?\u001a\u00020\u00012\u0006\u0010I\u001a\u00020\u0001H\u0007¢\u0006\u0004\bO\u0010P\u001a#\u0010N\u001a\u00020\u0004*\u00020\u00042\u0006\u0010?\u001a\u00020\u00042\u0006\u0010I\u001a\u00020\u0004H\u0007¢\u0006\u0004\bQ\u0010R\u001a#\u0010N\u001a\u00020\u0019*\u00020\u00192\u0006\u0010?\u001a\u00020\u00192\u0006\u0010I\u001a\u00020\u0019H\u0007¢\u0006\u0004\bS\u0010T\u001a#\u0010N\u001a\u00020\"*\u00020\"2\u0006\u0010?\u001a\u00020\"2\u0006\u0010I\u001a\u00020\"H\u0007¢\u0006\u0004\bU\u0010V\u001a!\u0010N\u001a\u00020\u0001*\u00020\u00012\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00010XH\u0007¢\u0006\u0004\bY\u0010Z\u001a!\u0010N\u001a\u00020\u0004*\u00020\u00042\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00040XH\u0007¢\u0006\u0004\b[\u0010\\¨\u0006]"}, d2 = {DefaultPreloadManager.METRIC_PATH_FIRST, "Lkotlin/UInt;", "Lkotlin/ranges/UIntProgression;", "(Lkotlin/ranges/UIntProgression;)I", "Lkotlin/ULong;", "Lkotlin/ranges/ULongProgression;", "(Lkotlin/ranges/ULongProgression;)J", "firstOrNull", "last", "lastOrNull", "random", "Lkotlin/ranges/UIntRange;", "(Lkotlin/ranges/UIntRange;)I", "Lkotlin/ranges/ULongRange;", "(Lkotlin/ranges/ULongRange;)J", "Lkotlin/random/Random;", "(Lkotlin/ranges/UIntRange;Lkotlin/random/Random;)I", "(Lkotlin/ranges/ULongRange;Lkotlin/random/Random;)J", "randomOrNull", "contains", "", "element", "contains-biwQdVI", "contains-GYNo2lE", "value", "Lkotlin/UByte;", "contains-68kG9v0", "(Lkotlin/ranges/UIntRange;B)Z", "contains-ULb-yJY", "(Lkotlin/ranges/ULongRange;B)Z", "contains-Gab390E", "(Lkotlin/ranges/ULongRange;I)Z", "contains-fz5IDCE", "(Lkotlin/ranges/UIntRange;J)Z", "Lkotlin/UShort;", "contains-ZsK3CEQ", "(Lkotlin/ranges/UIntRange;S)Z", "contains-uhHAxoY", "(Lkotlin/ranges/ULongRange;S)Z", "downTo", TypedValues.TransitionType.S_TO, "downTo-Kr8caGY", "(BB)Lkotlin/ranges/UIntProgression;", "downTo-J1ME1BU", "(II)Lkotlin/ranges/UIntProgression;", "downTo-eb3DHEI", "(JJ)Lkotlin/ranges/ULongProgression;", "downTo-5PvTz6A", "(SS)Lkotlin/ranges/UIntProgression;", "reversed", "step", "", "", "until", "until-Kr8caGY", "(BB)Lkotlin/ranges/UIntRange;", "until-J1ME1BU", "(II)Lkotlin/ranges/UIntRange;", "until-eb3DHEI", "(JJ)Lkotlin/ranges/ULongRange;", "until-5PvTz6A", "(SS)Lkotlin/ranges/UIntRange;", "coerceAtLeast", "minimumValue", "coerceAtLeast-J1ME1BU", "(II)I", "coerceAtLeast-eb3DHEI", "(JJ)J", "coerceAtLeast-Kr8caGY", "(BB)B", "coerceAtLeast-5PvTz6A", "(SS)S", "coerceAtMost", "maximumValue", "coerceAtMost-J1ME1BU", "coerceAtMost-eb3DHEI", "coerceAtMost-Kr8caGY", "coerceAtMost-5PvTz6A", "coerceIn", "coerceIn-WZ9TVnA", "(III)I", "coerceIn-sambcqE", "(JJJ)J", "coerceIn-b33U2AM", "(BBB)B", "coerceIn-VKSA0NQ", "(SSS)S", "range", "Lkotlin/ranges/ClosedRange;", "coerceIn-wuiCnnA", "(ILkotlin/ranges/ClosedRange;)I", "coerceIn-JPwROB0", "(JLkotlin/ranges/ClosedRange;)J", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/ranges/URangesKt")
/* loaded from: classes10.dex */
public class URangesKt___URangesKt {
    @SinceKotlin(version = "1.5")
    /* renamed from: coerceAtLeast-5PvTz6A, reason: not valid java name */
    public static final short m26549coerceAtLeast5PvTz6A(short s, short s2) {
        return Intrinsics.compare(s & UShort.MAX_VALUE, 65535 & s2) < 0 ? s2 : s;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceAtLeast-J1ME1BU, reason: not valid java name */
    public static final int m26550coerceAtLeastJ1ME1BU(int i, int i2) {
        return Integer.compareUnsigned(i, i2) < 0 ? i2 : i;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceAtLeast-Kr8caGY, reason: not valid java name */
    public static final byte m26551coerceAtLeastKr8caGY(byte b, byte b2) {
        return Intrinsics.compare(b & 255, b2 & 255) < 0 ? b2 : b;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceAtLeast-eb3DHEI, reason: not valid java name */
    public static final long m26552coerceAtLeasteb3DHEI(long j, long j2) {
        return Long.compareUnsigned(j, j2) < 0 ? j2 : j;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceAtMost-5PvTz6A, reason: not valid java name */
    public static final short m26553coerceAtMost5PvTz6A(short s, short s2) {
        return Intrinsics.compare(s & UShort.MAX_VALUE, 65535 & s2) > 0 ? s2 : s;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceAtMost-J1ME1BU, reason: not valid java name */
    public static final int m26554coerceAtMostJ1ME1BU(int i, int i2) {
        return Integer.compareUnsigned(i, i2) > 0 ? i2 : i;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceAtMost-Kr8caGY, reason: not valid java name */
    public static final byte m26555coerceAtMostKr8caGY(byte b, byte b2) {
        return Intrinsics.compare(b & 255, b2 & 255) > 0 ? b2 : b;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceAtMost-eb3DHEI, reason: not valid java name */
    public static final long m26556coerceAtMosteb3DHEI(long j, long j2) {
        return Long.compareUnsigned(j, j2) > 0 ? j2 : j;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceIn-JPwROB0, reason: not valid java name */
    public static final long m26557coerceInJPwROB0(long j, @NotNull ClosedRange<ULong> closedRange) {
        closedRange.getClass();
        if (closedRange instanceof ClosedFloatingPointRange) {
            return ((ULong) RangesKt___RangesKt.coerceIn(ULong.m25462boximpl(j), (ClosedFloatingPointRange<ULong>) closedRange)).getData();
        }
        if (!closedRange.isEmpty()) {
            return Long.compareUnsigned(j, closedRange.getStart().getData()) < 0 ? closedRange.getStart().getData() : Long.compareUnsigned(j, closedRange.getEndInclusive().getData()) > 0 ? closedRange.getEndInclusive().getData() : j;
        }
        PathKt$$ExternalSyntheticBUOutline0.m(46, "Cannot coerce value to an empty range: ", closedRange);
        return 0L;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceIn-VKSA0NQ, reason: not valid java name */
    public static final short m26558coerceInVKSA0NQ(short s, short s2, short s3) {
        int i = s2 & UShort.MAX_VALUE;
        int i2 = s3 & UShort.MAX_VALUE;
        if (Intrinsics.compare(i, i2) <= 0) {
            int i3 = 65535 & s;
            return Intrinsics.compare(i3, i) < 0 ? s2 : Intrinsics.compare(i3, i2) > 0 ? s3 : s;
        }
        StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
        sb.append((Object) UShort.m25619toStringimpl(s3));
        PathKt$$ExternalSyntheticBUOutline0.m$1(UShort.m25619toStringimpl(s2), sb);
        return (short) 0;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceIn-WZ9TVnA, reason: not valid java name */
    public static final int m26559coerceInWZ9TVnA(int i, int i2, int i3) {
        if (Integer.compareUnsigned(i2, i3) <= 0) {
            return Integer.compareUnsigned(i, i2) < 0 ? i2 : Integer.compareUnsigned(i, i3) > 0 ? i3 : i;
        }
        StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
        sb.append((Object) UInt.m25435toStringimpl(i3));
        PathKt$$ExternalSyntheticBUOutline0.m$1(UInt.m25435toStringimpl(i2), sb);
        return 0;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceIn-b33U2AM, reason: not valid java name */
    public static final byte m26560coerceInb33U2AM(byte b, byte b2, byte b3) {
        int i = b2 & 255;
        int i2 = b3 & 255;
        if (Intrinsics.compare(i, i2) <= 0) {
            int i3 = b & 255;
            return Intrinsics.compare(i3, i) < 0 ? b2 : Intrinsics.compare(i3, i2) > 0 ? b3 : b;
        }
        StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
        sb.append((Object) UByte.m25356toStringimpl(b3));
        PathKt$$ExternalSyntheticBUOutline0.m$1(UByte.m25356toStringimpl(b2), sb);
        return (byte) 0;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceIn-sambcqE, reason: not valid java name */
    public static final long m26561coerceInsambcqE(long j, long j2, long j3) {
        if (Long.compareUnsigned(j2, j3) <= 0) {
            return Long.compareUnsigned(j, j2) < 0 ? j2 : Long.compareUnsigned(j, j3) > 0 ? j3 : j;
        }
        StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
        sb.append((Object) ULong.m25514toStringimpl(j3));
        PathKt$$ExternalSyntheticBUOutline0.m$1(ULong.m25514toStringimpl(j2), sb);
        return 0L;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceIn-wuiCnnA, reason: not valid java name */
    public static final int m26562coerceInwuiCnnA(int i, @NotNull ClosedRange<UInt> closedRange) {
        closedRange.getClass();
        if (closedRange instanceof ClosedFloatingPointRange) {
            return ((UInt) RangesKt___RangesKt.coerceIn(UInt.m25383boximpl(i), (ClosedFloatingPointRange<UInt>) closedRange)).getData();
        }
        if (!closedRange.isEmpty()) {
            return Integer.compareUnsigned(i, closedRange.getStart().getData()) < 0 ? closedRange.getStart().getData() : Integer.compareUnsigned(i, closedRange.getEndInclusive().getData()) > 0 ? closedRange.getEndInclusive().getData() : i;
        }
        PathKt$$ExternalSyntheticBUOutline0.m(46, "Cannot coerce value to an empty range: ", closedRange);
        return 0;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: contains-68kG9v0, reason: not valid java name */
    public static final boolean m26563contains68kG9v0(@NotNull UIntRange uIntRange, byte b) {
        uIntRange.getClass();
        return uIntRange.m26536containsWZ4Q5Ns(UInt.m25389constructorimpl(b & 255));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: contains-GYNo2lE, reason: not valid java name */
    private static final boolean m26564containsGYNo2lE(ULongRange uLongRange, ULong uLong) {
        uLongRange.getClass();
        return uLong != null && uLongRange.m26545containsVKZWuLQ(uLong.getData());
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: contains-Gab390E, reason: not valid java name */
    public static final boolean m26565containsGab390E(@NotNull ULongRange uLongRange, int i) {
        uLongRange.getClass();
        return uLongRange.m26545containsVKZWuLQ(ULong.m25468constructorimpl(i & 4294967295L));
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: contains-ULb-yJY, reason: not valid java name */
    public static final boolean m26566containsULbyJY(@NotNull ULongRange uLongRange, byte b) {
        uLongRange.getClass();
        return uLongRange.m26545containsVKZWuLQ(ULong.m25468constructorimpl(b & 255));
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: contains-ZsK3CEQ, reason: not valid java name */
    public static final boolean m26567containsZsK3CEQ(@NotNull UIntRange uIntRange, short s) {
        uIntRange.getClass();
        return uIntRange.m26536containsWZ4Q5Ns(UInt.m25389constructorimpl(s & UShort.MAX_VALUE));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: contains-biwQdVI, reason: not valid java name */
    private static final boolean m26568containsbiwQdVI(UIntRange uIntRange, UInt uInt) {
        uIntRange.getClass();
        return uInt != null && uIntRange.m26536containsWZ4Q5Ns(uInt.getData());
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: contains-fz5IDCE, reason: not valid java name */
    public static final boolean m26569containsfz5IDCE(@NotNull UIntRange uIntRange, long j) {
        uIntRange.getClass();
        return ULong.m25468constructorimpl(j >>> 32) == 0 && uIntRange.m26536containsWZ4Q5Ns(UInt.m25389constructorimpl((int) j));
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: contains-uhHAxoY, reason: not valid java name */
    public static final boolean m26570containsuhHAxoY(@NotNull ULongRange uLongRange, short s) {
        uLongRange.getClass();
        return uLongRange.m26545containsVKZWuLQ(ULong.m25468constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    /* renamed from: downTo-5PvTz6A, reason: not valid java name */
    public static final UIntProgression m26571downTo5PvTz6A(short s, short s2) {
        return UIntProgression.INSTANCE.m26533fromClosedRangeNkh28Cs(UInt.m25389constructorimpl(s & UShort.MAX_VALUE), UInt.m25389constructorimpl(s2 & UShort.MAX_VALUE), -1);
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    /* renamed from: downTo-J1ME1BU, reason: not valid java name */
    public static final UIntProgression m26572downToJ1ME1BU(int i, int i2) {
        return UIntProgression.INSTANCE.m26533fromClosedRangeNkh28Cs(i, i2, -1);
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    /* renamed from: downTo-Kr8caGY, reason: not valid java name */
    public static final UIntProgression m26573downToKr8caGY(byte b, byte b2) {
        return UIntProgression.INSTANCE.m26533fromClosedRangeNkh28Cs(UInt.m25389constructorimpl(b & 255), UInt.m25389constructorimpl(b2 & 255), -1);
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    /* renamed from: downTo-eb3DHEI, reason: not valid java name */
    public static final ULongProgression m26574downToeb3DHEI(long j, long j2) {
        return ULongProgression.INSTANCE.m26542fromClosedRange7ftBX0g(j, j2, -1L);
    }

    @SinceKotlin(version = "1.7")
    public static final long first(@NotNull ULongProgression uLongProgression) {
        uLongProgression.getClass();
        if (!uLongProgression.isEmpty()) {
            return uLongProgression.getFirst();
        }
        PathKt$$ExternalSyntheticBUOutline0.m$1(uLongProgression);
        return 0L;
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final UInt firstOrNull(@NotNull UIntProgression uIntProgression) {
        uIntProgression.getClass();
        if (uIntProgression.isEmpty()) {
            return null;
        }
        return UInt.m25383boximpl(uIntProgression.getFirst());
    }

    @SinceKotlin(version = "1.7")
    public static final long last(@NotNull ULongProgression uLongProgression) {
        uLongProgression.getClass();
        if (!uLongProgression.isEmpty()) {
            return uLongProgression.getLast();
        }
        PathKt$$ExternalSyntheticBUOutline0.m$1(uLongProgression);
        return 0L;
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final UInt lastOrNull(@NotNull UIntProgression uIntProgression) {
        uIntProgression.getClass();
        if (uIntProgression.isEmpty()) {
            return null;
        }
        return UInt.m25383boximpl(uIntProgression.getLast());
    }

    @SinceKotlin(version = "1.5")
    public static final long random(@NotNull ULongRange uLongRange, @NotNull Random random) {
        uLongRange.getClass();
        random.getClass();
        try {
            return URandomKt.nextULong(random, uLongRange);
        } catch (IllegalArgumentException e) {
            PathKt$$ExternalSyntheticBUOutline0.m(e.getMessage());
            return 0L;
        }
    }

    @SinceKotlin(version = "1.5")
    @Nullable
    public static final UInt randomOrNull(@NotNull UIntRange uIntRange, @NotNull Random random) {
        uIntRange.getClass();
        random.getClass();
        if (uIntRange.isEmpty()) {
            return null;
        }
        return UInt.m25383boximpl(URandomKt.nextUInt(random, uIntRange));
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    public static final UIntProgression reversed(@NotNull UIntProgression uIntProgression) {
        uIntProgression.getClass();
        return UIntProgression.INSTANCE.m26533fromClosedRangeNkh28Cs(uIntProgression.getLast(), uIntProgression.getFirst(), -uIntProgression.getStep());
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    public static final ULongProgression step(@NotNull ULongProgression uLongProgression, long j) {
        uLongProgression.getClass();
        RangesKt__RangesKt.checkStepIsPositive(j > 0, Long.valueOf(j));
        ULongProgression.Companion companion = ULongProgression.INSTANCE;
        long first = uLongProgression.getFirst();
        long last = uLongProgression.getLast();
        if (uLongProgression.getStep() <= 0) {
            j = -j;
        }
        return companion.m26542fromClosedRange7ftBX0g(first, last, j);
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    /* renamed from: until-5PvTz6A, reason: not valid java name */
    public static final UIntRange m26575until5PvTz6A(short s, short s2) {
        return Intrinsics.compare(s2 & UShort.MAX_VALUE, 0) <= 0 ? UIntRange.INSTANCE.getEMPTY() : new UIntRange(UInt.m25389constructorimpl(s & UShort.MAX_VALUE), UInt.m25389constructorimpl(UInt.m25389constructorimpl(r3) - 1), null);
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    /* renamed from: until-J1ME1BU, reason: not valid java name */
    public static UIntRange m26576untilJ1ME1BU(int i, int i2) {
        return Integer.compareUnsigned(i2, 0) <= 0 ? UIntRange.INSTANCE.getEMPTY() : new UIntRange(i, UInt.m25389constructorimpl(i2 - 1), null);
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    /* renamed from: until-Kr8caGY, reason: not valid java name */
    public static final UIntRange m26577untilKr8caGY(byte b, byte b2) {
        return Intrinsics.compare(b2 & 255, 0) <= 0 ? UIntRange.INSTANCE.getEMPTY() : new UIntRange(UInt.m25389constructorimpl(b & 255), UInt.m25389constructorimpl(UInt.m25389constructorimpl(r3) - 1), null);
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    /* renamed from: until-eb3DHEI, reason: not valid java name */
    public static ULongRange m26578untileb3DHEI(long j, long j2) {
        return Long.compareUnsigned(j2, 0L) <= 0 ? ULongRange.INSTANCE.getEMPTY() : new ULongRange(j, ULong.m25468constructorimpl(j2 - ULong.m25468constructorimpl(1 & 4294967295L)), null);
    }

    @SinceKotlin(version = "1.7")
    public static final int first(@NotNull UIntProgression uIntProgression) {
        uIntProgression.getClass();
        if (!uIntProgression.isEmpty()) {
            return uIntProgression.getFirst();
        }
        PathKt$$ExternalSyntheticBUOutline0.m$1(uIntProgression);
        return 0;
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final ULong firstOrNull(@NotNull ULongProgression uLongProgression) {
        uLongProgression.getClass();
        if (uLongProgression.isEmpty()) {
            return null;
        }
        return ULong.m25462boximpl(uLongProgression.getFirst());
    }

    @SinceKotlin(version = "1.7")
    public static final int last(@NotNull UIntProgression uIntProgression) {
        uIntProgression.getClass();
        if (!uIntProgression.isEmpty()) {
            return uIntProgression.getLast();
        }
        PathKt$$ExternalSyntheticBUOutline0.m$1(uIntProgression);
        return 0;
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final ULong lastOrNull(@NotNull ULongProgression uLongProgression) {
        uLongProgression.getClass();
        if (uLongProgression.isEmpty()) {
            return null;
        }
        return ULong.m25462boximpl(uLongProgression.getLast());
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long random(ULongRange uLongRange) {
        uLongRange.getClass();
        return random(uLongRange, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.5")
    public static final int random(@NotNull UIntRange uIntRange, @NotNull Random random) {
        uIntRange.getClass();
        random.getClass();
        try {
            return URandomKt.nextUInt(random, uIntRange);
        } catch (IllegalArgumentException e) {
            PathKt$$ExternalSyntheticBUOutline0.m(e.getMessage());
            return 0;
        }
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final ULong randomOrNull(ULongRange uLongRange) {
        uLongRange.getClass();
        return randomOrNull(uLongRange, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    public static final ULongProgression reversed(@NotNull ULongProgression uLongProgression) {
        uLongProgression.getClass();
        return ULongProgression.INSTANCE.m26542fromClosedRange7ftBX0g(uLongProgression.getLast(), uLongProgression.getFirst(), -uLongProgression.getStep());
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final UInt randomOrNull(UIntRange uIntRange) {
        uIntRange.getClass();
        return randomOrNull(uIntRange, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int random(UIntRange uIntRange) {
        uIntRange.getClass();
        return random(uIntRange, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.5")
    @Nullable
    public static final ULong randomOrNull(@NotNull ULongRange uLongRange, @NotNull Random random) {
        uLongRange.getClass();
        random.getClass();
        if (uLongRange.isEmpty()) {
            return null;
        }
        return ULong.m25462boximpl(URandomKt.nextULong(random, uLongRange));
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    public static final UIntProgression step(@NotNull UIntProgression uIntProgression, int i) {
        uIntProgression.getClass();
        RangesKt__RangesKt.checkStepIsPositive(i > 0, Integer.valueOf(i));
        UIntProgression.Companion companion = UIntProgression.INSTANCE;
        int first = uIntProgression.getFirst();
        int last = uIntProgression.getLast();
        if (uIntProgression.getStep() <= 0) {
            i = -i;
        }
        return companion.m26533fromClosedRangeNkh28Cs(first, last, i);
    }
}
