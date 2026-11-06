package com.amazon.comms.ringservice.webrtc;

import android.os.Handler;
import com.amazon.comms.calling.service.Call;
import com.amazon.comms.log.CommsLogger;
import org.webrtc.RendererEventsShim;
import org.webrtc.WebRTCRendererShim;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class VideoRendererEventsHandler implements RendererEventsShim {
    private static final CommsLogger log = CommsLogger.getLogger(VideoRendererEventsHandler.class);
    private final Handler callbackHandler;
    private final WebRTCRendererShim renderer;
    private final boolean shouldSimulateFirstFrameReceived;
    private final Call.Side side;
    private final VideoRendererEventsListener videoRendererEventsListener;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface VideoRendererEventsListener {
        void onFirstFrameReceived(Call.Side side);

        void onFirstFrameRendered(Call.Side side);

        void onLocalFrameResolutionChanged(int i, int i2, int i3);

        void onRemoteFrameResolutionChanged(int i, int i2, int i3);
    }

    public VideoRendererEventsHandler(Call.Side side, WebRTCRendererShim webRTCRendererShim, VideoRendererEventsListener videoRendererEventsListener, Handler handler, boolean z) {
        this.side = side;
        this.renderer = webRTCRendererShim;
        this.callbackHandler = handler;
        this.videoRendererEventsListener = videoRendererEventsListener;
        this.shouldSimulateFirstFrameReceived = z;
    }

    @Override // org.webrtc.RendererEventsShim
    public void onFirstFrameReceived() {
        this.callbackHandler.post(new Runnable() { // from class: com.amazon.comms.ringservice.webrtc.VideoRendererEventsHandler.2
            @Override // java.lang.Runnable
            public void run() {
                VideoRendererEventsHandler.this.renderer.setFirstFrameReceived();
                if (VideoRendererEventsHandler.this.videoRendererEventsListener != null) {
                    VideoRendererEventsHandler.this.videoRendererEventsListener.onFirstFrameReceived(VideoRendererEventsHandler.this.side);
                } else {
                    VideoRendererEventsHandler.log.i("onFirstFrameReceived when session is not attached to a call");
                }
                VideoRendererEventsHandler.log.i("onFirstFrameReceived, side:" + VideoRendererEventsHandler.this.side);
            }
        });
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public void onFirstFrameRendered() {
        if (this.shouldSimulateFirstFrameReceived) {
            onFirstFrameReceived();
        }
        this.callbackHandler.post(new Runnable() { // from class: com.amazon.comms.ringservice.webrtc.VideoRendererEventsHandler.1
            @Override // java.lang.Runnable
            public void run() {
                VideoRendererEventsHandler.this.renderer.setFirstFrameRendered();
                if (VideoRendererEventsHandler.this.videoRendererEventsListener != null) {
                    VideoRendererEventsHandler.this.videoRendererEventsListener.onFirstFrameRendered(VideoRendererEventsHandler.this.side);
                }
                VideoRendererEventsHandler.log.i("onFirstFrameRendered, side:" + VideoRendererEventsHandler.this.side);
            }
        });
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public void onFrameResolutionChanged(final int i, final int i2, final int i3) {
        Call.Side side = this.side;
        if (side == Call.Side.Remote) {
            this.callbackHandler.post(new Runnable() { // from class: com.amazon.comms.ringservice.webrtc.VideoRendererEventsHandler.3
                @Override // java.lang.Runnable
                public void run() {
                    VideoRendererEventsHandler.this.videoRendererEventsListener.onRemoteFrameResolutionChanged(i, i2, i3);
                    VideoRendererEventsHandler.log.i("onRemoteFrameResolutionChanged (remote): " + i + "x" + i2 + " " + i3 + "degrees");
                }
            });
        } else if (side == Call.Side.Local) {
            this.callbackHandler.post(new Runnable() { // from class: com.amazon.comms.ringservice.webrtc.VideoRendererEventsHandler.4
                @Override // java.lang.Runnable
                public void run() {
                    if (VideoRendererEventsHandler.this.videoRendererEventsListener != null) {
                        VideoRendererEventsHandler.this.videoRendererEventsListener.onLocalFrameResolutionChanged(i, i2, i3);
                        VideoRendererEventsHandler.log.i("onLocalFrameResolutionChanged (local): " + i + "x" + i2 + " " + i3 + "degrees");
                    }
                }
            });
        }
    }
}
