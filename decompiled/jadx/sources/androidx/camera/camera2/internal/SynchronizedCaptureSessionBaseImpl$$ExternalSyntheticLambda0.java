package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class SynchronizedCaptureSessionBaseImpl$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SynchronizedCaptureSessionBaseImpl f$0;
    public final /* synthetic */ SynchronizedCaptureSession f$1;

    public /* synthetic */ SynchronizedCaptureSessionBaseImpl$$ExternalSyntheticLambda0(SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl, SynchronizedCaptureSession synchronizedCaptureSession, int i) {
        this.$r8$classId = i;
        this.f$0 = synchronizedCaptureSessionBaseImpl;
        this.f$1 = synchronizedCaptureSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onSessionFinished$4(this.f$1);
                break;
            default:
                this.f$0.lambda$onClosed$3(this.f$1);
                break;
        }
    }
}
