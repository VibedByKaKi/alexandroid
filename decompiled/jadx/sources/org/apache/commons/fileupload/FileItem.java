package org.apache.commons.fileupload;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface FileItem extends FileItemHeadersSupport {
    void delete();

    byte[] get();

    String getContentType();

    String getFieldName();

    InputStream getInputStream() throws IOException;

    String getName();

    OutputStream getOutputStream() throws IOException;

    long getSize();

    String getString();

    String getString(String str) throws UnsupportedEncodingException;

    boolean isFormField();

    boolean isInMemory();

    void setFieldName(String str);

    void setFormField(boolean z);

    void write(File file) throws Exception;
}
