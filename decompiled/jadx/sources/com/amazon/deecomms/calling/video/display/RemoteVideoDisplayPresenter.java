package com.amazon.deecomms.calling.video.display;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.comms.calling.service.WebRTCViewRenderer;
import com.amazon.deecomms.app.RemoteViewManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class RemoteVideoDisplayPresenter implements VideoDisplayInterface {
    private Context context;
    private RemoteViewManager remoteViewManager;

    public RemoteVideoDisplayPresenter(@NonNull RemoteViewManager remoteViewManager, @NonNull Context context) {
        this.remoteViewManager = remoteViewManager;
        this.context = context;
    }

    @Override // com.amazon.deecomms.calling.video.display.VideoDisplayInterface
    public void setBackground(boolean z, boolean z2) {
        this.remoteViewManager.setVideoViewBackground(this.context, z, z2);
    }

    @Override // com.amazon.deecomms.calling.video.display.VideoDisplayInterface
    public void setScalingType(@NonNull WebRTCViewRenderer.ScalingType scalingType) {
        this.remoteViewManager.setScalingType(scalingType);
    }

    @Override // com.amazon.deecomms.calling.video.display.VideoDisplayInterface
    public void hidePip() {
    }

    @Override // com.amazon.deecomms.calling.video.display.VideoDisplayInterface
    public void maximiseVideo() {
    }

    @Override // com.amazon.deecomms.calling.video.display.VideoDisplayInterface
    public void showPip() {
    }

    @Override // com.amazon.deecomms.calling.video.display.VideoDisplayInterface
    public void minimizeVideo(int i) {
    }
}
