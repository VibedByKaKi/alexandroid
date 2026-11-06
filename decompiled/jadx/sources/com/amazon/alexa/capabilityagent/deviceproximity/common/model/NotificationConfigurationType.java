package com.amazon.alexa.capabilityagent.deviceproximity.common.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/capabilityagent/deviceproximity/common/model/NotificationConfigurationType;", "", "<init>", "(Ljava/lang/String;I)V", "PERIODIC", "BOOTUP", "ON_TAP", "ON_WAKEWORD", "ON_MOVEMENT_DETECTED", "AlexaMobileAndroidCapabilityAgent-DeviceProximity_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class NotificationConfigurationType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NotificationConfigurationType[] $VALUES;
    public static final NotificationConfigurationType PERIODIC = new NotificationConfigurationType("PERIODIC", 0);
    public static final NotificationConfigurationType BOOTUP = new NotificationConfigurationType("BOOTUP", 1);
    public static final NotificationConfigurationType ON_TAP = new NotificationConfigurationType("ON_TAP", 2);
    public static final NotificationConfigurationType ON_WAKEWORD = new NotificationConfigurationType("ON_WAKEWORD", 3);
    public static final NotificationConfigurationType ON_MOVEMENT_DETECTED = new NotificationConfigurationType("ON_MOVEMENT_DETECTED", 4);

    private static final /* synthetic */ NotificationConfigurationType[] $values() {
        return new NotificationConfigurationType[]{PERIODIC, BOOTUP, ON_TAP, ON_WAKEWORD, ON_MOVEMENT_DETECTED};
    }

    static {
        NotificationConfigurationType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private NotificationConfigurationType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<NotificationConfigurationType> getEntries() {
        return $ENTRIES;
    }

    public static NotificationConfigurationType valueOf(String str) {
        return (NotificationConfigurationType) Enum.valueOf(NotificationConfigurationType.class, str);
    }

    public static NotificationConfigurationType[] values() {
        return (NotificationConfigurationType[]) $VALUES.clone();
    }
}
