package org.webrtc;

import org.webrtc.Camera2Session;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final /* synthetic */ class VideoSource$$ExternalSyntheticLambda1 implements VideoSink {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ VideoSource$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((VideoSource) obj).lambda$setVideoProcessor$1(videoFrame);
                break;
            case 1:
                ((Camera1Session) obj).lambda$listenForTextureFrames$0(videoFrame);
                break;
            default:
                ((Camera2Session.CaptureSessionCallback) obj).lambda$onConfigured$0(videoFrame);
                break;
        }
    }
}
