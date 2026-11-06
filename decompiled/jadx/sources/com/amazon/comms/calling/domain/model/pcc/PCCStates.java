package com.amazon.comms.calling.domain.model.pcc;

import com.amazon.devicesetup.common.v1.WifiConnectionState;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/comms/calling/domain/model/pcc/PCCStates;", "", "<init>", "(Ljava/lang/String;I)V", WifiConnectionState.IDLE, "ACTIVE", "INBOUND_RINGING", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class PCCStates {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PCCStates[] $VALUES;
    public static final PCCStates IDLE = new PCCStates(WifiConnectionState.IDLE, 0);
    public static final PCCStates ACTIVE = new PCCStates("ACTIVE", 1);
    public static final PCCStates INBOUND_RINGING = new PCCStates("INBOUND_RINGING", 2);

    private static final /* synthetic */ PCCStates[] $values() {
        return new PCCStates[]{IDLE, ACTIVE, INBOUND_RINGING};
    }

    static {
        PCCStates[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private PCCStates(String str, int i) {
    }

    @NotNull
    public static EnumEntries<PCCStates> getEntries() {
        return $ENTRIES;
    }

    public static PCCStates valueOf(String str) {
        return (PCCStates) Enum.valueOf(PCCStates.class, str);
    }

    public static PCCStates[] values() {
        return (PCCStates[]) $VALUES.clone();
    }
}
