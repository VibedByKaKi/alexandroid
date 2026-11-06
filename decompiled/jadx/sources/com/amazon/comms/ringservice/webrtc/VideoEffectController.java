package com.amazon.comms.ringservice.webrtc;

import com.amazon.comms.calling.service.Call;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface VideoEffectController {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface VideoEffectChangeListener {
        void onVideoEffectChanged(VideoEffectController videoEffectController);
    }

    Call.VideoEffect getVideoEffect();

    void shutdown();

    void start(double d);

    void stop(double d);
}
