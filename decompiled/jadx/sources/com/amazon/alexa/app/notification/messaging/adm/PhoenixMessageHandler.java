package com.amazon.alexa.app.notification.messaging.adm;

import ai.onnxruntime.TensorInfo$$ExternalSyntheticLambda4;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.app.notification.dagger.NotificationComponent;
import com.amazon.alexa.app.notification.dagger.NotificationDaggerWrapper;
import com.amazon.alexa.app.notification.util.Constants;
import com.amazon.alexa.app.notification.util.Log;
import com.amazon.alexa.crashreporting.api.CrashReporter;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.protocols.messaging.MessagingService;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;
import com.google.common.math.Stats$$ExternalSyntheticLambda0;
import java.util.Optional;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class PhoenixMessageHandler extends ADMMessageHandlerJobBase {
    private static final int RETRY_BEFORE_ANDROID_VERSION = 29;

    @VisibleForTesting
    static final int RETRY_COUNT = 3;

    @VisibleForTesting
    static final long SLEEP_MS = 250;
    static final String TAG = "PhoenixMessageHandler";
    private AmazonDeviceMessagingService amazonDeviceMessagingService;
    private Mobilytics mobilytics;

    private synchronized Optional<NotificationComponent> getComponentWithRetry() {
        NotificationComponent notificationComponent;
        try {
            notificationComponent = (NotificationComponent) Optional.ofNullable(getComponent()).orElseThrow(new Stats$$ExternalSyntheticLambda0(6));
        } catch (RuntimeException e) {
            Log.e(TAG, e.getMessage(), e);
            Optional.ofNullable((CrashReporter) ComponentRegistry.getInstance().get(CrashReporter.class).orNull()).ifPresent(new PhoenixMessageHandler$$ExternalSyntheticLambda3(e, 0));
            notificationComponent = null;
        }
        return Optional.ofNullable(notificationComponent);
    }

    private AmazonDeviceMessagingService getMessagingService() {
        if (this.amazonDeviceMessagingService == null) {
            MessagingService messagingService = (MessagingService) getComponentWithRetry().map(new TensorInfo$$ExternalSyntheticLambda4(8)).orElse(null);
            if (messagingService instanceof AmazonDeviceMessagingService) {
                this.amazonDeviceMessagingService = (AmazonDeviceMessagingService) messagingService;
            } else {
                Log.w(TAG, "Messaging service is not amazon but amazon message handler is invoked!");
            }
        }
        return this.amazonDeviceMessagingService;
    }

    private Mobilytics getMobilytics() {
        if (this.mobilytics == null) {
            this.mobilytics = (Mobilytics) getComponentWithRetry().map(new TensorInfo$$ExternalSyntheticLambda4(9)).orElse(null);
        }
        return this.mobilytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ RuntimeException lambda$getComponentWithRetry$0() {
        return new RuntimeException("NotificationComponent not initialized");
    }

    @VisibleForTesting
    public NotificationComponent getComponent() {
        return NotificationDaggerWrapper.getComponent();
    }

    public void onMessage(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        String str = TAG;
        Log.d(str, "Message received by app ADM listener.");
        Log.d(str, "Bundle: " + extras);
        if (getMessagingService() == null || extras == null) {
            return;
        }
        getMessagingService().handleMessage(extras);
    }

    public void onRegistered(Context context, String str) {
        if (getMobilytics() != null) {
            getMobilytics().recordOccurrence(Constants.MetricEvents.ADM_REGISTRATION_SUCCESS, true, "PushNotifications", Constants.MetricsComponents.NOTIFICATIONS_RECEIVER_SUBCOMPONENT, "1235005e-4e8f-4ef2-82bc-34157415015b");
        }
        if (getMessagingService() != null) {
            getMessagingService().requestRegistration(str);
        }
    }

    public void onRegistrationError(Context context, String str) {
        Log.e(TAG, "Error registering with ADM, reason: " + str);
        if (getMobilytics() != null) {
            getMobilytics().recordOccurrence(Constants.MetricEvents.ADM_REGISTRATION_SUCCESS, false, "PushNotifications", Constants.MetricsComponents.NOTIFICATIONS_RECEIVER_SUBCOMPONENT, "1235005e-4e8f-4ef2-82bc-34157415015b");
            getMobilytics().recordCriticalEvent(Constants.MetricEvents.ADM_REGISTRATION_ERROR, str, "PushNotifications", Constants.MetricsComponents.NOTIFICATIONS_RECEIVER_SUBCOMPONENT, new Exception(str), "1235005e-4e8f-4ef2-82bc-34157415015b");
        }
    }

    public void onUnregistered(Context context, String str) {
        if (getMessagingService() != null) {
            getMessagingService().requestDeregistration();
        }
    }

    public void setUpMessagingServiceForTest(AmazonDeviceMessagingService amazonDeviceMessagingService, Mobilytics mobilytics) {
        this.amazonDeviceMessagingService = amazonDeviceMessagingService;
        this.mobilytics = mobilytics;
    }

    @VisibleForTesting
    public void threadSleep(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException e) {
            Log.d(TAG, "Threading sleeping was interrupted", e);
        }
    }
}
