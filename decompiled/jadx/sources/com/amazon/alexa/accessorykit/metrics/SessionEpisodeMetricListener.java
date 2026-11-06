package com.amazon.alexa.accessorykit.metrics;

import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.AccessorySessionListener;
import com.amazon.alexa.accessory.internal.util.Logger;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessorykit.metrics.session.SessionEpisodeRecorder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class SessionEpisodeMetricListener extends AccessorySessionListener {
    private static final String TAG = "SessionEpisodeMetricListener:";
    private final SessionEpisodeRecorder sessionEpisodeRecorder;

    public SessionEpisodeMetricListener(SessionEpisodeRecorder sessionEpisodeRecorder) {
        Preconditions.notNull(sessionEpisodeRecorder, "sessionEpisodeRecorder");
        this.sessionEpisodeRecorder = sessionEpisodeRecorder;
    }

    @Override // com.amazon.alexa.accessory.AccessorySessionListener
    public void onAccessorySessionConnected(Accessory accessory) {
        super.onAccessorySessionConnected(accessory);
        Logger.d("%s received session connected %s", TAG, accessory.getAddress());
        this.sessionEpisodeRecorder.recordSessionConnectedEpisode(accessory);
    }

    @Override // com.amazon.alexa.accessory.AccessorySessionListener
    public void onAccessorySessionCreated(Accessory accessory) {
        super.onAccessorySessionCreated(accessory);
        Logger.d("%s received session creation %s", TAG, accessory.getAddress());
        this.sessionEpisodeRecorder.startSessionEpisode(accessory);
    }

    @Override // com.amazon.alexa.accessory.AccessorySessionListener
    public void onAccessorySessionFailed(Accessory accessory, Throwable th) {
        super.onAccessorySessionFailed(accessory, th);
        Logger.d("%s received session failure %s", th, TAG, accessory.getAddress());
        this.sessionEpisodeRecorder.recordHourlySessionFailureEpisode(accessory);
    }
}
