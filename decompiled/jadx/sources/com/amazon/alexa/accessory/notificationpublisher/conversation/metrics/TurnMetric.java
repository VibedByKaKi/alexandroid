package com.amazon.alexa.accessory.notificationpublisher.conversation.metrics;

import com.amazon.photos.uploader.internal.workers.UploadWorker;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/metrics/TurnMetric;", "", "<init>", "()V", "CONCEPT", "", "FAILED", "getFAILED", "()Ljava/lang/String;", "FIRST_AUDIO_LATENCY", "getFIRST_AUDIO_LATENCY", "CLOUD_LATENCY", "getCLOUD_LATENCY", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TurnMetric {

    @NotNull
    private static final String CLOUD_LATENCY;

    @NotNull
    private static final String CONCEPT = "Turn";

    @NotNull
    private static final String FAILED;

    @NotNull
    private static final String FIRST_AUDIO_LATENCY;

    @NotNull
    public static final TurnMetric INSTANCE = new TurnMetric();

    static {
        ConversationMetric conversationMetric = ConversationMetric.INSTANCE;
        FAILED = conversationMetric.name(CONCEPT, UploadWorker.FAILED_PREFIX);
        FIRST_AUDIO_LATENCY = conversationMetric.name(CONCEPT, "FirstAudioLatency");
        CLOUD_LATENCY = conversationMetric.name(CONCEPT, "CloudLatency");
    }

    private TurnMetric() {
    }

    @NotNull
    public final String getCLOUD_LATENCY() {
        return CLOUD_LATENCY;
    }

    @NotNull
    public final String getFAILED() {
        return FAILED;
    }

    @NotNull
    public final String getFIRST_AUDIO_LATENCY() {
        return FIRST_AUDIO_LATENCY;
    }
}
