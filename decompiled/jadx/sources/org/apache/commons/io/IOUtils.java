package org.apache.commons.io;

import androidx.collection.SieveCacheKt;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.google.common.math.Stats$$ExternalSyntheticLambda0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.CharArrayWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.Selector;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import okhttp3.internal.Util$$ExternalSyntheticLambda2;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.output.AppendableWriter;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.io.output.StringBuilderWriter;
import org.apache.commons.io.output.ThresholdingOutputStream;
import org.apache.commons.io.output.UnsynchronizedByteArrayOutputStream;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class IOUtils {
    public static final int CR = 13;
    public static final int DEFAULT_BUFFER_SIZE = 8192;
    public static final char DIR_SEPARATOR_UNIX = '/';
    public static final char DIR_SEPARATOR_WINDOWS = '\\';
    public static final int EOF = -1;
    public static final int LF = 10;
    public static final char DIR_SEPARATOR = File.separatorChar;
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];

    @Deprecated
    public static final String LINE_SEPARATOR = System.lineSeparator();
    public static final String LINE_SEPARATOR_UNIX = StandardLineSeparator.LF.getString();
    public static final String LINE_SEPARATOR_WINDOWS = StandardLineSeparator.CRLF.getString();
    private static final ThreadLocal<byte[]> SKIP_BYTE_BUFFER = ThreadLocal.withInitial(new Stats$$ExternalSyntheticLambda0(19));
    private static final ThreadLocal<char[]> SKIP_CHAR_BUFFER = ThreadLocal.withInitial(new Stats$$ExternalSyntheticLambda0(20));

    public static BufferedInputStream buffer(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "inputStream");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream);
    }

    public static byte[] byteArray() {
        return byteArray(8192);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static char[] charArray() {
        return charArray(8192);
    }

    public static void close(Closeable... closeableArr) throws IOException {
        if (closeableArr != null) {
            for (Closeable closeable : closeableArr) {
                close(closeable);
            }
        }
    }

    public static void closeQuietly(Closeable... closeableArr) {
        if (closeableArr == null) {
            return;
        }
        for (Closeable closeable : closeableArr) {
            closeQuietly(closeable);
        }
    }

    public static long consume(InputStream inputStream) throws IOException {
        return copyLarge(inputStream, NullOutputStream.NULL_OUTPUT_STREAM, getByteArray());
    }

    public static boolean contentEquals(InputStream inputStream, InputStream inputStream2) throws IOException {
        int read;
        int read2;
        if (inputStream == inputStream2) {
            return true;
        }
        if (inputStream == null || inputStream2 == null) {
            return false;
        }
        byte[] byteArray = getByteArray();
        byte[] byteArray2 = byteArray();
        while (true) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < 8192) {
                if (i2 == i) {
                    do {
                        read2 = inputStream.read(byteArray, i2, 8192 - i2);
                    } while (read2 == 0);
                    if (read2 == -1) {
                        return i3 == i && inputStream2.read() == -1;
                    }
                    i2 += read2;
                }
                if (i3 == i) {
                    do {
                        read = inputStream2.read(byteArray2, i3, 8192 - i3);
                    } while (read == 0);
                    if (read == -1) {
                        return i2 == i && inputStream.read() == -1;
                    }
                    i3 += read;
                }
                if (byteArray[i] != byteArray2[i]) {
                    return false;
                }
                i++;
            }
        }
    }

    public static boolean contentEqualsIgnoreEOL(Reader reader, Reader reader2) throws IOException {
        if (reader == reader2) {
            return true;
        }
        if ((reader2 == null) ^ (reader == null)) {
            return false;
        }
        BufferedReader bufferedReader = toBufferedReader(reader);
        BufferedReader bufferedReader2 = toBufferedReader(reader2);
        String readLine = bufferedReader.readLine();
        String readLine2 = bufferedReader2.readLine();
        while (readLine != null && readLine.equals(readLine2)) {
            readLine = bufferedReader.readLine();
            readLine2 = bufferedReader2.readLine();
        }
        return Objects.equals(readLine, readLine2);
    }

    public static long copy(URL url, File file) throws IOException {
        Objects.requireNonNull(file, "file");
        OutputStream newOutputStream = Files.newOutputStream(file.toPath(), new OpenOption[0]);
        try {
            long copy = copy(url, newOutputStream);
            if (newOutputStream != null) {
                newOutputStream.close();
            }
            return copy;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (newOutputStream != null) {
                    try {
                        newOutputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream, long j, long j2, byte[] bArr) throws IOException {
        long j3 = 0;
        if (j > 0) {
            skipFully(inputStream, j);
        }
        if (j2 == 0) {
            return 0L;
        }
        int length = bArr.length;
        int i = (j2 <= 0 || j2 >= ((long) length)) ? length : (int) j2;
        while (i > 0) {
            int read = inputStream.read(bArr, 0, i);
            if (-1 == read) {
                break;
            }
            outputStream.write(bArr, 0, read);
            j3 += read;
            if (j2 > 0) {
                i = (int) Math.min(j2 - j3, length);
            }
        }
        return j3;
    }

    public static byte[] getByteArray() {
        return SKIP_BYTE_BUFFER.get();
    }

    public static char[] getCharArray() {
        return SKIP_CHAR_BUFFER.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$toByteArray$0(ThresholdingOutputStream thresholdingOutputStream) throws IOException {
        throw new IllegalArgumentException(String.format("Cannot read more than %,d into a byte array", Integer.MAX_VALUE));
    }

    public static int length(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        return charSequence.length();
    }

    public static LineIterator lineIterator(InputStream inputStream, Charset charset) {
        return new LineIterator(new InputStreamReader(inputStream, Charsets.toCharset(charset)));
    }

    public static int read(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        if (i2 < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i2, "Length must not be negative: "));
            return 0;
        }
        int i3 = i2;
        while (i3 > 0) {
            int read = inputStream.read(bArr, (i2 - i3) + i, i3);
            if (-1 == read) {
                break;
            }
            i3 -= read;
        }
        return i2 - i3;
    }

    public static void readFully(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) throws IOException {
        int remaining = byteBuffer.remaining();
        int read = read(readableByteChannel, byteBuffer);
        if (read == remaining) {
            return;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Length to read: ", remaining, " actual: ", read));
    }

    public static List<String> readLines(Reader reader) throws IOException {
        BufferedReader bufferedReader = toBufferedReader(reader);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return arrayList;
            }
            arrayList.add(readLine);
        }
    }

    public static byte[] resourceToByteArray(String str, ClassLoader classLoader) throws IOException {
        return toByteArray(resourceToURL(str, classLoader));
    }

    public static String resourceToString(String str, Charset charset, ClassLoader classLoader) throws IOException {
        return toString(resourceToURL(str, classLoader), charset);
    }

    public static URL resourceToURL(String str, ClassLoader classLoader) throws IOException {
        URL resource = classLoader == null ? IOUtils.class.getResource(str) : classLoader.getResource(str);
        if (resource != null) {
            return resource;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m("Resource not found: ", str));
        return null;
    }

    public static long skip(ReadableByteChannel readableByteChannel, long j) throws IOException {
        if (j < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(ArcMode$$ExternalSyntheticOutline0.m(j, "Skip count must be non-negative, actual: "));
            return 0L;
        }
        ByteBuffer allocate = ByteBuffer.allocate((int) Math.min(j, 8192L));
        long j2 = j;
        while (j2 > 0) {
            allocate.position(0);
            allocate.limit((int) Math.min(j2, 8192L));
            int read = readableByteChannel.read(allocate);
            if (read == -1) {
                break;
            }
            j2 -= read;
        }
        return j - j2;
    }

    public static void skipFully(InputStream inputStream, long j) throws IOException {
        if (j < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(ArcMode$$ExternalSyntheticOutline0.m(j, "Bytes to skip must not be negative: "));
            return;
        }
        long skip = skip(inputStream, j);
        if (skip == j) {
            return;
        }
        StringBuilder m = a$$ExternalSyntheticOutline0.m("Bytes to skip: ", j, " actual: ");
        m.append(skip);
        throw new EOFException(m.toString());
    }

    public static InputStream toBufferedInputStream(InputStream inputStream) throws IOException {
        return ByteArrayOutputStream.toBufferedInputStream(inputStream);
    }

    public static BufferedReader toBufferedReader(Reader reader) {
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader);
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        UnsynchronizedByteArrayOutputStream unsynchronizedByteArrayOutputStream = new UnsynchronizedByteArrayOutputStream();
        try {
            ThresholdingOutputStream thresholdingOutputStream = new ThresholdingOutputStream(Integer.MAX_VALUE, new IOUtils$$ExternalSyntheticLambda0(0), new Util$$ExternalSyntheticLambda2(unsynchronizedByteArrayOutputStream, 19));
            try {
                copy(inputStream, thresholdingOutputStream);
                byte[] byteArray = unsynchronizedByteArrayOutputStream.toByteArray();
                thresholdingOutputStream.close();
                unsynchronizedByteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    unsynchronizedByteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static char[] toCharArray(InputStream inputStream, Charset charset) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        copy(inputStream, charArrayWriter, charset);
        return charArrayWriter.toCharArray();
    }

    public static InputStream toInputStream(String str, Charset charset) {
        return new ByteArrayInputStream(str.getBytes(Charsets.toCharset(charset)));
    }

    public static String toString(InputStream inputStream, Charset charset) throws IOException {
        StringBuilderWriter stringBuilderWriter = new StringBuilderWriter();
        try {
            copy(inputStream, stringBuilderWriter, charset);
            String stringBuilderWriter2 = stringBuilderWriter.toString();
            stringBuilderWriter.close();
            return stringBuilderWriter2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    stringBuilderWriter.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static void write(char[] cArr, OutputStream outputStream, Charset charset) throws IOException {
        if (cArr != null) {
            outputStream.write(new String(cArr).getBytes(Charsets.toCharset(charset)));
        }
    }

    public static void writeChunked(byte[] bArr, OutputStream outputStream) throws IOException {
        if (bArr != null) {
            int length = bArr.length;
            int i = 0;
            while (length > 0) {
                int min = Math.min(length, 8192);
                outputStream.write(bArr, i, min);
                length -= min;
                i += min;
            }
        }
    }

    public static void writeLines(Collection<?> collection, String str, OutputStream outputStream, Charset charset) throws IOException {
        if (collection == null) {
            return;
        }
        if (str == null) {
            str = System.lineSeparator();
        }
        Charset charset2 = Charsets.toCharset(charset);
        for (Object obj : collection) {
            if (obj != null) {
                outputStream.write(obj.toString().getBytes(charset2));
            }
            outputStream.write(str.getBytes(charset2));
        }
    }

    public static Writer writer(Appendable appendable) {
        Objects.requireNonNull(appendable, "appendable");
        return appendable instanceof Writer ? (Writer) appendable : appendable instanceof StringBuilder ? new StringBuilderWriter((StringBuilder) appendable) : new AppendableWriter(appendable);
    }

    public static InputStream toBufferedInputStream(InputStream inputStream, int i) throws IOException {
        return ByteArrayOutputStream.toBufferedInputStream(inputStream, i);
    }

    public static byte[] byteArray(int i) {
        return new byte[i];
    }

    private static char[] charArray(int i) {
        return new char[i];
    }

    public static int length(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        return cArr.length;
    }

    public static byte[] resourceToByteArray(String str) throws IOException {
        return resourceToByteArray(str, null);
    }

    public static String resourceToString(String str, Charset charset) throws IOException {
        return resourceToString(str, charset, null);
    }

    public static int length(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public static int length(Object[] objArr) {
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    public static BufferedReader toBufferedReader(Reader reader, int i) {
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i);
    }

    @Deprecated
    public static char[] toCharArray(InputStream inputStream) throws IOException {
        return toCharArray(inputStream, Charset.defaultCharset());
    }

    public static char[] toCharArray(InputStream inputStream, String str) throws IOException {
        return toCharArray(inputStream, Charsets.toCharset(str));
    }

    public static InputStream toInputStream(CharSequence charSequence, Charset charset) {
        return toInputStream(charSequence.toString(), charset);
    }

    public static void close(Closeable closeable) throws IOException {
        if (closeable != null) {
            closeable.close();
        }
    }

    public static LineIterator lineIterator(InputStream inputStream, String str) {
        return lineIterator(inputStream, Charsets.toCharset(str));
    }

    public static char[] toCharArray(Reader reader) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        copy(reader, (Writer) charArrayWriter);
        return charArrayWriter.toCharArray();
    }

    public static InputStream toInputStream(CharSequence charSequence, String str) {
        return toInputStream(charSequence, Charsets.toCharset(str));
    }

    public static void close(Closeable closeable, IOConsumer<IOException> iOConsumer) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                if (iOConsumer != null) {
                    iOConsumer.accept(e);
                }
            }
        }
    }

    public static void closeQuietly(Closeable closeable) {
        closeQuietly(closeable, null);
    }

    public static LineIterator lineIterator(Reader reader) {
        return new LineIterator(reader);
    }

    @Deprecated
    public static InputStream toInputStream(String str) {
        return toInputStream(str, Charset.defaultCharset());
    }

    public static void closeQuietly(Closeable closeable, Consumer<IOException> consumer) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                if (consumer != null) {
                    consumer.accept(e);
                }
            }
        }
    }

    @Deprecated
    public static InputStream toInputStream(CharSequence charSequence) {
        return toInputStream(charSequence, Charset.defaultCharset());
    }

    public static BufferedInputStream buffer(InputStream inputStream, int i) {
        Objects.requireNonNull(inputStream, "inputStream");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i);
    }

    public static void close(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpURLConnection) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    public static InputStream toInputStream(String str, String str2) {
        return new ByteArrayInputStream(str.getBytes(Charsets.toCharset(str2)));
    }

    public static void closeQuietly(InputStream inputStream) {
        closeQuietly((Closeable) inputStream);
    }

    @Deprecated
    public static void write(byte[] bArr, Writer writer) throws IOException {
        write(bArr, writer, Charset.defaultCharset());
    }

    public static void writeChunked(char[] cArr, Writer writer) throws IOException {
        if (cArr != null) {
            int length = cArr.length;
            int i = 0;
            while (length > 0) {
                int min = Math.min(length, 8192);
                writer.write(cArr, i, min);
                length -= min;
                i += min;
            }
        }
    }

    public static BufferedOutputStream buffer(OutputStream outputStream) {
        Objects.requireNonNull(outputStream, "outputStream");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream);
    }

    public static void closeQuietly(OutputStream outputStream) {
        closeQuietly((Closeable) outputStream);
    }

    public static List<String> readLines(InputStream inputStream, Charset charset) throws IOException {
        return readLines(new InputStreamReader(inputStream, Charsets.toCharset(charset)));
    }

    public static void write(byte[] bArr, Writer writer, Charset charset) throws IOException {
        if (bArr != null) {
            writer.write(new String(bArr, Charsets.toCharset(charset)));
        }
    }

    public static void closeQuietly(Reader reader) {
        closeQuietly((Closeable) reader);
    }

    public static void write(byte[] bArr, Writer writer, String str) throws IOException {
        write(bArr, writer, Charsets.toCharset(str));
    }

    public static BufferedOutputStream buffer(OutputStream outputStream, int i) {
        Objects.requireNonNull(outputStream, "outputStream");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i);
    }

    public static void closeQuietly(Selector selector) {
        closeQuietly((Closeable) selector);
    }

    public static List<String> readLines(InputStream inputStream, String str) throws IOException {
        return readLines(inputStream, Charsets.toCharset(str));
    }

    @Deprecated
    public static void write(char[] cArr, OutputStream outputStream) throws IOException {
        write(cArr, outputStream, Charset.defaultCharset());
    }

    public static void closeQuietly(ServerSocket serverSocket) {
        closeQuietly((Closeable) serverSocket);
    }

    public static void readFully(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        int read = read(inputStream, bArr, i, i2);
        if (read == i2) {
            return;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Length to read: ", i2, " actual: ", read));
    }

    @Deprecated
    public static List<String> readLines(InputStream inputStream) throws IOException {
        return readLines(inputStream, Charset.defaultCharset());
    }

    public static void write(byte[] bArr, OutputStream outputStream) throws IOException {
        if (bArr != null) {
            outputStream.write(bArr);
        }
    }

    public static BufferedReader buffer(Reader reader) {
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader);
    }

    public static void closeQuietly(Socket socket) {
        closeQuietly((Closeable) socket);
    }

    public static void write(char[] cArr, OutputStream outputStream, String str) throws IOException {
        write(cArr, outputStream, Charsets.toCharset(str));
    }

    public static BufferedReader buffer(Reader reader, int i) {
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i);
    }

    public static void closeQuietly(Writer writer) {
        closeQuietly((Closeable) writer);
    }

    public static void write(char[] cArr, Writer writer) throws IOException {
        if (cArr != null) {
            writer.write(cArr);
        }
    }

    public static BufferedWriter buffer(Writer writer) {
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer);
    }

    @Deprecated
    public static void write(CharSequence charSequence, OutputStream outputStream) throws IOException {
        write(charSequence, outputStream, Charset.defaultCharset());
    }

    public static BufferedWriter buffer(Writer writer, int i) {
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i);
    }

    public static byte[] readFully(InputStream inputStream, int i) throws IOException {
        byte[] byteArray = byteArray(i);
        readFully(inputStream, byteArray, 0, byteArray.length);
        return byteArray;
    }

    public static URL resourceToURL(String str) throws IOException {
        return resourceToURL(str, null);
    }

    public static void write(CharSequence charSequence, OutputStream outputStream, Charset charset) throws IOException {
        if (charSequence != null) {
            write(charSequence.toString(), outputStream, charset);
        }
    }

    public static String toString(byte[] bArr, String str) {
        return new String(bArr, Charsets.toCharset(str));
    }

    public static void write(CharSequence charSequence, OutputStream outputStream, String str) throws IOException {
        write(charSequence, outputStream, Charsets.toCharset(str));
    }

    public static void readFully(InputStream inputStream, byte[] bArr) throws IOException {
        readFully(inputStream, bArr, 0, bArr.length);
    }

    @Deprecated
    public static String toString(InputStream inputStream) throws IOException {
        return toString(inputStream, Charset.defaultCharset());
    }

    public static void write(CharSequence charSequence, Writer writer) throws IOException {
        if (charSequence != null) {
            write(charSequence.toString(), writer);
        }
    }

    public static void readFully(Reader reader, char[] cArr) throws IOException {
        readFully(reader, cArr, 0, cArr.length);
    }

    @Deprecated
    public static String toString(byte[] bArr) {
        return new String(bArr, Charset.defaultCharset());
    }

    @Deprecated
    public static void write(String str, OutputStream outputStream) throws IOException {
        write(str, outputStream, Charset.defaultCharset());
    }

    public static int read(InputStream inputStream, byte[] bArr) throws IOException {
        return read(inputStream, bArr, 0, bArr.length);
    }

    public static void readFully(Reader reader, char[] cArr, int i, int i2) throws IOException {
        int read = read(reader, cArr, i, i2);
        if (read == i2) {
            return;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Length to read: ", i2, " actual: ", read));
    }

    public static String toString(InputStream inputStream, String str) throws IOException {
        return toString(inputStream, Charsets.toCharset(str));
    }

    public static void write(String str, OutputStream outputStream, Charset charset) throws IOException {
        if (str != null) {
            outputStream.write(str.getBytes(Charsets.toCharset(charset)));
        }
    }

    public static int read(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) throws IOException {
        int remaining = byteBuffer.remaining();
        while (byteBuffer.remaining() > 0 && -1 != readableByteChannel.read(byteBuffer)) {
        }
        return remaining - byteBuffer.remaining();
    }

    public static String toString(Reader reader) throws IOException {
        StringBuilderWriter stringBuilderWriter = new StringBuilderWriter();
        try {
            copy(reader, (Writer) stringBuilderWriter);
            String stringBuilderWriter2 = stringBuilderWriter.toString();
            stringBuilderWriter.close();
            return stringBuilderWriter2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    stringBuilderWriter.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static void write(String str, OutputStream outputStream, String str2) throws IOException {
        write(str, outputStream, Charsets.toCharset(str2));
    }

    public static void write(String str, Writer writer) throws IOException {
        if (str != null) {
            writer.write(str);
        }
    }

    @Deprecated
    public static void write(StringBuffer stringBuffer, OutputStream outputStream) throws IOException {
        write(stringBuffer, outputStream, (String) null);
    }

    @Deprecated
    public static void write(StringBuffer stringBuffer, OutputStream outputStream, String str) throws IOException {
        if (stringBuffer != null) {
            outputStream.write(stringBuffer.toString().getBytes(Charsets.toCharset(str)));
        }
    }

    public static int read(Reader reader, char[] cArr) throws IOException {
        return read(reader, cArr, 0, cArr.length);
    }

    @Deprecated
    public static void write(StringBuffer stringBuffer, Writer writer) throws IOException {
        if (stringBuffer != null) {
            writer.write(stringBuffer.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ OutputStream lambda$toByteArray$1(UnsynchronizedByteArrayOutputStream unsynchronizedByteArrayOutputStream, ThresholdingOutputStream thresholdingOutputStream) throws IOException {
        return unsynchronizedByteArrayOutputStream;
    }

    public static int read(Reader reader, char[] cArr, int i, int i2) throws IOException {
        if (i2 < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i2, "Length must not be negative: "));
            return 0;
        }
        int i3 = i2;
        while (i3 > 0) {
            int read = reader.read(cArr, (i2 - i3) + i, i3);
            if (-1 == read) {
                break;
            }
            i3 -= read;
        }
        return i2 - i3;
    }

    @Deprecated
    public static String toString(URI uri) throws IOException {
        return toString(uri, Charset.defaultCharset());
    }

    public static String toString(URI uri, Charset charset) throws IOException {
        return toString(uri.toURL(), Charsets.toCharset(charset));
    }

    public static long copy(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        return copyLarge(inputStream, outputStream, byteArray(i));
    }

    public static String toString(URI uri, String str) throws IOException {
        return toString(uri, Charsets.toCharset(str));
    }

    @Deprecated
    public static void copy(InputStream inputStream, Writer writer) throws IOException {
        copy(inputStream, writer, Charset.defaultCharset());
    }

    @Deprecated
    public static String toString(URL url) throws IOException {
        return toString(url, Charset.defaultCharset());
    }

    public static void copy(InputStream inputStream, Writer writer, Charset charset) throws IOException {
        copy((Reader) new InputStreamReader(inputStream, Charsets.toCharset(charset)), writer);
    }

    public static String toString(URL url, Charset charset) throws IOException {
        InputStream openStream = url.openStream();
        try {
            String iOUtils = toString(openStream, charset);
            if (openStream != null) {
                openStream.close();
            }
            return iOUtils;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (openStream != null) {
                    try {
                        openStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static void copy(InputStream inputStream, Writer writer, String str) throws IOException {
        copy(inputStream, writer, Charsets.toCharset(str));
    }

    public static long copy(Reader reader, Appendable appendable) throws IOException {
        return copy(reader, appendable, CharBuffer.allocate(8192));
    }

    public static long copy(Reader reader, Appendable appendable, CharBuffer charBuffer) throws IOException {
        long j = 0;
        while (true) {
            int read = reader.read(charBuffer);
            if (-1 == read) {
                return j;
            }
            charBuffer.flip();
            appendable.append(charBuffer, 0, read);
            j += read;
        }
    }

    public static void skipFully(ReadableByteChannel readableByteChannel, long j) throws IOException {
        if (j >= 0) {
            long skip = skip(readableByteChannel, j);
            if (skip == j) {
                return;
            }
            StringBuilder m = a$$ExternalSyntheticOutline0.m("Bytes to skip: ", j, " actual: ");
            m.append(skip);
            throw new EOFException(m.toString());
        }
        Single$$ExternalSyntheticBUOutline0.m$3(ArcMode$$ExternalSyntheticOutline0.m(j, "Bytes to skip must not be negative: "));
    }

    public static String toString(URL url, String str) throws IOException {
        return toString(url, Charsets.toCharset(str));
    }

    @Deprecated
    public static void copy(Reader reader, OutputStream outputStream) throws IOException {
        copy(reader, outputStream, Charset.defaultCharset());
    }

    @Deprecated
    public static void writeLines(Collection<?> collection, String str, OutputStream outputStream) throws IOException {
        writeLines(collection, str, outputStream, Charset.defaultCharset());
    }

    public static void copy(Reader reader, OutputStream outputStream, Charset charset) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, Charsets.toCharset(charset));
        copy(reader, (Writer) outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static void writeLines(Collection<?> collection, String str, OutputStream outputStream, String str2) throws IOException {
        writeLines(collection, str, outputStream, Charsets.toCharset(str2));
    }

    public static void writeLines(Collection<?> collection, String str, Writer writer) throws IOException {
        if (collection == null) {
            return;
        }
        if (str == null) {
            str = System.lineSeparator();
        }
        for (Object obj : collection) {
            if (obj != null) {
                writer.write(obj.toString());
            }
            writer.write(str);
        }
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        Objects.requireNonNull(inputStream, "inputStream");
        Objects.requireNonNull(outputStream, "outputStream");
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    public static void copy(Reader reader, OutputStream outputStream, String str) throws IOException {
        copy(reader, outputStream, Charsets.toCharset(str));
    }

    public static void skipFully(Reader reader, long j) throws IOException {
        long skip = skip(reader, j);
        if (skip == j) {
            return;
        }
        StringBuilder m = a$$ExternalSyntheticOutline0.m("Chars to skip: ", j, " actual: ");
        m.append(skip);
        throw new EOFException(m.toString());
    }

    public static int copy(Reader reader, Writer writer) throws IOException {
        long copyLarge = copyLarge(reader, writer);
        if (copyLarge > SieveCacheKt.NodeLinkMask) {
            return -1;
        }
        return (int) copyLarge;
    }

    public static int copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        long copyLarge = copyLarge(inputStream, outputStream);
        if (copyLarge > SieveCacheKt.NodeLinkMask) {
            return -1;
        }
        return (int) copyLarge;
    }

    public static long copy(URL url, OutputStream outputStream) throws IOException {
        Objects.requireNonNull(url, "url");
        InputStream openStream = url.openStream();
        try {
            long copyLarge = copyLarge(openStream, outputStream);
            if (openStream != null) {
                openStream.close();
            }
            return copyLarge;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (openStream != null) {
                    try {
                        openStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream, long j, long j2) throws IOException {
        return copyLarge(inputStream, outputStream, j, j2, getByteArray());
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream) throws IOException {
        return copy(inputStream, outputStream, 8192);
    }

    public static long copyLarge(Reader reader, Writer writer) throws IOException {
        return copyLarge(reader, writer, getCharArray());
    }

    public static long copyLarge(Reader reader, Writer writer, char[] cArr) throws IOException {
        long j = 0;
        while (true) {
            int read = reader.read(cArr);
            if (-1 == read) {
                return j;
            }
            writer.write(cArr, 0, read);
            j += read;
        }
    }

    public static long skip(InputStream inputStream, long j) throws IOException {
        if (j < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(ArcMode$$ExternalSyntheticOutline0.m(j, "Skip count must be non-negative, actual: "));
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            long read = inputStream.read(getByteArray(), 0, (int) Math.min(j2, r4.length));
            if (read < 0) {
                break;
            }
            j2 -= read;
        }
        return j - j2;
    }

    public static long copyLarge(Reader reader, Writer writer, long j, long j2) throws IOException {
        return copyLarge(reader, writer, j, j2, getCharArray());
    }

    public static long copyLarge(Reader reader, Writer writer, long j, long j2, char[] cArr) throws IOException {
        long j3 = 0;
        if (j > 0) {
            skipFully(reader, j);
        }
        if (j2 == 0) {
            return 0L;
        }
        int length = cArr.length;
        if (j2 > 0 && j2 < cArr.length) {
            length = (int) j2;
        }
        while (length > 0) {
            int read = reader.read(cArr, 0, length);
            if (-1 == read) {
                break;
            }
            writer.write(cArr, 0, read);
            j3 += read;
            if (j2 > 0) {
                length = (int) Math.min(j2 - j3, cArr.length);
            }
        }
        return j3;
    }

    public static long skip(Reader reader, long j) throws IOException {
        if (j < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(ArcMode$$ExternalSyntheticOutline0.m(j, "Skip count must be non-negative, actual: "));
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            long read = reader.read(getCharArray(), 0, (int) Math.min(j2, r4.length));
            if (read < 0) {
                break;
            }
            j2 -= read;
        }
        return j - j2;
    }

    public static byte[] toByteArray(InputStream inputStream, int i) throws IOException {
        if (i < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Size must be equal or greater than zero: "));
            return null;
        }
        if (i == 0) {
            return EMPTY_BYTE_ARRAY;
        }
        byte[] byteArray = byteArray(i);
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(byteArray, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        if (i2 == i) {
            return byteArray;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m("Unexpected read size, current: ", i2, ", expected: ", i));
        return null;
    }

    public static byte[] toByteArray(InputStream inputStream, long j) throws IOException {
        if (j <= SieveCacheKt.NodeLinkMask) {
            return toByteArray(inputStream, (int) j);
        }
        Single$$ExternalSyntheticBUOutline0.m$3(ArcMode$$ExternalSyntheticOutline0.m(j, "Size cannot be greater than Integer max value: "));
        return null;
    }

    @Deprecated
    public static byte[] toByteArray(Reader reader) throws IOException {
        return toByteArray(reader, Charset.defaultCharset());
    }

    public static byte[] toByteArray(Reader reader, Charset charset) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            copy(reader, byteArrayOutputStream, charset);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static boolean contentEquals(Reader reader, Reader reader2) throws IOException {
        int read;
        int read2;
        if (reader == reader2) {
            return true;
        }
        if (reader == null || reader2 == null) {
            return false;
        }
        char[] charArray = getCharArray();
        char[] charArray2 = charArray();
        while (true) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < 8192) {
                if (i2 == i) {
                    do {
                        read2 = reader.read(charArray, i2, 8192 - i2);
                    } while (read2 == 0);
                    if (read2 == -1) {
                        return i3 == i && reader2.read() == -1;
                    }
                    i2 += read2;
                }
                if (i3 == i) {
                    do {
                        read = reader2.read(charArray2, i3, 8192 - i3);
                    } while (read == 0);
                    if (read == -1) {
                        return i2 == i && reader.read() == -1;
                    }
                    i3 += read;
                }
                if (charArray[i] != charArray2[i]) {
                    return false;
                }
                i++;
            }
        }
    }

    public static byte[] toByteArray(Reader reader, String str) throws IOException {
        return toByteArray(reader, Charsets.toCharset(str));
    }

    @Deprecated
    public static byte[] toByteArray(String str) {
        return str.getBytes(Charset.defaultCharset());
    }

    public static byte[] toByteArray(URI uri) throws IOException {
        return toByteArray(uri.toURL());
    }

    public static byte[] toByteArray(URL url) throws IOException {
        URLConnection openConnection = url.openConnection();
        try {
            return toByteArray(openConnection);
        } finally {
            close(openConnection);
        }
    }

    public static byte[] toByteArray(URLConnection uRLConnection) throws IOException {
        InputStream inputStream = uRLConnection.getInputStream();
        try {
            byte[] byteArray = toByteArray(inputStream);
            if (inputStream != null) {
                inputStream.close();
            }
            return byteArray;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }
}
