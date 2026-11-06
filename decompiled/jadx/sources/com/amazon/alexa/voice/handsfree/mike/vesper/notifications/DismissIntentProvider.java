package com.amazon.alexa.voice.handsfree.mike.vesper.notifications;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class DismissIntentProvider {
    public static final String EXTRA_NOTIFICATION_TEXT = "extra_notification_text";

    @NonNull
    public PendingIntent getDismissPendingIntent(@NonNull Context context, @NonNull String str) {
        Intent intent = new Intent(context, (Class<?>) NotificationDismissReceiver.class);
        intent.putExtra("extra_notification_text", str);
        return PendingIntent.getBroadcast(context, 0, intent, 67108864);
    }
}
