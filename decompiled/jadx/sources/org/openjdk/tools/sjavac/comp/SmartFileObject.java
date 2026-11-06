package org.openjdk.tools.sjavac.comp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.nio.file.NoSuchFileException;
import org.apache.commons.lang3.SystemProperties;
import org.openjdk.javax.lang.model.element.Modifier;
import org.openjdk.javax.lang.model.element.NestingKind;
import org.openjdk.javax.tools.JavaFileObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class SmartFileObject implements JavaFileObject {
    static String lineseparator = System.getProperty(SystemProperties.LINE_SEPARATOR);
    JavaFileObject file;

    public SmartFileObject(JavaFileObject javaFileObject) {
        this.file = javaFileObject;
    }

    @Override // org.openjdk.javax.tools.FileObject
    public boolean delete() {
        return this.file.delete();
    }

    public boolean equals(Object obj) {
        return this.file.equals(obj);
    }

    @Override // org.openjdk.javax.tools.JavaFileObject
    public Modifier getAccessLevel() {
        return this.file.getAccessLevel();
    }

    @Override // org.openjdk.javax.tools.FileObject
    public CharSequence getCharContent(boolean z) throws IOException {
        return this.file.getCharContent(z);
    }

    @Override // org.openjdk.javax.tools.JavaFileObject
    public JavaFileObject.Kind getKind() {
        return this.file.getKind();
    }

    @Override // org.openjdk.javax.tools.FileObject
    public long getLastModified() {
        return this.file.getLastModified();
    }

    @Override // org.openjdk.javax.tools.FileObject
    public String getName() {
        return this.file.getName();
    }

    @Override // org.openjdk.javax.tools.JavaFileObject
    public NestingKind getNestingKind() {
        return this.file.getNestingKind();
    }

    public int hashCode() {
        return this.file.hashCode();
    }

    @Override // org.openjdk.javax.tools.JavaFileObject
    public boolean isNameCompatible(String str, JavaFileObject.Kind kind) {
        return this.file.isNameCompatible(str, kind);
    }

    @Override // org.openjdk.javax.tools.FileObject
    public InputStream openInputStream() throws IOException {
        return this.file.openInputStream();
    }

    @Override // org.openjdk.javax.tools.FileObject
    public OutputStream openOutputStream() throws IOException {
        return this.file.openOutputStream();
    }

    @Override // org.openjdk.javax.tools.FileObject
    public Reader openReader(boolean z) throws IOException {
        return this.file.openReader(z);
    }

    @Override // org.openjdk.javax.tools.FileObject
    public Writer openWriter() throws IOException {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(this.file.openReader(true));
            while (bufferedReader.ready()) {
                try {
                    sb.append(bufferedReader.readLine() + lineseparator);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            }
            bufferedReader.close();
        } catch (FileNotFoundException | NoSuchFileException unused) {
        }
        return new SmartWriter(this.file, sb.toString(), this.file.getName());
    }

    @Override // org.openjdk.javax.tools.FileObject
    public URI toUri() {
        return this.file.toUri();
    }
}
