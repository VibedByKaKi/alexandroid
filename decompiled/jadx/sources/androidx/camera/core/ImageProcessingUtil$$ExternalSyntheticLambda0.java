package androidx.camera.core;

import androidx.camera.core.ForwardingImageProxy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class ImageProcessingUtil$$ExternalSyntheticLambda0 implements ForwardingImageProxy.OnImageCloseListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ImageProxy f$0;
    public final /* synthetic */ ImageProxy f$1;

    public /* synthetic */ ImageProcessingUtil$$ExternalSyntheticLambda0(ImageProxy imageProxy, ImageProxy imageProxy2, int i) {
        this.$r8$classId = i;
        this.f$0 = imageProxy;
        this.f$1 = imageProxy2;
    }

    @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
    public final void onImageClose(ImageProxy imageProxy) {
        switch (this.$r8$classId) {
            case 0:
                ImageProcessingUtil.lambda$convertYUVToRGB$0(this.f$0, this.f$1, imageProxy);
                break;
            default:
                ImageProcessingUtil.lambda$rotateYUV$1(this.f$0, this.f$1, imageProxy);
                break;
        }
    }
}
