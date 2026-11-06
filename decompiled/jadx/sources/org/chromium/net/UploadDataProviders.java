package org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes11.dex */
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(File file) {
        return org.chromium.net.apihelpers.UploadDataProviders.create(file);
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return org.chromium.net.apihelpers.UploadDataProviders.create(parcelFileDescriptor);
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return org.chromium.net.apihelpers.UploadDataProviders.create(byteBuffer);
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return org.chromium.net.apihelpers.UploadDataProviders.create(bArr, i, i2);
    }

    public static UploadDataProvider create(byte[] bArr) {
        return org.chromium.net.apihelpers.UploadDataProviders.create(bArr);
    }
}
