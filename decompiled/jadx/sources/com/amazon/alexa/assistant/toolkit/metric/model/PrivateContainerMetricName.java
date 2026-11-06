package com.amazon.alexa.assistant.toolkit.metric.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/metric/model/PrivateContainerMetricName;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "REGISTERED", "UNREGISTERED", "CAPABILITY_PUBLISHED", "FRAGMENT_RECEIVED", "RENDER_SUCCEEDED", "FIRST_FRAME_LATENCY_MS", "UNSUPPORTED_SCHEMA", "MALFORMED_PAYLOAD", "MISSING_CONTENT", "BUILDER_THREW", "PII_DETECTED", "TTS_FALLBACK", "VARIANT_FALLBACK", "VERSION_FALLBACK", "HISTORY_REPLAY_RENDERED", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PrivateContainerMetricName {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PrivateContainerMetricName[] $VALUES;

    @NotNull
    private final String value;
    public static final PrivateContainerMetricName REGISTERED = new PrivateContainerMetricName("REGISTERED", 0, "PRIVATE_CONTENT_REGISTERED");
    public static final PrivateContainerMetricName UNREGISTERED = new PrivateContainerMetricName("UNREGISTERED", 1, "PRIVATE_CONTENT_UNREGISTERED");
    public static final PrivateContainerMetricName CAPABILITY_PUBLISHED = new PrivateContainerMetricName("CAPABILITY_PUBLISHED", 2, "PRIVATE_CONTENT_CAPABILITY_PUBLISHED");
    public static final PrivateContainerMetricName FRAGMENT_RECEIVED = new PrivateContainerMetricName("FRAGMENT_RECEIVED", 3, "PRIVATE_CONTENT_FRAGMENT_RECEIVED");
    public static final PrivateContainerMetricName RENDER_SUCCEEDED = new PrivateContainerMetricName("RENDER_SUCCEEDED", 4, "PRIVATE_CONTENT_RENDER_SUCCEEDED");
    public static final PrivateContainerMetricName FIRST_FRAME_LATENCY_MS = new PrivateContainerMetricName("FIRST_FRAME_LATENCY_MS", 5, "PRIVATE_CONTENT_FIRST_FRAME_LATENCY_MS");
    public static final PrivateContainerMetricName UNSUPPORTED_SCHEMA = new PrivateContainerMetricName("UNSUPPORTED_SCHEMA", 6, "PRIVATE_CONTENT_UNSUPPORTED_SCHEMA");
    public static final PrivateContainerMetricName MALFORMED_PAYLOAD = new PrivateContainerMetricName("MALFORMED_PAYLOAD", 7, "PRIVATE_CONTENT_MALFORMED_PAYLOAD");
    public static final PrivateContainerMetricName MISSING_CONTENT = new PrivateContainerMetricName("MISSING_CONTENT", 8, "PRIVATE_CONTENT_MISSING_CONTENT");
    public static final PrivateContainerMetricName BUILDER_THREW = new PrivateContainerMetricName("BUILDER_THREW", 9, "PRIVATE_CONTENT_BUILDER_THREW");
    public static final PrivateContainerMetricName PII_DETECTED = new PrivateContainerMetricName("PII_DETECTED", 10, "PRIVATE_CONTENT_PII_DETECTED");
    public static final PrivateContainerMetricName TTS_FALLBACK = new PrivateContainerMetricName("TTS_FALLBACK", 11, "PRIVATE_CONTENT_TTS_FALLBACK");
    public static final PrivateContainerMetricName VARIANT_FALLBACK = new PrivateContainerMetricName("VARIANT_FALLBACK", 12, "PRIVATE_CONTENT_VARIANT_FALLBACK");
    public static final PrivateContainerMetricName VERSION_FALLBACK = new PrivateContainerMetricName("VERSION_FALLBACK", 13, "PRIVATE_CONTENT_VERSION_FALLBACK");
    public static final PrivateContainerMetricName HISTORY_REPLAY_RENDERED = new PrivateContainerMetricName("HISTORY_REPLAY_RENDERED", 14, "PRIVATE_CONTENT_HISTORY_REPLAY_RENDERED");

    private static final /* synthetic */ PrivateContainerMetricName[] $values() {
        return new PrivateContainerMetricName[]{REGISTERED, UNREGISTERED, CAPABILITY_PUBLISHED, FRAGMENT_RECEIVED, RENDER_SUCCEEDED, FIRST_FRAME_LATENCY_MS, UNSUPPORTED_SCHEMA, MALFORMED_PAYLOAD, MISSING_CONTENT, BUILDER_THREW, PII_DETECTED, TTS_FALLBACK, VARIANT_FALLBACK, VERSION_FALLBACK, HISTORY_REPLAY_RENDERED};
    }

    static {
        PrivateContainerMetricName[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private PrivateContainerMetricName(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<PrivateContainerMetricName> getEntries() {
        return $ENTRIES;
    }

    public static PrivateContainerMetricName valueOf(String str) {
        return (PrivateContainerMetricName) Enum.valueOf(PrivateContainerMetricName.class, str);
    }

    public static PrivateContainerMetricName[] values() {
        return (PrivateContainerMetricName[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
