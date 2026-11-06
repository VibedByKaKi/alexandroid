package com.google.common.primitives;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import defpackage.a$$ExternalSyntheticOutline0;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import org.json.XML$$ExternalSyntheticBUOutline0;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes8.dex */
public final class UnsignedBytes {
    public static final byte MAX_POWER_OF_TWO = Byte.MIN_VALUE;
    public static final byte MAX_VALUE = -1;
    private static final int UNSIGNED_MASK = 255;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public static class LexicographicalComparatorHolder {
        static final String UNSAFE_COMPARATOR_NAME = LexicographicalComparatorHolder.class.getName().concat("$UnsafeComparator");
        static final Comparator<byte[]> BEST_COMPARATOR = getBestComparator();

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum PureJavaComparator implements Comparator<byte[]> {
            INSTANCE;

            @Override // java.util.Comparator
            public int compare(byte[] bArr, byte[] bArr2) {
                int min = Math.min(bArr.length, bArr2.length);
                for (int i = 0; i < min; i++) {
                    int compare = UnsignedBytes.compare(bArr[i], bArr2[i]);
                    if (compare != 0) {
                        return compare;
                    }
                }
                return bArr.length - bArr2.length;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @VisibleForTesting
        public enum UnsafeComparator implements Comparator<byte[]> {
            INSTANCE;

            static final boolean BIG_ENDIAN = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);
            static final int BYTE_ARRAY_BASE_OFFSET;
            static final Unsafe theUnsafe;

            static {
                Unsafe unsafe = getUnsafe();
                theUnsafe = unsafe;
                int arrayBaseOffset = unsafe.arrayBaseOffset(byte[].class);
                BYTE_ARRAY_BASE_OFFSET = arrayBaseOffset;
                if (!Objects.equals(System.getProperty("sun.arch.data.model"), "64") || arrayBaseOffset % 8 != 0 || unsafe.arrayIndexScale(byte[].class) != 1) {
                    throw new Error();
                }
            }

            private static Unsafe getUnsafe() {
                try {
                    try {
                        return Unsafe.getUnsafe();
                    } catch (PrivilegedActionException e) {
                        OnnxMap$$ExternalSyntheticBUOutline0.m("Could not initialize intrinsics", e.getCause());
                        return null;
                    }
                } catch (SecurityException unused) {
                    return (Unsafe) AccessController.doPrivileged(new UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator$$ExternalSyntheticLambda0());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ Unsafe lambda$getUnsafe$0() throws Exception {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }

            @Override // java.util.Comparator
            public int compare(byte[] bArr, byte[] bArr2) {
                int min = Math.min(bArr.length, bArr2.length);
                int i = min & (-8);
                int i2 = 0;
                while (i2 < i) {
                    Unsafe unsafe = theUnsafe;
                    int i3 = BYTE_ARRAY_BASE_OFFSET;
                    long j = i2;
                    long j2 = unsafe.getLong(bArr, i3 + j);
                    long j3 = unsafe.getLong(bArr2, i3 + j);
                    if (j2 != j3) {
                        if (BIG_ENDIAN) {
                            return Long.compareUnsigned(j2, j3);
                        }
                        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j2 ^ j3) & (-8);
                        return ((int) ((j2 >>> numberOfTrailingZeros) & 255)) - ((int) (255 & (j3 >>> numberOfTrailingZeros)));
                    }
                    i2 += 8;
                }
                while (i2 < min) {
                    int compare = UnsignedBytes.compare(bArr[i2], bArr2[i2]);
                    if (compare != 0) {
                        return compare;
                    }
                    i2++;
                }
                return bArr.length - bArr2.length;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (sun.misc.Unsafe version)";
            }
        }

        public static Comparator<byte[]> getBestComparator() {
            try {
                Object[] enumConstants = Class.forName(UNSAFE_COMPARATOR_NAME).getEnumConstants();
                Objects.requireNonNull(enumConstants);
                return (Comparator) enumConstants[0];
            } catch (Throwable unused) {
                return UnsignedBytes.lexicographicalComparatorJavaImpl();
            }
        }
    }

    private UnsignedBytes() {
    }

    @CanIgnoreReturnValue
    public static byte checkedCast(long j) {
        Preconditions.checkArgument((j >> 8) == 0, "out of range: %s", j);
        return (byte) j;
    }

    public static int compare(byte b, byte b2) {
        return toInt(b) - toInt(b2);
    }

    private static byte flip(byte b) {
        return (byte) (b ^ 128);
    }

    public static String join(String str, byte... bArr) {
        Preconditions.checkNotNull(str);
        if (bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder((str.length() + 3) * bArr.length);
        sb.append(toInt(bArr[0]));
        for (int i = 1; i < bArr.length; i++) {
            sb.append(str);
            sb.append(toString(bArr[i]));
        }
        return sb.toString();
    }

    public static Comparator<byte[]> lexicographicalComparator() {
        return LexicographicalComparatorHolder.BEST_COMPARATOR;
    }

    @VisibleForTesting
    public static Comparator<byte[]> lexicographicalComparatorJavaImpl() {
        return LexicographicalComparatorHolder.PureJavaComparator.INSTANCE;
    }

    public static byte max(byte... bArr) {
        Preconditions.checkArgument(bArr.length > 0);
        int i = toInt(bArr[0]);
        for (int i2 = 1; i2 < bArr.length; i2++) {
            int i3 = toInt(bArr[i2]);
            if (i3 > i) {
                i = i3;
            }
        }
        return (byte) i;
    }

    public static byte min(byte... bArr) {
        Preconditions.checkArgument(bArr.length > 0);
        int i = toInt(bArr[0]);
        for (int i2 = 1; i2 < bArr.length; i2++) {
            int i3 = toInt(bArr[i2]);
            if (i3 < i) {
                i = i3;
            }
        }
        return (byte) i;
    }

    @CanIgnoreReturnValue
    public static byte parseUnsignedByte(String str, int i) {
        int parseInt = Integer.parseInt((String) Preconditions.checkNotNull(str), i);
        if ((parseInt >> 8) == 0) {
            return (byte) parseInt;
        }
        XML$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m(parseInt, "out of range: "));
        return (byte) 0;
    }

    public static byte saturatedCast(long j) {
        if (j > toInt((byte) -1)) {
            return (byte) -1;
        }
        if (j < 0) {
            return (byte) 0;
        }
        return (byte) j;
    }

    public static void sort(byte[] bArr, int i, int i2) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkPositionIndexes(i, i2, bArr.length);
        for (int i3 = i; i3 < i2; i3++) {
            bArr[i3] = flip(bArr[i3]);
        }
        Arrays.sort(bArr, i, i2);
        while (i < i2) {
            bArr[i] = flip(bArr[i]);
            i++;
        }
    }

    public static void sortDescending(byte[] bArr, int i, int i2) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkPositionIndexes(i, i2, bArr.length);
        for (int i3 = i; i3 < i2; i3++) {
            bArr[i3] = (byte) (bArr[i3] ^ Byte.MAX_VALUE);
        }
        Arrays.sort(bArr, i, i2);
        while (i < i2) {
            bArr[i] = (byte) (bArr[i] ^ Byte.MAX_VALUE);
            i++;
        }
    }

    public static int toInt(byte b) {
        return b & 255;
    }

    public static String toString(byte b, int i) {
        Preconditions.checkArgument(i >= 2 && i <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i);
        return Integer.toString(toInt(b), i);
    }

    public static String toString(byte b) {
        return toString(b, 10);
    }

    @CanIgnoreReturnValue
    public static byte parseUnsignedByte(String str) {
        return parseUnsignedByte(str, 10);
    }

    public static void sortDescending(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        sortDescending(bArr, 0, bArr.length);
    }

    public static void sort(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        sort(bArr, 0, bArr.length);
    }
}
