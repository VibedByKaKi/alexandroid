package com.here.sdk.gestures;

import com.here.NativeBase;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class FlingHandler extends NativeBase {
    public FlingHandler(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.gestures.FlingHandler.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                FlingHandler.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    public native void onFling(float f, float f2);
}
