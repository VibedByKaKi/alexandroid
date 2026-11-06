package com.amazon.comms.calling.domain.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/amazon/comms/calling/domain/model/CallState;", "", "<init>", "(Ljava/lang/String;I)V", "INACTIVE", "CALLING_INITIATED", "CALLING", "INBOUND_RECEIVED", "INBOUND_RINGING", "OUTBOUND_RINGING", "ACTIVE", "LOCAL_HOLD", "REMOTE_HOLD", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class CallState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CallState[] $VALUES;
    public static final CallState INACTIVE = new CallState("INACTIVE", 0);
    public static final CallState CALLING_INITIATED = new CallState("CALLING_INITIATED", 1);
    public static final CallState CALLING = new CallState("CALLING", 2);
    public static final CallState INBOUND_RECEIVED = new CallState("INBOUND_RECEIVED", 3);
    public static final CallState INBOUND_RINGING = new CallState("INBOUND_RINGING", 4);
    public static final CallState OUTBOUND_RINGING = new CallState("OUTBOUND_RINGING", 5);
    public static final CallState ACTIVE = new CallState("ACTIVE", 6);
    public static final CallState LOCAL_HOLD = new CallState("LOCAL_HOLD", 7);
    public static final CallState REMOTE_HOLD = new CallState("REMOTE_HOLD", 8);

    private static final /* synthetic */ CallState[] $values() {
        return new CallState[]{INACTIVE, CALLING_INITIATED, CALLING, INBOUND_RECEIVED, INBOUND_RINGING, OUTBOUND_RINGING, ACTIVE, LOCAL_HOLD, REMOTE_HOLD};
    }

    static {
        CallState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private CallState(String str, int i) {
    }

    @NotNull
    public static EnumEntries<CallState> getEntries() {
        return $ENTRIES;
    }

    public static CallState valueOf(String str) {
        return (CallState) Enum.valueOf(CallState.class, str);
    }

    public static CallState[] values() {
        return (CallState[]) $VALUES.clone();
    }
}
