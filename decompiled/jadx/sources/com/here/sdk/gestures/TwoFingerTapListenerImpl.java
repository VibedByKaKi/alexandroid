package com.here.sdk.gestures;

import androidx.annotation.NonNull;
import com.here.NativeBase;
import com.here.sdk.core.Point2D;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class TwoFingerTapListenerImpl extends NativeBase implements TwoFingerTapListener {
    public TwoFingerTapListenerImpl(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.gestures.TwoFingerTapListenerImpl.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                TwoFingerTapListenerImpl.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @Override // com.here.sdk.gestures.TwoFingerTapListener
    public native void onTwoFingerTap(@NonNull Point2D point2D);
}
