package com.amazon.deecomms.calling.video.display;

import androidx.annotation.NonNull;
import com.amazon.comms.calling.service.WebRTCViewRenderer;
import com.amazon.deecomms.app.SelfViewManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class SelfVideoDisplayPresenter implements VideoDisplayInterface {
    private SelfViewManager selfViewManager;

    public SelfVideoDisplayPresenter(@NonNull SelfViewManager selfViewManager) {
        this.selfViewManager = selfViewManager;
    }

    @Override // com.amazon.deecomms.calling.video.display.VideoDisplayInterface
    public void hidePip() {
        this.selfViewManager.hidePip();
    }

    public void hideScrim() {
        this.selfViewManager.hideScrim();
    }

    @Override // com.amazon.deecomms.calling.video.display.VideoDisplayInterface
    public void maximiseVideo() {
        this.selfViewManager.maximizeSelfView();
    }

    @Override // com.amazon.deecomms.calling.video.display.VideoDisplayInterface
    public void minimizeVideo(int i) {
        this.selfViewManager.minimizeSelfView(i);
    }

    @Override // com.amazon.deecomms.calling.video.display.VideoDisplayInterface
    public void setBackground(boolean z, boolean z2) {
        this.selfViewManager.setVideoViewBackground(null, z, z2);
    }

    @Override // com.amazon.deecomms.calling.video.display.VideoDisplayInterface
    public void showPip() {
        this.selfViewManager.showPip();
    }

    public void showScrim() {
        this.selfViewManager.showScrim();
    }

    @Override // com.amazon.deecomms.calling.video.display.VideoDisplayInterface
    public void setScalingType(@NonNull WebRTCViewRenderer.ScalingType scalingType) {
    }
}
