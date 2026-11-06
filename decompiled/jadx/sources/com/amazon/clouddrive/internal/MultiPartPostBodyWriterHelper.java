package com.amazon.clouddrive.internal;

import com.amazon.clouddrive.exceptions.CloudDriveException;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.URLConnection;
import java.net.URLEncoder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class MultiPartPostBodyWriterHelper {
    static final String BODY_END = "--*****--";
    static final String BODY_SEPARATOR = "--*****\r\n";
    static final String BOUNDARY = "*****";
    static final String CONTENT_DATA_HEADING_HEAD = "Content-Disposition: form-data; name=\"content\"; filename=\"";
    static final String CONTENT_DATA_HEADING_TAIL = "\"\r\n";
    static final String CONTENT_TYPE_HEADING = "Content-Type: %s\r\n";
    static final String DEFAULT_MIME_TYPE = "application/octet-stream";
    public static final String HEADER_CONTENT_TYPE = "multipart/form-data;boundary=*****";
    static final String LINE_END = "\r\n";
    static final String META_DATA_HEADING = "Content-Disposition: form-data; name=\"metadata\"\r\n";
    static final String TWO_HYPHENS = "--";
    private final ByteArrayOutputStream mBodyAfterFileContents;
    private final ByteArrayOutputStream mBodyBeforeFileContents;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private final DataOutputStream mAfterFileOS;
        private final DataOutputStream mBeforeFileOS;
        private final ByteArrayOutputStream mBodyAfterFileContents;
        private final ByteArrayOutputStream mBodyBeforeFileContents;
        private boolean mNeedsLineEnding = false;
        private String mName = "";
        private String mMimeType = "application/octet-stream";

        public Builder() {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.mBodyBeforeFileContents = byteArrayOutputStream;
            this.mBeforeFileOS = new DataOutputStream(byteArrayOutputStream);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            this.mBodyAfterFileContents = byteArrayOutputStream2;
            this.mAfterFileOS = new DataOutputStream(byteArrayOutputStream2);
        }

        private Builder addBodyAfterFileContents() throws IOException {
            if (this.mNeedsLineEnding) {
                this.mAfterFileOS.writeBytes("\r\n");
            }
            this.mAfterFileOS.writeBytes(MultiPartPostBodyWriterHelper.BODY_END);
            this.mAfterFileOS.flush();
            return this;
        }

        public Builder addContent() throws IOException {
            this.mNeedsLineEnding = true;
            RequestAssertUtils.assertNotNull(this.mName, "Name cannot be null.");
            RequestAssertUtils.assertNotNullOrEmpty(this.mMimeType, "MimeType cannot be null.");
            this.mBeforeFileOS.writeBytes(MultiPartPostBodyWriterHelper.BODY_SEPARATOR);
            this.mBeforeFileOS.writeBytes(MultiPartPostBodyWriterHelper.CONTENT_DATA_HEADING_HEAD);
            this.mBeforeFileOS.writeBytes(URLEncoder.encode(this.mName, "UTF-8"));
            this.mBeforeFileOS.writeBytes(MultiPartPostBodyWriterHelper.CONTENT_DATA_HEADING_TAIL);
            this.mBeforeFileOS.writeBytes("Content-Type: " + this.mMimeType + "\r\n");
            this.mBeforeFileOS.writeBytes("\r\n");
            this.mBeforeFileOS.flush();
            return this;
        }

        public <T> Builder addMetadata(T t, JsonSerializer<T> jsonSerializer) throws IOException, CloudDriveException, InterruptedException {
            RequestAssertUtils.assertNotNull(t, "Request cannot be null.");
            this.mBeforeFileOS.writeBytes(MultiPartPostBodyWriterHelper.BODY_SEPARATOR);
            this.mBeforeFileOS.writeBytes(MultiPartPostBodyWriterHelper.META_DATA_HEADING);
            this.mBeforeFileOS.writeBytes("\r\n");
            CloudDriveObjectMapper.writeStream(this.mBeforeFileOS, t, jsonSerializer);
            this.mBeforeFileOS.writeBytes("\r\n");
            this.mBeforeFileOS.flush();
            return this;
        }

        public MultiPartPostBodyWriterHelper build() throws IOException {
            addBodyAfterFileContents();
            return new MultiPartPostBodyWriterHelper(this);
        }

        public Builder withName(String str) {
            this.mName = str;
            String guessContentTypeFromName = URLConnection.guessContentTypeFromName(MultiPartPostBodyWriterHelper.getExtensionFromFilename(str));
            this.mMimeType = guessContentTypeFromName;
            if (guessContentTypeFromName == null) {
                this.mMimeType = "application/octet-stream";
            }
            return this;
        }
    }

    private MultiPartPostBodyWriterHelper(Builder builder) {
        this.mBodyBeforeFileContents = builder.mBodyBeforeFileContents;
        this.mBodyAfterFileContents = builder.mBodyAfterFileContents;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getExtensionFromFilename(String str) {
        if (str.endsWith("/")) {
            return ".html";
        }
        int lastIndexOf = str.lastIndexOf(46) + 1;
        int lastIndexOf2 = str.lastIndexOf(35);
        if (lastIndexOf2 < 0 || lastIndexOf2 <= lastIndexOf) {
            lastIndexOf2 = str.length();
        }
        return lastIndexOf > str.lastIndexOf(47) ? ".".concat(str.substring(lastIndexOf, lastIndexOf2)) : ".";
    }

    public ByteArrayOutputStream getBodyAfterFileContents() {
        return this.mBodyAfterFileContents;
    }

    public ByteArrayOutputStream getBodyBeforeFileContents() {
        return this.mBodyBeforeFileContents;
    }
}
