package kotlin.io;

import io.ktor.http.auth.HttpAuthHeader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\tH\u0002J\b\u0010\u001d\u001a\u00020\u0005H\u0002J\u0018\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010#\u001a\u00020\"H\u0002J\b\u0010$\u001a\u00020\"H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00060\u0013j\u0002`\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lkotlin/io/LineReader;", "", "<init>", "()V", "BUFFER_SIZE", "", "decoder", "Ljava/nio/charset/CharsetDecoder;", "directEOL", "", "bytes", "", "chars", "", "byteBuf", "Ljava/nio/ByteBuffer;", "charBuf", "Ljava/nio/CharBuffer;", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "readLine", "", "inputStream", "Ljava/io/InputStream;", HttpAuthHeader.Parameters.Charset, "Ljava/nio/charset/Charset;", "decode", "endOfInput", "compactBytes", "decodeEndOfInput", "nBytes", "nChars", "updateCharset", "", "resetAll", "trimStringBuilder", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConsole.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Console.kt\nkotlin/io/LineReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,302:1\n1#2:303\n*E\n"})
/* loaded from: classes10.dex */
public final class LineReader {
    private static final int BUFFER_SIZE = 32;

    @NotNull
    public static final LineReader INSTANCE = new LineReader();

    @NotNull
    private static final ByteBuffer byteBuf;

    @NotNull
    private static final byte[] bytes;

    @NotNull
    private static final CharBuffer charBuf;

    @NotNull
    private static final char[] chars;
    private static CharsetDecoder decoder;
    private static boolean directEOL;

    @NotNull
    private static final StringBuilder sb;

    static {
        byte[] bArr = new byte[32];
        bytes = bArr;
        char[] cArr = new char[32];
        chars = cArr;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.getClass();
        byteBuf = wrap;
        CharBuffer wrap2 = CharBuffer.wrap(cArr);
        wrap2.getClass();
        charBuf = wrap2;
        sb = new StringBuilder();
    }

    private LineReader() {
    }

    private final int compactBytes() {
        ByteBuffer byteBuffer = byteBuf;
        byteBuffer.compact();
        int position = byteBuffer.position();
        byteBuffer.position(0);
        return position;
    }

    private final int decode(boolean endOfInput) {
        while (true) {
            CharsetDecoder charsetDecoder = decoder;
            if (charsetDecoder == null) {
                Intrinsics.throwUninitializedPropertyAccessException("decoder");
                charsetDecoder = null;
            }
            ByteBuffer byteBuffer = byteBuf;
            CharBuffer charBuffer = charBuf;
            CoderResult decode = charsetDecoder.decode(byteBuffer, charBuffer, endOfInput);
            decode.getClass();
            if (decode.isError()) {
                resetAll();
                decode.throwException();
            }
            int position = charBuffer.position();
            if (!decode.isOverflow()) {
                return position;
            }
            StringBuilder sb2 = sb;
            char[] cArr = chars;
            int i = position - 1;
            sb2.append(cArr, 0, i);
            charBuffer.position(0);
            charBuffer.limit(32);
            charBuffer.put(cArr[i]);
        }
    }

