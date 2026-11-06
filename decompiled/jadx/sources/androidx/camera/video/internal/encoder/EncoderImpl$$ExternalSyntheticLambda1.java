package androidx.camera.video.internal.encoder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class EncoderImpl$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EncoderImpl f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ EncoderImpl$$ExternalSyntheticLambda1(EncoderImpl encoderImpl, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = encoderImpl;
        this.f$1 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$pause$5(this.f$1);
                break;
            default:
                this.f$0.lambda$start$1(this.f$1);
                break;
        }
    }
}
