package com.amazon.deecomms.calling.video.display;

import androidx.annotation.NonNull;
import com.amazon.comms.calling.service.WebRTCViewRenderer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface VideoDisplayInterface {
    void hidePip();

    void maximiseVideo();

    void minimizeVideo(int i);

    void setBackground(boolean z, boolean z2);

    void setScalingType(@NonNull WebRTCViewRenderer.ScalingType scalingType);

    void showPip();
}
