package com.amazon.comms.calling.infrastructure;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/comms/calling/infrastructure/RingtoneType;", "", "<init>", "(Ljava/lang/String;I)V", "INCOMING", "OUTGOING", "CONNECTED", "DISCONNECTED", "ERROR", "MUTED", "UNMUTED", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class RingtoneType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RingtoneType[] $VALUES;
    public static final RingtoneType INCOMING = new RingtoneType("INCOMING", 0);
    public static final RingtoneType OUTGOING = new RingtoneType("OUTGOING", 1);
    public static final RingtoneType CONNECTED = new RingtoneType("CONNECTED", 2);
    public static final RingtoneType DISCONNECTED = new RingtoneType("DISCONNECTED", 3);
    public static final RingtoneType ERROR = new RingtoneType("ERROR", 4);
    public static final RingtoneType MUTED = new RingtoneType("MUTED", 5);
    public static final RingtoneType UNMUTED = new RingtoneType("UNMUTED", 6);

    private static final /* synthetic */ RingtoneType[] $values() {
        return new RingtoneType[]{INCOMING, OUTGOING, CONNECTED, DISCONNECTED, ERROR, MUTED, UNMUTED};
    }

    static {
        RingtoneType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private RingtoneType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<RingtoneType> getEntries() {
        return $ENTRIES;
    }

    public static RingtoneType valueOf(String str) {
        return (RingtoneType) Enum.valueOf(RingtoneType.class, str);
    }

    public static RingtoneType[] values() {
        return (RingtoneType[]) $VALUES.clone();
    }
}
