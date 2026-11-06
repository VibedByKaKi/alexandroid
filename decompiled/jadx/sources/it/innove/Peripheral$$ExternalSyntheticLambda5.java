package it.innove;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class Peripheral$$ExternalSyntheticLambda5 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Peripheral f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ Peripheral$$ExternalSyntheticLambda5(Peripheral peripheral, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = peripheral;
        this.f$1 = i;
        this.f$2 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onMtuChanged$21(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$onReadRemoteRssi$8(this.f$1, this.f$2);
                break;
        }
    }
}
