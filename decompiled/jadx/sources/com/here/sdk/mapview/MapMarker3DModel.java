package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import com.here.NativeBase;
import com.here.sdk.core.Color;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class MapMarker3DModel extends NativeBase {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum InstantiationErrorCode {
        MISSING_TEXTURE_COORDINATES(0);

        public final int value;

        InstantiationErrorCode(int i) {
            this.value = i;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstantiationException extends Exception {
        public final InstantiationErrorCode error;

        public InstantiationException(InstantiationErrorCode instantiationErrorCode) {
            super(instantiationErrorCode.toString());
            this.error = instantiationErrorCode;
        }
    }

    public MapMarker3DModel(@NonNull String str, @NonNull String str2, @NonNull Color color) {
        this(make(str, str2, color), (Object) null);
        cacheThisInstance();
    }

    private native void cacheThisInstance();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    private static native long make(@NonNull Mesh mesh);

    private static native long make(@NonNull Mesh mesh, @NonNull String str) throws InstantiationException;

    private static native long make(@NonNull Mesh mesh, @NonNull String str, @NonNull Color color) throws InstantiationException;

    private static native long make(@NonNull String str);

    private static native long make(@NonNull String str, @NonNull String str2);

    private static native long make(@NonNull String str, @NonNull String str2, @NonNull Color color);

    public MapMarker3DModel(@NonNull Mesh mesh, @NonNull String str, @NonNull Color color) throws InstantiationException {
        this(make(mesh, str, color), (Object) null);
        cacheThisInstance();
    }

    public MapMarker3DModel(@NonNull String str, @NonNull String str2) {
        this(make(str, str2), (Object) null);
        cacheThisInstance();
    }

    public MapMarker3DModel(@NonNull Mesh mesh, @NonNull String str) throws InstantiationException {
        this(make(mesh, str), (Object) null);
        cacheThisInstance();
    }

    public MapMarker3DModel(@NonNull String str) {
        this(make(str), (Object) null);
        cacheThisInstance();
    }

    public MapMarker3DModel(@NonNull Mesh mesh) {
        this(make(mesh), (Object) null);
        cacheThisInstance();
    }

    public MapMarker3DModel(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MapMarker3DModel.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                MapMarker3DModel.disposeNativeHandle(j2);
            }
        });
    }
}
