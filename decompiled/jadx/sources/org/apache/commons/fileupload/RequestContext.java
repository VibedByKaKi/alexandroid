package org.apache.commons.fileupload;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface RequestContext {
    String getCharacterEncoding();

    @Deprecated
    int getContentLength();

    String getContentType();

    InputStream getInputStream() throws IOException;
}
