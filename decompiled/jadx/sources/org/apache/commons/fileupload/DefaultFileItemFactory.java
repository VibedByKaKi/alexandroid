package org.apache.commons.fileupload;

import java.io.File;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes9.dex */
public class DefaultFileItemFactory extends DiskFileItemFactory {
    @Deprecated
    public DefaultFileItemFactory() {
    }

    @Override // org.apache.commons.fileupload.disk.DiskFileItemFactory, org.apache.commons.fileupload.FileItemFactory
    @Deprecated
    public FileItem createItem(String str, String str2, boolean z, String str3) {
        return new DefaultFileItem(str, str2, z, str3, getSizeThreshold(), getRepository());
    }

    @Deprecated
    public DefaultFileItemFactory(int i, File file) {
        super(i, file);
    }
}
