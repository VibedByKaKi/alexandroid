package com.amazon.rtvi.mobile.transport;

import com.amazon.devicesetupservice.reporting.NetworkState;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/rtvi/mobile/transport/TransportState;", "", "<init>", "(Ljava/lang/String;I)V", "DISCONNECTED", NetworkState.CONNECTING, "CONNECTED", "ERROR", "Orchestrator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TransportState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransportState[] $VALUES;
    public static final TransportState DISCONNECTED = new TransportState("DISCONNECTED", 0);
    public static final TransportState CONNECTING = new TransportState(NetworkState.CONNECTING, 1);
    public static final TransportState CONNECTED = new TransportState("CONNECTED", 2);
    public static final TransportState ERROR = new TransportState("ERROR", 3);

    private static final /* synthetic */ TransportState[] $values() {
        return new TransportState[]{DISCONNECTED, CONNECTING, CONNECTED, ERROR};
    }

    static {
        TransportState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private TransportState(String str, int i) {
    }

    @NotNull
    public static EnumEntries<TransportState> getEntries() {
        return $ENTRIES;
    }

    public static TransportState valueOf(String str) {
        return (TransportState) Enum.valueOf(TransportState.class, str);
    }

    public static TransportState[] values() {
        return (TransportState[]) $VALUES.clone();
    }
}
