package androidx.camera.core.imagecapture;

import androidx.camera.core.impl.ImageReaderProxy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class CaptureNode$$ExternalSyntheticLambda2 implements ImageReaderProxy.OnImageAvailableListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CaptureNode f$0;

    public /* synthetic */ CaptureNode$$ExternalSyntheticLambda2(CaptureNode captureNode, int i) {
        this.$r8$classId = i;
        this.f$0 = captureNode;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        int i = this.$r8$classId;
        CaptureNode captureNode = this.f$0;
        switch (i) {
            case 0:
                captureNode.lambda$transform$1(imageReaderProxy);
                break;
            default:
                captureNode.lambda$setOnImageAvailableListener$2(imageReaderProxy);
                break;
        }
    }
}
