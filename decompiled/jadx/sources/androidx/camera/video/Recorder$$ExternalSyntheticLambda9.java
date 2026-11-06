package androidx.camera.video;

import androidx.camera.video.Recorder;
import androidx.camera.video.internal.encoder.Encoder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class Recorder$$ExternalSyntheticLambda9 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Recorder$$ExternalSyntheticLambda9(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                Recorder.lambda$stopInternal$13((Encoder) obj);
                break;
            case 1:
                ((Recorder.SetupVideoTask.AnonymousClass1) obj).lambda$onFailure$0();
                break;
            case 2:
                ((VideoEncoderSession) obj).lambda$terminateNow$3();
                break;
            default:
                ((VideoCapture) obj).notifyReset();
                break;
        }
    }
}
