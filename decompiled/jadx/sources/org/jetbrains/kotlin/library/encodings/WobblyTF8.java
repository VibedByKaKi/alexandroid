package org.jetbrains.kotlin.library.encodings;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amazon.deecomms.common.Constants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0019\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0014\u0010\u0011\u001a\u00020\u0010*\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0010H\u0002J\u001d\u0010\u0013\u001a\u00020\u0014*\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0010H\u0082\u0002J\u001d\u0010\u0013\u001a\u00020\u0014*\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0010H\u0082\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lorg/jetbrains/kotlin/library/encodings/WobblyTF8;", "", "()V", "EMPTY_BYTE_ARRAY", "", "EMPTY_STRING", "", "REPLACEMENT_CHAR", "", "decode", "array", "encode", TypedValues.Custom.S_STRING, "isValidContinuation", "", "byteN", "", "readByteAsInt", "index", "set", "", "value", "", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class WobblyTF8 {

    @NotNull
    private static final String EMPTY_STRING = "";
    private static final char REPLACEMENT_CHAR = 65533;

    @NotNull
    public static final WobblyTF8 INSTANCE = new WobblyTF8();

    @NotNull
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];

    private WobblyTF8() {
    }

    private final boolean isValidContinuation(int byteN) {
        return (byteN >>> 6) == 2;
    }

    private final int readByteAsInt(byte[] bArr, int i) {
        return bArr[i] & 255;
    }

    private final void set(byte[] bArr, int i, int i2) {
        bArr.getClass();
        bArr[i] = (byte) i2;
    }

    @NotNull
    public final String decode(@NotNull byte[] array) {
        int i;
        array.getClass();
        int length = array.length;
        if (length == 0) {
            return "";
        }
        char[] cArr = new char[length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i2 + 1;
            int readByteAsInt = readByteAsInt(array, i2);
            if ((readByteAsInt & 128) == 0) {
                set(cArr, i3, readByteAsInt);
                i3++;
                i2 = i4;
            } else if ((readByteAsInt >>> 5) == 6) {
                if (i4 < length) {
                    int readByteAsInt2 = readByteAsInt(array, i4);
                    if (isValidContinuation(readByteAsInt2)) {
                        i2 += 2;
                        i = i3 + 1;
                        set(cArr, i3, ((readByteAsInt & 31) << 6) | (readByteAsInt2 & 63));
                        i3 = i;
                    }
                }
                i2 = i4;
                i = i3 + 1;
                cArr[i3] = 65533;
                i3 = i;
            } else {
                if ((readByteAsInt >>> 4) == 14) {
                    if (i4 < length) {
                        int readByteAsInt3 = readByteAsInt(array, i4);
                        if (isValidContinuation(readByteAsInt3) && (i4 = i2 + 2) < length) {
                            int readByteAsInt4 = readByteAsInt(array, i4);
                            if (isValidContinuation(readByteAsInt4)) {
                                i2 += 3;
                                i = i3 + 1;
                                set(cArr, i3, ((readByteAsInt & 15) << 12) | ((readByteAsInt3 & 63) << 6) | (readByteAsInt4 & 63));
                                i3 = i;
                            }
                        }
                    }
                } else if ((readByteAsInt >>> 3) == 30 && i4 < length) {
                    int readByteAsInt5 = readByteAsInt(array, i4);
                    if (isValidContinuation(readByteAsInt5) && (i4 = i2 + 2) < length) {
                        int readByteAsInt6 = readByteAsInt(array, i4);
                        if (isValidContinuation(readByteAsInt6) && (i4 = i2 + 3) < length) {
                            int readByteAsInt7 = readByteAsInt(array, i4);
                            if (isValidContinuation(readByteAsInt7)) {
                                i2 += 4;
                                int i5 = ((readByteAsInt & 7) << 18) | ((readByteAsInt5 & 63) << 12) | ((readByteAsInt6 & 63) << 6) | (readByteAsInt7 & 63);
                                int i6 = i3 + 1;
                                cArr[i3] = Character.highSurrogate(i5);
                                i3 += 2;
                                cArr[i6] = Character.lowSurrogate(i5);
                            }
                        }
                    }
                }
                i2 = i4;
                i = i3 + 1;
                cArr[i3] = 65533;
                i3 = i;
            }
        }
        return length == i3 ? new String(cArr) : new String(cArr, 0, i3);
    }

    @NotNull
    public final byte[] encode(@NotNull String string) {
        string.getClass();
        int length = string.length();
        if (length == 0) {
            return EMPTY_BYTE_ARRAY;
        }
        int i = length * 3;
        byte[] bArr = new byte[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i2 + 1;
            char charAt = string.charAt(i2);
            if (Intrinsics.compare((int) charAt, 128) < 0) {
                set(bArr, i3, charAt);
                i3++;
            } else if (Intrinsics.compare((int) charAt, 2048) < 0) {
                int i5 = i3 + 1;
                set(bArr, i3, (charAt >>> 6) | 192);
                i3 += 2;
                set(bArr, i5, (charAt & Constants.DEFAULT_IMAGE_CHAR) | 128);
            } else {
                if (Character.isHighSurrogate(charAt) && i4 < length) {
                    char charAt2 = string.charAt(i4);
                    if (Character.isLowSurrogate(charAt2)) {
                        i2 += 2;
                        int codePoint = Character.toCodePoint(charAt, charAt2);
                        set(bArr, i3, (codePoint >>> 18) | 240);
                        set(bArr, i3 + 1, ((codePoint >>> 12) & 63) | 128);
                        int i6 = i3 + 3;
                        set(bArr, i3 + 2, ((codePoint >>> 6) & 63) | 128);
                        i3 += 4;
                        set(bArr, i6, (codePoint & 63) | 128);
                    }
                }
                set(bArr, i3, (charAt >>> '\f') | 224);
                int i7 = i3 + 2;
                set(bArr, i3 + 1, ((charAt >>> 6) & 63) | 128);
                i3 += 3;
                set(bArr, i7, (charAt & Constants.DEFAULT_IMAGE_CHAR) | 128);
            }
            i2 = i4;
        }
        return i == i3 ? bArr : Arrays.copyOf(bArr, i3);
    }

    private final void set(char[] cArr, int i, int i2) {
        cArr.getClass();
        cArr[i] = (char) i2;
    }
}
