package com.amazon.comms.calling.infrastructure.telecom;

import com.amazon.devicesetup.common.v1.WifiConnectionState;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/comms/calling/infrastructure/telecom/TelephonyState;", "", "<init>", "(Ljava/lang/String;I)V", WifiConnectionState.IDLE, "ACTIVE", "RINGING", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class TelephonyState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TelephonyState[] $VALUES;
    public static final TelephonyState IDLE = new TelephonyState(WifiConnectionState.IDLE, 0);
    public static final TelephonyState ACTIVE = new TelephonyState("ACTIVE", 1);
    public static final TelephonyState RINGING = new TelephonyState("RINGING", 2);

    private static final /* synthetic */ TelephonyState[] $values() {
        return new TelephonyState[]{IDLE, ACTIVE, RINGING};
    }

    static {
        TelephonyState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private TelephonyState(String str, int i) {
    }

    @NotNull
    public static EnumEntries<TelephonyState> getEntries() {
        return $ENTRIES;
    }

    public static TelephonyState valueOf(String str) {
        return (TelephonyState) Enum.valueOf(TelephonyState.class, str);
    }

    public static TelephonyState[] values() {
        return (TelephonyState[]) $VALUES.clone();
    }
}
