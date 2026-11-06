package com.amazon.alexa.ra.core.features.visualshare;

import com.amazon.alexa.ra.core.metrics.VisualShareStopInitiator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/features/visualshare/ScreenShareStopReason;", "", "<init>", "(Ljava/lang/String;I)V", "USER_TOGGLED_OFF", "CAMERA_TOOK_OVER", VisualShareStopInitiator.LIVE_MODE_EXIT, "STOPPED_EXTERNALLY", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ScreenShareStopReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ScreenShareStopReason[] $VALUES;
    public static final ScreenShareStopReason USER_TOGGLED_OFF = new ScreenShareStopReason("USER_TOGGLED_OFF", 0);
    public static final ScreenShareStopReason CAMERA_TOOK_OVER = new ScreenShareStopReason("CAMERA_TOOK_OVER", 1);
    public static final ScreenShareStopReason LIVE_MODE_EXIT = new ScreenShareStopReason(VisualShareStopInitiator.LIVE_MODE_EXIT, 2);
    public static final ScreenShareStopReason STOPPED_EXTERNALLY = new ScreenShareStopReason("STOPPED_EXTERNALLY", 3);

    private static final /* synthetic */ ScreenShareStopReason[] $values() {
        return new ScreenShareStopReason[]{USER_TOGGLED_OFF, CAMERA_TOOK_OVER, LIVE_MODE_EXIT, STOPPED_EXTERNALLY};
    }

    static {
        ScreenShareStopReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ScreenShareStopReason(String str, int i) {
    }

    @NotNull
    public static EnumEntries<ScreenShareStopReason> getEntries() {
        return $ENTRIES;
    }

    public static ScreenShareStopReason valueOf(String str) {
        return (ScreenShareStopReason) Enum.valueOf(ScreenShareStopReason.class, str);
    }

    public static ScreenShareStopReason[] values() {
        return (ScreenShareStopReason[]) $VALUES.clone();
    }
}
