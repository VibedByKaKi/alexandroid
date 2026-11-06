package org.openjdk.tools.sjavac.comp;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import org.openjdk.javax.tools.JavaFileObject;
import org.openjdk.tools.sjavac.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class SmartWriter extends Writer {
    boolean closed = false;
    JavaFileObject file;
    String name;
    StringWriter newContent;
    String oldContent;

    public SmartWriter(JavaFileObject javaFileObject, String str, String str2) {
        this.newContent = new StringWriter();
        this.name = str2;
        this.file = javaFileObject;
        this.oldContent = str;
        this.newContent = new StringWriter();
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        String stringWriter = this.newContent.toString();
        if (this.oldContent.equals(stringWriter)) {
            return;
        }
        int lastIndexOf = this.file.getName().lastIndexOf(File.separatorChar);
        Writer openWriter = this.file.openWriter();
        try {
            openWriter.write(stringWriter);
            openWriter.close();
            Log.debug("Writing ".concat(this.file.getName().substring(lastIndexOf + 1)));
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (openWriter != null) {
                    try {
                        openWriter.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        this.newContent.write(cArr, i, i2);
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
    }
}
