package androidx.camera.video.internal.encoder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class EncoderImpl$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EncoderImpl f$0;

    public /* synthetic */ EncoderImpl$$ExternalSyntheticLambda2(EncoderImpl encoderImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = encoderImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        EncoderImpl encoderImpl = this.f$0;
        switch (i) {
            case 0:
                encoderImpl.lambda$stop$2();
                break;
            case 1:
                encoderImpl.lambda$release$6();
                break;
            case 2:
                encoderImpl.lambda$requestKeyFrame$8();
                break;
            case 3:
                encoderImpl.lambda$signalSourceStopped$7();
                break;
            case 4:
                encoderImpl.signalEndOfInputStream();
                break;
            default:
                encoderImpl.lambda$stop$3();
                break;
        }
    }
}
