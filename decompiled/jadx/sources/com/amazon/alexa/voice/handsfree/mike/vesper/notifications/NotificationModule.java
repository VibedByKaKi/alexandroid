package com.amazon.alexa.voice.handsfree.mike.vesper.notifications;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.voice.handsfree.mike.vesper.notifications.channels.NotificationChannelManager;
import com.amazon.alexa.voice.handsfree.mike.vesper.notifications.configurations.NotificationScheduler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class NotificationModule {
    private boolean mIsInitialized;
    private Intent mNotificationClickIntent;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class LazyHolder {
        private static final NotificationModule INSTANCE = new NotificationModule(0);

        private LazyHolder() {
        }
    }

    public /* synthetic */ NotificationModule(int i) {
        this();
    }

    @NonNull
    public static NotificationModule getInstance() {
        return LazyHolder.INSTANCE;
    }

    @NonNull
    public Intent getNotificationClickIntent() {
        return this.mNotificationClickIntent;
    }

    public synchronized void initialize(@NonNull Context context, @NonNull Intent intent) {
        if (!this.mIsInitialized) {
            new NotificationChannelManager(context).createNotificationChannel();
            new NotificationScheduler(context).scheduleNextNotification();
            Log.d("NotificationModule", "initialize: Mike Vesper notifications initialized");
            this.mNotificationClickIntent = intent;
            this.mIsInitialized = true;
        }
    }

    private NotificationModule() {
    }
}
