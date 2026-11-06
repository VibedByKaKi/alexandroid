package com.amazon.alexa.mobile.assistant.client.service;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.mobile.assistant.client.R;
import com.amazon.alexa.mobile.assistant.client.utils.FireTabletUtils;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u001c\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0012j\u0002`\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\fH\u0002J\r\u0010\u001a\u001a\u00020\tH\u0000¢\u0006\u0002\b\u001bJ\b\u0010\u001c\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/service/AssistantNotificationManager;", "", "service", "Landroid/app/Service;", "<init>", "(Landroid/app/Service;)V", "notificationManager", "Landroid/app/NotificationManager;", "foregroundServiceTypeForCurrentState", "", "foregroundServiceTypeForCurrentState$client_release", "startForeground", "", "stopForeground", "retryWithBaseline", "notification", "Landroid/app/Notification;", "cause", "Ljava/lang/Exception;", "Lkotlin/Exception;", "isAppInForeground", "", "hasPermission", "permission", "", "createChannel", "smallIconResource", "smallIconResource$client_release", "buildNotification", "Companion", "client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAssistantNotificationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssistantNotificationManager.kt\ncom/amazon/alexa/mobile/assistant/client/service/AssistantNotificationManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n1755#2,3:191\n*S KotlinDebug\n*F\n+ 1 AssistantNotificationManager.kt\ncom/amazon/alexa/mobile/assistant/client/service/AssistantNotificationManager\n*L\n149#1:191,3\n*E\n"})
/* loaded from: classes18.dex */
public final class AssistantNotificationManager {

    @NotNull
    public static final String CHANNEL_ID = "alexa_notification_channel";
    private static final int NON_WIU_FOREGROUND_SERVICE_TYPE = 2;
    public static final int NOTIFICATION_ID = 39705001;

    @NotNull
    private static final String TAG = "AssistantNotificationMgr";

    @NotNull
    private final NotificationManager notificationManager;

    @NotNull
    private final Service service;
    public static final int $stable = 8;

    public AssistantNotificationManager(@NotNull Service service) {
        service.getClass();
        this.service = service;
        Object systemService = service.getSystemService((Class<Object>) NotificationManager.class);
        if (systemService != null) {
            this.notificationManager = (NotificationManager) systemService;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("NotificationManager unavailable");
            throw null;
        }
    }

    private final Notification buildNotification() {
        Notification build = new Notification.Builder(this.service, CHANNEL_ID).setVisibility(-1).setSmallIcon(smallIconResource$client_release()).setColor(this.service.getColor(R.color.assistant_service_notification_color)).setContentTitle(this.service.getString(R.string.assistant_service_notification_title)).setContentText(this.service.getString(R.string.assistant_service_notification_text)).setOngoing(false).setShowWhen(false).setOnlyAlertOnce(true).build();
        build.getClass();
        return build;
    }

    private final void createChannel() {
        NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, this.service.getString(R.string.assistant_service_notification_channel_name), 2);
        notificationChannel.setDescription(this.service.getString(R.string.assistant_service_notification_channel_description));
        notificationChannel.enableLights(false);
        notificationChannel.enableVibration(false);
        this.notificationManager.createNotificationChannel(notificationChannel);
    }

    private final boolean hasPermission(String permission) {
        return this.service.checkSelfPermission(permission) == 0;
    }

    private final boolean isAppInForeground() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ActivityManager activityManager = (ActivityManager) this.service.getSystemService(ActivityManager.class);
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> list = runningAppProcesses;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
            if (runningAppProcessInfo.pid == myPid && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }

    private final void retryWithBaseline(Notification notification, Exception cause) {
        if (Build.VERSION.SDK_INT >= 34) {
            Log.w(TAG, "startForeground failed with computed type — retrying with baseline", cause);
            try {
                this.service.startForeground(NOTIFICATION_ID, notification, 2);
                return;
            } catch (Exception e) {
                Log.e(TAG, "startForeground retry also failed — stopping service", e);
            }
        } else {
            Log.e(TAG, "startForeground failed — stopping service", cause);
        }
        this.service.stopSelf();
    }

    public final int foregroundServiceTypeForCurrentState$client_release() {
        if (!isAppInForeground()) {
            return 2;
        }
        int i = hasPermission("android.permission.RECORD_AUDIO") ? 130 : 2;
        return (hasPermission("android.permission.ACCESS_FINE_LOCATION") || hasPermission("android.permission.ACCESS_COARSE_LOCATION")) ? i | 8 : i;
    }

    public final int smallIconResource$client_release() {
        return FireTabletUtils.isKHTablet() ? R.drawable.assistant_service_notification_icon_kh : R.drawable.assistant_service_notification_icon;
    }

    public final void startForeground() {
        createChannel();
        Notification buildNotification = buildNotification();
        try {
            int i = Build.VERSION.SDK_INT;
            Service service = this.service;
            if (i >= 34) {
                service.startForeground(NOTIFICATION_ID, buildNotification, foregroundServiceTypeForCurrentState$client_release());
            } else {
                service.startForeground(NOTIFICATION_ID, buildNotification);
            }
        } catch (IllegalStateException e) {
            retryWithBaseline(buildNotification, e);
        } catch (SecurityException e2) {
            retryWithBaseline(buildNotification, e2);
        }
    }

    public final void stopForeground() {
        this.service.stopForeground(1);
    }
}
