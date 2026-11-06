package com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.LivePreviewBundleKeys;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentOutbound;", "", "<init>", "()V", "turnStart", "", LivePreviewBundleKeys.TRANSCRIPT, "capabilityHint", "turnEndInput", "sessionClose", "reason", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentCloseReason;", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ClassifyIntentOutbound {

    @NotNull
    public static final ClassifyIntentOutbound INSTANCE = new ClassifyIntentOutbound();

    private ClassifyIntentOutbound() {
    }

    @NotNull
    public final String sessionClose(@NotNull ClassifyIntentCloseReason reason) {
        reason.getClass();
        String jSONObject = new JSONObject().put("type", ClassifyIntentMessageType.SESSION_CLOSE).put("reason", reason.getWireValue()).toString();
        jSONObject.getClass();
        return jSONObject;
    }

    @NotNull
    public final String turnEndInput() {
        String jSONObject = new JSONObject().put("type", ClassifyIntentMessageType.TURN_END_INPUT).toString();
        jSONObject.getClass();
        return jSONObject;
    }

    @NotNull
    public final String turnStart(@NotNull String transcript, @NotNull String capabilityHint) {
        transcript.getClass();
        capabilityHint.getClass();
        String jSONObject = new JSONObject().put("type", ClassifyIntentMessageType.TURN_START).put(LivePreviewBundleKeys.TRANSCRIPT, transcript).put("capabilityHint", capabilityHint).toString();
        jSONObject.getClass();
        return jSONObject;
    }
}
