package kotlin;

import kotlin.internal.InlineOnly;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b¢\u0006\u0002\u0010\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\u0005\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u0006H\u0087\b¢\u0006\u0002\u0010\u0007\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\bH\u0087\b¢\u0006\u0002\u0010\t\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\nH\u0087\b¢\u0006\u0002\u0010\u000b\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\fH\u0087\b¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"toULong", "Lkotlin/ULong;", "", "(B)J", "", "(S)J", "", "(I)J", "", "(J)J", "", "(F)J", "", "(D)J", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ULongKt {
    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long toULong(byte b) {
        return ULong.m25468constructorimpl(b);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long toULong(short s) {
        return ULong.m25468constructorimpl(s);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long toULong(int i) {
        return ULong.m25468constructorimpl(i);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long toULong(long j) {
        return ULong.m25468constructorimpl(j);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long toULong(float f) {
        return UnsignedKt.doubleToULong(f);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long toULong(double d) {
        return UnsignedKt.doubleToULong(d);
    }
}
