package androidx.camera.video;

import androidx.camera.video.Recorder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class Recorder$$ExternalSyntheticLambda6 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Recorder f$0;
    public final /* synthetic */ Recorder.RecordingRecord f$1;

    public /* synthetic */ Recorder$$ExternalSyntheticLambda6(Recorder recorder, Recorder.RecordingRecord recordingRecord, int i) {
        this.$r8$classId = i;
        this.f$0 = recorder;
        this.f$1 = recordingRecord;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$pause$3(this.f$1);
                break;
            default:
                this.f$0.lambda$resume$4(this.f$1);
                break;
        }
    }
}
