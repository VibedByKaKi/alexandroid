package com.amazon.alexa.assistant.session.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/assistant/session/model/MetricsName;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "UNSUPPORTED_DIRECTIVE", "UNHANDLED_DIRECTIVE", "FAILED_DIRECTIVE", "GATEWAY_VERIFICATION_SUCCESS_LATENCY", "GATEWAY_VERIFICATION_FAILURE_LATENCY", "DISCOVERY_LATENCY", "DISCOVERY_STATE_ERROR", "GET_ERROR_SOUND_FAILED", "GET_ERROR_SOUND_SUCCEEDED", "ERROR_AUDIO_TASK_FAILED", "ERROR_AUDIO_TASK_SUCCEEDED", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MetricsName {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MetricsName[] $VALUES;

    @NotNull
    private final String value;
    public static final MetricsName UNSUPPORTED_DIRECTIVE = new MetricsName("UNSUPPORTED_DIRECTIVE", 0, "UnsupportedDirective");
    public static final MetricsName UNHANDLED_DIRECTIVE = new MetricsName("UNHANDLED_DIRECTIVE", 1, "UnhandledDirective");
    public static final MetricsName FAILED_DIRECTIVE = new MetricsName("FAILED_DIRECTIVE", 2, "FailedDirective");
    public static final MetricsName GATEWAY_VERIFICATION_SUCCESS_LATENCY = new MetricsName("GATEWAY_VERIFICATION_SUCCESS_LATENCY", 3, "TRANSPORT_LAYER.Gateway.VerificationSucceeded.Latency");
    public static final MetricsName GATEWAY_VERIFICATION_FAILURE_LATENCY = new MetricsName("GATEWAY_VERIFICATION_FAILURE_LATENCY", 4, "TRANSPORT_LAYER.Gateway.VerificationFailed.Latency");
    public static final MetricsName DISCOVERY_LATENCY = new MetricsName("DISCOVERY_LATENCY", 5, "DISCOVERY_LATENCY");
    public static final MetricsName DISCOVERY_STATE_ERROR = new MetricsName("DISCOVERY_STATE_ERROR", 6, "DiscoveryStateError");
    public static final MetricsName GET_ERROR_SOUND_FAILED = new MetricsName("GET_ERROR_SOUND_FAILED", 7, "GetErrorSoundFailed");
    public static final MetricsName GET_ERROR_SOUND_SUCCEEDED = new MetricsName("GET_ERROR_SOUND_SUCCEEDED", 8, "GetErrorSoundSucceeded");
    public static final MetricsName ERROR_AUDIO_TASK_FAILED = new MetricsName("ERROR_AUDIO_TASK_FAILED", 9, "ErrorAudioTaskFailed");
    public static final MetricsName ERROR_AUDIO_TASK_SUCCEEDED = new MetricsName("ERROR_AUDIO_TASK_SUCCEEDED", 10, "ErrorAudioTaskSucceeded");

    private static final /* synthetic */ MetricsName[] $values() {
        return new MetricsName[]{UNSUPPORTED_DIRECTIVE, UNHANDLED_DIRECTIVE, FAILED_DIRECTIVE, GATEWAY_VERIFICATION_SUCCESS_LATENCY, GATEWAY_VERIFICATION_FAILURE_LATENCY, DISCOVERY_LATENCY, DISCOVERY_STATE_ERROR, GET_ERROR_SOUND_FAILED, GET_ERROR_SOUND_SUCCEEDED, ERROR_AUDIO_TASK_FAILED, ERROR_AUDIO_TASK_SUCCEEDED};
    }

    static {
        MetricsName[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private MetricsName(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<MetricsName> getEntries() {
        return $ENTRIES;
    }

    public static MetricsName valueOf(String str) {
        return (MetricsName) Enum.valueOf(MetricsName.class, str);
    }

    public static MetricsName[] values() {
        return (MetricsName[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
