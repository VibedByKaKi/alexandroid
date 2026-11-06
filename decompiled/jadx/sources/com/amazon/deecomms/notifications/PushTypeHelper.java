package com.amazon.deecomms.notifications;

import androidx.annotation.NonNull;
import com.amazon.deecomms.common.metrics.MetricKeys;
import com.amazon.deecomms.common.metrics.MetricsHelper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class PushTypeHelper {
    private static final String EVENT_TYPE_KEY = "eventType";
    private static final String PAYLOAD_KEY = "payload";
    private static final String TYPE_KEY = "type";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum PushType {
        Message,
        ConversationDelete,
        ReadReceipt,
        TranscriptUpdate,
        AudioAnnouncement,
        TextAnnouncement,
        Invalid
    }

    private PushTypeHelper() {
    }

    public static PushType determineType(String str) {
        return getPushTypeFromMessageType(getMessageTypeFromMessagePayload((HashMap) new Gson().fromJson(str, new TypeToken<HashMap<String, Object>>() { // from class: com.amazon.deecomms.notifications.PushTypeHelper.1
        }.getType())).toLowerCase());
    }

    private static String getMessageTypeFromMessagePayload(HashMap<String, Object> hashMap) {
        if (hashMap.containsKey("type")) {
            return (String) hashMap.get("type");
        }
        if (hashMap.containsKey(EVENT_TYPE_KEY)) {
            return (String) hashMap.get(EVENT_TYPE_KEY);
        }
        if (hashMap.containsKey("payload")) {
            HashMap hashMap2 = (HashMap) hashMap.get("payload");
            if (hashMap2.containsKey("type")) {
                return (String) hashMap2.get("type");
            }
            if (hashMap2.containsKey(EVENT_TYPE_KEY)) {
                return (String) hashMap2.get("type");
            }
        }
        return "";
    }

    @NonNull
    private static PushType getPushTypeFromMessageType(String str) {
        str.getClass();
        switch (str) {
            case "message/text":
                MetricsHelper.recordCounterMetricOperational(MetricKeys.CNOTIF_MSG_TYPE_TEXT_MESSAGE, 1.0d);
                return PushType.Message;
            case "transcript-update":
                MetricsHelper.recordCounterMetricOperational(MetricKeys.CNOTIF_MSG_TYPE_TRANSCRIPT_UPDATED, 1.0d);
                return PushType.TranscriptUpdate;
            case "event/reaction":
                MetricsHelper.recordCounterMetricOperational(MetricKeys.CNOTIF_MSG_TYPE_REACTION_EVENT_MESSAGE, 1.0d);
                return PushType.Message;
            case "delete-conversation":
                MetricsHelper.recordCounterMetricOperational(MetricKeys.CNOTIF_MSG_TYPE_DELETE_CONVERSATION, 1.0d);
                return PushType.ConversationDelete;
            case "announcement/audio":
                MetricsHelper.recordCounterMetricOperational(MetricKeys.CNOTIF_MSG_TYPE_AUDIO_ANNOUNCEMENT, 1.0d);
                return PushType.AudioAnnouncement;
            case "message/contact-invitation":
                MetricsHelper.recordCounterMetricOperational(MetricKeys.CNOTIF_MSG_TYPE_INVITE_MESSAGE, 1.0d);
                return PushType.Message;
            case "read-message":
                MetricsHelper.recordCounterMetricOperational(MetricKeys.CNOTIF_MSG_TYPE_READ_RECEIPT, 1.0d);
                return PushType.ReadReceipt;
            case "event/missed-call":
                MetricsHelper.recordCounterMetricOperational(MetricKeys.CNOTIF_MSG_TYPE_MISSED_CALL, 1.0d);
                return PushType.Message;
            case "event/call":
                MetricsHelper.recordCounterMetricOperational(MetricKeys.CNOTIF_MSG_TYPE_ENDED_CALL, 1.0d);
                return PushType.Message;
            case "announcement/text-simple":
                MetricsHelper.recordCounterMetricOperational(MetricKeys.CNOTIF_MSG_TYPE_TEXT_ANNOUNCEMENT, 1.0d);
                return PushType.TextAnnouncement;
            case "reaction/default":
                MetricsHelper.recordCounterMetricOperational(MetricKeys.CNOTIF_MSG_TYPE_SHARING_REACTION_MESSAGE, 1.0d);
                return PushType.Message;
            case "message/audio":
                MetricsHelper.recordCounterMetricOperational(MetricKeys.CNOTIF_MSG_TYPE_AUDIO_MESSAGE, 1.0d);
                return PushType.Message;
            case "message/media":
                MetricsHelper.recordCounterMetricOperational(MetricKeys.CNOTIF_MSG_TYPE_IMAGE_MESSAGE, 1.0d);
                return PushType.Message;
            case "message/contact-connection-success":
                MetricsHelper.recordCounterMetricOperational(MetricKeys.CNOTIF_MSG_TYPE_INVITE_SUCCESS_MESSAGE, 1.0d);
                return PushType.Message;
            case "message/shared-content":
                MetricsHelper.recordCounterMetricOperational(MetricKeys.CNOTIF_MSG_TYPE_SHARING_MESSAGE, 1.0d);
                return PushType.Message;
            default:
                MetricsHelper.recordCounterMetricOperational(MetricKeys.CNOTIF_MSG_TYPE_INVALID, 1.0d);
                return PushType.Invalid;
        }
    }
}
