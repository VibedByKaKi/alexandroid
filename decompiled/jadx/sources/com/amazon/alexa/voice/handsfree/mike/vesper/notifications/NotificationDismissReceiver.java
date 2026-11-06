package com.amazon.alexa.voice.handsfree.mike.vesper.notifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.Initializer;
import com.amazon.alexa.handsfree.protocols.InitializerProvider;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilderProvider;
import com.amazon.alexa.voice.handsfree.mike.vesper.notifications.metrics.NotificationDismissMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class NotificationDismissReceiver extends BroadcastReceiver {
    private static final String EMPTY_NOTIFICATION_TITLE = "";
    private static final String TAG = "NotificationDismissReceiver";
    private final Initializer mInitializer;

    public NotificationDismissReceiver() {
        this.mInitializer = InitializerProvider.getInitializer();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
        this.mInitializer.initialize(context);
        MetricsBuilderProvider.getInstance(context).newBuilder().withNotificationDismissMetric(TAG, NotificationDismissMetadata.NotificationTrigger.APP_DOWNLOAD_TIME_BASED_NOTIFICATION, "", intent.getStringExtra("extra_notification_text")).emit(context);
    }

    @VisibleForTesting
    public NotificationDismissReceiver(@NonNull Initializer initializer) {
        this.mInitializer = initializer;
    }
}
