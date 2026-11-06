package com.amazon.alexa.assistant.metric;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/assistant/metric/VoiceCancelReason;", "", "metricSuffix", "", "errorCode", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getMetricSuffix", "()Ljava/lang/String;", "getErrorCode", "RECONNECT", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class VoiceCancelReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VoiceCancelReason[] $VALUES;
    public static final VoiceCancelReason RECONNECT = new VoiceCancelReason("RECONNECT", 0, "RECONNECT", "RECONNECT_CANCELLED");

    @NotNull
    private final String errorCode;

    @NotNull
    private final String metricSuffix;

    private static final /* synthetic */ VoiceCancelReason[] $values() {
        return new VoiceCancelReason[]{RECONNECT};
    }

    static {
        VoiceCancelReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private VoiceCancelReason(String str, int i, String str2, String str3) {
        this.metricSuffix = str2;
        this.errorCode = str3;
    }

    @NotNull
    public static EnumEntries<VoiceCancelReason> getEntries() {
        return $ENTRIES;
    }

    public static VoiceCancelReason valueOf(String str) {
        return (VoiceCancelReason) Enum.valueOf(VoiceCancelReason.class, str);
    }

    public static VoiceCancelReason[] values() {
        return (VoiceCancelReason[]) $VALUES.clone();
    }

    @NotNull
    public final String getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getMetricSuffix() {
        return this.metricSuffix;
    }
}
