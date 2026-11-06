package com.amazon.comms.calling.domain.model.pcc;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/comms/calling/domain/model/pcc/PCCEvents;", "", "<init>", "(Ljava/lang/String;I)V", "CallActivated", "CallTerminated", "InboundRingingStarted", "CallFailed", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class PCCEvents {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PCCEvents[] $VALUES;
    public static final PCCEvents CallActivated = new PCCEvents("CallActivated", 0);
    public static final PCCEvents CallTerminated = new PCCEvents("CallTerminated", 1);
    public static final PCCEvents InboundRingingStarted = new PCCEvents("InboundRingingStarted", 2);
    public static final PCCEvents CallFailed = new PCCEvents("CallFailed", 3);

    private static final /* synthetic */ PCCEvents[] $values() {
        return new PCCEvents[]{CallActivated, CallTerminated, InboundRingingStarted, CallFailed};
    }

    static {
        PCCEvents[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private PCCEvents(String str, int i) {
    }

    @NotNull
    public static EnumEntries<PCCEvents> getEntries() {
        return $ENTRIES;
    }

    public static PCCEvents valueOf(String str) {
        return (PCCEvents) Enum.valueOf(PCCEvents.class, str);
    }

    public static PCCEvents[] values() {
        return (PCCEvents[]) $VALUES.clone();
    }
}
