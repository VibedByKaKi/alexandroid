package com.amazon.alexa.externalnotifications.capability;

import android.content.Context;
import android.util.Log;
import com.amazon.alexa.accessory.notificationpublisher.metrics.MetricsConstants;
import com.amazon.alexa.externalnotifications.capability.dependencies.AlexaMobileFrameworkModule;
import com.amazon.alexa.externalnotifications.capability.dependencies.ContextModule;
import com.amazon.alexa.externalnotifications.capability.dependencies.ExternalNotificationsCapabilityAgentModule;
import com.amazon.alexa.externalnotifications.capability.dependencies.GsonModule;
import com.amazon.alexa.externalnotifications.capability.directive.ExternalNotificationsDirectiveListener;
import com.amazon.alexa.externalnotifications.capability.events.ExternalNotificationsEventSender;
import com.amazon.alexa.externalnotifications.capability.models.Notification;
import com.amazon.alexa.externalnotifications.capability.models.NotificationId;
import com.google.common.base.Preconditions;
import dagger.Component;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ExternalNotificationsCapabilityAgent {
    private static final String TAG = "ExternalNotificationsCapabilityAgent";
    private Context context;
    private ExternalNotificationsDirectiveListener directiveListener;

    @Inject
    public ExternalNotificationsDirectiveReceiver directiveReceiver;

    @Inject
    public ExternalNotificationsEventSender eventSender;
    private ExternalNotificationsMetricsRecorder metricsRecorder;
    private ExternalNotificationsProvider notificationsProvider;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Component(modules = {ContextModule.class, GsonModule.class, AlexaMobileFrameworkModule.class, ExternalNotificationsCapabilityAgentModule.class})
    @Singleton
    public interface Injector {
        void inject(ExternalNotificationsCapabilityAgent externalNotificationsCapabilityAgent);
    }

    public ExternalNotificationsCapabilityAgent(Context context, ExternalNotificationsProvider externalNotificationsProvider, ExternalNotificationsDirectiveListener externalNotificationsDirectiveListener, ExternalNotificationsMetricsRecorder externalNotificationsMetricsRecorder) {
        Preconditions.checkNotNull(context, "Context cannot be null");
        Preconditions.checkNotNull(externalNotificationsDirectiveListener, "Directive listener cannot be null");
        this.context = context;
        this.notificationsProvider = externalNotificationsProvider;
        this.directiveListener = externalNotificationsDirectiveListener;
        this.metricsRecorder = externalNotificationsMetricsRecorder;
    }

    private void injectDependencies() {
        DaggerExternalNotificationsCapabilityAgent_Injector.builder().contextModule(new ContextModule(this.context)).externalNotificationsCapabilityAgentModule(new ExternalNotificationsCapabilityAgentModule(this.directiveListener, this.metricsRecorder)).build().inject(this);
    }

    public void destroy() {
        this.directiveReceiver.unregister();
        this.eventSender.teardown();
    }

    public void initialize() {
        injectDependencies();
        this.eventSender.initialize();
        this.directiveReceiver.register();
        uploadActiveNotifications();
    }

    @Deprecated
    public void onNotificationDismissed(NotificationId notificationId) {
        Preconditions.checkNotNull(TAG, "NotificationIds list cannot be null");
        notificationId.getValue();
        this.eventSender.sendNotificationsDismissedEvent(notificationId);
    }

    public void onNotificationRead(NotificationId notificationId) {
        Preconditions.checkNotNull(TAG, "NotificationId cannot be null");
        notificationId.getValue();
        this.eventSender.sendNotificationsReadEvent(notificationId);
    }

    public void onNotificationReceived(Notification notification) {
        Preconditions.checkNotNull(TAG, "Notification cannot be null");
        notification.getNotificationId().getValue();
        this.eventSender.sendNotificationsReceivedEvent(notification);
    }

    public void onNotificationsDismissed(List<NotificationId> list) {
        Preconditions.checkNotNull(list, "NotificationIds list cannot be null");
        Log.i(TAG, "onNotificationsDismissed");
        this.eventSender.sendNotificationsDismissedEvent(list);
        this.metricsRecorder.recordCounter(MetricsConstants.VIP_FILTER_TOTAL_NOTIFICATIONS_DISMISSED, list.size());
    }

    public void uploadActiveNotifications() {
        ExternalNotificationsProvider externalNotificationsProvider = this.notificationsProvider;
        if (externalNotificationsProvider == null) {
            Log.e(TAG, "uploadActiveNotifications: notificationsProvider is null, can't upload.");
            return;
        }
        List<Notification> activeNotifications = externalNotificationsProvider.getActiveNotifications();
        if (activeNotifications == null || activeNotifications.isEmpty()) {
            return;
        }
        String.format("Uploading %d active notifications", Integer.valueOf(activeNotifications.size()));
        this.metricsRecorder.recordCounter("uploadActiveNotifications", activeNotifications.size());
        this.eventSender.sendNotificationsReceivedEvent(activeNotifications);
    }

    public void uploadActiveNotifications(List<Notification> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        String.format("Uploading %d active notifications", Integer.valueOf(list.size()));
        this.eventSender.sendNotificationsReceivedEvent(list);
    }
}
