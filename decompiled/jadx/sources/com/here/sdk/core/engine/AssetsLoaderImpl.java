package com.here.sdk.core.engine;

import androidx.annotation.NonNull;
import com.here.NativeBase;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class AssetsLoaderImpl extends NativeBase implements AssetsLoader {
    public AssetsLoaderImpl(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.core.engine.AssetsLoaderImpl.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                AssetsLoaderImpl.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @Override // com.here.sdk.core.engine.AssetsLoader
    public native boolean checkAssetAvailability(@NonNull String str);

    @Override // com.here.sdk.core.engine.AssetsLoader
    @NonNull
    public native String getAssetsPath();

    @Override // com.here.sdk.core.engine.AssetsLoader
    @NonNull
    public native List<String> getSubfolderNames(@NonNull String str);

    @Override // com.here.sdk.core.engine.AssetsLoader
    @NonNull
    public native String loadAsset(@NonNull String str);

    @Override // com.here.sdk.core.engine.AssetsLoader
    @NonNull
    public native byte[] loadAssetBlob(@NonNull String str);
}
