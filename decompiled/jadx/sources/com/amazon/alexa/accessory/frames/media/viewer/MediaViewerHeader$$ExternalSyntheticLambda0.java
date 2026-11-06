package com.amazon.alexa.accessory.frames.media.viewer;

import com.amazon.alexa.accessory.frames.media.viewer.VideoDisplayView;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class MediaViewerHeader$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ MediaViewerHeader$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((MediaViewerHeader) obj).lambda$expandBackButtonTouchTarget$0();
                break;
            case 1:
                ((VideoDisplayView.AnonymousClass1) obj).lambda$onVideoSizeChanged$0();
                break;
            default:
                ((MediaViewerFragment) obj).lambda$onViewCreated$1();
                break;
        }
    }
}
