package com.amazon.alexa.client.alexaservice.features.alerts;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.AlertType;
import com.amazon.alexa.api.AlertsListener;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.utils.validation.Preconditions;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class AlertsAuthority {
    private static final String TAG = "AlertsAuthority";
    private final Set<AlertsListener> alertsListeners;
    private final AlexaClientEventBus eventBus;

    @VisibleForTesting
    public AlertsAuthority(AlexaClientEventBus alexaClientEventBus, Set<AlertsListener> set) {
        this.eventBus = alexaClientEventBus;
        this.alertsListeners = set;
        alexaClientEventBus.register(this);
    }

    private void notifyAlertStarted(String str, AlertType alertType) {
        Iterator<AlertsListener> it2 = this.alertsListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onAlertStarted(str, alertType);
        }
    }

    private void notifyAlertStopped(String str, AlertType alertType) {
        Iterator<AlertsListener> it2 = this.alertsListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onAlertFinished(str, alertType);
        }
    }

    public synchronized void addAlertsListener(AlertsListener alertsListener) {
        Preconditions.notNull(alertsListener, "alertsListener is null");
        this.alertsListeners.add(alertsListener);
    }

    @Subscribe
    public synchronized void on(AlertStartedEvent alertStartedEvent) {
        notifyAlertStarted(alertStartedEvent.getAlertId(), alertStartedEvent.getAlertType());
    }

    public synchronized void removeAlertsListener(AlertsListener alertsListener) {
        this.alertsListeners.remove(alertsListener);
    }

    public void teardown() {
        this.alertsListeners.clear();
        this.eventBus.unregister(this);
    }

    @Inject
    public AlertsAuthority(AlexaClientEventBus alexaClientEventBus) {
        this(alexaClientEventBus, new HashSet());
    }

    @Subscribe
    public synchronized void on(AlertStoppedEvent alertStoppedEvent) {
        notifyAlertStopped(alertStoppedEvent.getAlertId(), alertStoppedEvent.getAlertType());
    }
}
