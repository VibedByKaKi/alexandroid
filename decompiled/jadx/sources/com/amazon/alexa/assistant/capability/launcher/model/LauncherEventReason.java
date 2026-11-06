package com.amazon.alexa.assistant.capability.launcher.model;

import com.amazon.alexa.enrollment.metrics.MetricsConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/assistant/capability/launcher/model/LauncherEventReason;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "NOT_INSTALLED", "INCOMPAT_VERSION_INSTALLED", "SINGLE_ELIGIBLE_TARGET", "HIGHEST_RANKED_TARGET_SELECTED", "SCREEN_UNLOCK_TIMED_OUT", "NONE_INSTALLED", MetricsConstants.OperationalMetrics.UNKNOWN_ERROR, "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LauncherEventReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LauncherEventReason[] $VALUES;

    @NotNull
    private final String value;
    public static final LauncherEventReason NOT_INSTALLED = new LauncherEventReason("NOT_INSTALLED", 0, "NOT_INSTALLED");
    public static final LauncherEventReason INCOMPAT_VERSION_INSTALLED = new LauncherEventReason("INCOMPAT_VERSION_INSTALLED", 1, "INCOMPAT_VERSION_INSTALLED");
    public static final LauncherEventReason SINGLE_ELIGIBLE_TARGET = new LauncherEventReason("SINGLE_ELIGIBLE_TARGET", 2, "SINGLE_ELIGIBLE_TARGET");
    public static final LauncherEventReason HIGHEST_RANKED_TARGET_SELECTED = new LauncherEventReason("HIGHEST_RANKED_TARGET_SELECTED", 3, "HIGHEST_RANKED_TARGET_SELECTED");
    public static final LauncherEventReason SCREEN_UNLOCK_TIMED_OUT = new LauncherEventReason("SCREEN_UNLOCK_TIMED_OUT", 4, "SCREEN_UNLOCK_TIMED_OUT");
    public static final LauncherEventReason NONE_INSTALLED = new LauncherEventReason("NONE_INSTALLED", 5, "NONE_INSTALLED");
    public static final LauncherEventReason UNKNOWN_ERROR = new LauncherEventReason(MetricsConstants.OperationalMetrics.UNKNOWN_ERROR, 6, MetricsConstants.OperationalMetrics.UNKNOWN_ERROR);

    private static final /* synthetic */ LauncherEventReason[] $values() {
        return new LauncherEventReason[]{NOT_INSTALLED, INCOMPAT_VERSION_INSTALLED, SINGLE_ELIGIBLE_TARGET, HIGHEST_RANKED_TARGET_SELECTED, SCREEN_UNLOCK_TIMED_OUT, NONE_INSTALLED, UNKNOWN_ERROR};
    }

    static {
        LauncherEventReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private LauncherEventReason(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<LauncherEventReason> getEntries() {
        return $ENTRIES;
    }

    public static LauncherEventReason valueOf(String str) {
        return (LauncherEventReason) Enum.valueOf(LauncherEventReason.class, str);
    }

    public static LauncherEventReason[] values() {
        return (LauncherEventReason[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
