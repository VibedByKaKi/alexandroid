package com.amazon.alexa.accessory.frames.media.autoimport.models;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/autoimport/models/AutoImportFailureReason;", "", "wireValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getWireValue", "()Ljava/lang/String;", "LOCATION_PERMISSION", "LOCATION_SERVICES", "NEARBY_DEVICES", "STORAGE_LOW", "DEVICE_BATTERY_LOW", "PHONE_BATTERY_LOW", "DEVICE_THERMAL", "DEVICE_BUSY", "WIFI_DISABLED", "DISABLED", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AutoImportFailureReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AutoImportFailureReason[] $VALUES;

    @NotNull
    private final String wireValue;
    public static final AutoImportFailureReason LOCATION_PERMISSION = new AutoImportFailureReason("LOCATION_PERMISSION", 0, "LOCATION_PERMISSION");
    public static final AutoImportFailureReason LOCATION_SERVICES = new AutoImportFailureReason("LOCATION_SERVICES", 1, "LOCATION_SERVICES");
    public static final AutoImportFailureReason NEARBY_DEVICES = new AutoImportFailureReason("NEARBY_DEVICES", 2, "NEARBY_DEVICES");
    public static final AutoImportFailureReason STORAGE_LOW = new AutoImportFailureReason("STORAGE_LOW", 3, "STORAGE_LOW");
    public static final AutoImportFailureReason DEVICE_BATTERY_LOW = new AutoImportFailureReason("DEVICE_BATTERY_LOW", 4, "DEVICE_BATTERY_LOW");
    public static final AutoImportFailureReason PHONE_BATTERY_LOW = new AutoImportFailureReason("PHONE_BATTERY_LOW", 5, "PHONE_BATTERY_LOW");
    public static final AutoImportFailureReason DEVICE_THERMAL = new AutoImportFailureReason("DEVICE_THERMAL", 6, "DEVICE_THERMAL");
    public static final AutoImportFailureReason DEVICE_BUSY = new AutoImportFailureReason("DEVICE_BUSY", 7, "DEVICE_BUSY");
    public static final AutoImportFailureReason WIFI_DISABLED = new AutoImportFailureReason("WIFI_DISABLED", 8, "WIFI_DISABLED");
    public static final AutoImportFailureReason DISABLED = new AutoImportFailureReason("DISABLED", 9, "DISABLED");

    private static final /* synthetic */ AutoImportFailureReason[] $values() {
        return new AutoImportFailureReason[]{LOCATION_PERMISSION, LOCATION_SERVICES, NEARBY_DEVICES, STORAGE_LOW, DEVICE_BATTERY_LOW, PHONE_BATTERY_LOW, DEVICE_THERMAL, DEVICE_BUSY, WIFI_DISABLED, DISABLED};
    }

    static {
        AutoImportFailureReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private AutoImportFailureReason(String str, int i, String str2) {
        this.wireValue = str2;
    }

    @NotNull
    public static EnumEntries<AutoImportFailureReason> getEntries() {
        return $ENTRIES;
    }

    public static AutoImportFailureReason valueOf(String str) {
        return (AutoImportFailureReason) Enum.valueOf(AutoImportFailureReason.class, str);
    }

    public static AutoImportFailureReason[] values() {
        return (AutoImportFailureReason[]) $VALUES.clone();
    }

    @NotNull
    public final String getWireValue() {
        return this.wireValue;
    }
}
