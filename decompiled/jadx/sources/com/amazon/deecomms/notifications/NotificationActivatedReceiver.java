package com.amazon.deecomms.notifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.api.metrics.CommsMetric;
import com.amazon.deecomms.api.metrics.CounterMetric;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.metrics.MetricKeys;
import com.amazon.deecomms.common.metrics.MetricsHelper;
import com.amazon.deecomms.common.util.Utils;
import com.amazon.deecomms.core.CommsDaggerWrapper;
import com.amazon.deecomms.notifications.NotificationLatencyMetricHelper;
import com.amazon.deecomms.notifications.util.NotificationUtils;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class NotificationActivatedReceiver extends BroadcastReceiver {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, NotificationActivatedReceiver.class);

    @Inject
    NotificationLatencyMetricHelper mNotificationLatencyMetricHelper;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.deecomms.notifications.NotificationActivatedReceiver$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$deecomms$notifications$util$NotificationUtils$NotificationPathType;

        static {
            int[] iArr = new int[NotificationUtils.NotificationPathType.values().length];
            $SwitchMap$com$amazon$deecomms$notifications$util$NotificationUtils$NotificationPathType = iArr;
            try {
                iArr[NotificationUtils.NotificationPathType.ANNOUNCEMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$deecomms$notifications$util$NotificationUtils$NotificationPathType[NotificationUtils.NotificationPathType.ANNOUNCEMENT_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$deecomms$notifications$util$NotificationUtils$NotificationPathType[NotificationUtils.NotificationPathType.CONVERSATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$deecomms$notifications$util$NotificationUtils$NotificationPathType[NotificationUtils.NotificationPathType.CONVERSATION_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$deecomms$notifications$util$NotificationUtils$NotificationPathType[NotificationUtils.NotificationPathType.IMAGE_DETAIL_VIEW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @VisibleForTesting
    public Intent createNotificationRebroadcastIntent(String str, String str2) {
        Intent intent = new Intent(Constants.NOTIFICATION_CLICK_ACTION);
        intent.putExtra("notification_redirect_path", str);
        intent.putExtra("target", str2);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        CommsDaggerWrapper.getComponent().inject(this);
        recordNotificationClickedMetric();
        String stringExtra = intent.getStringExtra("notification_redirect_path");
        String stringExtra2 = intent.getStringExtra("target");
        int intExtra = intent.getIntExtra("notificationId", -1);
        if (TextUtils.isEmpty(stringExtra)) {
            LOG.e("Received a notification-clicked action, but with no path, ignoring");
            return;
        }
        recordMetricForPath(stringExtra, this.mNotificationLatencyMetricHelper);
        if (Constants.NOTIFICATION_TARGET_ANNOUNCEMENT.equals(stringExtra2)) {
            CommsDaggerWrapper.getComponent().getCommsNotificationManager().clearAnnouncements();
        }
        if (intExtra == 10) {
            CommsDaggerWrapper.getComponent().getCommsNotificationManager().clearMessages();
        }
        Utils.sendExplicitBroadcastIntent(context, createNotificationRebroadcastIntent(stringExtra, stringExtra2), "com.amazon.deecomms.permission");
    }

    @VisibleForTesting
    public void recordMetricForPath(String str, NotificationLatencyMetricHelper notificationLatencyMetricHelper) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$deecomms$notifications$util$NotificationUtils$NotificationPathType[NotificationUtils.determineNotificationPathType(str).ordinal()];
        if (i == 1) {
            NotificationLatencyMetricHelper.ClickEndpoint clickEndpoint = NotificationLatencyMetricHelper.ClickEndpoint.Announcement;
            notificationLatencyMetricHelper.startTimer(clickEndpoint.toString(), clickEndpoint);
            MetricsHelper.recordSingleOccurrenceClickstream(MetricKeys.NOTIFICATION_GOTO_ANNOUNCEMENT);
            return;
        }
        if (i == 2) {
            String extractAnnouncementIdFromPath = NotificationUtils.extractAnnouncementIdFromPath(str);
            if (extractAnnouncementIdFromPath == null) {
                LOG.e("Received an announcement-notification-clicked action, but with no announcementId.");
                return;
            } else {
                notificationLatencyMetricHelper.startTimer(NotificationLatencyMetricHelper.generateAnnouncementListKey(extractAnnouncementIdFromPath), NotificationLatencyMetricHelper.ClickEndpoint.AnnouncementList);
                MetricsHelper.recordSingleOccurrenceClickstream(MetricKeys.NOTIFICATION_GOTO_ANNOUNCEMENT_LIST);
                return;
            }
        }
        if (i == 3) {
            NotificationUtils.ExtractedInfo extractConversationAndRecipientFromPath = NotificationUtils.extractConversationAndRecipientFromPath(str);
            notificationLatencyMetricHelper.startTimer(extractConversationAndRecipientFromPath.conversationId, extractConversationAndRecipientFromPath.recipientId, NotificationLatencyMetricHelper.ClickEndpoint.Conversation);
            MetricsHelper.recordSingleOccurrenceClickstream(MetricKeys.NOTIFICATION_GOTO_MSG_CONVO);
        } else if (i == 4) {
            NotificationLatencyMetricHelper.ClickEndpoint clickEndpoint2 = NotificationLatencyMetricHelper.ClickEndpoint.ConversationList;
            notificationLatencyMetricHelper.startTimer(clickEndpoint2.toString(), clickEndpoint2);
            MetricsHelper.recordSingleOccurrenceClickstream(MetricKeys.NOTIFICATION_GOTO_MSG_CONVO);
        } else {
            if (i != 5) {
                LOG.i("received a notification type that hasn't had 'activated' metrics applied");
                return;
            }
            NotificationLatencyMetricHelper.ClickEndpoint clickEndpoint3 = NotificationLatencyMetricHelper.ClickEndpoint.ImageDetailView;
            notificationLatencyMetricHelper.startTimer(clickEndpoint3.toString(), clickEndpoint3);
            MetricsHelper.recordSingleOccurrenceClickstream(MetricKeys.NOTIFICATION_GOTO_IMAGE_DETAIL_VIEW);
        }
    }

    @VisibleForTesting
    public void recordNotificationClickedMetric() {
        CounterMetric counterMetric = new CounterMetric(CommsMetric.MetricType.ClickStream, MetricKeys.NOTIFICATION_CLICKED);
        counterMetric.getMetadata().put("source", NotificationLatencyMetricHelper.ClickSource.MessageNotification.toString());
        MetricsHelper.recordSingleOccurrence(counterMetric);
    }
}
