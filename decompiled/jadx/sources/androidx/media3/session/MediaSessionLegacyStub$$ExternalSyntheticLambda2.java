package androidx.media3.session;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class MediaSessionLegacyStub$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MediaSessionLegacyStub f$0;
    public final /* synthetic */ PlayerWrapper f$1;

    public /* synthetic */ MediaSessionLegacyStub$$ExternalSyntheticLambda2(MediaSessionLegacyStub mediaSessionLegacyStub, PlayerWrapper playerWrapper, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaSessionLegacyStub;
        this.f$1 = playerWrapper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$updateLegacySessionPlaybackState$23(this.f$1);
                break;
            default:
                this.f$0.lambda$updateLegacySessionPlaybackStateAndQueue$24(this.f$1);
                break;
        }
    }
}
