package org.apache.commons.fileupload;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class FileUpload extends FileUploadBase {
    private FileItemFactory fileItemFactory;

    public FileUpload(FileItemFactory fileItemFactory) {
        this.fileItemFactory = fileItemFactory;
    }

    @Override // org.apache.commons.fileupload.FileUploadBase
    public FileItemFactory getFileItemFactory() {
        return this.fileItemFactory;
    }

    @Override // org.apache.commons.fileupload.FileUploadBase
    public void setFileItemFactory(FileItemFactory fileItemFactory) {
        this.fileItemFactory = fileItemFactory;
    }

    public FileUpload() {
    }
}
