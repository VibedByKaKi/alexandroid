package androidx.camera.core;

import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageAnalysisNonBlockingAnalyzer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class SafeCloseImageReaderProxy$$ExternalSyntheticLambda1 implements ForwardingImageProxy.OnImageCloseListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ SafeCloseImageReaderProxy$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
    public final void onImageClose(ImageProxy imageProxy) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((SafeCloseImageReaderProxy) obj).lambda$new$0(imageProxy);
                break;
            default:
                ((ImageAnalysisNonBlockingAnalyzer.CacheAnalyzingImageProxy) obj).lambda$new$1(imageProxy);
                break;
        }
    }
}
