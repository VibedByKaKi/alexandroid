package com.amazon.alexa.assistant.capability.speechrecognizer.voicechat;

import com.amazon.alexa.accessory.frames.media.MediaService;
import com.amazon.alexa.assistant.model.MetricName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/voicechat/PauseResumeResolution;", "", "metric", "Lcom/amazon/alexa/assistant/model/MetricName;", "<init>", "(Ljava/lang/String;ILcom/amazon/alexa/assistant/model/MetricName;)V", "getMetric", "()Lcom/amazon/alexa/assistant/model/MetricName;", MediaService.DEVICE_RECEIPT_CONFIRMED, "TIMED_OUT", "PENDING_DIALOG_FAILED", "RESOLVED_BY_IDLE", "CANCELLED_BY_STOP", "SUPERSEDED", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PauseResumeResolution {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PauseResumeResolution[] $VALUES;

    @NotNull
    private final MetricName metric;
    public static final PauseResumeResolution CONFIRMED = new PauseResumeResolution(MediaService.DEVICE_RECEIPT_CONFIRMED, 0, MetricName.VOICE_CHAT_PAUSE_RESUME_CONFIRMED_BY_LIVE_PREVIEW);
    public static final PauseResumeResolution TIMED_OUT = new PauseResumeResolution("TIMED_OUT", 1, MetricName.VOICE_CHAT_PAUSE_RESUME_TIMED_OUT);
    public static final PauseResumeResolution PENDING_DIALOG_FAILED = new PauseResumeResolution("PENDING_DIALOG_FAILED", 2, MetricName.VOICE_CHAT_PAUSE_RESUME_NEW_SR_COMPLETED_WITHOUT_LIVE_PREVIEW);
    public static final PauseResumeResolution RESOLVED_BY_IDLE = new PauseResumeResolution("RESOLVED_BY_IDLE", 3, MetricName.VOICE_CHAT_PAUSE_RESUME_RESOLVED_BY_IDLE_TRANSITION);
    public static final PauseResumeResolution CANCELLED_BY_STOP = new PauseResumeResolution("CANCELLED_BY_STOP", 4, MetricName.VOICE_CHAT_PAUSE_RESUME_CANCELLED_BY_STOP);
    public static final PauseResumeResolution SUPERSEDED = new PauseResumeResolution("SUPERSEDED", 5, MetricName.VOICE_CHAT_PAUSE_RESUME_SUPERSEDED);

    private static final /* synthetic */ PauseResumeResolution[] $values() {
        return new PauseResumeResolution[]{CONFIRMED, TIMED_OUT, PENDING_DIALOG_FAILED, RESOLVED_BY_IDLE, CANCELLED_BY_STOP, SUPERSEDED};
    }

    static {
        PauseResumeResolution[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private PauseResumeResolution(String str, int i, MetricName metricName) {
        this.metric = metricName;
    }

    @NotNull
    public static EnumEntries<PauseResumeResolution> getEntries() {
        return $ENTRIES;
    }

    public static PauseResumeResolution valueOf(String str) {
        return (PauseResumeResolution) Enum.valueOf(PauseResumeResolution.class, str);
    }

    public static PauseResumeResolution[] values() {
        return (PauseResumeResolution[]) $VALUES.clone();
    }

    @NotNull
    public final MetricName getMetric() {
        return this.metric;
    }
}
