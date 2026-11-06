package com.amazon.photos.uploader.cds;

import android.content.ContentResolver;
import android.net.Uri;
import com.amazon.photos.uploader.internal.OpenForTesting;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@OpenForTesting
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/photos/uploader/cds/PartProvider;", "", "contentResolver", "Landroid/content/ContentResolver;", "(Landroid/content/ContentResolver;)V", "getPart", "", "contentUri", "Landroid/net/Uri;", "offset", "", "size", "", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PartProvider {

    @NotNull
    private final ContentResolver contentResolver;

    public PartProvider(@NotNull ContentResolver contentResolver) {
        contentResolver.getClass();
        this.contentResolver = contentResolver;
    }

    @NotNull
    public final byte[] getPart(@NotNull Uri contentUri, long offset, int size) {
        contentUri.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream openInputStream = this.contentResolver.openInputStream(contentUri);
        if (openInputStream != null) {
            byte[] bArr = new byte[size];
            openInputStream.skip(offset);
            int read = openInputStream.read(bArr);
            openInputStream.close();
            byteArrayOutputStream.write(bArr, 0, read);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }
}
