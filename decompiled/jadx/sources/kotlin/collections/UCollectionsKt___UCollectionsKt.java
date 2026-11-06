package kotlin.collections;

import com.android.tools.r8.RecordTag;
import java.util.Collection;
import java.util.Iterator;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0007\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0002\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0002\u0010\b\u001a\u0017\u0010\t\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u000b0\u0002H\u0007¢\u0006\u0002\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u000f0\u0002H\u0007¢\u0006\u0002\u0010\u0010\u001a\u0019\u0010\u0011\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0011\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0011\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0007¢\u0006\u0004\b\u0017\u0010\u0014\u001a\u0019\u0010\u0011\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0007¢\u0006\u0004\b\u0018\u0010\u0014¨\u0006\u0019"}, d2 = {"toUByteArray", "Lkotlin/UByteArray;", "", "Lkotlin/UByte;", "(Ljava/util/Collection;)[B", "toUIntArray", "Lkotlin/UIntArray;", "Lkotlin/UInt;", "(Ljava/util/Collection;)[I", "toULongArray", "Lkotlin/ULongArray;", "Lkotlin/ULong;", "(Ljava/util/Collection;)[J", "toUShortArray", "Lkotlin/UShortArray;", "Lkotlin/UShort;", "(Ljava/util/Collection;)[S", "sum", "", "sumOfUInt", "(Ljava/lang/Iterable;)I", "sumOfULong", "(Ljava/lang/Iterable;)J", "sumOfUByte", "sumOfUShort", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/UCollectionsKt")
/* loaded from: classes10.dex */
class UCollectionsKt___UCollectionsKt {
    @SinceKotlin(version = "1.5")
    @JvmName(name = "sumOfUByte")
    public static final int sumOfUByte(@NotNull Iterable<UByte> iterable) {
        iterable.getClass();
        Iterator<UByte> it2 = iterable.iterator();
        int i = 0;
        while (it2.hasNext()) {
            i = UInt.m25389constructorimpl(UInt.m25389constructorimpl(it2.next().getData() & 255) + i);
        }
        return i;
    }

    @SinceKotlin(version = "1.5")
    @JvmName(name = "sumOfUInt")
    public static final int sumOfUInt(@NotNull Iterable<UInt> iterable) {
        iterable.getClass();
        Iterator<UInt> it2 = iterable.iterator();
        int i = 0;
        while (it2.hasNext()) {
            i = RecordTag.m(it2.next(), i);
        }
        return i;
    }

    @SinceKotlin(version = "1.5")
    @JvmName(name = "sumOfULong")
    public static final long sumOfULong(@NotNull Iterable<ULong> iterable) {
        iterable.getClass();
        Iterator<ULong> it2 = iterable.iterator();
        long j = 0;
        while (it2.hasNext()) {
            j = ULong.m25468constructorimpl(it2.next().getData() + j);
        }
        return j;
    }

    @SinceKotlin(version = "1.5")
    @JvmName(name = "sumOfUShort")
    public static final int sumOfUShort(@NotNull Iterable<UShort> iterable) {
        iterable.getClass();
        Iterator<UShort> it2 = iterable.iterator();
        int i = 0;
        while (it2.hasNext()) {
            i = UInt.m25389constructorimpl(UInt.m25389constructorimpl(it2.next().getData() & UShort.MAX_VALUE) + i);
        }
        return i;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final byte[] toUByteArray(@NotNull Collection<UByte> collection) {
        collection.getClass();
        byte[] m25364constructorimpl = UByteArray.m25364constructorimpl(collection.size());
        Iterator<UByte> it2 = collection.iterator();
        int i = 0;
        while (it2.hasNext()) {
            UByteArray.m25375setVurrAj0(m25364constructorimpl, i, it2.next().getData());
            i++;
        }
        return m25364constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final int[] toUIntArray(@NotNull Collection<UInt> collection) {
        collection.getClass();
        int[] m25443constructorimpl = UIntArray.m25443constructorimpl(collection.size());
        Iterator<UInt> it2 = collection.iterator();
        int i = 0;
        while (it2.hasNext()) {
            UIntArray.m25454setVXSXFK8(m25443constructorimpl, i, it2.next().getData());
            i++;
        }
        return m25443constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final long[] toULongArray(@NotNull Collection<ULong> collection) {
        collection.getClass();
        long[] m25522constructorimpl = ULongArray.m25522constructorimpl(collection.size());
        Iterator<ULong> it2 = collection.iterator();
        int i = 0;
        while (it2.hasNext()) {
            ULongArray.m25533setk8EXiF4(m25522constructorimpl, i, it2.next().getData());
            i++;
        }
        return m25522constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final short[] toUShortArray(@NotNull Collection<UShort> collection) {
        collection.getClass();
        short[] m25627constructorimpl = UShortArray.m25627constructorimpl(collection.size());
        Iterator<UShort> it2 = collection.iterator();
        int i = 0;
        while (it2.hasNext()) {
            UShortArray.m25638set01HTLdE(m25627constructorimpl, i, it2.next().getData());
            i++;
        }
        return m25627constructorimpl;
    }
}
