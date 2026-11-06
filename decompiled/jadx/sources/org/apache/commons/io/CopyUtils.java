package org.apache.commons.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes10.dex */
public class CopyUtils {
    @Deprecated
    public static void copy(String str, OutputStream outputStream) throws IOException {
        StringReader stringReader = new StringReader(str);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, Charset.defaultCharset());
        copy(stringReader, outputStreamWriter);
        outputStreamWriter.flush();
    }

    @Deprecated
    public static void copy(byte[] bArr, Writer writer) throws IOException {
        copy(new ByteArrayInputStream(bArr), writer);
    }

    public static void copy(byte[] bArr, Writer writer, String str) throws IOException {
        copy(new ByteArrayInputStream(bArr), writer, str);
    }

    public static int copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] byteArray = IOUtils.byteArray();
        int i = 0;
        while (true) {
            int read = inputStream.read(byteArray);
            if (-1 == read) {
                return i;
            }
            outputStream.write(byteArray, 0, read);
            i += read;
        }
    }

    public static int copy(Reader reader, Writer writer) throws IOException {
        char[] charArray = IOUtils.getCharArray();
        int i = 0;
        while (true) {
            int read = reader.read(charArray);
            if (-1 == read) {
                return i;
            }
            writer.write(charArray, 0, read);
            i += read;
        }
    }

    @Deprecated
    public static void copy(InputStream inputStream, Writer writer) throws IOException {
        copy(new InputStreamReader(inputStream, Charset.defaultCharset()), writer);
    }

    public static void copy(InputStream inputStream, Writer writer, String str) throws IOException {
        copy(new InputStreamReader(inputStream, str), writer);
    }

    @Deprecated
    public static void copy(Reader reader, OutputStream outputStream) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, Charset.defaultCharset());
        copy(reader, outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static void copy(Reader reader, OutputStream outputStream, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, str);
        copy(reader, outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static void copy(byte[] bArr, OutputStream outputStream) throws IOException {
        outputStream.write(bArr);
    }

    public static void copy(String str, OutputStream outputStream, String str2) throws IOException {
        StringReader stringReader = new StringReader(str);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, str2);
        copy(stringReader, outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static void copy(String str, Writer writer) throws IOException {
        writer.write(str);
    }
}
