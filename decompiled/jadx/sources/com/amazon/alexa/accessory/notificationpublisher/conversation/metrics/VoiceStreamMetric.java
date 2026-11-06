package com.amazon.alexa.accessory.notificationpublisher.conversation.metrics;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/metrics/VoiceStreamMetric;", "", "<init>", "()V", "LEASE_LATENCY", "", "getLEASE_LATENCY", "()Ljava/lang/String;", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class VoiceStreamMetric {

    @NotNull
    public static final VoiceStreamMetric INSTANCE = new VoiceStreamMetric();

    @NotNull
    private static final String LEASE_LATENCY = ConversationMetric.INSTANCE.name("VoiceStream", "LeaseLatency");

    private VoiceStreamMetric() {
    }

    @NotNull
    public final String getLEASE_LATENCY() {
        return LEASE_LATENCY;
    }
}
