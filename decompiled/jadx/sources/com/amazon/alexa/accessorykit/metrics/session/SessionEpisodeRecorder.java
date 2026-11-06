package com.amazon.alexa.accessorykit.metrics.session;

import com.amazon.alexa.accessory.Accessory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface SessionEpisodeRecorder {
    void recordHourlySessionFailureEpisode(Accessory accessory);

    void recordSessionConnectedEpisode(Accessory accessory);

    void startSessionEpisode(Accessory accessory);
}
