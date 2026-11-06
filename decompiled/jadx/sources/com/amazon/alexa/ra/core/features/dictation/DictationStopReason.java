package com.amazon.alexa.ra.core.features.dictation;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/ra/core/features/dictation/DictationStopReason;", "", "metricValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getMetricValue", "()Ljava/lang/String;", "STOP_BUTTON", "SUBMIT_BUTTON", "SILENCE_TIMEOUT", "HOLD_RELEASE", "MAX_DURATION", "MAX_TRANSCRIPT_LENGTH", "APP_BACKGROUNDED", "CANCEL_BUTTON", "OTHER_CANCEL", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class DictationStopReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DictationStopReason[] $VALUES;

    @NotNull
    private final String metricValue;
    public static final DictationStopReason STOP_BUTTON = new DictationStopReason("STOP_BUTTON", 0, "stopButton");
    public static final DictationStopReason SUBMIT_BUTTON = new DictationStopReason("SUBMIT_BUTTON", 1, "submitButton");
    public static final DictationStopReason SILENCE_TIMEOUT = new DictationStopReason("SILENCE_TIMEOUT", 2, "silenceTimeout");
    public static final DictationStopReason HOLD_RELEASE = new DictationStopReason("HOLD_RELEASE", 3, "holdRelease");
    public static final DictationStopReason MAX_DURATION = new DictationStopReason("MAX_DURATION", 4, "maxDuration");
    public static final DictationStopReason MAX_TRANSCRIPT_LENGTH = new DictationStopReason("MAX_TRANSCRIPT_LENGTH", 5, "maxTranscriptLength");
    public static final DictationStopReason APP_BACKGROUNDED = new DictationStopReason("APP_BACKGROUNDED", 6, "appBackgrounded");
    public static final DictationStopReason CANCEL_BUTTON = new DictationStopReason("CANCEL_BUTTON", 7, "cancelButton");
    public static final DictationStopReason OTHER_CANCEL = new DictationStopReason("OTHER_CANCEL", 8, "otherCancel");

    private static final /* synthetic */ DictationStopReason[] $values() {
        return new DictationStopReason[]{STOP_BUTTON, SUBMIT_BUTTON, SILENCE_TIMEOUT, HOLD_RELEASE, MAX_DURATION, MAX_TRANSCRIPT_LENGTH, APP_BACKGROUNDED, CANCEL_BUTTON, OTHER_CANCEL};
    }

    static {
        DictationStopReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private DictationStopReason(String str, int i, String str2) {
        this.metricValue = str2;
    }

    @NotNull
    public static EnumEntries<DictationStopReason> getEntries() {
        return $ENTRIES;
    }

    public static DictationStopReason valueOf(String str) {
        return (DictationStopReason) Enum.valueOf(DictationStopReason.class, str);
    }

    public static DictationStopReason[] values() {
        return (DictationStopReason[]) $VALUES.clone();
    }

    @NotNull
    public final String getMetricValue() {
        return this.metricValue;
    }
}
