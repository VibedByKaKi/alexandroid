package com.amazon.alexa.client.alexaservice.features.alerts;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.alertsca.AlertsIntentFactory;
import com.amazon.alexa.api.AlertType;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.RefreshCapabilitiesEvent;
import com.amazon.alexa.utils.validation.Preconditions;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class AlertsBroadcastReceiver extends BroadcastReceiver {

    @VisibleForTesting
    static final String ALERTS_PERMISSION_NAME = "com.amazon.alexa.alertsca.events.AlertEvent";
    private static final int RECEIVER_NOT_EXPORTED = 4;
    private static final String TAG = "AlertsBroadcastReceiver";
    private final Context context;
    private final AlexaClientEventBus eventBus;
    private boolean isRegistered = false;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Actions {
        static final String ACTION_ALERTS_STARTED = "com.amazon.alexa.alertsca.intent.action.ALERTS_STARTED";
        static final String ACTION_ALERTS_STOPPED = "com.amazon.alexa.alertsca.intent.action.ALERTS_STOPPED";
        static final String ACTION_UPDATE_CAPABILITIES = "com.amazon.alexa.alertsca.intent.action.UPDATE_CAPABILITIES";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ExtraKeys {
        static final String ALERT_RECORD_ID = "com.amazon.alexa.alertsca.intent.extra.ALERT_RECORD_ID";
        static final String ALERT_RECORD_TYPE = "com.amazon.alexa.alertsca.intent.extra.ALERT_RECORD_TYPE";
    }

    @Inject
    public AlertsBroadcastReceiver(Context context, AlexaClientEventBus alexaClientEventBus) {
        this.context = context;
        this.eventBus = alexaClientEventBus;
    }

    private String getAlertId(Intent intent) {
        String stringExtra = intent.getStringExtra(AlertsIntentFactory.ExtraKeys.ALERT_RECORD_ID);
        Preconditions.notNull(stringExtra, "alertId is null");
        return stringExtra;
    }

    private AlertType getAlertType(Intent intent) {
        return AlertType.fromOrdinal(intent.getIntExtra(AlertsIntentFactory.ExtraKeys.ALERT_RECORD_TYPE, -1));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action;
        String str;
        action = intent.getAction();
        Preconditions.notNull(action, "action is null");
        str = TAG;
        action.getClass();
        switch (action) {
            case "com.amazon.alexa.alertsca.intent.action.UPDATE_CAPABILITIES":
                this.eventBus.post(RefreshCapabilitiesEvent.create());
                break;
            case "com.amazon.alexa.alertsca.intent.action.ALERTS_STARTED":
                try {
                    this.eventBus.post(AlertStartedEvent.create(getAlertId(intent), getAlertType(intent)));
                    break;
                } catch (Exception e) {
                    Log.e(TAG, "malformed alert intent", e);
                    return;
                }
            case "com.amazon.alexa.alertsca.intent.action.ALERTS_STOPPED":
                try {
                    this.eventBus.post(AlertStoppedEvent.create(getAlertId(intent), getAlertType(intent)));
                    break;
                } catch (Exception e2) {
                    Log.e(TAG, "malformed alert intent", e2);
                    return;
                }
            default:
                Log.w(str, "Unrecognized action intent:".concat(action));
                break;
        }
    }

    public void register() {
        AlertsBroadcastReceiver alertsBroadcastReceiver;
        if (this.isRegistered) {
            return;
        }
        IntentFilter m = TableInfo$$ExternalSyntheticOutline0.m("com.amazon.alexa.alertsca.intent.action.ALERTS_STARTED", "com.amazon.alexa.alertsca.intent.action.ALERTS_STOPPED");
        int i = Build.VERSION.SDK_INT;
        Context context = this.context;
        if (i >= 34) {
            alertsBroadcastReceiver = this;
            context.registerReceiver(alertsBroadcastReceiver, m, ALERTS_PERMISSION_NAME, null, 4);
        } else {
            alertsBroadcastReceiver = this;
            context.registerReceiver(alertsBroadcastReceiver, m, ALERTS_PERMISSION_NAME, null);
        }
        alertsBroadcastReceiver.isRegistered = true;
    }

    public void unregister() {
        if (this.isRegistered) {
            this.context.unregisterReceiver(this);
            this.isRegistered = false;
        }
    }
}
