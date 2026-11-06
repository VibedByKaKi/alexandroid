package com.amazon.deecomms.calling.ui.listener;

import androidx.annotation.NonNull;
import com.amazon.comms.calling.service.WebRTCViewRenderer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface VideoDisplayListener {
    void hidePip();

    void hideScrim();

    void maximizeVideo(boolean z);

    void minimizeVideo(@NonNull int i, boolean z);

    void onSetBackground(boolean z, boolean z2, boolean z3);

    void setScalingType(@NonNull WebRTCViewRenderer.ScalingType scalingType, boolean z);

    void showPip();

    void showScrim();
}
