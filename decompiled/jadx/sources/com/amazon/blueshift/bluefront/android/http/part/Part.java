package com.amazon.blueshift.bluefront.android.http.part;

import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.net.MediaType;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class Part {
    private static final String CONTENT_DISPOSITION_FORM_DATA = "Content-Disposition: form-data; name=\"";
    private static final String CONTENT_TYPE = "Content-Type: ";
    private static final String NEW_LINE = "\r\n";
    private static final char QUOTE = '\"';
    private final MediaType mContentType;
    private final String mName;

    public Part(String str, MediaType mediaType) {
        Preconditions.checkNotNull(str, "Part name cannot be null");
        Preconditions.checkNotNull(mediaType, "Part Content-Type cannot be null");
        this.mName = str;
        this.mContentType = mediaType;
    }

    private void writeBoundary(OutputStream outputStream, String str) throws IOException {
        outputStream.write(str.getBytes(Charsets.UTF_8.displayName()));
    }

    private void writeFooter(OutputStream outputStream) throws IOException {
        outputStream.write("\r\n".getBytes(Charsets.UTF_8.displayName()));
    }

    private void writeHeaders(OutputStream outputStream) throws IOException {
        outputStream.write((CONTENT_DISPOSITION_FORM_DATA + this.mName + "\"\r\nContent-Type: " + this.mContentType.toString() + "\r\n\r\n").getBytes(Charsets.UTF_8.displayName()));
    }

    public abstract void writeBody(OutputStream outputStream) throws Exception;

    public void writePart(OutputStream outputStream, String str) throws Exception {
        writeBoundary(outputStream, str);
        writeHeaders(outputStream);
        writeBody(outputStream);
        writeFooter(outputStream);
    }
}
