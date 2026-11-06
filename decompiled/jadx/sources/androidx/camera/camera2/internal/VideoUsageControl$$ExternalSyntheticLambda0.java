package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class VideoUsageControl$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ VideoUsageControl f$0;

    public /* synthetic */ VideoUsageControl$$ExternalSyntheticLambda0(VideoUsageControl videoUsageControl, int i) {
        this.$r8$classId = i;
        this.f$0 = videoUsageControl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        VideoUsageControl videoUsageControl = this.f$0;
        switch (i) {
            case 0:
                VideoUsageControl.decrementUsage$lambda$1(videoUsageControl);
                break;
            case 1:
                VideoUsageControl.reset$lambda$2(videoUsageControl);
                break;
            default:
                VideoUsageControl.incrementUsage$lambda$0(videoUsageControl);
                break;
        }
    }
}
