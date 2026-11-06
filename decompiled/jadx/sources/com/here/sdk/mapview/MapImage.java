package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import com.here.NativeBase;
import com.here.sdk.core.errors.InstantiationErrorException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class MapImage extends NativeBase {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum InstantiationErrorCode {
        UNKNOWN(1),
        UNSUPPORTED_IMAGE_FORMAT(2),
        INVALID_IMAGE_DIMENSIONS(3),
        EMPTY_FILE_PATH(4),
        EMPTY_IMAGE_DATA(5);

        final int value;

        InstantiationErrorCode(int i) {
            this.value = i;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstantiationException extends Exception {
        final InstantiationErrorCode error;

        public InstantiationException(InstantiationErrorCode instantiationErrorCode) {
            super(instantiationErrorCode.toString());
            this.error = instantiationErrorCode;
        }
    }

    public MapImage(@NonNull byte[] bArr, @NonNull ImageFormat imageFormat) {
        this(make(bArr, imageFormat), (Object) null);
        cacheThisInstance();
    }

    private native void cacheThisInstance();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    private static native long make(@NonNull String str, int i, int i2) throws InstantiationException;

    private static native long make(@NonNull String str, long j, long j2) throws InstantiationErrorException;

    private static native long make(@NonNull byte[] bArr) throws InstantiationException;

    private static native long make(@NonNull byte[] bArr, int i, int i2) throws InstantiationException;

    private static native long make(@NonNull byte[] bArr, @NonNull ImageFormat imageFormat);

    private static native long make(@NonNull byte[] bArr, @NonNull ImageFormat imageFormat, long j, long j2);

    public MapImage(@NonNull byte[] bArr, @NonNull ImageFormat imageFormat, long j, long j2) {
        this(make(bArr, imageFormat, j, j2), (Object) null);
        cacheThisInstance();
    }

    public MapImage(@NonNull byte[] bArr) throws InstantiationException {
        this(make(bArr), (Object) null);
        cacheThisInstance();
    }

    public MapImage(@NonNull byte[] bArr, int i, int i2) throws InstantiationException {
        this(make(bArr, i, i2), (Object) null);
        cacheThisInstance();
    }

    public MapImage(@NonNull String str, long j, long j2) throws InstantiationErrorException {
        this(make(str, j, j2), (Object) null);
        cacheThisInstance();
    }

    public MapImage(@NonNull String str, int i, int i2) throws InstantiationException {
        this(make(str, i, i2), (Object) null);
        cacheThisInstance();
    }

    public MapImage(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MapImage.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                MapImage.disposeNativeHandle(j2);
            }
        });
    }
}
