package com.amazon.alexa.accessory.notificationpublisher.conversation.metrics;

import com.amazon.alexa.voice.tta.metrics.SimbaEventProcessor;
import com.amazon.deecomms.common.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/metrics/SessionMetric;", "", "<init>", "()V", "CONCEPT", "", SimbaEventProcessor.SOURCE_STARTED, "getSTARTED", "()Ljava/lang/String;", "START_FAILED", "getSTART_FAILED", "ENDED_RESOLVED", "getENDED_RESOLVED", "ENDED_DISMISSED", "getENDED_DISMISSED", "ENDED_INTERRUPTED", "getENDED_INTERRUPTED", "ENDED_FAILED", "getENDED_FAILED", "DURATION", "getDURATION", "turnsBucket", "turns", "", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SessionMetric {

    @NotNull
    private static final String CONCEPT = "Session";

    @NotNull
    private static final String DURATION;

    @NotNull
    private static final String ENDED_DISMISSED;

    @NotNull
    private static final String ENDED_FAILED;

    @NotNull
    private static final String ENDED_INTERRUPTED;

    @NotNull
    private static final String ENDED_RESOLVED;

    @NotNull
    public static final SessionMetric INSTANCE = new SessionMetric();

    @NotNull
    private static final String STARTED;

    @NotNull
    private static final String START_FAILED;

    static {
        ConversationMetric conversationMetric = ConversationMetric.INSTANCE;
        STARTED = conversationMetric.name(CONCEPT, "Started");
        START_FAILED = conversationMetric.name(CONCEPT, "StartFailed");
        ENDED_RESOLVED = conversationMetric.name(CONCEPT, "EndedResolved");
        ENDED_DISMISSED = conversationMetric.name(CONCEPT, "EndedDismissed");
        ENDED_INTERRUPTED = conversationMetric.name(CONCEPT, "EndedInterrupted");
        ENDED_FAILED = conversationMetric.name(CONCEPT, "EndedFailed");
        DURATION = conversationMetric.name(CONCEPT, Constants.CALL_DURATION_KEY);
    }

    private SessionMetric() {
    }

    @NotNull
    public final String getDURATION() {
        return DURATION;
    }

    @NotNull
    public final String getENDED_DISMISSED() {
        return ENDED_DISMISSED;
    }

    @NotNull
    public final String getENDED_FAILED() {
        return ENDED_FAILED;
    }

    @NotNull
    public final String getENDED_INTERRUPTED() {
        return ENDED_INTERRUPTED;
    }

    @NotNull
    public final String getENDED_RESOLVED() {
        return ENDED_RESOLVED;
    }

    @NotNull
    public final String getSTARTED() {
        return STARTED;
    }

    @NotNull
    public final String getSTART_FAILED() {
        return START_FAILED;
    }

    @NotNull
    public final String turnsBucket(int turns) {
        return turns >= 4 ? "4+" : String.valueOf(turns);
    }
}
