package com.amazon.comms.calling.infrastructure.extensions;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import com.amazon.comms.calling.R;
import com.amazon.comms.calling.data.util.NotificationConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"createChannelForCallingIfNeeded", "", "Landroid/app/NotificationManager;", "context", "Landroid/content/Context;", "createChannelForOngoingCallIfNeeded", "AlexaCommsCallingUI-Android_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class NotificationManagerExtKt {
    public static final void createChannelForCallingIfNeeded(@NotNull NotificationManager notificationManager, @NotNull Context context) {
        notificationManager.getClass();
        context.getClass();
        NotificationChannel notificationChannel = new NotificationChannel("com.amazon.deecomms.notifications.channel.calling.headup", context.getString(R.string.alexa_call), 4);
        notificationChannel.setLockscreenVisibility(1);
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static final void createChannelForOngoingCallIfNeeded(@NotNull NotificationManager notificationManager, @NotNull Context context) {
        notificationManager.getClass();
        context.getClass();
        NotificationChannel notificationChannel = new NotificationChannel(NotificationConstants.NOTIFICATIONS_CALLING_ONGOING_CHANNEL, context.getString(R.string.alexa_call), 1);
        notificationChannel.setLockscreenVisibility(1);
        notificationManager.createNotificationChannel(notificationChannel);
    }
}
