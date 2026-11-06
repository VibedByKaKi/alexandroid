package com.amazon.comms.calling.data.network;

import com.amazon.alexa.tarazed.routing.RouteProviderAlexaMobile;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/comms/calling/data/network/PublishEventBusType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "START_NATIVE_CALL", "HVA_DROP_IN_START", "HVA_DROP_IN_END", "HVA_ALEXA_CALL_START", "HVA_ALEXA_CALL_ACCEPTED", "HVA_ALEXA_CALL_END", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class PublishEventBusType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PublishEventBusType[] $VALUES;

    @NotNull
    private final String value;
    public static final PublishEventBusType START_NATIVE_CALL = new PublishEventBusType("START_NATIVE_CALL", 0, "comms::native-call::start");
    public static final PublishEventBusType HVA_DROP_IN_START = new PublishEventBusType("HVA_DROP_IN_START", 1, RouteProviderAlexaMobile.EVENT_BUS_COMMS_DROP_IN_START);
    public static final PublishEventBusType HVA_DROP_IN_END = new PublishEventBusType("HVA_DROP_IN_END", 2, RouteProviderAlexaMobile.EVENT_BUS_COMMS_DROP_IN_END);
    public static final PublishEventBusType HVA_ALEXA_CALL_START = new PublishEventBusType("HVA_ALEXA_CALL_START", 3, "comms::calling::a2a_start");
    public static final PublishEventBusType HVA_ALEXA_CALL_ACCEPTED = new PublishEventBusType("HVA_ALEXA_CALL_ACCEPTED", 4, RouteProviderAlexaMobile.HVA_ALEXA_CALL_ACCEPTED);
    public static final PublishEventBusType HVA_ALEXA_CALL_END = new PublishEventBusType("HVA_ALEXA_CALL_END", 5, "comms::calling::a2a_end");

    private static final /* synthetic */ PublishEventBusType[] $values() {
        return new PublishEventBusType[]{START_NATIVE_CALL, HVA_DROP_IN_START, HVA_DROP_IN_END, HVA_ALEXA_CALL_START, HVA_ALEXA_CALL_ACCEPTED, HVA_ALEXA_CALL_END};
    }

    static {
        PublishEventBusType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private PublishEventBusType(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<PublishEventBusType> getEntries() {
        return $ENTRIES;
    }

    public static PublishEventBusType valueOf(String str) {
        return (PublishEventBusType) Enum.valueOf(PublishEventBusType.class, str);
    }

    public static PublishEventBusType[] values() {
        return (PublishEventBusType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
