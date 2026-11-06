package androidx.camera.core.imagecapture;

import androidx.camera.core.imagecapture.CaptureNode;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class CaptureNode$1$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ CaptureNode$1$$ExternalSyntheticLambda0(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((CaptureNode.AnonymousClass1) this.f$0).lambda$onCaptureProcessProgressed$1(this.f$1);
                break;
            default:
                ((TakePictureRequest) this.f$0).lambda$onCaptureProcessProgressed$3(this.f$1);
                break;
        }
    }
}
