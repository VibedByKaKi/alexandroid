package com.amazon.comms.calling.domain.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/amazon/comms/calling/domain/model/DisconnectReason;", "", "disconnectCause", "", "<init>", "(Ljava/lang/String;II)V", "getDisconnectCause", "()I", "LOCAL_HANGUP", "REMOTE_HANGUP", "REJECTED_INCOMING", "OTHER", "ERROR", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class DisconnectReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DisconnectReason[] $VALUES;
    private final int disconnectCause;
    public static final DisconnectReason LOCAL_HANGUP = new DisconnectReason("LOCAL_HANGUP", 0, 2);
    public static final DisconnectReason REMOTE_HANGUP = new DisconnectReason("REMOTE_HANGUP", 1, 3);
    public static final DisconnectReason REJECTED_INCOMING = new DisconnectReason("REJECTED_INCOMING", 2, 6);
    public static final DisconnectReason OTHER = new DisconnectReason("OTHER", 3, 9);
    public static final DisconnectReason ERROR = new DisconnectReason("ERROR", 4, 1);

    private static final /* synthetic */ DisconnectReason[] $values() {
        return new DisconnectReason[]{LOCAL_HANGUP, REMOTE_HANGUP, REJECTED_INCOMING, OTHER, ERROR};
    }

    static {
        DisconnectReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private DisconnectReason(String str, int i, int i2) {
        this.disconnectCause = i2;
    }

    @NotNull
    public static EnumEntries<DisconnectReason> getEntries() {
        return $ENTRIES;
    }

    public static DisconnectReason valueOf(String str) {
        return (DisconnectReason) Enum.valueOf(DisconnectReason.class, str);
    }

    public static DisconnectReason[] values() {
        return (DisconnectReason[]) $VALUES.clone();
    }

    public final int getDisconnectCause() {
        return this.disconnectCause;
    }
}
