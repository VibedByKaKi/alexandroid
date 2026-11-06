package com.amazon.deecomms.notifications;

import android.os.Handler;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.deecomms.api.metrics.CommsMetric;
import com.amazon.deecomms.api.metrics.CounterMetric;
import com.amazon.deecomms.api.metrics.TimerMetric;
import com.amazon.deecomms.common.metrics.MetricKeys;
import com.amazon.deecomms.common.metrics.MetricsHelper;
import com.amazon.deecomms.util.StopWatch;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class NotificationLatencyMetricHelper {
    private static final int MAX_LATENCY_DURATION_IN_SECONDS = 60;
    private Map<String, NotificationLatencyDatapoint> mNotificationLatencyDatapointMap = new HashMap();
    private final StopWatch mStopWatch;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ClickEndpoint {
        Announcement("comms.notif.endpoint.announce"),
        AnnouncementList("comms.notif.endpoint.announceList"),
        Conversation("comms.notif.endpoint.convo"),
        ConversationList("comms.notif.endpoint.convoList"),
        ImageDetailView("comms.notif.endpoint.imageDetailView");

        private String mStringValue;

        ClickEndpoint(String str) {
            this.mStringValue = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mStringValue;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ClickSource {
        MessageNotification("comms.notif.msg"),
        AnnouncementNotification("comms.notif.announce");

        private String mStringValue;

        ClickSource(String str) {
            this.mStringValue = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mStringValue;
        }
    }

    public NotificationLatencyMetricHelper(Handler handler) {
        StopWatch stopWatch = new StopWatch(handler, 60);
        this.mStopWatch = stopWatch;
        stopWatch.getRemovalObservable().subscribe(new Action1<String>() { // from class: com.amazon.deecomms.notifications.NotificationLatencyMetricHelper.1
            @Override // rx.functions.Action1
            /* renamed from: call, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo8903call(String str) {
                NotificationLatencyDatapoint notificationLatencyDatapoint;
                if (TextUtils.isEmpty(str) || (notificationLatencyDatapoint = (NotificationLatencyDatapoint) NotificationLatencyMetricHelper.this.mNotificationLatencyDatapointMap.remove(str)) == null) {
                    return;
                }
                if (str.startsWith(ClickEndpoint.Conversation.toString()) || str.startsWith(ClickEndpoint.ConversationList.toString())) {
                    CounterMetric counterMetric = new CounterMetric(CommsMetric.MetricType.ClickStream, MetricKeys.NOTIFICATION_CLICKED_LOST);
                    counterMetric.getMetadata().put("source", notificationLatencyDatapoint.source);
                    counterMetric.getMetadata().put(MetricKeys.META_ENDPOINT, notificationLatencyDatapoint.endpoint);
                    MetricsHelper.recordSingleOccurrence(counterMetric);
                }
            }
        });
    }

    public static String generateAnnouncementListKey(@NonNull String str) {
        return a$$ExternalSyntheticOutline0.m$1(ClickEndpoint.AnnouncementList.toString(), "_", str);
    }

    private static String generateConversationKey(@NonNull String str, @NonNull String str2) {
        return ParcelCompat$$ExternalSyntheticOutline0.m(ClickEndpoint.Conversation.toString(), "_", str, "_", str2);
    }

    private void startTimer(@NonNull String str, @NonNull ClickSource clickSource, @NonNull ClickEndpoint clickEndpoint) {
        this.mStopWatch.start(str);
        NotificationLatencyDatapoint notificationLatencyDatapoint = new NotificationLatencyDatapoint(this, 0);
        notificationLatencyDatapoint.key = str;
        notificationLatencyDatapoint.source = clickSource;
        notificationLatencyDatapoint.endpoint = clickEndpoint;
        this.mNotificationLatencyDatapointMap.put(str, notificationLatencyDatapoint);
    }

    public void stopTimer(@NonNull String str) {
        NotificationLatencyDatapoint remove = this.mNotificationLatencyDatapointMap.remove(str);
        long elapsedTime = this.mStopWatch.elapsedTime(str);
        if (remove == null || elapsedTime == -1) {
            return;
        }
        this.mStopWatch.stop(str);
        TimerMetric generateOperational = TimerMetric.generateOperational(MetricKeys.NOTIFICATION_TO_APP_LATENCY);
        generateOperational.setTimeDelta(elapsedTime);
        generateOperational.getMetadata().put("source", remove.source);
        generateOperational.getMetadata().put(MetricKeys.META_ENDPOINT, remove.endpoint);
        MetricsHelper.recordTimerMetric(generateOperational);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class NotificationLatencyDatapoint {
        public ClickEndpoint endpoint;
        public String key;
        public ClickSource source;

        private NotificationLatencyDatapoint() {
        }

        public /* synthetic */ NotificationLatencyDatapoint(NotificationLatencyMetricHelper notificationLatencyMetricHelper, int i) {
            this();
        }
    }

    public void startTimer(@NonNull String str, @NonNull String str2, @NonNull ClickSource clickSource, @NonNull ClickEndpoint clickEndpoint) {
        startTimer(generateConversationKey(str, str2), clickSource, clickEndpoint);
    }

    public void startTimer(@NonNull String str, @NonNull String str2, @NonNull ClickEndpoint clickEndpoint) {
        startTimer(generateConversationKey(str, str2), ClickSource.MessageNotification, clickEndpoint);
    }

    public void startTimer(@NonNull String str, @NonNull ClickEndpoint clickEndpoint) {
        startTimer(str, ClickSource.MessageNotification, clickEndpoint);
    }

    public void stopTimer(@NonNull String str, @NonNull String str2) {
        stopTimer(generateConversationKey(str, str2));
    }
}