    private final int decodeEndOfInput(int nBytes, int nChars) {
        ByteBuffer byteBuffer = byteBuf;
        byteBuffer.limit(nBytes);
        charBuf.position(nChars);
        int decode = decode(true);
        CharsetDecoder charsetDecoder = decoder;
        if (charsetDecoder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        byteBuffer.position(0);
        return decode;
    }

    private final void resetAll() {
        CharsetDecoder charsetDecoder = decoder;
        if (charsetDecoder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        byteBuf.position(0);
        sb.setLength(0);
    }

    private final void trimStringBuilder() {
        StringBuilder sb2 = sb;
        sb2.setLength(32);
        sb2.trimToSize();
    }

    private final void updateCharset(Charset charset) {
        CharsetDecoder newDecoder = charset.newDecoder();
        newDecoder.getClass();
        decoder = newDecoder;
        ByteBuffer byteBuffer = byteBuf;
        byteBuffer.clear();
        CharBuffer charBuffer = charBuf;
        charBuffer.clear();
        byteBuffer.put((byte) 10);
        byteBuffer.flip();
        CharsetDecoder charsetDecoder = decoder;
        if (charsetDecoder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("decoder");
            charsetDecoder = null;
        }
        boolean z = false;
        charsetDecoder.decode(byteBuffer, charBuffer, false);
        if (charBuffer.position() == 1 && charBuffer.get(0) == '\n') {
            z = true;
        }
        directEOL = z;
        resetAll();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (r10 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        r0 = kotlin.io.LineReader.chars;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        if (r0[r10 - 1] != '\n') goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        r1 = r10 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
    
        if (r1 <= 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (r0[r10 - 2] != '\r') goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
    
        r10 = r10 - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008d, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
    
        r0 = kotlin.io.LineReader.sb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
    
        if (r0.length() != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
    
        return new java.lang.String(kotlin.io.LineReader.chars, 0, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009f, code lost:
    
        r0.append(kotlin.io.LineReader.chars, 0, r10);
        r10 = r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ac, code lost:
    
        if (r0.length() <= 32) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ae, code lost:
    
        trimStringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b1, code lost:
    
        r0.setLength(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b5, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0.charset(), r11) == false) goto L11;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.String readLine(@org.jetbrains.annotations.NotNull java.io.InputStream r10, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            r10.getClass()     // Catch: java.lang.Throwable -> L15
            r11.getClass()     // Catch: java.lang.Throwable -> L15
            java.nio.charset.CharsetDecoder r0 = kotlin.io.LineReader.decoder     // Catch: java.lang.Throwable -> L15
            r1 = 0
            if (r0 == 0) goto L22
            if (r0 != 0) goto L18
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)     // Catch: java.lang.Throwable -> L15
            r0 = r1
            goto L18
        L15:
            r10 = move-exception
            goto Lbc
        L18:
            java.nio.charset.Charset r0 = r0.charset()     // Catch: java.lang.Throwable -> L15
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r11)     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L25
        L22:
            r9.updateCharset(r11)     // Catch: java.lang.Throwable -> L15
        L25:
            r11 = 0
            r0 = r11
            r2 = r0
        L28:
            int r3 = r10.read()     // Catch: java.lang.Throwable -> L15
            r4 = 32
            r5 = -1
            r6 = 10
            if (r3 != r5) goto L46
            java.lang.StringBuilder r10 = kotlin.io.LineReader.sb     // Catch: java.lang.Throwable -> L15
            int r10 = r10.length()     // Catch: java.lang.Throwable -> L15
            if (r10 != 0) goto L41
            if (r0 != 0) goto L41
            if (r2 != 0) goto L41
            monitor-exit(r9)
            return r1
        L41:
            int r10 = r9.decodeEndOfInput(r0, r2)     // Catch: java.lang.Throwable -> L15
            goto L74
        L46:
            byte[] r5 = kotlin.io.LineReader.bytes     // Catch: java.lang.Throwable -> L15
            int r7 = r0 + 1
            byte r8 = (byte) r3     // Catch: java.lang.Throwable -> L15
            r5[r0] = r8     // Catch: java.lang.Throwable -> L15
            if (r3 == r6) goto L58
            if (r7 == r4) goto L58
            boolean r0 = kotlin.io.LineReader.directEOL     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L56
            goto L58
        L56:
            r0 = r7
            goto L28
        L58:
            java.nio.ByteBuffer r0 = kotlin.io.LineReader.byteBuf     // Catch: java.lang.Throwable -> L15
            r0.limit(r7)     // Catch: java.lang.Throwable -> L15
            java.nio.CharBuffer r3 = kotlin.io.LineReader.charBuf     // Catch: java.lang.Throwable -> L15
            r3.position(r2)     // Catch: java.lang.Throwable -> L15
            int r2 = r9.decode(r11)     // Catch: java.lang.Throwable -> L15
            if (r2 <= 0) goto Lb6
            char[] r3 = kotlin.io.LineReader.chars     // Catch: java.lang.Throwable -> L15
            int r5 = r2 + (-1)
            char r3 = r3[r5]     // Catch: java.lang.Throwable -> L15
            if (r3 != r6) goto Lb6
            r0.position(r11)     // Catch: java.lang.Throwable -> L15
            r10 = r2
        L74:
            if (r10 <= 0) goto L8e
            char[] r0 = kotlin.io.LineReader.chars     // Catch: java.lang.Throwable -> L15
            int r1 = r10 + (-1)
            char r1 = r0[r1]     // Catch: java.lang.Throwable -> L15
            if (r1 != r6) goto L8e
            int r1 = r10 + (-1)
            if (r1 <= 0) goto L8d
            int r2 = r10 + (-2)
            char r0 = r0[r2]     // Catch: java.lang.Throwable -> L15
            r2 = 13
            if (r0 != r2) goto L8d
            int r10 = r10 + (-2)
            goto L8e
        L8d:
            r10 = r1
        L8e:
            java.lang.StringBuilder r0 = kotlin.io.LineReader.sb     // Catch: java.lang.Throwable -> L15
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L9f
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L15
            char[] r1 = kotlin.io.LineReader.chars     // Catch: java.lang.Throwable -> L15
            r0.<init>(r1, r11, r10)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r9)
            return r0
        L9f:
            char[] r1 = kotlin.io.LineReader.chars     // Catch: java.lang.Throwable -> L15
            r0.append(r1, r11, r10)     // Catch: java.lang.Throwable -> L15
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> L15
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L15
            if (r1 <= r4) goto Lb1
            r9.trimStringBuilder()     // Catch: java.lang.Throwable -> L15
        Lb1:
            r0.setLength(r11)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r9)
            return r10
        Lb6:
            int r0 = r9.compactBytes()     // Catch: java.lang.Throwable -> L15
            goto L28
        Lbc:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L15
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.LineReader.readLine(java.io.InputStream, java.nio.charset.Charset):java.lang.String");
    }
}
