package com.amazon.comms.calling.infrastructure;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.amazon.comms.calling.R;
import com.amazon.comms.calling.data.util.NotificationConstants;
import com.amazon.comms.calling.data.util.Utils;
import com.amazon.comms.calling.foundation.CallingLogger;
import com.amazon.comms.calling.foundation.metrics.MetricKeys;
import com.amazon.comms.calling.foundation.metrics.MetricsManager;
import com.amazon.comms.calling.infrastructure.extensions.NotificationManagerExtKt;
import com.amazon.comms.calling.presentation.ui.CallActivity;
import com.amazon.comms.log.CommsLogger;
import com.bugsnag.android.Bugsnag;
import defpackage.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0003J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\"\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006!"}, d2 = {"Lcom/amazon/comms/calling/infrastructure/OngoingCallNotificationImpl;", "Lcom/amazon/comms/calling/infrastructure/OngoingCallNotification;", "context", "Landroid/content/Context;", "notificationManager", "Landroid/app/NotificationManager;", "utils", "Lcom/amazon/comms/calling/data/util/Utils;", "metricManager", "Lcom/amazon/comms/calling/foundation/metrics/MetricsManager;", "stringHelper", "Lcom/amazon/comms/calling/infrastructure/StringHelper;", "<init>", "(Landroid/content/Context;Landroid/app/NotificationManager;Lcom/amazon/comms/calling/data/util/Utils;Lcom/amazon/comms/calling/foundation/metrics/MetricsManager;Lcom/amazon/comms/calling/infrastructure/StringHelper;)V", "LOG", "Lcom/amazon/comms/log/CommsLogger;", "getLOG", "()Lcom/amazon/comms/log/CommsLogger;", "LOG$delegate", "Lcom/amazon/comms/calling/foundation/CallingLogger;", "createOngoingCallNotification", "Landroid/app/Notification;", "title", "", "participantName", "callStartTime", "", "getPendingIntent", "Landroid/app/PendingIntent;", "getDeclineIntent", "showOngoingCallNotification", "", "cancelOngoingCallNotification", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class OngoingCallNotificationImpl implements OngoingCallNotification {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {a.a(OngoingCallNotificationImpl.class, "LOG", "getLOG()Lcom/amazon/comms/log/CommsLogger;", 0)};

    /* renamed from: LOG$delegate, reason: from kotlin metadata */
    @NotNull
    private final CallingLogger LOG;

    @NotNull
    private final Context context;

    @NotNull
    private final MetricsManager metricManager;

    @NotNull
    private final NotificationManager notificationManager;

    @NotNull
    private final StringHelper stringHelper;

    @NotNull
    private final Utils utils;

    @Inject
    public OngoingCallNotificationImpl(@NotNull Context context, @NotNull NotificationManager notificationManager, @NotNull Utils utils, @NotNull MetricsManager metricsManager, @NotNull StringHelper stringHelper) {
        context.getClass();
        notificationManager.getClass();
        utils.getClass();
        metricsManager.getClass();
        stringHelper.getClass();
        this.context = context;
        this.notificationManager = notificationManager;
        this.utils = utils;
        this.metricManager = metricsManager;
        this.stringHelper = stringHelper;
        this.LOG = new CallingLogger();
    }

    @RequiresApi(26)
    private final Notification createOngoingCallNotification(String title, String participantName, long callStartTime) {
        NotificationManagerExtKt.createChannelForOngoingCallIfNeeded(this.notificationManager, this.context);
        Notification.Builder fullScreenIntent = new Notification.Builder(this.context, NotificationConstants.NOTIFICATIONS_CALLING_ONGOING_CHANNEL).setPriority(0).setCategory("call").setSmallIcon(R.drawable.ic_calling_comms_notification).setColor(ContextCompat.getColor(this.context, R.color.action10)).setShowWhen(true).setOngoing(true).setVisibility(1).setUsesChronometer(true).setWhen(callStartTime).setFullScreenIntent(getPendingIntent(), true);
        fullScreenIntent.getClass();
        this.metricManager.recordCounterMetric(MetricKeys.REMOTE_PARTICIPANT_NAME_EMPTY_FAIL, null, participantName == null || participantName.length() == 0);
        if (this.utils.isAndroid12AndAbove()) {
            Person.Builder builder = new Person.Builder();
            if (participantName == null || participantName.length() == 0) {
                participantName = this.stringHelper.getString(R.string.unknown_contact);
            }
            Person build = builder.setName(participantName).setImportant(true).build();
            build.getClass();
            fullScreenIntent.setStyle(Notification.CallStyle.forOngoingCall(build, getDeclineIntent()));
            fullScreenIntent.addPerson(build);
            fullScreenIntent.setContentText(title);
        } else {
            fullScreenIntent.setContentTitle(title);
            fullScreenIntent.setContentText(participantName);
        }
        Notification build2 = fullScreenIntent.build();
        build2.getClass();
        return build2;
    }

    private final PendingIntent getDeclineIntent() {
        Intent intent = new Intent(this.context, (Class<?>) CallDeclineBroadcastReceiver.class);
        intent.setAction(CallDeclineBroadcastReceiver.ACTION_CALL_DECLINE);
        PendingIntent broadcast = PendingIntent.getBroadcast(this.context, 101, intent, 201326592);
        broadcast.getClass();
        return broadcast;
    }

    private final CommsLogger getLOG() {
        return this.LOG.getValue(this, $$delegatedProperties[0]);
    }

    private final PendingIntent getPendingIntent() {
        Intent intent = new Intent(this.context, (Class<?>) CallActivity.class);
        intent.setFlags(268566528);
        PendingIntent activity = PendingIntent.getActivity(this.context, 0, intent, 201326592);
        activity.getClass();
        return activity;
    }

    @Override // com.amazon.comms.calling.infrastructure.OngoingCallNotification
    public void cancelOngoingCallNotification() {
        this.notificationManager.cancel(200);
        Intent intent = new Intent(this.context, (Class<?>) ActiveCallNotificationService.class);
        getLOG().i("call is stopped, trying to stop service ActiveCallNotificationService");
        this.context.stopService(intent);
    }

    @Override // com.amazon.comms.calling.infrastructure.OngoingCallNotification
    public void showOngoingCallNotification(@NotNull String title, @Nullable String participantName, long callStartTime) {
        title.getClass();
        getLOG().i("showOngoingCallNotification");
        Intent intent = new Intent(this.context, (Class<?>) ActiveCallNotificationService.class);
        getLOG().i("Starting ActiveCallNotificationService service");
        intent.putExtra(ActiveCallNotificationService.CALL_NOTIFICATION, createOngoingCallNotification(title, participantName, callStartTime));
        Bugsnag.leaveBreadcrumb("ShowOngoingCallNotificationFor" + title);
        try {
            MetricsManager.DefaultImpls.recordCounterMetric$default(this.metricManager, MetricKeys.START_FOREGROUND_ONGOING_CALL_NOTIFICATION_FAIL, null, false, 2, null);
            this.context.startForegroundService(intent);
        } catch (Exception e) {
            MetricsManager.DefaultImpls.recordCounterMetric$default(this.metricManager, MetricKeys.START_FOREGROUND_ONGOING_CALL_NOTIFICATION_FAIL, null, false, 6, null);
            Bugsnag.leaveBreadcrumb("StartForegroundServiceExceptionInShowOngoingCallNotificationFor" + title);
            getLOG().e("StartForegroundServiceException in ShowOngoingCallNotificationFor" + title + ": " + e.getMessage());
        }
    }
}
