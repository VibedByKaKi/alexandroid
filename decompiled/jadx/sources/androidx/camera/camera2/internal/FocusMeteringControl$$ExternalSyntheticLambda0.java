package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class FocusMeteringControl$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FocusMeteringControl f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ FocusMeteringControl$$ExternalSyntheticLambda0(int i, long j, FocusMeteringControl focusMeteringControl) {
        this.$r8$classId = i;
        this.f$0 = focusMeteringControl;
        this.f$1 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$executeMeteringAction$10(this.f$1);
                break;
            case 1:
                this.f$0.lambda$executeMeteringAction$8(this.f$1);
                break;
            case 2:
                this.f$0.lambda$executeMeteringAction$9(this.f$1);
                break;
            default:
                this.f$0.lambda$executeMeteringAction$11(this.f$1);
                break;
        }
    }
}
