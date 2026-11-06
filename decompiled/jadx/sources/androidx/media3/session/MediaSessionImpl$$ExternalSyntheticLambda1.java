package androidx.media3.session;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class MediaSessionImpl$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MediaSessionImpl f$0;

    public /* synthetic */ MediaSessionImpl$$ExternalSyntheticLambda1(MediaSessionImpl mediaSessionImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaSessionImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        MediaSessionImpl mediaSessionImpl = this.f$0;
        switch (i) {
            case 0:
                mediaSessionImpl.lambda$release$2();
                break;
            case 1:
                mediaSessionImpl.lambda$onNotificationRefreshRequired$19();
                break;
            case 2:
                mediaSessionImpl.notifyPeriodicSessionPositionInfoChangesOnHandler();
                break;
            default:
                mediaSessionImpl.schedulePeriodicSessionPositionInfoChanges();
                break;
        }
    }
}
