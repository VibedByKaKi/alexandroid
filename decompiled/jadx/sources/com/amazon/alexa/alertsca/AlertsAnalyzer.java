package com.amazon.alexa.alertsca;

import androidx.annotation.VisibleForTesting;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes16.dex */
public class AlertsAnalyzer {
    private static final String TAG = "AlertsAnalyzer";

    @VisibleForTesting
    static final long VALID_ALERT_DELIVERY_INTERVAL_MINUTES = 30;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface AlertExpireHandler {
        void onExpire(AlertRecord alertRecord);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface AlertLaunchHandler {
        void onLaunch(AlertRecord alertRecord);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface AlertScheduledHandler {
        boolean onSchedule(AlertRecord alertRecord);
    }

    @Inject
    public AlertsAnalyzer() {
    }

    private static long getTimeRemainingForAlert(long j) {
        return j - System.currentTimeMillis();
    }

    public boolean analyze(AlertRecord alertRecord, AlertScheduledHandler alertScheduledHandler, AlertLaunchHandler alertLaunchHandler, AlertExpireHandler alertExpireHandler) {
        Objects.toString(alertRecord.getToken());
        long timeRemainingForAlert = getTimeRemainingForAlert(alertRecord.getScheduledTime().getTime());
        if (1800000 + timeRemainingForAlert < 0) {
            alertExpireHandler.onExpire(alertRecord);
            return true;
        }
        if (timeRemainingForAlert > 0) {
            return alertScheduledHandler.onSchedule(alertRecord);
        }
        alertLaunchHandler.onLaunch(alertRecord);
        return true;
    }
}
