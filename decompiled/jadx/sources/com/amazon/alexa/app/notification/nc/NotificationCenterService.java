package com.amazon.alexa.app.notification.nc;

import androidx.annotation.NonNull;
import com.amazon.alexa.accessory.frames.TopContactProvider$$ExternalSyntheticLambda0;
import com.amazon.alexa.app.notification.deeplink.NotificationDeeplinkHandler;
import com.amazon.alexa.app.notification.util.Constants;
import com.amazon.alexa.app.notification.util.Log;
import com.amazon.alexa.app.notification.util.directives.AlexaMobilePushDirective;
import com.amazon.alexa.app.notification.util.directives.commands.PushNotificationBadgeChange;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.message.EventTypeMessageFilter;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.identity.api.UserIdentity;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsCounter;
import com.google.gson.Gson;
import dagger.Lazy;
import java.util.Optional;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class NotificationCenterService {
    private static final String NOTIFICATION_BADGE_UPDATE_COMMAND = "PUSH_NOTIFICATION_BADGE_CHANGE";
    private final Lazy<NotificationDeeplinkHandler> deeplinkHandler;
    private final Lazy<EventBus> eventBus;
    private final Lazy<ExecutorService> executorService;
    private final Lazy<IdentityService> identityService;
    private final Lazy<NotificationCenterLifecycleObserver> lifecycleObserver;
    private final Lazy<Mobilytics> mobilytics;
    private final Lazy<DefaultNotificationCenterFetchImpl> ncFetch;
    private static final String TAG = Log.tag(NotificationCenterService.class);
    private static final Gson GSON = new Gson();

    public NotificationCenterService(Lazy<Mobilytics> lazy, Lazy<EventBus> lazy2, Lazy<NotificationDeeplinkHandler> lazy3, Lazy<DefaultNotificationCenterFetchImpl> lazy4, Lazy<IdentityService> lazy5, Lazy<ExecutorService> lazy6, Lazy<NotificationCenterLifecycleObserver> lazy7) {
        this.mobilytics = lazy;
        this.eventBus = lazy2;
        this.deeplinkHandler = lazy3;
        this.ncFetch = lazy4;
        this.identityService = lazy5;
        this.executorService = lazy6;
        this.lifecycleObserver = lazy7;
    }

    private boolean isIntendedForUser(@NonNull String str, Optional<String> optional) {
        String id;
        UserIdentity user = this.identityService.get().getUser(TAG);
        if (user == null || (id = user.getId()) == null || !id.equals(str)) {
            return false;
        }
        if (!optional.isPresent()) {
            return true;
        }
        String personId = user.getUserProfile().getPersonId();
        return personId != null && personId.equals(optional.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupDirectiveProcessor$1(Message message) {
        try {
            Gson gson = GSON;
            AlexaMobilePushDirective alexaMobilePushDirective = (AlexaMobilePushDirective) gson.fromJson(message.getPayloadAsString(), AlexaMobilePushDirective.class);
            if (alexaMobilePushDirective.getCommand().equals(NOTIFICATION_BADGE_UPDATE_COMMAND)) {
                PushNotificationBadgeChange pushNotificationBadgeChange = (PushNotificationBadgeChange) gson.fromJson(alexaMobilePushDirective.getPayload(), PushNotificationBadgeChange.class);
                if (isIntendedForUser(pushNotificationBadgeChange.getDestinationUserId(), pushNotificationBadgeChange.getDestinationActorId())) {
                    publishMessage(NotificationCenterEvent.SEND_LEGAL_HOME_BADGE_UPDATE_EVENT, Integer.toString(pushNotificationBadgeChange.getUnreadLegalCount()));
                }
            }
            recordOccurrence(Constants.MetricEvents.LEGAL_BADGE_UPDATE_SUCCESS);
        } catch (Exception e) {
            Log.e("[Notification Center]", "Failed to send legal badge update.", e);
            recordOccurrence(Constants.MetricEvents.LEGAL_BADGE_UPDATE_FAILURE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupHomePullToRefreshSubscription$0(Message message) {
        try {
            int fetchUnreadCount = this.ncFetch.get().fetchUnreadCount();
            publishMessage(NotificationCenterEvent.SEND_HOME_BADGE_UPDATE_EVENT, Integer.toString(fetchUnreadCount));
            recordCount(Constants.MetricEvents.NCS_REFRESH_UNREAD_COUNT_SUCCESS, fetchUnreadCount);
            recordOccurrence(Constants.MetricEvents.NCS_FETCH_UNREAD_COUNT_SHOW_BADGE, fetchUnreadCount > 0);
        } catch (Exception e) {
            Log.e(TAG, "Failed to get notification center unread count on home refresh.", e);
            recordOccurrence(Constants.MetricEvents.NCS_REFRESH_UNREAD_COUNT_FAILURE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateNotificationBadge$2() {
        try {
            int fetchUnreadCount = this.ncFetch.get().fetchUnreadCount();
            publishMessage(NotificationCenterEvent.SEND_HOME_BADGE_UPDATE_EVENT, Integer.toString(fetchUnreadCount));
            Log.d(TAG, "*** BADGE UPDATED *** Unread count: " + fetchUnreadCount + " - Event published: SEND_HOME_BADGE_UPDATE_EVENT");
        } catch (Exception e) {
            Log.e(TAG, "*** BADGE UPDATE FAILED ***", e);
        }
    }

    private void recordCount(@NonNull String str, int i) {
        MobilyticsMetricsCounter createCounter = this.mobilytics.get().createCounter(str, "PushNotifications", Constants.MetricsComponents.NOTIFICATION_CENTER_SUBCOMPONENT, "1235005e-4e8f-4ef2-82bc-34157415015b");
        createCounter.setChannelName("coreapp");
        createCounter.incrementCounterByValue(i);
        this.mobilytics.get().recordCounter(createCounter);
    }

    private void recordOccurrence(@NonNull String str, boolean z) {
        this.mobilytics.get().recordOccurrence(str, z, "PushNotifications", Constants.MetricsComponents.NOTIFICATION_CENTER_SUBCOMPONENT, "1235005e-4e8f-4ef2-82bc-34157415015b");
    }

    private void setupDirectiveProcessor() {
        this.eventBus.get().getNewSubscriber().subscribeFilter(new EventTypeMessageFilter(NotificationCenterEvent.DIRECTIVE_RECEIVED.name), new NotificationCenterService$$ExternalSyntheticLambda1(this, 0));
    }

    private void setupHomePullToRefreshSubscription() {
        this.eventBus.get().getNewSubscriber().subscribeFilter(new EventTypeMessageFilter(NotificationCenterEvent.HOME_REFRESH_EVENT.name), new NotificationCenterService$$ExternalSyntheticLambda1(this, 1));
    }

    public void init() {
        setupHomePullToRefreshSubscription();
        setupDirectiveProcessor();
        this.lifecycleObserver.get();
        this.deeplinkHandler.get().setupSubscription();
    }

    public void publishMessage(NotificationCenterEvent notificationCenterEvent, String str) {
        this.eventBus.get().lambda$getPublisher$0(new Message.Builder().setDate(System.currentTimeMillis()).setEventType(notificationCenterEvent.name).setSource(Message.Source.Local).setTTL(0L).setPayload(str).build());
    }

    public void updateNotificationBadge() {
        Log.d(TAG, "=== BADGE UPDATE REQUESTED ===");
        this.executorService.get().submit(new TopContactProvider$$ExternalSyntheticLambda0(this, 18));
    }

    private void recordOccurrence(@NonNull String str) {
        recordOccurrence(str, true);
    }
}
