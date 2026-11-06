package com.amazon.alexa.voice.handsfree.mike.vesper.notifications.services;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.JobIntentService;
import androidx.core.app.SafeDequeueJobIntentService;
import com.amazon.alexa.handsfree.protocols.InitializerProvider;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.voice.handsfree.mike.vesper.notifications.configurations.NotificationScheduler;
import com.amazon.alexa.voice.handsfree.mike.vesper.notifications.notifiers.AppDownloadNotifier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class AppDownloadNotifierService extends SafeDequeueJobIntentService {
    private static final int JOB_ID = 30004;
    private static final String TAG = "AppDownloadNotifierService";
    private AppDownloadNotifier mAppDownloadNotifier;
    private NotificationScheduler mNotificationScheduler;

    @VisibleForTesting
    public AppDownloadNotifierService(@NonNull AppDownloadNotifier appDownloadNotifier, @NonNull NotificationScheduler notificationScheduler) {
        this.mAppDownloadNotifier = appDownloadNotifier;
        this.mNotificationScheduler = notificationScheduler;
    }

    public static void enqueueWork(@NonNull Context context, @NonNull Intent intent) {
        JobIntentService.enqueueWork(context, (Class<?>) AppDownloadNotifierService.class, JOB_ID, intent);
    }

    @VisibleForTesting
    public void handleNotification() {
        if (this.mAppDownloadNotifier.isNotificationRequired()) {
            Log.d(TAG, "notification is required.");
            this.mAppDownloadNotifier.updateNotificationCount();
            this.mAppDownloadNotifier.showNotification();
            this.mNotificationScheduler.scheduleNextNotification();
        }
    }

    @Override // androidx.core.app.SafeDequeueJobIntentService, androidx.core.app.JobIntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        InitializerProvider.getInitializer().initialize(this);
        this.mAppDownloadNotifier = new AppDownloadNotifier(this);
        this.mNotificationScheduler = new NotificationScheduler(this);
    }

    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(@NonNull Intent intent) {
        InitializerProvider.getInitializer().initialize(this);
        handleNotification();
    }

    public AppDownloadNotifierService() {
    }
}
