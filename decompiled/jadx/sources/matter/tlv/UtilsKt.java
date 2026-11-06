package matter.tlv;

import androidx.collection.SieveCacheKt;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\t\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\u0010\u0005\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\u001b\u0010\u0005\u001a\u00020\u0002*\u00020\t2\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\u0005\u001a\u00020\u0002*\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0005\u001a\u00020\u0002*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0005\u001a\u00020\u0002*\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0014\u0010\u0015\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0001H\u0000\u001a\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\f\u0010\u001b\u001a\u00020\u001c*\u00020\u001dH\u0000¨\u0006\u001e"}, d2 = {"fromLittleEndianToLong", "", "", "isSigned", "", "toByteArrayLittleEndian", "", "numBytes", "", "Lkotlin/UByte;", "toByteArrayLittleEndian-0ky7B_Q", "(BS)[B", "Lkotlin/UShort;", "toByteArrayLittleEndian-vckuEUM", "(SS)[B", "Lkotlin/UInt;", "toByteArrayLittleEndian-qim9Vi0", "(IS)[B", "Lkotlin/ULong;", "toByteArrayLittleEndian-4PLdz1A", "(JS)[B", "toLittleEndianBytes", "signedIntSize", "value", "unsignedIntSize", "unsignedIntSize-VKZWuLQ", "(J)S", "toBinary", "", "", "AlexaMobileAndroidMatter_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nutils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utils.kt\nmatter/tlv/UtilsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,65:1\n13433#2,7:66\n*S KotlinDebug\n*F\n+ 1 utils.kt\nmatter/tlv/UtilsKt\n*L\n23#1:66,7\n*E\n"})
/* loaded from: classes10.dex */
public final class UtilsKt {
    public static final long fromLittleEndianToLong(@NotNull byte[] bArr, boolean z) {
        bArr.getClass();
        int lastIndex = ArraysKt.getLastIndex(bArr);
        long j = 0;
        while (lastIndex >= 0) {
            byte b = bArr[lastIndex];
            j = (j << 8) | ((lastIndex == ArraysKt.getLastIndex(bArr) && z) ? b : b & 255);
            lastIndex--;
        }
        return j;
    }

    public static /* synthetic */ long fromLittleEndianToLong$default(byte[] bArr, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return fromLittleEndianToLong(bArr, z);
    }

    public static final short signedIntSize(long j) {
        if (-128 <= j && j <= 127) {
            return (short) 1;
        }
        if (-32768 > j || j > 32767) {
            return (SieveCacheKt.NodeMetaAndPreviousMask > j || j > SieveCacheKt.NodeLinkMask) ? (short) 8 : (short) 4;
        }
        return (short) 2;
    }

    @NotNull
    public static final String toBinary(byte b) {
        String binaryString = Integer.toBinaryString(b & 255);
        binaryString.getClass();
        return binaryString;
    }

    @NotNull
    public static final byte[] toByteArrayLittleEndian(@NotNull Number number, short s) {
        number.getClass();
        return toLittleEndianBytes(number.longValue(), s);
    }

    @NotNull
    /* renamed from: toByteArrayLittleEndian-0ky7B_Q, reason: not valid java name */
    public static final byte[] m27023toByteArrayLittleEndian0ky7B_Q(byte b, short s) {
        return toLittleEndianBytes(b & 255, s);
    }

    @NotNull
    /* renamed from: toByteArrayLittleEndian-4PLdz1A, reason: not valid java name */
    public static final byte[] m27024toByteArrayLittleEndian4PLdz1A(long j, short s) {
        return toLittleEndianBytes(j, s);
    }

    @NotNull
    /* renamed from: toByteArrayLittleEndian-qim9Vi0, reason: not valid java name */
    public static final byte[] m27025toByteArrayLittleEndianqim9Vi0(int i, short s) {
        return toLittleEndianBytes(i & 4294967295L, s);
    }

    @NotNull
    /* renamed from: toByteArrayLittleEndian-vckuEUM, reason: not valid java name */
    public static final byte[] m27026toByteArrayLittleEndianvckuEUM(short s, short s2) {
        return toLittleEndianBytes(s & WebSocketProtocol.PAYLOAD_SHORT_MAX, s2);
    }

    private static final byte[] toLittleEndianBytes(long j, short s) {
        byte[] bArr = new byte[s];
        for (int i = 0; i < s; i++) {
            bArr[i] = (byte) (j >> (i * 8));
        }
        return bArr;
    }

    /* renamed from: unsignedIntSize-VKZWuLQ, reason: not valid java name */
    public static final short m27027unsignedIntSizeVKZWuLQ(long j) {
        long j2 = -1;
        if (Long.compareUnsigned(j, ULong.m25468constructorimpl(255 & j2)) <= 0) {
            return (short) 1;
        }
        if (Long.compareUnsigned(j, ULong.m25468constructorimpl(WebSocketProtocol.PAYLOAD_SHORT_MAX & j2)) <= 0) {
            return (short) 2;
        }
        return Long.compareUnsigned(j, ULong.m25468constructorimpl(j2 & 4294967295L)) <= 0 ? (short) 4 : (short) 8;
    }
}
