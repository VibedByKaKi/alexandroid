package com.amazon.deecomms.calling.video.streaming;

import androidx.annotation.NonNull;
import com.amazon.deecomms.app.SelfViewManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class SelfVideoStreamingPresenter implements VideoStreamingPresenterInterface {
    final SelfViewManager selfViewManager;

    public SelfVideoStreamingPresenter(@NonNull SelfViewManager selfViewManager) {
        this.selfViewManager = selfViewManager;
    }

    @Override // com.amazon.deecomms.calling.video.streaming.VideoStreamingPresenterInterface
    public void startStreaming() {
        this.selfViewManager.start();
    }

    @Override // com.amazon.deecomms.calling.video.streaming.VideoStreamingPresenterInterface
    public void stopStreaming() {
        this.selfViewManager.stop();
    }

    @Override // com.amazon.deecomms.calling.video.streaming.VideoStreamingPresenterInterface
    public void turnFrontSelfVideoFeedOn() {
        this.selfViewManager.setMirror(true);
    }

    @Override // com.amazon.deecomms.calling.video.streaming.VideoStreamingPresenterInterface
    public void turnRearSelfVideoFeedOn() {
        this.selfViewManager.setMirror(false);
    }
}
