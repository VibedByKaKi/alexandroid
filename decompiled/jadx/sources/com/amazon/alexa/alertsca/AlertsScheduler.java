package com.amazon.alexa.alertsca;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.alertsca.metrics.MetricsConstants;
import com.amazon.alexa.alertsca.metrics.service.MetricsService;
import com.amazon.alexa.device.api.DeviceInformation;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes16.dex */
public class AlertsScheduler {
    private static final String TAG = "AlertsScheduler";
    private final AlarmManager alarmManager;

    @Nullable
    private final DeviceInformation deviceInformation;
    private final MetricsService metricsService;
    private final Map<AlertsToken, PendingIntent> scheduledAlerts = new HashMap();

    @Inject
    public AlertsScheduler(AlarmManager alarmManager, MetricsService metricsService, @Nullable DeviceInformation deviceInformation) {
        this.alarmManager = alarmManager;
        this.metricsService = metricsService;
        this.deviceInformation = deviceInformation;
    }

    @VisibleForTesting
    public boolean isScheduled(AlertsToken alertsToken) {
        return this.scheduledAlerts.containsKey(alertsToken);
    }

    public boolean schedule(Context context, AlertRecord alertRecord, boolean z) {
        try {
            long time = alertRecord.getScheduledTime().getTime();
            long currentTimeMillis = System.currentTimeMillis();
            PendingIntent createPendingIntent = AlertsIntentFactory.createPendingIntent(context, alertRecord);
            this.alarmManager.setAlarmClock(new AlarmManager.AlarmClockInfo(currentTimeMillis + (time - currentTimeMillis), this.deviceInformation.isFireOS() ? AlertsIntentFactory.createShowIntent(context, alertRecord) : createPendingIntent), createPendingIntent);
            this.scheduledAlerts.put(alertRecord.getToken(), createPendingIntent);
            if (z) {
                return true;
            }
            this.metricsService.recordEvent(MetricsConstants.ALERTS.SCHEDULE.element(alertRecord.getType().name()).success());
            return true;
        } catch (Exception e) {
            this.metricsService.recordErrorWithException(MetricsConstants.ALERTS.SCHEDULE.element(alertRecord.getType().name()).failure().getEventName(), e);
            Log.e(TAG, "Couldn't schedule alert", e);
            return false;
        }
    }

    public void unSchedule(AlertsToken alertsToken) {
        Objects.toString(alertsToken);
        PendingIntent pendingIntent = this.scheduledAlerts.get(alertsToken);
        if (pendingIntent != null) {
            this.scheduledAlerts.remove(alertsToken);
            this.alarmManager.cancel(pendingIntent);
        }
        this.metricsService.recordEvent(MetricsConstants.ALERTS.UNSCHEDULE.result(pendingIntent != null));
    }
}
