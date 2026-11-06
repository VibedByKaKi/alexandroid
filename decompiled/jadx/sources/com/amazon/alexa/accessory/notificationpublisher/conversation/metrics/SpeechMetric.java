package com.amazon.alexa.accessory.notificationpublisher.conversation.metrics;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/metrics/SpeechMetric;", "", "<init>", "()V", "CONCEPT", "", "PLAYBACK_FAILED", "getPLAYBACK_FAILED", "()Ljava/lang/String;", "TTS_LATENCY", "getTTS_LATENCY", "TIMED_OUT", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SpeechMetric {

    @NotNull
    private static final String CONCEPT = "Speech";

    @NotNull
    public static final SpeechMetric INSTANCE = new SpeechMetric();

    @NotNull
    private static final String PLAYBACK_FAILED;

    @NotNull
    public static final String TIMED_OUT = "timedOut";

    @NotNull
    private static final String TTS_LATENCY;

    static {
        ConversationMetric conversationMetric = ConversationMetric.INSTANCE;
        PLAYBACK_FAILED = conversationMetric.name(CONCEPT, "PlaybackFailed");
        TTS_LATENCY = conversationMetric.name(CONCEPT, "TtsLatency");
    }

    private SpeechMetric() {
    }

    @NotNull
    public final String getPLAYBACK_FAILED() {
        return PLAYBACK_FAILED;
    }

    @NotNull
    public final String getTTS_LATENCY() {
        return TTS_LATENCY;
    }
}
