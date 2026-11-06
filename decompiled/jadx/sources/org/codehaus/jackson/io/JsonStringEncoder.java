package org.codehaus.jackson.io;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.facebook.hermes.intl.Intl$$ExternalSyntheticBUOutline0;
import java.lang.ref.SoftReference;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.codehaus.jackson.util.ByteArrayBuilder;
import org.codehaus.jackson.util.CharTypes;
import org.codehaus.jackson.util.TextBuffer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class JsonStringEncoder {
    private static final int INT_0 = 48;
    private static final int INT_BACKSLASH = 92;
    private static final int INT_U = 117;
    private static final int SURR1_FIRST = 55296;
    private static final int SURR1_LAST = 56319;
    private static final int SURR2_FIRST = 56320;
    private static final int SURR2_LAST = 57343;
    protected ByteArrayBuilder _byteBuilder;
    protected final char[] _quoteBuffer = {'\\', 0, '0', '0', 0, 0};
    protected TextBuffer _textBuffer;
    private static final char[] HEX_CHARS = CharTypes.copyHexChars();
    private static final byte[] HEX_BYTES = CharTypes.copyHexBytes();
    protected static final ThreadLocal<SoftReference<JsonStringEncoder>> _threadEncoder = new ThreadLocal<>();

    private int _appendByteEscape(int i, int i2, ByteArrayBuilder byteArrayBuilder, int i3) {
        byteArrayBuilder.setCurrentSegmentLength(i3);
        byteArrayBuilder.append(92);
        if (i2 < 0) {
            byteArrayBuilder.append(117);
            if (i > 255) {
                byte[] bArr = HEX_BYTES;
                byteArrayBuilder.append(bArr[i >> 12]);
                byteArrayBuilder.append(bArr[(i >> 8) & 15]);
                i &= 255;
            } else {
                byteArrayBuilder.append(48);
                byteArrayBuilder.append(48);
            }
            byte[] bArr2 = HEX_BYTES;
            byteArrayBuilder.append(bArr2[i >> 4]);
            byteArrayBuilder.append(bArr2[i & 15]);
        } else {
            byteArrayBuilder.append((byte) i2);
        }
        return byteArrayBuilder.getCurrentSegmentLength();
    }

    private int _appendSingleEscape(int i, char[] cArr) {
        if (i >= 0) {
            cArr[1] = (char) i;
            return 2;
        }
        int i2 = -(i + 1);
        cArr[1] = AbstractJsonLexerKt.UNICODE_ESC;
        char[] cArr2 = HEX_CHARS;
        cArr[4] = cArr2[i2 >> 4];
        cArr[5] = cArr2[i2 & 15];
        return 6;
    }

    private int _convertSurrogate(int i, int i2) {
        if (i2 < 56320 || i2 > 57343) {
            Intl$$ExternalSyntheticBUOutline0.m("Broken surrogate pair: first char 0x", Integer.toHexString(i), ", second 0x", Integer.toHexString(i2), "; illegal combination");
            return 0;
        }
        return (i2 - 56320) + ((i - 55296) << 10) + 65536;
    }

    private void _throwIllegalSurrogate(int i) {
        if (i > 1114111) {
            throw new IllegalArgumentException(ParcelCompat$$ExternalSyntheticOutline0.m(") to output; max is 0x10FFFF as per RFC 4627", i, new StringBuilder("Illegal character point (0x")));
        }
        if (i < 55296) {
            throw new IllegalArgumentException(ParcelCompat$$ExternalSyntheticOutline0.m(") to output", i, new StringBuilder("Illegal character point (0x")));
        }
        if (i > 56319) {
            throw new IllegalArgumentException(ParcelCompat$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, i, new StringBuilder("Unmatched second part of surrogate pair (0x")));
        }
        throw new IllegalArgumentException(ParcelCompat$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, i, new StringBuilder("Unmatched first part of surrogate pair (0x")));
    }

    public static JsonStringEncoder getInstance() {
        ThreadLocal<SoftReference<JsonStringEncoder>> threadLocal = _threadEncoder;
        SoftReference<JsonStringEncoder> softReference = threadLocal.get();
        JsonStringEncoder jsonStringEncoder = softReference == null ? null : softReference.get();
        if (jsonStringEncoder != null) {
            return jsonStringEncoder;
        }
        JsonStringEncoder jsonStringEncoder2 = new JsonStringEncoder();
        threadLocal.set(new SoftReference<>(jsonStringEncoder2));
        return jsonStringEncoder2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] encodeAsUTF8(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.jackson.io.JsonStringEncoder.encodeAsUTF8(java.lang.String):byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r8 = r6 + 1;
        r6 = _appendSingleEscape(r2[r12.charAt(r6)], r11._quoteBuffer);
        r9 = r7 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if (r9 <= r1.length) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        r9 = r1.length - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r9 <= 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        java.lang.System.arraycopy(r11._quoteBuffer, 0, r1, r7, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        r1 = r0.finishCurrentSegment();
        r6 = r6 - r9;
        java.lang.System.arraycopy(r11._quoteBuffer, r9, r1, 0, r6);
        r7 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        java.lang.System.arraycopy(r11._quoteBuffer, 0, r1, r7, r6);
        r7 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public char[] quoteAsString(java.lang.String r12) {
        /*
            r11 = this;
            org.codehaus.jackson.util.TextBuffer r0 = r11._textBuffer
            if (r0 != 0) goto Lc
            org.codehaus.jackson.util.TextBuffer r0 = new org.codehaus.jackson.util.TextBuffer
            r1 = 0
            r0.<init>(r1)
            r11._textBuffer = r0
        Lc:
            char[] r1 = r0.emptyAndGetCurrentSegment()
            int[] r2 = org.codehaus.jackson.util.CharTypes.get7BitOutputEscapes()
            int r3 = r2.length
            int r4 = r12.length()
            r5 = 0
            r6 = r5
            r7 = r6
        L1c:
            if (r6 >= r4) goto L6c
        L1e:
            char r8 = r12.charAt(r6)
            if (r8 >= r3) goto L58
            r9 = r2[r8]
            if (r9 == 0) goto L58
            int r8 = r6 + 1
            char r6 = r12.charAt(r6)
            r6 = r2[r6]
            char[] r9 = r11._quoteBuffer
            int r6 = r11._appendSingleEscape(r6, r9)
            int r9 = r7 + r6
            int r10 = r1.length
            if (r9 <= r10) goto L50
            int r9 = r1.length
            int r9 = r9 - r7
            if (r9 <= 0) goto L44
            char[] r10 = r11._quoteBuffer
            java.lang.System.arraycopy(r10, r5, r1, r7, r9)
        L44:
            char[] r1 = r0.finishCurrentSegment()
            int r6 = r6 - r9
            char[] r7 = r11._quoteBuffer
            java.lang.System.arraycopy(r7, r9, r1, r5, r6)
            r7 = r6
            goto L56
        L50:
            char[] r10 = r11._quoteBuffer
            java.lang.System.arraycopy(r10, r5, r1, r7, r6)
            r7 = r9
        L56:
            r6 = r8
            goto L1c
        L58:
            int r9 = r1.length
            if (r7 < r9) goto L60
            char[] r1 = r0.finishCurrentSegment()
            r7 = r5
        L60:
            int r9 = r7 + 1
            r1[r7] = r8
            int r6 = r6 + 1
            if (r6 < r4) goto L6a
            r7 = r9
            goto L6c
        L6a:
            r7 = r9
            goto L1e
        L6c:
            r0.setCurrentLength(r7)
            char[] r11 = r0.contentsAsArray()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.jackson.io.JsonStringEncoder.quoteAsString(java.lang.String):char[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
    
        if (r5 < r2.length) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        r2 = r0.finishCurrentSegment();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        r7 = r4 + 1;
        r9 = r12.charAt(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004e, code lost:
    
        if (r9 > 127) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
    
        r5 = _appendByteEscape(r9, r6[r9], r0, r5);
        r2 = r0.getCurrentSegment();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        if (r9 > 2047) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
    
        r4 = r5 + 1;
        r2[r5] = (byte) ((r9 >> 6) | 192);
        r5 = (r9 & com.amazon.deecomms.common.Constants.DEFAULT_IMAGE_CHAR) | 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f4, code lost:
    
        if (r4 < r2.length) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f6, code lost:
    
        r2 = r0.finishCurrentSegment();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fb, code lost:
    
        r2[r4] = (byte) r5;
        r5 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0072, code lost:
    
        if (r9 < 55296) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0077, code lost:
    
        if (r9 <= 57343) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007d, code lost:
    
        if (r9 <= 56319) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007f, code lost:
    
        _throwIllegalSurrogate(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0082, code lost:
    
        if (r7 < r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0084, code lost:
    
        _throwIllegalSurrogate(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0087, code lost:
    
        r4 = r4 + 2;
        r6 = _convertSurrogate(r9, r12.charAt(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0094, code lost:
    
        if (r6 <= 1114111) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0096, code lost:
    
        _throwIllegalSurrogate(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0099, code lost:
    
        r7 = r5 + 1;
        r2[r5] = (byte) ((r6 >> 18) | 240);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a3, code lost:
    
        if (r7 < r2.length) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a5, code lost:
    
        r2 = r0.finishCurrentSegment();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00aa, code lost:
    
        r5 = r7 + 1;
        r2[r7] = (byte) (((r6 >> 12) & 63) | 128);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b6, code lost:
    
        if (r5 < r2.length) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b8, code lost:
    
        r2 = r0.finishCurrentSegment();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bd, code lost:
    
        r7 = r5 + 1;
        r2[r5] = (byte) (((r6 >> 6) & 63) | 128);
        r5 = (r6 & 63) | 128;
        r10 = r7;
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ce, code lost:
    
        r4 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d0, code lost:
    
        r4 = r5 + 1;
        r2[r5] = (byte) ((r9 >> '\f') | 224);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00da, code lost:
    
        if (r4 < r2.length) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00dc, code lost:
    
        r2 = r0.finishCurrentSegment();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e1, code lost:
    
        r2[r4] = (byte) (((r9 >> 6) & 63) | 128);
        r10 = r4 + 1;
        r5 = (r9 & com.amazon.deecomms.common.Constants.DEFAULT_IMAGE_CHAR) | 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] quoteAsUTF8(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.jackson.io.JsonStringEncoder.quoteAsUTF8(java.lang.String):byte[]");
    }
}
