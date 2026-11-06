package com.amazon.clouddrive.cdasdk.cdus;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import lombok.Generated;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class UploadContextFormData {
    private long contentLength;

    @NonNull
    private Uri contentUri;
    private String fileName;
    private String nodeMetadataJson;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class UploadContextFormDataBuilder {

        @Generated
        private long contentLength;

        @Generated
        private Uri contentUri;

        @Generated
        private String fileName;

        @Generated
        private String nodeMetadataJson;

        @Generated
        public UploadContextFormDataBuilder() {
        }

        @Generated
        public UploadContextFormData build() {
            return new UploadContextFormData(this.nodeMetadataJson, this.contentUri, this.contentLength, this.fileName);
        }

        @Generated
        public UploadContextFormDataBuilder contentLength(long j) {
            this.contentLength = j;
            return this;
        }

        @Generated
        public UploadContextFormDataBuilder contentUri(@NonNull Uri uri) {
            if (uri != null) {
                this.contentUri = uri;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("contentUri is marked non-null but is null");
            return null;
        }

        @Generated
        public UploadContextFormDataBuilder fileName(String str) {
            this.fileName = str;
            return this;
        }

        @Generated
        public UploadContextFormDataBuilder nodeMetadataJson(String str) {
            this.nodeMetadataJson = str;
            return this;
        }

        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("UploadContextFormData.UploadContextFormDataBuilder(nodeMetadataJson=");
            sb.append(this.nodeMetadataJson);
            sb.append(", contentUri=");
            sb.append(this.contentUri);
            sb.append(", contentLength=");
            sb.append(this.contentLength);
            sb.append(", fileName=");
            return a$$ExternalSyntheticOutline0.m(sb, this.fileName, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @Generated
    public UploadContextFormData(String str, @NonNull Uri uri, long j, String str2) {
        if (uri == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("contentUri is marked non-null but is null");
            throw null;
        }
        this.nodeMetadataJson = str;
        this.contentUri = uri;
        this.contentLength = j;
        this.fileName = str2;
    }

    @Generated
    public static UploadContextFormDataBuilder builder() {
        return new UploadContextFormDataBuilder();
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof UploadContextFormData;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UploadContextFormData)) {
            return false;
        }
        UploadContextFormData uploadContextFormData = (UploadContextFormData) obj;
        if (!uploadContextFormData.canEqual(this) || getContentLength() != uploadContextFormData.getContentLength()) {
            return false;
        }
        String nodeMetadataJson = getNodeMetadataJson();
        String nodeMetadataJson2 = uploadContextFormData.getNodeMetadataJson();
        if (nodeMetadataJson != null ? !nodeMetadataJson.equals(nodeMetadataJson2) : nodeMetadataJson2 != null) {
            return false;
        }
        Uri contentUri = getContentUri();
        Uri contentUri2 = uploadContextFormData.getContentUri();
        if (contentUri != null ? !contentUri.equals(contentUri2) : contentUri2 != null) {
            return false;
        }
        String fileName = getFileName();
        String fileName2 = uploadContextFormData.getFileName();
        return fileName != null ? fileName.equals(fileName2) : fileName2 == null;
    }

    @Generated
    public long getContentLength() {
        return this.contentLength;
    }

    @NonNull
    @Generated
    public Uri getContentUri() {
        return this.contentUri;
    }

    @Generated
    public String getFileName() {
        return this.fileName;
    }

    @Generated
    public String getNodeMetadataJson() {
        return this.nodeMetadataJson;
    }

    @Generated
    public int hashCode() {
        long contentLength = getContentLength();
        String nodeMetadataJson = getNodeMetadataJson();
        int hashCode = ((((int) (contentLength ^ (contentLength >>> 32))) + 59) * 59) + (nodeMetadataJson == null ? 43 : nodeMetadataJson.hashCode());
        Uri contentUri = getContentUri();
        int i = hashCode * 59;
        int hashCode2 = contentUri == null ? 43 : contentUri.hashCode();
        String fileName = getFileName();
        return ((i + hashCode2) * 59) + (fileName != null ? fileName.hashCode() : 43);
    }

    @Generated
    public void setContentLength(long j) {
        this.contentLength = j;
    }

    @Generated
    public void setContentUri(@NonNull Uri uri) {
        if (uri != null) {
            this.contentUri = uri;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("contentUri is marked non-null but is null");
        }
    }

    @Generated
    public void setFileName(String str) {
        this.fileName = str;
    }

    @Generated
    public void setNodeMetadataJson(String str) {
        this.nodeMetadataJson = str;
    }

    @Generated
    public String toString() {
        return "UploadContextFormData(nodeMetadataJson=" + getNodeMetadataJson() + ", contentUri=" + getContentUri() + ", contentLength=" + getContentLength() + ", fileName=" + getFileName() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
