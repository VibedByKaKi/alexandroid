package com.amazon.alexa.accessorykit.metrics.session;

import com.amazon.alexa.accessory.Accessory;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AccessorySessionEpisode {
    private static final long ONE_HOUR_IN_MILLISECONDS = 3600000;
    private final Map<Accessory, SessionEpisode> sessionEpisodeMap = new HashMap();

    public boolean didSessionEpisodeStart(Accessory accessory) {
        SessionEpisode sessionEpisode = this.sessionEpisodeMap.get(accessory);
        return (sessionEpisode == null || sessionEpisode.sessionEpisodeStartTime == 0) ? false : true;
    }

    public void resetSessionEpisode(Accessory accessory) {
        this.sessionEpisodeMap.remove(accessory);
    }

    public boolean shouldRecordFailureEpisode(Accessory accessory) {
        SessionEpisode sessionEpisode = this.sessionEpisodeMap.get(accessory);
        if (sessionEpisode == null || System.currentTimeMillis() <= sessionEpisode.failureEpisodeStartTime + ONE_HOUR_IN_MILLISECONDS) {
            return false;
        }
        sessionEpisode.failureEpisodeStartTime = System.currentTimeMillis();
        return true;
    }

    public void startSessionEpisode(Accessory accessory, long j) {
        SessionEpisode sessionEpisode = this.sessionEpisodeMap.get(accessory);
        if (sessionEpisode != null) {
            sessionEpisode.sessionEpisodeStartTime = j;
        } else {
            this.sessionEpisodeMap.put(accessory, new SessionEpisode(j));
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SessionEpisode {
        private long failureEpisodeStartTime;
        private long sessionEpisodeStartTime;

        public SessionEpisode(long j) {
            this.failureEpisodeStartTime = 0L;
            this.sessionEpisodeStartTime = j;
        }

        public long getFailureEpisodeStartTime() {
            return this.failureEpisodeStartTime;
        }

        public long getSessionEpisodeStartTime() {
            return this.sessionEpisodeStartTime;
        }

        public SessionEpisode(long j, long j2, int i) {
            this.sessionEpisodeStartTime = j;
            this.failureEpisodeStartTime = j2;
        }
    }
}
