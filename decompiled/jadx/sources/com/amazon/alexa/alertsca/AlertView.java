package com.amazon.alexa.alertsca;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.VisibleForTesting;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.amazon.alexa.alertsca.AlertsIntentFactory;
import com.amazon.alexa.alertsca.metrics.MetricsConstants;
import com.amazon.alexa.alertsca.metrics.service.MetricsService;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes16.dex */
public class AlertView {
    private static final String TAG = "AlertView";
    private final Context context;
    private final MetricsService metricsService;

    @Inject
    public AlertView(Context context, MetricsService metricsService) {
        this.context = context;
        this.metricsService = metricsService;
    }

    public void dismissAlert(AlertsToken alertsToken) {
        Intent intent = new Intent();
        intent.setAction(AlertsIntentFactory.Actions.DISMISS_UI);
        intent.putExtra(AlertsIntentFactory.ExtraKeys.ALERT_TOKEN, alertsToken.getValue());
        getLocalBroadcastManager().sendBroadcast(intent);
        this.metricsService.recordEvent(MetricsConstants.ALERTS.DISPLAY_ACTIVITY.ALERT_VIEW_DISMISS);
    }

    @VisibleForTesting
    public LocalBroadcastManager getLocalBroadcastManager() {
        return LocalBroadcastManager.getInstance(this.context);
    }

    public void showAlert(AlertRecord alertRecord) {
        this.context.startActivity(AlertsIntentFactory.getAlertsDisplayActivityIntent(this.context, alertRecord));
        this.metricsService.recordEvent(MetricsConstants.ALERTS.DISPLAY_ACTIVITY.ALERT_VIEW_SHOW.element(alertRecord.getType().name()));
    }
}
