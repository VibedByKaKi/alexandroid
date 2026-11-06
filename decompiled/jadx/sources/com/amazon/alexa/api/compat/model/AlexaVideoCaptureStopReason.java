package com.amazon.alexa.api.compat.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaVideoCaptureStopReason;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "LOCAL_STOP", "CLOUD_STOP", "PRIVACY_MODE_ON", "OVERHEAT_PROTECTION", "DEVICE_POWER_LOW", "CAMERA_FAILURE", "DEVICE_STORAGE_FULL", "CAMERA_BLOCKED", "SHUTTER_CLOSED", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AlexaVideoCaptureStopReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AlexaVideoCaptureStopReason[] $VALUES;
    public static final AlexaVideoCaptureStopReason UNKNOWN = new AlexaVideoCaptureStopReason("UNKNOWN", 0);
    public static final AlexaVideoCaptureStopReason LOCAL_STOP = new AlexaVideoCaptureStopReason("LOCAL_STOP", 1);
    public static final AlexaVideoCaptureStopReason CLOUD_STOP = new AlexaVideoCaptureStopReason("CLOUD_STOP", 2);
    public static final AlexaVideoCaptureStopReason PRIVACY_MODE_ON = new AlexaVideoCaptureStopReason("PRIVACY_MODE_ON", 3);
    public static final AlexaVideoCaptureStopReason OVERHEAT_PROTECTION = new AlexaVideoCaptureStopReason("OVERHEAT_PROTECTION", 4);
    public static final AlexaVideoCaptureStopReason DEVICE_POWER_LOW = new AlexaVideoCaptureStopReason("DEVICE_POWER_LOW", 5);
    public static final AlexaVideoCaptureStopReason CAMERA_FAILURE = new AlexaVideoCaptureStopReason("CAMERA_FAILURE", 6);
    public static final AlexaVideoCaptureStopReason DEVICE_STORAGE_FULL = new AlexaVideoCaptureStopReason("DEVICE_STORAGE_FULL", 7);
    public static final AlexaVideoCaptureStopReason CAMERA_BLOCKED = new AlexaVideoCaptureStopReason("CAMERA_BLOCKED", 8);
    public static final AlexaVideoCaptureStopReason SHUTTER_CLOSED = new AlexaVideoCaptureStopReason("SHUTTER_CLOSED", 9);

    private static final /* synthetic */ AlexaVideoCaptureStopReason[] $values() {
        return new AlexaVideoCaptureStopReason[]{UNKNOWN, LOCAL_STOP, CLOUD_STOP, PRIVACY_MODE_ON, OVERHEAT_PROTECTION, DEVICE_POWER_LOW, CAMERA_FAILURE, DEVICE_STORAGE_FULL, CAMERA_BLOCKED, SHUTTER_CLOSED};
    }

    static {
        AlexaVideoCaptureStopReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private AlexaVideoCaptureStopReason(String str, int i) {
    }

    @NotNull
    public static EnumEntries<AlexaVideoCaptureStopReason> getEntries() {
        return $ENTRIES;
    }

    public static AlexaVideoCaptureStopReason valueOf(String str) {
        return (AlexaVideoCaptureStopReason) Enum.valueOf(AlexaVideoCaptureStopReason.class, str);
    }

    public static AlexaVideoCaptureStopReason[] values() {
        return (AlexaVideoCaptureStopReason[]) $VALUES.clone();
    }
}
