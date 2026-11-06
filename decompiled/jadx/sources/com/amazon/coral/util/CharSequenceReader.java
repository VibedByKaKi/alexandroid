package com.amazon.coral.util;

import java.io.IOException;
import java.io.Reader;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class CharSequenceReader extends Reader {
    private final CharSequence cs;
    private int offset;

    public CharSequenceReader(CharSequence charSequence) {
        if (charSequence == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
        this.cs = charSequence;
        this.offset = 0;
    }

    public CharSequence getCharSequence() {
        return this.cs;
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        if (this.offset >= this.cs.length()) {
            return -1;
        }
        if (i2 < i || i + i2 > cArr.length) {
            Buffer$$ExternalSyntheticBUOutline0.m();
            return 0;
        }
        int min = Math.min(this.cs.length() - this.offset, i2);
        CharSequence charSequence = this.cs;
        if (charSequence instanceof String) {
            int i3 = this.offset;
            ((String) charSequence).getChars(i3, i3 + min, cArr, i);
            this.offset += min;
            return min;
        }
        if (charSequence instanceof StringBuilder) {
            int i4 = this.offset;
            ((StringBuilder) charSequence).getChars(i4, i4 + min, cArr, i);
            this.offset += min;
            return min;
        }
        for (int i5 = 0; i5 < min; i5++) {
            CharSequence charSequence2 = this.cs;
            int i6 = this.offset;
            this.offset = i6 + 1;
            cArr[i + i5] = charSequence2.charAt(i6);
        }
        return min;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }
}
