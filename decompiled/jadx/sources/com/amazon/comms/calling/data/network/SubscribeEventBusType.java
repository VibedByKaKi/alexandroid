package com.amazon.comms.calling.data.network;

import com.amazon.alexa.identity.api.IdentityEvent;
import com.amazon.alexa.redesign.utils.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/amazon/comms/calling/data/network/SubscribeEventBusType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SERVICES_CAN_START", "USER_DEPROVISIONED", "ACCESSORY_PRIVACY_BUTTON_TOGGLED", "ACCESSORY_CALL_VIP_CONTACT_EVENT", "IDENTITY_CHANGED", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class SubscribeEventBusType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SubscribeEventBusType[] $VALUES;

    @NotNull
    private final String value;
    public static final SubscribeEventBusType SERVICES_CAN_START = new SubscribeEventBusType("SERVICES_CAN_START", 0, Constants.SERVICES_CAN_START);
    public static final SubscribeEventBusType USER_DEPROVISIONED = new SubscribeEventBusType("USER_DEPROVISIONED", 1, "comms::app::user-deprovisioned");
    public static final SubscribeEventBusType ACCESSORY_PRIVACY_BUTTON_TOGGLED = new SubscribeEventBusType("ACCESSORY_PRIVACY_BUTTON_TOGGLED", 2, "accessory::privacy_status");
    public static final SubscribeEventBusType ACCESSORY_CALL_VIP_CONTACT_EVENT = new SubscribeEventBusType("ACCESSORY_CALL_VIP_CONTACT_EVENT", 3, "accessory::call_vip_contact");
    public static final SubscribeEventBusType IDENTITY_CHANGED = new SubscribeEventBusType("IDENTITY_CHANGED", 4, IdentityEvent.IDENTITY_CHANGED);

    private static final /* synthetic */ SubscribeEventBusType[] $values() {
        return new SubscribeEventBusType[]{SERVICES_CAN_START, USER_DEPROVISIONED, ACCESSORY_PRIVACY_BUTTON_TOGGLED, ACCESSORY_CALL_VIP_CONTACT_EVENT, IDENTITY_CHANGED};
    }

    static {
        SubscribeEventBusType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private SubscribeEventBusType(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<SubscribeEventBusType> getEntries() {
        return $ENTRIES;
    }

    public static SubscribeEventBusType valueOf(String str) {
        return (SubscribeEventBusType) Enum.valueOf(SubscribeEventBusType.class, str);
    }

    public static SubscribeEventBusType[] values() {
        return (SubscribeEventBusType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
