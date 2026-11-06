package com.amazon.alexa.accessory.frames.media.viewer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class MediaDisplayView$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MediaDisplayView f$0;

    public /* synthetic */ MediaDisplayView$$ExternalSyntheticLambda0(MediaDisplayView mediaDisplayView, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaDisplayView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        MediaDisplayView mediaDisplayView = this.f$0;
        switch (i) {
            case 0:
                mediaDisplayView.stepFling();
                break;
            default:
                mediaDisplayView.closeActivity();
                break;
        }
    }
}
