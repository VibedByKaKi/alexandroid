package com.here.sdk.core.engine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.here.NativeBase;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class DeviceIdStorageImpl extends NativeBase implements DeviceIdStorage {
    public DeviceIdStorageImpl(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.core.engine.DeviceIdStorageImpl.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                DeviceIdStorageImpl.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @Override // com.here.sdk.core.engine.DeviceIdStorage
    @Nullable
    public native String retrieve();

    @Override // com.here.sdk.core.engine.DeviceIdStorage
    public native void store(@NonNull String str);
}
