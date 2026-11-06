package com.here.sdk.gestures;

import androidx.annotation.NonNull;
import com.here.NativeBase;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class InternalGestureDetector extends NativeBase {
    public InternalGestureDetector(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.gestures.InternalGestureDetector.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                InternalGestureDetector.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @NonNull
    public native Gestures getGestures();

    public native void processTouchEvent(@NonNull Map<Long, TouchPoint> map, long j, @NonNull TouchPhase touchPhase);

    public native void setPixelScale(float f);
}
