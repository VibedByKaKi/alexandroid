package com.amazon.alexa.pmi.implementation.taplatency;

import com.amazon.alexa.cantilever.HelpConstants;
import com.facebook.react.modules.appstate.AppStateModule;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/pmi/implementation/taplatency/TtlrCloseReason;", "", "token", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getToken", "()Ljava/lang/String;", "TOUCH_DOWN", "BACK", "FOCUS_LOST", "IME", "BACKGROUND", "CONFIG_CHANGE", "DETACH", "SHUTDOWN", "CAP", "NEXT_TTFR", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class TtlrCloseReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TtlrCloseReason[] $VALUES;

    @NotNull
    private final String token;
    public static final TtlrCloseReason TOUCH_DOWN = new TtlrCloseReason("TOUCH_DOWN", 0, "touch-down");
    public static final TtlrCloseReason BACK = new TtlrCloseReason("BACK", 1, HelpConstants.BACK_ACTION);
    public static final TtlrCloseReason FOCUS_LOST = new TtlrCloseReason("FOCUS_LOST", 2, "focus-lost");
    public static final TtlrCloseReason IME = new TtlrCloseReason("IME", 3, "ime");
    public static final TtlrCloseReason BACKGROUND = new TtlrCloseReason("BACKGROUND", 4, AppStateModule.APP_STATE_BACKGROUND);
    public static final TtlrCloseReason CONFIG_CHANGE = new TtlrCloseReason("CONFIG_CHANGE", 5, "config-change");
    public static final TtlrCloseReason DETACH = new TtlrCloseReason("DETACH", 6, "detach");
    public static final TtlrCloseReason SHUTDOWN = new TtlrCloseReason("SHUTDOWN", 7, "shutdown");
    public static final TtlrCloseReason CAP = new TtlrCloseReason("CAP", 8, "cap");
    public static final TtlrCloseReason NEXT_TTFR = new TtlrCloseReason("NEXT_TTFR", 9, "next-ttfr");

    private static final /* synthetic */ TtlrCloseReason[] $values() {
        return new TtlrCloseReason[]{TOUCH_DOWN, BACK, FOCUS_LOST, IME, BACKGROUND, CONFIG_CHANGE, DETACH, SHUTDOWN, CAP, NEXT_TTFR};
    }

    static {
        TtlrCloseReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private TtlrCloseReason(String str, int i, String str2) {
        this.token = str2;
    }

    @NotNull
    public static EnumEntries<TtlrCloseReason> getEntries() {
        return $ENTRIES;
    }

    public static TtlrCloseReason valueOf(String str) {
        return (TtlrCloseReason) Enum.valueOf(TtlrCloseReason.class, str);
    }

    public static TtlrCloseReason[] values() {
        return (TtlrCloseReason[]) $VALUES.clone();
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }
}
