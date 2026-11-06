package com.amazon.alexa.assistant.toolkit.networkConnectivityMonitor;

import com.amazon.devicesetupservice.smarthome.ProtocolType;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/networkConnectivityMonitor/NetworkState;", "", "<init>", "(Ljava/lang/String;I)V", "UNAVAILABLE", ProtocolType.WIFI, "CELLULAR", "ETHERNET", "PENDING", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class NetworkState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NetworkState[] $VALUES;
    public static final NetworkState UNAVAILABLE = new NetworkState("UNAVAILABLE", 0);
    public static final NetworkState WIFI = new NetworkState(ProtocolType.WIFI, 1);
    public static final NetworkState CELLULAR = new NetworkState("CELLULAR", 2);
    public static final NetworkState ETHERNET = new NetworkState("ETHERNET", 3);
    public static final NetworkState PENDING = new NetworkState("PENDING", 4);

    private static final /* synthetic */ NetworkState[] $values() {
        return new NetworkState[]{UNAVAILABLE, WIFI, CELLULAR, ETHERNET, PENDING};
    }

    static {
        NetworkState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private NetworkState(String str, int i) {
    }

    @NotNull
    public static EnumEntries<NetworkState> getEntries() {
        return $ENTRIES;
    }

    public static NetworkState valueOf(String str) {
        return (NetworkState) Enum.valueOf(NetworkState.class, str);
    }

    public static NetworkState[] values() {
        return (NetworkState[]) $VALUES.clone();
    }
}
