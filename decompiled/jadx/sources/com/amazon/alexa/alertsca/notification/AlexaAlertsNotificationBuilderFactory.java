package com.amazon.alexa.alertsca.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.SystemClock;
import android.widget.RemoteViews;
import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.amazon.alexa.alertsca.AlertLabel;
import com.amazon.alexa.alertsca.AlertRecord;
import com.amazon.alexa.alertsca.AlertsIntentFactory;
import com.amazon.alexa.alertsca.utils.datetime.AlertsDateTimeFormatter;
import com.amazon.alexa.api.compat.model.AlertType;
import com.amazon.alexa.device.api.DeviceInformation;
import com.amazon.alexa.mosaic.themes.R;
import io.ktor.http.CodecsKt$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class AlexaAlertsNotificationBuilderFactory {
    private static final String ALERT_NOTIFICATION_GROUP_KEY = "ALERT_NOTIFICATION_GROUP_KEY";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.alertsca.notification.AlexaAlertsNotificationBuilderFactory$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$compat$model$AlertType;

        static {
            int[] iArr = new int[AlertType.values().length];
            $SwitchMap$com$amazon$alexa$api$compat$model$AlertType = iArr;
            try {
                iArr[AlertType.TIMER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$AlertType[AlertType.REMINDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$AlertType[AlertType.ALARM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface NotificationUpdateHandler {
        void onUpdate(AlertRecord alertRecord, String str);
    }

    private AlexaAlertsNotificationBuilderFactory() {
    }

    public static NotificationBuilder create(AlertRecord alertRecord, Context context, String str, @Nullable DeviceInformation deviceInformation, boolean z) {
        AlertRecord alertRecord2;
        Context context2;
        String str2;
        DeviceInformation deviceInformation2;
        boolean z2;
        String str3;
        RemoteViews remoteViews;
        RemoteViews remoteViews2;
        String string;
        int color = ContextCompat.getColor(context, R.color.neutral10);
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$api$compat$model$AlertType[alertRecord.getType().ordinal()];
        if (i != 1) {
            if (i == 2) {
                remoteViews2 = new RemoteViews(context.getPackageName(), com.amazon.alexa.alertsca.R.layout.amazon_avs_notification_alarm);
                remoteViews2.setTextColor(com.amazon.alexa.alertsca.R.id.amazon_avs_alarm_time, color);
                remoteViews2.setTextColor(com.amazon.alexa.alertsca.R.id.amazon_avs_alarm, color);
                string = context.getString(com.amazon.alexa.alertsca.R.string.amazon_avs_reminder_label);
                remoteViews2.setTextViewText(com.amazon.alexa.alertsca.R.id.amazon_avs_alarm_time, !AlertLabel.NONE.equals(alertRecord.getLabel()) ? alertRecord.getLabel().getValue() : string);
                remoteViews2.setTextViewText(com.amazon.alexa.alertsca.R.id.amazon_avs_alarm, string);
            } else {
                if (i != 3) {
                    CodecsKt$$ExternalSyntheticBUOutline0.m$1("Alert type: ", alertRecord.getType(), " is not supported yet.");
                    return null;
                }
                remoteViews2 = new RemoteViews(context.getPackageName(), com.amazon.alexa.alertsca.R.layout.amazon_avs_notification_alarm);
                remoteViews2.setTextColor(com.amazon.alexa.alertsca.R.id.amazon_avs_alarm_time, color);
                remoteViews2.setTextColor(com.amazon.alexa.alertsca.R.id.amazon_avs_alarm, color);
                String formatTime = new AlertsDateTimeFormatter(context).formatTime(alertRecord.getScheduledTime());
                string = context.getString(com.amazon.alexa.alertsca.R.string.amazon_avs_alarm_label);
                remoteViews2.setTextViewText(com.amazon.alexa.alertsca.R.id.amazon_avs_alarm, string);
                remoteViews2.setTextViewText(com.amazon.alexa.alertsca.R.id.amazon_avs_alarm_time, formatTime);
            }
            alertRecord2 = alertRecord;
            context2 = context;
            str2 = str;
            deviceInformation2 = deviceInformation;
            z2 = z;
            remoteViews = remoteViews2;
            str3 = string;
        } else {
            RemoteViews remoteViews3 = new RemoteViews(context.getPackageName(), com.amazon.alexa.alertsca.R.layout.amazon_avs_notification_timer);
            remoteViews3.setTextColor(com.amazon.alexa.alertsca.R.id.amazon_avs_timer_name, color);
            remoteViews3.setTextColor(com.amazon.alexa.alertsca.R.id.amazon_avs_timer_chronometer, color);
            String string2 = context.getString(com.amazon.alexa.alertsca.R.string.amazon_avs_timer_label);
            remoteViews3.setTextViewText(com.amazon.alexa.alertsca.R.id.amazon_avs_timer_name, !AlertLabel.NONE.equals(alertRecord.getLabel()) ? alertRecord.getLabel().getValue() : string2);
            remoteViews3.setChronometer(com.amazon.alexa.alertsca.R.id.amazon_avs_timer_chronometer, (alertRecord.getScheduledTime().getTime() - System.currentTimeMillis()) + SystemClock.elapsedRealtime(), null, true);
            remoteViews3.setChronometerCountDown(com.amazon.alexa.alertsca.R.id.amazon_avs_timer_chronometer, true);
            alertRecord2 = alertRecord;
            context2 = context;
            str2 = str;
            deviceInformation2 = deviceInformation;
            z2 = z;
            str3 = string2;
            remoteViews = remoteViews3;
        }
        return new NotificationBuilder(createNotificationBuilder(remoteViews, str3, context2, str2, alertRecord2, deviceInformation2, z2), remoteViews, com.amazon.alexa.alertsca.R.id.amazon_avs_timer_chronometer, 0);
    }

    public static NotificationCompat.Builder createDummy(Context context) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "alexa_alerts_channel");
        builder.setVisibility(1).setSmallIcon(com.amazon.alexa.alertsca.R.drawable.amazon_avs_alexaicon).setStyle(new NotificationCompat.DecoratedCustomViewStyle()).setColor(ContextCompat.getColor(context, R.color.neutral10)).setGroup(ALERT_NOTIFICATION_GROUP_KEY).setCategory(NotificationCompat.CATEGORY_ALARM).setProgress(0, 0, true).setOngoing(true);
        return builder;
    }

    private static NotificationCompat.Builder createNotificationBuilder(RemoteViews remoteViews, String str, Context context, String str2, AlertRecord alertRecord, @Nullable DeviceInformation deviceInformation, boolean z) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, str2);
        builder.setVisibility(1).setContentTitle(str).setSmallIcon(com.amazon.alexa.alertsca.R.drawable.amazon_avs_alexaicon).setStyle(new NotificationCompat.DecoratedCustomViewStyle()).setCustomContentView(remoteViews).setColor(ContextCompat.getColor(context, R.color.neutral10)).setGroup(ALERT_NOTIFICATION_GROUP_KEY).setCategory(NotificationCompat.CATEGORY_ALARM).addAction(com.amazon.alexa.alertsca.R.drawable.amazon_avs_alexaicon, context.getString(com.amazon.alexa.alertsca.R.string.amazon_avs_dismiss_text), AlertsIntentFactory.createNotificationStopIntent(context, alertRecord));
        if (z) {
            builder.setPriority(1);
            builder.setDefaults(-1);
        }
        if (!alertRecord.isReminder()) {
            builder.setOngoing(true);
            return builder;
        }
        builder.setContentIntent(AlertsIntentFactory.createNavigationPendingIntent(context, alertRecord, deviceInformation));
        builder.setOngoing(false).setDeleteIntent(AlertsIntentFactory.createNotificationStopIntent(context, alertRecord));
        return builder;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NotificationBuilder {

        @IdRes
        private final int chronometerResourceId;
        private final NotificationCompat.Builder notificationBuilder;
        private final RemoteViews view;

        private NotificationBuilder(NotificationCompat.Builder builder, @Nullable RemoteViews remoteViews, @IdRes int i) {
            this.notificationBuilder = builder;
            this.view = remoteViews;
            this.chronometerResourceId = i;
        }

        public Notification create() {
            return this.notificationBuilder.build();
        }

        public void setFullScreenIntent(PendingIntent pendingIntent, boolean z) {
            this.notificationBuilder.setFullScreenIntent(pendingIntent, z);
        }

        public /* synthetic */ NotificationBuilder(NotificationCompat.Builder builder, RemoteViews remoteViews, int i, int i2) {
            this(builder, remoteViews, i);
        }

        public void setTime(String str) {
        }
    }
}
