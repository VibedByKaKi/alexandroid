package com.ReactNativeBlobUtil.Utils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class FileDescription {
    public String mimeType;
    public String name;
    public String partentFolder;

    public FileDescription(String str, String str2, String str3) {
        this.name = str;
        this.partentFolder = str3 == null ? "" : str3;
        this.mimeType = str2;
    }

    public String getFullPath() {
        return this.partentFolder + "/" + MimeType.getFullFileName(this.name, this.mimeType);
    }
}
