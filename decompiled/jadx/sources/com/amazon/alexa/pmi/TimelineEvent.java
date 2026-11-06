package com.amazon.alexa.pmi;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.voice.tta.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0000j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/pmi/TimelineEvent;", "", "<init>", "(Ljava/lang/String;I)V", "TTS", Constants.SuffixMetricWith.TTA, "TTC", "precedes", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "AlexaMobileAndroidPerfMetricsInstrumentationAPI_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class TimelineEvent {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TimelineEvent[] $VALUES;
    public static final TimelineEvent TTS = new TimelineEvent("TTS", 0);
    public static final TimelineEvent TTA = new TimelineEvent(Constants.SuffixMetricWith.TTA, 1);
    public static final TimelineEvent TTC = new TimelineEvent("TTC", 2);

    private static final /* synthetic */ TimelineEvent[] $values() {
        return new TimelineEvent[]{TTS, TTA, TTC};
    }

    static {
        TimelineEvent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private TimelineEvent(String str, int i) {
    }

    @NotNull
    public static EnumEntries<TimelineEvent> getEntries() {
        return $ENTRIES;
    }

    public static TimelineEvent valueOf(String str) {
        return (TimelineEvent) Enum.valueOf(TimelineEvent.class, str);
    }

    public static TimelineEvent[] values() {
        return (TimelineEvent[]) $VALUES.clone();
    }

    public final boolean precedes(@NotNull TimelineEvent other) {
        other.getClass();
        return ordinal() < other.ordinal();
    }
}
