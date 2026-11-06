package com.google.common.escape;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtCompatible
/* loaded from: classes8.dex */
public abstract class CharEscaper extends Escaper {
    private static final int DEST_PAD_MULTIPLIER = 2;

    private static char[] growBuffer(char[] cArr, int i, int i2) {
        if (i2 < 0) {
            Buffer$$ExternalSyntheticBUOutline0.m((Object) "Cannot increase internal buffer any further");
            return null;
        }
        char[] cArr2 = new char[i2];
        if (i > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i);
        }
        return cArr2;
    }

    @Override // com.google.common.escape.Escaper
    public String escape(String str) {
        Preconditions.checkNotNull(str);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (escape(str.charAt(i)) != null) {
                return escapeSlow(str, i);
            }
        }
        return str;
    }

    public abstract char[] escape(char c);

    public final String escapeSlow(String str, int i) {
        int length = str.length();
        char[] charBufferFromThreadLocal = Platform.charBufferFromThreadLocal();
        int length2 = charBufferFromThreadLocal.length;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            char[] escape = escape(str.charAt(i));
            if (escape != null) {
                int length3 = escape.length;
                int i4 = i - i2;
                int i5 = i3 + i4;
                int i6 = i5 + length3;
                if (length2 < i6) {
                    length2 = AppLaunchChecker$$ExternalSyntheticOutline0.m(length, i, 2, i6);
                    charBufferFromThreadLocal = growBuffer(charBufferFromThreadLocal, i3, length2);
                }
                if (i4 > 0) {
                    str.getChars(i2, i, charBufferFromThreadLocal, i3);
                    i3 = i5;
                }
                if (length3 > 0) {
                    System.arraycopy(escape, 0, charBufferFromThreadLocal, i3, length3);
                    i3 += length3;
                }
                i2 = i + 1;
            }
            i++;
        }
        int i7 = length - i2;
        if (i7 > 0) {
            int i8 = i7 + i3;
            if (length2 < i8) {
                charBufferFromThreadLocal = growBuffer(charBufferFromThreadLocal, i3, i8);
            }
            str.getChars(i2, length, charBufferFromThreadLocal, i3);
            i3 = i8;
        }
        return new String(charBufferFromThreadLocal, 0, i3);
    }
}
