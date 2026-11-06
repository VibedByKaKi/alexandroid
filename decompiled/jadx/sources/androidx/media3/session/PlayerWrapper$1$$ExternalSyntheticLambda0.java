package androidx.media3.session;

import androidx.media3.session.PlayerWrapper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class PlayerWrapper$1$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PlayerWrapper.AnonymousClass1 f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ PlayerWrapper$1$$ExternalSyntheticLambda0(PlayerWrapper.AnonymousClass1 anonymousClass1, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = anonymousClass1;
        this.f$1 = i;
        this.f$2 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onSetVolumeTo$0(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$onAdjustVolume$1(this.f$1, this.f$2);
                break;
        }
    }
}
