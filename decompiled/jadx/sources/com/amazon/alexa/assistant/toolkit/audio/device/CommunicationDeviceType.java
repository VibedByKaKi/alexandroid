package com.amazon.alexa.assistant.toolkit.audio.device;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/audio/device/CommunicationDeviceType;", "", "<init>", "(Ljava/lang/String;I)V", "BLE_HEADSET", "BLUETOOTH_SCO", "WIRED_HEADSET", "USB_HEADSET", "HEARING_AID", "BUILTIN_SPEAKER", "NONE", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CommunicationDeviceType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CommunicationDeviceType[] $VALUES;
    public static final CommunicationDeviceType BLE_HEADSET = new CommunicationDeviceType("BLE_HEADSET", 0);
    public static final CommunicationDeviceType BLUETOOTH_SCO = new CommunicationDeviceType("BLUETOOTH_SCO", 1);
    public static final CommunicationDeviceType WIRED_HEADSET = new CommunicationDeviceType("WIRED_HEADSET", 2);
    public static final CommunicationDeviceType USB_HEADSET = new CommunicationDeviceType("USB_HEADSET", 3);
    public static final CommunicationDeviceType HEARING_AID = new CommunicationDeviceType("HEARING_AID", 4);
    public static final CommunicationDeviceType BUILTIN_SPEAKER = new CommunicationDeviceType("BUILTIN_SPEAKER", 5);
    public static final CommunicationDeviceType NONE = new CommunicationDeviceType("NONE", 6);

    private static final /* synthetic */ CommunicationDeviceType[] $values() {
        return new CommunicationDeviceType[]{BLE_HEADSET, BLUETOOTH_SCO, WIRED_HEADSET, USB_HEADSET, HEARING_AID, BUILTIN_SPEAKER, NONE};
    }

    static {
        CommunicationDeviceType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private CommunicationDeviceType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<CommunicationDeviceType> getEntries() {
        return $ENTRIES;
    }

    public static CommunicationDeviceType valueOf(String str) {
        return (CommunicationDeviceType) Enum.valueOf(CommunicationDeviceType.class, str);
    }

    public static CommunicationDeviceType[] values() {
        return (CommunicationDeviceType[]) $VALUES.clone();
    }
}
