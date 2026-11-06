package androidx.media3.session;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class MediaControllerHolder$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MediaControllerHolder f$0;
    public final /* synthetic */ MediaController f$1;

    public /* synthetic */ MediaControllerHolder$$ExternalSyntheticLambda0(MediaControllerHolder mediaControllerHolder, MediaController mediaController, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaControllerHolder;
        this.f$1 = mediaController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setController$0(this.f$1);
                break;
            default:
                this.f$0.setController(this.f$1);
                break;
        }
    }
}
