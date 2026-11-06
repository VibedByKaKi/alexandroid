package kotlinx.coroutines.io.internal;

import androidx.exifinterface.media.ExifInterface;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00010\nH\u0080\b\u001a/\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\f\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\r0\nH\u0080\b\u001a=\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u00100\u000f\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\b\"\u0006\b\u0001\u0010\u0010\u0018\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u00100\nH\u0080\b\u001a \u0010\u0011\u001a\u00020\u0012*\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0016\u001a\u00020\u0001*\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0012H\u0000\u001a\f\u0010\u0018\u001a\u00020\u0019*\u00020\u0012H\u0000\u001a\u001e\u0010\u001a\u001a\u00020\u0001*\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u0001H\u0000\u001a\u001e\u0010\u001d\u001a\u00020\u0001*\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u0001H\u0000\u001a\u001e\u0010\u001f\u001a\u00020\u0019*\u00020\u00122\u0006\u0010 \u001a\u00020\u00122\b\b\u0002\u0010!\u001a\u00020\u0001H\u0000¨\u0006\""}, d2 = {"getIOIntProperty", "", "name", "", "default", "intUpdater", "Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;", "Owner", "", "p", "Lkotlin/reflect/KProperty1;", "longUpdater", "Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;", "", "updater", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", ExifInterface.GPS_DIRECTION_TRUE, "asByteBuffer", "Ljava/nio/ByteBuffer;", "", "offset", "length", "indexOfPartial", "sub", "isEmpty", "", "putAtMost", "src", "n", "putLimited", "limit", "startsWith", "prefix", "prefixSkip", "kotlinx-coroutines-io"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes10.dex */
public final class UtilsKt {
    @NotNull
    public static final ByteBuffer asByteBuffer(@NotNull byte[] bArr, int i, int i2) {
        bArr.getClass();
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, i2);
        wrap.getClass();
        return wrap;
    }

    @NotNull
    public static /* synthetic */ ByteBuffer asByteBuffer$default(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        return asByteBuffer(bArr, i, i2);
    }

    public static final int getIOIntProperty(@NotNull String str, int i) {
        String str2;
        Integer intOrNull;
        str.getClass();
        try {
            str2 = System.getProperty("kotlinx.coroutines.io." + str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        return (str2 == null || (intOrNull = kotlin.text.StringsKt.toIntOrNull(str2)) == null) ? i : intOrNull.intValue();
    }

    public static final int indexOfPartial(@NotNull ByteBuffer byteBuffer, @NotNull ByteBuffer byteBuffer2) {
        byteBuffer.getClass();
        byteBuffer2.getClass();
        int position = byteBuffer2.position();
        int remaining = byteBuffer2.remaining();
        byte b = byteBuffer2.get(position);
        int limit = byteBuffer.limit();
        loop0: for (int position2 = byteBuffer.position(); position2 < limit; position2++) {
            if (byteBuffer.get(position2) == b) {
                for (int i = 1; i < remaining; i++) {
                    int i2 = position2 + i;
                    if (i2 == limit) {
                        break loop0;
                    }
                    if (byteBuffer.get(i2) != byteBuffer2.get(position + i)) {
                        break;
                    }
                }
                return position2 - byteBuffer.position();
            }
        }
        return -1;
    }

    private static final <Owner> AtomicIntegerFieldUpdater<Owner> intUpdater(KProperty1<Owner, Integer> kProperty1) {
        Intrinsics.reifiedOperationMarker(4, "Owner");
        AtomicIntegerFieldUpdater<Owner> newUpdater = AtomicIntegerFieldUpdater.newUpdater(Object.class, kProperty1.getName());
        newUpdater.getClass();
        return newUpdater;
    }

    public static final boolean isEmpty(@NotNull ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        return !byteBuffer.hasRemaining();
    }

    private static final <Owner> AtomicLongFieldUpdater<Owner> longUpdater(KProperty1<Owner, Long> kProperty1) {
        Intrinsics.reifiedOperationMarker(4, "Owner");
        AtomicLongFieldUpdater<Owner> newUpdater = AtomicLongFieldUpdater.newUpdater(Object.class, kProperty1.getName());
        newUpdater.getClass();
        return newUpdater;
    }

    public static final int putAtMost(@NotNull ByteBuffer byteBuffer, @NotNull ByteBuffer byteBuffer2, int i) {
        byteBuffer.getClass();
        byteBuffer2.getClass();
        int remaining = byteBuffer.remaining();
        int remaining2 = byteBuffer2.remaining();
        if (remaining2 <= remaining && remaining2 <= i) {
            byteBuffer.put(byteBuffer2);
            return remaining2;
        }
        int min = Math.min(remaining, Math.min(remaining2, i));
        int i2 = 1;
        if (1 <= min) {
            while (true) {
                byteBuffer.put(byteBuffer2.get());
                if (i2 == min) {
                    break;
                }
                i2++;
            }
        }
        return min;
    }

    public static /* synthetic */ int putAtMost$default(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = byteBuffer2.remaining();
        }
        return putAtMost(byteBuffer, byteBuffer2, i);
    }

    public static final int putLimited(@NotNull ByteBuffer byteBuffer, @NotNull ByteBuffer byteBuffer2, int i) {
        byteBuffer.getClass();
        byteBuffer2.getClass();
        return putAtMost(byteBuffer, byteBuffer2, i - byteBuffer2.position());
    }

    public static /* synthetic */ int putLimited$default(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = byteBuffer.limit();
        }
        return putLimited(byteBuffer, byteBuffer2, i);
    }

    public static final boolean startsWith(@NotNull ByteBuffer byteBuffer, @NotNull ByteBuffer byteBuffer2, int i) {
        byteBuffer.getClass();
        byteBuffer2.getClass();
        int min = Math.min(byteBuffer.remaining(), byteBuffer2.remaining() - i);
        if (min <= 0) {
            return false;
        }
        int position = byteBuffer.position();
        int position2 = byteBuffer2.position() + i;
        for (int i2 = 0; i2 < min; i2++) {
            if (byteBuffer.get(position + i2) != byteBuffer2.get(position2 + i2)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean startsWith$default(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return startsWith(byteBuffer, byteBuffer2, i);
    }

    private static final <Owner, T> AtomicReferenceFieldUpdater<Owner, T> updater(KProperty1<Owner, ? extends T> kProperty1) {
        Intrinsics.reifiedOperationMarker(4, "Owner");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        AtomicReferenceFieldUpdater<Owner, T> newUpdater = AtomicReferenceFieldUpdater.newUpdater(Object.class, Object.class, kProperty1.getName());
        newUpdater.getClass();
        return newUpdater;
    }
}
