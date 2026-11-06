package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class WriterOutputStream extends OutputStream {
    private static final int BUFFER_SIZE = 1024;
    private final CharsetDecoder decoder;
    private final ByteBuffer decoderIn;
    private final CharBuffer decoderOut;
    private final boolean writeImmediately;
    private final Writer writer;

    public WriterOutputStream(Writer writer, CharsetDecoder charsetDecoder, int i, boolean z) {
        this.decoderIn = ByteBuffer.allocate(128);
        checkIbmJdkWithBrokenUTF16(charsetDecoder.charset());
        this.writer = writer;
        this.decoder = charsetDecoder;
        this.writeImmediately = z;
        this.decoderOut = CharBuffer.allocate(i);
    }

    private static void checkIbmJdkWithBrokenUTF16(Charset charset) {
        if ("UTF-16".equals(charset.name())) {
            byte[] bytes = "vés".getBytes(charset);
            CharsetDecoder newDecoder = charset.newDecoder();
            ByteBuffer allocate = ByteBuffer.allocate(16);
            CharBuffer allocate2 = CharBuffer.allocate(3);
            int length = bytes.length;
            int i = 0;
            while (i < length) {
                allocate.put(bytes[i]);
                allocate.flip();
                try {
                    newDecoder.decode(allocate, allocate2, i == length + (-1));
                    allocate.compact();
                    i++;
                } catch (IllegalArgumentException unused) {
                    Buffer$$ExternalSyntheticBUOutline0.m$1("UTF-16 requested when running on an IBM JDK with broken UTF-16 support. Please find a JDK that supports UTF-16 if you intend to use UF-16 with WriterOutputStream");
                    return;
                }
            }
            allocate2.rewind();
            if ("vés".equals(allocate2.toString())) {
                return;
            }
            Buffer$$ExternalSyntheticBUOutline0.m$1("UTF-16 requested when running on an IBM JDK with broken UTF-16 support. Please find a JDK that supports UTF-16 if you intend to use UF-16 with WriterOutputStream");
        }
    }

    private void flushOutput() throws IOException {
        if (this.decoderOut.position() > 0) {
            this.writer.write(this.decoderOut.array(), 0, this.decoderOut.position());
            this.decoderOut.rewind();
        }
    }

    private void processInput(boolean z) throws IOException {
        CoderResult decode;
        this.decoderIn.flip();
        while (true) {
            decode = this.decoder.decode(this.decoderIn, this.decoderOut, z);
            if (!decode.isOverflow()) {
                break;
            } else {
                flushOutput();
            }
        }
        if (decode.isUnderflow()) {
            this.decoderIn.compact();
        } else {
            Buffer$$ExternalSyntheticBUOutline0.m$2("Unexpected coder result");
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        processInput(true);
        flushOutput();
        this.writer.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        flushOutput();
        this.writer.flush();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        while (i2 > 0) {
            int min = Math.min(i2, this.decoderIn.remaining());
            this.decoderIn.put(bArr, i, min);
            processInput(false);
            i2 -= min;
            i += min;
        }
        if (this.writeImmediately) {
            flushOutput();
        }
    }

    public WriterOutputStream(Writer writer, CharsetDecoder charsetDecoder) {
        this(writer, charsetDecoder, 1024, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public WriterOutputStream(java.io.Writer r2, java.nio.charset.Charset r3, int r4, boolean r5) {
        /*
            r1 = this;
            java.nio.charset.CharsetDecoder r3 = r3.newDecoder()
            java.nio.charset.CodingErrorAction r0 = java.nio.charset.CodingErrorAction.REPLACE
            java.nio.charset.CharsetDecoder r3 = r3.onMalformedInput(r0)
            java.nio.charset.CharsetDecoder r3 = r3.onUnmappableCharacter(r0)
            java.lang.String r0 = "?"
            java.nio.charset.CharsetDecoder r3 = r3.replaceWith(r0)
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.output.WriterOutputStream.<init>(java.io.Writer, java.nio.charset.Charset, int, boolean):void");
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    public WriterOutputStream(Writer writer, Charset charset) {
        this(writer, charset, 1024, false);
    }

    public WriterOutputStream(Writer writer, String str, int i, boolean z) {
        this(writer, Charset.forName(str), i, z);
    }

    public WriterOutputStream(Writer writer, String str) {
        this(writer, str, 1024, false);
    }

    @Deprecated
    public WriterOutputStream(Writer writer) {
        this(writer, Charset.defaultCharset(), 1024, false);
    }
}
