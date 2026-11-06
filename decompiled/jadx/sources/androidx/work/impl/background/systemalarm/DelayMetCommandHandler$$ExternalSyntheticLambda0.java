package androidx.work.impl.background.systemalarm;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class DelayMetCommandHandler$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DelayMetCommandHandler f$0;

    public /* synthetic */ DelayMetCommandHandler$$ExternalSyntheticLambda0(DelayMetCommandHandler delayMetCommandHandler, int i) {
        this.$r8$classId = i;
        this.f$0 = delayMetCommandHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        DelayMetCommandHandler delayMetCommandHandler = this.f$0;
        switch (i) {
            case 0:
                delayMetCommandHandler.stopWork();
                break;
            default:
                delayMetCommandHandler.startWork();
                break;
        }
    }
}
