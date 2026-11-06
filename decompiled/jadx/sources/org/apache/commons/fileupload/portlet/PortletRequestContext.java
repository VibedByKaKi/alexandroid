package org.apache.commons.fileupload.portlet;

import java.io.IOException;
import java.io.InputStream;
import javax.portlet.ActionRequest;
import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.fileupload.UploadContext;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class PortletRequestContext implements UploadContext {
    private final ActionRequest request;

    public PortletRequestContext(ActionRequest actionRequest) {
        this.request = actionRequest;
    }

    @Override // org.apache.commons.fileupload.UploadContext
    public long contentLength() {
        try {
            return Long.parseLong(this.request.getProperty(FileUploadBase.CONTENT_LENGTH));
        } catch (NumberFormatException unused) {
            return this.request.getContentLength();
        }
    }

    @Override // org.apache.commons.fileupload.RequestContext
    public String getCharacterEncoding() {
        return this.request.getCharacterEncoding();
    }

    @Override // org.apache.commons.fileupload.RequestContext
    @Deprecated
    public int getContentLength() {
        return this.request.getContentLength();
    }

    @Override // org.apache.commons.fileupload.RequestContext
    public String getContentType() {
        return this.request.getContentType();
    }

    @Override // org.apache.commons.fileupload.RequestContext
    public InputStream getInputStream() throws IOException {
        return this.request.getPortletInputStream();
    }

    public String toString() {
        return "ContentLength=" + contentLength() + ", ContentType=" + getContentType();
    }
}
