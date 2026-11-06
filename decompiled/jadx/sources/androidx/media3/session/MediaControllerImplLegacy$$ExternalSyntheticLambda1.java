package androidx.media3.session;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class MediaControllerImplLegacy$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MediaControllerImplLegacy f$0;

    public /* synthetic */ MediaControllerImplLegacy$$ExternalSyntheticLambda1(MediaControllerImplLegacy mediaControllerImplLegacy, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaControllerImplLegacy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        MediaControllerImplLegacy mediaControllerImplLegacy = this.f$0;
        switch (i) {
            case 0:
                mediaControllerImplLegacy.lambda$connectToSession$2();
                break;
            default:
                mediaControllerImplLegacy.lambda$connectToService$3();
                break;
        }
    }
}
