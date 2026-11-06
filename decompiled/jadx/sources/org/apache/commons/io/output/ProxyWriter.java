package org.apache.commons.io.output;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;
import org.apache.commons.io.IOUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class ProxyWriter extends FilterWriter {
    public ProxyWriter(Writer writer) {
        super(writer);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) throws IOException {
        try {
            int length = IOUtils.length(charSequence);
            beforeWrite(length);
            ((FilterWriter) this).out.append(charSequence);
            afterWrite(length);
            return this;
        } catch (IOException e) {
            handleIOException(e);
            return this;
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IOUtils.close(((FilterWriter) this).out, new ProxyWriter$$ExternalSyntheticLambda0(this, 0));
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        try {
            ((FilterWriter) this).out.flush();
        } catch (IOException e) {
            handleIOException(e);
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        try {
            int length = IOUtils.length(cArr);
            beforeWrite(length);
            ((FilterWriter) this).out.write(cArr);
            afterWrite(length);
        } catch (IOException e) {
            handleIOException(e);
        }
    }

    public void afterWrite(int i) throws IOException {
    }

    public void beforeWrite(int i) throws IOException {
    }

    public void handleIOException(IOException iOException) throws IOException {
        throw iOException;
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(int i) throws IOException {
        try {
            beforeWrite(1);
            ((FilterWriter) this).out.write(i);
            afterWrite(1);
        } catch (IOException e) {
            handleIOException(e);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) throws IOException {
        try {
            beforeWrite(1);
            ((FilterWriter) this).out.append(c);
            afterWrite(1);
            return this;
        } catch (IOException e) {
            handleIOException(e);
            return this;
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        try {
            beforeWrite(i2);
            ((FilterWriter) this).out.write(cArr, i, i2);
            afterWrite(i2);
        } catch (IOException e) {
            handleIOException(e);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) throws IOException {
        int i3 = i2 - i;
        try {
            beforeWrite(i3);
            ((FilterWriter) this).out.append(charSequence, i, i2);
            afterWrite(i3);
            return this;
        } catch (IOException e) {
            handleIOException(e);
            return this;
        }
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        try {
            int length = IOUtils.length(str);
            beforeWrite(length);
            ((FilterWriter) this).out.write(str);
            afterWrite(length);
        } catch (IOException e) {
            handleIOException(e);
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        try {
            beforeWrite(i2);
            ((FilterWriter) this).out.write(str, i, i2);
            afterWrite(i2);
        } catch (IOException e) {
            handleIOException(e);
        }
    }
}
