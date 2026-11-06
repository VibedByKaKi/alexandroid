package com.amazon.alexa.pmi.implementation.taplatency;

import com.amazon.devicesetup.common.v1.WifiConnectionState;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/pmi/implementation/taplatency/CopyState;", "", "<init>", "(Ljava/lang/String;I)V", WifiConnectionState.IDLE, "IN_FLIGHT", "IN_FLIGHT_OWED", "SCHEDULED", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
final class CopyState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CopyState[] $VALUES;
    public static final CopyState IDLE = new CopyState(WifiConnectionState.IDLE, 0);
    public static final CopyState IN_FLIGHT = new CopyState("IN_FLIGHT", 1);
    public static final CopyState IN_FLIGHT_OWED = new CopyState("IN_FLIGHT_OWED", 2);
    public static final CopyState SCHEDULED = new CopyState("SCHEDULED", 3);

    private static final /* synthetic */ CopyState[] $values() {
        return new CopyState[]{IDLE, IN_FLIGHT, IN_FLIGHT_OWED, SCHEDULED};
    }

    static {
        CopyState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private CopyState(String str, int i) {
    }

    @NotNull
    public static EnumEntries<CopyState> getEntries() {
        return $ENTRIES;
    }

    public static CopyState valueOf(String str) {
        return (CopyState) Enum.valueOf(CopyState.class, str);
    }

    public static CopyState[] values() {
        return (CopyState[]) $VALUES.clone();
    }
}
