package com.amazon.alexa.assistant.capability.launcher;

import com.amazon.alexa.enrollment.metrics.MetricsConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/capability/launcher/TargetNotLaunchedReason;", "", "<init>", "(Ljava/lang/String;I)V", "SCREEN_UNLOCK_TIMED_OUT", MetricsConstants.OperationalMetrics.UNKNOWN_ERROR, "NOT_INSTALLED", "INCOMPAT_VERSION_INSTALLED", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TargetNotLaunchedReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TargetNotLaunchedReason[] $VALUES;
    public static final TargetNotLaunchedReason SCREEN_UNLOCK_TIMED_OUT = new TargetNotLaunchedReason("SCREEN_UNLOCK_TIMED_OUT", 0);
    public static final TargetNotLaunchedReason UNKNOWN_ERROR = new TargetNotLaunchedReason(MetricsConstants.OperationalMetrics.UNKNOWN_ERROR, 1);
    public static final TargetNotLaunchedReason NOT_INSTALLED = new TargetNotLaunchedReason("NOT_INSTALLED", 2);
    public static final TargetNotLaunchedReason INCOMPAT_VERSION_INSTALLED = new TargetNotLaunchedReason("INCOMPAT_VERSION_INSTALLED", 3);

    private static final /* synthetic */ TargetNotLaunchedReason[] $values() {
        return new TargetNotLaunchedReason[]{SCREEN_UNLOCK_TIMED_OUT, UNKNOWN_ERROR, NOT_INSTALLED, INCOMPAT_VERSION_INSTALLED};
    }

    static {
        TargetNotLaunchedReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private TargetNotLaunchedReason(String str, int i) {
    }

    @NotNull
    public static EnumEntries<TargetNotLaunchedReason> getEntries() {
        return $ENTRIES;
    }

    public static TargetNotLaunchedReason valueOf(String str) {
        return (TargetNotLaunchedReason) Enum.valueOf(TargetNotLaunchedReason.class, str);
    }

    public static TargetNotLaunchedReason[] values() {
        return (TargetNotLaunchedReason[]) $VALUES.clone();
    }
}
