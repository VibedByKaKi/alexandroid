package com.amazon.comms.calling.foundation.metrics.api;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/amazon/comms/calling/foundation/metrics/api/InteractionMetricType;", "", "<init>", "(Ljava/lang/String;I)V", "CLICK", "LONG_PRESS", "SLIDER", "VIEW", "PAGE_VIEW", "DEEP_LINK_CLICK", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class InteractionMetricType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InteractionMetricType[] $VALUES;
    public static final InteractionMetricType CLICK = new InteractionMetricType("CLICK", 0);
    public static final InteractionMetricType LONG_PRESS = new InteractionMetricType("LONG_PRESS", 1);
    public static final InteractionMetricType SLIDER = new InteractionMetricType("SLIDER", 2);
    public static final InteractionMetricType VIEW = new InteractionMetricType("VIEW", 3);
    public static final InteractionMetricType PAGE_VIEW = new InteractionMetricType("PAGE_VIEW", 4);
    public static final InteractionMetricType DEEP_LINK_CLICK = new InteractionMetricType("DEEP_LINK_CLICK", 5);

    private static final /* synthetic */ InteractionMetricType[] $values() {
        return new InteractionMetricType[]{CLICK, LONG_PRESS, SLIDER, VIEW, PAGE_VIEW, DEEP_LINK_CLICK};
    }

    static {
        InteractionMetricType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private InteractionMetricType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<InteractionMetricType> getEntries() {
        return $ENTRIES;
    }

    public static InteractionMetricType valueOf(String str) {
        return (InteractionMetricType) Enum.valueOf(InteractionMetricType.class, str);
    }

    public static InteractionMetricType[] values() {
        return (InteractionMetricType[]) $VALUES.clone();
    }
}
