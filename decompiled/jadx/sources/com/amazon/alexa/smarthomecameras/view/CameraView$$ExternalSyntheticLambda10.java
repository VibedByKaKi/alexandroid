package com.amazon.alexa.smarthomecameras.view;

import com.facebook.react.modules.core.PermissionListener;
import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class CameraView$$ExternalSyntheticLambda10 implements Action1, PermissionListener {
    public final /* synthetic */ CameraView f$0;

    public /* synthetic */ CameraView$$ExternalSyntheticLambda10(CameraView cameraView) {
        this.f$0 = cameraView;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public void mo8903call(Object obj) {
        this.f$0.lambda$setupViews$4((Boolean) obj);
    }

    @Override // com.facebook.react.modules.core.PermissionListener
    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        boolean lambda$requestSystemMicPermission$8;
        lambda$requestSystemMicPermission$8 = this.f$0.lambda$requestSystemMicPermission$8(i, strArr, iArr);
        return lambda$requestSystemMicPermission$8;
    }
}
