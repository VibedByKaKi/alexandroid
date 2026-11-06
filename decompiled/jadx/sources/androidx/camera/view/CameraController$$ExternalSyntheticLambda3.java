package androidx.camera.view;

import androidx.arch.core.util.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class CameraController$$ExternalSyntheticLambda3 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ CameraController$$ExternalSyntheticLambda3(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        Void lambda$new$0;
        Void lambda$startPreviewStreamStateFlow$1;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                lambda$new$0 = ((CameraController) obj2).lambda$new$0((ProcessCameraProviderWrapper) obj);
                return lambda$new$0;
            case 1:
                return ((CameraController) obj2).enableTorch(((Boolean) obj).booleanValue());
            case 2:
                return ((CameraController) obj2).setLinearZoom(((Float) obj).floatValue());
            case 3:
                return ((CameraController) obj2).setZoomRatio(((Float) obj).floatValue());
            default:
                lambda$startPreviewStreamStateFlow$1 = ((PreviewStreamStateObserver) obj2).lambda$startPreviewStreamStateFlow$1((Void) obj);
                return lambda$startPreviewStreamStateFlow$1;
        }
    }
}
