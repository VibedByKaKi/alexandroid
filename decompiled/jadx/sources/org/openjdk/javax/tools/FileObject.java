package org.openjdk.javax.tools;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface FileObject {
    boolean delete();

    CharSequence getCharContent(boolean z) throws IOException;

    long getLastModified();

    String getName();

    InputStream openInputStream() throws IOException;

    OutputStream openOutputStream() throws IOException;

    Reader openReader(boolean z) throws IOException;

    Writer openWriter() throws IOException;

    URI toUri();
}
