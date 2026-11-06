package org.apache.commons.fileupload;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class FileCountLimitExceededException extends FileUploadException {
    private static final long serialVersionUID = 6904179610227521789L;
    private final long limit;

    public FileCountLimitExceededException(String str, long j) {
        super(str);
        this.limit = j;
    }

    public long getLimit() {
        return this.limit;
    }
}
