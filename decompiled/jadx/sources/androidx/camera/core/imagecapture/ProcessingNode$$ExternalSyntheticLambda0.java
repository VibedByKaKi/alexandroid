package androidx.camera.core.imagecapture;

import androidx.camera.core.imagecapture.ProcessingNode;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class ProcessingNode$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ProcessingNode f$0;
    public final /* synthetic */ ProcessingNode.InputPacket f$1;

    public /* synthetic */ ProcessingNode$$ExternalSyntheticLambda0(ProcessingNode processingNode, ProcessingNode.InputPacket inputPacket, int i) {
        this.$r8$classId = i;
        this.f$0 = processingNode;
        this.f$1 = inputPacket;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$transform$2(this.f$1);
                break;
            default:
                this.f$0.lambda$transform$0(this.f$1);
                break;
        }
    }
}
