package org.openjdk.javax.tools;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.util.Objects;
import org.openjdk.javax.tools.FileObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ForwardingFileObject<F extends FileObject> implements FileObject {
    protected final F fileObject;

    public ForwardingFileObject(F f) {
        Objects.requireNonNull(f);
        this.fileObject = f;
    }

    @Override // org.openjdk.javax.tools.FileObject
    public boolean delete() {
        return this.fileObject.delete();
    }

    @Override // org.openjdk.javax.tools.FileObject
    public CharSequence getCharContent(boolean z) throws IOException {
        return this.fileObject.getCharContent(z);
    }

    @Override // org.openjdk.javax.tools.FileObject
    public long getLastModified() {
        return this.fileObject.getLastModified();
    }

    @Override // org.openjdk.javax.tools.FileObject
    public String getName() {
        return this.fileObject.getName();
    }

    @Override // org.openjdk.javax.tools.FileObject
    public InputStream openInputStream() throws IOException {
        return this.fileObject.openInputStream();
    }

    @Override // org.openjdk.javax.tools.FileObject
    public OutputStream openOutputStream() throws IOException {
        return this.fileObject.openOutputStream();
    }

    @Override // org.openjdk.javax.tools.FileObject
    public Reader openReader(boolean z) throws IOException {
        return this.fileObject.openReader(z);
    }

    @Override // org.openjdk.javax.tools.FileObject
    public Writer openWriter() throws IOException {
        return this.fileObject.openWriter();
    }

    @Override // org.openjdk.javax.tools.FileObject
    public URI toUri() {
        return this.fileObject.toUri();
    }
}
