package com.here.sdk.core.engine;

import androidx.annotation.NonNull;
import com.here.NativeBase;
import com.here.sdk.core.SDKLibraryLoader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class SDKBuildInformation extends NativeBase {
    static final SDKLibraryLoader LIBRARY_LOADER = new SDKLibraryLoader("SDK");

    public SDKBuildInformation(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.core.engine.SDKBuildInformation.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                SDKBuildInformation.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @NonNull
    public static native SDKVersion sdkVersion();
}
