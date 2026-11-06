package com.amazon.alexa.capabilityagent.deviceproximity.common.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/capabilityagent/deviceproximity/common/model/BroadcastingDeviceFamilyType;", "", "<init>", "(Ljava/lang/String;I)V", "ECHO", "FIRETV", "ANSEL", "AlexaMobileAndroidCapabilityAgent-DeviceProximity_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BroadcastingDeviceFamilyType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BroadcastingDeviceFamilyType[] $VALUES;
    public static final BroadcastingDeviceFamilyType ECHO = new BroadcastingDeviceFamilyType("ECHO", 0);
    public static final BroadcastingDeviceFamilyType FIRETV = new BroadcastingDeviceFamilyType("FIRETV", 1);
    public static final BroadcastingDeviceFamilyType ANSEL = new BroadcastingDeviceFamilyType("ANSEL", 2);

    private static final /* synthetic */ BroadcastingDeviceFamilyType[] $values() {
        return new BroadcastingDeviceFamilyType[]{ECHO, FIRETV, ANSEL};
    }

    static {
        BroadcastingDeviceFamilyType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private BroadcastingDeviceFamilyType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<BroadcastingDeviceFamilyType> getEntries() {
        return $ENTRIES;
    }

    public static BroadcastingDeviceFamilyType valueOf(String str) {
        return (BroadcastingDeviceFamilyType) Enum.valueOf(BroadcastingDeviceFamilyType.class, str);
    }

    public static BroadcastingDeviceFamilyType[] values() {
        return (BroadcastingDeviceFamilyType[]) $VALUES.clone();
    }
}
