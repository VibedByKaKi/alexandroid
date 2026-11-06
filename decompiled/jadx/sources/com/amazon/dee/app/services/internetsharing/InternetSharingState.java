package com.amazon.dee.app.services.internetsharing;

import com.amazon.devicesetup.common.v1.WifiConnectionState;
import com.amazon.devicesetupservice.reporting.NetworkState;
import io.ktor.client.utils.CacheControl;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/dee/app/services/internetsharing/InternetSharingState;", "", "<init>", "(Ljava/lang/String;I)V", WifiConnectionState.IDLE, "ATTACHING", "DISCOVERING", NetworkState.CONNECTING, "CONNECTED", "SHARING", "DISCONNECTED", "ERROR", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InternetSharingState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InternetSharingState[] $VALUES;
    public static final InternetSharingState IDLE = new InternetSharingState(WifiConnectionState.IDLE, 0);
    public static final InternetSharingState ATTACHING = new InternetSharingState("ATTACHING", 1);
    public static final InternetSharingState DISCOVERING = new InternetSharingState("DISCOVERING", 2);
    public static final InternetSharingState CONNECTING = new InternetSharingState(NetworkState.CONNECTING, 3);
    public static final InternetSharingState CONNECTED = new InternetSharingState("CONNECTED", 4);
    public static final InternetSharingState SHARING = new InternetSharingState("SHARING", 5);
    public static final InternetSharingState DISCONNECTED = new InternetSharingState("DISCONNECTED", 6);
    public static final InternetSharingState ERROR = new InternetSharingState("ERROR", 7);

    private static final /* synthetic */ InternetSharingState[] $values() {
        return new InternetSharingState[]{IDLE, ATTACHING, DISCOVERING, CONNECTING, CONNECTED, SHARING, DISCONNECTED, ERROR};
    }

    static {
        InternetSharingState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private InternetSharingState(String str, int i) {
    }

    @NotNull
    public static EnumEntries<InternetSharingState> getEntries() {
        return $ENTRIES;
    }

    public static InternetSharingState valueOf(String str) {
        return (InternetSharingState) Enum.valueOf(InternetSharingState.class, str);
    }

    public static InternetSharingState[] values() {
        return (InternetSharingState[]) $VALUES.clone();
    }
}
